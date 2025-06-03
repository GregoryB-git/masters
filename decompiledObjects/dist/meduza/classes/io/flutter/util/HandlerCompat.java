package io.flutter.util;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.b;

public final class HandlerCompat
{
  public static Handler createAsyncHandler(Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return b.e(paramLooper);
    }
    return new Handler(paramLooper);
  }
}

/* Location:
 * Qualified Name:     io.flutter.util.HandlerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */