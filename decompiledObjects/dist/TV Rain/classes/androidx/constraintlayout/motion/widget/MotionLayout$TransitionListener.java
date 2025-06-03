package androidx.constraintlayout.motion.widget;

public abstract interface MotionLayout$TransitionListener
{
  public abstract void onTransitionChange(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat);
  
  public abstract void onTransitionCompleted(MotionLayout paramMotionLayout, int paramInt);
  
  public abstract void onTransitionStarted(MotionLayout paramMotionLayout, int paramInt1, int paramInt2);
  
  public abstract void onTransitionTrigger(MotionLayout paramMotionLayout, int paramInt, boolean paramBoolean, float paramFloat);
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */