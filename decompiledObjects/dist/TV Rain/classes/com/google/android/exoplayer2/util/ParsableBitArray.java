package com.google.android.exoplayer2.util;

public final class ParsableBitArray
{
  private int bitOffset;
  private int byteLimit;
  private int byteOffset;
  public byte[] data;
  
  public ParsableBitArray()
  {
    data = Util.EMPTY_BYTE_ARRAY;
  }
  
  public ParsableBitArray(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public ParsableBitArray(byte[] paramArrayOfByte, int paramInt)
  {
    data = paramArrayOfByte;
    byteLimit = paramInt;
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
  
  public void byteAlign()
  {
    if (bitOffset == 0) {
      return;
    }
    bitOffset = 0;
    byteOffset += 1;
    assertValidOffset();
  }
  
  public int getBytePosition()
  {
    boolean bool;
    if (bitOffset == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    return byteOffset;
  }
  
  public int getPosition()
  {
    return byteOffset * 8 + bitOffset;
  }
  
  public void putInt(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt2 < 32) {
      i = paramInt1 & (1 << paramInt2) - 1;
    }
    int j = Math.min(8 - bitOffset, paramInt2);
    int k = bitOffset;
    paramInt1 = 8 - k - j;
    byte[] arrayOfByte = data;
    int m = byteOffset;
    k = (byte)((65280 >> k | (1 << paramInt1) - 1) & arrayOfByte[m]);
    arrayOfByte[m] = ((byte)k);
    j = paramInt2 - j;
    arrayOfByte[m] = ((byte)(byte)(k | i >>> j << paramInt1));
    for (paramInt1 = m + 1; j > 8; paramInt1++)
    {
      data[paramInt1] = ((byte)(byte)(i >>> j - 8));
      j -= 8;
    }
    m = 8 - j;
    arrayOfByte = data;
    k = (byte)(arrayOfByte[paramInt1] & (1 << m) - 1);
    arrayOfByte[paramInt1] = ((byte)k);
    arrayOfByte[paramInt1] = ((byte)(byte)((i & (1 << j) - 1) << m | k));
    skipBits(paramInt2);
    assertValidOffset();
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
    if (paramInt == 0) {
      return 0;
    }
    bitOffset += paramInt;
    int i = 0;
    int j;
    for (;;)
    {
      j = bitOffset;
      if (j <= 8) {
        break;
      }
      j -= 8;
      bitOffset = j;
      arrayOfByte = data;
      k = byteOffset;
      byteOffset = (k + 1);
      i |= (arrayOfByte[k] & 0xFF) << j;
    }
    byte[] arrayOfByte = data;
    int k = byteOffset;
    int m = arrayOfByte[k];
    if (j == 8)
    {
      bitOffset = 0;
      byteOffset = (k + 1);
    }
    assertValidOffset();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - j);
  }
  
  public void readBits(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (paramInt2 >> 3) + paramInt1;
    while (paramInt1 < i)
    {
      arrayOfByte = data;
      j = byteOffset;
      k = j + 1;
      byteOffset = k;
      m = arrayOfByte[j];
      j = bitOffset;
      m = (byte)(m << j);
      paramArrayOfByte[paramInt1] = ((byte)m);
      paramArrayOfByte[paramInt1] = ((byte)(byte)((0xFF & arrayOfByte[k]) >> 8 - j | m));
      paramInt1++;
    }
    paramInt1 = paramInt2 & 0x7;
    if (paramInt1 == 0) {
      return;
    }
    paramInt2 = (byte)(paramArrayOfByte[i] & 255 >> paramInt1);
    paramArrayOfByte[i] = ((byte)paramInt2);
    int k = bitOffset;
    if (k + paramInt1 > 8)
    {
      arrayOfByte = data;
      j = byteOffset;
      byteOffset = (j + 1);
      paramArrayOfByte[i] = ((byte)(byte)(paramInt2 | (arrayOfByte[j] & 0xFF) << k));
      bitOffset = (k - 8);
    }
    paramInt2 = bitOffset + paramInt1;
    bitOffset = paramInt2;
    byte[] arrayOfByte = data;
    int m = byteOffset;
    int j = arrayOfByte[m];
    k = paramArrayOfByte[i];
    paramArrayOfByte[i] = ((byte)(byte)((byte)((0xFF & j) >> 8 - paramInt2 << 8 - paramInt1) | k));
    if (paramInt2 == 8)
    {
      bitOffset = 0;
      byteOffset = (m + 1);
    }
    assertValidOffset();
  }
  
  public void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (bitOffset == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    System.arraycopy(data, byteOffset, paramArrayOfByte, paramInt1, paramInt2);
    byteOffset += paramInt2;
    assertValidOffset();
  }
  
  public void reset(ParsableByteArray paramParsableByteArray)
  {
    reset(data, paramParsableByteArray.limit());
    setPosition(paramParsableByteArray.getPosition() * 8);
  }
  
  public void reset(byte[] paramArrayOfByte)
  {
    reset(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public void reset(byte[] paramArrayOfByte, int paramInt)
  {
    data = paramArrayOfByte;
    byteOffset = 0;
    bitOffset = 0;
    byteLimit = paramInt;
  }
  
  public void setPosition(int paramInt)
  {
    int i = paramInt / 8;
    byteOffset = i;
    bitOffset = (paramInt - i * 8);
    assertValidOffset();
  }
  
  public void skipBit()
  {
    int i = bitOffset + 1;
    bitOffset = i;
    if (i == 8)
    {
      bitOffset = 0;
      byteOffset += 1;
    }
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
  
  public void skipBytes(int paramInt)
  {
    boolean bool;
    if (bitOffset == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    byteOffset += paramInt;
    assertValidOffset();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ParsableBitArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */