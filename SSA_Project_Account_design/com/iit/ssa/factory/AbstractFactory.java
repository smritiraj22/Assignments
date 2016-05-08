package com.iit.ssa.factory;

import com.iit.ssa.stratergy.Balance;
import com.iit.ssa.stratergy.DataStorage;
import com.iit.ssa.stratergy.DataStore;
import com.iit.ssa.stratergy.Deposit;
import com.iit.ssa.stratergy.Menu;
import com.iit.ssa.stratergy.Penalty;
import com.iit.ssa.stratergy.Withdraw;
import com.iit.ssa.util.AccountMsg;

/**
 * 
 * @author Smriti
 *
 *
 *This is an abstract class concrete implementations of this class provide the following 
 *and creates the appropriate implementations of core functions
 *1.Deposit
 *2.Withdraw
 *3.Data Store
 *4.Menu
 *5.Balance
 *6.Account Messages
 *7.Data Storage data structure
 */
public abstract class AbstractFactory {

	public abstract Deposit makeDeposit();

	public abstract Withdraw makeWithdraw();

	public abstract DataStorage getData();

	public abstract Penalty getPenalty();

	public abstract Menu getMenu();

	public abstract Balance getBalance();

	public abstract AccountMsg getMessage();

	public abstract DataStore getAllData();

}
