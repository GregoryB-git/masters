package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class zzcy
{
  public static final int zza;
  
  static
  {
    int i;
    if (Build.VERSION.SDK_INT >= 31) {
      i = 33554432;
    } else {
      i = 0;
    }
    zza = i;
  }
  
  public static PendingIntent zza(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2)
  {
    return PendingIntent.getBroadcast(paramContext, 0, paramIntent, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */