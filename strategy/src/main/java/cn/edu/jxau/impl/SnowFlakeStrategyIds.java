package cn.edu.jxau.impl;

import cn.edu.jxau.IStrategyIds;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
public class SnowFlakeStrategyIds implements IStrategyIds {
    @Override
    public String nextId() {
        return "雪花算法 id";
    }
}
