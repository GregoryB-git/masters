package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

public final class SeekParameters
{
  public static final SeekParameters CLOSEST_SYNC;
  public static final SeekParameters DEFAULT;
  public static final SeekParameters EXACT;
  public static final SeekParameters NEXT_SYNC;
  public static final SeekParameters PREVIOUS_SYNC;
  public final long toleranceAfterUs;
  public final long toleranceBeforeUs;
  
  static
  {
    SeekParameters localSeekParameters = new SeekParameters(0L, 0L);
    EXACT = localSeekParameters;
    CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
    PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
    NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
    DEFAULT = localSeekParameters;
  }
  
  public SeekParameters(long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramLong2 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    toleranceBeforeUs = paramLong1;
    toleranceAfterUs = paramLong2;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (SeekParameters.class == paramObject.getClass()))
    {
      paramObject = (SeekParameters)paramObject;
      if ((toleranceBeforeUs != toleranceBeforeUs) || (toleranceAfterUs != toleranceAfterUs)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (int)toleranceBeforeUs * 31 + (int)toleranceAfterUs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.SeekParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */