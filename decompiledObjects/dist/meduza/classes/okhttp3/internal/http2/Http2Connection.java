package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Headers;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import xc.f;
import xc.g;
import xc.h;
import xc.i;
import xc.y;

public final class Http2Connection
  implements Closeable
{
  public static final ThreadPoolExecutor F = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.v("OkHttp Http2Connection", true));
  public final Settings A;
  public final Socket B;
  public final Http2Writer C;
  public final ReaderRunnable D;
  public final LinkedHashSet E;
  public final boolean a;
  public final Listener b;
  public final LinkedHashMap c = new LinkedHashMap();
  public final String d;
  public int e;
  public int f;
  public boolean o;
  public final ScheduledThreadPoolExecutor p;
  public final ThreadPoolExecutor q;
  public final PushObserver r;
  public long s = 0L;
  public long t = 0L;
  public long u = 0L;
  public long v = 0L;
  public long w = 0L;
  public long x = 0L;
  public long y;
  public Settings z = new Settings();
  
  public Http2Connection(Builder paramBuilder)
  {
    Settings localSettings = new Settings();
    A = localSettings;
    E = new LinkedHashSet();
    r = f;
    boolean bool = g;
    a = bool;
    b = e;
    int i;
    if (bool) {
      i = 1;
    } else {
      i = 2;
    }
    f = i;
    if (bool) {
      f = (i + 2);
    }
    if (bool) {
      z.b(7, 16777216);
    }
    String str = b;
    d = str;
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.v(Util.l("OkHttp %s Writer", new Object[] { str }), false));
    p = localScheduledThreadPoolExecutor;
    if (h != 0)
    {
      IntervalPingRunnable localIntervalPingRunnable = new IntervalPingRunnable();
      long l = h;
      localScheduledThreadPoolExecutor.scheduleAtFixedRate(localIntervalPingRunnable, l, l, TimeUnit.MILLISECONDS);
    }
    q = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.v(Util.l("OkHttp %s Push Observer", new Object[] { str }), true));
    localSettings.b(7, 65535);
    localSettings.b(5, 16384);
    y = localSettings.a();
    B = a;
    C = new Http2Writer(d, bool);
    D = new ReaderRunnable(new Http2Reader(c, bool));
  }
  
  public final Http2Stream C(int paramInt)
  {
    try
    {
      Http2Stream localHttp2Stream = (Http2Stream)c.get(Integer.valueOf(paramInt));
      return localHttp2Stream;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void H(NamedRunnable paramNamedRunnable)
  {
    try
    {
      if (!o) {
        q.execute(paramNamedRunnable);
      }
      return;
    }
    finally
    {
      paramNamedRunnable = finally;
      throw paramNamedRunnable;
    }
  }
  
  public final Http2Stream I(int paramInt)
  {
    try
    {
      Http2Stream localHttp2Stream = (Http2Stream)c.remove(Integer.valueOf(paramInt));
      notifyAll();
      return localHttp2Stream;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void M(ErrorCode paramErrorCode)
  {
    synchronized (C)
    {
      try
      {
        if (o) {
          return;
        }
        o = true;
        int i = e;
        C.C(i, paramErrorCode, Util.a);
        return;
      }
      finally {}
    }
  }
  
  public final void Q()
  {
    synchronized (C)
    {
      if (!e)
      {
        if (b)
        {
          localObject1 = Http2Writer.o;
          if (((Logger)localObject1).isLoggable(Level.FINE)) {
            ((Logger)localObject1).fine(Util.l(">> CONNECTION %s", new Object[] { Http2.a.l() }));
          }
          a.write(Http2.a.s());
          a.flush();
        }
        ??? = C;
        Object localObject1 = z;
        try
        {
          if (!e)
          {
            ???.g(0, Integer.bitCount(a) * 6, (byte)4, (byte)0);
            for (int i = 0; i < 10; i++)
            {
              int j;
              if ((1 << i & a) != 0) {
                j = 1;
              } else {
                j = 0;
              }
              if (j != 0)
              {
                if (i == 4) {
                  j = 3;
                } else if (i == 7) {
                  j = 4;
                } else {
                  j = i;
                }
                a.writeShort(j);
                a.writeInt(b[i]);
              }
            }
            a.flush();
            i = z.a();
            if (i != 65535) {
              C.d(0, i - 65535);
            }
            new Thread(D).start();
            return;
          }
          localObject1 = new java/io/IOException;
          ((IOException)localObject1).<init>("closed");
          throw ((Throwable)localObject1);
        }
        finally {}
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("closed");
      throw localIOException;
    }
  }
  
  public final void b0(long paramLong)
  {
    try
    {
      paramLong = x + paramLong;
      x = paramLong;
      if (paramLong >= z.a() / 2)
      {
        i0(0, x);
        x = 0L;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void c0(int paramInt, boolean paramBoolean, f paramf, long paramLong)
  {
    // Byte code:
    //   0: lload 4
    //   2: lstore 6
    //   4: lload 4
    //   6: lconst_0
    //   7: lcmp
    //   8: ifne +15 -> 23
    //   11: aload_0
    //   12: getfield 203	okhttp3/internal/http2/Http2Connection:C	Lokhttp3/internal/http2/Http2Writer;
    //   15: iload_2
    //   16: iload_1
    //   17: aload_3
    //   18: iconst_0
    //   19: invokevirtual 352	okhttp3/internal/http2/Http2Writer:u	(ZILxc/f;I)V
    //   22: return
    //   23: lload 6
    //   25: lconst_0
    //   26: lcmp
    //   27: ifle +168 -> 195
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: getfield 189	okhttp3/internal/http2/Http2Connection:y	J
    //   36: lstore 4
    //   38: lload 4
    //   40: lconst_0
    //   41: lcmp
    //   42: ifgt +39 -> 81
    //   45: aload_0
    //   46: getfield 103	okhttp3/internal/http2/Http2Connection:c	Ljava/util/LinkedHashMap;
    //   49: iload_1
    //   50: invokestatic 223	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   53: invokeinterface 356 2 0
    //   58: ifeq +10 -> 68
    //   61: aload_0
    //   62: invokevirtual 359	java/lang/Object:wait	()V
    //   65: goto -33 -> 32
    //   68: new 336	java/io/IOException
    //   71: astore_3
    //   72: aload_3
    //   73: ldc_w 361
    //   76: invokespecial 340	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   79: aload_3
    //   80: athrow
    //   81: lload 6
    //   83: lload 4
    //   85: invokestatic 367	java/lang/Math:min	(JJ)J
    //   88: l2i
    //   89: aload_0
    //   90: getfield 203	okhttp3/internal/http2/Http2Connection:C	Lokhttp3/internal/http2/Http2Writer;
    //   93: getfield 369	okhttp3/internal/http2/Http2Writer:d	I
    //   96: invokestatic 372	java/lang/Math:min	(II)I
    //   99: istore 8
    //   101: aload_0
    //   102: getfield 189	okhttp3/internal/http2/Http2Connection:y	J
    //   105: lstore 9
    //   107: iload 8
    //   109: i2l
    //   110: lstore 4
    //   112: aload_0
    //   113: lload 9
    //   115: lload 4
    //   117: lsub
    //   118: putfield 189	okhttp3/internal/http2/Http2Connection:y	J
    //   121: aload_0
    //   122: monitorexit
    //   123: lload 6
    //   125: lload 4
    //   127: lsub
    //   128: lstore 6
    //   130: aload_0
    //   131: getfield 203	okhttp3/internal/http2/Http2Connection:C	Lokhttp3/internal/http2/Http2Writer;
    //   134: astore 11
    //   136: iload_2
    //   137: ifeq +16 -> 153
    //   140: lload 6
    //   142: lconst_0
    //   143: lcmp
    //   144: ifne +9 -> 153
    //   147: iconst_1
    //   148: istore 12
    //   150: goto +6 -> 156
    //   153: iconst_0
    //   154: istore 12
    //   156: aload 11
    //   158: iload 12
    //   160: iload_1
    //   161: aload_3
    //   162: iload 8
    //   164: invokevirtual 352	okhttp3/internal/http2/Http2Writer:u	(ZILxc/f;I)V
    //   167: goto -144 -> 23
    //   170: astore_3
    //   171: goto +20 -> 191
    //   174: astore_3
    //   175: invokestatic 376	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   178: invokevirtual 379	java/lang/Thread:interrupt	()V
    //   181: new 381	java/io/InterruptedIOException
    //   184: astore_3
    //   185: aload_3
    //   186: invokespecial 382	java/io/InterruptedIOException:<init>	()V
    //   189: aload_3
    //   190: athrow
    //   191: aload_0
    //   192: monitorexit
    //   193: aload_3
    //   194: athrow
    //   195: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	Http2Connection
    //   0	196	1	paramInt	int
    //   0	196	2	paramBoolean	boolean
    //   0	196	3	paramf	f
    //   0	196	4	paramLong	long
    //   2	139	6	l1	long
    //   99	64	8	i	int
    //   105	9	9	l2	long
    //   134	23	11	localHttp2Writer	Http2Writer
    //   148	11	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   32	38	170	finally
    //   45	65	170	finally
    //   68	81	170	finally
    //   81	107	170	finally
    //   112	123	170	finally
    //   175	191	170	finally
    //   191	193	170	finally
    //   32	38	174	java/lang/InterruptedException
    //   45	65	174	java/lang/InterruptedException
    //   68	81	174	java/lang/InterruptedException
  }
  
  public final void close()
  {
    f(ErrorCode.b, ErrorCode.o);
  }
  
  public final void f(ErrorCode paramErrorCode1, ErrorCode paramErrorCode2)
  {
    Http2Stream[] arrayOfHttp2Stream = null;
    try
    {
      M(paramErrorCode1);
      paramErrorCode1 = null;
    }
    catch (IOException paramErrorCode1) {}
    try
    {
      if (!c.isEmpty())
      {
        arrayOfHttp2Stream = (Http2Stream[])c.values().toArray(new Http2Stream[c.size()]);
        c.clear();
      }
      Object localObject = paramErrorCode1;
      if (arrayOfHttp2Stream != null)
      {
        int i = arrayOfHttp2Stream.length;
        int j = 0;
        for (;;)
        {
          localObject = paramErrorCode1;
          if (j >= i) {
            break;
          }
          localObject = arrayOfHttp2Stream[j];
          try
          {
            ((Http2Stream)localObject).c(paramErrorCode2);
            localObject = paramErrorCode1;
          }
          catch (IOException localIOException)
          {
            localObject = paramErrorCode1;
            if (paramErrorCode1 != null) {
              localObject = localIOException;
            }
          }
          j++;
          paramErrorCode1 = (ErrorCode)localObject;
        }
      }
      try
      {
        C.close();
        paramErrorCode1 = (ErrorCode)localObject;
      }
      catch (IOException paramErrorCode2)
      {
        paramErrorCode1 = (ErrorCode)localObject;
        if (localObject == null) {
          paramErrorCode1 = paramErrorCode2;
        }
      }
      try
      {
        B.close();
      }
      catch (IOException paramErrorCode1) {}
      p.shutdown();
      q.shutdown();
      if (paramErrorCode1 == null) {
        return;
      }
      throw paramErrorCode1;
    }
    finally {}
  }
  
  public final void flush()
  {
    synchronized (C)
    {
      if (!e)
      {
        a.flush();
        return;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("closed");
      throw localIOException;
    }
  }
  
  public final void g()
  {
    try
    {
      ErrorCode localErrorCode = ErrorCode.c;
      f(localErrorCode, localErrorCode);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final void h0(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = p;
      NamedRunnable local1 = new okhttp3/internal/http2/Http2Connection$1;
      local1.<init>(this, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramErrorCode);
      localScheduledThreadPoolExecutor.execute(local1);
      return;
    }
    catch (RejectedExecutionException paramErrorCode)
    {
      for (;;) {}
    }
  }
  
  public final void i0(int paramInt, long paramLong)
  {
    try
    {
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = p;
      NamedRunnable local2 = new okhttp3/internal/http2/Http2Connection$2;
      local2.<init>(this, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramLong);
      localScheduledThreadPoolExecutor.execute(local2);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;) {}
    }
  }
  
  public static class Builder
  {
    public Socket a;
    public String b;
    public h c;
    public g d;
    public Http2Connection.Listener e = Http2Connection.Listener.a;
    public PushObserver f = PushObserver.a;
    public boolean g = true;
    public int h;
  }
  
  public final class IntervalPingRunnable
    extends NamedRunnable
  {
    public IntervalPingRunnable()
    {
      super(new Object[] { d });
    }
    
    public final void k()
    {
      synchronized (Http2Connection.this)
      {
        Http2Connection localHttp2Connection2 = Http2Connection.this;
        long l1 = t;
        long l2 = s;
        int i;
        if (l1 < l2)
        {
          i = 1;
        }
        else
        {
          s = (l2 + 1L);
          i = 0;
        }
        if (i != 0) {
          localHttp2Connection2.g();
        } else {
          try
          {
            C.e(1, 0, false);
          }
          catch (IOException localIOException)
          {
            localHttp2Connection2.g();
          }
        }
        return;
      }
    }
  }
  
  public static abstract class Listener
  {
    public static final Listener a = new Listener()
    {
      public final void b(Http2Stream paramAnonymousHttp2Stream)
      {
        paramAnonymousHttp2Stream.c(ErrorCode.f);
      }
    };
    
    public void a(Http2Connection paramHttp2Connection) {}
    
    public abstract void b(Http2Stream paramHttp2Stream);
  }
  
  public final class PingRunnable
    extends NamedRunnable
  {
    public final boolean b = true;
    public final int c;
    public final int d;
    
    public PingRunnable(int paramInt1, int paramInt2)
    {
      super(new Object[] { d, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      c = paramInt1;
      d = paramInt2;
    }
    
    public final void k()
    {
      Http2Connection localHttp2Connection = Http2Connection.this;
      boolean bool = b;
      int i = c;
      int j = d;
      localHttp2Connection.getClass();
      try
      {
        C.e(i, j, bool);
      }
      catch (IOException localIOException)
      {
        localHttp2Connection.g();
      }
    }
  }
  
  public class ReaderRunnable
    extends NamedRunnable
    implements Http2Reader.Handler
  {
    public final Http2Reader b;
    
    public ReaderRunnable(Http2Reader paramHttp2Reader)
    {
      super(new Object[] { d });
      b = paramHttp2Reader;
    }
    
    public final void a() {}
    
    public final void b(int paramInt1, int paramInt2, h paramh, boolean paramBoolean)
    {
      getClass();
      int i;
      if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject1 = Http2Connection.this;
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
      Object localObject2 = C(paramInt1);
      if (localObject2 == null)
      {
        h0(paramInt1, ErrorCode.c);
        localObject2 = Http2Connection.this;
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
      Http2Connection localHttp2Connection1 = Http2Connection.this;
      if (paramInt == 0)
      {
        try
        {
          Http2Connection localHttp2Connection2 = Http2Connection.this;
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
        localObject1 = Http2Connection.this;
        if (paramInt1 == 1) {}
        try
        {
          localHttp2Connection1 = Http2Connection.this;
          t += 1L;
        }
        finally
        {
          Http2Connection localHttp2Connection1;
          break label101;
        }
        if (paramInt1 == 2)
        {
          localHttp2Connection1 = Http2Connection.this;
          v += 1L;
        }
        else if (paramInt1 == 3)
        {
          localHttp2Connection1 = Http2Connection.this;
          localHttp2Connection1.getClass();
          localHttp2Connection1.notifyAll();
        }
        break label141;
        label101:
        throw ((Throwable)localObject2);
      }
      try
      {
        Http2Connection localHttp2Connection2 = Http2Connection.this;
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
        Http2Connection localHttp2Connection = Http2Connection.this;
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
      getClass();
      int i;
      if ((paramInt != 0) && ((paramInt & 0x1) == 0)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject = Http2Connection.this;
        ((Http2Connection)localObject).H(new Http2Connection.7((Http2Connection)localObject, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramErrorCode));
        return;
      }
      Object localObject = I(paramInt);
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
      synchronized (Http2Connection.this)
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
      synchronized (Http2Connection.this)
      {
        parami = (Http2Stream[])c.values().toArray(new Http2Stream[c.size()]);
        o = true;
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
            I(c);
          }
          finally {}
        }
        return;
      }
    }
    
    public final void j(int paramInt, ArrayList paramArrayList, boolean paramBoolean)
    {
      getClass();
      int i;
      if ((paramInt != 0) && ((paramInt & 0x1) == 0)) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject1;
      if (i != 0)
      {
        localObject1 = Http2Connection.this;
        localObject1.getClass();
      }
      try
      {
        ??? = new okhttp3/internal/http2/Http2Connection$5;
        ((Http2Connection.5)???).<init>((Http2Connection)localObject1, new Object[] { d, Integer.valueOf(paramInt) }, paramInt, paramArrayList, paramBoolean);
        ((Http2Connection)localObject1).H((NamedRunnable)???);
        return;
        boolean bool;
        synchronized (Http2Connection.this)
        {
          localObject1 = C(paramInt);
          if (localObject1 == null)
          {
            localObject1 = Http2Connection.this;
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
            paramArrayList.<init>(paramInt, Http2Connection.this, false, paramBoolean, (Headers)localObject1);
            localObject1 = Http2Connection.this;
            e = paramInt;
            c.put(Integer.valueOf(paramInt), paramArrayList);
            localObject1 = Http2Connection.F;
            Http2Connection.ReaderRunnable.1 local1 = new okhttp3/internal/http2/Http2Connection$ReaderRunnable$1;
            local1.<init>(this, new Object[] { d, Integer.valueOf(paramInt) }, paramArrayList);
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
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */