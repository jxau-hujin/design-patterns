import cn.edu.jxau.AwardFactory;
import cn.edu.jxau.IAwardService;
import cn.edu.jxau.impl.CouponsAwardService;
import cn.edu.jxau.impl.EntityAwardService;
import cn.edu.jxau.impl.VirtualAwardService;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
@Log4j2
public class SimpleFactoryTest {

    private Integer requestType = 0;

    private AwardFactory awardFactory = new AwardFactory();

    @Test
    public void test() {
        IAwardService awardService = null;
        if(requestType == 0) {
            awardService = new CouponsAwardService();
        } else if(requestType == 1) {
            awardService = new EntityAwardService();
        } else if(requestType == 2) {
            awardService = new VirtualAwardService();
        }
        String award = awardService.award(requestType);
        System.out.println(award);
    }

    @Test
    public void simpleFactoryTest() {
        IAwardService awardService = awardFactory.getAwardService(requestType);
        String award = awardService.award(requestType);
        System.out.println(award);
    }

}
