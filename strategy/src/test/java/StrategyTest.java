import cn.edu.jxau.AlgorithmsConfig;
import cn.edu.jxau.IStrategyIds;
import org.junit.Test;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/6
 */
public class StrategyTest {

    private Integer reqType = 1;

    @Test
    public void test() {

        IStrategyIds strategy = AlgorithmsConfig.strategy(reqType);
        String nextId = strategy.nextId();
        System.out.println(nextId);
    }
}
