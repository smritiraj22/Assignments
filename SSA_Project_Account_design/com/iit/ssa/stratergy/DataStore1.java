

package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 * stores all the temporary data for the account1
 * 1.pin
 * 2.user id
 * 3.balance
 * 4.withdraw amount
 * 5.deposit amount
 * 
 * Types of Data 
 * String,Float
 *
 */
public class DataStore1 extends DataStore {
	static String pin;
	static String temPin;
	static String userID;
	static String tempUserID;
	static float bal;
	static float tempBal;
	static float tempFloatDeposit;
	static float tempFloatWithdarw;
	
	public void setTempStringPin(String a) {
		temPin = a;
	}

	public String getTempStringPin() {
		return temPin;
	}

	public String getStringPin() {
		return pin;
	}
	
	public void setStringPin(String p) {
		pin = p;
	}

	public void setFloatBal(float b) {
		bal = b;
	}
	
	public float getFloatBal() {
		return bal;
	}
	
	public void setTempStringUserID(String y)
	{
		tempUserID=y;
	}
	
	public String getTempStringUserID()
	{
		return tempUserID;
	}
	
	public void setStringUserID(String y)
	{
		userID=y;
	}
	
	public String getStringUserID()
	{
		return userID;
	}

	public float getTempFloatBal() {
		return tempBal;
	}

	public void setTempFloatBal(float c) {
		tempBal = c;
	}

	public void setTempFloatWitdrawAmt(float y) {
		tempFloatWithdarw = y;
		
	}
	public void setFloatWitdrawAmt(float y) {
		tempFloatWithdarw = y;
		
	}
	
	public float getTempFloatWitdrawAmt() {
		return tempFloatWithdarw;
	}

	public float getFloatWitdrawAmt() {
		return tempFloatWithdarw;
	}

	public void setTempFloatDepositAmt(float x) {
		tempFloatDeposit = x;
	}

	public float getTempFloatDepositAmt() {
		return tempFloatDeposit;
	}

}
