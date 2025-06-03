package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;

final class Http2Connection$IntervalPingRunnable
  extends NamedRunnable
{
  public Http2Connection$IntervalPingRunnable(Http2Connection paramHttp2Connection)
  {
    super("OkHttp %s ping", new Object[] { d });
  }
  
  public final void k()
  {
    synchronized (b)
    {
      Http2Connection localHttp2Connection2 = b;
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

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.IntervalPingRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */