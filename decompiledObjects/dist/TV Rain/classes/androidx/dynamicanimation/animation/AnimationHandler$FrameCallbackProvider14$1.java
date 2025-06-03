package androidx.dynamicanimation.animation;

import android.os.SystemClock;

class AnimationHandler$FrameCallbackProvider14$1
  implements Runnable
{
  public AnimationHandler$FrameCallbackProvider14$1(AnimationHandler.FrameCallbackProvider14 paramFrameCallbackProvider14) {}
  
  public void run()
  {
    this$0.mLastFrameTime = SystemClock.uptimeMillis();
    this$0.mDispatcher.dispatchAnimationFrame();
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider14.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */