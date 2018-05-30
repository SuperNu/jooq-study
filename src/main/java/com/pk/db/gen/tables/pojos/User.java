/*
 * This file is generated by jOOQ.
*/
package com.pk.db.gen.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 267020560;

    private Long          id;
    private String        name;
    private String        password;
    private Boolean       sex;
    private LocalDateTime created;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.name = value.name;
        this.password = value.password;
        this.sex = value.sex;
        this.created = value.created;
    }

    public User(
        Long          id,
        String        name,
        String        password,
        Boolean       sex,
        LocalDateTime created
    ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.created = created;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSex() {
        return this.sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(password);
        sb.append(", ").append(sex);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}
