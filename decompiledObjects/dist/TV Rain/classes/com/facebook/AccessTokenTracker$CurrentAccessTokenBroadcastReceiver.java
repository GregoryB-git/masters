package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.Utility;

class AccessTokenTracker$CurrentAccessTokenBroadcastReceiver
  extends BroadcastReceiver
{
  private AccessTokenTracker$CurrentAccessTokenBroadcastReceiver(AccessTokenTracker paramAccessTokenTracker) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(paramIntent.getAction()))
    {
      Utility.logd(AccessTokenTracker.access$100(), "AccessTokenChanged");
      paramContext = (AccessToken)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
      paramIntent = (AccessToken)paramIntent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
      this$0.onCurrentAccessTokenChanged(paramContext, paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenTracker.CurrentAccessTokenBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */