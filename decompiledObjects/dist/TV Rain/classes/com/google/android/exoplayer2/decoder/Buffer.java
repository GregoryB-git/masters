package com.google.android.exoplayer2.decoder;

public abstract class Buffer
{
  private int flags;
  
  public final void addFlag(int paramInt)
  {
    flags = (paramInt | flags);
  }
  
  public void clear()
  {
    flags = 0;
  }
  
  public final void clearFlag(int paramInt)
  {
    flags = (paramInt & flags);
  }
  
  public final boolean getFlag(int paramInt)
  {
    boolean bool;
    if ((flags & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isDecodeOnly()
  {
    return getFlag(Integer.MIN_VALUE);
  }
  
  public final boolean isEndOfStream()
  {
    return getFlag(4);
  }
  
  public final boolean isKeyFrame()
  {
    return getFlag(1);
  }
  
  public final void setFlags(int paramInt)
  {
    flags = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.Buffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */