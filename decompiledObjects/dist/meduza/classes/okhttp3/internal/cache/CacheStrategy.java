package okhttp3.internal.cache;

import java.util.Date;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

public final class CacheStrategy
{
  public final Request a;
  public final Response b;
  
  public CacheStrategy(Request paramRequest, Response paramResponse)
  {
    a = paramRequest;
    b = paramResponse;
  }
  
  public static boolean a(Request paramRequest, Response paramResponse)
  {
    int i = c;
    boolean bool1 = false;
    if ((i != 200) && (i != 410) && (i != 414) && (i != 501) && (i != 203) && (i != 204)) {
      if (i != 307)
      {
        if ((i == 308) || (i == 404) || (i == 405)) {}
      }
      else {
        switch (i)
        {
        default: 
          break;
        case 302: 
          if ((paramResponse.g("Expires") == null) && (fc == -1) && (!ff) && (!fe)) {
            return false;
          }
          break;
        }
      }
    }
    boolean bool2 = bool1;
    if (!fb)
    {
      paramResponse = f;
      if (paramResponse != null)
      {
        paramRequest = paramResponse;
      }
      else
      {
        paramResponse = CacheControl.a(c);
        f = paramResponse;
        paramRequest = paramResponse;
      }
      bool2 = bool1;
      if (!b) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static class Factory
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
    
    public Factory(long paramLong, Request paramRequest, Response paramResponse)
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
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.CacheStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */