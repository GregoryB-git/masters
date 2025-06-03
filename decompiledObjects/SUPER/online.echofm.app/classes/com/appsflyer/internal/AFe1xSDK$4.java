package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class AFe1xSDK$4
  implements InvocationHandler
{
  public AFe1xSDK$4(AFe1xSDK paramAFe1xSDK, AFe1xSDK.AFa1vSDK paramAFa1vSDK) {}
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (paramMethod.getName().equals("onLvlResult"))
    {
      paramObject = paramArrayOfObject[0];
      if (paramObject != null) {
        paramObject = (String)paramObject;
      } else {
        paramObject = null;
      }
      paramMethod = paramArrayOfObject[1];
      if (paramMethod != null) {
        paramMethod = (String)paramMethod;
      } else {
        paramMethod = null;
      }
      paramArrayOfObject = AFInAppEventParameterName;
      if (paramArrayOfObject != null)
      {
        if ((paramObject != null) && (paramMethod != null))
        {
          paramArrayOfObject.AFInAppEventParameterName((String)paramObject, paramMethod);
          break label226;
        }
        if (paramMethod == null) {}
        for (paramObject = new Exception("AFLVL Invalid signature");; paramObject = new Exception("AFLVL Invalid signedData"))
        {
          paramArrayOfObject.AFInAppEventParameterName("onLvlResult with error", (Exception)paramObject);
          break;
        }
      }
    }
    for (paramObject = "onLvlResult invocation succeeded, but listener is null";; paramObject = "onLvlFailure: listener is null")
    {
      AFLogger.afDebugLog((String)paramObject);
      break label226;
      paramObject = paramMethod.getName();
      paramMethod = "onLvlFailure";
      if (!paramObject.equals("onLvlFailure")) {
        break;
      }
      AFe1xSDK.AFa1vSDK localAFa1vSDK = AFInAppEventParameterName;
      if (localAFa1vSDK != null)
      {
        paramObject = paramArrayOfObject[0];
        if (paramObject != null)
        {
          paramObject = (Exception)paramObject;
          paramMethod = "onLvlFailure with exception";
        }
        for (;;)
        {
          localAFa1vSDK.AFInAppEventParameterName(paramMethod, (Exception)paramObject);
          break;
          paramObject = new Exception("unknown");
        }
      }
    }
    paramObject = AFInAppEventParameterName;
    if (paramObject != null) {
      ((AFe1xSDK.AFa1vSDK)paramObject).AFInAppEventParameterName("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
    }
    label226:
    return null;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1xSDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */