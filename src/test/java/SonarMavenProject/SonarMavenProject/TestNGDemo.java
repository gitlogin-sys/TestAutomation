package SonarMavenProject.SonarMavenProject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
@Test
public void test01() throws InterruptedException, IOException{
	//DemoJava d= new DemoJava();
	//d.print();
	LoginForm f= new LoginForm();
	f.main(null);	
}
/*@Test
public void test02() throws InterruptedException, IOException{
	DemoJava d= new DemoJava();
	d.print();
	
}*/

}
