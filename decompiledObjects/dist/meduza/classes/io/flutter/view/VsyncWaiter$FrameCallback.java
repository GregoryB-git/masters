package io.flutter.view;

import android.view.Choreographer.FrameCallback;
import io.flutter.embedding.engine.FlutterJNI;

class VsyncWaiter$FrameCallback
  implements Choreographer.FrameCallback
{
  private long cookie;
  
  public VsyncWaiter$FrameCallback(VsyncWaiter paramVsyncWaiter, long paramLong)
  {
    cookie = paramLong;
  }
  
  public void doFrame(long paramLong)
  {
    paramLong = System.nanoTime() - paramLong;
    if (paramLong < 0L) {
      paramLong = 0L;
    }
    VsyncWaiter.access$100(this$0).onVsync(paramLong, VsyncWaiter.access$000(this$0), cookie);
    VsyncWaiter.access$202(this$0, this);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.VsyncWaiter.FrameCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */