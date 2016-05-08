
package com.iit.ssa.stratergy;

/**
 * Abstract class for all deposit
 * @author Smriti
 *
 */
public abstract class Deposit {
	DataStore ds;
	/**
	 * actual deposit implemented by child classes
	 */
	public abstract void deposit();
	/**
	 * sets the data
	 * @param dt
	 */
	public void setdata(DataStore dt) {
		ds = dt;
	}
}
