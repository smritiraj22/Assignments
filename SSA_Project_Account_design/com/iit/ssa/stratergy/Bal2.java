
package com.iit.ssa.stratergy;

/**
 * displays the balance for account 2
 * @author Smriti
 *
 */
public class Bal2 extends Balance {
	public void displayBalance() {
		int b = ds.getIntBal();
		System.out.println("The balance in Account2 is = " + b);
	}
}