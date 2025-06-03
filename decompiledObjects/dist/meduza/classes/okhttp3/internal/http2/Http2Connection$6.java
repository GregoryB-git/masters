package okhttp3.internal.http2;

import java.io.IOException;
import java.util.Set;
import okhttp3.internal.NamedRunnable;
import xc.f;

class Http2Connection$6
  extends NamedRunnable
{
  public Http2Connection$6(Http2Connection paramHttp2Connection, Object[] paramArrayOfObject, int paramInt1, f paramf, int paramInt2, boolean paramVarArgs)
  {
    super("OkHttp %s Push Data[%s]", paramArrayOfObject);
  }
  
  public final void k()
  {
    try
    {
      PushObserver localPushObserver = e.r;
      ??? = c;
      int i = d;
      ((PushObserver.1)localPushObserver).getClass();
      ((f)???).skip(i);
      e.C.I(b, ErrorCode.o);
      synchronized (e)
      {
        e.E.remove(Integer.valueOf(b));
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
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */