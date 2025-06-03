package androidx.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

class ChangeTransform$PathAnimatorMatrix
{
  private final Matrix mMatrix = new Matrix();
  private float mTranslationX;
  private float mTranslationY;
  private final float[] mValues;
  private final View mView;
  
  public ChangeTransform$PathAnimatorMatrix(View paramView, float[] paramArrayOfFloat)
  {
    mView = paramView;
    paramView = (float[])paramArrayOfFloat.clone();
    mValues = paramView;
    mTranslationX = paramView[2];
    mTranslationY = paramView[5];
    setAnimationMatrix();
  }
  
  private void setAnimationMatrix()
  {
    float[] arrayOfFloat = mValues;
    arrayOfFloat[2] = mTranslationX;
    arrayOfFloat[5] = mTranslationY;
    mMatrix.setValues(arrayOfFloat);
    ViewUtils.setAnimationMatrix(mView, mMatrix);
  }
  
  public Matrix getMatrix()
  {
    return mMatrix;
  }
  
  public void setTranslation(PointF paramPointF)
  {
    mTranslationX = x;
    mTranslationY = y;
    setAnimationMatrix();
  }
  
  public void setValues(float[] paramArrayOfFloat)
  {
    System.arraycopy(paramArrayOfFloat, 0, mValues, 0, paramArrayOfFloat.length);
    setAnimationMatrix();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform.PathAnimatorMatrix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */