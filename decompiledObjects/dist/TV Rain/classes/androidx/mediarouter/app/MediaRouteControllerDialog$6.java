package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class MediaRouteControllerDialog$6
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public MediaRouteControllerDialog$6(MediaRouteControllerDialog paramMediaRouteControllerDialog, boolean paramBoolean) {}
  
  public void onGlobalLayout()
  {
    this$0.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    if (mIsGroupListAnimating) {
      mIsGroupListAnimationPending = true;
    } else {
      localMediaRouteControllerDialog.updateLayoutHeightInternal(val$animate);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */