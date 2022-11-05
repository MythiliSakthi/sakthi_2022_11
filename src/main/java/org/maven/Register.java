package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BaseClass
{
	public Register() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotels;
		@FindBy(id="room_type")
		private WebElement roomType;
		@FindBy(id="room_nos")
		private WebElement roomNos;
		@FindBy(id="datepick_in")		
		private WebElement CheckinDate;
		@FindBy(id="datepick_out")
		private WebElement CheckoutDate;
		@FindBy(id="adult_room")
		private WebElement AdultCount;
		@FindBy(id="child_room")
		private WebElement ChildCount;
		
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getRoomNos() {
			return roomNos;
		}
		public WebElement getDate() {
			return CheckinDate;
		}
		public WebElement getCheckoutDate() {
			return CheckoutDate;
		}
		public WebElement getAdultCount() {
			return AdultCount;
		}
		public WebElement getChildCount() {
			return ChildCount;
		}
		@FindBy(id="Submit")
		private WebElement btnSearch;

		public WebElement getCheckinDate() {
			return CheckinDate;
		}
		public WebElement getBtnSearch() {
			return btnSearch;
		}
		@FindBy(id="radiobutton_0")
		private WebElement btnradio;
		@FindBy(id="continue")
		private WebElement btnContinue;

		public WebElement getBtnradio() {
			return btnradio;
		}
		public WebElement getBtnContinue() {
			return btnContinue;
		}
		@FindBy(id="first_name")
		private WebElement txtFirstname;
		@FindBy(id="last_name")
		private WebElement txtLastname;
		@FindBy(id="address")
		private WebElement txtAddress;
		@FindBy(id="cc_num")
		private WebElement  txtCC;
		@FindBy(id="cc_type")
		private WebElement ccType;
		@FindBy(id="cc_exp_month")
		private WebElement ccExpMonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement ccExpYear;
		@FindBy(id="cc_cvv")
		private WebElement Cvv;

		public WebElement getTxtFirstname() {
			return txtFirstname;
		}
		public WebElement getTxtLastname() {
			return txtLastname;
		}
		public WebElement getTxtAddress() {
			return txtAddress;
		}
		public WebElement getTxtCC() {
			return txtCC;
		}
		public WebElement getCcType() {
			return ccType;
		}
		public WebElement getCcExpMonth() {
			return ccExpMonth;
		}
		public WebElement getCcExpYear() {
			return ccExpYear;
		}
		public WebElement getCvv() {
			return Cvv;
		}
		@FindBy(id="book_now")
		private WebElement btnBookNow;

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}
		public void setBtnBookNow(WebElement btnBookNow) {
			this.btnBookNow = btnBookNow;
		}
		@FindBy(id="order_no")
		private WebElement Orderno;

		public WebElement getOrderno() {
			return Orderno;
		}
		
	}


