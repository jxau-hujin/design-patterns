package cn.edu.jxau;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
@AllArgsConstructor
@NoArgsConstructor
public enum Award {

    Coupons(0, "优惠券"),
    Entity(1, "实体奖品"),
    Virtual(2, "虚拟奖品");

    private Integer type;

    private String desc;

    public static String getDesc(Integer type) {
        Award[] values = values();
        for(Award value : values) {
            if(value.type.equals(type)) {
                return value.desc;
            }
        }
        return "UNKNOWN";
    }

    public Integer getType() {
        return this.type;
    }
}
