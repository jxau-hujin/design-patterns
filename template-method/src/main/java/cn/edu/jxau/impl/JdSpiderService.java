package cn.edu.jxau.impl;

import cn.edu.jxau.AbstractSpiderService;


/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public class JdSpiderService extends AbstractSpiderService {
    @Override
    protected String getProductPrice(String content) {
        return "50￥";
    }

    @Override
    protected String getUrlContent(String url) {
        return "JD: ";
    }
}
