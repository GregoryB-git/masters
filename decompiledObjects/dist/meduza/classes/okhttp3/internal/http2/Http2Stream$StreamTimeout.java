package okhttp3.internal.http2;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import xc.c;

class Http2Stream$StreamTimeout
  extends c
{
  public Http2Stream$StreamTimeout(Http2Stream paramHttp2Stream) {}
  
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
    ??? = m;
    Object localObject2 = ErrorCode.o;
    if (((Http2Stream)???).d((ErrorCode)localObject2)) {
      d.h0(c, (ErrorCode)localObject2);
    }
    synchronized (m.d)
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

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Stream.StreamTimeout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */