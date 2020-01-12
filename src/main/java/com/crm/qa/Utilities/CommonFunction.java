package com.crm.qa.Utilities;

public class CommonFunction
{
   public static void  sleepMethod()
   {
       try
       {
        Thread.sleep(Constant.SLEEP_WAIT);
       }catch (InterruptedException e)
       {
        e.printStackTrace();
       }catch (Exception e)
       {
        e.printStackTrace();
       }
   }



}
