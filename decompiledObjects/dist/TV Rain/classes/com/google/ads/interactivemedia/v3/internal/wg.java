package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

final class wg
  implements vh
{
  public final long a()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public final vo a(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new vo(new Handler(paramLooper, paramCallback));
  }
  
  public final long b()
  {
    return SystemClock.uptimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */