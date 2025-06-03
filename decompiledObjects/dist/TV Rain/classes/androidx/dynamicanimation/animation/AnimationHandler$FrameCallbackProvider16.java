package androidx.dynamicanimation.animation;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class AnimationHandler$FrameCallbackProvider16
  extends AnimationHandler.AnimationFrameCallbackProvider
{
  private final Choreographer mChoreographer = Choreographer.getInstance();
  private final Choreographer.FrameCallback mChoreographerCallback = new Choreographer.FrameCallback()
  {
    public void doFrame(long paramAnonymousLong)
    {
      mDispatcher.dispatchAnimationFrame();
    }
  };
  
  public AnimationHandler$FrameCallbackProvider16(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
  {
    super(paramAnimationCallbackDispatcher);
  }
  
  public void postFrameCallback()
  {
    mChoreographer.postFrameCallback(mChoreographerCallback);
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */