package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;

public final class MediaSourceEventListener$MediaLoadData
{
  public final int dataType;
  public final long mediaEndTimeMs;
  public final long mediaStartTimeMs;
  @Nullable
  public final Format trackFormat;
  @Nullable
  public final Object trackSelectionData;
  public final int trackSelectionReason;
  public final int trackType;
  
  public MediaSourceEventListener$MediaLoadData(int paramInt1, int paramInt2, @Nullable Format paramFormat, int paramInt3, @Nullable Object paramObject, long paramLong1, long paramLong2)
  {
    dataType = paramInt1;
    trackType = paramInt2;
    trackFormat = paramFormat;
    trackSelectionReason = paramInt3;
    trackSelectionData = paramObject;
    mediaStartTimeMs = paramLong1;
    mediaEndTimeMs = paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */