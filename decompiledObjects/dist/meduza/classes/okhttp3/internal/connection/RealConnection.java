package okhttp3.internal.connection;

import g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Connection.Builder;
import okhttp3.internal.http2.Http2Connection.Listener;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import p2.m0;
import xc.h;
import xc.r;
import xc.s;
import xc.w;
import xc.y;
import xc.z;

public final class RealConnection
  extends Http2Connection.Listener
  implements Connection
{
  public final ConnectionPool b;
  public final Route c;
  public Socket d;
  public Socket e;
  public Handshake f;
  public Protocol g;
  public Http2Connection h;
  public s i;
  public r j;
  public boolean k;
  public int l;
  public int m = 1;
  public final ArrayList n = new ArrayList();
  public long o = Long.MAX_VALUE;
  
  public RealConnection(ConnectionPool paramConnectionPool, Route paramRoute)
  {
    b = paramConnectionPool;
    c = paramRoute;
  }
  
  /* Error */
  public final void a(Http2Connection paramHttp2Connection)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	okhttp3/internal/connection/RealConnection:b	Lokhttp3/ConnectionPool;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_1
    //   10: getfield 61	okhttp3/internal/http2/Http2Connection:A	Lokhttp3/internal/http2/Settings;
    //   13: astore_3
    //   14: ldc 62
    //   16: istore 4
    //   18: aload_3
    //   19: getfield 66	okhttp3/internal/http2/Settings:a	I
    //   22: bipush 16
    //   24: iand
    //   25: ifeq +11 -> 36
    //   28: aload_3
    //   29: getfield 69	okhttp3/internal/http2/Settings:b	[I
    //   32: iconst_4
    //   33: iaload
    //   34: istore 4
    //   36: aload_1
    //   37: monitorexit
    //   38: aload_0
    //   39: iload 4
    //   41: putfield 39	okhttp3/internal/connection/RealConnection:m	I
    //   44: aload_2
    //   45: monitorexit
    //   46: return
    //   47: astore_1
    //   48: goto +8 -> 56
    //   51: astore_3
    //   52: aload_1
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    //   56: aload_2
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	RealConnection
    //   0	60	1	paramHttp2Connection	Http2Connection
    //   4	53	2	localConnectionPool	ConnectionPool
    //   13	16	3	localSettings	Settings
    //   51	4	3	localObject	Object
    //   16	24	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   7	9	47	finally
    //   36	46	47	finally
    //   52	56	47	finally
    //   56	58	47	finally
    //   9	14	51	finally
    //   18	36	51	finally
  }
  
  public final void b(Http2Stream paramHttp2Stream)
  {
    paramHttp2Stream.c(ErrorCode.f);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, EventListener arg6)
  {
    Object localObject1;
    Object localObject4;
    if (g == null)
    {
      localObject1 = c.a;
      ??? = f;
      localObject4 = new ConnectionSpecSelector((List)???);
      if (i == null)
      {
        if (((List)???).contains(ConnectionSpec.f))
        {
          ??? = c.a.a.d;
          if (!Platform.a.k((String)???)) {
            throw new RouteException(new UnknownServiceException(g.e("CLEARTEXT communication to ", (String)???, " not permitted by network security policy")));
          }
        }
        else
        {
          throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
        }
      }
      else {
        if (e.contains(Protocol.f)) {
          break label659;
        }
      }
      ??? = null;
    }
    for (;;)
    {
      int i1 = 1;
      int i2 = 1;
      int i3;
      label247:
      Object localObject6;
      RouteException localRouteException;
      Method localMethod;
      try
      {
        localObject1 = c;
        if ((a.i != null) && (b.type() == Proxy.Type.HTTP)) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if (i3 != 0)
        {
          e(paramInt1, paramInt2, paramInt3, ???);
          if (d == null) {
            break label247;
          }
        }
        else
        {
          d(paramInt1, paramInt2, ???);
        }
        f((ConnectionSpecSelector)localObject4, paramInt4, ???);
        localObject1 = c.c;
        ???.getClass();
        ??? = c;
        if ((a.i != null) && (b.type() == Proxy.Type.HTTP)) {
          paramInt1 = i2;
        } else {
          paramInt1 = 0;
        }
        if ((paramInt1 != 0) && (d == null)) {
          throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (h != null) {
          synchronized (b)
          {
            synchronized (h)
            {
              localObject4 = A;
              paramInt1 = Integer.MAX_VALUE;
              if ((a & 0x10) != 0) {
                paramInt1 = b[4];
              }
              m = paramInt1;
            }
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        Util.f(e);
        Util.f(d);
        e = null;
        d = null;
        i = null;
        j = null;
        f = null;
        g = null;
        h = null;
        localObject6 = c.c;
        ???.getClass();
        if (localObject3 == null)
        {
          localRouteException = new RouteException(localIOException);
        }
        else
        {
          localObject6 = a;
          localMethod = Util.p;
          if (localMethod == null) {}
        }
      }
      try
      {
        localMethod.invoke(localObject6, new Object[] { localIOException });
        b = localIOException;
        if (paramBoolean)
        {
          d = true;
          if ((c) && (!(localIOException instanceof ProtocolException)) && (!(localIOException instanceof InterruptedIOException)))
          {
            boolean bool = localIOException instanceof SSLHandshakeException;
            if (((!bool) || (!(localIOException.getCause() instanceof CertificateException))) && (!(localIOException instanceof SSLPeerUnverifiedException)))
            {
              i3 = i1;
              if (bool) {
                break label648;
              }
              i3 = i1;
              if ((localIOException instanceof SSLProtocolException)) {
                break label648;
              }
              if ((localIOException instanceof SSLException))
              {
                i3 = i1;
                break label648;
              }
            }
          }
          i3 = 0;
          label648:
          if (i3 != 0) {
            continue;
          }
        }
        throw localRouteException;
        label659:
        throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        throw new IllegalStateException("already connected");
      }
      catch (InvocationTargetException|IllegalAccessException localInvocationTargetException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void d(int paramInt1, int paramInt2, EventListener paramEventListener)
  {
    Object localObject1 = c;
    localObject2 = b;
    localObject1 = a;
    if ((((Proxy)localObject2).type() != Proxy.Type.DIRECT) && (((Proxy)localObject2).type() != Proxy.Type.HTTP)) {
      localObject2 = new Socket((Proxy)localObject2);
    } else {
      localObject2 = c.createSocket();
    }
    d = ((Socket)localObject2);
    localObject2 = c.c;
    paramEventListener.getClass();
    d.setSoTimeout(paramInt2);
    try
    {
      Platform.a.g(d, c.c, paramInt1);
      try
      {
        localObject2 = m0.b0(d);
        paramEventListener = new xc/s;
        paramEventListener.<init>((y)localObject2);
        i = paramEventListener;
        localObject2 = m0.a0(d);
        paramEventListener = new xc/r;
        paramEventListener.<init>((w)localObject2);
        j = paramEventListener;
      }
      catch (NullPointerException paramEventListener)
      {
        if ("throw with null exception".equals(paramEventListener.getMessage())) {
          break label181;
        }
      }
      return;
    }
    catch (ConnectException paramEventListener)
    {
      label181:
      localObject2 = f.l("Failed to connect to ");
      ((StringBuilder)localObject2).append(c.c);
      localObject2 = new ConnectException(((StringBuilder)localObject2).toString());
      ((Throwable)localObject2).initCause(paramEventListener);
      throw ((Throwable)localObject2);
    }
    throw new IOException(paramEventListener);
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, EventListener paramEventListener)
  {
    Object localObject1 = new Request.Builder();
    Object localObject2 = c.a.a;
    if (localObject2 != null)
    {
      a = ((HttpUrl)localObject2);
      ((Request.Builder)localObject1).b("CONNECT", null);
      localObject2 = Util.m(c.a.a, true);
      c.d("Host", (String)localObject2);
      c.d("Proxy-Connection", "Keep-Alive");
      c.d("User-Agent", "okhttp/3.12.13");
      localObject1 = ((Request.Builder)localObject1).a();
      localObject2 = new Response.Builder();
      a = ((Request)localObject1);
      b = Protocol.c;
      c = 407;
      d = "Preemptive Authenticate";
      g = Util.c;
      k = -1L;
      l = -1L;
      f.d("Proxy-Authenticate", "OkHttp-Preemptive");
      ((Response.Builder)localObject2).a();
      c.a.d.a();
      localObject2 = a;
      d(paramInt1, paramInt2, paramEventListener);
      paramEventListener = new StringBuilder();
      paramEventListener.append("CONNECT ");
      paramEventListener.append(Util.m((HttpUrl)localObject2, true));
      paramEventListener.append(" HTTP/1.1");
      Object localObject3 = paramEventListener.toString();
      localObject2 = i;
      paramEventListener = new Http1Codec(null, null, (h)localObject2, j);
      z localz = ((s)localObject2).c();
      long l1 = paramInt2;
      localObject2 = TimeUnit.MILLISECONDS;
      localz.g(l1, (TimeUnit)localObject2);
      j.c().g(paramInt3, (TimeUnit)localObject2);
      paramEventListener.i(c, (String)localObject3);
      paramEventListener.a();
      localObject3 = paramEventListener.d(false);
      a = ((Request)localObject1);
      localObject1 = ((Response.Builder)localObject3).a();
      long l2 = HttpHeaders.a((Response)localObject1);
      l1 = l2;
      if (l2 == -1L) {
        l1 = 0L;
      }
      paramEventListener = paramEventListener.h(l1);
      Util.s(paramEventListener, Integer.MAX_VALUE, (TimeUnit)localObject2);
      paramEventListener.close();
      paramInt1 = c;
      if (paramInt1 != 200)
      {
        if (paramInt1 == 407)
        {
          c.a.d.a();
          throw new IOException("Failed to authenticate with proxy");
        }
        paramEventListener = f.l("Unexpected response code for CONNECT: ");
        paramEventListener.append(c);
        throw new IOException(paramEventListener.toString());
      }
      if ((i.b.v()) && (j.b.v())) {
        return;
      }
      throw new IOException("TLS tunnel buffered too many bytes!");
    }
    throw new NullPointerException("url == null");
  }
  
  /* Error */
  public final void f(ConnectionSpecSelector paramConnectionSpecSelector, int paramInt, EventListener paramEventListener)
  {
    // Byte code:
    //   0: getstatic 382	okhttp3/Protocol:c	Lokhttp3/Protocol;
    //   3: astore 4
    //   5: aload_0
    //   6: getfield 52	okhttp3/internal/connection/RealConnection:c	Lokhttp3/Route;
    //   9: getfield 94	okhttp3/Route:a	Lokhttp3/Address;
    //   12: astore 5
    //   14: aload 5
    //   16: getfield 107	okhttp3/Address:i	Ljavax/net/ssl/SSLSocketFactory;
    //   19: ifnonnull +57 -> 76
    //   22: aload 5
    //   24: getfield 156	okhttp3/Address:e	Ljava/util/List;
    //   27: astore_1
    //   28: getstatic 160	okhttp3/Protocol:f	Lokhttp3/Protocol;
    //   31: astore_3
    //   32: aload_1
    //   33: aload_3
    //   34: invokeinterface 118 2 0
    //   39: ifeq +22 -> 61
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 180	okhttp3/internal/connection/RealConnection:d	Ljava/net/Socket;
    //   47: putfield 204	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   50: aload_0
    //   51: aload_3
    //   52: putfield 89	okhttp3/internal/connection/RealConnection:g	Lokhttp3/Protocol;
    //   55: aload_0
    //   56: iload_2
    //   57: invokevirtual 503	okhttp3/internal/connection/RealConnection:i	(I)V
    //   60: return
    //   61: aload_0
    //   62: aload_0
    //   63: getfield 180	okhttp3/internal/connection/RealConnection:d	Ljava/net/Socket;
    //   66: putfield 204	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   69: aload_0
    //   70: aload 4
    //   72: putfield 89	okhttp3/internal/connection/RealConnection:g	Lokhttp3/Protocol;
    //   75: return
    //   76: aload_3
    //   77: invokevirtual 195	java/lang/Object:getClass	()Ljava/lang/Class;
    //   80: pop
    //   81: aload_0
    //   82: getfield 52	okhttp3/internal/connection/RealConnection:c	Lokhttp3/Route;
    //   85: getfield 94	okhttp3/Route:a	Lokhttp3/Address;
    //   88: astore 6
    //   90: aload 6
    //   92: getfield 107	okhttp3/Address:i	Ljavax/net/ssl/SSLSocketFactory;
    //   95: astore 7
    //   97: aconst_null
    //   98: astore 5
    //   100: aconst_null
    //   101: astore 8
    //   103: aconst_null
    //   104: astore 9
    //   106: aload 5
    //   108: astore_3
    //   109: aload_0
    //   110: getfield 180	okhttp3/internal/connection/RealConnection:d	Ljava/net/Socket;
    //   113: astore 10
    //   115: aload 5
    //   117: astore_3
    //   118: aload 6
    //   120: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   123: astore 11
    //   125: aload 5
    //   127: astore_3
    //   128: aload 7
    //   130: aload 10
    //   132: aload 11
    //   134: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   137: aload 11
    //   139: getfield 505	okhttp3/HttpUrl:e	I
    //   142: iconst_1
    //   143: invokevirtual 510	javax/net/ssl/SSLSocketFactory:createSocket	(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    //   146: checkcast 512	javax/net/ssl/SSLSocket
    //   149: astore 5
    //   151: aload_1
    //   152: aload 5
    //   154: invokevirtual 515	okhttp3/internal/connection/ConnectionSpecSelector:a	(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;
    //   157: astore 8
    //   159: aload 8
    //   161: getfield 517	okhttp3/ConnectionSpec:b	Z
    //   164: ifeq +24 -> 188
    //   167: getstatic 131	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   170: aload 5
    //   172: aload 6
    //   174: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   177: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   180: aload 6
    //   182: getfield 156	okhttp3/Address:e	Ljava/util/List;
    //   185: invokevirtual 520	okhttp3/internal/platform/Platform:f	(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    //   188: aload 5
    //   190: invokevirtual 523	javax/net/ssl/SSLSocket:startHandshake	()V
    //   193: aload 5
    //   195: invokevirtual 527	javax/net/ssl/SSLSocket:getSession	()Ljavax/net/ssl/SSLSession;
    //   198: astore_1
    //   199: aload_1
    //   200: invokestatic 532	okhttp3/Handshake:a	(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;
    //   203: astore_3
    //   204: aload 6
    //   206: getfield 535	okhttp3/Address:j	Ljavax/net/ssl/HostnameVerifier;
    //   209: aload 6
    //   211: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   214: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   217: aload_1
    //   218: invokeinterface 541 3 0
    //   223: ifne +190 -> 413
    //   226: aload_3
    //   227: getfield 543	okhttp3/Handshake:c	Ljava/util/List;
    //   230: astore_1
    //   231: aload_1
    //   232: invokeinterface 546 1 0
    //   237: istore 12
    //   239: iload 12
    //   241: ifne +121 -> 362
    //   244: aload_1
    //   245: iconst_0
    //   246: invokeinterface 550 2 0
    //   251: checkcast 552	java/security/cert/X509Certificate
    //   254: astore 4
    //   256: new 248	javax/net/ssl/SSLPeerUnverifiedException
    //   259: astore_1
    //   260: new 329	java/lang/StringBuilder
    //   263: astore_3
    //   264: aload_3
    //   265: invokespecial 420	java/lang/StringBuilder:<init>	()V
    //   268: aload_3
    //   269: ldc_w 554
    //   272: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload_3
    //   277: aload 6
    //   279: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   282: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   285: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload_3
    //   290: ldc_w 556
    //   293: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: aload_3
    //   298: aload 4
    //   300: invokestatic 561	okhttp3/CertificatePinner:b	(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    //   303: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload_3
    //   308: ldc_w 563
    //   311: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload_3
    //   316: aload 4
    //   318: invokevirtual 567	java/security/cert/X509Certificate:getSubjectDN	()Ljava/security/Principal;
    //   321: invokeinterface 572 1 0
    //   326: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: aload_3
    //   331: ldc_w 574
    //   334: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: aload_3
    //   339: aload 4
    //   341: invokestatic 579	okhttp3/internal/tls/OkHostnameVerifier:a	(Ljava/security/cert/X509Certificate;)Ljava/util/ArrayList;
    //   344: invokevirtual 333	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload_1
    //   349: aload_3
    //   350: invokevirtual 336	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokespecial 580	javax/net/ssl/SSLPeerUnverifiedException:<init>	(Ljava/lang/String;)V
    //   356: aload_1
    //   357: athrow
    //   358: astore_1
    //   359: goto +256 -> 615
    //   362: new 248	javax/net/ssl/SSLPeerUnverifiedException
    //   365: astore_3
    //   366: new 329	java/lang/StringBuilder
    //   369: astore_1
    //   370: aload_1
    //   371: invokespecial 420	java/lang/StringBuilder:<init>	()V
    //   374: aload_1
    //   375: ldc_w 554
    //   378: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload_1
    //   383: aload 6
    //   385: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   388: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   391: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: aload_1
    //   396: ldc_w 582
    //   399: invokevirtual 424	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: aload_3
    //   404: aload_1
    //   405: invokevirtual 336	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   408: invokespecial 580	javax/net/ssl/SSLPeerUnverifiedException:<init>	(Ljava/lang/String;)V
    //   411: aload_3
    //   412: athrow
    //   413: aload 6
    //   415: getfield 585	okhttp3/Address:k	Lokhttp3/CertificatePinner;
    //   418: aload 6
    //   420: getfield 121	okhttp3/Address:a	Lokhttp3/HttpUrl;
    //   423: getfield 126	okhttp3/HttpUrl:d	Ljava/lang/String;
    //   426: aload_3
    //   427: getfield 543	okhttp3/Handshake:c	Ljava/util/List;
    //   430: invokevirtual 588	okhttp3/CertificatePinner:a	(Ljava/lang/String;Ljava/util/List;)V
    //   433: aload 9
    //   435: astore_1
    //   436: aload 8
    //   438: getfield 517	okhttp3/ConnectionSpec:b	Z
    //   441: ifeq +12 -> 453
    //   444: getstatic 131	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   447: aload 5
    //   449: invokevirtual 591	okhttp3/internal/platform/Platform:i	(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    //   452: astore_1
    //   453: aload_0
    //   454: aload 5
    //   456: putfield 204	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   459: aload 5
    //   461: invokestatic 293	p2/m0:b0	(Ljava/net/Socket;)Lxc/e;
    //   464: astore 8
    //   466: new 295	xc/s
    //   469: astore 9
    //   471: aload 9
    //   473: aload 8
    //   475: invokespecial 298	xc/s:<init>	(Lxc/y;)V
    //   478: aload_0
    //   479: aload 9
    //   481: putfield 211	okhttp3/internal/connection/RealConnection:i	Lxc/s;
    //   484: aload_0
    //   485: getfield 204	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   488: invokestatic 302	p2/m0:a0	(Ljava/net/Socket;)Lxc/d;
    //   491: astore 8
    //   493: new 304	xc/r
    //   496: astore 9
    //   498: aload 9
    //   500: aload 8
    //   502: invokespecial 307	xc/r:<init>	(Lxc/w;)V
    //   505: aload_0
    //   506: aload 9
    //   508: putfield 213	okhttp3/internal/connection/RealConnection:j	Lxc/r;
    //   511: aload_0
    //   512: aload_3
    //   513: putfield 215	okhttp3/internal/connection/RealConnection:f	Lokhttp3/Handshake;
    //   516: aload 4
    //   518: astore_3
    //   519: aload_1
    //   520: ifnull +8 -> 528
    //   523: aload_1
    //   524: invokestatic 594	okhttp3/Protocol:f	(Ljava/lang/String;)Lokhttp3/Protocol;
    //   527: astore_3
    //   528: aload_0
    //   529: aload_3
    //   530: putfield 89	okhttp3/internal/connection/RealConnection:g	Lokhttp3/Protocol;
    //   533: getstatic 131	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   536: aload 5
    //   538: invokevirtual 597	okhttp3/internal/platform/Platform:a	(Ljavax/net/ssl/SSLSocket;)V
    //   541: aload_0
    //   542: getfield 89	okhttp3/internal/connection/RealConnection:g	Lokhttp3/Protocol;
    //   545: getstatic 599	okhttp3/Protocol:e	Lokhttp3/Protocol;
    //   548: if_acmpne +8 -> 556
    //   551: aload_0
    //   552: iload_2
    //   553: invokevirtual 503	okhttp3/internal/connection/RealConnection:i	(I)V
    //   556: return
    //   557: astore_3
    //   558: aload 5
    //   560: astore_1
    //   561: aload_3
    //   562: astore 5
    //   564: goto +12 -> 576
    //   567: astore_1
    //   568: goto +44 -> 612
    //   571: astore 5
    //   573: aload 8
    //   575: astore_1
    //   576: aload_1
    //   577: astore_3
    //   578: aload 5
    //   580: invokestatic 603	okhttp3/internal/Util:q	(Ljava/lang/AssertionError;)Z
    //   583: ifeq +24 -> 607
    //   586: aload_1
    //   587: astore_3
    //   588: new 83	java/io/IOException
    //   591: astore 4
    //   593: aload_1
    //   594: astore_3
    //   595: aload 4
    //   597: aload 5
    //   599: invokespecial 321	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   602: aload_1
    //   603: astore_3
    //   604: aload 4
    //   606: athrow
    //   607: aload_1
    //   608: astore_3
    //   609: aload 5
    //   611: athrow
    //   612: aload_3
    //   613: astore 5
    //   615: aload 5
    //   617: ifnull +11 -> 628
    //   620: getstatic 131	okhttp3/internal/platform/Platform:a	Lokhttp3/internal/platform/Platform;
    //   623: aload 5
    //   625: invokevirtual 597	okhttp3/internal/platform/Platform:a	(Ljavax/net/ssl/SSLSocket;)V
    //   628: aload 5
    //   630: invokestatic 209	okhttp3/internal/Util:f	(Ljava/net/Socket;)V
    //   633: aload_1
    //   634: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	635	0	this	RealConnection
    //   0	635	1	paramConnectionSpecSelector	ConnectionSpecSelector
    //   0	635	2	paramInt	int
    //   0	635	3	paramEventListener	EventListener
    //   3	602	4	localObject1	Object
    //   12	551	5	localObject2	Object
    //   571	39	5	localAssertionError	AssertionError
    //   613	16	5	localEventListener	EventListener
    //   88	331	6	localAddress	Address
    //   95	34	7	localSSLSocketFactory	javax.net.ssl.SSLSocketFactory
    //   101	473	8	localObject3	Object
    //   104	403	9	localObject4	Object
    //   113	18	10	localSocket	Socket
    //   123	15	11	localHttpUrl	HttpUrl
    //   237	3	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   151	188	358	finally
    //   188	239	358	finally
    //   244	358	358	finally
    //   362	413	358	finally
    //   413	433	358	finally
    //   436	453	358	finally
    //   453	516	358	finally
    //   523	528	358	finally
    //   528	533	358	finally
    //   151	188	557	java/lang/AssertionError
    //   188	239	557	java/lang/AssertionError
    //   244	358	557	java/lang/AssertionError
    //   362	413	557	java/lang/AssertionError
    //   413	433	557	java/lang/AssertionError
    //   436	453	557	java/lang/AssertionError
    //   453	516	557	java/lang/AssertionError
    //   523	528	557	java/lang/AssertionError
    //   528	533	557	java/lang/AssertionError
    //   109	115	567	finally
    //   118	125	567	finally
    //   128	151	567	finally
    //   578	586	567	finally
    //   588	593	567	finally
    //   595	602	567	finally
    //   604	607	567	finally
    //   609	612	567	finally
    //   109	115	571	java/lang/AssertionError
    //   118	125	571	java/lang/AssertionError
    //   128	151	571	java/lang/AssertionError
  }
  
  public final boolean g(Address paramAddress, Route paramRoute)
  {
    if ((n.size() < m) && (!k))
    {
      if (!Internal.a.g(c.a, paramAddress)) {
        return false;
      }
      if (a.d.equals(c.a.a.d)) {
        return true;
      }
      if (h == null) {
        return false;
      }
      if (paramRoute == null) {
        return false;
      }
      if (b.type() != Proxy.Type.DIRECT) {
        return false;
      }
      if (c.b.type() != Proxy.Type.DIRECT) {
        return false;
      }
      if (!c.c.equals(c)) {
        return false;
      }
      if (a.j != OkHostnameVerifier.a) {
        return false;
      }
      if (!j(a)) {
        return false;
      }
    }
    try
    {
      k.a(a.d, f.c);
      return true;
    }
    catch (SSLPeerUnverifiedException paramAddress)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final HttpCodec h(OkHttpClient paramOkHttpClient, RealInterceptorChain paramRealInterceptorChain, StreamAllocation paramStreamAllocation)
  {
    if (h != null) {
      return new Http2Codec(paramOkHttpClient, paramRealInterceptorChain, paramStreamAllocation, h);
    }
    e.setSoTimeout(j);
    z localz = i.c();
    long l1 = j;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    localz.g(l1, localTimeUnit);
    j.c().g(k, localTimeUnit);
    return new Http1Codec(paramOkHttpClient, paramStreamAllocation, i, j);
  }
  
  public final void i(int paramInt)
  {
    e.setSoTimeout(0);
    Http2Connection.Builder localBuilder = new Http2Connection.Builder();
    Object localObject = e;
    String str = c.a.a.d;
    s locals = i;
    r localr = j;
    a = ((Socket)localObject);
    b = str;
    c = locals;
    d = localr;
    e = this;
    h = paramInt;
    localObject = new Http2Connection(localBuilder);
    h = ((Http2Connection)localObject);
    ((Http2Connection)localObject).Q();
  }
  
  public final boolean j(HttpUrl paramHttpUrl)
  {
    int i1 = e;
    Object localObject1 = c.a.a;
    int i2 = e;
    boolean bool1 = false;
    if (i1 != i2) {
      return false;
    }
    if (!d.equals(d))
    {
      Object localObject2 = f;
      boolean bool2 = bool1;
      if (localObject2 != null)
      {
        localObject1 = OkHostnameVerifier.a;
        paramHttpUrl = d;
        localObject2 = (X509Certificate)c.get(0);
        localObject1.getClass();
        bool2 = bool1;
        if (OkHostnameVerifier.c(paramHttpUrl, (X509Certificate)localObject2)) {
          bool2 = true;
        }
      }
      return bool2;
    }
    return true;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Connection{");
    localStringBuilder.append(c.a.a.d);
    localStringBuilder.append(":");
    localStringBuilder.append(c.a.a.e);
    localStringBuilder.append(", proxy=");
    localStringBuilder.append(c.b);
    localStringBuilder.append(" hostAddress=");
    localStringBuilder.append(c.c);
    localStringBuilder.append(" cipherSuite=");
    Object localObject = f;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = "none";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(" protocol=");
    localStringBuilder.append(g);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.RealConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */