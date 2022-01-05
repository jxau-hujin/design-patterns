package cn.edu.jxau;

import cn.edu.jxau.impl.CouponsAwardService;
import cn.edu.jxau.impl.EntityAwardService;
import cn.edu.jxau.impl.VirtualAwardService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
public class AwardConfig {

    protected static Map<Integer, IAwardService> awardServiceMap = new ConcurrentHashMap<>();

    static {
        awardServiceMap.put(Award.Coupons.getType(), new CouponsAwardService());
        awardServiceMap.put(Award.Entity.getType(), new EntityAwardService());
        awardServiceMap.put(Award.Virtual.getType(), new VirtualAwardService());
    }
}
