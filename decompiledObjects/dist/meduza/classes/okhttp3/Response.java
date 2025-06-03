package okhttp3;

import f;
import g;
import java.io.Closeable;

public final class Response
  implements Closeable
{
  public final Request a;
  public final Protocol b;
  public final int c;
  public final String d;
  public final Handshake e;
  public final Headers f;
  public final ResponseBody o;
  public final Response p;
  public final Response q;
  public final Response r;
  public final long s;
  public final long t;
  public volatile CacheControl u;
  
  public Response(Builder paramBuilder)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    Headers.Builder localBuilder = f;
    localBuilder.getClass();
    f = new Headers(localBuilder);
    o = g;
    p = h;
    q = i;
    r = j;
    s = k;
    t = l;
  }
  
  public final void close()
  {
    ResponseBody localResponseBody = o;
    if (localResponseBody != null)
    {
      localResponseBody.close();
      return;
    }
    throw new IllegalStateException("response is not eligible for a body and must not be closed");
  }
  
  public final CacheControl f()
  {
    CacheControl localCacheControl = u;
    if (localCacheControl == null)
    {
      localCacheControl = CacheControl.a(f);
      u = localCacheControl;
    }
    return localCacheControl;
  }
  
  public final String g(String paramString)
  {
    paramString = f.c(paramString);
    if (paramString == null) {
      paramString = null;
    }
    return paramString;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Response{protocol=");
    localStringBuilder.append(b);
    localStringBuilder.append(", code=");
    localStringBuilder.append(c);
    localStringBuilder.append(", message=");
    localStringBuilder.append(d);
    localStringBuilder.append(", url=");
    localStringBuilder.append(a.a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Builder
  {
    public Request a;
    public Protocol b;
    public int c = -1;
    public String d;
    public Handshake e;
    public Headers.Builder f;
    public ResponseBody g;
    public Response h;
    public Response i;
    public Response j;
    public long k;
    public long l;
    
    public Builder()
    {
      f = new Headers.Builder();
    }
    
    public Builder(Response paramResponse)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f.e();
      g = o;
      h = p;
      i = q;
      j = r;
      k = s;
      l = t;
    }
    
    public static void b(String paramString, Response paramResponse)
    {
      if (o == null)
      {
        if (p == null)
        {
          if (q == null)
          {
            if (r == null) {
              return;
            }
            throw new IllegalArgumentException(g.d(paramString, ".priorResponse != null"));
          }
          throw new IllegalArgumentException(g.d(paramString, ".cacheResponse != null"));
        }
        throw new IllegalArgumentException(g.d(paramString, ".networkResponse != null"));
      }
      throw new IllegalArgumentException(g.d(paramString, ".body != null"));
    }
    
    public final Response a()
    {
      if (a != null)
      {
        if (b != null)
        {
          if (c >= 0)
          {
            if (d != null) {
              return new Response(this);
            }
            throw new IllegalStateException("message == null");
          }
          StringBuilder localStringBuilder = f.l("code < 0: ");
          localStringBuilder.append(c);
          throw new IllegalStateException(localStringBuilder.toString());
        }
        throw new IllegalStateException("protocol == null");
      }
      throw new IllegalStateException("request == null");
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.Response
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */