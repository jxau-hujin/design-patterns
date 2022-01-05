package cn.edu.jxau;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public interface IAwardService {

    /**
     * 发奖接口 根据奖品类型调用不同的发奖服务
     * @param type
     * @return
     */
    String award(Integer type);
}
