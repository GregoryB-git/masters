package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class AFf1gSDK
{
  public static List<BigDecimal> AFKeystoreWrapper(Object paramObject)
  {
    ArrayList localArrayList = (ArrayList)paramObject;
    paramObject = (Float)localArrayList.get(0);
    Float localFloat1 = (Float)localArrayList.get(1);
    Float localFloat2 = (Float)localArrayList.get(2);
    localArrayList = new ArrayList();
    try
    {
      localArrayList.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(paramObject.toString())));
      localArrayList.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(localFloat1.toString())));
      localArrayList.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(localFloat2.toString())));
    }
    catch (ParseException paramObject)
    {
      AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", (Throwable)paramObject);
    }
    return localArrayList;
  }
  
  public static enum AFa1vSDK
  {
    String values;
    
    static
    {
      AFInAppEventType = new AFa1vSDK("ACCELEROMETER", 1, "am");
      valueOf = new AFa1vSDK("MAGNETOMETER", 2, "mm");
      AFInAppEventParameterName = new AFa1vSDK("RESERVED", 3, "rs");
      AFa1vSDK localAFa1vSDK = new AFa1vSDK("GYROSCOPE", 4, "gs");
      AFLogger = localAFa1vSDK;
      afErrorLog = new AFa1vSDK[] { AFKeystoreWrapper, AFInAppEventType, valueOf, AFInAppEventParameterName, localAFa1vSDK };
    }
    
    private AFa1vSDK(String paramString)
    {
      values = paramString;
    }
  }
  
  public static enum AFa1xSDK
  {
    static
    {
      AFa1xSDK localAFa1xSDK1 = new AFa1xSDK("NONE", 0);
      valueOf = localAFa1xSDK1;
      AFa1xSDK localAFa1xSDK2 = new AFa1xSDK("FIRST", 1);
      values = localAFa1xSDK2;
      AFa1xSDK localAFa1xSDK3 = new AFa1xSDK("ALL", 2);
      AFInAppEventType = localAFa1xSDK3;
      AFKeystoreWrapper = new AFa1xSDK[] { localAFa1xSDK1, localAFa1xSDK2, localAFa1xSDK3 };
    }
    
    private AFa1xSDK() {}
  }
  
  public static enum AFa1zSDK
  {
    private int afRDLog;
    
    static
    {
      AFa1zSDK localAFa1zSDK1 = new AFa1zSDK("MAGNETOMETER", 2, 2);
      AFInAppEventParameterName = localAFa1zSDK1;
      AFKeystoreWrapper = new AFa1zSDK("RESERVED", 3, 3);
      AFa1zSDK localAFa1zSDK2 = new AFa1zSDK("GYROSCOPE", 4, 4);
      values = localAFa1zSDK2;
      AFLogger = new AFa1zSDK[] { AFInAppEventType, valueOf, localAFa1zSDK1, AFKeystoreWrapper, localAFa1zSDK2 };
    }
    
    private AFa1zSDK(int paramInt)
    {
      afRDLog = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1gSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */