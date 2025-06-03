package androidx.palette.graphics;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

public final class Target
{
  public static final Target DARK_MUTED;
  public static final Target DARK_VIBRANT;
  public static final int INDEX_MAX = 2;
  public static final int INDEX_MIN = 0;
  public static final int INDEX_TARGET = 1;
  public static final int INDEX_WEIGHT_LUMA = 1;
  public static final int INDEX_WEIGHT_POP = 2;
  public static final int INDEX_WEIGHT_SAT = 0;
  public static final Target LIGHT_MUTED;
  public static final Target LIGHT_VIBRANT;
  private static final float MAX_DARK_LUMA = 0.45F;
  private static final float MAX_MUTED_SATURATION = 0.4F;
  private static final float MAX_NORMAL_LUMA = 0.7F;
  private static final float MIN_LIGHT_LUMA = 0.55F;
  private static final float MIN_NORMAL_LUMA = 0.3F;
  private static final float MIN_VIBRANT_SATURATION = 0.35F;
  public static final Target MUTED;
  private static final float TARGET_DARK_LUMA = 0.26F;
  private static final float TARGET_LIGHT_LUMA = 0.74F;
  private static final float TARGET_MUTED_SATURATION = 0.3F;
  private static final float TARGET_NORMAL_LUMA = 0.5F;
  private static final float TARGET_VIBRANT_SATURATION = 1.0F;
  public static final Target VIBRANT;
  private static final float WEIGHT_LUMA = 0.52F;
  private static final float WEIGHT_POPULATION = 0.24F;
  private static final float WEIGHT_SATURATION = 0.24F;
  public boolean mIsExclusive;
  public final float[] mLightnessTargets;
  public final float[] mSaturationTargets;
  public final float[] mWeights;
  
  static
  {
    Target localTarget = new Target();
    LIGHT_VIBRANT = localTarget;
    setDefaultLightLightnessValues(localTarget);
    setDefaultVibrantSaturationValues(localTarget);
    localTarget = new Target();
    VIBRANT = localTarget;
    setDefaultNormalLightnessValues(localTarget);
    setDefaultVibrantSaturationValues(localTarget);
    localTarget = new Target();
    DARK_VIBRANT = localTarget;
    setDefaultDarkLightnessValues(localTarget);
    setDefaultVibrantSaturationValues(localTarget);
    localTarget = new Target();
    LIGHT_MUTED = localTarget;
    setDefaultLightLightnessValues(localTarget);
    setDefaultMutedSaturationValues(localTarget);
    localTarget = new Target();
    MUTED = localTarget;
    setDefaultNormalLightnessValues(localTarget);
    setDefaultMutedSaturationValues(localTarget);
    localTarget = new Target();
    DARK_MUTED = localTarget;
    setDefaultDarkLightnessValues(localTarget);
    setDefaultMutedSaturationValues(localTarget);
  }
  
  public Target()
  {
    float[] arrayOfFloat1 = new float[3];
    mSaturationTargets = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[3];
    mLightnessTargets = arrayOfFloat2;
    mWeights = new float[3];
    mIsExclusive = true;
    setTargetDefaultValues(arrayOfFloat1);
    setTargetDefaultValues(arrayOfFloat2);
    setDefaultWeights();
  }
  
  public Target(@NonNull Target paramTarget)
  {
    float[] arrayOfFloat1 = new float[3];
    mSaturationTargets = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[3];
    mLightnessTargets = arrayOfFloat2;
    float[] arrayOfFloat3 = new float[3];
    mWeights = arrayOfFloat3;
    mIsExclusive = true;
    System.arraycopy(mSaturationTargets, 0, arrayOfFloat1, 0, arrayOfFloat1.length);
    System.arraycopy(mLightnessTargets, 0, arrayOfFloat2, 0, arrayOfFloat2.length);
    System.arraycopy(mWeights, 0, arrayOfFloat3, 0, arrayOfFloat3.length);
  }
  
  private static void setDefaultDarkLightnessValues(Target paramTarget)
  {
    paramTarget = mLightnessTargets;
    paramTarget[1] = 0.26F;
    paramTarget[2] = 0.45F;
  }
  
  private static void setDefaultLightLightnessValues(Target paramTarget)
  {
    paramTarget = mLightnessTargets;
    paramTarget[0] = 0.55F;
    paramTarget[1] = 0.74F;
  }
  
  private static void setDefaultMutedSaturationValues(Target paramTarget)
  {
    paramTarget = mSaturationTargets;
    paramTarget[1] = 0.3F;
    paramTarget[2] = 0.4F;
  }
  
  private static void setDefaultNormalLightnessValues(Target paramTarget)
  {
    paramTarget = mLightnessTargets;
    paramTarget[0] = 0.3F;
    paramTarget[1] = 0.5F;
    paramTarget[2] = 0.7F;
  }
  
  private static void setDefaultVibrantSaturationValues(Target paramTarget)
  {
    paramTarget = mSaturationTargets;
    paramTarget[0] = 0.35F;
    paramTarget[1] = 1.0F;
  }
  
  private void setDefaultWeights()
  {
    float[] arrayOfFloat = mWeights;
    arrayOfFloat[0] = 0.24F;
    arrayOfFloat[1] = 0.52F;
    arrayOfFloat[2] = 0.24F;
  }
  
  private static void setTargetDefaultValues(float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] = 0.0F;
    paramArrayOfFloat[1] = 0.5F;
    paramArrayOfFloat[2] = 1.0F;
  }
  
  public float getLightnessWeight()
  {
    return mWeights[1];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getMaximumLightness()
  {
    return mLightnessTargets[2];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getMaximumSaturation()
  {
    return mSaturationTargets[2];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getMinimumLightness()
  {
    return mLightnessTargets[0];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getMinimumSaturation()
  {
    return mSaturationTargets[0];
  }
  
  public float getPopulationWeight()
  {
    return mWeights[2];
  }
  
  public float getSaturationWeight()
  {
    return mWeights[0];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getTargetLightness()
  {
    return mLightnessTargets[1];
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getTargetSaturation()
  {
    return mSaturationTargets[1];
  }
  
  public boolean isExclusive()
  {
    return mIsExclusive;
  }
  
  public void normalizeWeights()
  {
    int i = mWeights.length;
    int j = 0;
    int k = 0;
    float f3;
    for (float f1 = 0.0F; k < i; f1 = f3)
    {
      float f2 = mWeights[k];
      f3 = f1;
      if (f2 > 0.0F) {
        f3 = f1 + f2;
      }
      k++;
    }
    if (f1 != 0.0F)
    {
      i = mWeights.length;
      for (k = j; k < i; k++)
      {
        float[] arrayOfFloat = mWeights;
        f3 = arrayOfFloat[k];
        if (f3 > 0.0F) {
          arrayOfFloat[k] = (f3 / f1);
        }
      }
    }
  }
  
  public static final class Builder
  {
    private final Target mTarget;
    
    public Builder()
    {
      mTarget = new Target();
    }
    
    public Builder(@NonNull Target paramTarget)
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
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Target
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */