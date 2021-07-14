import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPriority{

@Test (priority = 1)
public void B_method( ) {
System.out.println("This is B method") ;
}
@Test(priority = 2)
public void A_method() {
System.out.println("This is A method");
}
@Test
public void D_method() {
System.out.println("This is D Method");
}
@Test
public void C_method( ) {
System.out.println("This is C Method");

}
@BeforeMethod
public void b4_method() {
	System.out.println("This is B4 Method");
}
@AfterMethod
public void aftr_method() {
	System.out.println("This is After Method");
}
}