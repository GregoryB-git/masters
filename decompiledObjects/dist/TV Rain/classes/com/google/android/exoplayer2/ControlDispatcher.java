package com.google.android.exoplayer2;

public abstract interface ControlDispatcher
{
  public abstract boolean dispatchSeekTo(Player paramPlayer, int paramInt, long paramLong);
  
  public abstract boolean dispatchSetPlayWhenReady(Player paramPlayer, boolean paramBoolean);
  
  public abstract boolean dispatchSetRepeatMode(Player paramPlayer, int paramInt);
  
  public abstract boolean dispatchSetShuffleModeEnabled(Player paramPlayer, boolean paramBoolean);
  
  public abstract boolean dispatchStop(Player paramPlayer, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ControlDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */