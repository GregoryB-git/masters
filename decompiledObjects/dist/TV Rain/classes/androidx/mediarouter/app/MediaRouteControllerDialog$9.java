package androidx.mediarouter.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class MediaRouteControllerDialog$9
  implements Animation.AnimationListener
{
  public MediaRouteControllerDialog$9(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onAnimationEnd(Animation paramAnimation) {}
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this$0.mVolumeGroupList.startAnimationAll();
    paramAnimation = this$0;
    mVolumeGroupList.postDelayed(mGroupListFadeInAnimation, mGroupListAnimationDurationMs);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */