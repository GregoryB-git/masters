package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;

final class AFf1qSDK$5
  implements InstallReferrerStateListener
{
  public AFf1qSDK$5(AFf1qSDK paramAFf1qSDK, InstallReferrerClient paramInstallReferrerClient, Context paramContext) {}
  
  public final void onInstallReferrerServiceDisconnected()
  {
    AFLogger.afDebugLog("Install Referrer service disconnected");
  }
  
  public final void onInstallReferrerSetupFinished(int paramInt)
  {
    AFf1qSDK.AFKeystoreWrapper(this$0).execute(new w(this, val$referrerClient, val$context, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1qSDK.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */