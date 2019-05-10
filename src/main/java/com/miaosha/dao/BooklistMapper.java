package com.miaosha.dao;

import com.miaosha.model.Booklist;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BooklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Booklist record);

    int insertSelective(Booklist record);

    Booklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Booklist record);

    int updateByPrimaryKey(Booklist record);

    List<Booklist> queryBooklists();
}