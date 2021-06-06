package com.lilith.wiki.common;

import lombok.Data;

/**
 * @Author:JiaJingnan
 * @Date: 上午9:02 2021/6/6
 */
@Data
public class WikiRes<T> {

    // 业务成功或失败
    private boolean success;

    // 返回信息
    private String message;

    // 返回数据，自定义类型
    private T data;

}
