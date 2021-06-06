package com.lilith.wiki.service.impl;

import com.lilith.wiki.bo.EbookBO;
import com.lilith.wiki.entity.Ebook;
import com.lilith.wiki.entity.EbookExample;
import com.lilith.wiki.mapper.EbookMapper;
import com.lilith.wiki.service.EbookService;
import com.lilith.wiki.vo.EbookVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<EbookVO> list(EbookBO ebookBO) {
        EbookExample ebookExample = new EbookExample();
        // where条件
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        // 业务对象EbookBO，构造where查询条件
        criteria.andNameLike("%" + ebookBO.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 前端展示对象EbookVO
        List<EbookVO> ebookVOList = new ArrayList<>();

        for (Ebook ebook : ebookList) {
            EbookVO ebookVO = new EbookVO();
            BeanUtils.copyProperties(ebook,ebookVO);
            ebookVOList.add(ebookVO);
        }
        return ebookVOList;
    }
}
