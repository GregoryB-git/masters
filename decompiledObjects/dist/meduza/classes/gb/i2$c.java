package gb;

import eb.e1;
import eb.g1;
import f;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import m.e;

public final class i2$c
  extends FilterInputStream
{
  public final int a;
  public final l3 b;
  public long c;
  public long d;
  public long e = -1L;
  
  public i2$c(InputStream paramInputStream, int paramInt, l3 paraml3)
  {
    super(paramInputStream);
    a = paramInt;
    b = paraml3;
  }
  
  public final void f()
  {
    long l1 = d;
    long l2 = c;
    if (l1 > l2)
    {
      e[] arrayOfe = b.a;
      int i = arrayOfe.length;
      for (int j = 0; j < i; j++) {
        arrayOfe[j].i(l1 - l2);
      }
      c = d;
    }
  }
  
  public final void g()
  {
    if (d <= a) {
      return;
    }
    e1 locale1 = e1.k;
    StringBuilder localStringBuilder = f.l("Decompressed gRPC message exceeds maximum size ");
    localStringBuilder.append(a);
    throw new g1(locale1.g(localStringBuilder.toString()));
  }
  
  public final void mark(int paramInt)
  {
    try
    {
      in.mark(paramInt);
      e = d;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int read()
  {
    int i = in.read();
    if (i != -1) {
      d += 1L;
    }
    g();
    f();
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = in.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      d += paramInt1;
    }
    g();
    f();
    return paramInt1;
  }
  
  public final void reset()
  {
    try
    {
      if (in.markSupported())
      {
        if (e != -1L)
        {
          in.reset();
          d = e;
          return;
        }
        localIOException = new java/io/IOException;
        localIOException.<init>("Mark not set");
        throw localIOException;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Mark not supported");
      throw localIOException;
    }
    finally {}
  }
  
  public final long skip(long paramLong)
  {
    paramLong = in.skip(paramLong);
    d += paramLong;
    g();
    f();
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     gb.i2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */