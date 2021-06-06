package com.lilith.wiki.service.impl;

import com.lilith.wiki.entity.Ebook;
import com.lilith.wiki.mapper.EbookMapper;
import com.lilith.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:53 2021/6/6
 */
@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
