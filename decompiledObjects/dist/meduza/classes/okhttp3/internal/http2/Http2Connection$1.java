package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.NamedRunnable;

class Http2Connection$1
  extends NamedRunnable
{
  public Http2Connection$1(Http2Connection paramHttp2Connection, Object[] paramArrayOfObject, int paramInt, ErrorCode paramVarArgs)
  {
    super("OkHttp %s stream %d", paramArrayOfObject);
  }
  
  public final void k()
  {
    try
    {
      localObject = d;
      int i = b;
      ErrorCode localErrorCode = c;
      C.I(i, localErrorCode);
    }
    catch (IOException localIOException)
    {
      Http2Connection localHttp2Connection = d;
      Object localObject = Http2Connection.F;
      localHttp2Connection.g();
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */