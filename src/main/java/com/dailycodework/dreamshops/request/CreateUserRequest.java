package com.dailycodework.dreamshops.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
