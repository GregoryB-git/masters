package com.appsflyer.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class AFa1uSDK$3
  implements InvocationHandler
{
  public AFa1uSDK$3(Class paramClass, AFa1uSDK.AFa1zSDK paramAFa1zSDK) {}
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (paramMethod.getName().equals("onDeferredAppLinkDataFetched"))
    {
      paramObject = paramArrayOfObject[0];
      if (paramObject != null)
      {
        paramObject = AFInAppEventType.cast(paramObject);
        paramObject = (Bundle)Bundle.class.cast(AFInAppEventType.getMethod("getArgumentBundle", new Class[0]).invoke(paramObject, new Object[0]));
        if (paramObject != null)
        {
          paramArrayOfObject = ((BaseBundle)paramObject).getString("com.facebook.platform.APPLINK_NATIVE_URL");
          paramMethod = ((BaseBundle)paramObject).getString("target_url");
          paramObject = ((Bundle)paramObject).getBundle("extras");
          if (paramObject != null)
          {
            paramObject = ((Bundle)paramObject).getBundle("deeplink_context");
            if (paramObject != null)
            {
              paramObject = ((BaseBundle)paramObject).getString("promo_code");
              break label127;
            }
          }
          paramObject = null;
        }
        else
        {
          localAFa1zSDK = null;
          paramObject = localAFa1zSDK;
          paramMethod = (Method)paramObject;
          paramArrayOfObject = (Object[])paramObject;
          paramObject = localAFa1zSDK;
        }
        label127:
        AFa1uSDK.AFa1zSDK localAFa1zSDK = AFKeystoreWrapper;
        if (localAFa1zSDK != null) {
          localAFa1zSDK.valueOf(paramArrayOfObject, paramMethod, (String)paramObject);
        }
      }
      else
      {
        paramObject = AFKeystoreWrapper;
        if (paramObject != null) {
          ((AFa1uSDK.AFa1zSDK)paramObject).valueOf(null, null, null);
        }
      }
      return null;
    }
    paramObject = AFKeystoreWrapper;
    if (paramObject != null) {
      ((AFa1uSDK.AFa1zSDK)paramObject).AFKeystoreWrapper("onDeferredAppLinkDataFetched invocation failed");
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1uSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */