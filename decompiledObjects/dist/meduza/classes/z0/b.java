package z0;

import android.view.animation.Interpolator;

public abstract class b
  implements Interpolator
{
  public final float[] a;
  public final float b;
  
  public b(float[] paramArrayOfFloat)
  {
    a = paramArrayOfFloat;
    b = (1.0F / (paramArrayOfFloat.length - 1));
  }
  
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    float[] arrayOfFloat = a;
    int i = Math.min((int)((arrayOfFloat.length - 1) * paramFloat), arrayOfFloat.length - 2);
    float f1 = i;
    float f2 = b;
    f2 = (paramFloat - f1 * f2) / f2;
    arrayOfFloat = a;
    paramFloat = arrayOfFloat[i];
    return (arrayOfFloat[(i + 1)] - paramFloat) * f2 + paramFloat;
  }
}

/* Location:
 * Qualified Name:     z0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */