package com.google.android.exoplayer2.audio;

public final class AudioAttributes$Builder
{
  private int contentType = 0;
  private int flags = 0;
  private int usage = 1;
  
  public AudioAttributes build()
  {
    return new AudioAttributes(contentType, flags, usage, null);
  }
  
  public Builder setContentType(int paramInt)
  {
    contentType = paramInt;
    return this;
  }
  
  public Builder setFlags(int paramInt)
  {
    flags = paramInt;
    return this;
  }
  
  public Builder setUsage(int paramInt)
  {
    usage = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioAttributes.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */