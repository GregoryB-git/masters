package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import xc.w;

public abstract interface HttpCodec
{
  public abstract void a();
  
  public abstract void b(Request paramRequest);
  
  public abstract RealResponseBody c(Response paramResponse);
  
  public abstract void cancel();
  
  public abstract Response.Builder d(boolean paramBoolean);
  
  public abstract void e();
  
  public abstract w f(Request paramRequest, long paramLong);
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.HttpCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */