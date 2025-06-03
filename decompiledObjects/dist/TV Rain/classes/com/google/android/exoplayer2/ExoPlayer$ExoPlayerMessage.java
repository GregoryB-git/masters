package com.google.android.exoplayer2;

@Deprecated
public final class ExoPlayer$ExoPlayerMessage
{
  public final Object message;
  public final int messageType;
  public final PlayerMessage.Target target;
  
  @Deprecated
  public ExoPlayer$ExoPlayerMessage(PlayerMessage.Target paramTarget, int paramInt, Object paramObject)
  {
    target = paramTarget;
    messageType = paramInt;
    message = paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayer.ExoPlayerMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */