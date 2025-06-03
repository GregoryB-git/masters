package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import z2;

public class SpringStopEngine
  implements StopEngine
{
  private static final double UNSET = Double.MAX_VALUE;
  private int mBoundaryMode = 0;
  public double mDamping = 0.5D;
  private boolean mInitialized = false;
  private float mLastTime;
  private double mLastVelocity;
  private float mMass;
  private float mPos;
  private double mStiffness;
  private float mStopThreshold;
  private double mTargetPos;
  private float mV;
  
  private void compute(double paramDouble)
  {
    double d1 = mStiffness;
    double d2 = mDamping;
    int i = (int)(9.0D / (Math.sqrt(d1 / mMass) * paramDouble * 4.0D) + 1.0D);
    double d3 = paramDouble / i;
    int j = 0;
    paramDouble = d2;
    while (j < i)
    {
      float f1 = mPos;
      double d4 = f1;
      d2 = mTargetPos;
      double d5 = -d1;
      float f2 = mV;
      double d6 = f2;
      float f3 = mMass;
      d6 = (d5 * (d4 - d2) - d6 * paramDouble) / f3;
      d4 = f2;
      d4 = d6 * d3 / 2.0D + d4;
      d6 = f1;
      d6 = (-(d3 * d4 / 2.0D + d6 - d2) * d1 - d4 * paramDouble) / f3 * d3;
      d4 = f2;
      d2 = d6 / 2.0D;
      f3 = (float)(f2 + d6);
      mV = f3;
      f1 = (float)((d2 + d4) * d3 + f1);
      mPos = f1;
      int k = mBoundaryMode;
      if (k > 0)
      {
        if ((f1 < 0.0F) && ((k & 0x1) == 1))
        {
          mPos = (-f1);
          mV = (-f3);
        }
        f1 = mPos;
        if ((f1 > 1.0F) && ((k & 0x2) == 2))
        {
          mPos = (2.0F - f1);
          mV = (-mV);
        }
      }
      j++;
    }
  }
  
  public String debug(String paramString, float paramFloat)
  {
    return null;
  }
  
  public float getAcceleration()
  {
    double d1 = mStiffness;
    double d2 = mDamping;
    double d3 = mPos;
    double d4 = mTargetPos;
    return (float)(-d1 * (d3 - d4) - d2 * mV) / mMass;
  }
  
  public float getInterpolation(float paramFloat)
  {
    compute(paramFloat - mLastTime);
    mLastTime = paramFloat;
    return mPos;
  }
  
  public float getVelocity()
  {
    return 0.0F;
  }
  
  public float getVelocity(float paramFloat)
  {
    return mV;
  }
  
  public boolean isStopped()
  {
    double d1 = mPos - mTargetPos;
    double d2 = mStiffness;
    double d3 = mV;
    boolean bool;
    if (Math.sqrt((d2 * d1 * d1 + d3 * d3 * mMass) / d2) <= mStopThreshold) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void log(String paramString)
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = z2.t(".(");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getFileName());
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getLineNumber());
    ((StringBuilder)localObject2).append(") ");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getMethodName());
    ((StringBuilder)localObject2).append("() ");
    localObject1 = ((StringBuilder)localObject2).toString();
    localObject2 = System.out;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(paramString);
    ((PrintStream)localObject2).println(localStringBuilder.toString());
  }
  
  public void springConfig(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt)
  {
    mTargetPos = paramFloat2;
    mDamping = paramFloat6;
    mInitialized = false;
    mPos = paramFloat1;
    mLastVelocity = paramFloat3;
    mStiffness = paramFloat5;
    mMass = paramFloat4;
    mStopThreshold = paramFloat7;
    mBoundaryMode = paramInt;
    mLastTime = 0.0F;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SpringStopEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */