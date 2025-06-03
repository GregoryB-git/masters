package androidx.core.os;

import android.os.Handler;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class HandlerCompat$Api29Impl
{
  public static boolean hasCallbacks(Handler paramHandler, Runnable paramRunnable)
  {
    return e.y(paramHandler, paramRunnable);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.HandlerCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */