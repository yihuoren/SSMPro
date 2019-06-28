package com.miaosha.controller;

import com.miaosha.model.Booklist;
import com.miaosha.service.BooklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BooklistController {
    @Autowired
    private BooklistService booklistService;
    @RequestMapping("/getList")
    @ResponseBody
    public List<Booklist> getList(HttpServletRequest request){
        String title = request.getParameter("title");
        return booklistService.getList(title);
    }

    @RequestMapping("/delList")
    @ResponseBody
    public List<Booklist> delList(HttpServletRequest request){
        String title = request.getParameter("title");
        return booklistService.delList(title);
    }
}
