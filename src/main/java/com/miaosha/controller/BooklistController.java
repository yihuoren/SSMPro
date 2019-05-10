package com.miaosha.controller;

import com.miaosha.model.Booklist;
import com.miaosha.service.BooklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/book")
public class BooklistController {
    @Autowired
    private BooklistService booklistService;
    @RequestMapping("/getList")
    @ResponseBody
    public List<Booklist> getList(){
        return booklistService.getList();
    }
}
