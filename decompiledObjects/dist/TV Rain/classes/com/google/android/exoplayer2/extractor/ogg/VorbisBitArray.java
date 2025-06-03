package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.util.Assertions;

final class VorbisBitArray
{
  private int bitOffset;
  private final int byteLimit;
  private int byteOffset;
  private final byte[] data;
  
  public VorbisBitArray(byte[] paramArrayOfByte)
  {
    data = paramArrayOfByte;
    byteLimit = paramArrayOfByte.length;
  }
  
  private void assertValidOffset()
  {
    int i = byteOffset;
    if (i >= 0)
    {
      int j = byteLimit;
      if ((i < j) || ((i == j) && (bitOffset == 0)))
      {
        bool = true;
        break label38;
      }
    }
    boolean bool = false;
    label38:
    Assertions.checkState(bool);
  }
  
  public int bitsLeft()
  {
    return (byteLimit - byteOffset) * 8 - bitOffset;
  }
  
  public int getPosition()
  {
    return byteOffset * 8 + bitOffset;
  }
  
  public boolean readBit()
  {
    boolean bool;
    if (((data[byteOffset] & 0xFF) >> bitOffset & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    skipBits(1);
    return bool;
  }
  
  public int readBits(int paramInt)
  {
    int i = byteOffset;
    int j = Math.min(paramInt, 8 - bitOffset);
    byte[] arrayOfByte = data;
    int k = i + 1;
    i = (arrayOfByte[i] & 0xFF) >> bitOffset & 255 >> 8 - j;
    while (j < paramInt)
    {
      i |= (data[k] & 0xFF) << j;
      j += 8;
      k++;
    }
    skipBits(paramInt);
    return i & -1 >>> 32 - paramInt;
  }
  
  public void reset()
  {
    byteOffset = 0;
    bitOffset = 0;
  }
  
  public void setPosition(int paramInt)
  {
    int i = paramInt / 8;
    byteOffset = i;
    bitOffset = (paramInt - i * 8);
    assertValidOffset();
  }
  
  public void skipBits(int paramInt)
  {
    int i = paramInt / 8;
    int j = byteOffset + i;
    byteOffset = j;
    paramInt = paramInt - i * 8 + bitOffset;
    bitOffset = paramInt;
    if (paramInt > 7)
    {
      byteOffset = (j + 1);
      bitOffset = (paramInt - 8);
    }
    assertValidOffset();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.VorbisBitArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */