package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class HlsMediaPlaylist
  extends HlsPlaylist
{
  public static final int PLAYLIST_TYPE_EVENT = 2;
  public static final int PLAYLIST_TYPE_UNKNOWN = 0;
  public static final int PLAYLIST_TYPE_VOD = 1;
  public final int discontinuitySequence;
  public final long durationUs;
  public final boolean hasDiscontinuitySequence;
  public final boolean hasEndTag;
  public final boolean hasProgramDateTime;
  public final long mediaSequence;
  public final int playlistType;
  @Nullable
  public final DrmInitData protectionSchemes;
  public final List<Segment> segments;
  public final long startOffsetUs;
  public final long startTimeUs;
  public final long targetDurationUs;
  public final int version;
  
  public HlsMediaPlaylist(int paramInt1, String paramString, List<String> paramList, long paramLong1, long paramLong2, boolean paramBoolean1, int paramInt2, long paramLong3, int paramInt3, long paramLong4, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, @Nullable DrmInitData paramDrmInitData, List<Segment> paramList1)
  {
    super(paramString, paramList, paramBoolean2);
    playlistType = paramInt1;
    startTimeUs = paramLong2;
    hasDiscontinuitySequence = paramBoolean1;
    discontinuitySequence = paramInt2;
    mediaSequence = paramLong3;
    version = paramInt3;
    targetDurationUs = paramLong4;
    hasEndTag = paramBoolean3;
    hasProgramDateTime = paramBoolean4;
    protectionSchemes = paramDrmInitData;
    segments = Collections.unmodifiableList(paramList1);
    if (!paramList1.isEmpty())
    {
      paramString = (Segment)paramList1.get(paramList1.size() - 1);
      durationUs = (relativeStartTimeUs + durationUs);
    }
    else
    {
      durationUs = 0L;
    }
    if (paramLong1 == -9223372036854775807L) {
      paramLong1 = -9223372036854775807L;
    } else if (paramLong1 < 0L) {
      paramLong1 = durationUs + paramLong1;
    }
    startOffsetUs = paramLong1;
  }
  
  public HlsMediaPlaylist copy(List<StreamKey> paramList)
  {
    return this;
  }
  
  public HlsMediaPlaylist copyWith(long paramLong, int paramInt)
  {
    return new HlsMediaPlaylist(playlistType, baseUri, tags, startOffsetUs, paramLong, true, paramInt, mediaSequence, version, targetDurationUs, hasIndependentSegments, hasEndTag, hasProgramDateTime, protectionSchemes, segments);
  }
  
  public HlsMediaPlaylist copyWithEndTag()
  {
    if (hasEndTag) {
      return this;
    }
    return new HlsMediaPlaylist(playlistType, baseUri, tags, startOffsetUs, startTimeUs, hasDiscontinuitySequence, discontinuitySequence, mediaSequence, version, targetDurationUs, hasIndependentSegments, true, hasProgramDateTime, protectionSchemes, segments);
  }
  
  public long getEndTimeUs()
  {
    return startTimeUs + durationUs;
  }
  
  public boolean isNewerThan(HlsMediaPlaylist paramHlsMediaPlaylist)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramHlsMediaPlaylist != null)
    {
      long l1 = mediaSequence;
      long l2 = mediaSequence;
      if (l1 > l2)
      {
        bool2 = bool1;
      }
      else
      {
        if (l1 < l2) {
          return false;
        }
        int i = segments.size();
        int j = segments.size();
        bool2 = bool1;
        if (i <= j) {
          if ((i == j) && (hasEndTag) && (!hasEndTag)) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
      }
    }
    return bool2;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PlaylistType {}
  
  public static final class Segment
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
    
    public Segment(String paramString, long paramLong1, long paramLong2)
    {
      this(paramString, null, "", 0L, -1, -9223372036854775807L, null, null, null, paramLong1, paramLong2, false);
    }
    
    public Segment(String paramString1, @Nullable Segment paramSegment, String paramString2, long paramLong1, int paramInt, long paramLong2, @Nullable DrmInitData paramDrmInitData, @Nullable String paramString3, @Nullable String paramString4, long paramLong3, long paramLong4, boolean paramBoolean)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */