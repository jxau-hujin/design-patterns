package cn.edu.jxau.impl;

import cn.edu.jxau.IStrategyIds;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
public class UuidStrategyIds implements IStrategyIds {
    @Override
    public String nextId() {
        return "UUID id";
    }
}
