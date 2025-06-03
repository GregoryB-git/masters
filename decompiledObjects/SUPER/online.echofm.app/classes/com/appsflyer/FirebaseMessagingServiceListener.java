package com.appsflyer;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener
  extends FirebaseMessagingService
{
  public void onNewToken(String paramString)
  {
    AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.FirebaseMessagingServiceListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */