package com.project.SocialQuestApp.repos;

import com.project.SocialQuestApp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
