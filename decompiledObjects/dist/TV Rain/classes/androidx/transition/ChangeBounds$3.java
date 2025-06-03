package androidx.transition;

import android.graphics.PointF;
import android.util.Property;

final class ChangeBounds$3
  extends Property<ChangeBounds.ViewBounds, PointF>
{
  public ChangeBounds$3(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(ChangeBounds.ViewBounds paramViewBounds)
  {
    return null;
  }
  
  public void set(ChangeBounds.ViewBounds paramViewBounds, PointF paramPointF)
  {
    paramViewBounds.setBottomRight(paramPointF);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */