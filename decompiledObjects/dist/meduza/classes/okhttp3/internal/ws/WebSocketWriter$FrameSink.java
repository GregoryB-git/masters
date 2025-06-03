package okhttp3.internal.ws;

import java.io.IOException;
import xc.f;
import xc.w;
import xc.z;

final class WebSocketWriter$FrameSink
  implements w
{
  public boolean a;
  public boolean b;
  
  public final z c()
  {
    throw null;
  }
  
  public final void close()
  {
    if (!b) {
      throw null;
    }
    throw new IOException("closed");
  }
  
  public final void flush()
  {
    if (!b) {
      throw null;
    }
    throw new IOException("closed");
  }
  
  public final void g0(f paramf, long paramLong)
  {
    if (!b) {
      throw null;
    }
    throw new IOException("closed");
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.ws.WebSocketWriter.FrameSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */