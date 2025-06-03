package w;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class f$e
{
  public final void a()
  {
    new Handler(Looper.getMainLooper()).post(new h(this));
  }
  
  public final void b(Typeface paramTypeface)
  {
    new Handler(Looper.getMainLooper()).post(new g(0, this, paramTypeface));
  }
  
  public abstract void c(Typeface paramTypeface);
}

/* Location:
 * Qualified Name:     w.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */