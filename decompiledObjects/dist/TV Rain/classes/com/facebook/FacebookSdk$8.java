package com.facebook;

import android.content.Context;
import com.facebook.appevents.AppEventsLogger;
import java.util.concurrent.Callable;

final class FacebookSdk$8
  implements Callable<Void>
{
  public FacebookSdk$8(FacebookSdk.InitializeCallback paramInitializeCallback, Context paramContext) {}
  
  public Void call()
    throws Exception
  {
    AccessTokenManager.getInstance().loadCurrentAccessToken();
    ProfileManager.getInstance().loadCurrentProfile();
    if ((AccessToken.isCurrentAccessTokenActive()) && (Profile.getCurrentProfile() == null)) {
      Profile.fetchProfileForCurrentAccessToken();
    }
    FacebookSdk.InitializeCallback localInitializeCallback = val$callback;
    if (localInitializeCallback != null) {
      localInitializeCallback.onInitialized();
    }
    AppEventsLogger.initializeLib(FacebookSdk.access$000(), FacebookSdk.access$100());
    UserSettingsManager.logIfAutoAppLinkEnabled();
    AppEventsLogger.newLogger(val$applicationContext.getApplicationContext()).flush();
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */