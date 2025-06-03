package androidx.transition;

import a;
import android.animation.TypeEvaluator;

class FloatArrayEvaluator
  implements TypeEvaluator<float[]>
{
  private float[] mArray;
  
  public FloatArrayEvaluator(float[] paramArrayOfFloat)
  {
    mArray = paramArrayOfFloat;
  }
  
  public float[] evaluate(float paramFloat, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    float[] arrayOfFloat1 = mArray;
    float[] arrayOfFloat2 = arrayOfFloat1;
    if (arrayOfFloat1 == null) {
      arrayOfFloat2 = new float[paramArrayOfFloat1.length];
    }
    for (int i = 0; i < arrayOfFloat2.length; i++)
    {
      float f = paramArrayOfFloat1[i];
      arrayOfFloat2[i] = a.a(paramArrayOfFloat2[i], f, paramFloat, f);
    }
    return arrayOfFloat2;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.FloatArrayEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */