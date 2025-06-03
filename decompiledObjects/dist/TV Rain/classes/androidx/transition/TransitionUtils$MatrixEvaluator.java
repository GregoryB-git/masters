package androidx.transition;

import a;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;

class TransitionUtils$MatrixEvaluator
  implements TypeEvaluator<Matrix>
{
  public final float[] mTempEndValues = new float[9];
  public final Matrix mTempMatrix = new Matrix();
  public final float[] mTempStartValues = new float[9];
  
  public Matrix evaluate(float paramFloat, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    paramMatrix1.getValues(mTempStartValues);
    paramMatrix2.getValues(mTempEndValues);
    for (int i = 0; i < 9; i++)
    {
      paramMatrix1 = mTempEndValues;
      float f1 = paramMatrix1[i];
      float f2 = mTempStartValues[i];
      paramMatrix1[i] = a.a(f1, f2, paramFloat, f2);
    }
    mTempMatrix.setValues(mTempEndValues);
    return mTempMatrix;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionUtils.MatrixEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */