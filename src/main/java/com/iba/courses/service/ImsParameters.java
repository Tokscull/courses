package com.iba.courses.service;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ImsParameters {

    private String hostname;
    private String datastore;
    private String exitIdentifier;
    private Integer port;
    private String userId;
    private String password;
}
