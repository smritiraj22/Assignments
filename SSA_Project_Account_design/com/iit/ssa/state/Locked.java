

package com.iit.ssa.state;
/**
 * 
 * @author Smriti
 * Account in locked state
 *
 */
public class Locked extends State
{
    public void unlockUnsuccesful()
    {	
    	/**
    	 * displays incorrect pin while unlocking
    	 */
        outputProcessor.displayIncorrectPin();
    }
    public void unlock()
    {
    	/**
    	 * displays unlock successful
    	 */
        outputProcessor.displayUnLocked();
    } 
}
