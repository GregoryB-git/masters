package com.google.android.exoplayer2;

public class DefaultControlDispatcher
  implements ControlDispatcher
{
  public boolean dispatchSeekTo(Player paramPlayer, int paramInt, long paramLong)
  {
    paramPlayer.seekTo(paramInt, paramLong);
    return true;
  }
  
  public boolean dispatchSetPlayWhenReady(Player paramPlayer, boolean paramBoolean)
  {
    paramPlayer.setPlayWhenReady(paramBoolean);
    return true;
  }
  
  public boolean dispatchSetRepeatMode(Player paramPlayer, int paramInt)
  {
    paramPlayer.setRepeatMode(paramInt);
    return true;
  }
  
  public boolean dispatchSetShuffleModeEnabled(Player paramPlayer, boolean paramBoolean)
  {
    paramPlayer.setShuffleModeEnabled(paramBoolean);
    return true;
  }
  
  public boolean dispatchStop(Player paramPlayer, boolean paramBoolean)
  {
    paramPlayer.stop(paramBoolean);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.DefaultControlDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */