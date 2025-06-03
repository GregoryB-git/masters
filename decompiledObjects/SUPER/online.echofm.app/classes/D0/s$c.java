package D0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import g0.M;
import g0.a;
import g0.o;

public final class s$c
  implements Choreographer.FrameCallback, Handler.Callback
{
  public static final c t = new c();
  public volatile long o = -9223372036854775807L;
  public final Handler p;
  public final HandlerThread q;
  public Choreographer r;
  public int s;
  
  public s$c()
  {
    Object localObject = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
    q = ((HandlerThread)localObject);
    ((Thread)localObject).start();
    localObject = M.z(((HandlerThread)localObject).getLooper(), this);
    p = ((Handler)localObject);
    ((Handler)localObject).sendEmptyMessage(1);
  }
  
  public static c d()
  {
    return t;
  }
  
  public void a()
  {
    p.sendEmptyMessage(2);
  }
  
  public final void b()
  {
    Choreographer localChoreographer = r;
    if (localChoreographer != null)
    {
      int i = s + 1;
      s = i;
      if (i == 1) {
        localChoreographer.postFrameCallback(this);
      }
    }
  }
  
  public final void c()
  {
    try
    {
      r = Choreographer.getInstance();
    }
    catch (RuntimeException localRuntimeException)
    {
      o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", localRuntimeException);
    }
  }
  
  public void doFrame(long paramLong)
  {
    o = paramLong;
    ((Choreographer)a.e(r)).postFrameCallbackDelayed(this, 500L);
  }
  
  public void e()
  {
    p.sendEmptyMessage(3);
  }
  
  public final void f()
  {
    Choreographer localChoreographer = r;
    if (localChoreographer != null)
    {
      int i = s - 1;
      s = i;
      if (i == 0)
      {
        localChoreographer.removeFrameCallback(this);
        o = -9223372036854775807L;
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return false;
        }
        f();
        return true;
      }
      b();
      return true;
    }
    c();
    return true;
  }
}

/* Location:
 * Qualified Name:     D0.s.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */