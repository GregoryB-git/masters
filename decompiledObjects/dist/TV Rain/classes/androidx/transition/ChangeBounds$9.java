package androidx.transition;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

class ChangeBounds$9
  extends TransitionListenerAdapter
{
  public boolean mCanceled = false;
  
  public ChangeBounds$9(ChangeBounds paramChangeBounds, ViewGroup paramViewGroup) {}
  
  public void onTransitionCancel(@NonNull Transition paramTransition)
  {
    ViewGroupUtils.suppressLayout(val$parent, false);
    mCanceled = true;
  }
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    if (!mCanceled) {
      ViewGroupUtils.suppressLayout(val$parent, false);
    }
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition)
  {
    ViewGroupUtils.suppressLayout(val$parent, false);
  }
  
  public void onTransitionResume(@NonNull Transition paramTransition)
  {
    ViewGroupUtils.suppressLayout(val$parent, true);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */