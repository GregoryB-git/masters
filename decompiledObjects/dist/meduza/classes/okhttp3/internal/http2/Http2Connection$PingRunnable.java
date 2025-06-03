package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;

final class Http2Connection$PingRunnable
  extends NamedRunnable
{
  public final boolean b = true;
  public final int c;
  public final int d;
  
  public Http2Connection$PingRunnable(Http2Connection paramHttp2Connection, int paramInt1, int paramInt2)
  {
    super("OkHttp %s ping %08x%08x", new Object[] { d, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    c = paramInt1;
    d = paramInt2;
  }
  
  public final void k()
  {
    Http2Connection localHttp2Connection = e;
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

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.PingRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */