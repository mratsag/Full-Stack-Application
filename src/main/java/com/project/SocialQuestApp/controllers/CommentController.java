package com.project.SocialQuestApp.controllers;


import com.project.SocialQuestApp.entities.Comment;
import com.project.SocialQuestApp.entities.Post;
import com.project.SocialQuestApp.requests.CommentCreateRequest;
import com.project.SocialQuestApp.requests.CommentUpdateRequest;
import com.project.SocialQuestApp.requests.PostCreateRequest;
import com.project.SocialQuestApp.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments(@RequestParam Optional<Long> userId,@RequestParam Optional<Long> postId) {
        return commentService.getAllComments(userId,postId);
    }

    @GetMapping("/{commentId}")
    public Comment getOnePost(@PathVariable Long commentId) {
        return commentService.getOneCommentById(commentId);
    }

    @PostMapping
    public Comment createOneComment(@RequestBody CommentCreateRequest newCommentRequest) {
        return commentService.createOneComment(newCommentRequest);
    }

    @PutMapping("/{commentId}")
    public Comment updateOneComment(@PathVariable Long commentId, @RequestBody CommentUpdateRequest){
        return commentService.updateOneCommentById(commentId, newCommentRequest);
    }


}
