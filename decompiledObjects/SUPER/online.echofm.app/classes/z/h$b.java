package z;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class h$b
{
  public static Handler e(Handler paramHandler)
  {
    Handler localHandler = paramHandler;
    if (paramHandler == null) {
      localHandler = new Handler(Looper.getMainLooper());
    }
    return localHandler;
  }
  
  public final void c(int paramInt, Handler paramHandler)
  {
    e(paramHandler).post(new j(this, paramInt));
  }
  
  public final void d(Typeface paramTypeface, Handler paramHandler)
  {
    e(paramHandler).post(new i(this, paramTypeface));
  }
  
  public abstract void h(int paramInt);
  
  public abstract void i(Typeface paramTypeface);
}

/* Location:
 * Qualified Name:     z.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */