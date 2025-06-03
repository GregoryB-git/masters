package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class ChannelMappingAudioProcessor
  implements AudioProcessor
{
  private boolean active;
  private ByteBuffer buffer;
  private int channelCount;
  private boolean inputEnded;
  private ByteBuffer outputBuffer;
  @Nullable
  private int[] outputChannels;
  @Nullable
  private int[] pendingOutputChannels;
  private int sampleRateHz;
  
  public ChannelMappingAudioProcessor()
  {
    ByteBuffer localByteBuffer = AudioProcessor.EMPTY_BUFFER;
    buffer = localByteBuffer;
    outputBuffer = localByteBuffer;
    channelCount = -1;
    sampleRateHz = -1;
  }
  
  public boolean configure(int paramInt1, int paramInt2, int paramInt3)
    throws AudioProcessor.UnhandledFormatException
  {
    int i = Arrays.equals(pendingOutputChannels, outputChannels) ^ true;
    int[] arrayOfInt = pendingOutputChannels;
    outputChannels = arrayOfInt;
    if (arrayOfInt == null)
    {
      active = false;
      return i;
    }
    if (paramInt3 == 2)
    {
      if ((i == 0) && (sampleRateHz == paramInt1) && (channelCount == paramInt2)) {
        return false;
      }
      sampleRateHz = paramInt1;
      channelCount = paramInt2;
      if (paramInt2 != arrayOfInt.length) {
        i = 1;
      } else {
        i = 0;
      }
      active = i;
      for (int j = 0;; j++)
      {
        arrayOfInt = outputChannels;
        if (j >= arrayOfInt.length) {
          break label178;
        }
        int k = arrayOfInt[j];
        if (k >= paramInt2) {
          break;
        }
        i = active;
        if (k != j) {
          k = 1;
        } else {
          k = 0;
        }
        active = (k | i);
      }
      throw new AudioProcessor.UnhandledFormatException(paramInt1, paramInt2, paramInt3);
      label178:
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
    int[] arrayOfInt = outputChannels;
    int i;
    if (arrayOfInt == null) {
      i = channelCount;
    } else {
      i = arrayOfInt.length;
    }
    return i;
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
    return active;
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
    boolean bool;
    if (outputChannels != null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = (j - i) / (channelCount * 2) * outputChannels.length * 2;
    if (buffer.capacity() < k) {
      buffer = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
    } else {
      buffer.clear();
    }
    while (i < j)
    {
      for (int n : outputChannels) {
        buffer.putShort(paramByteBuffer.getShort(n * 2 + i));
      }
      i += channelCount * 2;
    }
    paramByteBuffer.position(j);
    buffer.flip();
    outputBuffer = buffer;
  }
  
  public void reset()
  {
    flush();
    buffer = AudioProcessor.EMPTY_BUFFER;
    channelCount = -1;
    sampleRateHz = -1;
    outputChannels = null;
    pendingOutputChannels = null;
    active = false;
  }
  
  public void setChannelMap(@Nullable int[] paramArrayOfInt)
  {
    pendingOutputChannels = paramArrayOfInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */