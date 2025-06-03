package com.google.android.exoplayer2.util;

public final class ParsableNalUnitBitArray
{
  private int bitOffset;
  private int byteLimit;
  private int byteOffset;
  private byte[] data;
  
  public ParsableNalUnitBitArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    reset(paramArrayOfByte, paramInt1, paramInt2);
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
  
  private int readExpGolombCodeNum()
  {
    int i = 0;
    for (int j = 0; !readBit(); j++) {}
    if (j > 0) {
      i = readBits(j);
    }
    return (1 << j) - 1 + i;
  }
  
  private boolean shouldSkipByte(int paramInt)
  {
    boolean bool = true;
    if ((2 <= paramInt) && (paramInt < byteLimit))
    {
      byte[] arrayOfByte = data;
      if ((arrayOfByte[paramInt] == 3) && (arrayOfByte[(paramInt - 2)] == 0) && (arrayOfByte[(paramInt - 1)] == 0)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public boolean canReadBits(int paramInt)
  {
    int i = byteOffset;
    int j = paramInt / 8;
    int k = i + j;
    int m = bitOffset + paramInt - j * 8;
    paramInt = k;
    j = m;
    if (m > 7)
    {
      paramInt = k + 1;
      j = m - 8;
    }
    boolean bool1 = true;
    k = paramInt;
    paramInt = i;
    for (;;)
    {
      i = paramInt + 1;
      if ((i > k) || (k >= byteLimit)) {
        break;
      }
      paramInt = i;
      if (shouldSkipByte(i))
      {
        k++;
        paramInt = i + 2;
      }
    }
    paramInt = byteLimit;
    boolean bool2 = bool1;
    if (k >= paramInt) {
      if ((k == paramInt) && (j == 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public boolean canReadExpGolombCodedNum()
  {
    int i = byteOffset;
    int j = bitOffset;
    boolean bool1 = false;
    for (int k = 0; (byteOffset < byteLimit) && (!readBit()); k++) {}
    int m;
    if (byteOffset == byteLimit) {
      m = 1;
    } else {
      m = 0;
    }
    byteOffset = i;
    bitOffset = j;
    boolean bool2 = bool1;
    if (m == 0)
    {
      bool2 = bool1;
      if (canReadBits(k * 2 + 1)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean readBit()
  {
    boolean bool;
    if ((data[byteOffset] & 128 >> bitOffset) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    skipBit();
    return bool;
  }
  
  public int readBits(int paramInt)
  {
    bitOffset += paramInt;
    int i = 0;
    int j;
    int k;
    for (;;)
    {
      j = bitOffset;
      k = 2;
      if (j <= 8) {
        break;
      }
      m = j - 8;
      bitOffset = m;
      arrayOfByte = data;
      n = byteOffset;
      i |= (arrayOfByte[n] & 0xFF) << m;
      if (!shouldSkipByte(n + 1)) {
        k = 1;
      }
      byteOffset = (n + k);
    }
    byte[] arrayOfByte = data;
    int n = byteOffset;
    int m = arrayOfByte[n];
    if (j == 8)
    {
      bitOffset = 0;
      if (!shouldSkipByte(n + 1)) {
        k = 1;
      }
      byteOffset = (n + k);
    }
    assertValidOffset();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - j);
  }
  
  public int readSignedExpGolombCodedInt()
  {
    int i = readExpGolombCodeNum();
    int j;
    if (i % 2 == 0) {
      j = -1;
    } else {
      j = 1;
    }
    return (i + 1) / 2 * j;
  }
  
  public int readUnsignedExpGolombCodedInt()
  {
    return readExpGolombCodeNum();
  }
  
  public void reset(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    data = paramArrayOfByte;
    byteOffset = paramInt1;
    byteLimit = paramInt2;
    bitOffset = 0;
    assertValidOffset();
  }
  
  public void skipBit()
  {
    int i = bitOffset;
    int j = 1;
    i++;
    bitOffset = i;
    if (i == 8)
    {
      bitOffset = 0;
      i = byteOffset;
      if (shouldSkipByte(i + 1)) {
        j = 2;
      }
      byteOffset = (i + j);
    }
    assertValidOffset();
  }
  
  public void skipBits(int paramInt)
  {
    int i = byteOffset;
    int j = paramInt / 8;
    int k = i + j;
    byteOffset = k;
    j = paramInt - j * 8 + bitOffset;
    bitOffset = j;
    paramInt = i;
    if (j > 7)
    {
      byteOffset = (k + 1);
      bitOffset = (j - 8);
      paramInt = i;
    }
    for (;;)
    {
      i = paramInt + 1;
      if (i > byteOffset) {
        break;
      }
      paramInt = i;
      if (shouldSkipByte(i))
      {
        byteOffset += 1;
        paramInt = i + 2;
      }
    }
    assertValidOffset();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ParsableNalUnitBitArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */