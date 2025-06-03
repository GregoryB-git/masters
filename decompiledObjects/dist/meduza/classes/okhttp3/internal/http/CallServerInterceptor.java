package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import xc.f;
import xc.r;
import xc.w;

public final class CallServerInterceptor
  implements Interceptor
{
  public final boolean a;
  
  public CallServerInterceptor(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final Response a(RealInterceptorChain paramRealInterceptorChain)
  {
    HttpCodec localHttpCodec = c;
    StreamAllocation localStreamAllocation = b;
    RealConnection localRealConnection = d;
    Request localRequest = f;
    long l = System.currentTimeMillis();
    h.getClass();
    localHttpCodec.b(localRequest);
    h.getClass();
    boolean bool = HttpMethod.b(b);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    if (bool)
    {
      localObject3 = localObject1;
      if (d != null)
      {
        bool = "100-continue".equalsIgnoreCase(localRequest.a("Expect"));
        i = 1;
        if (bool)
        {
          localHttpCodec.e();
          h.getClass();
          localObject2 = localHttpCodec.d(true);
        }
        if (localObject2 == null)
        {
          h.getClass();
          localObject3 = new r(new CountingSink(localHttpCodec.f(localRequest, d.a())));
          d.d((r)localObject3);
          ((r)localObject3).close();
          h.getClass();
          localObject3 = localObject2;
        }
        else
        {
          if (h == null) {
            i = 0;
          }
          localObject3 = localObject2;
          if (i == 0)
          {
            localStreamAllocation.f();
            localObject3 = localObject2;
          }
        }
      }
    }
    localHttpCodec.a();
    localObject2 = localObject3;
    if (localObject3 == null)
    {
      h.getClass();
      localObject2 = localHttpCodec.d(false);
    }
    a = localRequest;
    e = bf;
    k = l;
    l = System.currentTimeMillis();
    localObject3 = ((Response.Builder)localObject2).a();
    int j = c;
    int i = j;
    if (j == 100)
    {
      localObject3 = localHttpCodec.d(false);
      a = localRequest;
      e = bf;
      k = l;
      l = System.currentTimeMillis();
      localObject3 = ((Response.Builder)localObject3).a();
      i = c;
    }
    h.getClass();
    if ((a) && (i == 101))
    {
      paramRealInterceptorChain = new Response.Builder((Response)localObject3);
      localObject3 = Util.c;
    }
    else
    {
      paramRealInterceptorChain = new Response.Builder((Response)localObject3);
      localObject3 = localHttpCodec.c((Response)localObject3);
    }
    g = ((ResponseBody)localObject3);
    paramRealInterceptorChain = paramRealInterceptorChain.a();
    if (("close".equalsIgnoreCase(a.a("Connection"))) || ("close".equalsIgnoreCase(paramRealInterceptorChain.g("Connection")))) {
      localStreamAllocation.f();
    }
    if (((i != 204) && (i != 205)) || (o.f() <= 0L)) {
      return paramRealInterceptorChain;
    }
    localObject3 = a0.j.n("HTTP ", i, " had non-zero Content-Length: ");
    ((StringBuilder)localObject3).append(o.f());
    throw new ProtocolException(((StringBuilder)localObject3).toString());
  }
  
  public static final class CountingSink
    extends xc.j
  {
    public CountingSink(w paramw)
    {
      super();
    }
    
    public final void g0(f paramf, long paramLong)
    {
      super.g0(paramf, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.CallServerInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */