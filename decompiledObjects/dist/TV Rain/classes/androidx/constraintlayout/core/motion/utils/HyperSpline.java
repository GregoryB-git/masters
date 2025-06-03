package androidx.constraintlayout.core.motion.utils;

public class HyperSpline
{
  public double[][] mCtl;
  public Cubic[][] mCurve;
  public double[] mCurveLength;
  public int mDimensionality;
  public int mPoints;
  public double mTotalLength;
  
  public HyperSpline() {}
  
  public HyperSpline(double[][] paramArrayOfDouble)
  {
    setup(paramArrayOfDouble);
  }
  
  public static Cubic[] calcNaturalCubic(int paramInt, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble1 = new double[paramInt];
    Object localObject = new double[paramInt];
    double[] arrayOfDouble2 = new double[paramInt];
    int i = paramInt - 1;
    int j = 0;
    arrayOfDouble1[0] = 0.5D;
    int k = 1;
    for (paramInt = 1; paramInt < i; paramInt++) {
      arrayOfDouble1[paramInt] = (1.0D / (4.0D - arrayOfDouble1[(paramInt - 1)]));
    }
    int m = i - 1;
    arrayOfDouble1[i] = (1.0D / (2.0D - arrayOfDouble1[m]));
    localObject[0] = ((paramArrayOfDouble[1] - paramArrayOfDouble[0]) * 3.0D * arrayOfDouble1[0]);
    for (paramInt = k; paramInt < i; paramInt = k)
    {
      k = paramInt + 1;
      d1 = paramArrayOfDouble[k];
      int n = paramInt - 1;
      localObject[paramInt] = (((d1 - paramArrayOfDouble[n]) * 3.0D - localObject[n]) * arrayOfDouble1[paramInt]);
    }
    double d1 = ((paramArrayOfDouble[i] - paramArrayOfDouble[m]) * 3.0D - localObject[m]) * arrayOfDouble1[i];
    localObject[i] = d1;
    arrayOfDouble2[i] = d1;
    for (paramInt = m; paramInt >= 0; paramInt--) {
      localObject[paramInt] -= arrayOfDouble1[paramInt] * arrayOfDouble2[(paramInt + 1)];
    }
    localObject = new Cubic[i];
    for (paramInt = j; paramInt < i; paramInt = j)
    {
      double d2 = paramArrayOfDouble[paramInt];
      double d3 = (float)d2;
      double d4 = arrayOfDouble2[paramInt];
      j = paramInt + 1;
      d1 = paramArrayOfDouble[j];
      double d5 = arrayOfDouble2[j];
      localObject[paramInt] = new Cubic(d3, d4, (d1 - d2) * 3.0D - d4 * 2.0D - d5, (d2 - d1) * 2.0D + d4 + d5);
    }
    return (Cubic[])localObject;
  }
  
  public double approxLength(Cubic[] paramArrayOfCubic)
  {
    int i = paramArrayOfCubic.length;
    double[] arrayOfDouble = new double[paramArrayOfCubic.length];
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d4;
    double d6;
    for (double d3 = d2;; d3 = d6)
    {
      i = 0;
      int j = 0;
      d4 = d1;
      if (d2 >= 1.0D) {
        break;
      }
      d4 = 0.0D;
      for (i = j; i < paramArrayOfCubic.length; i++)
      {
        double d5 = arrayOfDouble[i];
        d6 = paramArrayOfCubic[i].eval(d2);
        arrayOfDouble[i] = d6;
        d6 = d5 - d6;
        d4 += d6 * d6;
      }
      d6 = d3;
      if (d2 > 0.0D) {
        d6 = d3 + Math.sqrt(d4);
      }
      d2 += 0.1D;
    }
    while (i < paramArrayOfCubic.length)
    {
      d2 = arrayOfDouble[i];
      d6 = paramArrayOfCubic[i].eval(1.0D);
      arrayOfDouble[i] = d6;
      d2 -= d6;
      d4 += d2 * d2;
      i++;
    }
    return Math.sqrt(d4) + d3;
  }
  
  public double getPos(double paramDouble, int paramInt)
  {
    paramDouble *= mTotalLength;
    double[] arrayOfDouble;
    for (int i = 0;; i++)
    {
      arrayOfDouble = mCurveLength;
      if (i >= arrayOfDouble.length - 1) {
        break;
      }
      double d = arrayOfDouble[i];
      if (d >= paramDouble) {
        break;
      }
      paramDouble -= d;
    }
    return mCurve[paramInt][i].eval(paramDouble / arrayOfDouble[i]);
  }
  
  public void getPos(double paramDouble, double[] paramArrayOfDouble)
  {
    paramDouble *= mTotalLength;
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      double[] arrayOfDouble = mCurveLength;
      k = i;
      if (j >= arrayOfDouble.length - 1) {
        break;
      }
      double d = arrayOfDouble[j];
      k = i;
      if (d >= paramDouble) {
        break;
      }
      paramDouble -= d;
    }
    while (k < paramArrayOfDouble.length)
    {
      paramArrayOfDouble[k] = mCurve[k][j].eval(paramDouble / mCurveLength[j]);
      k++;
    }
  }
  
  public void getPos(double paramDouble, float[] paramArrayOfFloat)
  {
    paramDouble *= mTotalLength;
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      double[] arrayOfDouble = mCurveLength;
      k = i;
      if (j >= arrayOfDouble.length - 1) {
        break;
      }
      double d = arrayOfDouble[j];
      k = i;
      if (d >= paramDouble) {
        break;
      }
      paramDouble -= d;
    }
    while (k < paramArrayOfFloat.length)
    {
      paramArrayOfFloat[k] = ((float)mCurve[k][j].eval(paramDouble / mCurveLength[j]));
      k++;
    }
  }
  
  public void getVelocity(double paramDouble, double[] paramArrayOfDouble)
  {
    paramDouble *= mTotalLength;
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      double[] arrayOfDouble = mCurveLength;
      k = i;
      if (j >= arrayOfDouble.length - 1) {
        break;
      }
      double d = arrayOfDouble[j];
      k = i;
      if (d >= paramDouble) {
        break;
      }
      paramDouble -= d;
    }
    while (k < paramArrayOfDouble.length)
    {
      paramArrayOfDouble[k] = mCurve[k][j].vel(paramDouble / mCurveLength[j]);
      k++;
    }
  }
  
  public void setup(double[][] paramArrayOfDouble)
  {
    int i = paramArrayOfDouble[0].length;
    mDimensionality = i;
    int j = paramArrayOfDouble.length;
    mPoints = j;
    mCtl = new double[i][j];
    mCurve = new Cubic[mDimensionality][];
    for (j = 0; j < mDimensionality; j++) {
      for (i = 0; i < mPoints; i++) {
        mCtl[j][i] = paramArrayOfDouble[i][j];
      }
    }
    for (j = 0;; j++)
    {
      i = mDimensionality;
      if (j >= i) {
        break;
      }
      paramArrayOfDouble = mCurve;
      localObject = mCtl[j];
      paramArrayOfDouble[j] = calcNaturalCubic(localObject.length, (double[])localObject);
    }
    mCurveLength = new double[mPoints - 1];
    mTotalLength = 0.0D;
    Object localObject = new Cubic[i];
    for (j = 0; j < mCurveLength.length; j++)
    {
      for (i = 0; i < mDimensionality; i++) {
        localObject[i] = mCurve[i][j];
      }
      double d1 = mTotalLength;
      paramArrayOfDouble = mCurveLength;
      double d2 = approxLength((Cubic[])localObject);
      paramArrayOfDouble[j] = d2;
      mTotalLength = (d1 + d2);
    }
  }
  
  public static class Cubic
  {
    public double mA;
    public double mB;
    public double mC;
    public double mD;
    
    public Cubic(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
    {
      mA = paramDouble1;
      mB = paramDouble2;
      mC = paramDouble3;
      mD = paramDouble4;
    }
    
    public double eval(double paramDouble)
    {
      return ((mD * paramDouble + mC) * paramDouble + mB) * paramDouble + mA;
    }
    
    public double vel(double paramDouble)
    {
      double d = mD;
      return (mC * 2.0D + d * 3.0D * paramDouble) * paramDouble + mB;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.HyperSpline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */