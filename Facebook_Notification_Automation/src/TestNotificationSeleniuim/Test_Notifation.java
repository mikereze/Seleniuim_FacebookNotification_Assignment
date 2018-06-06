package TestNotificationSeleniuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public  class Test_Notifation {

    public static void main(String[] args){
        method1();
    }

    public static void method1(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("http://www.facebook.com");

        WebElement check = ((ChromeDriver) driver).findElementById("email");
        check.sendKeys(email);
        WebElement check2 = ((ChromeDriver) driver).findElementById("pass");
        check2.sendKeys(password);
        check.submit();
        WebElement checknotification = ((ChromeDriver) driver).findElementById("notificationsCountValue");
        System.out.println("The Notification is "+checknotification.getText());


        System.out.print("Page Title"+ driver.getTitle()+"\n");
        System.out.print("Current URL: "+ driver.getCurrentUrl()+"\n");
        System.out.print("Length of Page Source"+ driver.getPageSource().toString().length());

        try{

            Thread.sleep(2000);

        }

        catch(Exception e){

                System.out.println("It doesnt Work Dude");
        }
        driver.close();





    }



}
