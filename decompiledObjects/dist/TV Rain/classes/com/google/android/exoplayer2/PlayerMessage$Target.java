package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

public abstract interface PlayerMessage$Target
{
  public abstract void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.PlayerMessage.Target
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */