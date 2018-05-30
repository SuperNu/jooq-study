/*
 * This file is generated by jOOQ.
*/
package com.pk.db.gen.tables.daos;


import com.pk.db.gen.tables.User;
import com.pk.db.gen.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class UserDao extends DAOImpl<UserRecord, com.pk.db.gen.tables.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.pk.db.gen.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    public UserDao(Configuration configuration) {
        super(User.USER, com.pk.db.gen.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.pk.db.gen.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.pk.db.gen.tables.pojos.User> fetchById(Long... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.pk.db.gen.tables.pojos.User fetchOneById(Long value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.pk.db.gen.tables.pojos.User> fetchByName(String... values) {
        return fetch(User.USER.NAME, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.pk.db.gen.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<com.pk.db.gen.tables.pojos.User> fetchBySex(Boolean... values) {
        return fetch(User.USER.SEX, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<com.pk.db.gen.tables.pojos.User> fetchByCreated(LocalDateTime... values) {
        return fetch(User.USER.CREATED, values);
    }
}