package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class PropertyValuesHolderUtils
{
  public static PropertyValuesHolder ofPointF(Property<?, PointF> paramProperty, Path paramPath)
  {
    return PropertyValuesHolder.ofObject(paramProperty, null, paramPath);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.PropertyValuesHolderUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */