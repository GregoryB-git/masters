package com.google.android.exoplayer2.audio;

public final class AudioSink$InitializationException
  extends Exception
{
  public final int audioTrackState;
  
  public AudioSink$InitializationException(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(localStringBuilder.toString());
    audioTrackState = paramInt1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioSink.InitializationException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */