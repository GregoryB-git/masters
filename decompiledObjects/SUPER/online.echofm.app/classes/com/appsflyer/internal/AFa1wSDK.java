package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

public final class AFa1wSDK
  implements AFb1eSDK
{
  private static IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");
  
  @NonNull
  public final AFb1eSDK.AFa1ySDK AFInAppEventType(@NonNull Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    float f1 = 0.0F;
    Object localObject3 = localObject2;
    Intent localIntent;
    try
    {
      localIntent = paramContext.registerReceiver(null, AFInAppEventParameterName);
      localObject3 = localObject1;
      f2 = f1;
      if (localIntent == null) {
        break label189;
      }
      localObject3 = localObject2;
      if (2 != localIntent.getIntExtra("status", -1)) {
        break label106;
      }
      localObject3 = localObject2;
      i = localIntent.getIntExtra("plugged", -1);
      if (i == 1) {
        break label100;
      }
      if (i == 2) {
        break label94;
      }
      if (i != 4) {
        paramContext = "other";
      }
    }
    finally
    {
      break label179;
    }
    paramContext = "wireless";
    break label109;
    label94:
    paramContext = "usb";
    break label109;
    label100:
    paramContext = "ac";
    break label109;
    label106:
    paramContext = "no";
    label109:
    localObject3 = paramContext;
    int j = localIntent.getIntExtra("level", -1);
    localObject3 = paramContext;
    int i = localIntent.getIntExtra("scale", -1);
    localObject3 = paramContext;
    float f2 = f1;
    if (-1 != j)
    {
      localObject3 = paramContext;
      f2 = f1;
      if (-1 != i)
      {
        f2 = j * 100.0F / i;
        localObject3 = paramContext;
        break label189;
        label179:
        AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", paramContext);
        f2 = f1;
      }
    }
    label189:
    return new AFb1eSDK.AFa1ySDK(f2, (String)localObject3);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */