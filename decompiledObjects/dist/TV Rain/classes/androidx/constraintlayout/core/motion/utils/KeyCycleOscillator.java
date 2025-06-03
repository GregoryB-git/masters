package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import z2;

public abstract class KeyCycleOscillator
{
  private static final String TAG = "KeyCycleOscillator";
  private CurveFit mCurveFit;
  private CycleOscillator mCycleOscillator;
  private String mType;
  public int mVariesBy = 0;
  public ArrayList<WavePoint> mWavePoints = new ArrayList();
  private int mWaveShape = 0;
  private String mWaveString = null;
  
  public static KeyCycleOscillator makeWidgetCycle(String paramString)
  {
    if (paramString.equals("pathRotate")) {
      return new PathRotateSet(paramString);
    }
    return new CoreSpline(paramString);
  }
  
  public float get(float paramFloat)
  {
    return (float)mCycleOscillator.getValues(paramFloat);
  }
  
  public CurveFit getCurveFit()
  {
    return mCurveFit;
  }
  
  public float getSlope(float paramFloat)
  {
    return (float)mCycleOscillator.getSlope(paramFloat);
  }
  
  public void setCustom(Object paramObject) {}
  
  public void setPoint(int paramInt1, int paramInt2, String paramString, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    mWavePoints.add(new WavePoint(paramInt1, paramFloat1, paramFloat2, paramFloat3, paramFloat4));
    if (paramInt3 != -1) {
      mVariesBy = paramInt3;
    }
    mWaveShape = paramInt2;
    mWaveString = paramString;
  }
  
  public void setPoint(int paramInt1, int paramInt2, String paramString, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Object paramObject)
  {
    mWavePoints.add(new WavePoint(paramInt1, paramFloat1, paramFloat2, paramFloat3, paramFloat4));
    if (paramInt3 != -1) {
      mVariesBy = paramInt3;
    }
    mWaveShape = paramInt2;
    setCustom(paramObject);
    mWaveString = paramString;
  }
  
  public void setProperty(MotionWidget paramMotionWidget, float paramFloat) {}
  
  public void setType(String paramString)
  {
    mType = paramString;
  }
  
  public void setup(float paramFloat)
  {
    int i = mWavePoints.size();
    if (i == 0) {
      return;
    }
    Collections.sort(mWavePoints, new Comparator()
    {
      public int compare(KeyCycleOscillator.WavePoint paramAnonymousWavePoint1, KeyCycleOscillator.WavePoint paramAnonymousWavePoint2)
      {
        return Integer.compare(mPosition, mPosition);
      }
    });
    double[] arrayOfDouble1 = new double[i];
    double[][] arrayOfDouble = new double[i][3];
    mCycleOscillator = new CycleOscillator(mWaveShape, mWaveString, mVariesBy, i);
    Iterator localIterator = mWavePoints.iterator();
    for (i = 0; localIterator.hasNext(); i++)
    {
      WavePoint localWavePoint = (WavePoint)localIterator.next();
      float f1 = mPeriod;
      arrayOfDouble1[i] = (f1 * 0.01D);
      double[] arrayOfDouble2 = arrayOfDouble[i];
      float f2 = mValue;
      arrayOfDouble2[0] = f2;
      float f3 = mOffset;
      arrayOfDouble2[1] = f3;
      float f4 = mPhase;
      arrayOfDouble2[2] = f4;
      mCycleOscillator.setPoint(i, mPosition, f1, f3, f4, f2);
    }
    mCycleOscillator.setup(paramFloat);
    mCurveFit = CurveFit.get(0, arrayOfDouble1, arrayOfDouble);
  }
  
  public String toString()
  {
    Object localObject = mType;
    DecimalFormat localDecimalFormat = new DecimalFormat("##.##");
    Iterator localIterator = mWavePoints.iterator();
    while (localIterator.hasNext())
    {
      WavePoint localWavePoint = (WavePoint)localIterator.next();
      localObject = z2.u((String)localObject, "[");
      ((StringBuilder)localObject).append(mPosition);
      ((StringBuilder)localObject).append(" , ");
      ((StringBuilder)localObject).append(localDecimalFormat.format(mValue));
      ((StringBuilder)localObject).append("] ");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public boolean variesByPath()
  {
    int i = mVariesBy;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static class CoreSpline
    extends KeyCycleOscillator
  {
    public String type;
    public int typeId;
    
    public CoreSpline(String paramString)
    {
      type = paramString;
      typeId = TypedValues.CycleType.getId(paramString);
    }
    
    public void setProperty(MotionWidget paramMotionWidget, float paramFloat)
    {
      paramMotionWidget.setValue(typeId, get(paramFloat));
    }
  }
  
  public static class CycleOscillator
  {
    private static final String TAG = "CycleOscillator";
    public static final int UNSET = -1;
    private final int OFFST;
    private final int PHASE;
    private final int VALUE;
    public CurveFit mCurveFit;
    public float[] mOffset;
    public Oscillator mOscillator;
    public float mPathLength;
    public float[] mPeriod;
    public float[] mPhase;
    public double[] mPosition;
    public float[] mScale;
    public double[] mSplineSlopeCache;
    public double[] mSplineValueCache;
    public float[] mValues;
    private final int mVariesBy;
    public int mWaveShape;
    
    public CycleOscillator(int paramInt1, String paramString, int paramInt2, int paramInt3)
    {
      Oscillator localOscillator = new Oscillator();
      mOscillator = localOscillator;
      OFFST = 0;
      PHASE = 1;
      VALUE = 2;
      mWaveShape = paramInt1;
      mVariesBy = paramInt2;
      localOscillator.setType(paramInt1, paramString);
      mValues = new float[paramInt3];
      mPosition = new double[paramInt3];
      mPeriod = new float[paramInt3];
      mOffset = new float[paramInt3];
      mPhase = new float[paramInt3];
      mScale = new float[paramInt3];
    }
    
    public double getLastPhase()
    {
      return mSplineValueCache[1];
    }
    
    public double getSlope(float paramFloat)
    {
      Object localObject = mCurveFit;
      if (localObject != null)
      {
        d1 = paramFloat;
        ((CurveFit)localObject).getSlope(d1, mSplineSlopeCache);
        mCurveFit.getPos(d1, mSplineValueCache);
      }
      else
      {
        localObject = mSplineSlopeCache;
        localObject[0] = 0.0D;
        localObject[1] = 0.0D;
        localObject[2] = 0.0D;
      }
      localObject = mOscillator;
      double d2 = paramFloat;
      double d1 = ((Oscillator)localObject).getValue(d2, mSplineValueCache[1]);
      double d3 = mOscillator.getSlope(d2, mSplineValueCache[1], mSplineSlopeCache[1]);
      localObject = mSplineSlopeCache;
      d2 = localObject[0];
      double d4 = localObject[2];
      return d3 * mSplineValueCache[2] + (d1 * d4 + d2);
    }
    
    public double getValues(float paramFloat)
    {
      Object localObject = mCurveFit;
      if (localObject != null)
      {
        ((CurveFit)localObject).getPos(paramFloat, mSplineValueCache);
      }
      else
      {
        localObject = mSplineValueCache;
        localObject[0] = mOffset[0];
        localObject[1] = mPhase[0];
        localObject[2] = mValues[0];
      }
      localObject = mSplineValueCache;
      double d1 = localObject[0];
      double d2 = localObject[1];
      return mOscillator.getValue(paramFloat, d2) * mSplineValueCache[2] + d1;
    }
    
    public void setPoint(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      mPosition[paramInt1] = (paramInt2 / 100.0D);
      mPeriod[paramInt1] = paramFloat1;
      mOffset[paramInt1] = paramFloat2;
      mPhase[paramInt1] = paramFloat3;
      mValues[paramInt1] = paramFloat4;
    }
    
    public void setup(float paramFloat)
    {
      mPathLength = paramFloat;
      int i = mPosition.length;
      double[][] arrayOfDouble = new double[i][3];
      Object localObject = mValues;
      mSplineValueCache = new double[localObject.length + 2];
      mSplineSlopeCache = new double[localObject.length + 2];
      if (mPosition[0] > 0.0D) {
        mOscillator.addPoint(0.0D, mPeriod[0]);
      }
      localObject = mPosition;
      i = localObject.length - 1;
      if (localObject[i] < 1.0D) {
        mOscillator.addPoint(1.0D, mPeriod[i]);
      }
      for (i = 0; i < arrayOfDouble.length; i++)
      {
        localObject = arrayOfDouble[i];
        localObject[0] = mOffset[i];
        localObject[1] = mPhase[i];
        localObject[2] = mValues[i];
        mOscillator.addPoint(mPosition[i], mPeriod[i]);
      }
      mOscillator.normalize();
      localObject = mPosition;
      if (localObject.length > 1) {
        mCurveFit = CurveFit.get(0, (double[])localObject, arrayOfDouble);
      } else {
        mCurveFit = null;
      }
    }
  }
  
  public static class IntDoubleSort
  {
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
    
    public static void sort(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
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
  
  public static class IntFloatFloatSort
  {
    private static int partition(int[] paramArrayOfInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt1, int paramInt2)
    {
      int i = paramArrayOfInt[paramInt2];
      int k;
      for (int j = paramInt1; paramInt1 < paramInt2; j = k)
      {
        k = j;
        if (paramArrayOfInt[paramInt1] <= i)
        {
          swap(paramArrayOfInt, paramArrayOfFloat1, paramArrayOfFloat2, j, paramInt1);
          k = j + 1;
        }
        paramInt1++;
      }
      swap(paramArrayOfInt, paramArrayOfFloat1, paramArrayOfFloat2, j, paramInt2);
      return j;
    }
    
    public static void sort(int[] paramArrayOfInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt1, int paramInt2)
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
          int k = partition(paramArrayOfInt, paramArrayOfFloat1, paramArrayOfFloat2, i, j);
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
    
    private static void swap(int[] paramArrayOfInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt1, int paramInt2)
    {
      int i = paramArrayOfInt[paramInt1];
      paramArrayOfInt[paramInt1] = paramArrayOfInt[paramInt2];
      paramArrayOfInt[paramInt2] = i;
      float f = paramArrayOfFloat1[paramInt1];
      paramArrayOfFloat1[paramInt1] = paramArrayOfFloat1[paramInt2];
      paramArrayOfFloat1[paramInt2] = f;
      f = paramArrayOfFloat2[paramInt1];
      paramArrayOfFloat2[paramInt1] = paramArrayOfFloat2[paramInt2];
      paramArrayOfFloat2[paramInt2] = f;
    }
  }
  
  public static class PathRotateSet
    extends KeyCycleOscillator
  {
    public String type;
    public int typeId;
    
    public PathRotateSet(String paramString)
    {
      type = paramString;
      typeId = TypedValues.CycleType.getId(paramString);
    }
    
    public void setPathRotate(MotionWidget paramMotionWidget, float paramFloat, double paramDouble1, double paramDouble2)
    {
      paramMotionWidget.setRotationZ(get(paramFloat) + (float)Math.toDegrees(Math.atan2(paramDouble2, paramDouble1)));
    }
    
    public void setProperty(MotionWidget paramMotionWidget, float paramFloat)
    {
      paramMotionWidget.setValue(typeId, get(paramFloat));
    }
  }
  
  public static class WavePoint
  {
    public float mOffset;
    public float mPeriod;
    public float mPhase;
    public int mPosition;
    public float mValue;
    
    public WavePoint(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      mPosition = paramInt;
      mValue = paramFloat4;
      mOffset = paramFloat2;
      mPeriod = paramFloat1;
      mPhase = paramFloat3;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */