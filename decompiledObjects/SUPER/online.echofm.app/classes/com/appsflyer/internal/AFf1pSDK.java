package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public abstract class AFf1pSDK
  extends Observable
{
  public final Map<String, Object> AFInAppEventParameterName = new HashMap();
  public final String AFKeystoreWrapper;
  public AFa1zSDK afDebugLog = AFa1zSDK.valueOf;
  long afInfoLog;
  public final String afRDLog;
  final Runnable values;
  
  public AFf1pSDK(String paramString1, String paramString2, Runnable paramRunnable)
  {
    values = paramRunnable;
    AFKeystoreWrapper = paramString2;
    afRDLog = paramString1;
  }
  
  public abstract void valueOf(Context paramContext);
  
  public final void values()
  {
    AFInAppEventParameterName.put("source", AFKeystoreWrapper);
    AFInAppEventParameterName.put("type", afRDLog);
    AFInAppEventParameterName.put("latency", Long.valueOf(System.currentTimeMillis() - afInfoLog));
    afDebugLog = AFa1zSDK.values;
    setChanged();
    notifyObservers();
  }
  
  public static enum AFa1zSDK
  {
    static
    {
      AFa1zSDK localAFa1zSDK1 = new AFa1zSDK("NOT_STARTED", 0);
      valueOf = localAFa1zSDK1;
      AFa1zSDK localAFa1zSDK2 = new AFa1zSDK("STARTED", 1);
      AFInAppEventType = localAFa1zSDK2;
      AFa1zSDK localAFa1zSDK3 = new AFa1zSDK("FINISHED", 2);
      values = localAFa1zSDK3;
      AFKeystoreWrapper = new AFa1zSDK[] { localAFa1zSDK1, localAFa1zSDK2, localAFa1zSDK3 };
    }
    
    private AFa1zSDK() {}
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1pSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */