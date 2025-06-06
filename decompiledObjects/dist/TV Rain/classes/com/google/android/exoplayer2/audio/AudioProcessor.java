package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract interface AudioProcessor
{
  public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
  
  public abstract boolean configure(int paramInt1, int paramInt2, int paramInt3)
    throws AudioProcessor.UnhandledFormatException;
  
  public abstract void flush();
  
  public abstract ByteBuffer getOutput();
  
  public abstract int getOutputChannelCount();
  
  public abstract int getOutputEncoding();
  
  public abstract int getOutputSampleRateHz();
  
  public abstract boolean isActive();
  
  public abstract boolean isEnded();
  
  public abstract void queueEndOfStream();
  
  public abstract void queueInput(ByteBuffer paramByteBuffer);
  
  public abstract void reset();
  
  public static final class UnhandledFormatException
    extends Exception
  {
    public UnhandledFormatException(int paramInt1, int paramInt2, int paramInt3)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */