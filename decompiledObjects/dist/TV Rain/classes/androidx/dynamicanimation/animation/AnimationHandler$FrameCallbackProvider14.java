package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

class AnimationHandler$FrameCallbackProvider14
  extends AnimationHandler.AnimationFrameCallbackProvider
{
  private final Handler mHandler = new Handler(Looper.myLooper());
  public long mLastFrameTime = -1L;
  private final Runnable mRunnable = new Runnable()
  {
    public void run()
    {
      mLastFrameTime = SystemClock.uptimeMillis();
      mDispatcher.dispatchAnimationFrame();
    }
  };
  
  public AnimationHandler$FrameCallbackProvider14(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
  {
    super(paramAnimationCallbackDispatcher);
  }
  
  public void postFrameCallback()
  {
    long l = Math.max(10L - (SystemClock.uptimeMillis() - mLastFrameTime), 0L);
    mHandler.postDelayed(mRunnable, l);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */