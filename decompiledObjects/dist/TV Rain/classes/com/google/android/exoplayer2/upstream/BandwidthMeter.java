package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;

public abstract interface BandwidthMeter
{
  public abstract void addEventListener(Handler paramHandler, EventListener paramEventListener);
  
  public abstract long getBitrateEstimate();
  
  @Nullable
  public abstract TransferListener getTransferListener();
  
  public abstract void removeEventListener(EventListener paramEventListener);
  
  public static abstract interface EventListener
  {
    public abstract void onBandwidthSample(int paramInt, long paramLong1, long paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.BandwidthMeter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */