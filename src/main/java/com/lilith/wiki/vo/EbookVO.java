package com.lilith.wiki.vo;

import lombok.Data;

/**
 * @Author:JiaJingnan
 * @Date: 上午9:12 2021/6/6
 */
@Data
public class EbookVO {

    private Long id;
    private String name;
    private Long category1Id;
    private Long category2Id;
    private String description;
    private String cover;
    private Integer docCount;
    private Integer viewCount;
    private Integer voteCount;
}
