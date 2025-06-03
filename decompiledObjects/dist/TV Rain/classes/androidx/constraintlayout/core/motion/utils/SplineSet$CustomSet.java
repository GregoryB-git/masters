package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.state.WidgetFrame;

public class SplineSet$CustomSet
  extends SplineSet
{
  public String mAttributeName = paramString.split(",")[1];
  public KeyFrameArray.CustomArray mConstraintAttributeList;
  public float[] mTempValues;
  
  public SplineSet$CustomSet(String paramString, KeyFrameArray.CustomArray paramCustomArray)
  {
    mConstraintAttributeList = paramCustomArray;
  }
  
  public void setPoint(int paramInt, float paramFloat)
  {
    throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
  }
  
  public void setPoint(int paramInt, CustomAttribute paramCustomAttribute)
  {
    mConstraintAttributeList.append(paramInt, paramCustomAttribute);
  }
  
  public void setProperty(WidgetFrame paramWidgetFrame, float paramFloat)
  {
    mCurveFit.getPos(paramFloat, mTempValues);
    paramWidgetFrame.setCustomValue(mConstraintAttributeList.valueAt(0), mTempValues);
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
      ((CustomAttribute)localObject).getValuesToInterpolate(mTempValues);
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
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet.CustomSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */