package xc;

import a0.j;
import ec.i;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class n
  implements y
{
  public final h a;
  public final Inflater b;
  public int c;
  public boolean d;
  
  public n(s params, Inflater paramInflater)
  {
    a = params;
    b = paramInflater;
  }
  
  public final z c()
  {
    return a.c();
  }
  
  public final void close()
  {
    if (d) {
      return;
    }
    b.end();
    d = true;
    a.close();
  }
  
  public final long e0(f paramf, long paramLong)
  {
    i.e(paramf, "sink");
    for (;;)
    {
      boolean bool = paramLong < 0L;
      int j;
      if (!bool) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {
        break label387;
      }
      if ((d ^ true))
      {
        if (bool) {}
        try
        {
          t localt1 = paramf.r0(1);
          j = (int)Math.min(paramLong, 8192 - c);
          if ((b.needsInput()) && (!a.v()))
          {
            t localt2 = a.t().a;
            i.b(localt2);
            int k = c;
            i = b;
            k -= i;
            c = k;
            b.setInput(a, i, k);
          }
          j = b.inflate(a, c, j);
          int i = c;
          if (i != 0)
          {
            i -= b.getRemaining();
            c -= i;
            a.skip(i);
          }
          long l2;
          if (j > 0)
          {
            c += j;
            long l1 = b;
            l2 = j;
            b = (l1 + l2);
          }
          else
          {
            if (b == c)
            {
              a = localt1.a();
              u.a(localt1);
            }
            l2 = 0L;
          }
          if (l2 > 0L) {
            return l2;
          }
          if ((!b.finished()) && (!b.needsDictionary()))
          {
            if (a.v()) {
              throw new EOFException("source exhausted prematurely");
            }
          }
          else {
            return -1L;
          }
        }
        catch (DataFormatException paramf)
        {
          throw new IOException(paramf);
        }
      }
    }
    throw new IllegalStateException("closed".toString());
    label387:
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong).toString());
  }
}

/* Location:
 * Qualified Name:     xc.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */