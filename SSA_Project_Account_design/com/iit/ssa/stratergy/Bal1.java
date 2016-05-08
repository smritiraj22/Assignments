
package com.iit.ssa.stratergy;

/**
 * displays the balance for account 1
 * @author Smriti
 *
 */
public class Bal1 extends Balance
{
    public void displayBalance()
    {
        float b=ds.getFloatBal();
        
        System.out.println("The balance in Account1 is "+ b);
    }
    
}

