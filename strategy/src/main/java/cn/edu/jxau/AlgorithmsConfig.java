package cn.edu.jxau;

import cn.edu.jxau.impl.RandomNumStrategyIds;
import cn.edu.jxau.impl.SnowFlakeStrategyIds;
import cn.edu.jxau.impl.UuidStrategyIds;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
public class AlgorithmsConfig {

    private static Map<Integer, IStrategyIds> strategyIdsMap = new ConcurrentHashMap<>();

    static {
        strategyIdsMap.put(StrategyIdsEnum.RandomNum.getType(), new RandomNumStrategyIds());
        strategyIdsMap.put(StrategyIdsEnum.SnowFlake.getType(), new SnowFlakeStrategyIds());
        strategyIdsMap.put(StrategyIdsEnum.Uuid.getType(), new UuidStrategyIds());
    }

    public static IStrategyIds strategy(Integer type) {
        return strategyIdsMap.get(type);
    }
}
