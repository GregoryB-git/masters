package com.google.android.exoplayer2.decoder;

public abstract class OutputBuffer
  extends Buffer
{
  public int skippedOutputBufferCount;
  public long timeUs;
  
  public abstract void release();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.OutputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */