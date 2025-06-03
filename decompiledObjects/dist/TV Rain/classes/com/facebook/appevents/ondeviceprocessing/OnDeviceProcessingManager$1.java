package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class OnDeviceProcessingManager$1
  implements Runnable
{
  public OnDeviceProcessingManager$1(Context paramContext, String paramString1, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject1 = val$context.getSharedPreferences(val$preferencesName, 0);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(val$applicationId);
      ((StringBuilder)localObject2).append("pingForOnDevice");
      localObject2 = ((StringBuilder)localObject2).toString();
      if (((SharedPreferences)localObject1).getLong((String)localObject2, 0L) == 0L)
      {
        RemoteServiceWrapper.sendInstallEvent(val$applicationId);
        localObject1 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject1).putLong((String)localObject2, System.currentTimeMillis());
        ((SharedPreferences.Editor)localObject1).apply();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */