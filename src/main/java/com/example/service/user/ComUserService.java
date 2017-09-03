package com.example.service.user;

import org.springframework.stereotype.Service;

import com.example.dao.user.ComUserDao;
import com.example.enity.user.ComUser;
import com.example.service.BaseService;

@Service
public class ComUserService extends BaseService <ComUserDao, ComUser> {
    public ComUser select ( ComUser user ) {
        return dao.select ( user );
    }
}
