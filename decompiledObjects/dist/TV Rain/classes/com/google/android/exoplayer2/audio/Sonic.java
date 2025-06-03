package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class Sonic
{
  private static final int AMDF_FREQUENCY = 4000;
  private static final int MAXIMUM_PITCH = 400;
  private static final int MINIMUM_PITCH = 65;
  private final int channelCount;
  private final short[] downSampleBuffer;
  private short[] inputBuffer;
  private int inputFrameCount;
  private final int inputSampleRateHz;
  private int maxDiff;
  private final int maxPeriod;
  private final int maxRequiredFrameCount;
  private int minDiff;
  private final int minPeriod;
  private int newRatePosition;
  private int oldRatePosition;
  private short[] outputBuffer;
  private int outputFrameCount;
  private final float pitch;
  private short[] pitchBuffer;
  private int pitchFrameCount;
  private int prevMinDiff;
  private int prevPeriod;
  private final float rate;
  private int remainingInputToCopyFrameCount;
  private final float speed;
  
  public Sonic(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
  {
    inputSampleRateHz = paramInt1;
    channelCount = paramInt2;
    speed = paramFloat1;
    pitch = paramFloat2;
    rate = (paramInt1 / paramInt3);
    minPeriod = (paramInt1 / 400);
    paramInt1 /= 65;
    maxPeriod = paramInt1;
    paramInt1 *= 2;
    maxRequiredFrameCount = paramInt1;
    downSampleBuffer = new short[paramInt1];
    inputBuffer = new short[paramInt1 * paramInt2];
    outputBuffer = new short[paramInt1 * paramInt2];
    pitchBuffer = new short[paramInt1 * paramInt2];
  }
  
  private void adjustRate(float paramFloat, int paramInt)
  {
    if (outputFrameCount == paramInt) {
      return;
    }
    int i = inputSampleRateHz;
    int j = (int)(i / paramFloat);
    for (;;)
    {
      if ((j <= 16384) && (i <= 16384))
      {
        moveNewSamplesToPitchBuffer(paramInt);
        int k;
        for (paramInt = 0;; paramInt++)
        {
          k = pitchFrameCount;
          boolean bool = true;
          if (paramInt >= k - 1) {
            break;
          }
          int m;
          for (;;)
          {
            m = oldRatePosition;
            k = newRatePosition;
            if ((m + 1) * j <= k * i) {
              break;
            }
            outputBuffer = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, 1);
            for (k = 0;; k++)
            {
              m = channelCount;
              if (k >= m) {
                break;
              }
              outputBuffer[(outputFrameCount * m + k)] = interpolate(pitchBuffer, m * paramInt + k, i, j);
            }
            newRatePosition += 1;
            outputFrameCount += 1;
          }
          m++;
          oldRatePosition = m;
          if (m == i)
          {
            oldRatePosition = 0;
            if (k != j) {
              bool = false;
            }
            Assertions.checkState(bool);
            newRatePosition = 0;
          }
        }
        removePitchFrames(k - 1);
        return;
      }
      j /= 2;
      i /= 2;
    }
  }
  
  private void changeSpeed(float paramFloat)
  {
    int i = inputFrameCount;
    if (i < maxRequiredFrameCount) {
      return;
    }
    int j = 0;
    int k;
    do
    {
      if (remainingInputToCopyFrameCount > 0) {}
      for (k = copyInputToOutput(j);; k = insertPitchPeriod(inputBuffer, j, paramFloat, k))
      {
        k = j + k;
        break;
        k = findPitchPeriod(inputBuffer, j);
        if (paramFloat > 1.0D)
        {
          k = k + skipPitchPeriod(inputBuffer, j, paramFloat, k) + j;
          break;
        }
      }
      j = k;
    } while (maxRequiredFrameCount + k <= i);
    removeProcessedInputFrames(k);
  }
  
  private int copyInputToOutput(int paramInt)
  {
    int i = Math.min(maxRequiredFrameCount, remainingInputToCopyFrameCount);
    copyToOutput(inputBuffer, paramInt, i);
    remainingInputToCopyFrameCount -= i;
    return i;
  }
  
  private void copyToOutput(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, paramInt2);
    outputBuffer = arrayOfShort;
    int i = channelCount;
    System.arraycopy(paramArrayOfShort, paramInt1 * i, arrayOfShort, outputFrameCount * i, i * paramInt2);
    outputFrameCount += paramInt2;
  }
  
  private void downSampleInput(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i = maxRequiredFrameCount / paramInt2;
    int j = channelCount;
    int k = paramInt2 * j;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      int m = 0;
      int n = m;
      while (m < k)
      {
        n += paramArrayOfShort[(paramInt2 * k + paramInt1 * j + m)];
        m++;
      }
      m = n / k;
      downSampleBuffer[paramInt2] = ((short)(short)m);
    }
  }
  
  private short[] ensureSpaceForAdditionalFrames(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfShort.length;
    int j = channelCount;
    i /= j;
    if (paramInt1 + paramInt2 <= i) {
      return paramArrayOfShort;
    }
    return Arrays.copyOf(paramArrayOfShort, (i * 3 / 2 + paramInt2) * j);
  }
  
  private int findPitchPeriod(short[] paramArrayOfShort, int paramInt)
  {
    int i = inputSampleRateHz;
    if (i > 4000) {
      i /= 4000;
    } else {
      i = 1;
    }
    if ((channelCount == 1) && (i == 1))
    {
      paramInt = findPitchPeriodInRange(paramArrayOfShort, paramInt, minPeriod, maxPeriod);
    }
    else
    {
      downSampleInput(paramArrayOfShort, paramInt, i);
      int j = findPitchPeriodInRange(downSampleBuffer, 0, minPeriod / i, maxPeriod / i);
      if (i != 1)
      {
        int k = j * i;
        i *= 4;
        j = k - i;
        k += i;
        int m = minPeriod;
        i = j;
        if (j < m) {
          i = m;
        }
        m = maxPeriod;
        j = k;
        if (k > m) {
          j = m;
        }
        if (channelCount == 1)
        {
          paramInt = findPitchPeriodInRange(paramArrayOfShort, paramInt, i, j);
        }
        else
        {
          downSampleInput(paramArrayOfShort, paramInt, 1);
          paramInt = findPitchPeriodInRange(downSampleBuffer, 0, i, j);
        }
      }
      else
      {
        paramInt = j;
      }
    }
    if (previousPeriodBetter(minDiff, maxDiff)) {
      i = prevPeriod;
    } else {
      i = paramInt;
    }
    prevMinDiff = minDiff;
    prevPeriod = paramInt;
    return i;
  }
  
  private int findPitchPeriodInRange(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 * channelCount;
    int j = 1;
    int k = 255;
    int m = 0;
    int i3;
    for (int n = m; paramInt2 <= paramInt3; n = i3)
    {
      int i1 = 0;
      paramInt1 = i1;
      while (i1 < paramInt2)
      {
        paramInt1 += Math.abs(paramArrayOfShort[(i + i1)] - paramArrayOfShort[(i + paramInt2 + i1)]);
        i1++;
      }
      int i2 = j;
      i1 = m;
      if (paramInt1 * m < j * paramInt2)
      {
        i1 = paramInt2;
        i2 = paramInt1;
      }
      m = k;
      i3 = n;
      if (paramInt1 * k > n * paramInt2)
      {
        m = paramInt2;
        i3 = paramInt1;
      }
      paramInt2++;
      j = i2;
      k = m;
      m = i1;
    }
    minDiff = (j / m);
    maxDiff = (n / k);
    return m;
  }
  
  private int insertPitchPeriod(short[] paramArrayOfShort, int paramInt1, float paramFloat, int paramInt2)
  {
    int i;
    if (paramFloat < 0.5F)
    {
      i = (int)(paramInt2 * paramFloat / (1.0F - paramFloat));
    }
    else
    {
      remainingInputToCopyFrameCount = ((int)((2.0F * paramFloat - 1.0F) * paramInt2 / (1.0F - paramFloat)));
      i = paramInt2;
    }
    short[] arrayOfShort = outputBuffer;
    int j = outputFrameCount;
    int k = paramInt2 + i;
    arrayOfShort = ensureSpaceForAdditionalFrames(arrayOfShort, j, k);
    outputBuffer = arrayOfShort;
    j = channelCount;
    System.arraycopy(paramArrayOfShort, paramInt1 * j, arrayOfShort, outputFrameCount * j, j * paramInt2);
    overlapAdd(i, channelCount, outputBuffer, outputFrameCount + paramInt2, paramArrayOfShort, paramInt1 + paramInt2, paramArrayOfShort, paramInt1);
    outputFrameCount += k;
    return i;
  }
  
  private short interpolate(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfShort[paramInt1];
    paramInt1 = paramArrayOfShort[(paramInt1 + channelCount)];
    int j = newRatePosition;
    int k = oldRatePosition;
    int m = (k + 1) * paramInt3;
    paramInt2 = m - j * paramInt2;
    paramInt3 = m - k * paramInt3;
    return (short)(((paramInt3 - paramInt2) * paramInt1 + i * paramInt2) / paramInt3);
  }
  
  private void moveNewSamplesToPitchBuffer(int paramInt)
  {
    int i = outputFrameCount - paramInt;
    short[] arrayOfShort1 = ensureSpaceForAdditionalFrames(pitchBuffer, pitchFrameCount, i);
    pitchBuffer = arrayOfShort1;
    short[] arrayOfShort2 = outputBuffer;
    int j = channelCount;
    System.arraycopy(arrayOfShort2, paramInt * j, arrayOfShort1, pitchFrameCount * j, j * i);
    outputFrameCount = paramInt;
    pitchFrameCount += i;
  }
  
  private static void overlapAdd(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      int j = paramInt3 * paramInt2 + i;
      int k = paramInt5 * paramInt2 + i;
      int m = paramInt4 * paramInt2 + i;
      for (int n = 0; n < paramInt1; n++)
      {
        int i1 = paramArrayOfShort2[m];
        paramArrayOfShort1[j] = ((short)(short)((paramArrayOfShort3[k] * n + (paramInt1 - n) * i1) / paramInt1));
        j += paramInt2;
        m += paramInt2;
        k += paramInt2;
      }
    }
  }
  
  private boolean previousPeriodBetter(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (prevPeriod != 0))
    {
      if (paramInt2 > paramInt1 * 3) {
        return false;
      }
      return paramInt1 * 2 > prevMinDiff * 3;
    }
    return false;
  }
  
  private void processStreamInput()
  {
    int i = outputFrameCount;
    float f1 = speed;
    float f2 = pitch;
    f1 /= f2;
    f2 = rate * f2;
    double d = f1;
    if ((d <= 1.00001D) && (d >= 0.99999D))
    {
      copyToOutput(inputBuffer, 0, inputFrameCount);
      inputFrameCount = 0;
    }
    else
    {
      changeSpeed(f1);
    }
    if (f2 != 1.0F) {
      adjustRate(f2, i);
    }
  }
  
  private void removePitchFrames(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    short[] arrayOfShort = pitchBuffer;
    int i = channelCount;
    System.arraycopy(arrayOfShort, paramInt * i, arrayOfShort, 0, (pitchFrameCount - paramInt) * i);
    pitchFrameCount -= paramInt;
  }
  
  private void removeProcessedInputFrames(int paramInt)
  {
    int i = inputFrameCount - paramInt;
    short[] arrayOfShort = inputBuffer;
    int j = channelCount;
    System.arraycopy(arrayOfShort, paramInt * j, arrayOfShort, 0, j * i);
    inputFrameCount = i;
  }
  
  private int skipPitchPeriod(short[] paramArrayOfShort, int paramInt1, float paramFloat, int paramInt2)
  {
    int i;
    if (paramFloat >= 2.0F)
    {
      i = (int)(paramInt2 / (paramFloat - 1.0F));
    }
    else
    {
      remainingInputToCopyFrameCount = ((int)((2.0F - paramFloat) * paramInt2 / (paramFloat - 1.0F)));
      i = paramInt2;
    }
    short[] arrayOfShort = ensureSpaceForAdditionalFrames(outputBuffer, outputFrameCount, i);
    outputBuffer = arrayOfShort;
    overlapAdd(i, channelCount, arrayOfShort, outputFrameCount, paramArrayOfShort, paramInt1, paramArrayOfShort, paramInt1 + paramInt2);
    outputFrameCount += i;
    return i;
  }
  
  public void flush()
  {
    inputFrameCount = 0;
    outputFrameCount = 0;
    pitchFrameCount = 0;
    oldRatePosition = 0;
    newRatePosition = 0;
    remainingInputToCopyFrameCount = 0;
    prevPeriod = 0;
    prevMinDiff = 0;
    minDiff = 0;
    maxDiff = 0;
  }
  
  public int getFramesAvailable()
  {
    return outputFrameCount;
  }
  
  public void getOutput(ShortBuffer paramShortBuffer)
  {
    int i = Math.min(paramShortBuffer.remaining() / channelCount, outputFrameCount);
    paramShortBuffer.put(outputBuffer, 0, channelCount * i);
    int j = outputFrameCount - i;
    outputFrameCount = j;
    paramShortBuffer = outputBuffer;
    int k = channelCount;
    System.arraycopy(paramShortBuffer, i * k, paramShortBuffer, 0, j * k);
  }
  
  public void queueEndOfStream()
  {
    int i = inputFrameCount;
    float f1 = speed;
    float f2 = pitch;
    float f3 = f1 / f2;
    f1 = rate;
    int j = outputFrameCount + (int)((i / f3 + pitchFrameCount) / (f1 * f2) + 0.5F);
    inputBuffer = ensureSpaceForAdditionalFrames(inputBuffer, i, maxRequiredFrameCount * 2 + i);
    int m;
    for (int k = 0;; k++)
    {
      m = maxRequiredFrameCount;
      int n = channelCount;
      if (k >= m * 2 * n) {
        break;
      }
      inputBuffer[(n * i + k)] = ((short)0);
    }
    inputFrameCount = (m * 2 + inputFrameCount);
    processStreamInput();
    if (outputFrameCount > j) {
      outputFrameCount = j;
    }
    inputFrameCount = 0;
    remainingInputToCopyFrameCount = 0;
    pitchFrameCount = 0;
  }
  
  public void queueInput(ShortBuffer paramShortBuffer)
  {
    int i = paramShortBuffer.remaining();
    int j = channelCount;
    i /= j;
    short[] arrayOfShort = ensureSpaceForAdditionalFrames(inputBuffer, inputFrameCount, i);
    inputBuffer = arrayOfShort;
    paramShortBuffer.get(arrayOfShort, inputFrameCount * channelCount, j * i * 2 / 2);
    inputFrameCount += i;
    processStreamInput();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.Sonic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */