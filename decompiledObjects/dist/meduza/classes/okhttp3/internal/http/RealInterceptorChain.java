package okhttp3.internal.http;

import f;
import java.util.List;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class RealInterceptorChain
  implements Interceptor.Chain
{
  public final List<Interceptor> a;
  public final StreamAllocation b;
  public final HttpCodec c;
  public final RealConnection d;
  public final int e;
  public final Request f;
  public final Call g;
  public final EventListener h;
  public final int i;
  public final int j;
  public final int k;
  public int l;
  
  public RealInterceptorChain(List<Interceptor> paramList, StreamAllocation paramStreamAllocation, HttpCodec paramHttpCodec, RealConnection paramRealConnection, int paramInt1, Request paramRequest, Call paramCall, EventListener paramEventListener, int paramInt2, int paramInt3, int paramInt4)
  {
    a = paramList;
    d = paramRealConnection;
    b = paramStreamAllocation;
    c = paramHttpCodec;
    e = paramInt1;
    f = paramRequest;
    g = paramCall;
    h = paramEventListener;
    i = paramInt2;
    j = paramInt3;
    k = paramInt4;
  }
  
  public final int a()
  {
    return j;
  }
  
  public final int b()
  {
    return k;
  }
  
  public final Response c(Request paramRequest)
  {
    return d(paramRequest, b, c, d);
  }
  
  public final Response d(Request paramRequest, StreamAllocation paramStreamAllocation, HttpCodec paramHttpCodec, RealConnection paramRealConnection)
  {
    if (e < a.size())
    {
      l += 1;
      if ((c != null) && (!d.j(a)))
      {
        paramRequest = f.l("network interceptor ");
        paramRequest.append(a.get(e - 1));
        paramRequest.append(" must retain the same host and port");
        throw new IllegalStateException(paramRequest.toString());
      }
      if ((c != null) && (l > 1))
      {
        paramRequest = f.l("network interceptor ");
        paramRequest.append(a.get(e - 1));
        paramRequest.append(" must call proceed() exactly once");
        throw new IllegalStateException(paramRequest.toString());
      }
      List localList = a;
      int m = e;
      paramStreamAllocation = new RealInterceptorChain(localList, paramStreamAllocation, paramHttpCodec, paramRealConnection, m + 1, paramRequest, g, h, i, j, k);
      paramRequest = (Interceptor)localList.get(m);
      paramRealConnection = paramRequest.a(paramStreamAllocation);
      if ((paramHttpCodec != null) && (e + 1 < a.size()) && (l != 1))
      {
        paramStreamAllocation = new StringBuilder();
        paramStreamAllocation.append("network interceptor ");
        paramStreamAllocation.append(paramRequest);
        paramStreamAllocation.append(" must call proceed() exactly once");
        throw new IllegalStateException(paramStreamAllocation.toString());
      }
      if (paramRealConnection != null)
      {
        if (o != null) {
          return paramRealConnection;
        }
        paramStreamAllocation = new StringBuilder();
        paramStreamAllocation.append("interceptor ");
        paramStreamAllocation.append(paramRequest);
        paramStreamAllocation.append(" returned a response with no body");
        throw new IllegalStateException(paramStreamAllocation.toString());
      }
      paramStreamAllocation = new StringBuilder();
      paramStreamAllocation.append("interceptor ");
      paramStreamAllocation.append(paramRequest);
      paramStreamAllocation.append(" returned null");
      throw new NullPointerException(paramStreamAllocation.toString());
    }
    throw new AssertionError();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.RealInterceptorChain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */