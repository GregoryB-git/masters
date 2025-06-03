package com.google.android.gms.internal.base;

import android.os.Build.VERSION;

public final class zap
{
  public static final int zaa;
  
  static
  {
    int i;
    if (Build.VERSION.SDK_INT >= 31) {
      i = 33554432;
    } else {
      i = 0;
    }
    zaa = i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */