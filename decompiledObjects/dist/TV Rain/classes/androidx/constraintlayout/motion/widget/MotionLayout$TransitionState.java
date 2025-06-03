package androidx.constraintlayout.motion.widget;

 enum MotionLayout$TransitionState
{
  static
  {
    SETUP = new TransitionState("SETUP", 1);
    MOVING = new TransitionState("MOVING", 2);
    FINISHED = new TransitionState("FINISHED", 3);
  }
  
  private MotionLayout$TransitionState() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.TransitionState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */