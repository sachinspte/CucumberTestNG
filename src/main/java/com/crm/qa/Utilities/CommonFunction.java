package com.crm.qa.Utilities;

import com.crm.qa.base.Constant;

public class CommonFunction implements Constant
{
   public static void  sleepMethod()
   {
       try
       {
        Thread.sleep(SLEEP_WAIT);
       }catch (InterruptedException e)
       {
        e.printStackTrace();
       }catch (Exception e)
       {
        e.printStackTrace();
       }
   }



}
