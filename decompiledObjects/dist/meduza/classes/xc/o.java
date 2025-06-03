package xc;

import a0.j;
import ec.i;
import java.io.IOException;
import java.io.InputStream;
import p2.m0;

public final class o
  implements y
{
  public final InputStream a;
  public final z b;
  
  public o(InputStream paramInputStream, z paramz)
  {
    a = paramInputStream;
    b = paramz;
  }
  
  public final z c()
  {
    return b;
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final long e0(f paramf, long paramLong)
  {
    i.e(paramf, "sink");
    boolean bool = paramLong < 0L;
    if (!bool) {
      return 0L;
    }
    if (!bool) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      try
      {
        b.f();
        t localt = paramf.r0(1);
        int i = (int)Math.min(paramLong, 8192 - c);
        i = a.read(a, c, i);
        if (i == -1)
        {
          if (b == c)
          {
            a = localt.a();
            u.a(localt);
          }
          return -1L;
        }
        c += i;
        paramLong = b;
        long l = i;
        b = (paramLong + l);
        return l;
      }
      catch (AssertionError paramf)
      {
        if (m0.Q(paramf)) {
          throw new IOException(paramf);
        }
        throw paramf;
      }
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong).toString());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("source(");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     xc.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */