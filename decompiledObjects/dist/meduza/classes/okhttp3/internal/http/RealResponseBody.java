package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import xc.h;
import xc.s;

public final class RealResponseBody
  extends ResponseBody
{
  public final String a;
  public final long b;
  public final h c;
  
  public RealResponseBody(String paramString, long paramLong, s params)
  {
    a = paramString;
    b = paramLong;
    c = params;
  }
  
  public final h H()
  {
    return c;
  }
  
  public final long f()
  {
    return b;
  }
  
  public final MediaType g()
  {
    String str = a;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (str != null) {}
    try
    {
      localObject2 = MediaType.a(str);
      return (MediaType)localObject2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Object localObject3 = localObject1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.RealResponseBody
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */