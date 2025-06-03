package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTabActivity$b
  extends BroadcastReceiver
{
  public CustomTabActivity$b(CustomTabActivity paramCustomTabActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramIntent, "intent");
    a.finish();
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabActivity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */