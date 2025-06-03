package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferReadWriteBuf
  implements ReadWriteBuf
{
  private final ByteBuffer buffer;
  
  public ByteBufferReadWriteBuf(ByteBuffer paramByteBuffer)
  {
    buffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  public byte[] data()
  {
    return buffer.array();
  }
  
  public byte get(int paramInt)
  {
    return buffer.get(paramInt);
  }
  
  public boolean getBoolean(int paramInt)
  {
    boolean bool;
    if (get(paramInt) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public double getDouble(int paramInt)
  {
    return buffer.getDouble(paramInt);
  }
  
  public float getFloat(int paramInt)
  {
    return buffer.getFloat(paramInt);
  }
  
  public int getInt(int paramInt)
  {
    return buffer.getInt(paramInt);
  }
  
  public long getLong(int paramInt)
  {
    return buffer.getLong(paramInt);
  }
  
  public short getShort(int paramInt)
  {
    return buffer.getShort(paramInt);
  }
  
  public String getString(int paramInt1, int paramInt2)
  {
    return Utf8Safe.decodeUtf8Buffer(buffer, paramInt1, paramInt2);
  }
  
  public int limit()
  {
    return buffer.limit();
  }
  
  public void put(byte paramByte)
  {
    buffer.put(paramByte);
  }
  
  public void put(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    buffer.put(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void putBoolean(boolean paramBoolean)
  {
    buffer.put(paramBoolean);
  }
  
  public void putDouble(double paramDouble)
  {
    buffer.putDouble(paramDouble);
  }
  
  public void putFloat(float paramFloat)
  {
    buffer.putFloat(paramFloat);
  }
  
  public void putInt(int paramInt)
  {
    buffer.putInt(paramInt);
  }
  
  public void putLong(long paramLong)
  {
    buffer.putLong(paramLong);
  }
  
  public void putShort(short paramShort)
  {
    buffer.putShort(paramShort);
  }
  
  public boolean requestCapacity(int paramInt)
  {
    boolean bool;
    if (paramInt <= buffer.limit()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void set(int paramInt, byte paramByte)
  {
    requestCapacity(paramInt + 1);
    buffer.put(paramInt, paramByte);
  }
  
  public void set(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    requestCapacity(paramInt3 - paramInt2 + paramInt1);
    int i = buffer.position();
    buffer.position(paramInt1);
    buffer.put(paramArrayOfByte, paramInt2, paramInt3);
    buffer.position(i);
  }
  
  public void setBoolean(int paramInt, boolean paramBoolean)
  {
    set(paramInt, paramBoolean);
  }
  
  public void setDouble(int paramInt, double paramDouble)
  {
    requestCapacity(paramInt + 8);
    buffer.putDouble(paramInt, paramDouble);
  }
  
  public void setFloat(int paramInt, float paramFloat)
  {
    requestCapacity(paramInt + 4);
    buffer.putFloat(paramInt, paramFloat);
  }
  
  public void setInt(int paramInt1, int paramInt2)
  {
    requestCapacity(paramInt1 + 4);
    buffer.putInt(paramInt1, paramInt2);
  }
  
  public void setLong(int paramInt, long paramLong)
  {
    requestCapacity(paramInt + 8);
    buffer.putLong(paramInt, paramLong);
  }
  
  public void setShort(int paramInt, short paramShort)
  {
    requestCapacity(paramInt + 2);
    buffer.putShort(paramInt, paramShort);
  }
  
  public int writePosition()
  {
    return buffer.position();
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ByteBufferReadWriteBuf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */