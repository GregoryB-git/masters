package okhttp3.internal.http2;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.internal.NamedRunnable;

class Http2Connection$2
  extends NamedRunnable
{
  public Http2Connection$2(Http2Connection paramHttp2Connection, Object[] paramArrayOfObject, int paramInt, long paramVarArgs)
  {
    super("OkHttp Window Update %s stream %d", paramArrayOfObject);
  }
  
  public final void k()
  {
    try
    {
      d.C.d(b, c);
    }
    catch (IOException localIOException)
    {
      Http2Connection localHttp2Connection = d;
      ThreadPoolExecutor localThreadPoolExecutor = Http2Connection.F;
      localHttp2Connection.g();
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */