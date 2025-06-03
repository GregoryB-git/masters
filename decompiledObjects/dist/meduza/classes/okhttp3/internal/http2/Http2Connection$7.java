package okhttp3.internal.http2;

import java.util.Set;
import okhttp3.internal.NamedRunnable;

class Http2Connection$7
  extends NamedRunnable
{
  public Http2Connection$7(Http2Connection paramHttp2Connection, Object[] paramArrayOfObject, int paramInt, ErrorCode paramVarArgs)
  {
    super("OkHttp %s Push Reset[%s]", paramArrayOfObject);
  }
  
  public final void k()
  {
    c.r.getClass();
    synchronized (c)
    {
      c.E.remove(Integer.valueOf(b));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */