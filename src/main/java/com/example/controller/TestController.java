package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enity.user.ComUser;
import com.example.service.user.ComUserService;

/**
 * Created by MXL on 2017/8/28 0028.
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @Autowired
    private ComUserService comUserService;

    @RequestMapping(value = "testPage")
    public static String testPage () {
        return "First One";
    }

    @RequestMapping(value = "findByMobile")
    public String findByMobile ( HttpServletRequest request, HttpServletResponse response ) {
        String mobile = request.getParameter ( "mobile" );
        ComUser user = new ComUser ();
        user.setMobile ( mobile );
        user = comUserService.select ( user );
        return user.getMobile()+","+user.getOidUserId();
    }
}
