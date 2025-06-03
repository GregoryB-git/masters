package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.annotation.NonNull;

class TranslationAnimationCreator$TransitionPositionListener
  extends AnimatorListenerAdapter
  implements Transition.TransitionListener
{
  private final View mMovingView;
  private float mPausedX;
  private float mPausedY;
  private final int mStartX;
  private final int mStartY;
  private final float mTerminalX;
  private final float mTerminalY;
  private int[] mTransitionPosition;
  private final View mViewInHierarchy;
  
  public TranslationAnimationCreator$TransitionPositionListener(View paramView1, View paramView2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    mMovingView = paramView1;
    mViewInHierarchy = paramView2;
    mStartX = (paramInt1 - Math.round(paramView1.getTranslationX()));
    mStartY = (paramInt2 - Math.round(paramView1.getTranslationY()));
    mTerminalX = paramFloat1;
    mTerminalY = paramFloat2;
    paramInt1 = R.id.transition_position;
    paramView1 = (int[])paramView2.getTag(paramInt1);
    mTransitionPosition = paramView1;
    if (paramView1 != null) {
      paramView2.setTag(paramInt1, null);
    }
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    if (mTransitionPosition == null) {
      mTransitionPosition = new int[2];
    }
    paramAnimator = mTransitionPosition;
    float f = mStartX;
    paramAnimator[0] = Math.round(mMovingView.getTranslationX() + f);
    paramAnimator = mTransitionPosition;
    f = mStartY;
    paramAnimator[1] = Math.round(mMovingView.getTranslationY() + f);
    mViewInHierarchy.setTag(R.id.transition_position, mTransitionPosition);
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    mPausedX = mMovingView.getTranslationX();
    mPausedY = mMovingView.getTranslationY();
    mMovingView.setTranslationX(mTerminalX);
    mMovingView.setTranslationY(mTerminalY);
  }
  
  public void onAnimationResume(Animator paramAnimator)
  {
    mMovingView.setTranslationX(mPausedX);
    mMovingView.setTranslationY(mPausedY);
  }
  
  public void onTransitionCancel(@NonNull Transition paramTransition) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    mMovingView.setTranslationX(mTerminalX);
    mMovingView.setTranslationY(mTerminalY);
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition) {}
  
  public void onTransitionResume(@NonNull Transition paramTransition) {}
  
  public void onTransitionStart(@NonNull Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     androidx.transition.TranslationAnimationCreator.TransitionPositionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */