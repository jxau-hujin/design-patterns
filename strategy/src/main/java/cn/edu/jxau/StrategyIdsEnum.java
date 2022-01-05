package cn.edu.jxau;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
@Getter
@AllArgsConstructor
public enum StrategyIdsEnum {

    RandomNum(0, "随机数算法"),
    SnowFlake(1, "雪花算法"),
    Uuid(2, "UUID 算法");

    private Integer type;
    private String desc;
}
