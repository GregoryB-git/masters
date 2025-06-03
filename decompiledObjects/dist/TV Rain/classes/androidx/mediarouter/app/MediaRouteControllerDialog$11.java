package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class MediaRouteControllerDialog$11
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public MediaRouteControllerDialog$11(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onGlobalLayout()
  {
    this$0.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    this$0.startGroupListFadeInAnimationInternal();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */