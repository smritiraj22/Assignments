package com.iit.ssa.factory;

import com.iit.ssa.stratergy.Bal2;
import com.iit.ssa.stratergy.Balance;
import com.iit.ssa.stratergy.DataStorage;
import com.iit.ssa.stratergy.DataStorage2;
import com.iit.ssa.stratergy.DataStore;
import com.iit.ssa.stratergy.DataStore2;
import com.iit.ssa.stratergy.Deposit;
import com.iit.ssa.stratergy.Deposit2;
import com.iit.ssa.stratergy.Menu;
import com.iit.ssa.stratergy.Menu2;
import com.iit.ssa.stratergy.Penalty;
import com.iit.ssa.stratergy.Withdraw;
import com.iit.ssa.stratergy.Withdraw2;
import com.iit.ssa.util.AccountMsg;

/**
 * 
 * @author Smriti
 * *This is a concrete class concrete implementations of this class provide the following 
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
public class ConcreteFactory2 extends AbstractFactory
{
    DataStore2 ds= new DataStore2(); 
    
    /**
	 * creates DataStorage class
	 */
    public DataStorage getData()
    {
        DataStorage storedataobj=new DataStorage2();
        storedataobj.setdata(ds);
        return storedataobj;
    }
    /**
	 * creates Menu class
	 */
    public Menu getMenu()
    {
        Menu menu=new Menu2();       
        return menu;
    }
    /**
	 * creates Balance class
	 */
    public Balance getBalance()
    {
        Balance bal=new Bal2();
        bal.setdata(ds);
        return bal;
    }
    /**
	 * creates Deposit class
	 */
    public Deposit makeDeposit()
    {
        Deposit deposit=new Deposit2();
        deposit.setdata(ds);
        return deposit;
    }
    /**
	 * creates Withdraw class
	 */
    public Withdraw makeWithdraw()
    {
        Withdraw with=new Withdraw2();
        with.setdata(ds);
        return with;
    }
    /**
	 * creates DataStore class
	 */
    public DataStore getAllData()
    {
        return ds;
    }
    /**
	 * creates Penalty class
	 */
    public Penalty getPenalty()
    {        
        return null;
    }
    /**
	 * creates Account Message class
	 */
    public AccountMsg getMessage()
    {
        AccountMsg messageobj=new AccountMsg();
        return messageobj;
    }
}
