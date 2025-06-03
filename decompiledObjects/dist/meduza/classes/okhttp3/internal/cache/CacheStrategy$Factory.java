package okhttp3.internal.cache;

import java.util.Date;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

public class CacheStrategy$Factory
{
  public Date a;
  public String b;
  public Date c;
  public String d;
  public Date e;
  public long f;
  public long g;
  public String h;
  public int i = -1;
  
  public CacheStrategy$Factory(long paramLong, Request paramRequest, Response paramResponse)
  {
    if (paramResponse != null)
    {
      f = s;
      g = t;
      paramResponse = f;
      int j = 0;
      int k = a.length / 2;
      while (j < k)
      {
        String str = paramResponse.d(j);
        paramRequest = paramResponse.f(j);
        if ("Date".equalsIgnoreCase(str))
        {
          a = HttpDate.a(paramRequest);
          b = paramRequest;
        }
        else if ("Expires".equalsIgnoreCase(str))
        {
          e = HttpDate.a(paramRequest);
        }
        else if ("Last-Modified".equalsIgnoreCase(str))
        {
          c = HttpDate.a(paramRequest);
          d = paramRequest;
        }
        else if ("ETag".equalsIgnoreCase(str))
        {
          h = paramRequest;
        }
        else if ("Age".equalsIgnoreCase(str))
        {
          i = HttpHeaders.c(-1, paramRequest);
        }
        j++;
      }
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.CacheStrategy.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */