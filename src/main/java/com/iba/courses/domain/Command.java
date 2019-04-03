package com.iba.courses.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Command {
    String message;
    String login;
    String password;
}
