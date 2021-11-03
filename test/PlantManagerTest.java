/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jenan
 */
public class PlantManagerTest {
    
    PlantManager plantMgr;

    @Test 
    public void removePlantTest() throws Exception {
        plantMgr = new PlantManager();
        plantMgr.addPlant("Zamia", "Zamiaceae", "One cup per week", "Internal plant", "Sandy, well-drained");
        String expResult = "Plant Successfully Removed.";
        String result = plantMgr.removePlant(0);
        Assert.assertEquals(expResult, result);
    }
    
    @Test 
    public void removePlantTest1() throws Exception {
        plantMgr = new PlantManager();
        String expResult = "No Plant Found.";
        String result = plantMgr.removePlant(10);
        Assert.assertEquals(expResult, result);
    }
    
    @Test 
    public void toStringTest() throws Exception {
        plantMgr = new PlantManager();
        plantMgr.addPlant("Zamia", "Zamiaceae", "One cup per week", "Internal plant", "Sandy, well-drained");
        String expResult = "plants: \n" + "Plant{\n" + " id: 1\n" + " name: Zamia\n" + " family: Zamiaceae\n" +
                           " neededWater: One cup per week\n" + " neededSun: Internal plant\n" +
                           " soilType: Sandy, well-drained\n" + " }}";
        String result = plantMgr.toString();
        Assert.assertEquals(expResult, result);
    }
    
    @Test 
    public void addPlantTest() throws Exception {
        plantMgr = new PlantManager();
        int expResult = 2;
        int result = plantMgr.addPlant("Zamia", "Zamiaceae", "One cup per week", "Internal plant", "Sandy, well-drained");
        Assert.assertEquals(expResult, result);
    }
    
    @Test 
    public void getPlantTest() throws Exception {
        plantMgr = new PlantManager();
        plantMgr.addPlant("Zamia", "Zamiaceae", "One cup per week", "Internal plant", "Sandy, well-drained");
        String expResult = "Plant{\n" + " id: 3\n" + " name: Zamia\n" + " family: Zamiaceae\n" + " neededWater: One cup per week\n" +
                           " neededSun: Internal plant\n" + " soilType: Sandy, well-drained\n" + " }";
        String result = plantMgr.getPlant(3);
        Assert.assertEquals(expResult, result);
    }
    
    @Test 
    public void getPlantTest1() throws Exception {
        plantMgr = new PlantManager();
        String expResult = "No Plant Found";
        String result = plantMgr.getPlant(19);
        Assert.assertEquals(expResult, result);
    }
    
}
