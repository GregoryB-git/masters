package com.google.ads.interactivemedia.v3.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class m
  extends BroadcastReceiver
{
  public m(n paramn) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
    {
      n.a(a, true);
      return;
    }
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction()))
    {
      n.a(a, false);
      return;
    }
    if ("android.intent.action.SCREEN_ON".equals(paramIntent.getAction()))
    {
      paramContext = (KeyguardManager)paramContext.getSystemService("keyguard");
      if ((paramContext != null) && (!paramContext.inKeyguardRestrictedInputMode())) {
        n.a(a, false);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */