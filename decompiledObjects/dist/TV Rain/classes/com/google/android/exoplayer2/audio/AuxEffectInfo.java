package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

public final class AuxEffectInfo
{
  public static final int NO_AUX_EFFECT_ID = 0;
  public final int effectId;
  public final float sendLevel;
  
  public AuxEffectInfo(int paramInt, float paramFloat)
  {
    effectId = paramInt;
    sendLevel = paramFloat;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (AuxEffectInfo.class == paramObject.getClass()))
    {
      paramObject = (AuxEffectInfo)paramObject;
      if ((effectId != effectId) || (Float.compare(sendLevel, sendLevel) != 0)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = effectId;
    return Float.floatToIntBits(sendLevel) + (527 + i) * 31;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AuxEffectInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */