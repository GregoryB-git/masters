package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;

public final class HlsMediaPlaylist$Segment
  implements Comparable<Long>
{
  public final long byterangeLength;
  public final long byterangeOffset;
  @Nullable
  public final DrmInitData drmInitData;
  public final long durationUs;
  @Nullable
  public final String encryptionIV;
  @Nullable
  public final String fullSegmentEncryptionKeyUri;
  public final boolean hasGapTag;
  @Nullable
  public final Segment initializationSegment;
  public final int relativeDiscontinuitySequence;
  public final long relativeStartTimeUs;
  public final String title;
  public final String url;
  
  public HlsMediaPlaylist$Segment(String paramString, long paramLong1, long paramLong2)
  {
    this(paramString, null, "", 0L, -1, -9223372036854775807L, null, null, null, paramLong1, paramLong2, false);
  }
  
  public HlsMediaPlaylist$Segment(String paramString1, @Nullable Segment paramSegment, String paramString2, long paramLong1, int paramInt, long paramLong2, @Nullable DrmInitData paramDrmInitData, @Nullable String paramString3, @Nullable String paramString4, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    url = paramString1;
    initializationSegment = paramSegment;
    title = paramString2;
    durationUs = paramLong1;
    relativeDiscontinuitySequence = paramInt;
    relativeStartTimeUs = paramLong2;
    drmInitData = paramDrmInitData;
    fullSegmentEncryptionKeyUri = paramString3;
    encryptionIV = paramString4;
    byterangeOffset = paramLong3;
    byterangeLength = paramLong4;
    hasGapTag = paramBoolean;
  }
  
  public int compareTo(@NonNull Long paramLong)
  {
    int i;
    if (relativeStartTimeUs > paramLong.longValue()) {
      i = 1;
    } else if (relativeStartTimeUs < paramLong.longValue()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */