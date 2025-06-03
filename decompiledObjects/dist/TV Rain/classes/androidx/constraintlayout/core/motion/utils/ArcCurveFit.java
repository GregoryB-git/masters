package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class ArcCurveFit
  extends CurveFit
{
  public static final int ARC_START_FLIP = 3;
  public static final int ARC_START_HORIZONTAL = 2;
  public static final int ARC_START_LINEAR = 0;
  public static final int ARC_START_VERTICAL = 1;
  private static final int START_HORIZONTAL = 2;
  private static final int START_LINEAR = 3;
  private static final int START_VERTICAL = 1;
  public Arc[] mArcs;
  private boolean mExtrapolate = true;
  private final double[] mTime;
  
  public ArcCurveFit(int[] paramArrayOfInt, double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    mTime = paramArrayOfDouble;
    mArcs = new Arc[paramArrayOfDouble.length - 1];
    int i = 1;
    int j = i;
    int m;
    for (int k = 0;; k = m)
    {
      Arc[] arrayOfArc = mArcs;
      if (k >= arrayOfArc.length) {
        break;
      }
      m = paramArrayOfInt[k];
      if (m != 0)
      {
        if (m != 1) {
          if (m != 2)
          {
            if (m != 3) {
              break label114;
            }
            if (i != 1) {}
          }
          else
          {
            j = 2;
            break label96;
          }
        }
        j = 1;
        label96:
        m = j;
        i = j;
        j = m;
      }
      else
      {
        j = 3;
      }
      label114:
      double d1 = paramArrayOfDouble[k];
      m = k + 1;
      double d2 = paramArrayOfDouble[m];
      double[] arrayOfDouble = paramArrayOfDouble1[k];
      double d3 = arrayOfDouble[0];
      double d4 = arrayOfDouble[1];
      arrayOfDouble = paramArrayOfDouble1[m];
      arrayOfArc[k] = new Arc(j, d1, d2, d3, d4, arrayOfDouble[0], arrayOfDouble[1]);
    }
  }
  
  public double getPos(double paramDouble, int paramInt)
  {
    boolean bool = mExtrapolate;
    int i = 0;
    Object localObject;
    double d1;
    if (bool)
    {
      Arc[] arrayOfArc = mArcs;
      localObject = arrayOfArc[0];
      d1 = mTime1;
      double d2;
      if (paramDouble < d1)
      {
        paramDouble -= d1;
        if (linear)
        {
          if (paramInt == 0)
          {
            d2 = ((Arc)localObject).getLinearX(d1);
            return paramDouble * mArcs[0].getLinearDX(d1) + d2;
          }
          d2 = ((Arc)localObject).getLinearY(d1);
          return paramDouble * mArcs[0].getLinearDY(d1) + d2;
        }
        ((Arc)localObject).setPoint(d1);
        if (paramInt == 0)
        {
          d1 = mArcs[0].getX();
          return paramDouble * mArcs[0].getDX() + d1;
        }
        d1 = mArcs[0].getY();
        return paramDouble * mArcs[0].getDY() + d1;
      }
      j = i;
      d1 = paramDouble;
      if (paramDouble > length1mTime2)
      {
        d1 = length1mTime2;
        paramDouble -= d1;
        j = arrayOfArc.length - 1;
        if (paramInt == 0)
        {
          d2 = arrayOfArc[j].getLinearX(d1);
          return paramDouble * mArcs[j].getLinearDX(d1) + d2;
        }
        d2 = arrayOfArc[j].getLinearY(d1);
        return paramDouble * mArcs[j].getLinearDY(d1) + d2;
      }
    }
    else
    {
      localObject = mArcs;
      d1 = 0mTime1;
      if (paramDouble < d1)
      {
        j = i;
      }
      else
      {
        j = i;
        d1 = paramDouble;
        if (paramDouble > length1mTime2) {
          d1 = length1mTime2;
        }
      }
    }
    for (int j = i;; j++)
    {
      localObject = mArcs;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      if (d1 <= mTime2)
      {
        if (linear)
        {
          if (paramInt == 0) {
            return ((Arc)localObject).getLinearX(d1);
          }
          return ((Arc)localObject).getLinearY(d1);
        }
        ((Arc)localObject).setPoint(d1);
        if (paramInt == 0) {
          return mArcs[j].getX();
        }
        return mArcs[j].getY();
      }
    }
    return NaN.0D;
  }
  
  public void getPos(double paramDouble, double[] paramArrayOfDouble)
  {
    Object localObject1;
    double d1;
    double d2;
    if (mExtrapolate)
    {
      localObject1 = mArcs;
      Object localObject2 = localObject1[0];
      d1 = mTime1;
      if (paramDouble < d1)
      {
        paramDouble -= d1;
        if (linear)
        {
          d2 = ((Arc)localObject2).getLinearX(d1);
          paramArrayOfDouble[0] = (mArcs[0].getLinearDX(d1) * paramDouble + d2);
          d2 = mArcs[0].getLinearY(d1);
          paramArrayOfDouble[1] = (paramDouble * mArcs[0].getLinearDY(d1) + d2);
        }
        else
        {
          ((Arc)localObject2).setPoint(d1);
          d1 = mArcs[0].getX();
          paramArrayOfDouble[0] = (mArcs[0].getDX() * paramDouble + d1);
          d1 = mArcs[0].getY();
          paramArrayOfDouble[1] = (paramDouble * mArcs[0].getDY() + d1);
        }
        return;
      }
      d2 = paramDouble;
      if (paramDouble > length1mTime2)
      {
        d2 = length1mTime2;
        d1 = paramDouble - d2;
        i = localObject1.length - 1;
        localObject1 = localObject1[i];
        if (linear)
        {
          paramDouble = ((Arc)localObject1).getLinearX(d2);
          paramArrayOfDouble[0] = (mArcs[i].getLinearDX(d2) * d1 + paramDouble);
          paramDouble = mArcs[i].getLinearY(d2);
          paramArrayOfDouble[1] = (d1 * mArcs[i].getLinearDY(d2) + paramDouble);
        }
        else
        {
          ((Arc)localObject1).setPoint(paramDouble);
          paramDouble = mArcs[i].getX();
          paramArrayOfDouble[0] = (mArcs[i].getDX() * d1 + paramDouble);
          paramDouble = mArcs[i].getY();
          paramArrayOfDouble[1] = (d1 * mArcs[i].getDY() + paramDouble);
        }
      }
    }
    else
    {
      localObject1 = mArcs;
      d2 = 0mTime1;
      d1 = paramDouble;
      if (paramDouble < d2) {
        d1 = d2;
      }
      d2 = d1;
      if (d1 > length1mTime2) {
        d2 = length1mTime2;
      }
    }
    for (int i = 0;; i++)
    {
      localObject1 = mArcs;
      if (i >= localObject1.length) {
        break;
      }
      localObject1 = localObject1[i];
      if (d2 <= mTime2)
      {
        if (linear)
        {
          paramArrayOfDouble[0] = ((Arc)localObject1).getLinearX(d2);
          paramArrayOfDouble[1] = mArcs[i].getLinearY(d2);
          return;
        }
        ((Arc)localObject1).setPoint(d2);
        paramArrayOfDouble[0] = mArcs[i].getX();
        paramArrayOfDouble[1] = mArcs[i].getY();
        return;
      }
    }
  }
  
  public void getPos(double paramDouble, float[] paramArrayOfFloat)
  {
    Object localObject;
    double d1;
    if (mExtrapolate)
    {
      Arc[] arrayOfArc = mArcs;
      localObject = arrayOfArc[0];
      d1 = mTime1;
      double d2;
      if (paramDouble < d1)
      {
        paramDouble -= d1;
        if (linear)
        {
          d2 = ((Arc)localObject).getLinearX(d1);
          paramArrayOfFloat[0] = ((float)(mArcs[0].getLinearDX(d1) * paramDouble + d2));
          d2 = mArcs[0].getLinearY(d1);
          paramArrayOfFloat[1] = ((float)(paramDouble * mArcs[0].getLinearDY(d1) + d2));
        }
        else
        {
          ((Arc)localObject).setPoint(d1);
          d1 = mArcs[0].getX();
          paramArrayOfFloat[0] = ((float)(mArcs[0].getDX() * paramDouble + d1));
          d1 = mArcs[0].getY();
          paramArrayOfFloat[1] = ((float)(paramDouble * mArcs[0].getDY() + d1));
        }
        return;
      }
      d1 = paramDouble;
      if (paramDouble > length1mTime2)
      {
        d1 = length1mTime2;
        d2 = paramDouble - d1;
        i = arrayOfArc.length - 1;
        localObject = arrayOfArc[i];
        if (linear)
        {
          paramDouble = ((Arc)localObject).getLinearX(d1);
          paramArrayOfFloat[0] = ((float)(mArcs[i].getLinearDX(d1) * d2 + paramDouble));
          paramDouble = mArcs[i].getLinearY(d1);
          paramArrayOfFloat[1] = ((float)(d2 * mArcs[i].getLinearDY(d1) + paramDouble));
        }
        else
        {
          ((Arc)localObject).setPoint(paramDouble);
          paramArrayOfFloat[0] = ((float)mArcs[i].getX());
          paramArrayOfFloat[1] = ((float)mArcs[i].getY());
        }
      }
    }
    else
    {
      localObject = mArcs;
      d1 = 0mTime1;
      if (paramDouble >= d1)
      {
        d1 = paramDouble;
        if (paramDouble > length1mTime2) {
          d1 = length1mTime2;
        }
      }
    }
    for (int i = 0;; i++)
    {
      localObject = mArcs;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (d1 <= mTime2)
      {
        if (linear)
        {
          paramArrayOfFloat[0] = ((float)((Arc)localObject).getLinearX(d1));
          paramArrayOfFloat[1] = ((float)mArcs[i].getLinearY(d1));
          return;
        }
        ((Arc)localObject).setPoint(d1);
        paramArrayOfFloat[0] = ((float)mArcs[i].getX());
        paramArrayOfFloat[1] = ((float)mArcs[i].getY());
        return;
      }
    }
  }
  
  public double getSlope(double paramDouble, int paramInt)
  {
    Object localObject = mArcs;
    int i = 0;
    double d1 = 0mTime1;
    double d2 = paramDouble;
    if (paramDouble < d1) {
      d2 = d1;
    }
    int j = i;
    paramDouble = d2;
    if (d2 > length1mTime2) {
      paramDouble = length1mTime2;
    }
    for (j = i;; j++)
    {
      localObject = mArcs;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      if (paramDouble <= mTime2)
      {
        if (linear)
        {
          if (paramInt == 0) {
            return ((Arc)localObject).getLinearDX(paramDouble);
          }
          return ((Arc)localObject).getLinearDY(paramDouble);
        }
        ((Arc)localObject).setPoint(paramDouble);
        if (paramInt == 0) {
          return mArcs[j].getDX();
        }
        return mArcs[j].getDY();
      }
    }
    return NaN.0D;
  }
  
  public void getSlope(double paramDouble, double[] paramArrayOfDouble)
  {
    Object localObject = mArcs;
    double d = 0mTime1;
    if (paramDouble >= d)
    {
      d = paramDouble;
      if (paramDouble > length1mTime2) {
        d = length1mTime2;
      }
    }
    for (int i = 0;; i++)
    {
      localObject = mArcs;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (d <= mTime2)
      {
        if (linear)
        {
          paramArrayOfDouble[0] = ((Arc)localObject).getLinearDX(d);
          paramArrayOfDouble[1] = mArcs[i].getLinearDY(d);
          return;
        }
        ((Arc)localObject).setPoint(d);
        paramArrayOfDouble[0] = mArcs[i].getDX();
        paramArrayOfDouble[1] = mArcs[i].getDY();
        return;
      }
    }
  }
  
  public double[] getTimePoints()
  {
    return mTime;
  }
  
  public static class Arc
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
    
    public Arc(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
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
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.ArcCurveFit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */