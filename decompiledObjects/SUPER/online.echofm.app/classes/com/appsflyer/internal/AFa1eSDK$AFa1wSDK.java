package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import org.json.JSONObject;

final class AFa1eSDK$AFa1wSDK
  implements AFc1cSDK
{
  private AFa1eSDK$AFa1wSDK(AFa1eSDK paramAFa1eSDK) {}
  
  private boolean values()
  {
    return valueOf.AFInAppEventParameterName != null;
  }
  
  public final void AFInAppEventParameterName(AFd1zSDK<?> paramAFd1zSDK) {}
  
  public final void AFInAppEventType(AFd1zSDK<?> paramAFd1zSDK, AFd1ySDK paramAFd1ySDK)
  {
    if ((paramAFd1zSDK instanceof AFd1hSDK))
    {
      AFd1hSDK localAFd1hSDK = (AFd1hSDK)paramAFd1zSDK;
      boolean bool = paramAFd1zSDK instanceof AFd1fSDK;
      if ((bool) && (values()))
      {
        Object localObject = (AFd1fSDK)paramAFd1zSDK;
        if ((valueOf == AFd1ySDK.AFInAppEventParameterName) || (AFInAppEventType == 1))
        {
          AFe1pSDK localAFe1pSDK = new AFe1pSDK((AFd1fSDK)localObject, valueOf.AFInAppEventType().values());
          localObject = valueOf.AFInAppEventType().AFVersionDeclaration();
          AFKeystoreWrapper.execute(new AFc1bSDK.4((AFc1bSDK)localObject, localAFe1pSDK));
        }
      }
      if (paramAFd1ySDK == AFd1ySDK.AFInAppEventParameterName)
      {
        paramAFd1ySDK = valueOf;
        paramAFd1ySDK.values(AFa1eSDK.AFInAppEventType(paramAFd1ySDK)).AFInAppEventParameterName("sentSuccessfully", "true");
        if (!(paramAFd1zSDK instanceof AFd1eSDK))
        {
          paramAFd1zSDK = new AFe1ySDK(AFa1eSDK.AFInAppEventType(valueOf)).AFInAppEventParameterName();
          if ((paramAFd1zSDK != null) && (paramAFd1zSDK.AFKeystoreWrapper()))
          {
            paramAFd1zSDK = valueOf;
            AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(paramAFd1zSDK)));
            AFe1ySDK.valueOf(paramAFd1zSDK);
          }
        }
        paramAFd1zSDK = afErrorLog;
        if (paramAFd1zSDK != null)
        {
          paramAFd1zSDK = AFb1vSDK.AFKeystoreWrapper((String)paramAFd1zSDK.getBody());
          if (paramAFd1zSDK != null) {
            AFa1eSDK.valueOf(valueOf, paramAFd1zSDK.optBoolean("send_background", false));
          }
        }
        if (bool) {
          AFa1eSDK.AFKeystoreWrapper(valueOf, System.currentTimeMillis());
        }
      }
      return;
    }
    if (((paramAFd1zSDK instanceof AFe1pSDK)) && (paramAFd1ySDK != AFd1ySDK.AFInAppEventParameterName))
    {
      paramAFd1zSDK = new AFe1rSDK(valueOf.AFInAppEventType());
      paramAFd1ySDK = valueOf.AFInAppEventType().AFVersionDeclaration();
      AFKeystoreWrapper.execute(new AFc1bSDK.4(paramAFd1ySDK, paramAFd1zSDK));
    }
  }
  
  public final void values(AFd1zSDK<?> paramAFd1zSDK)
  {
    if ((paramAFd1zSDK instanceof AFd1fSDK))
    {
      paramAFd1zSDK = (AFd1hSDK)paramAFd1zSDK;
      valueOf.AFInAppEventType().afDebugLog().AFKeystoreWrapper(afInfoLog.AFLogger);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */