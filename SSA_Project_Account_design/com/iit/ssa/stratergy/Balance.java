
package com.iit.ssa.stratergy;

/**
 * displays the balance for account 
 * @author Smriti
 *
 */
public abstract class Balance {
	DataStore ds;

	public abstract void displayBalance();

	public void setdata(DataStore dt) {
		ds = dt;
	}
}
