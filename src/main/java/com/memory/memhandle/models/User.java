package com.memory.memhandle.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class User {
    private String userId;

    private String name;

    private int age;
}
