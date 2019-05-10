package com.miaosha.service.impl;

import com.miaosha.dao.BooklistMapper;
import com.miaosha.model.Booklist;
import com.miaosha.service.BooklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by HolSha on 2019/1/21 0021.
 */
@Service
public class BooklistServiceImpl implements BooklistService{
    @Autowired
    private BooklistMapper booklistMapper;

    @Override
    public List getList() {
        return booklistMapper.queryBooklists();
    }
}
