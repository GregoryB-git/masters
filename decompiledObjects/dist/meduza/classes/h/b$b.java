package h;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public final class b$b
  implements Drawable.Callback
{
  public Drawable.Callback a;
  
  public final void invalidateDrawable(Drawable paramDrawable) {}
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    Drawable.Callback localCallback = a;
    if (localCallback != null) {
      localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
    }
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    Drawable.Callback localCallback = a;
    if (localCallback != null) {
      localCallback.unscheduleDrawable(paramDrawable, paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     h.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */