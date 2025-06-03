package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;

public class TimeCycleSplineSet$CustomVarSet
  extends TimeCycleSplineSet
{
  public String mAttributeName = paramString.split(",")[1];
  public float[] mCache;
  public KeyFrameArray.CustomVar mConstraintAttributeList;
  public float[] mTempValues;
  public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();
  
  public TimeCycleSplineSet$CustomVarSet(String paramString, KeyFrameArray.CustomVar paramCustomVar)
  {
    mConstraintAttributeList = paramCustomVar;
  }
  
  public void setPoint(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
  {
    throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
  }
  
  public void setPoint(int paramInt1, CustomVariable paramCustomVariable, float paramFloat1, int paramInt2, float paramFloat2)
  {
    mConstraintAttributeList.append(paramInt1, paramCustomVariable);
    mWaveProperties.append(paramInt1, new float[] { paramFloat1, paramFloat2 });
    mWaveShape = Math.max(mWaveShape, paramInt2);
  }
  
  public boolean setProperty(MotionWidget paramMotionWidget, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    mCurveFit.getPos(paramFloat, mTempValues);
    float[] arrayOfFloat = mTempValues;
    paramFloat = arrayOfFloat[(arrayOfFloat.length - 2)];
    float f1 = arrayOfFloat[(arrayOfFloat.length - 1)];
    long l = last_time;
    if (Float.isNaN(last_cycle))
    {
      f2 = paramKeyCache.getFloatValue(paramMotionWidget, mAttributeName, 0);
      last_cycle = f2;
      if (Float.isNaN(f2)) {
        last_cycle = 0.0F;
      }
    }
    double d = last_cycle;
    float f2 = (float)(((paramLong - l) * 1.0E-9D * paramFloat + d) % 1.0D);
    last_cycle = f2;
    last_time = paramLong;
    float f3 = calcWave(f2);
    mContinue = false;
    for (int i = 0;; i++)
    {
      paramKeyCache = mCache;
      if (i >= paramKeyCache.length) {
        break;
      }
      boolean bool1 = mContinue;
      f2 = mTempValues[i];
      boolean bool2;
      if (f2 != 0.0D) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mContinue = (bool1 | bool2);
      paramKeyCache[i] = (f2 * f3 + f1);
    }
    mConstraintAttributeList.valueAt(0).setInterpolatedValue(paramMotionWidget, mCache);
    if (paramFloat != 0.0F) {
      mContinue = true;
    }
    return mContinue;
  }
  
  public void setup(int paramInt)
  {
    int i = mConstraintAttributeList.size();
    int j = mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
    double[] arrayOfDouble = new double[i];
    int k = j + 2;
    mTempValues = new float[k];
    mCache = new float[j];
    double[][] arrayOfDouble1 = new double[i][k];
    for (k = 0; k < i; k++)
    {
      int m = mConstraintAttributeList.keyAt(k);
      Object localObject = mConstraintAttributeList.valueAt(k);
      float[] arrayOfFloat = mWaveProperties.valueAt(k);
      arrayOfDouble[k] = (m * 0.01D);
      ((CustomVariable)localObject).getValuesToInterpolate(mTempValues);
      for (m = 0;; m++)
      {
        localObject = mTempValues;
        if (m >= localObject.length) {
          break;
        }
        arrayOfDouble1[k][m] = localObject[m];
      }
      localObject = arrayOfDouble1[k];
      localObject[j] = arrayOfFloat[0];
      localObject[(j + 1)] = arrayOfFloat[1];
    }
    mCurveFit = CurveFit.get(paramInt, arrayOfDouble, arrayOfDouble1);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */