package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import xc.f;
import xc.g;
import xc.h;
import xc.r;
import xc.w;
import xc.y;
import xc.z;

class CacheInterceptor$1
  implements y
{
  public boolean a;
  
  public CacheInterceptor$1(h paramh, CacheRequest paramCacheRequest, r paramr) {}
  
  public final z c()
  {
    return b.c();
  }
  
  public final void close()
  {
    if (!a)
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      boolean bool;
      try
      {
        bool = Util.s(this, 100, localTimeUnit);
      }
      catch (IOException localIOException)
      {
        bool = false;
      }
      if (!bool)
      {
        a = true;
        c.a();
      }
    }
    b.close();
  }
  
  public final long e0(f paramf, long paramLong)
  {
    try
    {
      paramLong = b.e0(paramf, paramLong);
      if (paramLong == -1L)
      {
        if (!a)
        {
          a = true;
          d.close();
        }
        return -1L;
      }
      f localf = d.k();
      paramf.H(b - paramLong, paramLong, localf);
      d.D();
      return paramLong;
    }
    catch (IOException paramf)
    {
      if (!a)
      {
        a = true;
        c.a();
      }
      throw paramf;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.CacheInterceptor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */