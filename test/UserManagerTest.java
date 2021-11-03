
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rajaa
 */
public class UserManagerTest {
    
    UserManager UserManagerInstance;
    User UserInstance;
    
    
    
    public UserManagerTest() {
    }

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        System.out.println("UserManagerTest: Before method setup() ");
        UserManagerInstance = new UserManager();
        
        
    }
    
    @After
    public void tearDown() {

        System.out.println("UserManagerTest: After method tearDown() ");
        UserManagerInstance = null;
        
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void normalRegisterTest(){
        
        String username="Rajaa", password="Rajaa123";
        
        boolean result=UserManagerInstance.registerUser(username, password);
        boolean ExpResult=true;
        
        Assert.assertEquals(ExpResult, result);
    }
    
    @Test
    public void emptyUsernameRegisterTest(){
        
        String username="", password="Rajaa123";
        
        boolean result=UserManagerInstance.registerUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
       
       
        
    }
    
    @Test
    public void emptyPasswordRegisterTest(){
        
        String username="Rajaa", password="";
        
        boolean result=UserManagerInstance.registerUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    
    @Test
    public void emptyRegisterTest(){
        
        String username="", password="";

        boolean result=UserManagerInstance.registerUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    
    @Test
    public void normalLoginTest(){
        
        String username="Rajaa", password="Rajaa123";
        
        UserManagerInstance.registerUser(username, password);
        boolean result=UserManagerInstance.loginUser(username, password);
        boolean ExpResult=true;
        
        Assert.assertEquals(ExpResult, result);
       
        
    }
    
    @Test
    public void emptyUsernamelLoginTest(){
        
        String username="", password="Rajaa123";
        
        UserManagerInstance.registerUser(username, password);
        boolean result=UserManagerInstance.loginUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
       
       
        
    }
    
    @Test
    public void emptyPasswordlLoginTest(){
        
        String username="Rajaa", password="";
        
        UserManagerInstance.registerUser(username, password);
        boolean result=UserManagerInstance.loginUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    
    @Test
    public void emptyLoginTest(){
        
        String username="", password="";
        
        UserManagerInstance.registerUser(username, password);
        boolean result=UserManagerInstance.loginUser(username, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    
    @Test
    public void wrongPasswordTest(){
        
        String username="Rajaa", password="Rajaa123";
        
        UserManagerInstance.registerUser(username, password);
        String wrongPassword="Raja123";
        boolean result=UserManagerInstance.loginUser(username, wrongPassword);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    
    @Test
    public void wrongUsernameTest(){
        
        String username="Rajaa", password="Rajaa123";
        
        UserManagerInstance.registerUser(username, password);
        
        String wrongUsername="Raja";
        boolean result=UserManagerInstance.loginUser(wrongUsername, password);
        boolean ExpResult=false;
        
        Assert.assertEquals(ExpResult, result);
        
    }
    

}
    
    
    
