package androidx.constraintlayout.core.motion.utils;

public class LinearCurveFit
  extends CurveFit
{
  private static final String TAG = "LinearCurveFit";
  private boolean mExtrapolate = true;
  public double[] mSlopeTemp;
  private double[] mT;
  private double mTotalLength = NaN.0D;
  private double[][] mY;
  
  public LinearCurveFit(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    int i = paramArrayOfDouble.length;
    i = paramArrayOfDouble1[0].length;
    mSlopeTemp = new double[i];
    mT = paramArrayOfDouble;
    mY = paramArrayOfDouble1;
    if (i > 2)
    {
      i = 0;
      double d2;
      for (double d1 = 0.0D; i < paramArrayOfDouble.length; d1 = d2)
      {
        d2 = paramArrayOfDouble1[i][0];
        if (i > 0) {
          Math.hypot(d2 - d1, d2 - d1);
        }
        i++;
      }
      mTotalLength = 0.0D;
    }
  }
  
  private double getLength2D(double paramDouble)
  {
    if (Double.isNaN(mTotalLength)) {
      return 0.0D;
    }
    double[] arrayOfDouble = mT;
    int i = arrayOfDouble.length;
    if (paramDouble <= arrayOfDouble[0]) {
      return 0.0D;
    }
    int j = i - 1;
    if (paramDouble >= arrayOfDouble[j]) {
      return mTotalLength;
    }
    double d1 = 0.0D;
    double d2 = d1;
    double d3 = d2;
    i = 0;
    double d4 = d2;
    while (i < j)
    {
      arrayOfDouble = mY[i];
      double d5 = arrayOfDouble[0];
      double d6 = arrayOfDouble[1];
      d2 = d1;
      if (i > 0) {
        d2 = d1 + Math.hypot(d5 - d4, d6 - d3);
      }
      arrayOfDouble = mT;
      d4 = arrayOfDouble[i];
      if (paramDouble == d4) {
        return d2;
      }
      int k = i + 1;
      d1 = arrayOfDouble[k];
      if (paramDouble < d1)
      {
        d3 = (paramDouble - d4) / (d1 - d4);
        Object localObject = mY;
        arrayOfDouble = localObject[i];
        paramDouble = arrayOfDouble[0];
        localObject = localObject[k];
        d1 = localObject[0];
        double d7 = arrayOfDouble[1];
        d4 = localObject[1];
        double d8 = 1.0D - d3;
        return Math.hypot(d6 - (d4 * d3 + d7 * d8), d5 - (d1 * d3 + paramDouble * d8)) + d2;
      }
      i = k;
      d4 = d5;
      d3 = d6;
      d1 = d2;
    }
    return 0.0D;
  }
  
  public double getPos(double paramDouble, int paramInt)
  {
    Object localObject = mT;
    int i = localObject.length;
    boolean bool = mExtrapolate;
    int j = 0;
    double d1;
    double d2;
    if (bool)
    {
      d1 = localObject[0];
      if (paramDouble <= d1)
      {
        d2 = mY[0][paramInt];
        paramDouble -= d1;
      }
      for (d1 = getSlope(d1, paramInt);; d1 = getSlope(d1, paramInt))
      {
        return d1 * paramDouble + d2;
        k = i - 1;
        d1 = localObject[k];
        if (paramDouble < d1) {
          break;
        }
        d2 = mY[k][paramInt];
        paramDouble -= d1;
      }
    }
    if (paramDouble <= localObject[0]) {
      return mY[0][paramInt];
    }
    int k = i - 1;
    if (paramDouble >= localObject[k]) {
      return mY[k][paramInt];
    }
    while (j < i - 1)
    {
      localObject = mT;
      d2 = localObject[j];
      if (paramDouble == d2) {
        return mY[j][paramInt];
      }
      k = j + 1;
      d1 = localObject[k];
      if (paramDouble < d1)
      {
        d2 = (paramDouble - d2) / (d1 - d2);
        localObject = mY;
        paramDouble = localObject[j][paramInt];
        return localObject[k][paramInt] * d2 + (1.0D - d2) * paramDouble;
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
        d1 = (paramDouble - d2) / (d1 - d2);
        for (j = k; j < n; j++)
        {
          localObject = mY;
          paramDouble = localObject[m][j];
          paramArrayOfDouble[j] = (localObject[i1][j] * d1 + (1.0D - d1) * paramDouble);
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
      double d2 = localObject[i1];
      if (paramDouble < d2)
      {
        d1 = localObject[m];
        paramDouble = (paramDouble - d1) / (d2 - d1);
        for (j = k; j < n; j++)
        {
          localObject = mY;
          d1 = localObject[m][j];
          paramArrayOfFloat[j] = ((float)(localObject[i1][j] * paramDouble + (1.0D - paramDouble) * d1));
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
    if (paramDouble < d1) {}
    int k;
    double d2;
    for (paramDouble = d1;; paramDouble = d2)
    {
      k = j;
      d1 = paramDouble;
      break;
      d2 = localObject[(i - 1)];
      k = j;
      d1 = paramDouble;
      if (paramDouble < d2) {
        break;
      }
    }
    while (k < i - 1)
    {
      localObject = mT;
      j = k + 1;
      paramDouble = localObject[j];
      if (d1 <= paramDouble)
      {
        d2 = localObject[k];
        localObject = mY;
        d1 = localObject[k][paramInt];
        return (localObject[j][paramInt] - d1) / (paramDouble - d2);
      }
      k = j;
    }
    return 0.0D;
  }
  
  public void getSlope(double paramDouble, double[] paramArrayOfDouble)
  {
    Object localObject = mT;
    int i = localObject.length;
    double[][] arrayOfDouble = mY;
    int j = 0;
    int k = arrayOfDouble[0].length;
    double d1 = localObject[0];
    if (paramDouble <= d1) {}
    double d2;
    for (paramDouble = d1;; paramDouble = d2)
    {
      d1 = paramDouble;
      break;
      d2 = localObject[(i - 1)];
      d1 = paramDouble;
      if (paramDouble < d2) {
        break;
      }
    }
    int n;
    for (int m = 0; m < i - 1; m = n)
    {
      localObject = mT;
      n = m + 1;
      paramDouble = localObject[n];
      if (d1 <= paramDouble)
      {
        d1 = localObject[m];
        while (j < k)
        {
          localObject = mY;
          d2 = localObject[m][j];
          paramArrayOfDouble[j] = ((localObject[n][j] - d2) / (paramDouble - d1));
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
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.LinearCurveFit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */