package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class InstallReferrerUtil$1
  implements InstallReferrerStateListener
{
  public InstallReferrerUtil$1(InstallReferrerClient paramInstallReferrerClient, InstallReferrerUtil.Callback paramCallback) {}
  
  public void onInstallReferrerServiceDisconnected() {}
  
  public void onInstallReferrerSetupFinished(int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if ((paramInt == 0) || (paramInt == 2)) {}
    try
    {
      InstallReferrerUtil.access$000();
    }
    finally
    {
      try
      {
        Object localObject = val$referrerClient.getInstallReferrer();
        localObject = ((ReferrerDetails)localObject).getInstallReferrer();
        if ((localObject != null) && ((((String)localObject).contains("fb")) || (((String)localObject).contains("facebook")))) {
          val$callback.onReceiveReferrerUrl((String)localObject);
        }
        InstallReferrerUtil.access$000();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
      localThrowable = finally;
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.InstallReferrerUtil.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */