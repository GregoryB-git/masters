package okhttp3;

import f;
import g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

public final class Request
{
  public final HttpUrl a;
  public final String b;
  public final Headers c;
  public final RequestBody d;
  public final Map<Class<?>, Object> e;
  public volatile CacheControl f;
  
  public Request(Builder paramBuilder)
  {
    a = a;
    b = b;
    Object localObject = c;
    localObject.getClass();
    c = new Headers((Headers.Builder)localObject);
    d = d;
    localObject = e;
    paramBuilder = Util.a;
    if (((Map)localObject).isEmpty()) {
      paramBuilder = Collections.emptyMap();
    } else {
      paramBuilder = Collections.unmodifiableMap(new LinkedHashMap((Map)localObject));
    }
    e = paramBuilder;
  }
  
  public final String a(String paramString)
  {
    return c.c(paramString);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Request{method=");
    localStringBuilder.append(b);
    localStringBuilder.append(", url=");
    localStringBuilder.append(a);
    localStringBuilder.append(", tags=");
    localStringBuilder.append(e);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Builder
  {
    public HttpUrl a;
    public String b;
    public Headers.Builder c;
    public RequestBody d;
    public Map<Class<?>, Object> e = Collections.emptyMap();
    
    public Builder()
    {
      b = "GET";
      c = new Headers.Builder();
    }
    
    public Builder(Request paramRequest)
    {
      a = a;
      b = b;
      d = d;
      Object localObject;
      if (e.isEmpty()) {
        localObject = Collections.emptyMap();
      } else {
        localObject = new LinkedHashMap(e);
      }
      e = ((Map)localObject);
      c = c.e();
    }
    
    public final Request a()
    {
      if (a != null) {
        return new Request(this);
      }
      throw new IllegalStateException("url == null");
    }
    
    public final void b(String paramString, RequestBody paramRequestBody)
    {
      if (paramString != null)
      {
        if (paramString.length() != 0)
        {
          if ((paramRequestBody != null) && (!HttpMethod.b(paramString))) {
            throw new IllegalArgumentException(g.e("method ", paramString, " must not have a request body."));
          }
          if (paramRequestBody == null)
          {
            int i;
            if ((!paramString.equals("POST")) && (!paramString.equals("PUT")) && (!paramString.equals("PATCH")) && (!paramString.equals("PROPPATCH")) && (!paramString.equals("REPORT"))) {
              i = 0;
            } else {
              i = 1;
            }
            if (i != 0) {
              throw new IllegalArgumentException(g.e("method ", paramString, " must have a request body."));
            }
          }
          b = paramString;
          d = paramRequestBody;
          return;
        }
        throw new IllegalArgumentException("method.length() == 0");
      }
      throw new NullPointerException("method == null");
    }
    
    public final void c(String paramString)
    {
      c.c(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */