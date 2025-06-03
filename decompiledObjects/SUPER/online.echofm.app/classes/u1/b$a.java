package u1;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public class b$a
  implements Drawable.Callback
{
  public b$a(b paramb) {}
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    o.invalidateSelf();
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    o.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    o.unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     u1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */