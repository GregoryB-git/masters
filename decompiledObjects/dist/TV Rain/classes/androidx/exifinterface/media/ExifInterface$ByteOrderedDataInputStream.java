package androidx.exifinterface.media;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import z2;

class ExifInterface$ByteOrderedDataInputStream
  extends InputStream
  implements DataInput
{
  private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
  private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
  private ByteOrder mByteOrder = ByteOrder.BIG_ENDIAN;
  private DataInputStream mDataInputStream;
  public final int mLength;
  public int mPosition;
  
  public ExifInterface$ByteOrderedDataInputStream(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream = new DataInputStream(paramInputStream);
    mDataInputStream = paramInputStream;
    int i = paramInputStream.available();
    mLength = i;
    mPosition = 0;
    mDataInputStream.mark(i);
  }
  
  public ExifInterface$ByteOrderedDataInputStream(byte[] paramArrayOfByte)
    throws IOException
  {
    this(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public int available()
    throws IOException
  {
    return mDataInputStream.available();
  }
  
  public int peek()
  {
    return mPosition;
  }
  
  public int read()
    throws IOException
  {
    mPosition += 1;
    return mDataInputStream.read();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = mDataInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
    mPosition += paramInt1;
    return paramInt1;
  }
  
  public boolean readBoolean()
    throws IOException
  {
    mPosition += 1;
    return mDataInputStream.readBoolean();
  }
  
  public byte readByte()
    throws IOException
  {
    int i = mPosition + 1;
    mPosition = i;
    if (i <= mLength)
    {
      i = mDataInputStream.read();
      if (i >= 0) {
        return (byte)i;
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public char readChar()
    throws IOException
  {
    mPosition += 2;
    return mDataInputStream.readChar();
  }
  
  public double readDouble()
    throws IOException
  {
    return Double.longBitsToDouble(readLong());
  }
  
  public float readFloat()
    throws IOException
  {
    return Float.intBitsToFloat(readInt());
  }
  
  public void readFully(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = mPosition + paramArrayOfByte.length;
    mPosition = i;
    if (i <= mLength)
    {
      if (mDataInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length) == paramArrayOfByte.length) {
        return;
      }
      throw new IOException("Couldn't read up to the length of buffer");
    }
    throw new EOFException();
  }
  
  public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = mPosition + paramInt2;
    mPosition = i;
    if (i <= mLength)
    {
      if (mDataInputStream.read(paramArrayOfByte, paramInt1, paramInt2) == paramInt2) {
        return;
      }
      throw new IOException("Couldn't read up to the length of buffer");
    }
    throw new EOFException();
  }
  
  public int readInt()
    throws IOException
  {
    int i = mPosition + 4;
    mPosition = i;
    if (i <= mLength)
    {
      int j = mDataInputStream.read();
      int k = mDataInputStream.read();
      i = mDataInputStream.read();
      int m = mDataInputStream.read();
      if ((j | k | i | m) >= 0)
      {
        Object localObject = mByteOrder;
        if (localObject == LITTLE_ENDIAN) {
          return (m << 24) + (i << 16) + (k << 8) + j;
        }
        if (localObject == BIG_ENDIAN) {
          return (j << 24) + (k << 16) + (i << 8) + m;
        }
        localObject = z2.t("Invalid byte order: ");
        ((StringBuilder)localObject).append(mByteOrder);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public String readLine()
    throws IOException
  {
    Log.d("ExifInterface", "Currently unsupported");
    return null;
  }
  
  public long readLong()
    throws IOException
  {
    int i = mPosition + 8;
    mPosition = i;
    if (i <= mLength)
    {
      int j = mDataInputStream.read();
      int k = mDataInputStream.read();
      int m = mDataInputStream.read();
      i = mDataInputStream.read();
      int n = mDataInputStream.read();
      int i1 = mDataInputStream.read();
      int i2 = mDataInputStream.read();
      int i3 = mDataInputStream.read();
      if ((j | k | m | i | n | i1 | i2 | i3) >= 0)
      {
        Object localObject = mByteOrder;
        if (localObject == LITTLE_ENDIAN) {
          return (i3 << 56) + (i2 << 48) + (i1 << 40) + (n << 32) + (i << 24) + (m << 16) + (k << 8) + j;
        }
        if (localObject == BIG_ENDIAN) {
          return (j << 56) + (k << 48) + (m << 40) + (i << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3;
        }
        localObject = z2.t("Invalid byte order: ");
        ((StringBuilder)localObject).append(mByteOrder);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public short readShort()
    throws IOException
  {
    int i = mPosition + 2;
    mPosition = i;
    if (i <= mLength)
    {
      i = mDataInputStream.read();
      int j = mDataInputStream.read();
      if ((i | j) >= 0)
      {
        Object localObject = mByteOrder;
        if (localObject == LITTLE_ENDIAN) {
          return (short)((j << 8) + i);
        }
        if (localObject == BIG_ENDIAN) {
          return (short)((i << 8) + j);
        }
        localObject = z2.t("Invalid byte order: ");
        ((StringBuilder)localObject).append(mByteOrder);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public String readUTF()
    throws IOException
  {
    mPosition += 2;
    return mDataInputStream.readUTF();
  }
  
  public int readUnsignedByte()
    throws IOException
  {
    mPosition += 1;
    return mDataInputStream.readUnsignedByte();
  }
  
  public long readUnsignedInt()
    throws IOException
  {
    return readInt() & 0xFFFFFFFF;
  }
  
  public int readUnsignedShort()
    throws IOException
  {
    int i = mPosition + 2;
    mPosition = i;
    if (i <= mLength)
    {
      i = mDataInputStream.read();
      int j = mDataInputStream.read();
      if ((i | j) >= 0)
      {
        Object localObject = mByteOrder;
        if (localObject == LITTLE_ENDIAN) {
          return (j << 8) + i;
        }
        if (localObject == BIG_ENDIAN) {
          return (i << 8) + j;
        }
        localObject = z2.t("Invalid byte order: ");
        ((StringBuilder)localObject).append(mByteOrder);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public void seek(long paramLong)
    throws IOException
  {
    int i = mPosition;
    if (i > paramLong)
    {
      mPosition = 0;
      mDataInputStream.reset();
      mDataInputStream.mark(mLength);
    }
    else
    {
      paramLong -= i;
    }
    i = (int)paramLong;
    if (skipBytes(i) == i) {
      return;
    }
    throw new IOException("Couldn't seek up to the byteCount");
  }
  
  public void setByteOrder(ByteOrder paramByteOrder)
  {
    mByteOrder = paramByteOrder;
  }
  
  public int skipBytes(int paramInt)
    throws IOException
  {
    int i = Math.min(paramInt, mLength - mPosition);
    paramInt = 0;
    while (paramInt < i) {
      paramInt += mDataInputStream.skipBytes(i - paramInt);
    }
    mPosition += paramInt;
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */