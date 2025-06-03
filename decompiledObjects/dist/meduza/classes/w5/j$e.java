package w5;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import v5.e0;
import v5.m;

public final class j$e
  implements Choreographer.FrameCallback, Handler.Callback
{
  public static final e e = new e();
  public volatile long a = -9223372036854775807L;
  public final Handler b;
  public Choreographer c;
  public int d;
  
  public j$e()
  {
    Object localObject = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
    ((Thread)localObject).start();
    localObject = ((HandlerThread)localObject).getLooper();
    int i = e0.a;
    localObject = new Handler((Looper)localObject, this);
    b = ((Handler)localObject);
    ((Handler)localObject).sendEmptyMessage(0);
  }
  
  public final void doFrame(long paramLong)
  {
    a = paramLong;
    Choreographer localChoreographer = c;
    localChoreographer.getClass();
    localChoreographer.postFrameCallbackDelayed(this, 500L);
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
        paramMessage = c;
        if (paramMessage != null)
        {
          i = d - 1;
          d = i;
          if (i == 0)
          {
            paramMessage.removeFrameCallback(this);
            a = -9223372036854775807L;
          }
        }
        return true;
      }
      paramMessage = c;
      if (paramMessage != null)
      {
        i = d + 1;
        d = i;
        if (i == 1) {
          paramMessage.postFrameCallback(this);
        }
      }
      return true;
    }
    try
    {
      c = Choreographer.getInstance();
    }
    catch (RuntimeException paramMessage)
    {
      m.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", paramMessage);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     w5.j.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */