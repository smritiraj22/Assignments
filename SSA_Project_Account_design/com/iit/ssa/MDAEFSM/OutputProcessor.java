package com.iit.ssa.MDAEFSM;

import com.iit.ssa.factory.AbstractFactory;
import com.iit.ssa.stratergy.Balance;
import com.iit.ssa.stratergy.DataStorage;
import com.iit.ssa.stratergy.DataStore;
import com.iit.ssa.stratergy.Deposit;
import com.iit.ssa.stratergy.Menu;
import com.iit.ssa.stratergy.Penalty;
import com.iit.ssa.stratergy.Withdraw;
import com.iit.ssa.util.AccountMsg;

public class OutputProcessor {

	AbstractFactory fact;
	DataStore dataStore;
	AccountMsg msg;

	/**
	 * sets abstract factory object
	 * 
	 * @param af
	 */
	public void setfactory(AbstractFactory af) {
		fact = af;
	}

	/**
	 * sets datastore object
	 * 
	 * @param dt
	 */
	public void setData(DataStore dt) {
		dataStore = dt;
	}

	/**
	 * stores all the actual data
	 */
	public void storeData() {
		DataStorage storedataobj;
		storedataobj = fact.getData();
		storedataobj.storeData();
	}

	/**
	 * displays the menu of operations
	 */
	public void displayMenu() {
		Menu displaymenuobj;
		displaymenuobj = fact.getMenu();
		displaymenuobj.menu();
	}

	/**
	 * displays appropriate balance
	 */
	public void displayBalance() {
		Balance bal;
		bal = fact.getBalance();
		bal.displayBalance();
	}

	/**
	 * deposits into account
	 */
	public void makeDeposit() {
		Deposit deposit;
		deposit = fact.makeDeposit();
		deposit.deposit();
	}

	/**
	 * withdraws from account
	 */
	public void makeWithdraw() {
		Withdraw withd;
		withd = fact.makeWithdraw();
		withd.withdraw();
	}

	/**
	 * applies given penalty on account
	 * 
	 * @param penalty
	 */
	public void penalty(int penalty) {
		Penalty pen = fact.getPenalty();
		pen.penalty(penalty);

	}

	/**
	 * displays account opened and asks to login
	 */
	public void displayAccountOpened() {
		msg = fact.getMessage();
		msg.accountOpenMsg();
		;

	}

	/**
	 * prompts for pin
	 */
	public void displayEnterPin() {
		msg = fact.getMessage();
		msg.promptPin();

	}

	/**
	 * displays pin is incorrect
	 */
	public void displayIncorrectPin() {
		msg = fact.getMessage();
		msg.displayIncorrectPinMsg();
	}

	/**
	 * displays user id is incorrect
	 */
	public void incorrectIDMsg() {
		msg = fact.getMessage();
		msg.displayIncorrectIDMsg();
	}

	/**
	 * displays maximum number of pin msg
	 */
	public void tooManyAttemptsMsg() {
		msg = fact.getMessage();
		msg.tooManyAttemptsMsg();
	}

	/**
	 * displays no funds in account
	 */
	public void noFundsMsg() {
		msg = fact.getMessage();
		msg.noFundsMsg();
	}

	/**
	 * displays account cant be locked as pin is incorrect
	 */
	public void incorrectLockMsg() {
		msg = fact.getMessage();
		msg.incorrectLockMsg();
	}

	/**
	 * displays account locked as pin is correct
	 */
	public void displayLocked() {
		msg = fact.getMessage();
		msg.accountLocked();
	}

	/**
	 * displays user logged in successfully
	 */
	public void login() {
		msg = fact.getMessage();
		msg.displayLoggedInMsg();
	}

	/**
	 * displays user didnt logged in successfully
	 */
	public void inCorrectLogin() {
		msg = fact.getMessage();
		msg.displayIncorrectIDMsg();
	}

	/**
	 * displays user logged out successfully
	 */
	public void displayLoggedOut() {
		msg = fact.getMessage();
		msg.logoutMsg();
	}

	/**
	 * displays user unlocked successfully
	 */
	public void displayUnLocked() {
		msg = fact.getMessage();
		msg.accountUnLocked();
	}

	/**
	 * displays user unlocked unsuccessfully
	 */
	public void incorrectUnlockMsg() {
		msg = fact.getMessage();
		msg.incorrectUnLockMsg();
	}

	/**
	 * displays account activated successfully
	 */
	public void activate() {
		msg = fact.getMessage();
		msg.activate();
	}

	/**
	 * displays account suspended successfully
	 */
	public void suspend() {
		msg = fact.getMessage();
		msg.suspend();
	}

	/**
	 * 
	 * displays account closed successfully
	 *
	 */
	public void close() {
		msg = fact.getMessage();
		msg.closeMsg();
	}
}