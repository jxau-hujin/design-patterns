package cn.edu.jxau.impl;

import cn.edu.jxau.IStrategyIds;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
public class RandomNumStrategyIds implements IStrategyIds {

    @Override
    public String nextId() {
        return "随机数 id";
    }
}
