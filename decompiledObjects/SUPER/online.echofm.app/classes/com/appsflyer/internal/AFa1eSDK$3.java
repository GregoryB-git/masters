package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

final class AFa1eSDK$3
  implements AFb1iSDK.AFa1wSDK
{
  public AFa1eSDK$3(AFa1eSDK paramAFa1eSDK, AFe1mSDK paramAFe1mSDK, AppsFlyerRequestListener paramAppsFlyerRequestListener) {}
  
  public final void AFInAppEventType(@NonNull Context paramContext)
  {
    AFLogger.afInfoLog("onBecameBackground");
    Object localObject = values;
    long l1 = System.currentTimeMillis();
    long l2 = afErrorLog;
    if (l2 != 0L)
    {
      l1 -= l2;
      l2 = l1;
      if (l1 > 0L)
      {
        l2 = l1;
        if (l1 < 1000L) {
          l2 = 1000L;
        }
      }
      l2 = TimeUnit.MILLISECONDS.toSeconds(l2);
      afWarnLog = l2;
      valueOf.AFInAppEventParameterName("prev_session_dur", l2);
    }
    else
    {
      AFLogger.afInfoLog("Metrics: fg ts is missing");
    }
    AFLogger.afInfoLog("callStatsBackground background call");
    AFInAppEventParameterName.AFKeystoreWrapper(new WeakReference(paramContext));
    AFInAppEventParameterName.AFInAppEventType().onConversionDataSuccess().valueOf();
    localObject = AFInAppEventParameterName.AFInAppEventType().afErrorLogForExcManagerOnly();
    if (((AFb1tSDK)localObject).afInfoLog())
    {
      ((AFb1tSDK)localObject).values();
      if ((paramContext != null) && (!AppsFlyerLib.getInstance().isStopped())) {
        ((AFb1tSDK)localObject).valueOf(paramContext.getPackageName(), paramContext.getPackageManager(), AFInAppEventParameterName.AFInAppEventType());
      }
      ((AFb1tSDK)localObject).valueOf();
    }
    else
    {
      AFLogger.afDebugLog("RD status is OFF");
    }
    AFInAppEventParameterName.AFInAppEventType().getLevel().AFInAppEventType();
  }
  
  public final void values(@NonNull Activity paramActivity)
  {
    values.values();
    AFInAppEventParameterName.AFInAppEventType().afRDLog().AFInAppEventParameterName(null);
    AFa1eSDK.AFInAppEventParameterName(AFInAppEventParameterName);
    Object localObject = AFInAppEventParameterName;
    int i = ((AFa1eSDK)localObject).valueOf(((AFa1eSDK)localObject).values(paramActivity), false);
    AFLogger.afInfoLog("onBecameForeground");
    if (i < 2) {
      AFInAppEventParameterName.AFInAppEventType().getLevel().AFInAppEventParameterName();
    }
    localObject = new AFe1hSDK();
    if (paramActivity != null) {
      AFInAppEventParameterName.AFInAppEventType().AppsFlyer2dXConversionCallback().valueOf(((AFa1qSDK)localObject).valueOf(), paramActivity.getIntent(), paramActivity.getApplication());
    }
    AFa1eSDK localAFa1eSDK = AFInAppEventParameterName;
    AFInAppEventParameterName = valueOf;
    localAFa1eSDK.values((AFa1qSDK)localObject, paramActivity);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1eSDK.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */