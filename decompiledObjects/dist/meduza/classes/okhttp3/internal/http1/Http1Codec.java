package okhttp3.internal.http1;

import a0.j;
import ec.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import xc.g;
import xc.h;
import xc.l;
import xc.s;
import xc.w;
import xc.y;
import xc.z;
import xc.z.a;

public final class Http1Codec
  implements HttpCodec
{
  public final OkHttpClient a;
  public final StreamAllocation b;
  public final h c;
  public final g d;
  public int e = 0;
  public long f = 262144L;
  
  public Http1Codec(OkHttpClient paramOkHttpClient, StreamAllocation paramStreamAllocation, h paramh, g paramg)
  {
    a = paramOkHttpClient;
    b = paramStreamAllocation;
    c = paramh;
    d = paramg;
  }
  
  public static void g(l paraml)
  {
    z localz = e;
    z.a locala = z.d;
    i.e(locala, "delegate");
    e = locala;
    localz.a();
    localz.b();
  }
  
  public final void a()
  {
    d.flush();
  }
  
  public final void b(Request paramRequest)
  {
    Object localObject = b.b().c.b.type();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b);
    localStringBuilder.append(' ');
    int i;
    if ((!a.a.equals("https")) && (localObject == Proxy.Type.HTTP)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localStringBuilder.append(a);
    } else {
      localStringBuilder.append(RequestLine.a(a));
    }
    localStringBuilder.append(" HTTP/1.1");
    localObject = localStringBuilder.toString();
    i(c, (String)localObject);
  }
  
  public final RealResponseBody c(Response paramResponse)
  {
    b.f.getClass();
    String str = paramResponse.g("Content-Type");
    if (!HttpHeaders.b(paramResponse)) {
      return new RealResponseBody(str, 0L, new s(h(0L)));
    }
    if ("chunked".equalsIgnoreCase(paramResponse.g("Transfer-Encoding")))
    {
      paramResponse = a.a;
      if (e == 4)
      {
        e = 5;
        return new RealResponseBody(str, -1L, new s(new ChunkedSource(paramResponse)));
      }
      paramResponse = f.l("state: ");
      paramResponse.append(e);
      throw new IllegalStateException(paramResponse.toString());
    }
    long l = HttpHeaders.a(paramResponse);
    if (l != -1L) {
      return new RealResponseBody(str, l, new s(h(l)));
    }
    if (e == 4)
    {
      paramResponse = b;
      if (paramResponse != null)
      {
        e = 5;
        paramResponse.f();
        return new RealResponseBody(str, -1L, new s(new UnknownLengthSource()));
      }
      throw new IllegalStateException("streamAllocation == null");
    }
    paramResponse = f.l("state: ");
    paramResponse.append(e);
    throw new IllegalStateException(paramResponse.toString());
  }
  
  public final void cancel()
  {
    RealConnection localRealConnection = b.b();
    if (localRealConnection != null) {
      Util.f(d);
    }
  }
  
  public final Response.Builder d(boolean paramBoolean)
  {
    int i = e;
    Object localObject1;
    if ((i != 1) && (i != 3))
    {
      localObject1 = f.l("state: ");
      ((StringBuilder)localObject1).append(e);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    try
    {
      localObject1 = c.E(f);
      f -= ((String)localObject1).length();
      localObject1 = StatusLine.a((String)localObject1);
      localObject2 = new okhttp3/Response$Builder;
      ((Response.Builder)localObject2).<init>();
      b = a;
      c = b;
      d = c;
      Headers.Builder localBuilder = new okhttp3/Headers$Builder;
      localBuilder.<init>();
      for (;;)
      {
        localObject3 = c.E(f);
        f -= ((String)localObject3).length();
        if (((String)localObject3).length() == 0) {
          break;
        }
        Internal.a.a(localBuilder, (String)localObject3);
      }
      Object localObject3 = new okhttp3/Headers;
      ((Headers)localObject3).<init>(localBuilder);
      f = ((Headers)localObject3).e();
      if ((paramBoolean) && (b == 100)) {
        return null;
      }
      if (b == 100)
      {
        e = 3;
        return (Response.Builder)localObject2;
      }
      e = 4;
      return (Response.Builder)localObject2;
    }
    catch (EOFException localEOFException)
    {
      Object localObject2 = f.l("unexpected end of stream on ");
      ((StringBuilder)localObject2).append(b);
      localObject2 = new IOException(((StringBuilder)localObject2).toString());
      ((Throwable)localObject2).initCause(localEOFException);
      throw ((Throwable)localObject2);
    }
  }
  
  public final void e()
  {
    d.flush();
  }
  
  public final w f(Request paramRequest, long paramLong)
  {
    if ("chunked".equalsIgnoreCase(paramRequest.a("Transfer-Encoding")))
    {
      if (e == 1)
      {
        e = 2;
        return new ChunkedSink();
      }
      paramRequest = f.l("state: ");
      paramRequest.append(e);
      throw new IllegalStateException(paramRequest.toString());
    }
    if (paramLong != -1L)
    {
      if (e == 1)
      {
        e = 2;
        return new FixedLengthSink(paramLong);
      }
      paramRequest = f.l("state: ");
      paramRequest.append(e);
      throw new IllegalStateException(paramRequest.toString());
    }
    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
  }
  
  public final y h(long paramLong)
  {
    if (e == 4)
    {
      e = 5;
      return new FixedLengthSource(paramLong);
    }
    StringBuilder localStringBuilder = f.l("state: ");
    localStringBuilder.append(e);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final void i(Headers paramHeaders, String paramString)
  {
    if (e == 0)
    {
      d.O(paramString).O("\r\n");
      int i = 0;
      int j = a.length / 2;
      while (i < j)
      {
        d.O(paramHeaders.d(i)).O(": ").O(paramHeaders.f(i)).O("\r\n");
        i++;
      }
      d.O("\r\n");
      e = 1;
      return;
    }
    paramHeaders = f.l("state: ");
    paramHeaders.append(e);
    throw new IllegalStateException(paramHeaders.toString());
  }
  
  public abstract class AbstractSource
    implements y
  {
    public final l a = new l(c.c());
    public boolean b;
    public long c = 0L;
    
    public AbstractSource() {}
    
    public final z c()
    {
      return a;
    }
    
    public long e0(xc.f paramf, long paramLong)
    {
      try
      {
        paramLong = c.e0(paramf, paramLong);
        if (paramLong > 0L) {
          c += paramLong;
        }
        return paramLong;
      }
      catch (IOException paramf)
      {
        f(paramf, false);
        throw paramf;
      }
    }
    
    public final void f(IOException paramIOException, boolean paramBoolean)
    {
      int i = e;
      if (i == 6) {
        return;
      }
      if (i == 5)
      {
        Http1Codec.g(a);
        Http1Codec localHttp1Codec = Http1Codec.this;
        e = 6;
        StreamAllocation localStreamAllocation = b;
        if (localStreamAllocation != null) {
          localStreamAllocation.i(paramBoolean ^ true, localHttp1Codec, paramIOException);
        }
        return;
      }
      paramIOException = f.l("state: ");
      paramIOException.append(e);
      throw new IllegalStateException(paramIOException.toString());
    }
  }
  
  public final class ChunkedSink
    implements w
  {
    public final l a = new l(d.c());
    public boolean b;
    
    public ChunkedSink() {}
    
    public final z c()
    {
      return a;
    }
    
    public final void close()
    {
      try
      {
        boolean bool = b;
        if (bool) {
          return;
        }
        b = true;
        d.O("0\r\n\r\n");
        Http1Codec localHttp1Codec = Http1Codec.this;
        l locall = a;
        localHttp1Codec.getClass();
        Http1Codec.g(locall);
        e = 3;
        return;
      }
      finally {}
    }
    
    public final void flush()
    {
      try
      {
        boolean bool = b;
        if (bool) {
          return;
        }
        d.flush();
        return;
      }
      finally {}
    }
    
    public final void g0(xc.f paramf, long paramLong)
    {
      if (!b)
      {
        if (paramLong == 0L) {
          return;
        }
        d.Y(paramLong);
        d.O("\r\n");
        d.g0(paramf, paramLong);
        d.O("\r\n");
        return;
      }
      throw new IllegalStateException("closed");
    }
  }
  
  public class ChunkedSource
    extends Http1Codec.AbstractSource
  {
    public final HttpUrl e;
    public long f = -1L;
    public boolean o = true;
    
    public ChunkedSource(HttpUrl paramHttpUrl)
    {
      super();
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
    
    public final long e0(xc.f paramf, long paramLong)
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
              c.f0();
            }
          }
          try
          {
            f = c.x0();
            Object localObject1 = c.f0().trim();
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
                  Http1Codec localHttp1Codec = Http1Codec.this;
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
  
  public final class FixedLengthSink
    implements w
  {
    public final l a = new l(d.c());
    public boolean b;
    public long c;
    
    public FixedLengthSink(long paramLong)
    {
      c = paramLong;
    }
    
    public final z c()
    {
      return a;
    }
    
    public final void close()
    {
      if (b) {
        return;
      }
      b = true;
      if (c <= 0L)
      {
        Http1Codec localHttp1Codec = Http1Codec.this;
        l locall = a;
        localHttp1Codec.getClass();
        Http1Codec.g(locall);
        e = 3;
        return;
      }
      throw new ProtocolException("unexpected end of stream");
    }
    
    public final void flush()
    {
      if (b) {
        return;
      }
      d.flush();
    }
    
    public final void g0(xc.f paramf, long paramLong)
    {
      if (!b)
      {
        long l = b;
        byte[] arrayOfByte = Util.a;
        if (((paramLong | 0L) >= 0L) && (0L <= l) && (l - 0L >= paramLong))
        {
          if (paramLong <= c)
          {
            d.g0(paramf, paramLong);
            c -= paramLong;
            return;
          }
          paramf = f.l("expected ");
          paramf.append(c);
          paramf.append(" bytes but received ");
          paramf.append(paramLong);
          throw new ProtocolException(paramf.toString());
        }
        throw new ArrayIndexOutOfBoundsException();
      }
      throw new IllegalStateException("closed");
    }
  }
  
  public class FixedLengthSource
    extends Http1Codec.AbstractSource
  {
    public long e;
    
    public FixedLengthSource(long paramLong)
    {
      super();
      e = paramLong;
      if (paramLong == 0L) {
        f(null, true);
      }
    }
    
    public final void close()
    {
      if (b) {
        return;
      }
      if (e != 0L)
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
    
    public final long e0(xc.f paramf, long paramLong)
    {
      if (paramLong >= 0L)
      {
        if (!b)
        {
          long l = e;
          if (l == 0L) {
            return -1L;
          }
          paramLong = super.e0(paramf, Math.min(l, paramLong));
          if (paramLong != -1L)
          {
            l = e - paramLong;
            e = l;
            if (l == 0L) {
              f(null, true);
            }
            return paramLong;
          }
          paramf = new ProtocolException("unexpected end of stream");
          f(paramf, false);
          throw paramf;
        }
        throw new IllegalStateException("closed");
      }
      throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
    }
  }
  
  public class UnknownLengthSource
    extends Http1Codec.AbstractSource
  {
    public boolean e;
    
    public UnknownLengthSource()
    {
      super();
    }
    
    public final void close()
    {
      if (b) {
        return;
      }
      if (!e) {
        f(null, false);
      }
      b = true;
    }
    
    public final long e0(xc.f paramf, long paramLong)
    {
      if (paramLong >= 0L)
      {
        if (!b)
        {
          if (e) {
            return -1L;
          }
          paramLong = super.e0(paramf, paramLong);
          if (paramLong == -1L)
          {
            e = true;
            f(null, true);
            return -1L;
          }
          return paramLong;
        }
        throw new IllegalStateException("closed");
      }
      throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */