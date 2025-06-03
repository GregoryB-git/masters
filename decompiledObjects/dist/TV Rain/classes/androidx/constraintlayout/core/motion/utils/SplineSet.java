package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import z2;

public abstract class SplineSet
{
  private static final String TAG = "SplineSet";
  private int count;
  public CurveFit mCurveFit;
  public int[] mTimePoints = new int[10];
  private String mType;
  public float[] mValues = new float[10];
  
  public static SplineSet makeCustomSpline(String paramString, KeyFrameArray.CustomArray paramCustomArray)
  {
    return new CustomSet(paramString, paramCustomArray);
  }
  
  public static SplineSet makeCustomSplineSet(String paramString, KeyFrameArray.CustomVar paramCustomVar)
  {
    return new CustomSpline(paramString, paramCustomVar);
  }
  
  public static SplineSet makeSpline(String paramString, long paramLong)
  {
    return new CoreSpline(paramString, paramLong);
  }
  
  public float get(float paramFloat)
  {
    return (float)mCurveFit.getPos(paramFloat, 0);
  }
  
  public CurveFit getCurveFit()
  {
    return mCurveFit;
  }
  
  public float getSlope(float paramFloat)
  {
    return (float)mCurveFit.getSlope(paramFloat, 0);
  }
  
  public void setPoint(int paramInt, float paramFloat)
  {
    Object localObject = mTimePoints;
    if (localObject.length < count + 1)
    {
      mTimePoints = Arrays.copyOf((int[])localObject, localObject.length * 2);
      localObject = mValues;
      mValues = Arrays.copyOf((float[])localObject, localObject.length * 2);
    }
    localObject = mTimePoints;
    int i = count;
    localObject[i] = paramInt;
    mValues[i] = paramFloat;
    count = (i + 1);
  }
  
  public void setProperty(TypedValues paramTypedValues, float paramFloat)
  {
    paramTypedValues.setValue(TypedValues.AttributesType.getId(mType), get(paramFloat));
  }
  
  public void setType(String paramString)
  {
    mType = paramString;
  }
  
  public void setup(int paramInt)
  {
    int i = count;
    if (i == 0) {
      return;
    }
    Sort.doubleQuickSort(mTimePoints, mValues, 0, i - 1);
    i = 1;
    int[] arrayOfInt;
    for (int j = i; i < count; j = k)
    {
      arrayOfInt = mTimePoints;
      k = j;
      if (arrayOfInt[(i - 1)] != arrayOfInt[i]) {
        k = j + 1;
      }
      i++;
    }
    double[] arrayOfDouble = new double[j];
    double[][] arrayOfDouble1 = new double[j][1];
    i = 0;
    int k = i;
    while (i < count)
    {
      if (i > 0)
      {
        arrayOfInt = mTimePoints;
        if (arrayOfInt[i] == arrayOfInt[(i - 1)]) {}
      }
      else
      {
        arrayOfDouble[k] = (mTimePoints[i] * 0.01D);
        arrayOfDouble1[k][0] = mValues[i];
        k++;
      }
      i++;
    }
    mCurveFit = CurveFit.get(paramInt, arrayOfDouble, arrayOfDouble1);
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
  
  public static class CoreSpline
    extends SplineSet
  {
    public long start;
    public String type;
    
    public CoreSpline(String paramString, long paramLong)
    {
      type = paramString;
      start = paramLong;
    }
    
    public void setProperty(TypedValues paramTypedValues, float paramFloat)
    {
      paramTypedValues.setValue(paramTypedValues.getId(type), get(paramFloat));
    }
  }
  
  public static class CustomSet
    extends SplineSet
  {
    public String mAttributeName = paramString.split(",")[1];
    public KeyFrameArray.CustomArray mConstraintAttributeList;
    public float[] mTempValues;
    
    public CustomSet(String paramString, KeyFrameArray.CustomArray paramCustomArray)
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
  
  public static class CustomSpline
    extends SplineSet
  {
    public String mAttributeName = paramString.split(",")[1];
    public KeyFrameArray.CustomVar mConstraintAttributeList;
    public float[] mTempValues;
    
    public CustomSpline(String paramString, KeyFrameArray.CustomVar paramCustomVar)
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
  
  public static class Sort
  {
    public static void doubleQuickSort(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
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
    
    private static int partition(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
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
    
    private static void swap(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
    {
      int i = paramArrayOfInt[paramInt1];
      paramArrayOfInt[paramInt1] = paramArrayOfInt[paramInt2];
      paramArrayOfInt[paramInt2] = i;
      float f = paramArrayOfFloat[paramInt1];
      paramArrayOfFloat[paramInt1] = paramArrayOfFloat[paramInt2];
      paramArrayOfFloat[paramInt2] = f;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */