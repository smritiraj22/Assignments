
package com.iit.ssa.accounts;

import com.iit.ssa.MDAEFSM.MDA;
import com.iit.ssa.factory.AbstractFactory;
import com.iit.ssa.stratergy.DataStore;

/**
 * 
 * @author Smriti
 *
 */
public class Account2 {
	MDA mda;
	DataStore dataStore;
	AbstractFactory af;

	/**
	 * sets MDA EFSM object
	 * 
	 * @param obj
	 */
	public void setMDA(MDA obj) {
		mda = obj;
	}

	/**
	 * sets DataStore object
	 * 
	 * @param obj
	 */
	public void setdata(DataStore obj) {
		dataStore = obj;
	}

	/**
	 * Sets Concrete Factory object
	 * 
	 * @param obj
	 */
	public void setfactory(AbstractFactory obj) {
		af = obj;
	}

	/**
	 * open an account with the given parameters
	 * 
	 * @param pin
	 * @param userId
	 * @param bal
	 */
	public void OPEN(int pin, int userId, int bal) {
		dataStore.setTempIntBal(bal);
		dataStore.setTempIntUserID(userId);
		dataStore.setTempIntPin(pin);
		mda.open();
	}

	/**
	 * perform check pin operation and takes to appropriate state based on
	 * balance if pin is incorrect then allows maximum 2 times to retry
	 * 
	 * @param pin
	 */
	public void PIN(int pin) {
		int temp = dataStore.getIntPin();
		if (pin != temp) {
			mda.incorrectpin(2);
		}
		if (pin == temp) {
			mda.correctpinabovemin();

		}
	}

	/**
	 * display balance
	 */
	public void BALANCE() {
		mda.balance();
	}

	/**
	 * deposit amount in account and takes to appropriate state in this it will
	 * be ready state
	 * 
	 * @param amount
	 */
	public void DEPOSIT(int amount) {
		dataStore.setTempIntDepositAmt(amount);
		mda.deposit();
		mda.aboveminbal();
	}

	/**
	 * withdraw amount from account and takes to appropriate state, can't
	 * withdraw if balance-amount to withdraw is less than 0.
	 * 
	 * @param amount
	 */
	public void WITHDRAW(int amount) {
		dataStore.setTempIntWithdrawAmt(amount);
		int bal = dataStore.getIntBal();
		if (bal - amount > 0) {
			mda.withdraw();
			mda.aboveminbal();
		} else {
			mda.noFunds();
		}
	}

	/**
	 * logins based on correct user id else doesn't login
	 * 
	 * @param y
	 */
	public void LOGIN(int y) {
		if (y == dataStore.getTempIntUserID())
			mda.login();
		else
			mda.incorrectLogin();
	}

	/**
	 * logs out from user account and moves to idle state
	 */
	public void LOGOUT() {
		mda.logout();
	}

	/**
	 * suspends the account
	 * 
	 */
	public void suspend() {
		mda.suspend();
	}

	/**
	 * activates the account
	 * 
	 */
	public void activate() {
		mda.activate();
	}

	/**
	 * closes the account
	 */
	public void close() {
		mda.close();
	}

	/**
	 * checks the current state of the account
	 */
	public void checkstate() {
		mda.displaystate();
	}

}
