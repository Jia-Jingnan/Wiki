package com.lilith.wiki.controller;

import com.lilith.wiki.common.WikiRes;
import com.lilith.wiki.entity.Ebook;
import com.lilith.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:JiaJingnan
 * @Date: 上午8:53 2021/6/6
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public WikiRes list(){
        WikiRes wikiRes = new WikiRes();
        List<Ebook> ebookList = ebookService.list();
        wikiRes.setSuccess(true);
        wikiRes.setMessage("成功");
        wikiRes.setData(ebookList);
        return wikiRes;
    }
}
