package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class FloatResamplingAudioProcessor
  implements AudioProcessor
{
  private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(NaN.0F);
  private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10D;
  private ByteBuffer buffer;
  private int channelCount = -1;
  private boolean inputEnded;
  private ByteBuffer outputBuffer;
  private int sampleRateHz = -1;
  private int sourceEncoding = 0;
  
  public FloatResamplingAudioProcessor()
  {
    ByteBuffer localByteBuffer = AudioProcessor.EMPTY_BUFFER;
    buffer = localByteBuffer;
    outputBuffer = localByteBuffer;
  }
  
  private static void writePcm32BitFloat(int paramInt, ByteBuffer paramByteBuffer)
  {
    int i = Float.floatToIntBits((float)(paramInt * 4.656612875245797E-10D));
    paramInt = i;
    if (i == FLOAT_NAN_AS_INT) {
      paramInt = Float.floatToIntBits(0.0F);
    }
    paramByteBuffer.putInt(paramInt);
  }
  
  public boolean configure(int paramInt1, int paramInt2, int paramInt3)
    throws AudioProcessor.UnhandledFormatException
  {
    if (Util.isEncodingHighResolutionIntegerPcm(paramInt3))
    {
      if ((sampleRateHz == paramInt1) && (channelCount == paramInt2) && (sourceEncoding == paramInt3)) {
        return false;
      }
      sampleRateHz = paramInt1;
      channelCount = paramInt2;
      sourceEncoding = paramInt3;
      return true;
    }
    throw new AudioProcessor.UnhandledFormatException(paramInt1, paramInt2, paramInt3);
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
    return 4;
  }
  
  public int getOutputSampleRateHz()
  {
    return sampleRateHz;
  }
  
  public boolean isActive()
  {
    return Util.isEncodingHighResolutionIntegerPcm(sourceEncoding);
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
    int i;
    if (sourceEncoding == 1073741824) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    int m = k - j;
    if (i == 0) {
      m = m / 3 * 4;
    }
    if (buffer.capacity() < m) {
      buffer = ByteBuffer.allocateDirect(m).order(ByteOrder.nativeOrder());
    } else {
      buffer.clear();
    }
    m = j;
    if (i != 0) {
      while (j < k)
      {
        writePcm32BitFloat(paramByteBuffer.get(j) & 0xFF | (paramByteBuffer.get(j + 1) & 0xFF) << 8 | (paramByteBuffer.get(j + 2) & 0xFF) << 16 | (paramByteBuffer.get(j + 3) & 0xFF) << 24, buffer);
        j += 4;
      }
    }
    while (m < k)
    {
      writePcm32BitFloat((paramByteBuffer.get(m) & 0xFF) << 8 | (paramByteBuffer.get(m + 1) & 0xFF) << 16 | (paramByteBuffer.get(m + 2) & 0xFF) << 24, buffer);
      m += 3;
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
    sourceEncoding = 0;
    buffer = AudioProcessor.EMPTY_BUFFER;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */