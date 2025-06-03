package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class Visibility$DisappearListener
  extends AnimatorListenerAdapter
  implements Transition.TransitionListener, AnimatorUtils.AnimatorPauseListenerCompat
{
  public boolean mCanceled = false;
  private final int mFinalVisibility;
  private boolean mLayoutSuppressed;
  private final ViewGroup mParent;
  private final boolean mSuppressLayout;
  private final View mView;
  
  public Visibility$DisappearListener(View paramView, int paramInt, boolean paramBoolean)
  {
    mView = paramView;
    mFinalVisibility = paramInt;
    mParent = ((ViewGroup)paramView.getParent());
    mSuppressLayout = paramBoolean;
    suppressLayout(true);
  }
  
  private void hideViewWhenNotCanceled()
  {
    if (!mCanceled)
    {
      ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
      ViewGroup localViewGroup = mParent;
      if (localViewGroup != null) {
        localViewGroup.invalidate();
      }
    }
    suppressLayout(false);
  }
  
  private void suppressLayout(boolean paramBoolean)
  {
    if ((mSuppressLayout) && (mLayoutSuppressed != paramBoolean))
    {
      ViewGroup localViewGroup = mParent;
      if (localViewGroup != null)
      {
        mLayoutSuppressed = paramBoolean;
        ViewGroupUtils.suppressLayout(localViewGroup, paramBoolean);
      }
    }
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    mCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    hideViewWhenNotCanceled();
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    if (!mCanceled) {
      ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
    }
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationResume(Animator paramAnimator)
  {
    if (!mCanceled) {
      ViewUtils.setTransitionVisibility(mView, 0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void onTransitionCancel(@NonNull Transition paramTransition) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    hideViewWhenNotCanceled();
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition)
  {
    suppressLayout(false);
  }
  
  public void onTransitionResume(@NonNull Transition paramTransition)
  {
    suppressLayout(true);
  }
  
  public void onTransitionStart(@NonNull Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     androidx.transition.Visibility.DisappearListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */