package com.project.SocialQuestApp.repos;
import com.project.SocialQuestApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
