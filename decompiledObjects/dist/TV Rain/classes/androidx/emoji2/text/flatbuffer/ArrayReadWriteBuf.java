package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

public class ArrayReadWriteBuf
  implements ReadWriteBuf
{
  private byte[] buffer;
  private int writePos;
  
  public ArrayReadWriteBuf()
  {
    this(10);
  }
  
  public ArrayReadWriteBuf(int paramInt)
  {
    this(new byte[paramInt]);
  }
  
  public ArrayReadWriteBuf(byte[] paramArrayOfByte)
  {
    buffer = paramArrayOfByte;
    writePos = 0;
  }
  
  public ArrayReadWriteBuf(byte[] paramArrayOfByte, int paramInt)
  {
    buffer = paramArrayOfByte;
    writePos = paramInt;
  }
  
  public byte[] data()
  {
    return buffer;
  }
  
  public byte get(int paramInt)
  {
    return buffer[paramInt];
  }
  
  public boolean getBoolean(int paramInt)
  {
    boolean bool;
    if (buffer[paramInt] != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public double getDouble(int paramInt)
  {
    return Double.longBitsToDouble(getLong(paramInt));
  }
  
  public float getFloat(int paramInt)
  {
    return Float.intBitsToFloat(getInt(paramInt));
  }
  
  public int getInt(int paramInt)
  {
    byte[] arrayOfByte = buffer;
    int i = arrayOfByte[(paramInt + 3)];
    int j = arrayOfByte[(paramInt + 2)];
    int k = arrayOfByte[(paramInt + 1)];
    return arrayOfByte[paramInt] & 0xFF | i << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public long getLong(int paramInt)
  {
    byte[] arrayOfByte = buffer;
    int i = paramInt + 1;
    long l1 = arrayOfByte[paramInt];
    int j = i + 1;
    long l2 = arrayOfByte[i];
    paramInt = j + 1;
    long l3 = arrayOfByte[j];
    i = paramInt + 1;
    long l4 = arrayOfByte[paramInt];
    paramInt = i + 1;
    long l5 = arrayOfByte[i];
    i = paramInt + 1;
    return l1 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (arrayOfByte[paramInt] & 0xFF) << 40 | (0xFF & arrayOfByte[i]) << 48 | arrayOfByte[(i + 1)] << 56;
  }
  
  public short getShort(int paramInt)
  {
    byte[] arrayOfByte = buffer;
    int i = arrayOfByte[(paramInt + 1)];
    return (short)(arrayOfByte[paramInt] & 0xFF | i << 8);
  }
  
  public String getString(int paramInt1, int paramInt2)
  {
    return Utf8Safe.decodeUtf8Array(buffer, paramInt1, paramInt2);
  }
  
  public int limit()
  {
    return writePos;
  }
  
  public void put(byte paramByte)
  {
    set(writePos, paramByte);
    writePos += 1;
  }
  
  public void put(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    set(writePos, paramArrayOfByte, paramInt1, paramInt2);
    writePos += paramInt2;
  }
  
  public void putBoolean(boolean paramBoolean)
  {
    setBoolean(writePos, paramBoolean);
    writePos += 1;
  }
  
  public void putDouble(double paramDouble)
  {
    setDouble(writePos, paramDouble);
    writePos += 8;
  }
  
  public void putFloat(float paramFloat)
  {
    setFloat(writePos, paramFloat);
    writePos += 4;
  }
  
  public void putInt(int paramInt)
  {
    setInt(writePos, paramInt);
    writePos += 4;
  }
  
  public void putLong(long paramLong)
  {
    setLong(writePos, paramLong);
    writePos += 8;
  }
  
  public void putShort(short paramShort)
  {
    setShort(writePos, paramShort);
    writePos += 2;
  }
  
  public boolean requestCapacity(int paramInt)
  {
    byte[] arrayOfByte = buffer;
    if (arrayOfByte.length > paramInt) {
      return true;
    }
    paramInt = arrayOfByte.length;
    buffer = Arrays.copyOf(arrayOfByte, paramInt + (paramInt >> 1));
    return true;
  }
  
  public void set(int paramInt, byte paramByte)
  {
    requestCapacity(paramInt + 1);
    buffer[paramInt] = ((byte)paramByte);
  }
  
  public void set(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    requestCapacity(paramInt3 - paramInt2 + paramInt1);
    System.arraycopy(paramArrayOfByte, paramInt2, buffer, paramInt1, paramInt3);
  }
  
  public void setBoolean(int paramInt, boolean paramBoolean)
  {
    set(paramInt, paramBoolean);
  }
  
  public void setDouble(int paramInt, double paramDouble)
  {
    requestCapacity(paramInt + 8);
    long l = Double.doubleToRawLongBits(paramDouble);
    int i = (int)l;
    byte[] arrayOfByte = buffer;
    int j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 8 & 0xFF));
    j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i >> 16 & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 24 & 0xFF));
    i = (int)(l >> 32);
    j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 8 & 0xFF));
    arrayOfByte[paramInt] = ((byte)(byte)(i >> 16 & 0xFF));
    arrayOfByte[(paramInt + 1)] = ((byte)(byte)(i >> 24 & 0xFF));
  }
  
  public void setFloat(int paramInt, float paramFloat)
  {
    requestCapacity(paramInt + 4);
    int i = Float.floatToRawIntBits(paramFloat);
    byte[] arrayOfByte = buffer;
    int j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 8 & 0xFF));
    arrayOfByte[paramInt] = ((byte)(byte)(i >> 16 & 0xFF));
    arrayOfByte[(paramInt + 1)] = ((byte)(byte)(i >> 24 & 0xFF));
  }
  
  public void setInt(int paramInt1, int paramInt2)
  {
    requestCapacity(paramInt1 + 4);
    byte[] arrayOfByte = buffer;
    int i = paramInt1 + 1;
    arrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 & 0xFF));
    paramInt1 = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
    arrayOfByte[paramInt1] = ((byte)(byte)(paramInt2 >> 16 & 0xFF));
    arrayOfByte[(paramInt1 + 1)] = ((byte)(byte)(paramInt2 >> 24 & 0xFF));
  }
  
  public void setLong(int paramInt, long paramLong)
  {
    requestCapacity(paramInt + 8);
    int i = (int)paramLong;
    byte[] arrayOfByte = buffer;
    int j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 8 & 0xFF));
    j = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(i >> 16 & 0xFF));
    paramInt = j + 1;
    arrayOfByte[j] = ((byte)(byte)(i >> 24 & 0xFF));
    j = (int)(paramLong >> 32);
    i = paramInt + 1;
    arrayOfByte[paramInt] = ((byte)(byte)(j & 0xFF));
    paramInt = i + 1;
    arrayOfByte[i] = ((byte)(byte)(j >> 8 & 0xFF));
    arrayOfByte[paramInt] = ((byte)(byte)(j >> 16 & 0xFF));
    arrayOfByte[(paramInt + 1)] = ((byte)(byte)(j >> 24 & 0xFF));
  }
  
  public void setShort(int paramInt, short paramShort)
  {
    requestCapacity(paramInt + 2);
    byte[] arrayOfByte = buffer;
    arrayOfByte[paramInt] = ((byte)(byte)(paramShort & 0xFF));
    arrayOfByte[(paramInt + 1)] = ((byte)(byte)(paramShort >> 8 & 0xFF));
  }
  
  public int writePosition()
  {
    return writePos;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ArrayReadWriteBuf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */