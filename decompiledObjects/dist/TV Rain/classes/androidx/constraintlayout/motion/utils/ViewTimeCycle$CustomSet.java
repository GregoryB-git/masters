package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.widget.ConstraintAttribute;

public class ViewTimeCycle$CustomSet
  extends ViewTimeCycle
{
  public String mAttributeName = paramString.split(",")[1];
  public float[] mCache;
  public SparseArray<ConstraintAttribute> mConstraintAttributeList;
  public float[] mTempValues;
  public SparseArray<float[]> mWaveProperties = new SparseArray();
  
  public ViewTimeCycle$CustomSet(String paramString, SparseArray<ConstraintAttribute> paramSparseArray)
  {
    mConstraintAttributeList = paramSparseArray;
  }
  
  public void setPoint(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
  {
    throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
  }
  
  public void setPoint(int paramInt1, ConstraintAttribute paramConstraintAttribute, float paramFloat1, int paramInt2, float paramFloat2)
  {
    mConstraintAttributeList.append(paramInt1, paramConstraintAttribute);
    mWaveProperties.append(paramInt1, new float[] { paramFloat1, paramFloat2 });
    mWaveShape = Math.max(mWaveShape, paramInt2);
  }
  
  public boolean setProperty(View paramView, float paramFloat, long paramLong, KeyCache paramKeyCache)
  {
    mCurveFit.getPos(paramFloat, mTempValues);
    float[] arrayOfFloat = mTempValues;
    float f1 = arrayOfFloat[(arrayOfFloat.length - 2)];
    paramFloat = arrayOfFloat[(arrayOfFloat.length - 1)];
    long l = last_time;
    if (Float.isNaN(last_cycle))
    {
      f2 = paramKeyCache.getFloatValue(paramView, mAttributeName, 0);
      last_cycle = f2;
      if (Float.isNaN(f2)) {
        last_cycle = 0.0F;
      }
    }
    double d = last_cycle;
    float f2 = (float)(((paramLong - l) * 1.0E-9D * f1 + d) % 1.0D);
    last_cycle = f2;
    last_time = paramLong;
    f2 = calcWave(f2);
    mContinue = false;
    for (int i = 0;; i++)
    {
      paramKeyCache = mCache;
      if (i >= paramKeyCache.length) {
        break;
      }
      boolean bool1 = mContinue;
      float f3 = mTempValues[i];
      boolean bool2;
      if (f3 != 0.0D) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mContinue = (bool1 | bool2);
      paramKeyCache[i] = (f3 * f2 + paramFloat);
    }
    CustomSupport.setInterpolatedValue((ConstraintAttribute)mConstraintAttributeList.valueAt(0), paramView, mCache);
    if (f1 != 0.0F) {
      mContinue = true;
    }
    return mContinue;
  }
  
  public void setup(int paramInt)
  {
    int i = mConstraintAttributeList.size();
    int j = ((ConstraintAttribute)mConstraintAttributeList.valueAt(0)).numberOfInterpolatedValues();
    double[] arrayOfDouble = new double[i];
    int k = j + 2;
    mTempValues = new float[k];
    mCache = new float[j];
    double[][] arrayOfDouble1 = new double[i][k];
    for (k = 0; k < i; k++)
    {
      int m = mConstraintAttributeList.keyAt(k);
      Object localObject = (ConstraintAttribute)mConstraintAttributeList.valueAt(k);
      float[] arrayOfFloat = (float[])mWaveProperties.valueAt(k);
      arrayOfDouble[k] = (m * 0.01D);
      ((ConstraintAttribute)localObject).getValuesToInterpolate(mTempValues);
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
 * Qualified Name:     androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */