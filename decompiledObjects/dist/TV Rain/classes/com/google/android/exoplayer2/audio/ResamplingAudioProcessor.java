package com.google.android.exoplayer2.audio;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class ResamplingAudioProcessor
  implements AudioProcessor
{
  private ByteBuffer buffer;
  private int channelCount = -1;
  private int encoding = 0;
  private boolean inputEnded;
  private ByteBuffer outputBuffer;
  private int sampleRateHz = -1;
  
  public ResamplingAudioProcessor()
  {
    ByteBuffer localByteBuffer = AudioProcessor.EMPTY_BUFFER;
    buffer = localByteBuffer;
    outputBuffer = localByteBuffer;
  }
  
  public boolean configure(int paramInt1, int paramInt2, int paramInt3)
    throws AudioProcessor.UnhandledFormatException
  {
    if ((paramInt3 != 3) && (paramInt3 != 2) && (paramInt3 != Integer.MIN_VALUE) && (paramInt3 != 1073741824)) {
      throw new AudioProcessor.UnhandledFormatException(paramInt1, paramInt2, paramInt3);
    }
    if ((sampleRateHz == paramInt1) && (channelCount == paramInt2) && (encoding == paramInt3)) {
      return false;
    }
    sampleRateHz = paramInt1;
    channelCount = paramInt2;
    encoding = paramInt3;
    return true;
  }
  
  public void flush()
  {
    outputBuffer = AudioProcessor.EMPTY_BUFFER;
    inputEnded = false;
  }
  
  public ByteBuffer getOutput()
  {
    ByteBuffer localByteBuffer = outputBuffer;
    outputBuffer = AudioProcessor.EMPTY_BUFFER;
    return localByteBuffer;
  }
  
  public int getOutputChannelCount()
  {
    return channelCount;
  }
  
  public int getOutputEncoding()
  {
    return 2;
  }
  
  public int getOutputSampleRateHz()
  {
    return sampleRateHz;
  }
  
  public boolean isActive()
  {
    int i = encoding;
    boolean bool;
    if ((i != 0) && (i != 2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEnded()
  {
    boolean bool;
    if ((inputEnded) && (outputBuffer == AudioProcessor.EMPTY_BUFFER)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void queueEndOfStream()
  {
    inputEnded = true;
  }
  
  public void queueInput(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    int m = encoding;
    if (m != Integer.MIN_VALUE)
    {
      n = k;
      if (m != 3)
      {
        if (m == 1073741824)
        {
          n = k / 2;
          break label74;
        }
        throw new IllegalStateException();
      }
    }
    else
    {
      n = k / 3;
    }
    n *= 2;
    label74:
    if (buffer.capacity() < n) {
      buffer = ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    } else {
      buffer.clear();
    }
    k = encoding;
    int n = i;
    if (k != Integer.MIN_VALUE)
    {
      n = i;
      if (k != 3)
      {
        if (k == 1073741824) {
          while (i < j)
          {
            buffer.put(paramByteBuffer.get(i + 2));
            buffer.put(paramByteBuffer.get(i + 3));
            i += 4;
          }
        }
        throw new IllegalStateException();
      }
      while (n < j)
      {
        buffer.put((byte)0);
        buffer.put((byte)((paramByteBuffer.get(n) & 0xFF) - 128));
        n++;
      }
    }
    while (n < j)
    {
      buffer.put(paramByteBuffer.get(n + 1));
      buffer.put(paramByteBuffer.get(n + 2));
      n += 3;
    }
    paramByteBuffer.position(paramByteBuffer.limit());
    buffer.flip();
    outputBuffer = buffer;
  }
  
  public void reset()
  {
    flush();
    sampleRateHz = -1;
    channelCount = -1;
    encoding = 0;
    buffer = AudioProcessor.EMPTY_BUFFER;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.ResamplingAudioProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */