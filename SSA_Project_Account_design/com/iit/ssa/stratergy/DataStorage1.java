package com.iit.ssa.stratergy;

/**
 * Stores all the data for account 1
 * @author Smriti
 *
 */
public class DataStorage1 extends DataStorage
{
    public void storeData()
    {
        String pin=ds.getTempStringPin();
        String uId=ds.getStringUserID();
        float b=ds.getTempFloatBal();
        ds.setStringPin(pin);
        ds.setStringUserID(uId);
        ds.setFloatBal(b);
    }
}
