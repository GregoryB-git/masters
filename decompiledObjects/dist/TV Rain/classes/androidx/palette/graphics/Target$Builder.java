package androidx.palette.graphics;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

public final class Target$Builder
{
  private final Target mTarget;
  
  public Target$Builder()
  {
    mTarget = new Target();
  }
  
  public Target$Builder(@NonNull Target paramTarget)
  {
    mTarget = new Target(paramTarget);
  }
  
  @NonNull
  public Target build()
  {
    return mTarget;
  }
  
  @NonNull
  public Builder setExclusive(boolean paramBoolean)
  {
    mTarget.mIsExclusive = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setLightnessWeight(@FloatRange(from=0.0D) float paramFloat)
  {
    mTarget.mWeights[1] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setMaximumLightness(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mLightnessTargets[2] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setMaximumSaturation(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mSaturationTargets[2] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setMinimumLightness(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mLightnessTargets[0] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setMinimumSaturation(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mSaturationTargets[0] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setPopulationWeight(@FloatRange(from=0.0D) float paramFloat)
  {
    mTarget.mWeights[2] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setSaturationWeight(@FloatRange(from=0.0D) float paramFloat)
  {
    mTarget.mWeights[0] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setTargetLightness(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mLightnessTargets[1] = paramFloat;
    return this;
  }
  
  @NonNull
  public Builder setTargetSaturation(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mTarget.mSaturationTargets[1] = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Target.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */