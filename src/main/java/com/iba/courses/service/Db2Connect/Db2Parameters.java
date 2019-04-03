package com.iba.courses.service.Db2Connect;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Db2Parameters {

    private String hostname;
    private Integer port;
    private String location;
    private String userId;
    private String password;

}
