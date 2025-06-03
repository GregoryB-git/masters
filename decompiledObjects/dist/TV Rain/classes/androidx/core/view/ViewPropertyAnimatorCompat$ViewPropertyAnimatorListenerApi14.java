package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

class ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14
  implements ViewPropertyAnimatorListener
{
  public boolean mAnimEndCalled;
  public ViewPropertyAnimatorCompat mVpa;
  
  public ViewPropertyAnimatorCompat$ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat)
  {
    mVpa = paramViewPropertyAnimatorCompat;
  }
  
  public void onAnimationCancel(@NonNull View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof ViewPropertyAnimatorListener)) {
      localObject = (ViewPropertyAnimatorListener)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((ViewPropertyAnimatorListener)localObject).onAnimationCancel(paramView);
    }
  }
  
  @SuppressLint({"WrongConstant"})
  public void onAnimationEnd(@NonNull View paramView)
  {
    int i = mVpa.mOldLayerType;
    ViewPropertyAnimatorListener localViewPropertyAnimatorListener = null;
    if (i > -1)
    {
      paramView.setLayerType(i, null);
      mVpa.mOldLayerType = -1;
    }
    Object localObject = mVpa;
    Runnable localRunnable = mEndAction;
    if (localRunnable != null)
    {
      mEndAction = null;
      localRunnable.run();
    }
    localObject = paramView.getTag(2113929216);
    if ((localObject instanceof ViewPropertyAnimatorListener)) {
      localViewPropertyAnimatorListener = (ViewPropertyAnimatorListener)localObject;
    }
    if (localViewPropertyAnimatorListener != null) {
      localViewPropertyAnimatorListener.onAnimationEnd(paramView);
    }
    mAnimEndCalled = true;
  }
  
  public void onAnimationStart(@NonNull View paramView)
  {
    mAnimEndCalled = false;
    int i = mVpa.mOldLayerType;
    ViewPropertyAnimatorListener localViewPropertyAnimatorListener = null;
    if (i > -1) {
      paramView.setLayerType(2, null);
    }
    Object localObject = mVpa;
    Runnable localRunnable = mStartAction;
    if (localRunnable != null)
    {
      mStartAction = null;
      localRunnable.run();
    }
    localObject = paramView.getTag(2113929216);
    if ((localObject instanceof ViewPropertyAnimatorListener)) {
      localViewPropertyAnimatorListener = (ViewPropertyAnimatorListener)localObject;
    }
    if (localViewPropertyAnimatorListener != null) {
      localViewPropertyAnimatorListener.onAnimationStart(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */