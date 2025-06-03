package okhttp3.internal.cache;

import okhttp3.Response;

public abstract interface InternalCache
{
  public abstract void a();
  
  public abstract CacheRequest b();
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract Response get();
  
  public abstract void remove();
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.InternalCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */