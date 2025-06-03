package u5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import t5.j;
import t5.n;
import v5.e0;
import v5.m;

public final class b
  implements j
{
  public final a a;
  public final long b;
  public final int c;
  public n d;
  public long e;
  public File f;
  public OutputStream g;
  public long h;
  public long i;
  public o j;
  
  public b(q paramq, long paramLong)
  {
    boolean bool;
    if ((paramLong <= 0L) && (paramLong != -1L)) {
      bool = false;
    } else {
      bool = true;
    }
    if (bool)
    {
      bool = paramLong < -1L;
      if ((bool) && (paramLong < 2097152L)) {
        m.f("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
      }
      a = paramq;
      if (!bool) {
        paramLong = Long.MAX_VALUE;
      }
      b = paramLong;
      c = 20480;
      return;
    }
    throw new IllegalStateException("fragmentSize must be positive or C.LENGTH_UNSET.");
  }
  
  public final void a(n paramn)
  {
    h.getClass();
    long l = g;
    int k = 1;
    int m;
    if (l == -1L)
    {
      if ((i & 0x2) == 2) {
        m = 1;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        d = null;
        return;
      }
    }
    d = paramn;
    if ((i & 0x4) == 4) {
      m = k;
    } else {
      m = 0;
    }
    if (m != 0) {
      l = b;
    } else {
      l = Long.MAX_VALUE;
    }
    e = l;
    i = 0L;
    try
    {
      c(paramn);
      return;
    }
    catch (IOException paramn)
    {
      throw new a(paramn);
    }
  }
  
  public final void b()
  {
    Object localObject1 = g;
    if (localObject1 == null) {
      return;
    }
    try
    {
      ((OutputStream)localObject1).flush();
      e0.g(g);
      g = null;
      localObject1 = f;
      f = null;
      a.h((File)localObject1, h);
      return;
    }
    finally
    {
      e0.g(g);
      g = null;
      File localFile = f;
      f = null;
      localFile.delete();
    }
  }
  
  public final void c(n paramn)
  {
    long l1 = g;
    long l2 = -1L;
    if (l1 != -1L) {
      l2 = Math.min(l1 - i, e);
    }
    a locala = a;
    Object localObject = h;
    int k = e0.a;
    f = locala.e(f + i, l2, (String)localObject);
    localObject = new FileOutputStream(f);
    paramn = (n)localObject;
    if (c > 0)
    {
      paramn = j;
      if (paramn == null) {
        j = new o((FileOutputStream)localObject, c);
      } else {
        paramn.f((OutputStream)localObject);
      }
      paramn = j;
    }
    g = paramn;
    h = 0L;
  }
  
  public final void close()
  {
    if (d == null) {
      return;
    }
    try
    {
      b();
      return;
    }
    catch (IOException localIOException)
    {
      throw new a(localIOException);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    n localn = d;
    if (localn == null) {
      return;
    }
    int k = 0;
    while (k < paramInt2) {
      try
      {
        if (h == e)
        {
          b();
          c(localn);
        }
        int m = (int)Math.min(paramInt2 - k, e - h);
        OutputStream localOutputStream = g;
        int n = e0.a;
        localOutputStream.write(paramArrayOfByte, paramInt1 + k, m);
        k += m;
        long l1 = h;
        long l2 = m;
        h = (l1 + l2);
        i += l2;
      }
      catch (IOException paramArrayOfByte)
      {
        throw new a(paramArrayOfByte);
      }
    }
  }
  
  public static final class a
    extends a.a
  {
    public a(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     u5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */