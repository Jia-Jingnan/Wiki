package com.lilith.wiki.service;

import com.lilith.wiki.bo.EbookBO;
import com.lilith.wiki.entity.Ebook;
import com.lilith.wiki.vo.EbookVO;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午12:52 2021/6/6
 */
public interface EbookService {

    List<EbookVO> list(EbookBO ebookBO);
}
