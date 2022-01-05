package cn.edu.jxau;

import lombok.extern.log4j.Log4j2;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public abstract class AbstractSpiderService implements ISpiderService{


    @Override
    public String spiderPrice(String url) {
        // 1. 根据 url 获取信息
        String content = getUrlContent(url);
        // 2. 抓取页面指定元素
        String price = getProductPrice(content);
        // 3. 构建结果
        String res = buildRes(content, price);
        return res;
    }

    protected String buildRes(String content, String price) {
        return content + price;
    }


    /**
     * 获取商品价格
     * @param content
     * @return
     */
    protected abstract String getProductPrice(String content);

    /**
     * 爬取页面内容
     * @param url
     * @return
     */
    protected abstract String getUrlContent(String url);


}
