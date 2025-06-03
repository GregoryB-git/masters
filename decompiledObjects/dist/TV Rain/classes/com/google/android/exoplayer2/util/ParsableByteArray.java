package com.google.android.exoplayer2.util;

import a;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ParsableByteArray
{
  public byte[] data;
  private int limit;
  private int position;
  
  public ParsableByteArray()
  {
    data = Util.EMPTY_BYTE_ARRAY;
  }
  
  public ParsableByteArray(int paramInt)
  {
    data = new byte[paramInt];
    limit = paramInt;
  }
  
  public ParsableByteArray(byte[] paramArrayOfByte)
  {
    data = paramArrayOfByte;
    limit = paramArrayOfByte.length;
  }
  
  public ParsableByteArray(byte[] paramArrayOfByte, int paramInt)
  {
    data = paramArrayOfByte;
    limit = paramInt;
  }
  
  public int bytesLeft()
  {
    return limit - position;
  }
  
  public int capacity()
  {
    return data.length;
  }
  
  public int getPosition()
  {
    return position;
  }
  
  public int limit()
  {
    return limit;
  }
  
  public char peekChar()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = arrayOfByte[i];
    return (char)(arrayOfByte[(i + 1)] & 0xFF | (j & 0xFF) << 8);
  }
  
  public int peekUnsignedByte()
  {
    return data[position] & 0xFF;
  }
  
  public void readBytes(ParsableBitArray paramParsableBitArray, int paramInt)
  {
    readBytes(data, 0, paramInt);
    paramParsableBitArray.setPosition(0);
  }
  
  public void readBytes(ByteBuffer paramByteBuffer, int paramInt)
  {
    paramByteBuffer.put(data, position, paramInt);
    position += paramInt;
  }
  
  public void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(data, position, paramArrayOfByte, paramInt1, paramInt2);
    position += paramInt2;
  }
  
  public double readDouble()
  {
    return Double.longBitsToDouble(readLong());
  }
  
  public float readFloat()
  {
    return Float.intBitsToFloat(readInt());
  }
  
  public int readInt()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    int m = arrayOfByte[j];
    j = k + 1;
    k = arrayOfByte[k];
    position = (j + 1);
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 24 | (m & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public int readInt24()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    j = arrayOfByte[j];
    position = (k + 1);
    return arrayOfByte[k] & 0xFF | (i & 0xFF) << 24 >> 8 | (j & 0xFF) << 8;
  }
  
  @Nullable
  public String readLine()
  {
    if (bytesLeft() == 0) {
      return null;
    }
    for (int i = position; (i < limit) && (!Util.isLinebreak(data[i])); i++) {}
    int j = position;
    if (i - j >= 3)
    {
      localObject = data;
      if ((localObject[j] == -17) && (localObject[(j + 1)] == -69) && (localObject[(j + 2)] == -65)) {
        position = (j + 3);
      }
    }
    Object localObject = data;
    j = position;
    localObject = Util.fromUtf8Bytes((byte[])localObject, j, i - j);
    position = i;
    j = limit;
    if (i == j) {
      return (String)localObject;
    }
    byte[] arrayOfByte = data;
    if (arrayOfByte[i] == 13)
    {
      i++;
      position = i;
      if (i == j) {
        return (String)localObject;
      }
    }
    i = position;
    if (arrayOfByte[i] == 10) {
      position = (i + 1);
    }
    return (String)localObject;
  }
  
  public int readLittleEndianInt()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    j = arrayOfByte[j];
    int m = k + 1;
    k = arrayOfByte[k];
    position = (m + 1);
    return (arrayOfByte[m] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  public int readLittleEndianInt24()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    int k = j + 1;
    j = arrayOfByte[j];
    position = (k + 1);
    return (arrayOfByte[k] & 0xFF) << 16 | i & 0xFF | (j & 0xFF) << 8;
  }
  
  public long readLittleEndianLong()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    i = j + 1;
    long l4 = arrayOfByte[j];
    j = i + 1;
    long l5 = arrayOfByte[i];
    i = j + 1;
    long l6 = arrayOfByte[j];
    j = i + 1;
    long l7 = arrayOfByte[i];
    position = (j + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48 | (arrayOfByte[j] & 0xFF) << 56;
  }
  
  public short readLittleEndianShort()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    position = (j + 1);
    return (short)((arrayOfByte[j] & 0xFF) << 8 | i & 0xFF);
  }
  
  public long readLittleEndianUnsignedInt()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    position = (j + 1);
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (arrayOfByte[j] & 0xFF) << 24;
  }
  
  public int readLittleEndianUnsignedInt24()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    int k = arrayOfByte[i];
    i = j + 1;
    j = arrayOfByte[j];
    position = (i + 1);
    return (arrayOfByte[i] & 0xFF) << 16 | k & 0xFF | (j & 0xFF) << 8;
  }
  
  public int readLittleEndianUnsignedIntToInt()
  {
    int i = readLittleEndianInt();
    if (i >= 0) {
      return i;
    }
    throw new IllegalStateException(a.f("Top bit not zero: ", i));
  }
  
  public int readLittleEndianUnsignedShort()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    position = (j + 1);
    return (arrayOfByte[j] & 0xFF) << 8 | i & 0xFF;
  }
  
  public long readLong()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    i = j + 1;
    long l4 = arrayOfByte[j];
    j = i + 1;
    long l5 = arrayOfByte[i];
    i = j + 1;
    long l6 = arrayOfByte[j];
    j = i + 1;
    long l7 = arrayOfByte[i];
    position = (j + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }
  
  @Nullable
  public String readNullTerminatedString()
  {
    if (bytesLeft() == 0) {
      return null;
    }
    for (int i = position; (i < limit) && (data[i] != 0); i++) {}
    Object localObject = data;
    int j = position;
    localObject = Util.fromUtf8Bytes((byte[])localObject, j, i - j);
    position = i;
    if (i < limit) {
      position = (i + 1);
    }
    return (String)localObject;
  }
  
  public String readNullTerminatedString(int paramInt)
  {
    if (paramInt == 0) {
      return "";
    }
    int i = position;
    int j = i + paramInt - 1;
    if ((j < limit) && (data[j] == 0)) {
      j = paramInt - 1;
    } else {
      j = paramInt;
    }
    String str = Util.fromUtf8Bytes(data, i, j);
    position += paramInt;
    return str;
  }
  
  public short readShort()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    position = (j + 1);
    return (short)(arrayOfByte[j] & 0xFF | (i & 0xFF) << 8);
  }
  
  public String readString(int paramInt)
  {
    return readString(paramInt, Charset.forName("UTF-8"));
  }
  
  public String readString(int paramInt, Charset paramCharset)
  {
    paramCharset = new String(data, position, paramInt, paramCharset);
    position += paramInt;
    return paramCharset;
  }
  
  public int readSynchSafeInt()
  {
    return readUnsignedByte() << 21 | readUnsignedByte() << 14 | readUnsignedByte() << 7 | readUnsignedByte();
  }
  
  public int readUnsignedByte()
  {
    byte[] arrayOfByte = data;
    int i = position;
    position = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public int readUnsignedFixedPoint1616()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    int k = arrayOfByte[i];
    i = arrayOfByte[j];
    position = (j + 1 + 2);
    return i & 0xFF | (k & 0xFF) << 8;
  }
  
  public long readUnsignedInt()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    long l1 = arrayOfByte[i];
    i = j + 1;
    long l2 = arrayOfByte[j];
    j = i + 1;
    long l3 = arrayOfByte[i];
    position = (j + 1);
    return (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }
  
  public int readUnsignedInt24()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    int k = arrayOfByte[i];
    i = j + 1;
    j = arrayOfByte[j];
    position = (i + 1);
    return arrayOfByte[i] & 0xFF | (k & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public int readUnsignedIntToInt()
  {
    int i = readInt();
    if (i >= 0) {
      return i;
    }
    throw new IllegalStateException(a.f("Top bit not zero: ", i));
  }
  
  public long readUnsignedLongToLong()
  {
    long l = readLong();
    if (l >= 0L) {
      return l;
    }
    throw new IllegalStateException(a.h("Top bit not zero: ", l));
  }
  
  public int readUnsignedShort()
  {
    byte[] arrayOfByte = data;
    int i = position;
    int j = i + 1;
    i = arrayOfByte[i];
    position = (j + 1);
    return arrayOfByte[j] & 0xFF | (i & 0xFF) << 8;
  }
  
  public long readUtf8EncodedLong()
  {
    long l = data[position];
    int j;
    int k;
    for (int i = 7;; i--)
    {
      j = 1;
      if (i < 0) {
        break;
      }
      k = 1 << i;
      if ((k & l) == 0L)
      {
        if (i < 6)
        {
          l &= k - 1;
          i = 7 - i;
          break label77;
        }
        if (i != 7) {
          break;
        }
        i = 1;
        break label77;
      }
    }
    i = 0;
    label77:
    if (i != 0)
    {
      while (j < i)
      {
        k = data[(position + j)];
        if ((k & 0xC0) == 128)
        {
          l = l << 6 | k & 0x3F;
          j++;
        }
        else
        {
          throw new NumberFormatException(a.h("Invalid UTF-8 sequence continuation byte: ", l));
        }
      }
      position += i;
      return l;
    }
    throw new NumberFormatException(a.h("Invalid UTF-8 sequence first byte: ", l));
  }
  
  public void reset()
  {
    position = 0;
    limit = 0;
  }
  
  public void reset(int paramInt)
  {
    byte[] arrayOfByte;
    if (capacity() < paramInt) {
      arrayOfByte = new byte[paramInt];
    } else {
      arrayOfByte = data;
    }
    reset(arrayOfByte, paramInt);
  }
  
  public void reset(byte[] paramArrayOfByte, int paramInt)
  {
    data = paramArrayOfByte;
    limit = paramInt;
    position = 0;
  }
  
  public void setLimit(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= data.length)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    limit = paramInt;
  }
  
  public void setPosition(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= limit)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    position = paramInt;
  }
  
  public void skipBytes(int paramInt)
  {
    setPosition(position + paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ParsableByteArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */