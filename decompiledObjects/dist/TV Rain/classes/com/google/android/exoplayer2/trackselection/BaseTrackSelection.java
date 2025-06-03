package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class BaseTrackSelection
  implements TrackSelection
{
  private final long[] blacklistUntilTimes;
  private final Format[] formats;
  public final TrackGroup group;
  private int hashCode;
  public final int length;
  public final int[] tracks;
  
  public BaseTrackSelection(TrackGroup paramTrackGroup, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    group = ((TrackGroup)Assertions.checkNotNull(paramTrackGroup));
    i = paramVarArgs.length;
    length = i;
    formats = new Format[i];
    for (i = 0; i < paramVarArgs.length; i++) {
      formats[i] = paramTrackGroup.getFormat(paramVarArgs[i]);
    }
    Arrays.sort(formats, new DecreasingBandwidthComparator(null));
    tracks = new int[length];
    for (i = j;; i++)
    {
      j = length;
      if (i >= j) {
        break;
      }
      tracks[i] = paramTrackGroup.indexOf(formats[i]);
    }
    blacklistUntilTimes = new long[j];
  }
  
  public final boolean blacklist(int paramInt, long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    boolean bool = isBlacklisted(paramInt, l);
    for (int i = 0; (i < length) && (!bool); i++) {
      if ((i != paramInt) && (!isBlacklisted(i, l))) {
        bool = true;
      } else {
        bool = false;
      }
    }
    if (!bool) {
      return false;
    }
    long[] arrayOfLong = blacklistUntilTimes;
    arrayOfLong[paramInt] = Math.max(arrayOfLong[paramInt], l + paramLong);
    return true;
  }
  
  public void disable() {}
  
  public void enable() {}
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (BaseTrackSelection)paramObject;
      if ((group != group) || (!Arrays.equals(tracks, tracks))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int evaluateQueueSize(long paramLong, List<? extends MediaChunk> paramList)
  {
    return paramList.size();
  }
  
  public final Format getFormat(int paramInt)
  {
    return formats[paramInt];
  }
  
  public final int getIndexInTrackGroup(int paramInt)
  {
    return tracks[paramInt];
  }
  
  public final Format getSelectedFormat()
  {
    return formats[getSelectedIndex()];
  }
  
  public final int getSelectedIndexInTrackGroup()
  {
    return tracks[getSelectedIndex()];
  }
  
  public final TrackGroup getTrackGroup()
  {
    return group;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = System.identityHashCode(group);
      hashCode = (Arrays.hashCode(tracks) + i * 31);
    }
    return hashCode;
  }
  
  public final int indexOf(int paramInt)
  {
    for (int i = 0; i < length; i++) {
      if (tracks[i] == paramInt) {
        return i;
      }
    }
    return -1;
  }
  
  public final int indexOf(Format paramFormat)
  {
    for (int i = 0; i < length; i++) {
      if (formats[i] == paramFormat) {
        return i;
      }
    }
    return -1;
  }
  
  public final boolean isBlacklisted(int paramInt, long paramLong)
  {
    boolean bool;
    if (blacklistUntilTimes[paramInt] > paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int length()
  {
    return tracks.length;
  }
  
  public void onPlaybackSpeed(float paramFloat) {}
  
  public static final class DecreasingBandwidthComparator
    implements Comparator<Format>
  {
    public int compare(Format paramFormat1, Format paramFormat2)
    {
      return bitrate - bitrate;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.BaseTrackSelection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */