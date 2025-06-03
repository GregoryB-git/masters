package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.commons.InstallReferrerCommons;
import r2.a.a;

public final class InstallReferrerClientImpl$b
  implements ServiceConnection
{
  public final InstallReferrerStateListener a;
  
  public InstallReferrerClientImpl$b(InstallReferrerClientImpl paramInstallReferrerClientImpl, InstallReferrerStateListener paramInstallReferrerStateListener)
  {
    if (paramInstallReferrerStateListener != null)
    {
      a = paramInstallReferrerStateListener;
      return;
    }
    throw new RuntimeException("Please specify a listener to know when setup is done.");
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
    InstallReferrerClientImpl.a(b, a.a.n(paramIBinder));
    InstallReferrerClientImpl.b(b, 2);
    a.onInstallReferrerSetupFinished(0);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
    InstallReferrerClientImpl.a(b, null);
    InstallReferrerClientImpl.b(b, 0);
    a.onInstallReferrerServiceDisconnected();
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClientImpl.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */