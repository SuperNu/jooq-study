/*
 * This file is generated by jOOQ.
*/
package com.pk.db.gen;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


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
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -221015566;

    private Long          id;
    private String        name;
    private String        password;
    private Byte          sex;
    private LocalDateTime created;

    public UserInfo() {}

    public UserInfo(UserInfo value) {
        this.id = value.id;
        this.name = value.name;
        this.password = value.password;
        this.sex = value.sex;
        this.created = value.created;
    }

    public UserInfo(
        Long          id,
        String        name,
        String        password,
        Byte          sex,
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

    public Byte getSex() {
        return this.sex;
    }

    public void setSex(Byte sex) {
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
