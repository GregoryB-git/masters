package y1;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class e$d
  extends Animation
{
  public e$d(e parame, int paramInt1, int paramInt2) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = c.mProgress;
    int i = a;
    float f = i;
    paramTransformation.setAlpha((int)((b - i) * paramFloat + f));
  }
}

/* Location:
 * Qualified Name:     y1.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */