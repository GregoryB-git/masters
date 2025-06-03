package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import java.util.ArrayList;

class AnimationHandler$AnimationCallbackDispatcher
{
  public AnimationHandler$AnimationCallbackDispatcher(AnimationHandler paramAnimationHandler) {}
  
  public void dispatchAnimationFrame()
  {
    this$0.mCurrentFrameTime = SystemClock.uptimeMillis();
    AnimationHandler localAnimationHandler = this$0;
    localAnimationHandler.doAnimationFrame(mCurrentFrameTime);
    if (this$0.mAnimationCallbacks.size() > 0) {
      this$0.getProvider().postFrameCallback();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */