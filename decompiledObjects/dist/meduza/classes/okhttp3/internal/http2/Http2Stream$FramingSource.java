package okhttp3.internal.http2;

import a0.j;
import java.io.IOException;
import java.util.ArrayDeque;
import xc.c;
import xc.f;
import xc.y;
import xc.z;

final class Http2Stream$FramingSource
  implements y
{
  public final f a = new f();
  public final f b = new f();
  public final long c;
  public boolean d;
  public boolean e;
  
  public Http2Stream$FramingSource(Http2Stream paramHttp2Stream, long paramLong)
  {
    c = paramLong;
  }
  
  public final z c()
  {
    return f.i;
  }
  
  public final void close()
  {
    synchronized (f)
    {
      d = true;
      f localf = b;
      long l = b;
      localf.f();
      if (!f.e.isEmpty()) {
        f.getClass();
      }
      f.notifyAll();
      if (l > 0L) {
        f.d.b0(l);
      }
      f.a();
      return;
    }
  }
  
  public final long e0(f paramf, long paramLong)
  {
    if (paramLong >= 0L) {
      for (;;)
      {
        Object localObject1 = null;
        synchronized (f)
        {
          f.i.h();
          try
          {
            Http2Stream localHttp2Stream2 = f;
            Object localObject2 = k;
            if (localObject2 != null) {
              localObject1 = localObject2;
            }
            if (!d)
            {
              if (!e.isEmpty()) {
                f.getClass();
              }
              localObject2 = b;
              long l1 = b;
              if (l1 > 0L)
              {
                l1 = ((f)localObject2).e0(paramf, Math.min(paramLong, l1));
                paramf = f;
                long l2 = a + l1;
                a = l2;
                paramLong = l1;
                if (localObject1 == null)
                {
                  paramLong = l1;
                  if (l2 >= d.z.a() / 2)
                  {
                    paramf = f;
                    d.i0(c, a);
                    f.a = 0L;
                    paramLong = l1;
                  }
                }
              }
              else
              {
                if ((!e) && (localObject1 == null))
                {
                  f.g();
                  f.i.l();
                  continue;
                }
                paramLong = -1L;
              }
              f.i.l();
              if (paramLong != -1L)
              {
                f.d.b0(paramLong);
                return paramLong;
              }
              if (localObject1 == null) {
                return -1L;
              }
              throw new StreamResetException((ErrorCode)localObject1);
            }
            else
            {
              paramf = new java/io/IOException;
              paramf.<init>("stream closed");
              throw paramf;
            }
          }
          finally
          {
            f.i.l();
          }
        }
      }
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Stream.FramingSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */