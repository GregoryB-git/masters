package T5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.l;

public abstract class g
{
  public static void a(Context paramContext, a parama)
  {
    Object localObject = b(paramContext);
    if (localObject != null)
    {
      localObject = l.a().computeMaximumWindowMetrics((Activity)localObject);
      parama.a(((WindowMetrics)localObject).getBounds().width(), ((WindowMetrics)localObject).getBounds().height(), getResourcesgetDisplayMetricsdensity);
    }
  }
  
  public static Activity b(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if ((paramContext instanceof Activity)) {
      return (Activity)paramContext;
    }
    if ((paramContext instanceof ContextWrapper)) {
      return b(((ContextWrapper)paramContext).getBaseContext());
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void a(float paramFloat1, float paramFloat2, float paramFloat3);
  }
}

/* Location:
 * Qualified Name:     T5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */