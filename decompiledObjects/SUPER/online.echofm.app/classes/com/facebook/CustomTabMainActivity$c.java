package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTabMainActivity$c
  extends BroadcastReceiver
{
  public CustomTabMainActivity$c(CustomTabMainActivity paramCustomTabMainActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramIntent, "intent");
    paramContext = new Intent(a, CustomTabMainActivity.class);
    paramContext.setAction(CustomTabMainActivity.w);
    String str = CustomTabMainActivity.u;
    paramContext.putExtra(str, paramIntent.getStringExtra(str));
    paramContext.addFlags(603979776);
    a.startActivity(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabMainActivity.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */