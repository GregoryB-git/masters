package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class FragmentManager$7
  extends AnimatorListenerAdapter
{
  public FragmentManager$7(FragmentManager paramFragmentManager, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$container.endViewTransition(val$animatingView);
    paramAnimator.removeListener(this);
    paramAnimator = val$fragment;
    View localView = mView;
    if ((localView != null) && (mHidden)) {
      localView.setVisibility(8);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */