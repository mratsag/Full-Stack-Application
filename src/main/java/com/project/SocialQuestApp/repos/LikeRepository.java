package com.project.SocialQuestApp.repos;

import com.project.SocialQuestApp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {



    List<Like> findByUserIdAndPostId(Long userId, Long postId);

    List<Like> findByUserId(Long userId);

    List<Like> findByPostId(Long postId);
}
