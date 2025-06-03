package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class ChangeBounds$5
  extends Property<View, PointF>
{
  public ChangeBounds$5(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(View paramView)
  {
    return null;
  }
  
  public void set(View paramView, PointF paramPointF)
  {
    ViewUtils.setLeftTopRightBottom(paramView, Math.round(x), Math.round(y), paramView.getRight(), paramView.getBottom());
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */