package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

public class zzh
  extends Handler
{
  private final Looper zza = Looper.getMainLooper();
  
  public zzh() {}
  
  public zzh(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public zzh(Looper paramLooper, Handler.Callback paramCallback)
  {
    super(paramLooper, paramCallback);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */