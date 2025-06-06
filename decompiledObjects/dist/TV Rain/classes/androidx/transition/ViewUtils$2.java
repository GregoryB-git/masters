package androidx.transition;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;

final class ViewUtils$2
  extends Property<View, Rect>
{
  public ViewUtils$2(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Rect get(View paramView)
  {
    return ViewCompat.getClipBounds(paramView);
  }
  
  public void set(View paramView, Rect paramRect)
  {
    ViewCompat.setClipBounds(paramView, paramRect);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtils.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */