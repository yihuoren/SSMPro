package com.miaosha.service;

import com.miaosha.model.Booklist;

import java.util.List;

/**
 * Created by HolSha on 2019/1/21 0021.
 */
public interface BooklistService {

    public List<Booklist> getList(String title);
    public List<Booklist> delList(String title);
}
