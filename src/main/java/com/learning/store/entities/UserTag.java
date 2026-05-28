package com.learning.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTag {

    @Column(nullable = false, name = "user_id")
    private Long user_id;

    @Column(nullable = false, name = "tag_id")
    private Integer tag_id;



}
