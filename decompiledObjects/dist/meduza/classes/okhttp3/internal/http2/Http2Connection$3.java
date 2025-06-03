package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;

class Http2Connection$3
  extends NamedRunnable
{
  public Http2Connection$3(Http2Connection paramHttp2Connection, Object... paramVarArgs)
  {
    super("OkHttp %s ping", paramVarArgs);
  }
  
  public final void k()
  {
    Http2Connection localHttp2Connection = b;
    localHttp2Connection.getClass();
    try
    {
      C.e(2, 0, false);
    }
    catch (IOException localIOException)
    {
      localHttp2Connection.g();
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */