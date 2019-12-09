package com.example.demo.bysj.basic.sessionAndcookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CookieControl extends HttpServlet {
    @RequestMapping(value = "/showCookie.ctl", method = RequestMethod.GET)
    @ResponseBody
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] allCookies = request.getCookies();
        if(allCookies == null){
            response.getWriter().println("no Cookie available");
        }else {
            for(Cookie cookie:allCookies){
                response.getWriter().println(cookie.getName() + "=" + cookie.getValue());
            }
        }
    }
}
