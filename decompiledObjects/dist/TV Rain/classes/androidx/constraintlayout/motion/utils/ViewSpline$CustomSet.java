package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.widget.ConstraintAttribute;

public class ViewSpline$CustomSet
  extends ViewSpline
{
  public String mAttributeName = paramString.split(",")[1];
  public SparseArray<ConstraintAttribute> mConstraintAttributeList;
  public float[] mTempValues;
  
  public ViewSpline$CustomSet(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
  {
    mConstraintAttributeList = paramSparseArray;
  }
  
  public void setPoint(int paramInt, float paramFloat)
  {
    throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
  }
  
  public void setPoint(int paramInt, ConstraintAttribute paramConstraintAttribute)
  {
    mConstraintAttributeList.append(paramInt, paramConstraintAttribute);
  }
  
  public void setProperty(View paramView, float paramFloat)
  {
    mCurveFit.getPos(paramFloat, mTempValues);
    CustomSupport.setInterpolatedValue((ConstraintAttribute)mConstraintAttributeList.valueAt(0), paramView, mTempValues);
  }
  
  public void setup(int paramInt)
  {
    int i = mConstraintAttributeList.size();
    int j = ((ConstraintAttribute)mConstraintAttributeList.valueAt(0)).numberOfInterpolatedValues();
    double[] arrayOfDouble = new double[i];
    mTempValues = new float[j];
    double[][] arrayOfDouble1 = new double[i][j];
    for (j = 0; j < i; j++)
    {
      int k = mConstraintAttributeList.keyAt(j);
      Object localObject = (ConstraintAttribute)mConstraintAttributeList.valueAt(j);
      arrayOfDouble[j] = (k * 0.01D);
      ((ConstraintAttribute)localObject).getValuesToInterpolate(mTempValues);
      for (k = 0;; k++)
      {
        localObject = mTempValues;
        if (k >= localObject.length) {
          break;
        }
        arrayOfDouble1[j][k] = localObject[k];
      }
    }
    mCurveFit = CurveFit.get(paramInt, arrayOfDouble, arrayOfDouble1);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewSpline.CustomSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */