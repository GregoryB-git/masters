package androidx.customview.widget;

import android.view.animation.Interpolator;

class ViewDragHelper$1
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    paramFloat -= 1.0F;
    return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat + 1.0F;
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.ViewDragHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */