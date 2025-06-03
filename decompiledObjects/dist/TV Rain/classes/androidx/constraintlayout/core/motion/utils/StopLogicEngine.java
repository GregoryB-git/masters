package androidx.constraintlayout.core.motion.utils;

import a;
import z2;

public class StopLogicEngine
  implements StopEngine
{
  private static final float EPSILON = 1.0E-5F;
  private boolean mBackwards = false;
  private boolean mDone = false;
  private float mLastPosition;
  private int mNumberOfStages;
  private float mStage1Duration;
  private float mStage1EndPosition;
  private float mStage1Velocity;
  private float mStage2Duration;
  private float mStage2EndPosition;
  private float mStage2Velocity;
  private float mStage3Duration;
  private float mStage3EndPosition;
  private float mStage3Velocity;
  private float mStartPosition;
  private String mType;
  
  private float calcY(float paramFloat)
  {
    mDone = false;
    float f1 = mStage1Duration;
    if (paramFloat <= f1)
    {
      f2 = mStage1Velocity;
      return (mStage2Velocity - f2) * paramFloat * paramFloat / (f1 * 2.0F) + f2 * paramFloat;
    }
    int i = mNumberOfStages;
    if (i == 1) {
      return mStage1EndPosition;
    }
    float f2 = paramFloat - f1;
    f1 = mStage2Duration;
    float f3;
    if (f2 < f1)
    {
      paramFloat = mStage1EndPosition;
      f3 = mStage2Velocity;
      return (mStage3Velocity - f3) * f2 * f2 / (f1 * 2.0F) + (f3 * f2 + paramFloat);
    }
    if (i == 2) {
      return mStage2EndPosition;
    }
    paramFloat = f2 - f1;
    f2 = mStage3Duration;
    if (paramFloat <= f2)
    {
      f3 = mStage2EndPosition;
      f1 = mStage3Velocity;
      return f1 * paramFloat + f3 - f1 * paramFloat * paramFloat / (f2 * 2.0F);
    }
    mDone = true;
    return mStage3EndPosition;
  }
  
  private void setup(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    mDone = false;
    float f1 = paramFloat1;
    if (paramFloat1 == 0.0F) {
      f1 = 1.0E-4F;
    }
    mStage1Velocity = f1;
    paramFloat1 = f1 / paramFloat3;
    float f2 = paramFloat1 * f1 / 2.0F;
    if (f1 < 0.0F)
    {
      paramFloat1 = (float)Math.sqrt((paramFloat2 - -f1 / paramFloat3 * f1 / 2.0F) * paramFloat3);
      if (paramFloat1 < paramFloat4)
      {
        mType = "backward accelerate, decelerate";
        mNumberOfStages = 2;
        mStage1Velocity = f1;
        mStage2Velocity = paramFloat1;
        mStage3Velocity = 0.0F;
        paramFloat4 = (paramFloat1 - f1) / paramFloat3;
        mStage1Duration = paramFloat4;
        mStage2Duration = (paramFloat1 / paramFloat3);
        mStage1EndPosition = ((f1 + paramFloat1) * paramFloat4 / 2.0F);
        mStage2EndPosition = paramFloat2;
        mStage3EndPosition = paramFloat2;
        return;
      }
      mType = "backward accelerate cruse decelerate";
      mNumberOfStages = 3;
      mStage1Velocity = f1;
      mStage2Velocity = paramFloat4;
      mStage3Velocity = paramFloat4;
      paramFloat1 = (paramFloat4 - f1) / paramFloat3;
      mStage1Duration = paramFloat1;
      paramFloat3 = paramFloat4 / paramFloat3;
      mStage3Duration = paramFloat3;
      paramFloat1 = (f1 + paramFloat4) * paramFloat1 / 2.0F;
      paramFloat3 = paramFloat3 * paramFloat4 / 2.0F;
      mStage2Duration = ((paramFloat2 - paramFloat1 - paramFloat3) / paramFloat4);
      mStage1EndPosition = paramFloat1;
      mStage2EndPosition = (paramFloat2 - paramFloat3);
      mStage3EndPosition = paramFloat2;
      return;
    }
    if (f2 >= paramFloat2)
    {
      mType = "hard stop";
      paramFloat1 = 2.0F * paramFloat2 / f1;
      mNumberOfStages = 1;
      mStage1Velocity = f1;
      mStage2Velocity = 0.0F;
      mStage1EndPosition = paramFloat2;
      mStage1Duration = paramFloat1;
      return;
    }
    f2 = paramFloat2 - f2;
    float f3 = f2 / f1;
    if (f3 + paramFloat1 < paramFloat5)
    {
      mType = "cruse decelerate";
      mNumberOfStages = 2;
      mStage1Velocity = f1;
      mStage2Velocity = f1;
      mStage3Velocity = 0.0F;
      mStage1EndPosition = f2;
      mStage2EndPosition = paramFloat2;
      mStage1Duration = f3;
      mStage2Duration = paramFloat1;
      return;
    }
    paramFloat1 = (float)Math.sqrt(f1 * f1 / 2.0F + paramFloat3 * paramFloat2);
    paramFloat5 = (paramFloat1 - f1) / paramFloat3;
    mStage1Duration = paramFloat5;
    f2 = paramFloat1 / paramFloat3;
    mStage2Duration = f2;
    if (paramFloat1 < paramFloat4)
    {
      mType = "accelerate decelerate";
      mNumberOfStages = 2;
      mStage1Velocity = f1;
      mStage2Velocity = paramFloat1;
      mStage3Velocity = 0.0F;
      mStage1Duration = paramFloat5;
      mStage2Duration = f2;
      mStage1EndPosition = ((f1 + paramFloat1) * paramFloat5 / 2.0F);
      mStage2EndPosition = paramFloat2;
      return;
    }
    mType = "accelerate cruse decelerate";
    mNumberOfStages = 3;
    mStage1Velocity = f1;
    mStage2Velocity = paramFloat4;
    mStage3Velocity = paramFloat4;
    paramFloat1 = (paramFloat4 - f1) / paramFloat3;
    mStage1Duration = paramFloat1;
    paramFloat3 = paramFloat4 / paramFloat3;
    mStage3Duration = paramFloat3;
    paramFloat1 = (f1 + paramFloat4) * paramFloat1 / 2.0F;
    paramFloat3 = paramFloat3 * paramFloat4 / 2.0F;
    mStage2Duration = ((paramFloat2 - paramFloat1 - paramFloat3) / paramFloat4);
    mStage1EndPosition = paramFloat1;
    mStage2EndPosition = (paramFloat2 - paramFloat3);
    mStage3EndPosition = paramFloat2;
  }
  
  public void config(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    boolean bool = false;
    mDone = false;
    mStartPosition = paramFloat1;
    if (paramFloat1 > paramFloat2) {
      bool = true;
    }
    mBackwards = bool;
    if (bool) {
      setup(-paramFloat3, paramFloat1 - paramFloat2, paramFloat5, paramFloat6, paramFloat4);
    } else {
      setup(paramFloat3, paramFloat2 - paramFloat1, paramFloat5, paramFloat6, paramFloat4);
    }
  }
  
  public String debug(String paramString, float paramFloat)
  {
    Object localObject1 = z2.u(z2.s(z2.u(paramString, " ===== "), mType, "\n"), paramString);
    if (mBackwards) {
      localObject2 = "backwards";
    } else {
      localObject2 = "forward ";
    }
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" time = ");
    ((StringBuilder)localObject1).append(paramFloat);
    ((StringBuilder)localObject1).append("  stages ");
    Object localObject2 = a.s(z2.q((StringBuilder)localObject1, mNumberOfStages, "\n"), paramString, " dur ");
    ((StringBuilder)localObject2).append(mStage1Duration);
    ((StringBuilder)localObject2).append(" vel ");
    ((StringBuilder)localObject2).append(mStage1Velocity);
    ((StringBuilder)localObject2).append(" pos ");
    ((StringBuilder)localObject2).append(mStage1EndPosition);
    ((StringBuilder)localObject2).append("\n");
    localObject1 = ((StringBuilder)localObject2).toString();
    localObject2 = localObject1;
    if (mNumberOfStages > 1)
    {
      localObject2 = a.s((String)localObject1, paramString, " dur ");
      ((StringBuilder)localObject2).append(mStage2Duration);
      ((StringBuilder)localObject2).append(" vel ");
      ((StringBuilder)localObject2).append(mStage2Velocity);
      ((StringBuilder)localObject2).append(" pos ");
      ((StringBuilder)localObject2).append(mStage2EndPosition);
      ((StringBuilder)localObject2).append("\n");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (mNumberOfStages > 2)
    {
      localObject2 = a.s((String)localObject2, paramString, " dur ");
      ((StringBuilder)localObject2).append(mStage3Duration);
      ((StringBuilder)localObject2).append(" vel ");
      ((StringBuilder)localObject2).append(mStage3Velocity);
      ((StringBuilder)localObject2).append(" pos ");
      ((StringBuilder)localObject2).append(mStage3EndPosition);
      ((StringBuilder)localObject2).append("\n");
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    float f = mStage1Duration;
    if (paramFloat <= f) {
      return z2.p((String)localObject1, paramString, "stage 0\n");
    }
    int i = mNumberOfStages;
    if (i == 1) {
      return z2.p((String)localObject1, paramString, "end stage 0\n");
    }
    paramFloat -= f;
    f = mStage2Duration;
    if (paramFloat < f) {
      return z2.p((String)localObject1, paramString, " stage 1\n");
    }
    if (i == 2) {
      return z2.p((String)localObject1, paramString, "end stage 1\n");
    }
    if (paramFloat - f < mStage3Duration) {
      return z2.p((String)localObject1, paramString, " stage 2\n");
    }
    return z2.p((String)localObject1, paramString, " end stage 2\n");
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = calcY(paramFloat);
    mLastPosition = paramFloat;
    if (mBackwards) {
      paramFloat = mStartPosition - f;
    } else {
      paramFloat = mStartPosition + f;
    }
    return paramFloat;
  }
  
  public float getVelocity()
  {
    float f;
    if (mBackwards) {
      f = -getVelocity(mLastPosition);
    } else {
      f = getVelocity(mLastPosition);
    }
    return f;
  }
  
  public float getVelocity(float paramFloat)
  {
    float f1 = mStage1Duration;
    float f2;
    float f3;
    float f4;
    if (paramFloat <= f1)
    {
      f2 = mStage1Velocity;
      f3 = mStage2Velocity;
      f4 = paramFloat;
    }
    int i;
    for (paramFloat = f3;; paramFloat = mStage3Velocity)
    {
      return (paramFloat - f2) * f4 / f1 + f2;
      i = mNumberOfStages;
      if (i == 1) {
        return 0.0F;
      }
      f4 = paramFloat - f1;
      f1 = mStage2Duration;
      if (f4 >= f1) {
        break;
      }
      f2 = mStage2Velocity;
    }
    if (i == 2) {
      return mStage2EndPosition;
    }
    f1 = f4 - f1;
    paramFloat = mStage3Duration;
    if (f1 < paramFloat)
    {
      f4 = mStage3Velocity;
      return f4 - f1 * f4 / paramFloat;
    }
    return mStage3EndPosition;
  }
  
  public boolean isStopped()
  {
    boolean bool;
    if ((getVelocity() < 1.0E-5F) && (Math.abs(mStage3EndPosition - mLastPosition) < 1.0E-5F)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.StopLogicEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */