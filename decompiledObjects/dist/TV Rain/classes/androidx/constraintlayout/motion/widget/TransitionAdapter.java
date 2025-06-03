package androidx.constraintlayout.motion.widget;

public abstract class TransitionAdapter
  implements MotionLayout.TransitionListener
{
  public void onTransitionChange(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat) {}
  
  public void onTransitionCompleted(MotionLayout paramMotionLayout, int paramInt) {}
  
  public void onTransitionStarted(MotionLayout paramMotionLayout, int paramInt1, int paramInt2) {}
  
  public void onTransitionTrigger(MotionLayout paramMotionLayout, int paramInt, boolean paramBoolean, float paramFloat) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.TransitionAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */