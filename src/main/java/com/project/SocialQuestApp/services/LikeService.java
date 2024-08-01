package com.project.SocialQuestApp.services;

import com.project.SocialQuestApp.entities.Comment;
import com.project.SocialQuestApp.entities.Like;
import com.project.SocialQuestApp.entities.Post;
import com.project.SocialQuestApp.entities.User;
import com.project.SocialQuestApp.repos.LikeRepository;
import com.project.SocialQuestApp.requests.LikeCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {
    private LikeRepository likeRepository;
    private UserService userService;
    private PostService postService;

    public LikeService(LikeRepository likeRepository, UserService userService, PostService postService) {
        this.likeRepository = likeRepository;
        this.userService = userService;
        this.postService = postService;
    }


    public List<Like> getAllLikes(Optional<Long> userId, Optional<Long> postId) {
        if (userId.isPresent() && postId.isPresent()) {
            return likeRepository.findByUserIdAndPostId(userId.get(),postId.get());
        } else if (userId.isPresent()) {
            return likeRepository.findByUserId(userId.get());
        } else if (postId.isPresent()) {
            return likeRepository.findByPostId(postId.get());
        }else
            return likeRepository.findAll();
    }


    public Like getOneLike(Long likesId) {
        return likeRepository.findById(likesId).orElse(null);
    }

    public Like createOneLike(LikeCreateRequest likeCreateRequest) {
        User user = userService.getOneUser(likeCreateRequest.getUserId());
        Post post = postService.getOnePostById(likeCreateRequest.getPostId());
        if (user!= null && post!= null){
            Like likeToSave = new Like();
            likeToSave.setId(likeCreateRequest.getId());
            likeToSave.setPost(post);
            likeToSave.setUser(user);
            return likeRepository.save(likeToSave);
        }
        return null;
    }

    public void deleteOneLikeById(Long likesId) {
        likeRepository.deleteById(likesId);
    }
}
