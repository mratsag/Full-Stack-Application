package com.project.SocialQuestApp.repos;

import com.project.SocialQuestApp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
