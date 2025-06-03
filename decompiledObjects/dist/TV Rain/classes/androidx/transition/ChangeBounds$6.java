package androidx.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class ChangeBounds$6
  extends Property<View, PointF>
{
  public ChangeBounds$6(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(View paramView)
  {
    return null;
  }
  
  public void set(View paramView, PointF paramPointF)
  {
    int i = Math.round(x);
    int j = Math.round(y);
    ViewUtils.setLeftTopRightBottom(paramView, i, j, paramView.getWidth() + i, paramView.getHeight() + j);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */