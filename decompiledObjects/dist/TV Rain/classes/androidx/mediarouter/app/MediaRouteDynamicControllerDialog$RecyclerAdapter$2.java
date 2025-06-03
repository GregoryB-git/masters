package androidx.mediarouter.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$2
  implements Animation.AnimationListener
{
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$2(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    paramAnimation = this$1.this$0;
    mIsAnimatingVolumeSliderLayout = false;
    paramAnimation.updateViewsIfNeeded();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this$1.this$0.mIsAnimatingVolumeSliderLayout = true;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */