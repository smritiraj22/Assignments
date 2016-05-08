
package com.iit.ssa.stratergy;
/**
 * 
 * @author Smriti
 *class withdraw from account 1
 */
public class Withdraw1 extends Withdraw
{
    public void withdraw()
    {        
        float w=ds.getTempFloatWitdrawAmt();
        float b=ds.getFloatBal();
        float bal=b-w;
        ds.setTempFloatBal(bal);
        ds.setFloatBal(bal);
    }
    
    
}
