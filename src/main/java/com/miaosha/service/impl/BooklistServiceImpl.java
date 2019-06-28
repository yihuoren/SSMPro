package com.miaosha.service.impl;

import com.miaosha.dao.BooklistMapper;
import com.miaosha.service.BooklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HolSha on 2019/1/21 0021.
 */
@Service
public class BooklistServiceImpl implements BooklistService{
    @Autowired
    private BooklistMapper booklistMapper;

    @Override
    public List getList(String title) {
        return booklistMapper.queryBooklists(title);
    }

    public List delList(String title) {
        return booklistMapper.deleteBooklists(title);
    }
}
