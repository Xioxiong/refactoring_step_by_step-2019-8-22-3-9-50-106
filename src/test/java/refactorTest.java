import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class refactorTest {

    @Test
    void refactor(){
        Police police = new Police();
        boolean result = police.checkDriver(new Driver(15));

        assertEquals(true,result);
    }
}
