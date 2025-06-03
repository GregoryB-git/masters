package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class ObjectAnimatorUtils
{
  public static <T> ObjectAnimator ofPointF(T paramT, Property<T, PointF> paramProperty, Path paramPath)
  {
    return ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ObjectAnimatorUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */