package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;

class FragmentAnim$EndViewTransitionAnimation
  extends AnimationSet
  implements Runnable
{
  private boolean mAnimating = true;
  private final View mChild;
  private boolean mEnded;
  private final ViewGroup mParent;
  private boolean mTransitionEnded;
  
  public FragmentAnim$EndViewTransitionAnimation(@NonNull Animation paramAnimation, @NonNull ViewGroup paramViewGroup, @NonNull View paramView)
  {
    super(false);
    mParent = paramViewGroup;
    mChild = paramView;
    addAnimation(paramAnimation);
    paramViewGroup.post(this);
  }
  
  public boolean getTransformation(long paramLong, @NonNull Transformation paramTransformation)
  {
    mAnimating = true;
    if (mEnded) {
      return mTransitionEnded ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation))
    {
      mEnded = true;
      OneShotPreDrawListener.add(mParent, this);
    }
    return true;
  }
  
  public boolean getTransformation(long paramLong, @NonNull Transformation paramTransformation, float paramFloat)
  {
    mAnimating = true;
    if (mEnded) {
      return mTransitionEnded ^ true;
    }
    if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
    {
      mEnded = true;
      OneShotPreDrawListener.add(mParent, this);
    }
    return true;
  }
  
  public void run()
  {
    if ((!mEnded) && (mAnimating))
    {
      mAnimating = false;
      mParent.post(this);
    }
    else
    {
      mParent.endViewTransition(mChild);
      mTransitionEnded = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */