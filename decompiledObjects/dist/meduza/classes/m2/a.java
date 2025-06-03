package m2;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;
import e0.s0;
import ec.i;
import i2.l;

public final class a
{
  public static final a a = new a();
  
  public static Rect a(Context paramContext)
  {
    i.e(paramContext, "context");
    paramContext = ((WindowManager)paramContext.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    i.d(paramContext, "wm.currentWindowMetrics.bounds");
    return paramContext;
  }
  
  public static l c(Context paramContext)
  {
    i.e(paramContext, "context");
    Object localObject = (WindowManager)paramContext.getSystemService(WindowManager.class);
    paramContext = s0.c(((WindowManager)localObject).getCurrentWindowMetrics().getWindowInsets(), null);
    localObject = ((WindowManager)localObject).getCurrentWindowMetrics().getBounds();
    i.d(localObject, "wm.currentWindowMetrics.bounds");
    return new l((Rect)localObject, paramContext);
  }
  
  public static Rect d(Context paramContext)
  {
    paramContext = ((WindowManager)paramContext.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
    i.d(paramContext, "wm.maximumWindowMetrics.bounds");
    return paramContext;
  }
  
  public final s0 b(Context paramContext)
  {
    i.e(paramContext, "context");
    paramContext = ((WindowManager)paramContext.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
    i.d(paramContext, "context.getSystemService…indowMetrics.windowInsets");
    return s0.c(paramContext, null);
  }
}

/* Location:
 * Qualified Name:     m2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */