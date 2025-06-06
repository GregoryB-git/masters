package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class RectEvaluator
  implements TypeEvaluator<Rect>
{
  private Rect mRect;
  
  public RectEvaluator() {}
  
  public RectEvaluator(Rect paramRect)
  {
    mRect = paramRect;
  }
  
  public Rect evaluate(float paramFloat, Rect paramRect1, Rect paramRect2)
  {
    int i = left;
    i += (int)((left - i) * paramFloat);
    int j = top;
    j += (int)((top - j) * paramFloat);
    int k = right;
    k += (int)((right - k) * paramFloat);
    int m = bottom;
    m += (int)((bottom - m) * paramFloat);
    paramRect1 = mRect;
    if (paramRect1 == null) {
      return new Rect(i, j, k, m);
    }
    paramRect1.set(i, j, k, m);
    return mRect;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.RectEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */