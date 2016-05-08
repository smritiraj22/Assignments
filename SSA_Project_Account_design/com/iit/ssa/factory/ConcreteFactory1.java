
package com.iit.ssa.factory;

import com.iit.ssa.stratergy.Bal1;
import com.iit.ssa.stratergy.Balance;
import com.iit.ssa.stratergy.DataStorage;
import com.iit.ssa.stratergy.DataStorage1;
import com.iit.ssa.stratergy.DataStore;
import com.iit.ssa.stratergy.DataStore1;
import com.iit.ssa.stratergy.Deposit;
import com.iit.ssa.stratergy.Deposit1;
import com.iit.ssa.stratergy.Menu;
import com.iit.ssa.stratergy.Menu1;
import com.iit.ssa.stratergy.Penalty;
import com.iit.ssa.stratergy.Penalty1;
import com.iit.ssa.stratergy.Withdraw;
import com.iit.ssa.stratergy.Withdraw1;
import com.iit.ssa.util.AccountMsg;

/**
 * 
 * @author Smriti
 *  *This is a concrete class concrete implementations of this class provide the following 
 *and creates the appropriate implementations of core functions
 *1.Deposit
 *2.Withdraw
 *3.Data Store
 *4.Menu
 *5.Balance
 *6.Account Messages
 *7.Data Storage data structure
 *
 */
public class ConcreteFactory1 extends AbstractFactory {
	DataStore1 dataStore1 = new DataStore1();
	
	/**
	 * creates DataStorage class
	 */
	public DataStorage getData() {
		DataStorage storedataobj = new DataStorage1();
		storedataobj.setdata(dataStore1);
		return storedataobj;
	}
	/**
	 * creates Menu class
	 */
	public Menu getMenu() {
		Menu menu = new Menu1();
		return menu;
	}
	/**
	 * creates Balance class
	 */
	public Balance getBalance() {
		Balance bal = new Bal1();
		bal.setdata(dataStore1);
		return bal;
	}
	/**
	 * creates Deposit class
	 */
	public Deposit makeDeposit() {
		Deposit deposit = new Deposit1();
		deposit.setdata(dataStore1);
		return deposit;
	}
	/**
	 * creates Withdraw class
	 */
	public Withdraw makeWithdraw() {
		Withdraw with = new Withdraw1();
		with.setdata(dataStore1);
		return with;
	}
	/**
	 * creates DataStore class
	 */
	public DataStore getAllData() {
		return dataStore1;
	}
	/**
	 * creates Penalty class
	 */
	public Penalty getPenalty() {
		Penalty chargepenaltyobj = new Penalty1();
		chargepenaltyobj.setdata(dataStore1);
		return chargepenaltyobj;
	}
	/**
	 * creates Account Message class
	 */
	public AccountMsg getMessage() {
		AccountMsg messageobj = new AccountMsg();
		return messageobj;
	}
}
