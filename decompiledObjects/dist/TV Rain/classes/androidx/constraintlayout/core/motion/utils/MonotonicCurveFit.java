package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class MonotonicCurveFit
  extends CurveFit
{
  private static final String TAG = "MonotonicCurveFit";
  private boolean mExtrapolate = true;
  public double[] mSlopeTemp;
  private double[] mT;
  private double[][] mTangent;
  private double[][] mY;
  
  public MonotonicCurveFit(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    int i = paramArrayOfDouble.length;
    int j = paramArrayOfDouble1[0].length;
    mSlopeTemp = new double[j];
    int k = i - 1;
    double[][] arrayOfDouble1 = new double[k][j];
    double[][] arrayOfDouble2 = new double[i][j];
    int n;
    int i1;
    double d1;
    double d2;
    double[] arrayOfDouble3;
    for (int m = 0; m < j; m++)
    {
      for (n = 0; n < k; n = i1)
      {
        i1 = n + 1;
        d1 = paramArrayOfDouble[i1];
        d2 = paramArrayOfDouble[n];
        arrayOfDouble3 = arrayOfDouble1[n];
        d1 = (paramArrayOfDouble1[i1][m] - paramArrayOfDouble1[n][m]) / (d1 - d2);
        arrayOfDouble3[m] = d1;
        if (n == 0) {
          arrayOfDouble2[n][m] = d1;
        } else {
          arrayOfDouble2[n][m] = ((arrayOfDouble1[(n - 1)][m] + d1) * 0.5D);
        }
      }
      arrayOfDouble2[k][m] = arrayOfDouble1[(i - 2)][m];
    }
    for (m = 0; m < k; m++) {
      for (n = 0; n < j; n++)
      {
        d2 = arrayOfDouble1[m][n];
        if (d2 == 0.0D)
        {
          arrayOfDouble2[m][n] = 0.0D;
          arrayOfDouble2[(m + 1)][n] = 0.0D;
        }
        else
        {
          d1 = arrayOfDouble2[m][n] / d2;
          i1 = m + 1;
          d2 = arrayOfDouble2[i1][n] / d2;
          double d3 = Math.hypot(d1, d2);
          if (d3 > 9.0D)
          {
            d3 = 3.0D / d3;
            double[] arrayOfDouble4 = arrayOfDouble2[m];
            arrayOfDouble3 = arrayOfDouble1[m];
            arrayOfDouble4[n] = (d1 * d3 * arrayOfDouble3[n]);
            arrayOfDouble2[i1][n] = (d3 * d2 * arrayOfDouble3[n]);
          }
        }
      }
    }
    mT = paramArrayOfDouble;
    mY = paramArrayOfDouble1;
    mTangent = arrayOfDouble2;
  }
  
  public static MonotonicCurveFit buildWave(String paramString)
  {
    double[] arrayOfDouble = new double[paramString.length() / 2];
    int i = paramString.indexOf('(') + 1;
    int j = paramString.indexOf(',', i);
    for (int k = 0; j != -1; k++)
    {
      arrayOfDouble[k] = Double.parseDouble(paramString.substring(i, j).trim());
      i = j + 1;
      j = paramString.indexOf(',', i);
    }
    arrayOfDouble[k] = Double.parseDouble(paramString.substring(i, paramString.indexOf(41, i)).trim());
    return buildWave(Arrays.copyOf(arrayOfDouble, k + 1));
  }
  
  private static MonotonicCurveFit buildWave(double[] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble.length * 3 - 2;
    int j = paramArrayOfDouble.length - 1;
    double d1 = 1.0D / j;
    double[][] arrayOfDouble = new double[i][1];
    double[] arrayOfDouble1 = new double[i];
    for (i = 0; i < paramArrayOfDouble.length; i++)
    {
      double d2 = paramArrayOfDouble[i];
      int k = i + j;
      arrayOfDouble[k][0] = d2;
      double d3 = i * d1;
      arrayOfDouble1[k] = d3;
      if (i > 0)
      {
        k = j * 2 + i;
        arrayOfDouble[k][0] = (d2 + 1.0D);
        arrayOfDouble1[k] = (d3 + 1.0D);
        k = i - 1;
        arrayOfDouble[k][0] = (d2 - 1.0D - d1);
        arrayOfDouble1[k] = (d3 - 1.0D - d1);
      }
    }
    return new MonotonicCurveFit(arrayOfDouble1, arrayOfDouble);
  }
  
  private static double diff(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = paramDouble2 * 6.0D;
    double d3 = 3.0D * paramDouble1;
    return paramDouble1 * paramDouble5 + (d3 * paramDouble5 * d1 + (d3 * paramDouble6 * d1 + (6.0D * d1 * paramDouble3 + (d2 * paramDouble4 + -6.0D * d1 * paramDouble4) - d2 * paramDouble3)) - 2.0D * paramDouble1 * paramDouble6 * paramDouble2 - 4.0D * paramDouble1 * paramDouble5 * paramDouble2);
  }
  
  private static double interpolate(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = d1 * paramDouble2;
    double d3 = 3.0D * d1;
    paramDouble6 = paramDouble1 * paramDouble6;
    double d4 = paramDouble1 * paramDouble5;
    return d4 * paramDouble2 + (d2 * d4 + (paramDouble6 * d2 + (d2 * 2.0D * paramDouble3 + (d3 * paramDouble4 + -2.0D * d2 * paramDouble4) - d3 * paramDouble3 + paramDouble3)) - paramDouble6 * d1 - 2.0D * paramDouble1 * paramDouble5 * d1);
  }
  
  public double getPos(double paramDouble, int paramInt)
  {
    Object localObject = mT;
    int i = localObject.length;
    boolean bool = mExtrapolate;
    int j = 0;
    double d1;
    double d2;
    int k;
    if (bool)
    {
      d1 = localObject[0];
      if (paramDouble <= d1)
      {
        d2 = mY[0][paramInt];
        return getSlope(d1, paramInt) * (paramDouble - d1) + d2;
      }
      k = i - 1;
      d1 = localObject[k];
      if (paramDouble >= d1)
      {
        d2 = mY[k][paramInt];
        return getSlope(d1, paramInt) * (paramDouble - d1) + d2;
      }
    }
    else
    {
      if (paramDouble <= localObject[0]) {
        return mY[0][paramInt];
      }
      k = i - 1;
      if (paramDouble >= localObject[k]) {
        return mY[k][paramInt];
      }
    }
    while (j < i - 1)
    {
      localObject = mT;
      d1 = localObject[j];
      if (paramDouble == d1) {
        return mY[j][paramInt];
      }
      k = j + 1;
      d2 = localObject[k];
      if (paramDouble < d2)
      {
        d2 -= d1;
        paramDouble = (paramDouble - d1) / d2;
        localObject = mY;
        double d3 = localObject[j][paramInt];
        d1 = localObject[k][paramInt];
        localObject = mTangent;
        return interpolate(d2, paramDouble, d3, d1, localObject[j][paramInt], localObject[k][paramInt]);
      }
      j = k;
    }
    return 0.0D;
  }
  
  public void getPos(double paramDouble, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = mT;
    int i = arrayOfDouble.length;
    Object localObject = mY;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = localObject[0].length;
    double d1;
    int i1;
    if (mExtrapolate)
    {
      d1 = arrayOfDouble[0];
      if (paramDouble <= d1)
      {
        getSlope(d1, mSlopeTemp);
        for (m = 0; m < n; m++)
        {
          d1 = mY[0][m];
          paramArrayOfDouble[m] = ((paramDouble - mT[0]) * mSlopeTemp[m] + d1);
        }
        return;
      }
      j = i - 1;
      d1 = arrayOfDouble[j];
      if (paramDouble >= d1)
      {
        getSlope(d1, mSlopeTemp);
        while (m < n)
        {
          d1 = mY[j][m];
          paramArrayOfDouble[m] = ((paramDouble - mT[j]) * mSlopeTemp[m] + d1);
          m++;
        }
      }
    }
    else
    {
      if (paramDouble <= arrayOfDouble[0])
      {
        for (m = 0; m < n; m++) {
          paramArrayOfDouble[m] = mY[0][m];
        }
        return;
      }
      i1 = i - 1;
      if (paramDouble >= arrayOfDouble[i1])
      {
        for (m = j; m < n; m++) {
          paramArrayOfDouble[m] = mY[i1][m];
        }
        return;
      }
    }
    for (m = 0; m < i - 1; m = i1)
    {
      if (paramDouble == mT[m]) {
        for (j = 0; j < n; j++) {
          paramArrayOfDouble[j] = mY[m][j];
        }
      }
      localObject = mT;
      i1 = m + 1;
      d1 = localObject[i1];
      if (paramDouble < d1)
      {
        double d2 = localObject[m];
        d1 -= d2;
        double d3 = (paramDouble - d2) / d1;
        for (j = k; j < n; j++)
        {
          localObject = mY;
          d2 = localObject[m][j];
          paramDouble = localObject[i1][j];
          localObject = mTangent;
          paramArrayOfDouble[j] = interpolate(d1, d3, d2, paramDouble, localObject[m][j], localObject[i1][j]);
        }
        return;
      }
    }
  }
  
  public void getPos(double paramDouble, float[] paramArrayOfFloat)
  {
    double[] arrayOfDouble = mT;
    int i = arrayOfDouble.length;
    Object localObject = mY;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = localObject[0].length;
    double d1;
    int i1;
    if (mExtrapolate)
    {
      d1 = arrayOfDouble[0];
      if (paramDouble <= d1)
      {
        getSlope(d1, mSlopeTemp);
        for (m = 0; m < n; m++)
        {
          d1 = mY[0][m];
          paramArrayOfFloat[m] = ((float)((paramDouble - mT[0]) * mSlopeTemp[m] + d1));
        }
        return;
      }
      j = i - 1;
      d1 = arrayOfDouble[j];
      if (paramDouble >= d1)
      {
        getSlope(d1, mSlopeTemp);
        while (m < n)
        {
          d1 = mY[j][m];
          paramArrayOfFloat[m] = ((float)((paramDouble - mT[j]) * mSlopeTemp[m] + d1));
          m++;
        }
      }
    }
    else
    {
      if (paramDouble <= arrayOfDouble[0])
      {
        for (m = 0; m < n; m++) {
          paramArrayOfFloat[m] = ((float)mY[0][m]);
        }
        return;
      }
      i1 = i - 1;
      if (paramDouble >= arrayOfDouble[i1])
      {
        for (m = j; m < n; m++) {
          paramArrayOfFloat[m] = ((float)mY[i1][m]);
        }
        return;
      }
    }
    for (m = 0; m < i - 1; m = i1)
    {
      if (paramDouble == mT[m]) {
        for (j = 0; j < n; j++) {
          paramArrayOfFloat[j] = ((float)mY[m][j]);
        }
      }
      localObject = mT;
      i1 = m + 1;
      d1 = localObject[i1];
      if (paramDouble < d1)
      {
        double d2 = localObject[m];
        d1 -= d2;
        d2 = (paramDouble - d2) / d1;
        for (j = k; j < n; j++)
        {
          localObject = mY;
          paramDouble = localObject[m][j];
          double d3 = localObject[i1][j];
          localObject = mTangent;
          paramArrayOfFloat[j] = ((float)interpolate(d1, d2, paramDouble, d3, localObject[m][j], localObject[i1][j]));
        }
        return;
      }
    }
  }
  
  public double getSlope(double paramDouble, int paramInt)
  {
    Object localObject = mT;
    int i = localObject.length;
    int j = 0;
    double d1 = localObject[0];
    if (paramDouble < d1)
    {
      paramDouble = d1;
    }
    else
    {
      d1 = localObject[(i - 1)];
      if (paramDouble >= d1) {
        paramDouble = d1;
      }
    }
    while (j < i - 1)
    {
      localObject = mT;
      int k = j + 1;
      d1 = localObject[k];
      if (paramDouble <= d1)
      {
        double d2 = localObject[j];
        d1 -= d2;
        d2 = (paramDouble - d2) / d1;
        localObject = mY;
        paramDouble = localObject[j][paramInt];
        double d3 = localObject[k][paramInt];
        localObject = mTangent;
        return diff(d1, d2, paramDouble, d3, localObject[j][paramInt], localObject[k][paramInt]) / d1;
      }
      j = k;
    }
    return 0.0D;
  }
  
  public void getSlope(double paramDouble, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = mT;
    int i = arrayOfDouble.length;
    Object localObject = mY;
    int j = 0;
    int k = localObject[0].length;
    double d1 = arrayOfDouble[0];
    if (paramDouble <= d1)
    {
      paramDouble = d1;
    }
    else
    {
      d1 = arrayOfDouble[(i - 1)];
      if (paramDouble >= d1) {
        paramDouble = d1;
      }
    }
    int n;
    for (int m = 0; m < i - 1; m = n)
    {
      localObject = mT;
      n = m + 1;
      d1 = localObject[n];
      if (paramDouble <= d1)
      {
        double d2 = localObject[m];
        d1 -= d2;
        paramDouble = (paramDouble - d2) / d1;
        while (j < k)
        {
          localObject = mY;
          d2 = localObject[m][j];
          double d3 = localObject[n][j];
          localObject = mTangent;
          paramArrayOfDouble[j] = (diff(d1, paramDouble, d2, d3, localObject[m][j], localObject[n][j]) / d1);
          j++;
        }
      }
    }
  }
  
  public double[] getTimePoints()
  {
    return mT;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */