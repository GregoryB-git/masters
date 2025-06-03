package com.google.android.exoplayer2.audio;

import a;

public final class AudioSink$WriteException
  extends Exception
{
  public final int errorCode;
  
  public AudioSink$WriteException(int paramInt)
  {
    super(a.f("AudioTrack write failed: ", paramInt));
    errorCode = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioSink.WriteException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */