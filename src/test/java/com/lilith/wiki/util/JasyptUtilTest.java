package com.lilith.wiki.util;


import com.lilith.wiki.WikiApplicationTests;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:JiaJingnan
 * @Date: 下午8:30 2021/6/15
 */
public class JasyptUtilTest extends WikiApplicationTests {

    @Autowired
    private JasyptUtil jasyptUtil;

    @Test
    public void getEncryptResult() {
        String encryptResult1 = jasyptUtil.getEncryptResult("root");
        String encryptResult2 = jasyptUtil.getEncryptResult("Abc*123456");
        System.out.println(encryptResult1);
        System.out.println(encryptResult2);
    }

    @Test
    public void getDecryptResult() {
    }
}