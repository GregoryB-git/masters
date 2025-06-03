package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

final class NalUnitTargetBuffer
{
  private boolean isCompleted;
  private boolean isFilling;
  public byte[] nalData;
  public int nalLength;
  private final int targetType;
  
  public NalUnitTargetBuffer(int paramInt1, int paramInt2)
  {
    targetType = paramInt1;
    byte[] arrayOfByte = new byte[paramInt2 + 3];
    nalData = arrayOfByte;
    arrayOfByte[2] = ((byte)1);
  }
  
  public void appendToNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!isFilling) {
      return;
    }
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = nalData;
    int i = arrayOfByte.length;
    int j = nalLength;
    if (i < j + paramInt2) {
      nalData = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, nalData, nalLength, paramInt2);
    nalLength += paramInt2;
  }
  
  public boolean endNalUnit(int paramInt)
  {
    if (!isFilling) {
      return false;
    }
    nalLength -= paramInt;
    isFilling = false;
    isCompleted = true;
    return true;
  }
  
  public boolean isCompleted()
  {
    return isCompleted;
  }
  
  public void reset()
  {
    isFilling = false;
    isCompleted = false;
  }
  
  public void startNalUnit(int paramInt)
  {
    boolean bool1 = isFilling;
    boolean bool2 = true;
    Assertions.checkState(bool1 ^ true);
    if (paramInt != targetType) {
      bool2 = false;
    }
    isFilling = bool2;
    if (bool2)
    {
      nalLength = 3;
      isCompleted = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.NalUnitTargetBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */