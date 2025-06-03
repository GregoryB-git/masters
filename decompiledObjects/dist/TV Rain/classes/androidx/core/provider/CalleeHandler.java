package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

class CalleeHandler
{
  @NonNull
  public static Handler create()
  {
    Handler localHandler;
    if (Looper.myLooper() == null) {
      localHandler = new Handler(Looper.getMainLooper());
    } else {
      localHandler = new Handler();
    }
    return localHandler;
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.CalleeHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */