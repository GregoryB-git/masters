package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;

public class SplineSet$CustomSpline
  extends SplineSet
{
  public String mAttributeName = paramString.split(",")[1];
  public KeyFrameArray.CustomVar mConstraintAttributeList;
  public float[] mTempValues;
  
  public SplineSet$CustomSpline(String paramString, KeyFrameArray.CustomVar paramCustomVar)
  {
    mConstraintAttributeList = paramCustomVar;
  }
  
  public void setPoint(int paramInt, float paramFloat)
  {
    throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
  }
  
  public void setPoint(int paramInt, CustomVariable paramCustomVariable)
  {
    mConstraintAttributeList.append(paramInt, paramCustomVariable);
  }
  
  public void setProperty(MotionWidget paramMotionWidget, float paramFloat)
  {
    mCurveFit.getPos(paramFloat, mTempValues);
    mConstraintAttributeList.valueAt(0).setInterpolatedValue(paramMotionWidget, mTempValues);
  }
  
  public void setProperty(TypedValues paramTypedValues, float paramFloat)
  {
    setProperty((MotionWidget)paramTypedValues, paramFloat);
  }
  
  public void setup(int paramInt)
  {
    int i = mConstraintAttributeList.size();
    int j = mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
    double[] arrayOfDouble = new double[i];
    mTempValues = new float[j];
    double[][] arrayOfDouble1 = new double[i][j];
    for (j = 0; j < i; j++)
    {
      int k = mConstraintAttributeList.keyAt(j);
      Object localObject = mConstraintAttributeList.valueAt(j);
      arrayOfDouble[j] = (k * 0.01D);
      ((CustomVariable)localObject).getValuesToInterpolate(mTempValues);
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
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */