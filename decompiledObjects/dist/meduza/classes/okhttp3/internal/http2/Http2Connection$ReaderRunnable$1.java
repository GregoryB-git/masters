package okhttp3.internal.http2;

import f;
import java.io.IOException;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.platform.Platform;

class Http2Connection$ReaderRunnable$1
  extends NamedRunnable
{
  public Http2Connection$ReaderRunnable$1(Http2Connection.ReaderRunnable paramReaderRunnable, Object[] paramArrayOfObject, Http2Stream paramVarArgs)
  {
    super("OkHttp %s stream %d", paramArrayOfObject);
  }
  
  public final void k()
  {
    try
    {
      c.c.b.b(b);
    }
    catch (IOException localIOException1)
    {
      Platform localPlatform = Platform.a;
      StringBuilder localStringBuilder = f.l("Http2Connection.Listener failure for ");
      localStringBuilder.append(c.c.d);
      localPlatform.l(4, localStringBuilder.toString(), localIOException1);
    }
    try
    {
      b.c(ErrorCode.c);
      return;
    }
    catch (IOException localIOException2)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.ReaderRunnable.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */