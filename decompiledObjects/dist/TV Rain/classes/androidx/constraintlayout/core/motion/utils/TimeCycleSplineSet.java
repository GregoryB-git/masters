package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.Format;
import z2;

public abstract class TimeCycleSplineSet
{
  public static final int CURVE_OFFSET = 2;
  public static final int CURVE_PERIOD = 1;
  public static final int CURVE_VALUE = 0;
  private static final String TAG = "SplineSet";
  public static float VAL_2PI = 6.2831855F;
  public int count;
  public float last_cycle = NaN.0F;
  public long last_time;
  public float[] mCache = new float[3];
  public boolean mContinue = false;
  public CurveFit mCurveFit;
  public int[] mTimePoints = new int[10];
  public String mType;
  public float[][] mValues = new float[10][3];
  public int mWaveShape = 0;
  
  public float calcWave(float paramFloat)
  {
    switch (mWaveShape)
    {
    default: 
      return (float)Math.sin(paramFloat * VAL_2PI);
    case 6: 
      paramFloat = 1.0F - Math.abs(paramFloat * 4.0F % 4.0F - 2.0F);
      paramFloat *= paramFloat;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return 1.0F - paramFloat;
        return (float)Math.cos(paramFloat * VAL_2PI);
        paramFloat = (paramFloat * 2.0F + 1.0F) % 2.0F;
        continue;
        return (paramFloat * 2.0F + 1.0F) % 2.0F - 1.0F;
        paramFloat = Math.abs(paramFloat);
      }
    }
    return Math.signum(paramFloat * VAL_2PI);
  }
  
  public CurveFit getCurveFit()
  {
    return mCurveFit;
  }
  
  public void setPoint(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
  {
    Object localObject = mTimePoints;
    int i = count;
    localObject[i] = paramInt1;
    localObject = mValues[i];
    localObject[0] = paramFloat1;
    localObject[1] = paramFloat2;
    localObject[2] = paramFloat3;
    mWaveShape = Math.max(mWaveShape, paramInt2);
    count += 1;
  }
  
  public void setStartTime(long paramLong)
  {
    last_time = paramLong;
  }
  
  public void setType(String paramString)
  {
    mType = paramString;
  }
  
  public void setup(int paramInt)
  {
    int i = count;
    if (i == 0)
    {
      localObject1 = System.err;
      localObject2 = z2.t("Error no points added to ");
      ((StringBuilder)localObject2).append(mType);
      ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
      return;
    }
    Sort.doubleQuickSort(mTimePoints, mValues, 0, i - 1);
    int j = 1;
    int k;
    for (i = 0;; i = k)
    {
      localObject1 = mTimePoints;
      if (j >= localObject1.length) {
        break;
      }
      k = i;
      if (localObject1[j] != localObject1[(j - 1)]) {
        k = i + 1;
      }
      j++;
    }
    j = i;
    if (i == 0) {
      j = 1;
    }
    Object localObject1 = new double[j];
    Object localObject2 = new double[j][3];
    i = 0;
    j = i;
    while (i < count)
    {
      Object localObject3;
      if (i > 0)
      {
        localObject3 = mTimePoints;
        if (localObject3[i] == localObject3[(i - 1)]) {}
      }
      else
      {
        localObject1[j] = (mTimePoints[i] * 0.01D);
        Object localObject4 = localObject2[j];
        localObject3 = mValues[i];
        localObject4[0] = localObject3[0];
        localObject4[1] = localObject3[1];
        localObject4[2] = localObject3[2];
        j++;
      }
      i++;
    }
    mCurveFit = CurveFit.get(paramInt, (double[])localObject1, (double[][])localObject2);
  }
  
  public String toString()
  {
    Object localObject = mType;
    DecimalFormat localDecimalFormat = new DecimalFormat("##.##");
    for (int i = 0; i < count; i++)
    {
      localObject = z2.u((String)localObject, "[");
      ((StringBuilder)localObject).append(mTimePoints[i]);
      ((StringBuilder)localObject).append(" , ");
      ((StringBuilder)localObject).append(localDecimalFormat.format(mValues[i]));
      ((StringBuilder)localObject).append("] ");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static class CustomSet
    extends TimeCycleSplineSet
  {
    public String mAttributeName = paramString.split(",")[1];
    public float[] mCache;
    public KeyFrameArray.CustomArray mConstraintAttributeList;
    public float[] mTempValues;
    public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();
    
    public CustomSet(String paramString, KeyFrameArray.CustomArray paramCustomArray)
    {
      mConstraintAttributeList = paramCustomArray;
    }
    
    public void setPoint(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, float paramFloat3)
    {
      throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }
    
    public void setPoint(int paramInt1, CustomAttribute paramCustomAttribute, float paramFloat1, int paramInt2, float paramFloat2)
    {
      mConstraintAttributeList.append(paramInt1, paramCustomAttribute);
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
        paramKeyCache[i] = (f3 * f2 + f1);
      }
      paramMotionWidget.setInterpolatedValue(mConstraintAttributeList.valueAt(0), mCache);
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
        ((CustomAttribute)localObject).getValuesToInterpolate(mTempValues);
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
  
  public static class CustomVarSet
    extends TimeCycleSplineSet
  {
    public String mAttributeName = paramString.split(",")[1];
    public float[] mCache;
    public KeyFrameArray.CustomVar mConstraintAttributeList;
    public float[] mTempValues;
    public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();
    
    public CustomVarSet(String paramString, KeyFrameArray.CustomVar paramCustomVar)
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
  
  public static class Sort
  {
    public static void doubleQuickSort(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
    {
      int[] arrayOfInt = new int[paramArrayOfInt.length + 10];
      arrayOfInt[0] = paramInt2;
      arrayOfInt[1] = paramInt1;
      paramInt1 = 2;
      while (paramInt1 > 0)
      {
        paramInt1--;
        int i = arrayOfInt[paramInt1];
        paramInt2 = paramInt1 - 1;
        int j = arrayOfInt[paramInt2];
        paramInt1 = paramInt2;
        if (i < j)
        {
          int k = partition(paramArrayOfInt, paramArrayOfFloat, i, j);
          int m = paramInt2 + 1;
          arrayOfInt[paramInt2] = (k - 1);
          paramInt1 = m + 1;
          arrayOfInt[m] = i;
          paramInt2 = paramInt1 + 1;
          arrayOfInt[paramInt1] = j;
          paramInt1 = paramInt2 + 1;
          arrayOfInt[paramInt2] = (k + 1);
        }
      }
    }
    
    private static int partition(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
    {
      int i = paramArrayOfInt[paramInt2];
      int k;
      for (int j = paramInt1; paramInt1 < paramInt2; j = k)
      {
        k = j;
        if (paramArrayOfInt[paramInt1] <= i)
        {
          swap(paramArrayOfInt, paramArrayOfFloat, j, paramInt1);
          k = j + 1;
        }
        paramInt1++;
      }
      swap(paramArrayOfInt, paramArrayOfFloat, j, paramInt2);
      return j;
    }
    
    private static void swap(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
    {
      int i = paramArrayOfInt[paramInt1];
      paramArrayOfInt[paramInt1] = paramArrayOfInt[paramInt2];
      paramArrayOfInt[paramInt2] = i;
      paramArrayOfInt = paramArrayOfFloat[paramInt1];
      paramArrayOfFloat[paramInt1] = paramArrayOfFloat[paramInt2];
      paramArrayOfFloat[paramInt2] = paramArrayOfInt;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */