
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *abstact class withdraw from account
 */
public abstract class Withdraw {
    DataStore ds;

	public abstract void withdraw();
	
    public void setdata(DataStore dt)
    {
        ds=dt;
    }
}
