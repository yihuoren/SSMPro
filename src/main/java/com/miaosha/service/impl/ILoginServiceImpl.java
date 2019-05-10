package com.miaosha.service.impl;

import com.miaosha.dao.UserinfoMapper;
import com.miaosha.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HolSha on 2019/1/18 0018.
 */
@Service
public class ILoginServiceImpl implements ILoginService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public void hello(String word) {
        userinfoMapper.deleteByPrimaryKey(1);
    }
}
