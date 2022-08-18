import org.junit.Assert;
import org.junit.Test;

public class Banktests {

    @Test//שאלה 1
    public void deposit250(){

        Bank bank1 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl =bank1.openSite(expectedurl);
        Assert.assertEquals(actualurl,expectedurl);
        System.out.println("smoke test---->pass");

        //לחיצה על אזור לקוחות וכניבסה לעמוד בחירת החשבון קיים של לקוח
        String actualCustomerLoginLabel = bank1.openCutomerLginPage();
        String expectedCustomerLoginLabel="Your Name :";
        Assert.assertEquals(actualCustomerLoginLabel,expectedCustomerLoginLabel);
        System.out.println("smoke test---->pass");

        //בחירה של משתמש קיים וכינסה למסך האפשרויות
        String actualwelcomcustomerlablel = bank1.chooseNameAndLogin();
        String expectedlwelcomcustomerlablel="Welcome Harry Potter !!";
        Assert.assertEquals(actualwelcomcustomerlablel,expectedlwelcomcustomerlablel);
        System.out.println("smoke test---->pass");


        //הפקדה של 250 שקלים בהצלחה
        String actualDepositSuccessful= bank1.deposit();
        String expectedDepositSuccessful= "Deposit Successful";
        Assert.assertEquals(actualDepositSuccessful,expectedDepositSuccessful);
        System.out.println("smoke test---->pass");

        //בדיקה שבחשבון יש באמת 250
        String actualBalcance = bank1.balanceCheck();
        String expectBalance = "250";
        //int balanceString =(Integer.parseInt(actualBalcance));
        Assert.assertEquals(actualBalcance,expectBalance);
        System.out.println("smoke test---->pass");


    }

    @Test//שאלה 4
    public void depositandWitdral(){
        Bank bank2 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl1 ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl1 =bank2.openSite(expectedurl1);
        Assert.assertEquals(actualurl1,expectedurl1);
        System.out.println("smoke test---->pass");

        //לחיצה על אזור לקוחות וכניבסה לעמוד בחירת החשבון קיים של לקוח
        String actualCustomerLoginLabel1 = bank2.openCutomerLginPage();
        String expectedCustomerLoginLabel1="Your Name :";
        Assert.assertEquals(actualCustomerLoginLabel1,expectedCustomerLoginLabel1);
        System.out.println("smoke test---->pass");

        //בחירה של משתמש קיים וכינסה למסך האפשרויות
        String actualwelcomcustomerlablel1 = bank2.chooseNameAndLogin();
        String expectedlwelcomcustomerlablel1="Welcome Harry Potter !!";
        Assert.assertEquals(actualwelcomcustomerlablel1,expectedlwelcomcustomerlablel1);
        System.out.println("smoke test---->pass");


        //הפקדה של 1000 שקלים בהצלחה
        String actualDepositSuccessful= bank2.deposit1000();
        String expectedDepositSuccessful= "Deposit Successful";
        Assert.assertEquals(actualDepositSuccessful,expectedDepositSuccessful);
        System.out.println("smoke test---->pass");

        //כניסה למסך העברה
         String AcualWithdrawl =bank2.withdral();
         String ExpectedWithdrawl="Transaction successful";
         Assert.assertEquals(AcualWithdrawl,ExpectedWithdrawl);
         System.out.println("smoke test---->pass");

        String actualbalancechaek2=bank2.balanceCheck();
        String expectedbalancechaek2="750";
        Assert.assertEquals(actualbalancechaek2,expectedbalancechaek2);
        System.out.println("smoke test---->pass");


    }

    @Test//שאלה 3
    public void craetenewcustomerviamaneger(){
        Bank bank3 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl1 ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl1 =bank3.openSite(expectedurl1);
        Assert.assertEquals(actualurl1,expectedurl1);
        System.out.println("smoke test---->pass");

        String actualManagerLoginLabel1 = bank3.openManagerLginPage();
        String expectedManagerLoginLabel1="Add Customer";
        Assert.assertEquals(actualManagerLoginLabel1,expectedManagerLoginLabel1);
        System.out.println("smoke test---->pass");

        String actuelAddCustomer =bank3.addCustomer();
        String expectAddCustomer ="Ariel";
        Assert.assertEquals(actuelAddCustomer,expectAddCustomer);
        System.out.println("smoke test---->pass");


    }

    @Test//שאלה 6
    public  void withdrawl1500(){
        Bank bank4 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl =bank4.openSite(expectedurl);
        Assert.assertEquals(actualurl,expectedurl);
        System.out.println("smoke test---->pass");

        //לחיצה על אזור לקוחות וכניבסה לעמוד בחירת החשבון קיים של לקוח
        String actualCustomerLoginLabel = bank4.openCutomerLginPage();
        String expectedCustomerLoginLabel="Your Name :";
        Assert.assertEquals(actualCustomerLoginLabel,expectedCustomerLoginLabel);
        System.out.println("smoke test---->pass");

        //בחירה של משתמש קיים וכינסה למסך האפשרויות
        String actualwelcomcustomerlablel = bank4.chooseNameAndLogin();
        String expectedlwelcomcustomerlablel="Welcome Harry Potter !!";
        Assert.assertEquals(actualwelcomcustomerlablel,expectedlwelcomcustomerlablel);
        System.out.println("smoke test---->pass");

        String AcualWithdrawl =bank4.withdral1500();
        String ExpectedWithdrawl="Transaction successful";
        Assert.assertEquals(AcualWithdrawl,ExpectedWithdrawl);
        System.out.println("smoke test---->pass");


    }

    @Test//שאלה 5
    public  void correcturl(){
        Bank bank5 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl1 ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl1 =bank5.openSite(expectedurl1);
        Assert.assertEquals(actualurl1,expectedurl1);
        System.out.println("smoke test---->pass");

        String actualManagerLoginLabel1 = bank5.openManagerLginPage();
        String expectedManagerLoginLabel1="Add Customer";
        Assert.assertEquals(actualManagerLoginLabel1,expectedManagerLoginLabel1);
        System.out.println("smoke test---->pass");

        String[] urls = bank5.openAccount();
        Assert.assertEquals(urls[0],urls[1]);
        System.out.println("smoke test---->pass");
        System.out.println(urls[1]);





    }

    @Test//שאלה 2
    public void  deletuser(){
        Bank bank6 = new Bank();
        //בדיקת כניסה לאתר
        String expectedurl1 ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualurl1 =bank6.openSite(expectedurl1);
        Assert.assertEquals(actualurl1,expectedurl1);
        System.out.println("smoke test---->pass");

        String actualManagerLoginLabel1 = bank6.openManagerLginPage();
        String expectedManagerLoginLabel1="Add Customer";
        Assert.assertEquals(actualManagerLoginLabel1,expectedManagerLoginLabel1);
        System.out.println("smoke test---->pass");


        String[] urls1 = bank6.customerManegerAndDelete();
        Assert.assertNotEquals(urls1[0],urls1[1]);
        System.out.println("smoke test---->pass");
        System.out.println(urls1[0]);
        System.out.println("user deleted  http status code==200");
        System.out.println(urls1[1]);




    }

}
