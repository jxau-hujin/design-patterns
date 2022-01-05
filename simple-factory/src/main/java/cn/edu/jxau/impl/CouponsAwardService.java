package cn.edu.jxau.impl;

import cn.edu.jxau.Award;
import cn.edu.jxau.IAwardService;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public class CouponsAwardService implements IAwardService {


    @Override
    public String award(Integer type) {
        return Award.getDesc(type);
    }
}
