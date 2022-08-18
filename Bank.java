import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

public class Bank {
    //data
    WebDriver driver;

    //Ctor
    public Bank() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ariel\\Desktop\\chromfolder\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    //func
    public String openSite(String url) {
        this.driver.get(url);
        return this.driver.getCurrentUrl();
    }

    public String openCutomerLginPage() {
        WebElement CutomerLginBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        CutomerLginBtn.click();
        WebElement YourNameLable = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > div > label"));
        return YourNameLable.getText();
    }

    public String chooseNameAndLogin() {
        WebElement chooseNameBtn = this.driver.findElement(By.cssSelector("#userSelect > option:nth-child(3)"));
        chooseNameBtn.click();
        WebElement LoginBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        LoginBtn.click();
        WebElement WelcomeCutomerLablel = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(1) > strong"));
        return WelcomeCutomerLablel.getText();
    }

    public String deposit() {
        WebElement depositBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)"));
        depositBtn.click();
        WebElement amountToDeposit = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        amountToDeposit.sendKeys("250");
        WebElement DepositeBtn = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
        DepositeBtn.click();
        WebElement DepositSuccessful = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span"));
        return DepositSuccessful.getText();

    }

    public String balanceCheck() {
        WebElement BalanceAccount = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)"));
        return BalanceAccount.getText();
    }

    public String deposit1000() {
        WebElement depositBtn1 = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)"));
        depositBtn1.click();
        WebElement amountToDeposit1 = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        amountToDeposit1.sendKeys("1000");
        WebElement DepositeBtn1 = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
        DepositeBtn1.click();
        WebElement DepositSuccessful1 = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span"));
        return DepositSuccessful1.getText();
    }

    public String withdral() {
        WebElement WithdrawlBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)"));
        WithdrawlBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Amount = this.driver.findElement
                (By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
        Amount.sendKeys("250");

        WebElement WithdrawlBtn2 = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        WithdrawlBtn2.click();

        WebElement Transactionsuccessful = driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span"));
        return Transactionsuccessful.getText();


    }

    public String WithdrawAmount() {
        WebElement Amount = this.driver.findElement
                (By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
        Amount.sendKeys("250");
        WebElement WithdrawBtn1 = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
        WithdrawBtn1.click();
        WebElement Transactionsuccessful = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > label"));
        return Transactionsuccessful.getText();
    }

    public String openManagerLginPage() {
        WebElement ManagerLginBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button"));
        ManagerLginBtn.click();
        WebElement AddCustomerLabel = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
        return AddCustomerLabel.getText();
    }

    public String addCustomer() {
        //הופסת לקוח חדש
        WebElement AddCustomerBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
        AddCustomerBtn.click();
        //הכנסת פרמטרים
        WebElement FirstName = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input"));
        FirstName.sendKeys("Ariel");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement LastName = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input"));
        LastName.sendKeys("Shatavili");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement PostCode = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input"));
        PostCode.sendKeys("1001");
        //לחציה על הוספת הלקוח והורדת ההודעה הקןפצת
        WebElement AddCustomerBtn2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
        AddCustomerBtn2.click();
        driver.switchTo().alert().accept();//אינעל אבואבוק ערס
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //כניסה למסך הלקוחות הקיימים בהרשאות מנהל
        WebElement CustomerBtn3 = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
        CustomerBtn3.click();
        //חיפוש לקוח קיים במערכת
        WebElement Searchcustomer = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > form > div > div > input"));
        Searchcustomer.sendKeys("Ariel");

        WebElement CustomerAdded = driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr > td:nth-child(1)"));
        return CustomerAdded.getText();


    }

    public String withdral1500() {
        WebElement WithdrawlBtn4 = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)"));
        WithdrawlBtn4.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Amount = this.driver.findElement
                (By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
        Amount.sendKeys("1500");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement WithdrawlBtn5 = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        WithdrawlBtn5.click();

        WebElement Transactionsuccessful = driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span"));
        return Transactionsuccessful.getText();
    }

    public String[] openAccount(){
        String[] urls=new String[2];
        WebElement openAccountBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(2)"));
        openAccountBtn.click();

        WebElement customerSelectNtn = this.driver.findElement
                (By.cssSelector("#userSelect > option:nth-child(3)"));
        customerSelectNtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement currncyBtn = this.driver.findElement
                (By.cssSelector("#currency > option:nth-child(2)"));
        currncyBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement ProcessBtn = this.driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button"));
        urls[0]=this.driver.getCurrentUrl();
        ProcessBtn.click();
        driver.switchTo().alert().accept();//אינעל אבואבוק ערס
        urls[1]=this.driver.getCurrentUrl();
        return urls;

    }

    public String[] customerManegerAndDelete(){
        String[] urls1=new String[2];
        WebElement CustomerBtn3 = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
        CustomerBtn3.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        urls1[0]=this.driver.getPageSource();
        WebElement DeleteBtn3 = driver.findElement
                (By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > button"));

        DeleteBtn3.click();
        WebElement CustomerBtn4 = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
        //urls1[0]=this.driver.getPageSource();
        CustomerBtn4.click();
        urls1[1]=this.driver.getPageSource();
        return urls1;


    }



}


