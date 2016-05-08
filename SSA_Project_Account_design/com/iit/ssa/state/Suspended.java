package com.iit.ssa.state;

/**
 * 
 * @author Smriti
 *State when account is susprended
 */
public class Suspended extends State {
	/**
	 * displays balance
	 */
	public void balance() {
		outputProcessor.displayBalance();
	}
	/**
	 * activates suspended account
	 */
	 public void activate(){
		 outputProcessor.activate();
	 }
	 /**
	  * closes the account
	  */
	 public void close(){
		 outputProcessor.close();
	 }

}
