package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

public class zau
  extends Handler
{
  private final Looper zaa = Looper.getMainLooper();
  
  public zau() {}
  
  public zau(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public zau(Looper paramLooper, Handler.Callback paramCallback)
  {
    super(paramLooper, paramCallback);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.base.zau
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */