package gb;

import eb.j0;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public final class v2
{
  public static final b a = new b(new byte[0], 0, 0);
  
  public static final class a
    extends InputStream
    implements j0
  {
    public u2 a;
    
    public a(u2 paramu2)
    {
      x6.b.y(paramu2, "buffer");
      a = paramu2;
    }
    
    public final int available()
    {
      return a.b();
    }
    
    public final void close()
    {
      a.close();
    }
    
    public final void mark(int paramInt)
    {
      a.Z();
    }
    
    public final boolean markSupported()
    {
      return a.markSupported();
    }
    
    public final int read()
    {
      if (a.b() == 0) {
        return -1;
      }
      return a.readUnsignedByte();
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (a.b() == 0) {
        return -1;
      }
      paramInt2 = Math.min(a.b(), paramInt2);
      a.U(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt2;
    }
    
    public final void reset()
    {
      a.reset();
    }
    
    public final long skip(long paramLong)
    {
      int i = (int)Math.min(a.b(), paramLong);
      a.skipBytes(i);
      return i;
    }
  }
  
  public static final class b
    extends b
  {
    public int a;
    public final int b;
    public final byte[] c;
    public int d = -1;
    
    public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      boolean bool1 = true;
      boolean bool2;
      if (paramInt1 >= 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      x6.b.s("offset must be >= 0", bool2);
      if (paramInt2 >= 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      x6.b.s("length must be >= 0", bool2);
      paramInt2 += paramInt1;
      if (paramInt2 <= paramArrayOfByte.length) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      x6.b.s("offset + length exceeds array boundary", bool2);
      c = paramArrayOfByte;
      a = paramInt1;
      b = paramInt2;
    }
    
    public final void U(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      System.arraycopy(c, a, paramArrayOfByte, paramInt1, paramInt2);
      a += paramInt2;
    }
    
    public final void Z()
    {
      d = a;
    }
    
    public final int b()
    {
      return b - a;
    }
    
    public final void m0(OutputStream paramOutputStream, int paramInt)
    {
      f(paramInt);
      paramOutputStream.write(c, a, paramInt);
      a += paramInt;
    }
    
    public final u2 r(int paramInt)
    {
      f(paramInt);
      int i = a;
      a = (i + paramInt);
      return new b(c, i, paramInt);
    }
    
    public final int readUnsignedByte()
    {
      f(1);
      byte[] arrayOfByte = c;
      int i = a;
      a = (i + 1);
      return arrayOfByte[i] & 0xFF;
    }
    
    public final void reset()
    {
      int i = d;
      if (i != -1)
      {
        a = i;
        return;
      }
      throw new InvalidMarkException();
    }
    
    public final void skipBytes(int paramInt)
    {
      f(paramInt);
      a += paramInt;
    }
    
    public final void v0(ByteBuffer paramByteBuffer)
    {
      x6.b.y(paramByteBuffer, "dest");
      int i = paramByteBuffer.remaining();
      f(i);
      paramByteBuffer.put(c, a, i);
      a += i;
    }
  }
}

/* Location:
 * Qualified Name:     gb.v2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */