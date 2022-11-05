package org.maven;
import org.openqa.selenium.WebElement;
public class Adactin extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		implicitlyWait(10);
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtUsername(), "Rama4545");
		sendkeys(l.getTxtPassword(), "454545");
		click(l.getBtnLogin());
		Register r=new Register();
		selectByIndex(r.getLocation(), 4);
		selectByIndex(r.getHotels(), 2);
		selectByIndex(r.getRoomType(),0);
		selectByIndex(r.getRoomNos(),2);
		sendkeys(r.getCheckinDate(), "24/10/22");
		sendkeys(r.getCheckoutDate(), "25/10/22");
		selectByIndex(r.getAdultCount(), 2);
		selectByIndex(r.getChildCount(),1);
		click(r.getBtnSearch());
		implicitlyWait(5);
		click(r.getBtnradio());
		click(r.getBtnContinue());
		sendkeys(r.getTxtFirstname(), "Sakthi");
		sendkeys(r.getTxtLastname(),"Naresh");
		sendkeys(r.getTxtAddress(),"2,Sun apartment,Annanagar,Chennai-104");
		sendkeys(r.getTxtCC(), "1234567812345678");
		selectByIndex(r.getCcType(), 1);
		selectByIndex(r.getCcExpMonth(), 8);
		selectByIndex(r.getCcExpYear(), 11);
		sendkeys(r.getCvv(), "123");
		click(r.getBtnBookNow());
		WebElement orderno = r.getOrderno();
		System.out.println(orderno.getAttribute("value"));
}
}
