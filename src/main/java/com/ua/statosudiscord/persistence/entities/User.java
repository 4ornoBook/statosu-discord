package com.ua.statosudiscord.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;
    private Long channelId;
    private Long userId;
    private String osuUsername;

    public User(Long channelId, Long userId, String osuUsername) {
        this.channelId = channelId;
        this.userId = userId;
        this.osuUsername = osuUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(channelId, user.channelId) && Objects.equals(userId, user.userId) && Objects.equals(osuUsername, user.osuUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, channelId, userId, osuUsername);
    }
}
