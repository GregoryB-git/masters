package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import okhttp3.internal.NamedRunnable;

class Http2Connection$5
  extends NamedRunnable
{
  public Http2Connection$5(Http2Connection paramHttp2Connection, Object[] paramArrayOfObject, int paramInt, ArrayList paramArrayList, boolean paramVarArgs)
  {
    super("OkHttp %s Push Headers[%s]", paramArrayOfObject);
  }
  
  public final void k()
  {
    ((PushObserver.1)d.r).getClass();
    try
    {
      d.C.I(b, ErrorCode.o);
      synchronized (d)
      {
        d.E.remove(Integer.valueOf(b));
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */