package okhttp3.internal.http2;

import xc.c;
import xc.f;
import xc.w;
import xc.z;

final class Http2Stream$FramingSink
  implements w
{
  public final f a = new f();
  public boolean b;
  public boolean c;
  
  public Http2Stream$FramingSink(Http2Stream paramHttp2Stream) {}
  
  public final z c()
  {
    return d.j;
  }
  
  public final void close()
  {
    synchronized (d)
    {
      if (b) {
        return;
      }
      ??? = d;
      if (!h.c)
      {
        if (a.b > 0L) {
          while (a.b > 0L) {
            f(true);
          }
        }
        d.c0(c, true, null, 0L);
      }
      synchronized (d)
      {
        b = true;
        d.d.flush();
        d.a();
        return;
      }
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    synchronized (d)
    {
      d.j.h();
      try
      {
        for (;;)
        {
          localObject2 = d;
          if ((b > 0L) || (c) || (b) || (k != null)) {
            break;
          }
          ((Http2Stream)localObject2).g();
        }
        j.l();
        d.b();
        long l = Math.min(d.b, a.b);
        Object localObject2 = d;
        b -= l;
        j.h();
        try
        {
          ??? = d;
          localObject2 = d;
          int i = c;
          if ((paramBoolean) && (l == a.b)) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          ((Http2Connection)localObject2).c0(i, paramBoolean, a, l);
          return;
        }
        finally
        {
          d.j.l();
        }
        localObject4 = finally;
      }
      finally
      {
        d.j.l();
      }
    }
  }
  
  public final void flush()
  {
    synchronized (d)
    {
      d.b();
      while (a.b > 0L)
      {
        f(false);
        d.d.flush();
      }
      return;
    }
  }
  
  public final void g0(f paramf, long paramLong)
  {
    a.g0(paramf, paramLong);
    while (a.b >= 16384L) {
      f(false);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Stream.FramingSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */