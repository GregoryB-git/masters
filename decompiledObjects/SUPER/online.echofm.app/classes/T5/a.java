package T5;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import m.b;

public abstract class a
{
  public static Handler a(Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return b.a(paramLooper);
    }
    return new Handler(paramLooper);
  }
}

/* Location:
 * Qualified Name:     T5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */