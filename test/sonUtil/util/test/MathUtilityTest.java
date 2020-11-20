/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonUtil.util.test;
import java.sql.SQLException;
import org.junit.Test;
//chi cho jdk 5 tro len
//
import static org.junit.Assert.*;
import static sonUtil.MathUtility.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    @Test
    public void getFactorial_RansWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }
@Test(expected = SQLException.class)
    public void getFactorial_ThrowException_IfInvalidArgument(){
        //Ngoai le khon phai la value de assert
        //chi co the chup no lai
        getFactorial(-5);
    }

}
