package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;

final class ExoPlayerImplInternal$PlaybackInfoUpdate
{
  private int discontinuityReason;
  private PlaybackInfo lastPlaybackInfo;
  private int operationAcks;
  private boolean positionDiscontinuity;
  
  public boolean hasPendingUpdate(PlaybackInfo paramPlaybackInfo)
  {
    boolean bool;
    if ((paramPlaybackInfo == lastPlaybackInfo) && (operationAcks <= 0) && (!positionDiscontinuity)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void incrementPendingOperationAcks(int paramInt)
  {
    operationAcks += paramInt;
  }
  
  public void reset(PlaybackInfo paramPlaybackInfo)
  {
    lastPlaybackInfo = paramPlaybackInfo;
    operationAcks = 0;
    positionDiscontinuity = false;
  }
  
  public void setPositionDiscontinuity(int paramInt)
  {
    boolean bool1 = positionDiscontinuity;
    boolean bool2 = true;
    if ((bool1) && (discontinuityReason != 4))
    {
      if (paramInt != 4) {
        bool2 = false;
      }
      Assertions.checkArgument(bool2);
      return;
    }
    positionDiscontinuity = true;
    discontinuityReason = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */