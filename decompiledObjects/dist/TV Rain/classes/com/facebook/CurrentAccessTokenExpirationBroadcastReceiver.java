package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CurrentAccessTokenExpirationBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(paramIntent.getAction())) && (FacebookSdk.isInitialized())) {
      AccessTokenManager.getInstance().currentAccessTokenChanged();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.CurrentAccessTokenExpirationBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */