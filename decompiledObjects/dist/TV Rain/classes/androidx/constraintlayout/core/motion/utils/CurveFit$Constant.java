package androidx.constraintlayout.core.motion.utils;

class CurveFit$Constant
  extends CurveFit
{
  public double mTime;
  public double[] mValue;
  
  public CurveFit$Constant(double paramDouble, double[] paramArrayOfDouble)
  {
    mTime = paramDouble;
    mValue = paramArrayOfDouble;
  }
  
  public double getPos(double paramDouble, int paramInt)
  {
    return mValue[paramInt];
  }
  
  public void getPos(double paramDouble, double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = mValue;
    System.arraycopy(arrayOfDouble, 0, paramArrayOfDouble, 0, arrayOfDouble.length);
  }
  
  public void getPos(double paramDouble, float[] paramArrayOfFloat)
  {
    for (int i = 0;; i++)
    {
      double[] arrayOfDouble = mValue;
      if (i >= arrayOfDouble.length) {
        break;
      }
      paramArrayOfFloat[i] = ((float)arrayOfDouble[i]);
    }
  }
  
  public double getSlope(double paramDouble, int paramInt)
  {
    return 0.0D;
  }
  
  public void getSlope(double paramDouble, double[] paramArrayOfDouble)
  {
    for (int i = 0; i < mValue.length; i++) {
      paramArrayOfDouble[i] = 0.0D;
    }
  }
  
  public double[] getTimePoints()
  {
    return new double[] { mTime };
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.CurveFit.Constant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */