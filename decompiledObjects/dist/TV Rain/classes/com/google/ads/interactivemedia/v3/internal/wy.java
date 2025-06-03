package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

final class wy
  implements Handler.Callback, Choreographer.FrameCallback
{
  private static final wy b = new wy();
  public volatile long a = -9223372036854775807L;
  private final Handler c;
  private final HandlerThread d;
  private Choreographer e;
  private int f;
  
  private wy()
  {
    Object localObject = new HandlerThread("ChoreographerOwner:Handler");
    d = ((HandlerThread)localObject);
    ((Thread)localObject).start();
    localObject = wl.a(((HandlerThread)localObject).getLooper(), this);
    c = ((Handler)localObject);
    ((Handler)localObject).sendEmptyMessage(0);
  }
  
  public static wy a()
  {
    return b;
  }
  
  public final void b()
  {
    c.sendEmptyMessage(1);
  }
  
  public final void c()
  {
    c.sendEmptyMessage(2);
  }
  
  public final void doFrame(long paramLong)
  {
    a = paramLong;
    e.postFrameCallbackDelayed(this, 500L);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        i = f - 1;
        f = i;
        if (i == 0)
        {
          e.removeFrameCallback(this);
          a = -9223372036854775807L;
        }
        return true;
      }
      i = f + 1;
      f = i;
      if (i == 1) {
        e.postFrameCallback(this);
      }
      return true;
    }
    e = Choreographer.getInstance();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */