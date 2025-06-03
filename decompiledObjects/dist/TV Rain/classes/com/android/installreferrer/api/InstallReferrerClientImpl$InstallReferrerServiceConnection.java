package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService.Stub;

final class InstallReferrerClientImpl$InstallReferrerServiceConnection
  implements ServiceConnection
{
  private final InstallReferrerStateListener mListener;
  
  private InstallReferrerClientImpl$InstallReferrerServiceConnection(InstallReferrerClientImpl paramInstallReferrerClientImpl, InstallReferrerStateListener paramInstallReferrerStateListener)
  {
    if (paramInstallReferrerStateListener != null)
    {
      mListener = paramInstallReferrerStateListener;
      return;
    }
    throw new RuntimeException("Please specify a listener to know when setup is done.");
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
    InstallReferrerClientImpl.access$102(this$0, IGetInstallReferrerService.Stub.b(paramIBinder));
    InstallReferrerClientImpl.access$202(this$0, 2);
    mListener.onInstallReferrerSetupFinished(0);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
    InstallReferrerClientImpl.access$102(this$0, null);
    InstallReferrerClientImpl.access$202(this$0, 0);
    mListener.onInstallReferrerServiceDisconnected();
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */