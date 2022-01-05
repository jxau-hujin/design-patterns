package cn.edu.jxau;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public interface ISpiderService {

    /**
     * 爬虫商品价格
     * @param productUrl
     * @return
     */
    String spiderPrice(String productUrl);
}
