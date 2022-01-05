import cn.edu.jxau.ISpiderService;
import cn.edu.jxau.impl.JdSpiderService;
import cn.edu.jxau.impl.PddSpiderService;
import cn.edu.jxau.impl.TbSpiderService;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

/**
 * @description:
 * @author：gezellighied.h
 * @date: 2022/1/5
 */
@Log4j2
public class TemplateMethodTest {


    @Test
    public void test() {
        ISpiderService jdSpiderService = new JdSpiderService();
        ISpiderService tbSpiderService = new TbSpiderService();
        ISpiderService pddSpiderService = new PddSpiderService();

        log.info("jd: {}", jdSpiderService.spiderPrice("jd url"));
        log.info("tb: {}", tbSpiderService.spiderPrice("tb url"));
        log.info("pdd: {}", pddSpiderService.spiderPrice("pdd url"));
    }
}
