package com.project.SocialQuestApp.controllers;

import com.project.SocialQuestApp.entities.Like;
import com.project.SocialQuestApp.requests.LikeCreateRequest;
import com.project.SocialQuestApp.services.LikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/likes")
public class LikeController {
    private LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<Like> getAllLikes(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId){
        return likeService.getAllLikes(userId,postId);
    }

    @GetMapping("/likesId")
    public Like getOneLike(@PathVariable Long likesId){
        return likeService.getOneLike(likesId);
    }

    @PostMapping
    public Like createOneLike(@RequestBody LikeCreateRequest likeCreateRequest){
        return likeService.createOneLike(likeCreateRequest);
    }

    @DeleteMapping("/{likesId}")
    public void deleteOneLike(@PathVariable Long likesId) {
        likeService.deleteOneLikeById(likesId);
    }
}
