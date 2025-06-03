package okhttp3.internal.http1;

import a0.j;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpHeaders;
import xc.f;
import xc.h;

class Http1Codec$ChunkedSource
  extends Http1Codec.AbstractSource
{
  public final HttpUrl e;
  public long f = -1L;
  public boolean o = true;
  
  public Http1Codec$ChunkedSource(Http1Codec paramHttp1Codec, HttpUrl paramHttpUrl)
  {
    super(paramHttp1Codec);
    e = paramHttpUrl;
  }
  
  public final void close()
  {
    if (b) {
      return;
    }
    if (o)
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      boolean bool;
      try
      {
        bool = Util.s(this, 100, localTimeUnit);
      }
      catch (IOException localIOException)
      {
        bool = false;
      }
      if (!bool) {
        f(null, false);
      }
    }
    b = true;
  }
  
  public final long e0(f paramf, long paramLong)
  {
    if (paramLong >= 0L)
    {
      if (!b)
      {
        if (!o) {
          return -1L;
        }
        long l = f;
        if ((l == 0L) || (l == -1L)) {
          if (l != -1L) {
            p.c.f0();
          }
        }
        try
        {
          f = p.c.x0();
          Object localObject1 = p.c.f0().trim();
          if (f >= 0L) {
            if (!((String)localObject1).isEmpty())
            {
              boolean bool = ((String)localObject1).startsWith(";");
              if (!bool) {}
            }
            else
            {
              if (f == 0L)
              {
                o = false;
                Http1Codec localHttp1Codec = p;
                localObject2 = a.q;
                localObject1 = e;
                Headers.Builder localBuilder = new Headers.Builder();
                for (;;)
                {
                  String str = c.E(f);
                  f -= str.length();
                  if (str.length() == 0) {
                    break;
                  }
                  Internal.a.a(localBuilder, str);
                }
                HttpHeaders.d((CookieJar)localObject2, (HttpUrl)localObject1, new Headers(localBuilder));
                f(null, true);
              }
              if (!o) {
                return -1L;
              }
              paramLong = super.e0(paramf, Math.min(paramLong, f));
              if (paramLong != -1L)
              {
                f -= paramLong;
                return paramLong;
              }
              paramf = new ProtocolException("unexpected end of stream");
              f(paramf, false);
              throw paramf;
            }
          }
          paramf = new java/net/ProtocolException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("expected chunk size and optional extensions but was \"");
          ((StringBuilder)localObject2).append(f);
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append("\"");
          paramf.<init>(((StringBuilder)localObject2).toString());
          throw paramf;
        }
        catch (NumberFormatException paramf)
        {
          throw new ProtocolException(paramf.getMessage());
        }
      }
      throw new IllegalStateException("closed");
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.ChunkedSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */