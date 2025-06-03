package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.Headers;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import xc.f;
import xc.h;
import xc.i;
import xc.y;

class Http2Connection$ReaderRunnable
  extends NamedRunnable
  implements Http2Reader.Handler
{
  public final Http2Reader b;
  
  public Http2Connection$ReaderRunnable(Http2Connection paramHttp2Connection, Http2Reader paramHttp2Reader)
  {
    super("OkHttp %s", new Object[] { d });
    b = paramHttp2Reader;
  }
  
  public final void a() {}
  
  public final void b(int paramInt1, int paramInt2, h paramh, boolean paramBoolean)
  {
    c.getClass();
    int i;
    if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = c;
      localObject1.getClass();
      localObject2 = new f();
      l1 = paramInt2;
      paramh.u0(l1);
      paramh.e0((f)localObject2, l1);
      if (b == l1)
      {
        ((Http2Connection)localObject1).H(new Http2Connection.6((Http2Connection)localObject1, new Object[] { d, Integer.valueOf(paramInt1) }, paramInt1, (f)localObject2, paramInt2, paramBoolean));
        return;
      }
      paramh = new StringBuilder();
      paramh.append(b);
      paramh.append(" != ");
      paramh.append(paramInt2);
      throw new IOException(paramh.toString());
    }
    Object localObject2 = c.C(paramInt1);
    if (localObject2 == null)
    {
      c.h0(paramInt1, ErrorCode.c);
      localObject2 = c;
      l1 = paramInt2;
      ((Http2Connection)localObject2).b0(l1);
      paramh.skip(l1);
      return;
    }
    Object localObject1 = g;
    long l1 = paramInt2;
    while (l1 > 0L) {
      synchronized (f)
      {
        boolean bool = e;
        if (b.b + l1 > c) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
        if (paramInt1 != 0)
        {
          paramh.skip(l1);
          localObject1 = f;
          paramh = ErrorCode.e;
          if (!((Http2Stream)localObject1).d(paramh)) {
            break label536;
          }
          d.h0(c, paramh);
          break label536;
        }
        if (bool)
        {
          paramh.skip(l1);
          break label536;
        }
        long l2 = paramh.e0(a, l1);
        if (l2 != -1L)
        {
          long l3 = l1 - l2;
          synchronized (f)
          {
            f localf;
            if (d)
            {
              localf = a;
              l2 = b;
              localf.f();
            }
            else
            {
              localf = b;
              if (b == 0L) {
                paramInt1 = 1;
              } else {
                paramInt1 = 0;
              }
              localf.A0(a);
              if (paramInt1 != 0) {
                f.notifyAll();
              }
              l2 = 0L;
            }
            l1 = l3;
            if (l2 <= 0L) {
              continue;
            }
            f.d.b0(l2);
            l1 = l3;
          }
        }
        throw new EOFException();
      }
    }
    localObject1.getClass();
    label536:
    if (paramBoolean) {
      try
      {
        g.e = true;
        paramBoolean = ((Http2Stream)localObject2).f();
        localObject2.notifyAll();
        if (!paramBoolean) {
          d.I(c);
        }
      }
      finally {}
    }
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    Http2Connection localHttp2Connection1 = c;
    if (paramInt == 0)
    {
      try
      {
        Http2Connection localHttp2Connection2 = c;
        y += paramLong;
        localHttp2Connection2.notifyAll();
      }
      finally {}
    }
    else
    {
      Http2Stream localHttp2Stream = localHttp2Connection1.C(paramInt);
      if (localHttp2Stream != null) {
        try
        {
          b += paramLong;
          if (paramLong > 0L) {
            localHttp2Stream.notifyAll();
          }
        }
        finally {}
      }
    }
  }
  
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = c;
      if (paramInt1 == 1) {}
      try
      {
        localHttp2Connection1 = c;
        t += 1L;
      }
      finally
      {
        Http2Connection localHttp2Connection1;
        break label101;
      }
      if (paramInt1 == 2)
      {
        localHttp2Connection1 = c;
        v += 1L;
      }
      else if (paramInt1 == 3)
      {
        localHttp2Connection1 = c;
        localHttp2Connection1.getClass();
        localHttp2Connection1.notifyAll();
      }
      break label141;
      label101:
      throw ((Throwable)localObject2);
    }
    try
    {
      Http2Connection localHttp2Connection2 = c;
      localObject1 = p;
      Http2Connection.PingRunnable localPingRunnable = new okhttp3/internal/http2/Http2Connection$PingRunnable;
      localPingRunnable.<init>(localHttp2Connection2, paramInt1, paramInt2);
      ((ScheduledThreadPoolExecutor)localObject1).execute(localPingRunnable);
      label141:
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;) {}
    }
  }
  
  public final void f(Settings paramSettings)
  {
    try
    {
      Http2Connection localHttp2Connection = c;
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = p;
      Http2Connection.ReaderRunnable.2 local2 = new okhttp3/internal/http2/Http2Connection$ReaderRunnable$2;
      local2.<init>(this, new Object[] { d }, paramSettings);
      localScheduledThreadPoolExecutor.execute(local2);
      return;
    }
    catch (RejectedExecutionException paramSettings)
    {
      for (;;) {}
    }
  }
  
  public final void g(int paramInt, ErrorCode paramErrorCode)
  {
    c.getClass();
    int i;
    if ((paramInt != 0) && ((paramInt & 0x1) == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject = c;
      ((Http2Connection)localObject).H(new Http2Connection.7((Http2Connection)localObject, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramErrorCode));
      return;
    }
    Object localObject = c.I(paramInt);
    if (localObject != null) {
      try
      {
        if (k == null)
        {
          k = paramErrorCode;
          localObject.notifyAll();
        }
      }
      finally
      {
        paramErrorCode = finally;
        throw paramErrorCode;
      }
    }
  }
  
  public final void h(int paramInt, ArrayList paramArrayList)
  {
    synchronized (c)
    {
      if (E.contains(Integer.valueOf(paramInt))) {
        ???.h0(paramInt, ErrorCode.c);
      } else {
        E.add(Integer.valueOf(paramInt));
      }
    }
    try
    {
      Http2Connection.4 local4 = new okhttp3/internal/http2/Http2Connection$4;
      local4.<init>(???, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramArrayList);
      ???.H(local4);
      return;
      paramArrayList = finally;
      throw paramArrayList;
    }
    catch (RejectedExecutionException paramArrayList)
    {
      for (;;) {}
    }
  }
  
  public final void i(int paramInt, i parami)
  {
    parami.i();
    synchronized (c)
    {
      parami = (Http2Stream[])c.c.values().toArray(new Http2Stream[c.c.size()]);
      c.o = true;
      int i = parami.length;
      int j = 0;
      while (j < i)
      {
        ??? = parami[j];
        ErrorCode localErrorCode;
        if ((c > paramInt) && (???.e())) {
          localErrorCode = ErrorCode.f;
        }
        try
        {
          if (k == null)
          {
            k = localErrorCode;
            ???.notifyAll();
          }
          c.I(c);
        }
        finally {}
      }
      return;
    }
  }
  
  public final void j(int paramInt, ArrayList paramArrayList, boolean paramBoolean)
  {
    c.getClass();
    int i;
    if ((paramInt != 0) && ((paramInt & 0x1) == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1;
    if (i != 0)
    {
      localObject1 = c;
      localObject1.getClass();
    }
    try
    {
      ??? = new okhttp3/internal/http2/Http2Connection$5;
      ((Http2Connection.5)???).<init>((Http2Connection)localObject1, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramArrayList, paramBoolean);
      ((Http2Connection)localObject1).H((NamedRunnable)???);
      return;
      boolean bool;
      synchronized (c)
      {
        localObject1 = c.C(paramInt);
        if (localObject1 == null)
        {
          localObject1 = c;
          if (o) {
            return;
          }
          if (paramInt <= e) {
            return;
          }
          if (paramInt % 2 == f % 2) {
            return;
          }
          localObject1 = Util.w(paramArrayList);
          paramArrayList = new okhttp3/internal/http2/Http2Stream;
          paramArrayList.<init>(paramInt, c, false, paramBoolean, (Headers)localObject1);
          localObject1 = c;
          e = paramInt;
          c.put(Integer.valueOf(paramInt), paramArrayList);
          localObject1 = Http2Connection.F;
          Http2Connection.ReaderRunnable.1 local1 = new okhttp3/internal/http2/Http2Connection$ReaderRunnable$1;
          local1.<init>(this, new Object[] { c.d, Integer.valueOf(paramInt) }, paramArrayList);
          ((ThreadPoolExecutor)localObject1).execute(local1);
          return;
        }
      }
    }
    catch (RejectedExecutionException paramArrayList)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final void k()
  {
    // Byte code:
    //   0: getstatic 314	okhttp3/internal/http2/ErrorCode:d	Lokhttp3/internal/http2/ErrorCode;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield 30	okhttp3/internal/http2/Http2Connection$ReaderRunnable:b	Lokhttp3/internal/http2/Http2Reader;
    //   8: aload_0
    //   9: invokevirtual 319	okhttp3/internal/http2/Http2Reader:C	(Lokhttp3/internal/http2/Http2Reader$Handler;)V
    //   12: aload_0
    //   13: getfield 30	okhttp3/internal/http2/Http2Connection$ReaderRunnable:b	Lokhttp3/internal/http2/Http2Reader;
    //   16: iconst_0
    //   17: aload_0
    //   18: invokevirtual 322	okhttp3/internal/http2/Http2Reader:g	(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z
    //   21: ifeq +6 -> 27
    //   24: goto -12 -> 12
    //   27: getstatic 324	okhttp3/internal/http2/ErrorCode:b	Lokhttp3/internal/http2/ErrorCode;
    //   30: astore_2
    //   31: aload_2
    //   32: astore_3
    //   33: getstatic 326	okhttp3/internal/http2/ErrorCode:o	Lokhttp3/internal/http2/ErrorCode;
    //   36: astore 4
    //   38: aload_0
    //   39: getfield 17	okhttp3/internal/http2/Http2Connection$ReaderRunnable:c	Lokhttp3/internal/http2/Http2Connection;
    //   42: aload_2
    //   43: aload 4
    //   45: invokevirtual 329	okhttp3/internal/http2/Http2Connection:f	(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    //   48: goto +25 -> 73
    //   51: astore_2
    //   52: aload_1
    //   53: astore_3
    //   54: goto +28 -> 82
    //   57: astore_3
    //   58: aload_1
    //   59: astore_3
    //   60: getstatic 105	okhttp3/internal/http2/ErrorCode:c	Lokhttp3/internal/http2/ErrorCode;
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 17	okhttp3/internal/http2/Http2Connection$ReaderRunnable:c	Lokhttp3/internal/http2/Http2Connection;
    //   68: aload_2
    //   69: aload_2
    //   70: invokevirtual 329	okhttp3/internal/http2/Http2Connection:f	(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    //   73: aload_0
    //   74: getfield 30	okhttp3/internal/http2/Http2Connection$ReaderRunnable:b	Lokhttp3/internal/http2/Http2Reader;
    //   77: invokestatic 332	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   80: return
    //   81: astore_2
    //   82: aload_0
    //   83: getfield 17	okhttp3/internal/http2/Http2Connection$ReaderRunnable:c	Lokhttp3/internal/http2/Http2Connection;
    //   86: aload_3
    //   87: aload_1
    //   88: invokevirtual 329	okhttp3/internal/http2/Http2Connection:f	(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;)V
    //   91: aload_0
    //   92: getfield 30	okhttp3/internal/http2/Http2Connection$ReaderRunnable:b	Lokhttp3/internal/http2/Http2Reader;
    //   95: invokestatic 332	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   98: aload_2
    //   99: athrow
    //   100: astore_3
    //   101: aload_2
    //   102: astore_3
    //   103: goto -43 -> 60
    //   106: astore_3
    //   107: goto -34 -> 73
    //   110: astore_3
    //   111: goto -20 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	ReaderRunnable
    //   3	85	1	localErrorCode1	ErrorCode
    //   30	13	2	localErrorCode2	ErrorCode
    //   51	1	2	localObject1	Object
    //   63	7	2	localErrorCode3	ErrorCode
    //   81	21	2	localObject2	Object
    //   32	22	3	localErrorCode4	ErrorCode
    //   57	1	3	localIOException1	IOException
    //   59	28	3	localErrorCode5	ErrorCode
    //   100	1	3	localIOException2	IOException
    //   102	1	3	localObject3	Object
    //   106	1	3	localIOException3	IOException
    //   110	1	3	localIOException4	IOException
    //   36	8	4	localErrorCode6	ErrorCode
    // Exception table:
    //   from	to	target	type
    //   4	12	51	finally
    //   12	24	51	finally
    //   27	31	51	finally
    //   4	12	57	java/io/IOException
    //   12	24	57	java/io/IOException
    //   27	31	57	java/io/IOException
    //   33	38	81	finally
    //   60	64	81	finally
    //   33	38	100	java/io/IOException
    //   38	48	106	java/io/IOException
    //   64	73	106	java/io/IOException
    //   82	91	110	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.ReaderRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */