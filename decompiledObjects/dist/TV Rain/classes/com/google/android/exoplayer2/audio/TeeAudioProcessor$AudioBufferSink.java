package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public abstract interface TeeAudioProcessor$AudioBufferSink
{
  public abstract void flush(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void handleBuffer(ByteBuffer paramByteBuffer);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.TeeAudioProcessor.AudioBufferSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */