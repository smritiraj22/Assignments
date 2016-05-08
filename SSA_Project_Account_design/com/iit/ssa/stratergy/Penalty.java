
package com.iit.ssa.stratergy;

/**
 * 
 * @author Smriti
 *abstract class penalty applied on account
 */
public abstract class Penalty {

	DataStore ds;

	public abstract void penalty(float penalty);

	public void setdata(DataStore dt) {
		ds = dt;
	}
}
