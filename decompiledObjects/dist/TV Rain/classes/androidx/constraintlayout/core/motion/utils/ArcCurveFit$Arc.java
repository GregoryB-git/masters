package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

class ArcCurveFit$Arc
{
  private static final double EPSILON = 0.001D;
  private static final String TAG = "Arc";
  private static double[] ourPercent = new double[91];
  public boolean linear;
  public double mArcDistance;
  public double mArcVelocity;
  public double mEllipseA;
  public double mEllipseB;
  public double mEllipseCenterX;
  public double mEllipseCenterY;
  public double[] mLut;
  public double mOneOverDeltaTime;
  public double mTime1;
  public double mTime2;
  public double mTmpCosAngle;
  public double mTmpSinAngle;
  public boolean mVertical;
  public double mX1;
  public double mX2;
  public double mY1;
  public double mY2;
  
  public ArcCurveFit$Arc(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    boolean bool = false;
    linear = false;
    int i = 1;
    if (paramInt == 1) {
      bool = true;
    }
    mVertical = bool;
    mTime1 = paramDouble1;
    mTime2 = paramDouble2;
    mOneOverDeltaTime = (1.0D / (paramDouble2 - paramDouble1));
    if (3 == paramInt) {
      linear = true;
    }
    paramDouble2 = paramDouble5 - paramDouble3;
    paramDouble1 = paramDouble6 - paramDouble4;
    if ((!linear) && (Math.abs(paramDouble2) >= 0.001D) && (Math.abs(paramDouble1) >= 0.001D))
    {
      mLut = new double[101];
      bool = mVertical;
      if (bool) {
        paramInt = -1;
      } else {
        paramInt = 1;
      }
      mEllipseA = (paramDouble2 * paramInt);
      if (bool) {
        paramInt = i;
      } else {
        paramInt = -1;
      }
      mEllipseB = (paramDouble1 * paramInt);
      if (bool) {
        paramDouble1 = paramDouble5;
      } else {
        paramDouble1 = paramDouble3;
      }
      mEllipseCenterX = paramDouble1;
      if (bool) {
        paramDouble1 = paramDouble4;
      } else {
        paramDouble1 = paramDouble6;
      }
      mEllipseCenterY = paramDouble1;
      buildTable(paramDouble3, paramDouble4, paramDouble5, paramDouble6);
      mArcVelocity = (mArcDistance * mOneOverDeltaTime);
      return;
    }
    linear = true;
    mX1 = paramDouble3;
    mX2 = paramDouble5;
    mY1 = paramDouble4;
    mY2 = paramDouble6;
    paramDouble3 = Math.hypot(paramDouble1, paramDouble2);
    mArcDistance = paramDouble3;
    mArcVelocity = (paramDouble3 * mOneOverDeltaTime);
    paramDouble4 = mTime2;
    paramDouble3 = mTime1;
    mEllipseCenterX = (paramDouble2 / (paramDouble4 - paramDouble3));
    mEllipseCenterY = (paramDouble1 / (paramDouble4 - paramDouble3));
  }
  
  private void buildTable(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    int i = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double[] arrayOfDouble;
    for (;;)
    {
      arrayOfDouble = ourPercent;
      if (i >= arrayOfDouble.length) {
        break;
      }
      double d4 = Math.toRadians(i * 90.0D / (arrayOfDouble.length - 1));
      double d5 = Math.sin(d4);
      d4 = Math.cos(d4);
      d5 *= (paramDouble3 - paramDouble1);
      d4 *= (paramDouble2 - paramDouble4);
      if (i > 0)
      {
        d1 = Math.hypot(d5 - d2, d4 - d3) + d1;
        ourPercent[i] = d1;
      }
      i++;
      d3 = d4;
      d2 = d5;
    }
    mArcDistance = d1;
    for (i = 0;; i++)
    {
      arrayOfDouble = ourPercent;
      if (i >= arrayOfDouble.length) {
        break;
      }
      arrayOfDouble[i] /= d1;
    }
    for (i = 0;; i++)
    {
      arrayOfDouble = mLut;
      if (i >= arrayOfDouble.length) {
        break;
      }
      paramDouble2 = i / (arrayOfDouble.length - 1);
      int j = Arrays.binarySearch(ourPercent, paramDouble2);
      if (j >= 0)
      {
        mLut[i] = (j / (ourPercent.length - 1));
      }
      else if (j == -1)
      {
        mLut[i] = 0.0D;
      }
      else
      {
        int k = -j;
        j = k - 2;
        paramDouble3 = j;
        arrayOfDouble = ourPercent;
        paramDouble1 = arrayOfDouble[j];
        paramDouble1 = ((paramDouble2 - paramDouble1) / (arrayOfDouble[(k - 1)] - paramDouble1) + paramDouble3) / (arrayOfDouble.length - 1);
        mLut[i] = paramDouble1;
      }
    }
  }
  
  public double getDX()
  {
    double d1 = mEllipseA * mTmpCosAngle;
    double d2 = -mEllipseB;
    double d3 = mTmpSinAngle;
    d2 = mArcVelocity / Math.hypot(d1, d2 * d3);
    d3 = d1;
    if (mVertical) {
      d3 = -d1;
    }
    return d3 * d2;
  }
  
  public double getDY()
  {
    double d1 = mEllipseA;
    double d2 = mTmpCosAngle;
    double d3 = -mEllipseB * mTmpSinAngle;
    d1 = mArcVelocity / Math.hypot(d1 * d2, d3);
    if (mVertical) {
      d3 = -d3 * d1;
    } else {
      d3 *= d1;
    }
    return d3;
  }
  
  public double getLinearDX(double paramDouble)
  {
    return mEllipseCenterX;
  }
  
  public double getLinearDY(double paramDouble)
  {
    return mEllipseCenterY;
  }
  
  public double getLinearX(double paramDouble)
  {
    double d1 = mTime1;
    double d2 = mOneOverDeltaTime;
    double d3 = mX1;
    return (mX2 - d3) * ((paramDouble - d1) * d2) + d3;
  }
  
  public double getLinearY(double paramDouble)
  {
    double d1 = mTime1;
    double d2 = mOneOverDeltaTime;
    double d3 = mY1;
    return (mY2 - d3) * ((paramDouble - d1) * d2) + d3;
  }
  
  public double getX()
  {
    double d = mEllipseCenterX;
    return mEllipseA * mTmpSinAngle + d;
  }
  
  public double getY()
  {
    double d = mEllipseCenterY;
    return mEllipseB * mTmpCosAngle + d;
  }
  
  public double lookup(double paramDouble)
  {
    if (paramDouble <= 0.0D) {
      return 0.0D;
    }
    if (paramDouble >= 1.0D) {
      return 1.0D;
    }
    double[] arrayOfDouble = mLut;
    double d1 = paramDouble * (arrayOfDouble.length - 1);
    int i = (int)d1;
    paramDouble = i;
    double d2 = arrayOfDouble[i];
    return (arrayOfDouble[(i + 1)] - d2) * (d1 - paramDouble) + d2;
  }
  
  public void setPoint(double paramDouble)
  {
    if (mVertical) {
      paramDouble = mTime2 - paramDouble;
    } else {
      paramDouble -= mTime1;
    }
    paramDouble = lookup(paramDouble * mOneOverDeltaTime) * 1.5707963267948966D;
    mTmpSinAngle = Math.sin(paramDouble);
    mTmpCosAngle = Math.cos(paramDouble);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */