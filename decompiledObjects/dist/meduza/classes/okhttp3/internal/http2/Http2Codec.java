package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import xc.c;
import xc.f;
import xc.g;
import xc.i;
import xc.i.a;
import xc.k;
import xc.s;
import xc.w;
import xc.y;
import xc.z;

public final class Http2Codec
  implements HttpCodec
{
  public static final List<String> f = Util.o(new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority" });
  public static final List<String> g = Util.o(new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade" });
  public final Interceptor.Chain a;
  public final StreamAllocation b;
  public final Http2Connection c;
  public Http2Stream d;
  public final Protocol e;
  
  public Http2Codec(OkHttpClient paramOkHttpClient, RealInterceptorChain paramRealInterceptorChain, StreamAllocation paramStreamAllocation, Http2Connection paramHttp2Connection)
  {
    a = paramRealInterceptorChain;
    b = paramStreamAllocation;
    c = paramHttp2Connection;
    paramRealInterceptorChain = c;
    paramOkHttpClient = Protocol.f;
    if (!paramRealInterceptorChain.contains(paramOkHttpClient)) {
      paramOkHttpClient = Protocol.e;
    }
    e = paramOkHttpClient;
  }
  
  public final void a()
  {
    synchronized (d)
    {
      if ((!f) && (!???.e()))
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("reply before requesting the sink");
        throw localIllegalStateException;
      }
      h.close();
      return;
    }
  }
  
  public final void b(Request arg1)
  {
    if (d != null) {
      return;
    }
    Object localObject1 = d;
    int i = 0;
    int j;
    if (localObject1 != null) {
      j = 1;
    } else {
      j = 0;
    }
    Object localObject7 = c;
    localObject1 = new ArrayList(a.length / 2 + 4);
    ((ArrayList)localObject1).add(new Header(Header.f, b));
    ((ArrayList)localObject1).add(new Header(Header.g, RequestLine.a(a)));
    Object localObject8 = ???.a("Host");
    if (localObject8 != null) {
      ((ArrayList)localObject1).add(new Header(Header.i, (String)localObject8));
    }
    ((ArrayList)localObject1).add(new Header(Header.h, a.a));
    int k = a.length / 2;
    for (int m = 0; m < k; m++)
    {
      ??? = i.a.a(((Headers)localObject7).d(m).toLowerCase(Locale.US));
      if (!f.contains(???.t())) {
        ((ArrayList)localObject1).add(new Header(???, ((Headers)localObject7).f(m)));
      }
    }
    localObject7 = c;
    boolean bool = j ^ 0x1;
    synchronized (C)
    {
      try
      {
        if (f > 1073741823) {
          ((Http2Connection)localObject7).M(ErrorCode.f);
        }
        if (!o)
        {
          m = f;
          f = (m + 2);
          Http2Stream localHttp2Stream = new okhttp3/internal/http2/Http2Stream;
          localHttp2Stream.<init>(m, (Http2Connection)localObject7, bool, false, null);
          if ((j != 0) && (y != 0L))
          {
            j = i;
            if (b != 0L) {}
          }
          else
          {
            j = 1;
          }
          if (localHttp2Stream.f()) {
            c.put(Integer.valueOf(m), localHttp2Stream);
          }
          localObject8 = C;
          label527:
          try
          {
            if (!e)
            {
              ((Http2Writer)localObject8).H(m, (ArrayList)localObject1, bool);
              if (j != 0) {
                synchronized (C)
                {
                  if (!e)
                  {
                    a.flush();
                  }
                  else
                  {
                    localObject1 = new java/io/IOException;
                    ((IOException)localObject1).<init>("closed");
                    throw ((Throwable)localObject1);
                  }
                }
              }
              d = localHttp2Stream;
              Http2Stream.StreamTimeout localStreamTimeout = i;
              long l = a.a();
              ??? = TimeUnit.MILLISECONDS;
              localStreamTimeout.g(l, ???);
              d.j.g(a.b(), ???);
              return;
            }
          }
          finally
          {
            break label527;
            localObject4 = new java/io/IOException;
            ((IOException)localObject4).<init>("closed");
            throw ((Throwable)localObject4);
          }
        }
        Object localObject4 = new okhttp3/internal/http2/ConnectionShutdownException;
        ((ConnectionShutdownException)localObject4).<init>();
        throw ((Throwable)localObject4);
      }
      finally {}
    }
  }
  
  public final RealResponseBody c(Response paramResponse)
  {
    b.f.getClass();
    return new RealResponseBody(paramResponse.g("Content-Type"), HttpHeaders.a(paramResponse), new s(new StreamFinishingSource(d.g)));
  }
  
  public final void cancel()
  {
    Http2Stream localHttp2Stream = d;
    if (localHttp2Stream != null)
    {
      ErrorCode localErrorCode = ErrorCode.o;
      if (localHttp2Stream.d(localErrorCode)) {
        d.h0(c, localErrorCode);
      }
    }
  }
  
  public final Response.Builder d(boolean paramBoolean)
  {
    synchronized (d)
    {
      i.h();
      try
      {
        while ((e.isEmpty()) && (k == null)) {
          ((Http2Stream)???).g();
        }
        i.l();
        if (!e.isEmpty())
        {
          Headers localHeaders = (Headers)e.removeFirst();
          Protocol localProtocol = e;
          Headers.Builder localBuilder = new Headers.Builder();
          int i = a.length / 2;
          int j = 0;
          for (??? = null; j < i; ??? = localObject2)
          {
            String str1 = localHeaders.d(j);
            String str2 = localHeaders.f(j);
            if (str1.equals(":status"))
            {
              ??? = new StringBuilder();
              ((StringBuilder)???).append("HTTP/1.1 ");
              ((StringBuilder)???).append(str2);
              localObject2 = StatusLine.a(((StringBuilder)???).toString());
            }
            else
            {
              localObject2 = ???;
              if (!g.contains(str1))
              {
                Internal.a.b(localBuilder, str1, str2);
                localObject2 = ???;
              }
            }
            j++;
          }
          if (??? != null)
          {
            localObject2 = new Response.Builder();
            b = localProtocol;
            c = b;
            d = c;
            f = new Headers(localBuilder).e();
            if ((paramBoolean) && (Internal.a.d((Response.Builder)localObject2) == 100)) {
              return null;
            }
            return (Response.Builder)localObject2;
          }
          throw new ProtocolException("Expected ':status' header not present");
        }
        Object localObject2 = new okhttp3/internal/http2/StreamResetException;
        ((StreamResetException)localObject2).<init>(k);
        throw ((Throwable)localObject2);
      }
      finally
      {
        i.l();
      }
    }
  }
  
  public final void e()
  {
    c.flush();
  }
  
  public final w f(Request arg1, long paramLong)
  {
    synchronized (d)
    {
      if ((!f) && (!???.e()))
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("reply before requesting the sink");
        throw localIllegalStateException;
      }
      return h;
    }
  }
  
  public class StreamFinishingSource
    extends k
  {
    public boolean b = false;
    public long c = 0L;
    
    public StreamFinishingSource(y paramy)
    {
      super();
    }
    
    public final void close()
    {
      super.close();
      if (!b)
      {
        b = true;
        Http2Codec localHttp2Codec = Http2Codec.this;
        b.i(false, localHttp2Codec, null);
      }
    }
    
    public final long e0(f paramf, long paramLong)
    {
      try
      {
        paramLong = a.e0(paramf, paramLong);
        if (paramLong > 0L) {
          c += paramLong;
        }
        return paramLong;
      }
      catch (IOException localIOException)
      {
        if (!b)
        {
          b = true;
          paramf = Http2Codec.this;
          b.i(false, paramf, localIOException);
        }
        throw localIOException;
      }
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Codec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */