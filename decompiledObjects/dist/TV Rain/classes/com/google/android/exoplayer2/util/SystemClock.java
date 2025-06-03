package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import androidx.annotation.Nullable;

final class SystemClock
  implements Clock
{
  public HandlerWrapper createHandler(Looper paramLooper, @Nullable Handler.Callback paramCallback)
  {
    return new SystemHandlerWrapper(new Handler(paramLooper, paramCallback));
  }
  
  public long elapsedRealtime()
  {
    return android.os.SystemClock.elapsedRealtime();
  }
  
  public void sleep(long paramLong)
  {
    android.os.SystemClock.sleep(paramLong);
  }
  
  public long uptimeMillis()
  {
    return android.os.SystemClock.uptimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.SystemClock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */