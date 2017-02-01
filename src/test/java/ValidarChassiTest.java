/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno_Fronza_Junior
 */
public class ValidarChassiTest {
     ValidarChassi util = new ValidarChassi();
    
    
    @Test
    public void validar(){
        assertEquals(2011, util.validar("9BP17164GB000003", 10));
    }
    
    
}
