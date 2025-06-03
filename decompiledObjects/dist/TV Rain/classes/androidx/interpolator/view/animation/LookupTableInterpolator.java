package androidx.interpolator.view.animation;

import a;
import android.view.animation.Interpolator;

abstract class LookupTableInterpolator
  implements Interpolator
{
  private final float mStepSize;
  private final float[] mValues;
  
  public LookupTableInterpolator(float[] paramArrayOfFloat)
  {
    mValues = paramArrayOfFloat;
    mStepSize = (1.0F / (paramArrayOfFloat.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    float[] arrayOfFloat = mValues;
    int i = Math.min((int)((arrayOfFloat.length - 1) * paramFloat), arrayOfFloat.length - 2);
    float f1 = i;
    float f2 = mStepSize;
    paramFloat = (paramFloat - f1 * f2) / f2;
    arrayOfFloat = mValues;
    f1 = arrayOfFloat[i];
    return a.a(arrayOfFloat[(i + 1)], f1, paramFloat, f1);
  }
}

/* Location:
 * Qualified Name:     androidx.interpolator.view.animation.LookupTableInterpolator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */