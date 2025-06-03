package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.WebSocket;

public final class RealWebSocket
  implements WebSocket, WebSocketReader.FrameCallback
{
  public static final List<Protocol> a = Collections.singletonList(Protocol.c);
  
  public final class CancelRunnable
    implements Runnable
  {
    public final void run()
    {
      throw null;
    }
  }
  
  public static final class Close {}
  
  public static final class Message {}
  
  public final class PingRunnable
    implements Runnable
  {
    public final void run()
    {
      throw null;
    }
  }
  
  public static abstract class Streams
    implements Closeable
  {}
}

/* Location:
 * Qualified Name:     okhttp3.internal.ws.RealWebSocket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */