
package com.iit.ssa.stratergy;
/**
 * 
 * @author Smriti
 * stores all the temporary data for the account2
 * 1.pin
 * 2.user id
 * 3.balance
 * 4.withdraw amount
 * 5.deposit amount
 * 
 * Types of Data 
 * Int
 *
 */
public class DataStore2 extends DataStore {

	static int pin;
	static int tempIntPin;
	static int userID;
	static int tempUserID;
	static int bal;
	static int tempIntbal;
	static int tempIntDepositAmount;
	static int tempWithdrawIntAmount;

	public void setIntPin(int a) {
		pin = a;
	}

	public int getIntPin() {
		return pin;
	}

	public void setTempIntUserID(int y) {
		tempUserID = y;
	}

	public int getTempIntUserID() {
		return tempUserID;
	}

	public void setIntUserID(int y) {
		userID = y;
	}

	public int getIntUserID() {
		return userID;
	}

	public void setIntBal(int b) {
		bal = b;
	}

	public int getIntBal() {
		return bal;
	}

	public void setIntWithdrawAmt(int w) {
		tempWithdrawIntAmount = w;
	}

	public int getIntWithdrawAmt() {
		return tempWithdrawIntAmount;
	}
	
	public void setTempIntWithdrawAmt(int w) {
		tempWithdrawIntAmount = w;
	}

	public int getTempIntWithdrawAmt() {
		return tempWithdrawIntAmount;
	}

	public void setTempIntDepositAmt(int a) {
		tempIntDepositAmount = a;
	}

	public int getTempIntDepositAmt() {
		return tempIntDepositAmount;
	}

	public int getTempIntPin() {
		return tempIntPin;
	}

	public void setTempIntPin(int a) {
		tempIntPin = a;
	}

	public void setTempIntBal(int c) {
		tempIntbal = c;
	}

	public int getTempIntBal() {
		return tempIntbal;
	}

}