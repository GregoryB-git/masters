package io.flutter.view;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate;

class VsyncWaiter$1
  implements FlutterJNI.AsyncWaitForVsyncDelegate
{
  public VsyncWaiter$1(VsyncWaiter paramVsyncWaiter) {}
  
  private Choreographer.FrameCallback obtainFrameCallback(long paramLong)
  {
    if (VsyncWaiter.access$200(this$0) != null)
    {
      VsyncWaiter.FrameCallback.access$302(VsyncWaiter.access$200(this$0), paramLong);
      VsyncWaiter.FrameCallback localFrameCallback = VsyncWaiter.access$200(this$0);
      VsyncWaiter.access$202(this$0, null);
      return localFrameCallback;
    }
    return new VsyncWaiter.FrameCallback(this$0, paramLong);
  }
  
  public void asyncWaitForVsync(long paramLong)
  {
    Choreographer.getInstance().postFrameCallback(obtainFrameCallback(paramLong));
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.VsyncWaiter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */