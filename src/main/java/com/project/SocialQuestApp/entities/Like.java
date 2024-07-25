package com.project.SocialQuestApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "comment")
@Data
public class Like {

    @Id
    long id;
    long postId;
    long userId;

}
