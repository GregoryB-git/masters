package r6;

import g6.p;
import kotlin.jvm.internal.j;
import m6.e;
import u6.F;
import u6.G;

public abstract class c
{
  public static final i a = new i(-1L, null, null, 0);
  public static final int b = G.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
  public static final int c = G.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
  public static final F d = new F("BUFFERED");
  public static final F e = new F("SHOULD_BUFFER");
  public static final F f = new F("S_RESUMING_BY_RCV");
  public static final F g = new F("RESUMING_BY_EB");
  public static final F h = new F("POISONED");
  public static final F i = new F("DONE_RCV");
  public static final F j = new F("INTERRUPTED_SEND");
  public static final F k = new F("INTERRUPTED_RCV");
  public static final F l = new F("CHANNEL_CLOSED");
  public static final F m = new F("SUSPEND");
  public static final F n = new F("SUSPEND_NO_WAITER");
  public static final F o = new F("FAILED");
  public static final F p = new F("NO_RECEIVE_RESULT");
  public static final F q = new F("CLOSE_HANDLER_CLOSED");
  public static final F r = new F("CLOSE_HANDLER_INVOKED");
  public static final F s = new F("NO_CLOSE_CAUSE");
  
  public static final long A(int paramInt)
  {
    long l1;
    if (paramInt != 0)
    {
      if (paramInt != Integer.MAX_VALUE) {
        l1 = paramInt;
      } else {
        l1 = Long.MAX_VALUE;
      }
    }
    else {
      l1 = 0L;
    }
    return l1;
  }
  
  public static final boolean B(p6.l paraml, Object paramObject, g6.l paraml1)
  {
    paramObject = paraml.g(paramObject, null, paraml1);
    boolean bool;
    if (paramObject != null)
    {
      paraml.p(paramObject);
      bool = true;
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static final long v(long paramLong, boolean paramBoolean)
  {
    long l1;
    if (paramBoolean) {
      l1 = 4611686018427387904L;
    } else {
      l1 = 0L;
    }
    return l1 + paramLong;
  }
  
  public static final long w(long paramLong, int paramInt)
  {
    return (paramInt << 60) + paramLong;
  }
  
  public static final i x(long paramLong, i parami)
  {
    return new i(paramLong, parami, parami.u(), 0);
  }
  
  public static final e y()
  {
    return a.o;
  }
  
  public static final F z()
  {
    return l;
  }
}

/* Location:
 * Qualified Name:     r6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */