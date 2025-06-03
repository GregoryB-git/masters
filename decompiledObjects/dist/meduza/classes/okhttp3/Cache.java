package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.platform.Platform;
import xc.h;
import xc.w;

public final class Cache
  implements Closeable, Flushable
{
  public final void close()
  {
    throw null;
  }
  
  public final void flush()
  {
    throw null;
  }
  
  public final class CacheRequestImpl
    implements CacheRequest
  {
    public final void a()
    {
      throw null;
    }
    
    public final w b()
    {
      return null;
    }
  }
  
  public static class CacheResponseBody
    extends ResponseBody
  {
    public final h H()
    {
      return null;
    }
    
    public final long f()
    {
      return -1L;
    }
    
    public final MediaType g()
    {
      return null;
    }
  }
  
  public static final class Entry
  {
    static
    {
      Platform.a.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.Cache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */