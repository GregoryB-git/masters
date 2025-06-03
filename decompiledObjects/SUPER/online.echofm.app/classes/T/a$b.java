package T;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class a$b
  extends InputStream
  implements DataInput
{
  public static final ByteOrder s = ByteOrder.LITTLE_ENDIAN;
  public static final ByteOrder t = ByteOrder.BIG_ENDIAN;
  public final DataInputStream o;
  public ByteOrder p = ByteOrder.BIG_ENDIAN;
  public int q;
  public byte[] r;
  
  public a$b(InputStream paramInputStream)
  {
    this(paramInputStream, ByteOrder.BIG_ENDIAN);
  }
  
  public a$b(InputStream paramInputStream, ByteOrder paramByteOrder)
  {
    paramInputStream = new DataInputStream(paramInputStream);
    o = paramInputStream;
    paramInputStream.mark(0);
    q = 0;
    p = paramByteOrder;
  }
  
  public a$b(byte[] paramArrayOfByte)
  {
    this(new ByteArrayInputStream(paramArrayOfByte), ByteOrder.BIG_ENDIAN);
  }
  
  public int a()
  {
    return q;
  }
  
  public int available()
  {
    return o.available();
  }
  
  public long b()
  {
    return readInt() & 0xFFFFFFFF;
  }
  
  public void c(ByteOrder paramByteOrder)
  {
    p = paramByteOrder;
  }
  
  public void e(int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      Object localObject = o;
      int j = paramInt - i;
      int k = (int)((InputStream)localObject).skip(j);
      int m = k;
      if (k <= 0)
      {
        if (r == null) {
          r = new byte[' '];
        }
        m = Math.min(8192, j);
        m = o.read(r, 0, m);
        if (m == -1)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Reached EOF while skipping ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" bytes.");
          throw new EOFException(((StringBuilder)localObject).toString());
        }
      }
      i += m;
    }
    q += i;
  }
  
  public void mark(int paramInt)
  {
    throw new UnsupportedOperationException("Mark is currently unsupported");
  }
  
  public int read()
  {
    q += 1;
    return o.read();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = o.read(paramArrayOfByte, paramInt1, paramInt2);
    q += paramInt1;
    return paramInt1;
  }
  
  public boolean readBoolean()
  {
    q += 1;
    return o.readBoolean();
  }
  
  public byte readByte()
  {
    q += 1;
    int i = o.read();
    if (i >= 0) {
      return (byte)i;
    }
    throw new EOFException();
  }
  
  public char readChar()
  {
    q += 2;
    return o.readChar();
  }
  
  public double readDouble()
  {
    return Double.longBitsToDouble(readLong());
  }
  
  public float readFloat()
  {
    return Float.intBitsToFloat(readInt());
  }
  
  public void readFully(byte[] paramArrayOfByte)
  {
    q += paramArrayOfByte.length;
    o.readFully(paramArrayOfByte);
  }
  
  public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    q += paramInt2;
    o.readFully(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public int readInt()
  {
    q += 4;
    int i = o.read();
    int j = o.read();
    int k = o.read();
    int m = o.read();
    if ((i | j | k | m) >= 0)
    {
      Object localObject = p;
      if (localObject == s) {
        return (m << 24) + (k << 16) + (j << 8) + i;
      }
      if (localObject == t) {
        return (i << 24) + (j << 16) + (k << 8) + m;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid byte order: ");
      ((StringBuilder)localObject).append(p);
      throw new IOException(((StringBuilder)localObject).toString());
    }
    throw new EOFException();
  }
  
  public String readLine()
  {
    Log.d("ExifInterface", "Currently unsupported");
    return null;
  }
  
  public long readLong()
  {
    q += 8;
    int i = o.read();
    int j = o.read();
    int k = o.read();
    int m = o.read();
    int n = o.read();
    int i1 = o.read();
    int i2 = o.read();
    int i3 = o.read();
    if ((i | j | k | m | n | i1 | i2 | i3) >= 0)
    {
      Object localObject = p;
      if (localObject == s) {
        return (i3 << 56) + (i2 << 48) + (i1 << 40) + (n << 32) + (m << 24) + (k << 16) + (j << 8) + i;
      }
      if (localObject == t) {
        return (i << 56) + (j << 48) + (k << 40) + (m << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid byte order: ");
      ((StringBuilder)localObject).append(p);
      throw new IOException(((StringBuilder)localObject).toString());
    }
    throw new EOFException();
  }
  
  public short readShort()
  {
    q += 2;
    int i = o.read();
    int j = o.read();
    if ((i | j) >= 0)
    {
      Object localObject = p;
      if (localObject == s) {
        return (short)((j << 8) + i);
      }
      if (localObject == t) {
        return (short)((i << 8) + j);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid byte order: ");
      ((StringBuilder)localObject).append(p);
      throw new IOException(((StringBuilder)localObject).toString());
    }
    throw new EOFException();
  }
  
  public String readUTF()
  {
    q += 2;
    return o.readUTF();
  }
  
  public int readUnsignedByte()
  {
    q += 1;
    return o.readUnsignedByte();
  }
  
  public int readUnsignedShort()
  {
    q += 2;
    int i = o.read();
    int j = o.read();
    if ((i | j) >= 0)
    {
      Object localObject = p;
      if (localObject == s) {
        return (j << 8) + i;
      }
      if (localObject == t) {
        return (i << 8) + j;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid byte order: ");
      ((StringBuilder)localObject).append(p);
      throw new IOException(((StringBuilder)localObject).toString());
    }
    throw new EOFException();
  }
  
  public void reset()
  {
    throw new UnsupportedOperationException("Reset is currently unsupported");
  }
  
  public int skipBytes(int paramInt)
  {
    throw new UnsupportedOperationException("skipBytes is currently unsupported");
  }
}

/* Location:
 * Qualified Name:     T.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */