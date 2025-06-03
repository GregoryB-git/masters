package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class ChangeBounds$4
  extends Property<View, PointF>
{
  public ChangeBounds$4(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(View paramView)
  {
    return null;
  }
  
  public void set(View paramView, PointF paramPointF)
  {
    ViewUtils.setLeftTopRightBottom(paramView, paramView.getLeft(), paramView.getTop(), Math.round(x), Math.round(y));
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */