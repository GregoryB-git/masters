package com.google.android.exoplayer2.util;

import android.os.Handler.Callback;
import android.os.Looper;
import androidx.annotation.Nullable;

public abstract interface Clock
{
  public static final Clock DEFAULT = new SystemClock();
  
  public abstract HandlerWrapper createHandler(Looper paramLooper, @Nullable Handler.Callback paramCallback);
  
  public abstract long elapsedRealtime();
  
  public abstract void sleep(long paramLong);
  
  public abstract long uptimeMillis();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.Clock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */