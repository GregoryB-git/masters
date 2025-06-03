package h;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public class b$b
  implements Drawable.Callback
{
  public Drawable.Callback o;
  
  public Drawable.Callback a()
  {
    Drawable.Callback localCallback = o;
    o = null;
    return localCallback;
  }
  
  public b b(Drawable.Callback paramCallback)
  {
    o = paramCallback;
    return this;
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {}
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    Drawable.Callback localCallback = o;
    if (localCallback != null) {
      localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
    }
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    Drawable.Callback localCallback = o;
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