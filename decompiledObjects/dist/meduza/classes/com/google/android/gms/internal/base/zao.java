package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class zao
  extends v.a
{
  @ResultIgnorabilityUnspecified
  @Deprecated
  public static Intent zaa(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    if (zan.zaa())
    {
      int i;
      if (true != zan.zaa()) {
        i = 0;
      } else {
        i = 2;
      }
      return a.i(paramContext, paramBroadcastReceiver, paramIntentFilter, i);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */