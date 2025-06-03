package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.connection.RouteSelector.Selection;
import okhttp3.internal.connection.StreamAllocation;

public final class RetryAndFollowUpInterceptor
  implements Interceptor
{
  public final OkHttpClient a;
  public volatile StreamAllocation b;
  public Object c;
  public volatile boolean d;
  
  public RetryAndFollowUpInterceptor(OkHttpClient paramOkHttpClient)
  {
    a = paramOkHttpClient;
  }
  
  public static int e(Response paramResponse, int paramInt)
  {
    paramResponse = paramResponse.g("Retry-After");
    if (paramResponse == null) {
      return paramInt;
    }
    if (paramResponse.matches("\\d+")) {
      return Integer.valueOf(paramResponse).intValue();
    }
    return Integer.MAX_VALUE;
  }
  
  public static boolean f(Response paramResponse, HttpUrl paramHttpUrl)
  {
    paramResponse = a.a;
    boolean bool;
    if ((d.equals(d)) && (e == e) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public final Response a(RealInterceptorChain paramRealInterceptorChain)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 84	okhttp3/internal/http/RealInterceptorChain:f	Lokhttp3/Request;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield 87	okhttp3/internal/http/RealInterceptorChain:g	Lokhttp3/Call;
    //   9: astore_3
    //   10: aload_1
    //   11: getfield 91	okhttp3/internal/http/RealInterceptorChain:h	Lokhttp3/EventListener;
    //   14: astore 4
    //   16: new 93	okhttp3/internal/connection/StreamAllocation
    //   19: dup
    //   20: aload_0
    //   21: getfield 21	okhttp3/internal/http/RetryAndFollowUpInterceptor:a	Lokhttp3/OkHttpClient;
    //   24: getfield 99	okhttp3/OkHttpClient:A	Lokhttp3/ConnectionPool;
    //   27: aload_0
    //   28: aload_2
    //   29: getfield 61	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   32: invokevirtual 102	okhttp3/internal/http/RetryAndFollowUpInterceptor:b	(Lokhttp3/HttpUrl;)Lokhttp3/Address;
    //   35: aload_3
    //   36: aload 4
    //   38: aload_0
    //   39: getfield 104	okhttp3/internal/http/RetryAndFollowUpInterceptor:c	Ljava/lang/Object;
    //   42: invokespecial 107	okhttp3/internal/connection/StreamAllocation:<init>	(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;Ljava/lang/Object;)V
    //   45: astore 5
    //   47: aload_0
    //   48: aload 5
    //   50: putfield 109	okhttp3/internal/http/RetryAndFollowUpInterceptor:b	Lokhttp3/internal/connection/StreamAllocation;
    //   53: iconst_0
    //   54: istore 6
    //   56: aconst_null
    //   57: astore 7
    //   59: aload_0
    //   60: getfield 111	okhttp3/internal/http/RetryAndFollowUpInterceptor:d	Z
    //   63: ifne +408 -> 471
    //   66: aload_1
    //   67: aload_2
    //   68: aload 5
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 114	okhttp3/internal/http/RealInterceptorChain:d	(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;
    //   75: astore 8
    //   77: aload 8
    //   79: astore_2
    //   80: aload 7
    //   82: ifnull +69 -> 151
    //   85: new 116	okhttp3/Response$Builder
    //   88: dup
    //   89: aload 8
    //   91: invokespecial 119	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   94: astore_2
    //   95: new 116	okhttp3/Response$Builder
    //   98: dup
    //   99: aload 7
    //   101: invokespecial 119	okhttp3/Response$Builder:<init>	(Lokhttp3/Response;)V
    //   104: astore 7
    //   106: aload 7
    //   108: aconst_null
    //   109: putfield 122	okhttp3/Response$Builder:g	Lokhttp3/ResponseBody;
    //   112: aload 7
    //   114: invokevirtual 125	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   117: astore 7
    //   119: aload 7
    //   121: getfield 128	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   124: ifnonnull +17 -> 141
    //   127: aload_2
    //   128: aload 7
    //   130: putfield 132	okhttp3/Response$Builder:j	Lokhttp3/Response;
    //   133: aload_2
    //   134: invokevirtual 125	okhttp3/Response$Builder:a	()Lokhttp3/Response;
    //   137: astore_2
    //   138: goto +13 -> 151
    //   141: new 134	java/lang/IllegalArgumentException
    //   144: dup
    //   145: ldc -120
    //   147: invokespecial 139	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   150: athrow
    //   151: aload_0
    //   152: aload_2
    //   153: aload 5
    //   155: getfield 142	okhttp3/internal/connection/StreamAllocation:c	Lokhttp3/Route;
    //   158: invokevirtual 145	okhttp3/internal/http/RetryAndFollowUpInterceptor:c	(Lokhttp3/Response;Lokhttp3/Route;)Lokhttp3/Request;
    //   161: astore 8
    //   163: aload 8
    //   165: ifnonnull +10 -> 175
    //   168: aload 5
    //   170: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   173: aload_2
    //   174: areturn
    //   175: aload_2
    //   176: getfield 128	okhttp3/Response:o	Lokhttp3/ResponseBody;
    //   179: invokestatic 152	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   182: iinc 6 1
    //   185: iload 6
    //   187: bipush 20
    //   189: if_icmpgt +171 -> 360
    //   192: aload 8
    //   194: getfield 155	okhttp3/Request:d	Lokhttp3/RequestBody;
    //   197: instanceof 157
    //   200: ifne +141 -> 341
    //   203: aload_2
    //   204: aload 8
    //   206: getfield 61	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   209: invokestatic 159	okhttp3/internal/http/RetryAndFollowUpInterceptor:f	(Lokhttp3/Response;Lokhttp3/HttpUrl;)Z
    //   212: ifne +49 -> 261
    //   215: aload 5
    //   217: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   220: new 93	okhttp3/internal/connection/StreamAllocation
    //   223: dup
    //   224: aload_0
    //   225: getfield 21	okhttp3/internal/http/RetryAndFollowUpInterceptor:a	Lokhttp3/OkHttpClient;
    //   228: getfield 99	okhttp3/OkHttpClient:A	Lokhttp3/ConnectionPool;
    //   231: aload_0
    //   232: aload 8
    //   234: getfield 61	okhttp3/Request:a	Lokhttp3/HttpUrl;
    //   237: invokevirtual 102	okhttp3/internal/http/RetryAndFollowUpInterceptor:b	(Lokhttp3/HttpUrl;)Lokhttp3/Address;
    //   240: aload_3
    //   241: aload 4
    //   243: aload_0
    //   244: getfield 104	okhttp3/internal/http/RetryAndFollowUpInterceptor:c	Ljava/lang/Object;
    //   247: invokespecial 107	okhttp3/internal/connection/StreamAllocation:<init>	(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;Ljava/lang/Object;)V
    //   250: astore 5
    //   252: aload_0
    //   253: aload 5
    //   255: putfield 109	okhttp3/internal/http/RetryAndFollowUpInterceptor:b	Lokhttp3/internal/connection/StreamAllocation;
    //   258: goto +28 -> 286
    //   261: aload 5
    //   263: getfield 161	okhttp3/internal/connection/StreamAllocation:d	Lokhttp3/ConnectionPool;
    //   266: astore 7
    //   268: aload 7
    //   270: monitorenter
    //   271: aload 5
    //   273: getfield 165	okhttp3/internal/connection/StreamAllocation:n	Lokhttp3/internal/http/HttpCodec;
    //   276: astore 9
    //   278: aload 7
    //   280: monitorexit
    //   281: aload 9
    //   283: ifnonnull +12 -> 295
    //   286: aload_2
    //   287: astore 7
    //   289: aload 8
    //   291: astore_2
    //   292: goto -233 -> 59
    //   295: new 167	java/lang/StringBuilder
    //   298: dup
    //   299: invokespecial 168	java/lang/StringBuilder:<init>	()V
    //   302: astore_1
    //   303: aload_1
    //   304: ldc -86
    //   306: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload_1
    //   311: aload_2
    //   312: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload_1
    //   317: ldc -77
    //   319: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: new 181	java/lang/IllegalStateException
    //   326: dup
    //   327: aload_1
    //   328: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: invokespecial 186	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   334: athrow
    //   335: astore_1
    //   336: aload 7
    //   338: monitorexit
    //   339: aload_1
    //   340: athrow
    //   341: aload 5
    //   343: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   346: new 188	java/net/HttpRetryException
    //   349: dup
    //   350: ldc -66
    //   352: aload_2
    //   353: getfield 192	okhttp3/Response:c	I
    //   356: invokespecial 195	java/net/HttpRetryException:<init>	(Ljava/lang/String;I)V
    //   359: athrow
    //   360: aload 5
    //   362: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   365: new 197	java/net/ProtocolException
    //   368: dup
    //   369: ldc -57
    //   371: iload 6
    //   373: invokestatic 203	f:h	(Ljava/lang/String;I)Ljava/lang/String;
    //   376: invokespecial 204	java/net/ProtocolException:<init>	(Ljava/lang/String;)V
    //   379: athrow
    //   380: astore_1
    //   381: aload 5
    //   383: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   386: aload_1
    //   387: athrow
    //   388: astore_1
    //   389: goto +69 -> 458
    //   392: astore 8
    //   394: aload 8
    //   396: instanceof 206
    //   399: ifne +9 -> 408
    //   402: iconst_1
    //   403: istore 10
    //   405: goto +6 -> 411
    //   408: iconst_0
    //   409: istore 10
    //   411: aload_0
    //   412: aload 8
    //   414: aload 5
    //   416: iload 10
    //   418: aload_2
    //   419: invokevirtual 209	okhttp3/internal/http/RetryAndFollowUpInterceptor:d	(Ljava/io/IOException;Lokhttp3/internal/connection/StreamAllocation;ZLokhttp3/Request;)Z
    //   422: ifeq +6 -> 428
    //   425: goto -366 -> 59
    //   428: aload 8
    //   430: athrow
    //   431: astore 8
    //   433: aload_0
    //   434: aload 8
    //   436: getfield 212	okhttp3/internal/connection/RouteException:b	Ljava/io/IOException;
    //   439: aload 5
    //   441: iconst_0
    //   442: aload_2
    //   443: invokevirtual 209	okhttp3/internal/http/RetryAndFollowUpInterceptor:d	(Ljava/io/IOException;Lokhttp3/internal/connection/StreamAllocation;ZLokhttp3/Request;)Z
    //   446: ifeq +6 -> 452
    //   449: goto -390 -> 59
    //   452: aload 8
    //   454: getfield 214	okhttp3/internal/connection/RouteException:a	Ljava/io/IOException;
    //   457: athrow
    //   458: aload 5
    //   460: aconst_null
    //   461: invokevirtual 217	okhttp3/internal/connection/StreamAllocation:h	(Ljava/io/IOException;)V
    //   464: aload 5
    //   466: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   469: aload_1
    //   470: athrow
    //   471: aload 5
    //   473: invokevirtual 147	okhttp3/internal/connection/StreamAllocation:g	()V
    //   476: new 80	java/io/IOException
    //   479: dup
    //   480: ldc -37
    //   482: invokespecial 220	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   485: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	486	0	this	RetryAndFollowUpInterceptor
    //   0	486	1	paramRealInterceptorChain	RealInterceptorChain
    //   4	439	2	localObject1	Object
    //   9	232	3	localCall	okhttp3.Call
    //   14	228	4	localEventListener	okhttp3.EventListener
    //   45	427	5	localStreamAllocation	StreamAllocation
    //   54	318	6	i	int
    //   75	215	8	localObject3	Object
    //   392	37	8	localIOException	IOException
    //   431	22	8	localRouteException	okhttp3.internal.connection.RouteException
    //   276	6	9	localHttpCodec	HttpCodec
    //   403	14	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   271	281	335	finally
    //   336	339	335	finally
    //   151	163	380	java/io/IOException
    //   66	77	388	finally
    //   394	402	388	finally
    //   411	425	388	finally
    //   428	431	388	finally
    //   433	449	388	finally
    //   452	458	388	finally
    //   66	77	392	java/io/IOException
    //   66	77	431	okhttp3/internal/connection/RouteException
  }
  
  public final Address b(HttpUrl paramHttpUrl)
  {
    Object localObject1;
    SSLSocketFactory localSSLSocketFactory;
    Object localObject2;
    if (a.equals("https"))
    {
      localObject1 = a;
      localSSLSocketFactory = u;
      localObject2 = w;
      localObject1 = x;
    }
    else
    {
      localSSLSocketFactory = null;
      localObject2 = localSSLSocketFactory;
      localObject1 = localObject2;
    }
    String str = d;
    int i = e;
    paramHttpUrl = a;
    return new Address(str, i, B, t, localSSLSocketFactory, (HostnameVerifier)localObject2, (CertificatePinner)localObject1, y, b, c, d, p);
  }
  
  public final Request c(Response paramResponse, Route paramRoute)
  {
    int i = c;
    Object localObject = a;
    String str1 = b;
    RequestBody localRequestBody = null;
    if ((i != 307) && (i != 308)) {
      if (i != 401) {
        if (i != 503) {
          if (i != 407) {
            if (i == 408) {}
          }
        }
      }
    }
    switch (i)
    {
    default: 
      return null;
      if (!a.E) {
        return null;
      }
      if ((d instanceof UnrepeatableRequestBody)) {
        return null;
      }
      paramRoute = r;
      if ((paramRoute != null) && (c == 408)) {
        return null;
      }
      if (e(paramResponse, 0) > 0) {
        return null;
      }
      return a;
      if (b.type() == Proxy.Type.HTTP) {}
      for (paramResponse = a.y;; paramResponse = a.z)
      {
        paramResponse.a();
        return null;
        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        paramRoute = r;
        if ((paramRoute != null) && (c == 503)) {
          return null;
        }
        if (e(paramResponse, Integer.MAX_VALUE) == 0) {
          return a;
        }
        return null;
      }
      if ((!str1.equals("GET")) && (!str1.equals("HEAD"))) {
        return null;
      }
      break;
    }
    if (!a.D) {
      return null;
    }
    String str2 = paramResponse.g("Location");
    if (str2 == null) {
      return null;
    }
    localObject = a.a;
    localObject.getClass();
    try
    {
      paramRoute = new okhttp3/HttpUrl$Builder;
      paramRoute.<init>();
      paramRoute.b((HttpUrl)localObject, str2);
    }
    catch (IllegalArgumentException paramRoute)
    {
      paramRoute = null;
    }
    if (paramRoute != null) {
      paramRoute = paramRoute.a();
    } else {
      paramRoute = null;
    }
    if (paramRoute == null) {
      return null;
    }
    if ((!a.equals(a.a.a)) && (!a.C)) {
      return null;
    }
    localObject = a;
    localObject.getClass();
    localObject = new Request.Builder((Request)localObject);
    if (HttpMethod.b(str1))
    {
      boolean bool = str1.equals("PROPFIND");
      if ((str1.equals("PROPFIND") ^ true))
      {
        ((Request.Builder)localObject).b("GET", null);
      }
      else
      {
        if (bool) {
          localRequestBody = a.d;
        }
        ((Request.Builder)localObject).b(str1, localRequestBody);
      }
      if (!bool)
      {
        ((Request.Builder)localObject).c("Transfer-Encoding");
        ((Request.Builder)localObject).c("Content-Length");
        ((Request.Builder)localObject).c("Content-Type");
      }
    }
    if (!f(paramResponse, paramRoute)) {
      ((Request.Builder)localObject).c("Authorization");
    }
    a = paramRoute;
    return ((Request.Builder)localObject).a();
  }
  
  public final boolean d(IOException paramIOException, StreamAllocation paramStreamAllocation, boolean paramBoolean, Request paramRequest)
  {
    paramStreamAllocation.h(paramIOException);
    if (!a.E) {
      return false;
    }
    if (paramBoolean)
    {
      if ((!(d instanceof UnrepeatableRequestBody)) && (!(paramIOException instanceof FileNotFoundException))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        return false;
      }
    }
    if (((paramIOException instanceof ProtocolException)) || ((paramIOException instanceof InterruptedIOException) ? ((paramIOException instanceof SocketTimeoutException)) && (!paramBoolean) : (((paramIOException instanceof SSLHandshakeException)) && ((paramIOException.getCause() instanceof CertificateException))) || ((paramIOException instanceof SSLPeerUnverifiedException)))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0) {
      return false;
    }
    if (c == null)
    {
      paramIOException = b;
      if (paramIOException != null)
      {
        if (b < a.size()) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {}
      }
      else
      {
        paramIOException = h;
        if (f < e.size()) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i == 0) && (h.isEmpty())) {
          i = 0;
        } else {
          i = 1;
        }
        if (i == 0)
        {
          i = 0;
          break label252;
        }
      }
    }
    int i = 1;
    label252:
    return i != 0;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.RetryAndFollowUpInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */