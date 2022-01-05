package cn.edu.jxau;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public class AwardFactory extends AwardConfig{

    public IAwardService getAwardService(Integer type) {
        return awardServiceMap.get(type);
    }
}
