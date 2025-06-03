package okhttp3.internal.connection;

import f;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

public final class StreamAllocation
{
  public final Address a;
  public RouteSelector.Selection b;
  public Route c;
  public final ConnectionPool d;
  public final Call e;
  public final EventListener f;
  public final Object g;
  public final RouteSelector h;
  public int i;
  public RealConnection j;
  public boolean k;
  public boolean l;
  public boolean m;
  public HttpCodec n;
  
  public StreamAllocation(ConnectionPool paramConnectionPool, Address paramAddress, Call paramCall, EventListener paramEventListener, Object paramObject)
  {
    d = paramConnectionPool;
    a = paramAddress;
    e = paramCall;
    f = paramEventListener;
    h = new RouteSelector(paramAddress, Internal.a.j(paramConnectionPool), paramCall, paramEventListener);
    g = paramObject;
  }
  
  public final void a(RealConnection paramRealConnection, boolean paramBoolean)
  {
    if (j == null)
    {
      j = paramRealConnection;
      k = paramBoolean;
      n.add(new StreamAllocationReference(this, g));
      return;
    }
    throw new IllegalStateException();
  }
  
  public final RealConnection b()
  {
    try
    {
      RealConnection localRealConnection = j;
      return localRealConnection;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Socket c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject1 = null;
    if (paramBoolean3) {
      n = null;
    }
    if (paramBoolean2) {
      l = true;
    }
    RealConnection localRealConnection = j;
    Object localObject2 = localObject1;
    if (localRealConnection != null)
    {
      if (paramBoolean1) {
        k = true;
      }
      localObject2 = localObject1;
      if (n == null) {
        if (!l)
        {
          localObject2 = localObject1;
          if (!k) {}
        }
        else
        {
          int i1 = n.size();
          for (int i2 = 0; i2 < i1; i2++) {
            if (((Reference)n.get(i2)).get() == this)
            {
              n.remove(i2);
              if (j.n.isEmpty())
              {
                j.o = System.nanoTime();
                if (Internal.a.e(d, j))
                {
                  localObject2 = j.e;
                  break label182;
                }
              }
              localObject2 = null;
              label182:
              j = null;
              break label204;
            }
          }
          throw new IllegalStateException();
        }
      }
    }
    label204:
    return (Socket)localObject2;
  }
  
  public final RealConnection d(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject2;
    ArrayList localArrayList;
    Object localObject3;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    boolean bool;
    label880:
    Object localObject7;
    IOException localIOException;
    Object localObject10;
    synchronized (d)
    {
      if (!l) {
        if (n == null) {
          if (!m)
          {
            localObject2 = j;
            localArrayList = null;
            localObject3 = null;
            i1 = 0;
            if ((localObject2 != null) && (k)) {
              ??? = c(false, false, true);
            } else {
              ??? = null;
            }
            Object localObject5 = j;
            if (localObject5 != null) {
              localObject2 = null;
            } else {
              localObject5 = null;
            }
            ??? = localObject2;
            if (!k) {
              ??? = null;
            }
            localObject2 = localObject3;
            if (localObject5 == null)
            {
              Internal.a.h(d, a, this, null);
              localObject2 = j;
              if (localObject2 != null)
              {
                localObject5 = localObject2;
                i2 = 1;
                localObject2 = localArrayList;
              }
              else
              {
                localObject2 = c;
              }
            }
            else
            {
              i2 = 0;
            }
            Util.f((Socket)???);
            if (??? != null) {
              f.getClass();
            }
            if (i2 != 0) {
              f.getClass();
            }
            if (localObject5 != null)
            {
              c = j.c;
              return (RealConnection)localObject5;
            }
            if (localObject2 == null)
            {
              ??? = b;
              if (??? != null)
              {
                if (b < a.size()) {
                  i3 = 1;
                } else {
                  i3 = 0;
                }
                if (i3 != 0) {}
              }
              else
              {
                ??? = h;
                if (f < e.size()) {
                  i3 = 1;
                } else {
                  i3 = 0;
                }
                if ((i3 == 0) && (h.isEmpty())) {
                  i3 = 0;
                } else {
                  i3 = 1;
                }
                if (i3 != 0)
                {
                  localArrayList = new ArrayList();
                  if (f < e.size()) {
                    i3 = 1;
                  } else {
                    i3 = 0;
                  }
                  if (i3 != 0)
                  {
                    if (f < e.size()) {
                      i3 = 1;
                    } else {
                      i3 = 0;
                    }
                    if (i3 != 0)
                    {
                      ??? = e;
                      i3 = f;
                      f = (i3 + 1);
                      localObject3 = (Proxy)((List)???).get(i3);
                      g = new ArrayList();
                      if ((((Proxy)localObject3).type() != Proxy.Type.DIRECT) && (((Proxy)localObject3).type() != Proxy.Type.SOCKS))
                      {
                        ??? = ((Proxy)localObject3).address();
                        if ((??? instanceof InetSocketAddress))
                        {
                          ??? = (InetSocketAddress)???;
                          ??? = ((InetSocketAddress)???).getAddress();
                          if (??? == null) {
                            ??? = ((InetSocketAddress)???).getHostName();
                          } else {
                            ??? = ((InetAddress)???).getHostAddress();
                          }
                          i3 = ((InetSocketAddress)???).getPort();
                        }
                        else
                        {
                          localObject5 = f.l("Proxy.address() is not an InetSocketAddress: ");
                          ((StringBuilder)localObject5).append(???.getClass());
                          throw new IllegalArgumentException(((StringBuilder)localObject5).toString());
                        }
                      }
                      else
                      {
                        ??? = a.a;
                        ??? = d;
                        i3 = e;
                      }
                      if ((i3 >= 1) && (i3 <= 65535))
                      {
                        if (((Proxy)localObject3).type() == Proxy.Type.SOCKS)
                        {
                          g.add(InetSocketAddress.createUnresolved((String)???, i3));
                        }
                        else
                        {
                          d.getClass();
                          ??? = a.b.a((String)???);
                          if (((List)???).isEmpty()) {
                            break label880;
                          }
                          d.getClass();
                          i4 = ((List)???).size();
                          for (i5 = 0; i5 < i4; i5++)
                          {
                            ??? = (InetAddress)((List)???).get(i5);
                            g.add(new InetSocketAddress((InetAddress)???, i3));
                          }
                        }
                        i5 = g.size();
                        i3 = 0;
                        if (i3 < i5) {
                          ??? = new Route(a, (Proxy)localObject3, (InetSocketAddress)g.get(i3));
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public final RealConnection e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload 5
    //   3: iload_1
    //   4: iload_2
    //   5: iload_3
    //   6: iload 4
    //   8: invokevirtual 354	okhttp3/internal/connection/StreamAllocation:d	(ZIIII)Lokhttp3/internal/connection/RealConnection;
    //   11: astore 7
    //   13: aload_0
    //   14: getfield 40	okhttp3/internal/connection/StreamAllocation:d	Lokhttp3/ConnectionPool;
    //   17: astore 8
    //   19: aload 8
    //   21: monitorenter
    //   22: aload 7
    //   24: getfield 356	okhttp3/internal/connection/RealConnection:l	I
    //   27: istore 9
    //   29: iconst_1
    //   30: istore 10
    //   32: iload 9
    //   34: ifne +36 -> 70
    //   37: aload 7
    //   39: getfield 336	okhttp3/internal/connection/RealConnection:h	Lokhttp3/internal/http2/Http2Connection;
    //   42: ifnull +9 -> 51
    //   45: iconst_1
    //   46: istore 9
    //   48: goto +6 -> 54
    //   51: iconst_0
    //   52: istore 9
    //   54: iload 9
    //   56: ifne +14 -> 70
    //   59: aload 8
    //   61: monitorexit
    //   62: aload 7
    //   64: areturn
    //   65: astore 7
    //   67: goto +232 -> 299
    //   70: aload 8
    //   72: monitorexit
    //   73: aload 7
    //   75: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   78: invokevirtual 361	java/net/Socket:isClosed	()Z
    //   81: ifne +200 -> 281
    //   84: aload 7
    //   86: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   89: invokevirtual 364	java/net/Socket:isInputShutdown	()Z
    //   92: ifne +189 -> 281
    //   95: aload 7
    //   97: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   100: invokevirtual 367	java/net/Socket:isOutputShutdown	()Z
    //   103: ifeq +6 -> 109
    //   106: goto +175 -> 281
    //   109: aload 7
    //   111: getfield 336	okhttp3/internal/connection/RealConnection:h	Lokhttp3/internal/http2/Http2Connection;
    //   114: astore 8
    //   116: aload 8
    //   118: ifnull +75 -> 193
    //   121: invokestatic 119	java/lang/System:nanoTime	()J
    //   124: lstore 11
    //   126: aload 8
    //   128: monitorenter
    //   129: aload 8
    //   131: getfield 371	okhttp3/internal/http2/Http2Connection:o	Z
    //   134: ifeq +6 -> 140
    //   137: goto +32 -> 169
    //   140: aload 8
    //   142: getfield 374	okhttp3/internal/http2/Http2Connection:v	J
    //   145: aload 8
    //   147: getfield 377	okhttp3/internal/http2/Http2Connection:u	J
    //   150: lcmp
    //   151: ifge +24 -> 175
    //   154: aload 8
    //   156: getfield 380	okhttp3/internal/http2/Http2Connection:w	J
    //   159: lstore 13
    //   161: lload 11
    //   163: lload 13
    //   165: lcmp
    //   166: iflt +9 -> 175
    //   169: aload 8
    //   171: monitorexit
    //   172: goto +109 -> 281
    //   175: aload 8
    //   177: monitorexit
    //   178: iload 10
    //   180: istore 9
    //   182: goto +102 -> 284
    //   185: astore 7
    //   187: aload 8
    //   189: monitorexit
    //   190: aload 7
    //   192: athrow
    //   193: iload 10
    //   195: istore 9
    //   197: iload 6
    //   199: ifeq +85 -> 284
    //   202: aload 7
    //   204: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   207: invokevirtual 383	java/net/Socket:getSoTimeout	()I
    //   210: istore 9
    //   212: aload 7
    //   214: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   217: iconst_1
    //   218: invokevirtual 387	java/net/Socket:setSoTimeout	(I)V
    //   221: aload 7
    //   223: getfield 390	okhttp3/internal/connection/RealConnection:i	Lxc/s;
    //   226: invokevirtual 394	xc/s:v	()Z
    //   229: istore 15
    //   231: iload 15
    //   233: ifeq +16 -> 249
    //   236: aload 7
    //   238: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   241: iload 9
    //   243: invokevirtual 387	java/net/Socket:setSoTimeout	(I)V
    //   246: goto +35 -> 281
    //   249: aload 7
    //   251: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   254: iload 9
    //   256: invokevirtual 387	java/net/Socket:setSoTimeout	(I)V
    //   259: iload 10
    //   261: istore 9
    //   263: goto +21 -> 284
    //   266: astore 8
    //   268: aload 7
    //   270: getfield 129	okhttp3/internal/connection/RealConnection:e	Ljava/net/Socket;
    //   273: iload 9
    //   275: invokevirtual 387	java/net/Socket:setSoTimeout	(I)V
    //   278: aload 8
    //   280: athrow
    //   281: iconst_0
    //   282: istore 9
    //   284: iload 9
    //   286: ifne +10 -> 296
    //   289: aload_0
    //   290: invokevirtual 396	okhttp3/internal/connection/StreamAllocation:f	()V
    //   293: goto -293 -> 0
    //   296: aload 7
    //   298: areturn
    //   299: aload 8
    //   301: monitorexit
    //   302: aload 7
    //   304: athrow
    //   305: astore 8
    //   307: iload 10
    //   309: istore 9
    //   311: goto -27 -> 284
    //   314: astore 8
    //   316: goto -35 -> 281
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	319	0	this	StreamAllocation
    //   0	319	1	paramInt1	int
    //   0	319	2	paramInt2	int
    //   0	319	3	paramInt3	int
    //   0	319	4	paramInt4	int
    //   0	319	5	paramBoolean1	boolean
    //   0	319	6	paramBoolean2	boolean
    //   11	52	7	localRealConnection1	RealConnection
    //   65	45	7	localObject1	Object
    //   185	118	7	localRealConnection2	RealConnection
    //   17	171	8	localObject2	Object
    //   266	34	8	localObject3	Object
    //   305	1	8	localSocketTimeoutException	java.net.SocketTimeoutException
    //   314	1	8	localIOException	IOException
    //   27	283	9	i1	int
    //   30	278	10	i2	int
    //   124	38	11	l1	long
    //   159	5	13	l2	long
    //   229	3	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   22	29	65	finally
    //   37	45	65	finally
    //   59	62	65	finally
    //   70	73	65	finally
    //   299	302	65	finally
    //   129	137	185	finally
    //   140	161	185	finally
    //   212	231	266	finally
    //   202	212	305	java/net/SocketTimeoutException
    //   236	246	305	java/net/SocketTimeoutException
    //   249	259	305	java/net/SocketTimeoutException
    //   268	281	305	java/net/SocketTimeoutException
    //   202	212	314	java/io/IOException
    //   236	246	314	java/io/IOException
    //   249	259	314	java/io/IOException
    //   268	281	314	java/io/IOException
  }
  
  public final void f()
  {
    synchronized (d)
    {
      RealConnection localRealConnection = j;
      Socket localSocket = c(true, false, false);
      if (j != null) {
        localRealConnection = null;
      }
      Util.f(localSocket);
      if (localRealConnection != null) {
        f.getClass();
      }
      return;
    }
  }
  
  public final void g()
  {
    synchronized (d)
    {
      RealConnection localRealConnection = j;
      Socket localSocket = c(false, true, false);
      if (j != null) {
        localRealConnection = null;
      }
      Util.f(localSocket);
      if (localRealConnection != null)
      {
        Internal.a.k(e, null);
        f.getClass();
        f.getClass();
      }
      return;
    }
  }
  
  public final void h(IOException paramIOException)
  {
    Object localObject1;
    synchronized (d)
    {
      bool = paramIOException instanceof StreamResetException;
      localObject1 = null;
      int i1;
      if (bool)
      {
        paramIOException = a;
        if (paramIOException == ErrorCode.f)
        {
          i1 = i + 1;
          i = i1;
          if (i1 <= 1) {
            break label154;
          }
        }
        else
        {
          if (paramIOException == ErrorCode.o) {
            break label154;
          }
        }
      }
      else
      {
        localObject2 = j;
        if (localObject2 == null) {
          break label154;
        }
        if (h != null) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((i1 != 0) && (!(paramIOException instanceof ConnectionShutdownException))) {
          break label154;
        }
        if (l != 0) {
          break label145;
        }
        localObject2 = c;
        if ((localObject2 != null) && (paramIOException != null)) {
          h.a((Route)localObject2, paramIOException);
        }
      }
      c = null;
      label145:
      bool = true;
    }
    label154:
    boolean bool = false;
    Object localObject2 = j;
    Socket localSocket = c(bool, false, true);
    paramIOException = (IOException)localObject1;
    if (j == null) {
      if (!k) {
        paramIOException = (IOException)localObject1;
      } else {
        paramIOException = (IOException)localObject2;
      }
    }
    Util.f(localSocket);
    if (paramIOException != null) {
      f.getClass();
    }
  }
  
  public final void i(boolean paramBoolean, HttpCodec paramHttpCodec, IOException paramIOException)
  {
    f.getClass();
    ConnectionPool localConnectionPool = d;
    if (paramHttpCodec != null) {}
    try
    {
      if (paramHttpCodec == n)
      {
        if (!paramBoolean)
        {
          paramHttpCodec = j;
          l += 1;
        }
        paramHttpCodec = j;
        localObject = c(paramBoolean, false, true);
        if (j != null) {
          paramHttpCodec = null;
        }
        paramBoolean = l;
        Util.f((Socket)localObject);
        if (paramHttpCodec != null) {
          f.getClass();
        }
        if (paramIOException != null)
        {
          Internal.a.k(e, paramIOException);
        }
        else
        {
          if (!paramBoolean) {
            break label139;
          }
          Internal.a.k(e, null);
        }
        f.getClass();
        label139:
        return;
      }
      paramIOException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("expected ");
      ((StringBuilder)localObject).append(n);
      ((StringBuilder)localObject).append(" but was ");
      ((StringBuilder)localObject).append(paramHttpCodec);
      paramIOException.<init>(((StringBuilder)localObject).toString());
      throw paramIOException;
    }
    finally {}
  }
  
  public final String toString()
  {
    Object localObject = b();
    if (localObject != null) {
      localObject = ((RealConnection)localObject).toString();
    } else {
      localObject = a.toString();
    }
    return (String)localObject;
  }
  
  public static final class StreamAllocationReference
    extends WeakReference<StreamAllocation>
  {
    public final Object a;
    
    public StreamAllocationReference(StreamAllocation paramStreamAllocation, Object paramObject)
    {
      super();
      a = paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.StreamAllocation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */