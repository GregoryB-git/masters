package com.google.android.exoplayer2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

final class ExoPlayerImplInternal$PendingMessageInfo
  implements Comparable<PendingMessageInfo>
{
  public final PlayerMessage message;
  public int resolvedPeriodIndex;
  public long resolvedPeriodTimeUs;
  @Nullable
  public Object resolvedPeriodUid;
  
  public ExoPlayerImplInternal$PendingMessageInfo(PlayerMessage paramPlayerMessage)
  {
    message = paramPlayerMessage;
  }
  
  public int compareTo(@NonNull PendingMessageInfo paramPendingMessageInfo)
  {
    Object localObject = resolvedPeriodUid;
    int i = 1;
    if (localObject == null) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (resolvedPeriodUid == null) {
      k = 1;
    } else {
      k = 0;
    }
    if (j != k)
    {
      j = i;
      if (localObject != null) {
        j = -1;
      }
      return j;
    }
    if (localObject == null) {
      return 0;
    }
    int j = resolvedPeriodIndex - resolvedPeriodIndex;
    if (j != 0) {
      return j;
    }
    return Util.compareLong(resolvedPeriodTimeUs, resolvedPeriodTimeUs);
  }
  
  public void setResolvedPosition(int paramInt, long paramLong, Object paramObject)
  {
    resolvedPeriodIndex = paramInt;
    resolvedPeriodTimeUs = paramLong;
    resolvedPeriodUid = paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */