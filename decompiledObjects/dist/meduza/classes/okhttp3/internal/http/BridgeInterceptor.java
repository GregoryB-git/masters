package okhttp3.internal.http;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import xc.m;
import xc.s;
import xc.y;

public final class BridgeInterceptor
  implements Interceptor
{
  public final CookieJar a;
  
  public BridgeInterceptor(CookieJar paramCookieJar)
  {
    a = paramCookieJar;
  }
  
  public final Response a(RealInterceptorChain paramRealInterceptorChain)
  {
    Object localObject1 = f;
    localObject1.getClass();
    Object localObject2 = new Request.Builder((Request)localObject1);
    Object localObject3 = d;
    if (localObject3 != null)
    {
      localObject4 = ((RequestBody)localObject3).b();
      if (localObject4 != null)
      {
        localObject4 = a;
        c.d("Content-Type", (String)localObject4);
      }
      long l = ((RequestBody)localObject3).a();
      if (l != -1L)
      {
        localObject3 = Long.toString(l);
        c.d("Content-Length", (String)localObject3);
        ((Request.Builder)localObject2).c("Transfer-Encoding");
      }
      else
      {
        c.d("Transfer-Encoding", "chunked");
        ((Request.Builder)localObject2).c("Content-Length");
      }
    }
    localObject3 = ((Request)localObject1).a("Host");
    int i = 0;
    if (localObject3 == null)
    {
      localObject3 = Util.m(a, false);
      c.d("Host", (String)localObject3);
    }
    if (((Request)localObject1).a("Connection") == null) {
      c.d("Connection", "Keep-Alive");
    }
    int j;
    if ((((Request)localObject1).a("Accept-Encoding") == null) && (((Request)localObject1).a("Range") == null))
    {
      c.d("Accept-Encoding", "gzip");
      j = 1;
    }
    else
    {
      j = 0;
    }
    Object localObject4 = a.a();
    if (!((List)localObject4).isEmpty())
    {
      localObject3 = new StringBuilder();
      int k = ((List)localObject4).size();
      while (i < k)
      {
        if (i > 0) {
          ((StringBuilder)localObject3).append("; ");
        }
        Cookie localCookie = (Cookie)((List)localObject4).get(i);
        ((StringBuilder)localObject3).append(a);
        ((StringBuilder)localObject3).append('=');
        ((StringBuilder)localObject3).append(b);
        i++;
      }
      localObject3 = ((StringBuilder)localObject3).toString();
      c.d("Cookie", (String)localObject3);
    }
    if (((Request)localObject1).a("User-Agent") == null) {
      c.d("User-Agent", "okhttp/3.12.13");
    }
    paramRealInterceptorChain = paramRealInterceptorChain.c(((Request.Builder)localObject2).a());
    HttpHeaders.d(a, a, f);
    localObject2 = new Response.Builder(paramRealInterceptorChain);
    a = ((Request)localObject1);
    if ((j != 0) && ("gzip".equalsIgnoreCase(paramRealInterceptorChain.g("Content-Encoding"))) && (HttpHeaders.b(paramRealInterceptorChain)))
    {
      localObject1 = new m(o.H());
      localObject3 = f.e();
      ((Headers.Builder)localObject3).c("Content-Encoding");
      ((Headers.Builder)localObject3).c("Content-Length");
      f = new Headers((Headers.Builder)localObject3).e();
      g = new RealResponseBody(paramRealInterceptorChain.g("Content-Type"), -1L, new s((y)localObject1));
    }
    return ((Response.Builder)localObject2).a();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.BridgeInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */