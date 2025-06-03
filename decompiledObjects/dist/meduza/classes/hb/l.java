package hb;

import a0.j;
import ec.i;
import gb.u2;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import xc.f;
import xc.t;
import xc.u;

public final class l
  extends gb.b
{
  public final f a;
  
  public l(f paramf)
  {
    a = paramf;
  }
  
  public final void U(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt2 > 0)
    {
      int i = a.read(paramArrayOfByte, paramInt1, paramInt2);
      if (i != -1)
      {
        paramInt2 -= i;
        paramInt1 += i;
      }
      else
      {
        throw new IndexOutOfBoundsException(j.h("EOF trying to read ", paramInt2, " bytes"));
      }
    }
  }
  
  public final int b()
  {
    return (int)a.b;
  }
  
  public final void close()
  {
    a.f();
  }
  
  public final void m0(OutputStream paramOutputStream, int paramInt)
  {
    f localf = a;
    long l1 = paramInt;
    localf.getClass();
    i.e(paramOutputStream, "out");
    xc.b.b(b, 0L, l1);
    Object localObject = a;
    while (l1 > 0L)
    {
      i.b(localObject);
      paramInt = (int)Math.min(l1, c - b);
      paramOutputStream.write(a, b, paramInt);
      int i = b + paramInt;
      b = i;
      long l2 = b;
      long l3 = paramInt;
      b = (l2 - l3);
      l2 = l1 - l3;
      l1 = l2;
      if (i == c)
      {
        t localt = ((t)localObject).a();
        a = localt;
        u.a((t)localObject);
        localObject = localt;
        l1 = l2;
      }
    }
  }
  
  public final u2 r(int paramInt)
  {
    f localf = new f();
    localf.g0(a, paramInt);
    return new l(localf);
  }
  
  public final int readUnsignedByte()
  {
    try
    {
      int i = a.readByte();
      return i & 0xFF;
    }
    catch (EOFException localEOFException)
    {
      throw new IndexOutOfBoundsException(localEOFException.getMessage());
    }
  }
  
  public final void skipBytes(int paramInt)
  {
    try
    {
      a.skip(paramInt);
      return;
    }
    catch (EOFException localEOFException)
    {
      throw new IndexOutOfBoundsException(localEOFException.getMessage());
    }
  }
  
  public final void v0(ByteBuffer paramByteBuffer)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     hb.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */