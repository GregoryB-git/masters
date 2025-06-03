package androidx.dynamicanimation.animation;

abstract class AnimationHandler$AnimationFrameCallbackProvider
{
  public final AnimationHandler.AnimationCallbackDispatcher mDispatcher;
  
  public AnimationHandler$AnimationFrameCallbackProvider(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
  {
    mDispatcher = paramAnimationCallbackDispatcher;
  }
  
  public abstract void postFrameCallback();
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */