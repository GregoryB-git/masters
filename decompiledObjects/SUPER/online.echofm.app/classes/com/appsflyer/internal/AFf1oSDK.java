package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AFf1oSDK
{
  private final List<AFf1pSDK> AFInAppEventType = new ArrayList();
  
  public final void AFKeystoreWrapper(AFf1pSDK paramAFf1pSDK)
  {
    try
    {
      AFInAppEventType.add(paramAFf1pSDK);
      return;
    }
    finally
    {
      paramAFf1pSDK = finally;
      throw paramAFf1pSDK;
    }
  }
  
  @NonNull
  public final AFf1pSDK[] valueOf()
  {
    try
    {
      AFf1pSDK[] arrayOfAFf1pSDK = (AFf1pSDK[])AFInAppEventType.toArray(new AFf1pSDK[0]);
      return arrayOfAFf1pSDK;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void values(Context paramContext, Runnable paramRunnable, AFc1xSDK paramAFc1xSDK)
  {
    Object localObject = new Intent("com.appsflyer.referrer.INSTALL_PROVIDER");
    localObject = paramContext.getPackageManager().queryIntentContentProviders((Intent)localObject, 0);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      paramContext = new ArrayList();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = nextproviderInfo;
        if (localObject != null) {
          paramContext.add(new AFf1lSDK((ProviderInfo)localObject, paramRunnable, paramAFc1xSDK));
        } else {
          AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
        }
      }
      if (!paramContext.isEmpty())
      {
        AFInAppEventType.addAll(paramContext);
        paramRunnable = new StringBuilder("[Preinstall]: Detected ");
        paramRunnable.append(paramContext.size());
        paramRunnable.append(" valid preinstall provider(s)");
        AFLogger.afDebugLog(paramRunnable.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1oSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */