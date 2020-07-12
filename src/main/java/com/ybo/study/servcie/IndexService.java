package com.ybo.study.servcie;

import com.ybo.study.dao.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    @Autowired
    private IndexMapper indexMapper;

    public int selectDb() {
        return indexMapper.selectDb();
    }
}
