package okhttp3.internal.http2;

import a0.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.Headers;
import xc.c;
import xc.f;
import xc.w;
import xc.y;
import xc.z;

public final class Http2Stream
{
  public long a = 0L;
  public long b;
  public final int c;
  public final Http2Connection d;
  public final ArrayDeque e;
  public boolean f;
  public final FramingSource g;
  public final FramingSink h;
  public final StreamTimeout i;
  public final StreamTimeout j;
  public ErrorCode k;
  
  public Http2Stream(int paramInt, Http2Connection paramHttp2Connection, boolean paramBoolean1, boolean paramBoolean2, Headers paramHeaders)
  {
    ArrayDeque localArrayDeque = new ArrayDeque();
    e = localArrayDeque;
    i = new StreamTimeout();
    j = new StreamTimeout();
    k = null;
    if (paramHttp2Connection != null)
    {
      c = paramInt;
      d = paramHttp2Connection;
      b = A.a();
      paramHttp2Connection = new FramingSource(z.a());
      g = paramHttp2Connection;
      FramingSink localFramingSink = new FramingSink();
      h = localFramingSink;
      e = paramBoolean2;
      c = paramBoolean1;
      if (paramHeaders != null) {
        localArrayDeque.add(paramHeaders);
      }
      if ((e()) && (paramHeaders != null)) {
        throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
      }
      if ((!e()) && (paramHeaders == null)) {
        throw new IllegalStateException("remotely-initiated streams should have headers");
      }
      return;
    }
    throw new NullPointerException("connection == null");
  }
  
  public final void a()
  {
    try
    {
      Object localObject1 = g;
      if ((!e) && (d))
      {
        localObject1 = h;
        if ((c) || (b))
        {
          m = 1;
          break label47;
        }
      }
      int m = 0;
      label47:
      boolean bool = f();
      if (m != 0) {
        c(ErrorCode.o);
      } else if (!bool) {
        d.I(c);
      }
      return;
    }
    finally {}
  }
  
  public final void b()
  {
    FramingSink localFramingSink = h;
    if (!b)
    {
      if (!c)
      {
        if (k == null) {
          return;
        }
        throw new StreamResetException(k);
      }
      throw new IOException("stream finished");
    }
    throw new IOException("stream closed");
  }
  
  public final void c(ErrorCode paramErrorCode)
  {
    if (!d(paramErrorCode)) {
      return;
    }
    Http2Connection localHttp2Connection = d;
    int m = c;
    C.I(m, paramErrorCode);
  }
  
  public final boolean d(ErrorCode paramErrorCode)
  {
    try
    {
      if (k != null) {
        return false;
      }
      if ((g.e) && (h.c)) {
        return false;
      }
      k = paramErrorCode;
      notifyAll();
      d.I(c);
      return true;
    }
    finally {}
  }
  
  public final boolean e()
  {
    int m = c;
    boolean bool1 = true;
    boolean bool2;
    if ((m & 0x1) == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (d.a == bool2) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final boolean f()
  {
    try
    {
      Object localObject1 = k;
      if (localObject1 != null) {
        return false;
      }
      localObject1 = g;
      if ((e) || (d))
      {
        localObject1 = h;
        if ((c) || (b))
        {
          boolean bool = f;
          if (bool) {
            return false;
          }
        }
      }
      return true;
    }
    finally {}
  }
  
  public final void g()
  {
    try
    {
      wait();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException();
    }
  }
  
  public final class FramingSink
    implements w
  {
    public final f a = new f();
    public boolean b;
    public boolean c;
    
    public FramingSink() {}
    
    public final z c()
    {
      return j;
    }
    
    public final void close()
    {
      synchronized (Http2Stream.this)
      {
        if (b) {
          return;
        }
        ??? = Http2Stream.this;
        if (!h.c)
        {
          if (a.b > 0L) {
            while (a.b > 0L) {
              f(true);
            }
          }
          d.c0(c, true, null, 0L);
        }
        synchronized (Http2Stream.this)
        {
          b = true;
          d.flush();
          a();
          return;
        }
      }
    }
    
    public final void f(boolean paramBoolean)
    {
      synchronized (Http2Stream.this)
      {
        j.h();
        try
        {
          for (;;)
          {
            localObject2 = Http2Stream.this;
            if ((b > 0L) || (c) || (b) || (k != null)) {
              break;
            }
            ((Http2Stream)localObject2).g();
          }
          j.l();
          b();
          long l = Math.min(b, a.b);
          Object localObject2 = Http2Stream.this;
          b -= l;
          j.h();
          try
          {
            ??? = Http2Stream.this;
            localObject2 = d;
            int i = c;
            if ((paramBoolean) && (l == a.b)) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            }
            ((Http2Connection)localObject2).c0(i, paramBoolean, a, l);
            return;
          }
          finally
          {
            j.l();
          }
          localObject4 = finally;
        }
        finally
        {
          j.l();
        }
      }
    }
    
    public final void flush()
    {
      synchronized (Http2Stream.this)
      {
        b();
        while (a.b > 0L)
        {
          f(false);
          d.flush();
        }
        return;
      }
    }
    
    public final void g0(f paramf, long paramLong)
    {
      a.g0(paramf, paramLong);
      while (a.b >= 16384L) {
        f(false);
      }
    }
  }
  
  public final class FramingSource
    implements y
  {
    public final f a = new f();
    public final f b = new f();
    public final long c;
    public boolean d;
    public boolean e;
    
    public FramingSource(long paramLong)
    {
      c = paramLong;
    }
    
    public final z c()
    {
      return i;
    }
    
    public final void close()
    {
      synchronized (Http2Stream.this)
      {
        d = true;
        f localf = b;
        long l = b;
        localf.f();
        if (!e.isEmpty()) {
          getClass();
        }
        notifyAll();
        if (l > 0L) {
          d.b0(l);
        }
        a();
        return;
      }
    }
    
    public final long e0(f paramf, long paramLong)
    {
      if (paramLong >= 0L) {
        for (;;)
        {
          Object localObject1 = null;
          synchronized (Http2Stream.this)
          {
            i.h();
            try
            {
              Http2Stream localHttp2Stream2 = Http2Stream.this;
              Object localObject2 = k;
              if (localObject2 != null) {
                localObject1 = localObject2;
              }
              if (!d)
              {
                if (!e.isEmpty()) {
                  getClass();
                }
                localObject2 = b;
                long l1 = b;
                if (l1 > 0L)
                {
                  l1 = ((f)localObject2).e0(paramf, Math.min(paramLong, l1));
                  paramf = Http2Stream.this;
                  long l2 = a + l1;
                  a = l2;
                  paramLong = l1;
                  if (localObject1 == null)
                  {
                    paramLong = l1;
                    if (l2 >= d.z.a() / 2)
                    {
                      paramf = Http2Stream.this;
                      d.i0(c, a);
                      a = 0L;
                      paramLong = l1;
                    }
                  }
                }
                else
                {
                  if ((!e) && (localObject1 == null))
                  {
                    g();
                    i.l();
                    continue;
                  }
                  paramLong = -1L;
                }
                i.l();
                if (paramLong != -1L)
                {
                  d.b0(paramLong);
                  return paramLong;
                }
                if (localObject1 == null) {
                  return -1L;
                }
                throw new StreamResetException((ErrorCode)localObject1);
              }
              else
              {
                paramf = new java/io/IOException;
                paramf.<init>("stream closed");
                throw paramf;
              }
            }
            finally
            {
              i.l();
            }
          }
        }
      }
      throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
    }
  }
  
  public class StreamTimeout
    extends c
  {
    public StreamTimeout() {}
    
    public final IOException j(IOException paramIOException)
    {
      SocketTimeoutException localSocketTimeoutException = new SocketTimeoutException("timeout");
      if (paramIOException != null) {
        localSocketTimeoutException.initCause(paramIOException);
      }
      return localSocketTimeoutException;
    }
    
    public final void k()
    {
      ??? = Http2Stream.this;
      Object localObject2 = ErrorCode.o;
      if (((Http2Stream)???).d((ErrorCode)localObject2)) {
        d.h0(c, (ErrorCode)localObject2);
      }
      synchronized (d)
      {
        long l1 = v;
        long l2 = u;
        if (l1 >= l2)
        {
          u = (l2 + 1L);
          w = (System.nanoTime() + 1000000000L);
        }
      }
      try
      {
        localObject2 = p;
        Http2Connection.3 local3 = new okhttp3/internal/http2/Http2Connection$3;
        local3.<init>((Http2Connection)???, new Object[] { d });
        ((ScheduledThreadPoolExecutor)localObject2).execute(local3);
        return;
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        for (;;) {}
      }
    }
    
    public final void l()
    {
      if (!i()) {
        return;
      }
      throw j(null);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Stream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */