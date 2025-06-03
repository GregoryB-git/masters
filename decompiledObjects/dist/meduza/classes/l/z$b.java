package l;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class z$b
{
  public static void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
}

/* Location:
 * Qualified Name:     l.z.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */