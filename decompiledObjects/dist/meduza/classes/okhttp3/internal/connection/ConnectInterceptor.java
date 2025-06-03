package okhttp3.internal.connection;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class ConnectInterceptor
  implements Interceptor
{
  public final OkHttpClient a;
  
  public ConnectInterceptor(OkHttpClient paramOkHttpClient)
  {
    a = paramOkHttpClient;
  }
  
  /* Error */
  public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain paramRealInterceptorChain)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 25	okhttp3/internal/http/RealInterceptorChain:f	Lokhttp3/Request;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield 29	okhttp3/internal/http/RealInterceptorChain:b	Lokhttp3/internal/connection/StreamAllocation;
    //   9: astore_3
    //   10: aload_2
    //   11: getfield 34	okhttp3/Request:b	Ljava/lang/String;
    //   14: ldc 36
    //   16: invokevirtual 42	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   19: istore 4
    //   21: aload_0
    //   22: getfield 15	okhttp3/internal/connection/ConnectInterceptor:a	Lokhttp3/OkHttpClient;
    //   25: astore 5
    //   27: aload_3
    //   28: invokevirtual 46	java/lang/Object:getClass	()Ljava/lang/Class;
    //   31: pop
    //   32: aload_1
    //   33: getfield 50	okhttp3/internal/http/RealInterceptorChain:i	I
    //   36: istore 6
    //   38: aload_1
    //   39: getfield 53	okhttp3/internal/http/RealInterceptorChain:j	I
    //   42: istore 7
    //   44: aload_1
    //   45: getfield 56	okhttp3/internal/http/RealInterceptorChain:k	I
    //   48: istore 8
    //   50: aload 5
    //   52: getfield 61	okhttp3/OkHttpClient:J	I
    //   55: istore 9
    //   57: aload 5
    //   59: getfield 65	okhttp3/OkHttpClient:E	Z
    //   62: istore 10
    //   64: aload_3
    //   65: iload 6
    //   67: iload 7
    //   69: iload 8
    //   71: iload 9
    //   73: iload 10
    //   75: iload 4
    //   77: iconst_1
    //   78: ixor
    //   79: invokevirtual 71	okhttp3/internal/connection/StreamAllocation:e	(IIIIZZ)Lokhttp3/internal/connection/RealConnection;
    //   82: aload 5
    //   84: aload_1
    //   85: aload_3
    //   86: invokevirtual 77	okhttp3/internal/connection/RealConnection:h	(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/connection/StreamAllocation;)Lokhttp3/internal/http/HttpCodec;
    //   89: astore 11
    //   91: aload_3
    //   92: getfield 81	okhttp3/internal/connection/StreamAllocation:d	Lokhttp3/ConnectionPool;
    //   95: astore 5
    //   97: aload 5
    //   99: monitorenter
    //   100: aload_3
    //   101: aload 11
    //   103: putfield 85	okhttp3/internal/connection/StreamAllocation:n	Lokhttp3/internal/http/HttpCodec;
    //   106: aload 5
    //   108: monitorexit
    //   109: aload_1
    //   110: aload_2
    //   111: aload_3
    //   112: aload 11
    //   114: aload_3
    //   115: invokevirtual 88	okhttp3/internal/connection/StreamAllocation:b	()Lokhttp3/internal/connection/RealConnection;
    //   118: invokevirtual 91	okhttp3/internal/http/RealInterceptorChain:d	(Lokhttp3/Request;Lokhttp3/internal/connection/StreamAllocation;Lokhttp3/internal/http/HttpCodec;Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Response;
    //   121: areturn
    //   122: astore_1
    //   123: aload 5
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    //   128: astore_1
    //   129: new 93	okhttp3/internal/connection/RouteException
    //   132: dup
    //   133: aload_1
    //   134: invokespecial 96	okhttp3/internal/connection/RouteException:<init>	(Ljava/io/IOException;)V
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	ConnectInterceptor
    //   0	138	1	paramRealInterceptorChain	okhttp3.internal.http.RealInterceptorChain
    //   4	107	2	localRequest	okhttp3.Request
    //   9	106	3	localStreamAllocation	StreamAllocation
    //   19	60	4	bool1	boolean
    //   36	30	6	i	int
    //   42	26	7	j	int
    //   48	22	8	k	int
    //   55	17	9	m	int
    //   62	12	10	bool2	boolean
    //   89	24	11	localHttpCodec	okhttp3.internal.http.HttpCodec
    // Exception table:
    //   from	to	target	type
    //   100	109	122	finally
    //   123	126	122	finally
    //   64	100	128	java/io/IOException
    //   126	128	128	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.ConnectInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */