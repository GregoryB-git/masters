package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import z2;

public class Oscillator
{
  public static final int BOUNCE = 6;
  public static final int COS_WAVE = 5;
  public static final int CUSTOM = 7;
  public static final int REVERSE_SAW_WAVE = 4;
  public static final int SAW_WAVE = 3;
  public static final int SIN_WAVE = 0;
  public static final int SQUARE_WAVE = 1;
  public static String TAG = "Oscillator";
  public static final int TRIANGLE_WAVE = 2;
  public double PI2 = 6.283185307179586D;
  public double[] mArea;
  public MonotonicCurveFit mCustomCurve;
  public String mCustomType;
  private boolean mNormalized = false;
  public float[] mPeriod = new float[0];
  public double[] mPosition = new double[0];
  public int mType;
  
  public void addPoint(double paramDouble, float paramFloat)
  {
    int i = mPeriod.length + 1;
    int j = Arrays.binarySearch(mPosition, paramDouble);
    int k = j;
    if (j < 0) {
      k = -j - 1;
    }
    mPosition = Arrays.copyOf(mPosition, i);
    mPeriod = Arrays.copyOf(mPeriod, i);
    mArea = new double[i];
    double[] arrayOfDouble = mPosition;
    System.arraycopy(arrayOfDouble, k, arrayOfDouble, k + 1, i - k - 1);
    mPosition[k] = paramDouble;
    mPeriod[k] = paramFloat;
    mNormalized = false;
  }
  
  public double getDP(double paramDouble)
  {
    double d1 = 0.0D;
    double d2;
    if (paramDouble <= 0.0D)
    {
      d2 = 1.0E-5D;
    }
    else
    {
      d2 = paramDouble;
      if (paramDouble >= 1.0D) {
        d2 = 0.999999D;
      }
    }
    int i = Arrays.binarySearch(mPosition, d2);
    if (i > 0) {
      return 0.0D;
    }
    paramDouble = d1;
    if (i != 0)
    {
      int j = -i - 1;
      Object localObject = mPeriod;
      float f1 = localObject[j];
      i = j - 1;
      float f2 = localObject[i];
      d1 = f1 - f2;
      localObject = mPosition;
      double d3 = localObject[j];
      paramDouble = localObject[i];
      d1 /= (d3 - paramDouble);
      paramDouble = f2 - d1 * paramDouble + d2 * d1;
    }
    return paramDouble;
  }
  
  public double getP(double paramDouble)
  {
    double d1 = 0.0D;
    double d2;
    if (paramDouble < 0.0D)
    {
      d2 = 0.0D;
    }
    else
    {
      d2 = paramDouble;
      if (paramDouble > 1.0D) {
        d2 = 1.0D;
      }
    }
    int i = Arrays.binarySearch(mPosition, d2);
    if (i > 0)
    {
      paramDouble = 1.0D;
    }
    else
    {
      paramDouble = d1;
      if (i != 0)
      {
        i = -i - 1;
        Object localObject = mPeriod;
        float f1 = localObject[i];
        int j = i - 1;
        float f2 = localObject[j];
        double d3 = f1 - f2;
        localObject = mPosition;
        d1 = localObject[i];
        paramDouble = localObject[j];
        d3 /= (d1 - paramDouble);
        double d4 = mArea[j];
        d1 = f2;
        paramDouble = (d2 * d2 - paramDouble * paramDouble) * d3 / 2.0D + ((d2 - paramDouble) * (d1 - d3 * paramDouble) + d4);
      }
    }
    return paramDouble;
  }
  
  public double getSlope(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d = getP(paramDouble1) + paramDouble2;
    paramDouble1 = getDP(paramDouble1) + paramDouble3;
    switch (mType)
    {
    default: 
      paramDouble3 = PI2;
      paramDouble2 = paramDouble1 * paramDouble3;
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (paramDouble1 = Math.cos(paramDouble3 * d);; paramDouble1 = Math.signum((d * 4.0D + 3.0D) % 4.0D - 2.0D))
      {
        return paramDouble1 * paramDouble2;
        return mCustomCurve.getSlope(d % 1.0D, 0);
        return ((d * 4.0D + 2.0D) % 4.0D - 2.0D) * (paramDouble1 * 4.0D);
        paramDouble3 = PI2;
        paramDouble2 = -paramDouble3;
        return Math.sin(paramDouble3 * d) * (paramDouble2 * paramDouble1);
        return -paramDouble1 * 2.0D;
        return paramDouble1 * 2.0D;
        paramDouble2 = paramDouble1 * 4.0D;
      }
    }
    return 0.0D;
  }
  
  public double getValue(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = getP(paramDouble1) + paramDouble2;
    switch (mType)
    {
    default: 
      return Math.sin(PI2 * paramDouble1);
    case 7: 
      return mCustomCurve.getPos(paramDouble1 % 1.0D, 0);
    case 6: 
      paramDouble1 = 1.0D - Math.abs(paramDouble1 * 4.0D % 4.0D - 2.0D);
      paramDouble1 *= paramDouble1;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return 1.0D - paramDouble1;
        return Math.cos((paramDouble2 + paramDouble1) * PI2);
        paramDouble1 = (paramDouble1 * 2.0D + 1.0D) % 2.0D;
        continue;
        return (paramDouble1 * 2.0D + 1.0D) % 2.0D - 1.0D;
        paramDouble1 = Math.abs((paramDouble1 * 4.0D + 1.0D) % 4.0D - 2.0D);
      }
    }
    return Math.signum(0.5D - paramDouble1 % 1.0D);
  }
  
  public void normalize()
  {
    int i = 0;
    double d1 = 0.0D;
    Object localObject;
    for (;;)
    {
      localObject = mPeriod;
      if (i >= localObject.length) {
        break;
      }
      d1 += localObject[i];
      i++;
    }
    double d2 = 0.0D;
    int j;
    float f;
    for (i = 1;; i++)
    {
      localObject = mPeriod;
      if (i >= localObject.length) {
        break;
      }
      j = i - 1;
      f = (localObject[j] + localObject[i]) / 2.0F;
      localObject = mPosition;
      d2 += (localObject[i] - localObject[j]) * f;
    }
    for (i = 0;; i++)
    {
      localObject = mPeriod;
      if (i >= localObject.length) {
        break;
      }
      localObject[i] = ((float)(localObject[i] * (d1 / d2)));
    }
    mArea[0] = 0.0D;
    for (i = 1;; i++)
    {
      localObject = mPeriod;
      if (i >= localObject.length) {
        break;
      }
      j = i - 1;
      f = (localObject[j] + localObject[i]) / 2.0F;
      localObject = mPosition;
      double d3 = localObject[i];
      d1 = localObject[j];
      localObject = mArea;
      d2 = localObject[j];
      localObject[i] = ((d3 - d1) * f + d2);
    }
    mNormalized = true;
  }
  
  public void setType(int paramInt, String paramString)
  {
    mType = paramInt;
    mCustomType = paramString;
    if (paramString != null) {
      mCustomCurve = MonotonicCurveFit.buildWave(paramString);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("pos =");
    localStringBuilder.append(Arrays.toString(mPosition));
    localStringBuilder.append(" period=");
    localStringBuilder.append(Arrays.toString(mPeriod));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Oscillator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */