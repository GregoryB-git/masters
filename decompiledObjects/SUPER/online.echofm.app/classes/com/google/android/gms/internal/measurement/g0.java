package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public abstract class g0
{
  public static final int a;
  public static final int b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    a = 67108864;
    if (i >= 31) {
      i = 33554432;
    } else {
      i = 0;
    }
    b = i;
  }
  
  public static PendingIntent a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2)
  {
    return PendingIntent.getBroadcast(paramContext, 0, paramIntent, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */