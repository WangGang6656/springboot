package com.wg.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String username;
    private String nickName;
    private String sex;
}