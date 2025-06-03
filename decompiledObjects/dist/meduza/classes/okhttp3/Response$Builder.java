package okhttp3;

import f;
import g;

public class Response$Builder
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
  
  public Response$Builder()
  {
    f = new Headers.Builder();
  }
  
  public Response$Builder(Response paramResponse)
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

/* Location:
 * Qualified Name:     okhttp3.Response.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */