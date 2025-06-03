package pc;

import d2.h0;
import dc.l;
import rb.h;
import x6.b;

public final class e
{
  public static final k<Object> a = new k(-1L, null, null, 0);
  public static final int b = b.w0("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
  public static final int c = b.w0("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
  public static final h0 d = new h0("BUFFERED", 9);
  public static final h0 e = new h0("SHOULD_BUFFER", 9);
  public static final h0 f = new h0("S_RESUMING_BY_RCV", 9);
  public static final h0 g = new h0("RESUMING_BY_EB", 9);
  public static final h0 h = new h0("POISONED", 9);
  public static final h0 i = new h0("DONE_RCV", 9);
  public static final h0 j = new h0("INTERRUPTED_SEND", 9);
  public static final h0 k = new h0("INTERRUPTED_RCV", 9);
  public static final h0 l = new h0("CHANNEL_CLOSED", 9);
  public static final h0 m = new h0("SUSPEND", 9);
  public static final h0 n = new h0("SUSPEND_NO_WAITER", 9);
  public static final h0 o = new h0("FAILED", 9);
  public static final h0 p = new h0("NO_RECEIVE_RESULT", 9);
  public static final h0 q = new h0("CLOSE_HANDLER_CLOSED", 9);
  public static final h0 r = new h0("CLOSE_HANDLER_INVOKED", 9);
  public static final h0 s = new h0("NO_CLOSE_CAUSE", 9);
  
  public static final <T> boolean a(nc.k<? super T> paramk, T paramT, l<? super Throwable, h> paraml)
  {
    paramT = paramk.j(paramT, paraml);
    boolean bool;
    if (paramT != null)
    {
      paramk.n(paramT);
      bool = true;
    }
    else
    {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     pc.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */