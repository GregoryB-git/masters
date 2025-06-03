package F;

import android.os.Handler;
import android.os.Looper;

public abstract class b
{
  public static Handler a()
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
 * Qualified Name:     F.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */