package androidx.core.widget;

import androidx.core.view.ViewCompat;

class AutoScrollHelper$ScrollAnimationRunnable
  implements Runnable
{
  public AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper paramAutoScrollHelper) {}
  
  public void run()
  {
    Object localObject = this$0;
    if (!mAnimating) {
      return;
    }
    if (mNeedsReset)
    {
      mNeedsReset = false;
      mScroller.start();
    }
    localObject = this$0.mScroller;
    if ((!((AutoScrollHelper.ClampedScroller)localObject).isFinished()) && (this$0.shouldAnimate()))
    {
      AutoScrollHelper localAutoScrollHelper = this$0;
      if (mNeedsCancel)
      {
        mNeedsCancel = false;
        localAutoScrollHelper.cancelTargetTouch();
      }
      ((AutoScrollHelper.ClampedScroller)localObject).computeScrollDelta();
      int i = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaX();
      int j = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaY();
      this$0.scrollTargetBy(i, j);
      ViewCompat.postOnAnimation(this$0.mTarget, this);
      return;
    }
    this$0.mAnimating = false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */