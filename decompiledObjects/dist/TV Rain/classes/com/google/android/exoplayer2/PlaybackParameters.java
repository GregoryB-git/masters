package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

public final class PlaybackParameters
{
  public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0F);
  public final float pitch;
  private final int scaledUsPerMs;
  public final boolean skipSilence;
  public final float speed;
  
  public PlaybackParameters(float paramFloat)
  {
    this(paramFloat, 1.0F, false);
  }
  
  public PlaybackParameters(float paramFloat1, float paramFloat2)
  {
    this(paramFloat1, paramFloat2, false);
  }
  
  public PlaybackParameters(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramFloat1 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramFloat2 > 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    speed = paramFloat1;
    pitch = paramFloat2;
    skipSilence = paramBoolean;
    scaledUsPerMs = Math.round(paramFloat1 * 1000.0F);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (PlaybackParameters.class == paramObject.getClass()))
    {
      paramObject = (PlaybackParameters)paramObject;
      if ((speed != speed) || (pitch != pitch) || (skipSilence != skipSilence)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long getMediaTimeUsForPlayoutTimeMs(long paramLong)
  {
    return paramLong * scaledUsPerMs;
  }
  
  public int hashCode()
  {
    int i = Float.floatToRawIntBits(speed);
    return (Float.floatToRawIntBits(pitch) + (i + 527) * 31) * 31 + skipSilence;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.PlaybackParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */