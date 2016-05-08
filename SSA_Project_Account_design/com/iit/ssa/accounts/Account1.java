
package com.iit.ssa.accounts;

import com.iit.ssa.MDAEFSM.MDA;
import com.iit.ssa.factory.AbstractFactory;
import com.iit.ssa.stratergy.DataStore;

/**
 * 
 * @author Smriti
 *
 */
public class Account1 {
	MDA mdaEfsm;
	DataStore dataStore;
	AbstractFactory af;

	/**
	 * sets MDA EFSM object
	 * 
	 * @param obj
	 */
	public void setMDA(MDA obj) {
		mdaEfsm = obj;
	}

	/**
	 * sets DataStore object
	 * 
	 * @param obj
	 */
	public void setData(DataStore obj) {
		dataStore = obj;
	}

	/**
	 * Sets Concrete Factory object
	 * 
	 * @param obj
	 */
	public void setFactory(AbstractFactory obj) {
		af = obj;
	}

	/**
	 * open an account with the given parameters
	 * 
	 * @param pin
	 * @param y
	 * @param bal
	 */
	public void open(String pin, String y, float bal) {
		dataStore.setTempFloatBal(bal);
		dataStore.setTempStringUserID(y);
		dataStore.setTempStringPin(pin);
		mdaEfsm.open();

	}

	/**
	 * perform check pin operation and takes to appropriate state based on
	 * balance if pin is incorrect then allows maximum 3 times to retry
	 * 
	 * @param pin
	 */
	public void pin(String pin) {
		String temp = dataStore.getStringPin();
		if (!(pin.equals(temp))) {
			mdaEfsm.incorrectpin(3);
		}
		if (pin.equals(temp)) {
			float balance = dataStore.getFloatBal();
			if (balance > 500) {
				mdaEfsm.correctpinabovemin();
			} else {
				mdaEfsm.correctpinbelowmin();
			}
		}

	}

	/**
	 * display balance
	 */
	public void balance() {
		mdaEfsm.balance();
	}

	/**
	 * deposit amount in account and takes to appropriate state, ready,
	 * overdrawn
	 * 
	 * @param amount
	 */
	public void deposit(float amount) {
		dataStore.setTempFloatDepositAmt(amount);
		mdaEfsm.deposit();
		float balance = dataStore.getFloatBal();
		if (balance < 500) {
			mdaEfsm.belowminbal();
		} else {
			mdaEfsm.aboveminbal();
		}

	}

	/**
	 * withdraw amount from account and takes to appropriate state, applies
	 * penalty if going from ready to overdrawn state, can't withdraw in
	 * overdrawn state
	 * 
	 * @param amount
	 */
	public void withdraw(float amount) {
		dataStore.setTempFloatWitdrawAmt(amount);
		float balance = dataStore.getFloatBal();
		if (balance >= amount) {
			mdaEfsm.withdraw();
		}
		float tempbalance = dataStore.getFloatBal();
		if (tempbalance > 500) {
			mdaEfsm.aboveminbal();
		} else if (0 <= tempbalance && tempbalance <= 500) {
			mdaEfsm.belowminbalwithpanelty(20);
		} else {
			mdaEfsm.noFunds();
		}
	}

	/**
	 * locks the account with correct pin provided else doesn't lock
	 * 
	 * @param pin
	 */
	public void lock(String pin) {
		String temp_string_pin = dataStore.getStringPin();
		if (pin.equals(temp_string_pin)) {
			mdaEfsm.lock();
		} else {
			mdaEfsm.incorrectLock();
		}
	}

	/**
	 * unlocks the account with correct pin provided else doesn't unlock
	 * 
	 * @param pin
	 */
	public void unlock(String pin) {
		String temp_string_pin = dataStore.getStringPin();
		if (pin.equals(temp_string_pin)) {
			mdaEfsm.unlock();
			float tempbal = dataStore.getFloatBal();
			if (tempbal < 500) {
				mdaEfsm.belowminbal();
			} else {
				mdaEfsm.aboveminbal();
			}
		} else {
			mdaEfsm.incorrectUnlock();
		}
	}

	/**
	 * logins based on correct user id else doesn't login
	 * 
	 * @param y
	 */
	public void login(String y) {
		if (y.equals(dataStore.getTempStringUserID()))
			mdaEfsm.login();
		else
			mdaEfsm.incorrectLogin();
	}

	/**
	 * logs out from user account and moves to idle state
	 */
	void logout() {
		mdaEfsm.logout();
	}

	/**
	 * checks the current state of the account
	 */
	public void checkstate() {
		mdaEfsm.displaystate();
	}

}
