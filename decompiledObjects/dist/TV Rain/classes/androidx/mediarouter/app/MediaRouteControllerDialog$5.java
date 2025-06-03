package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;

class MediaRouteControllerDialog$5
  implements View.OnClickListener
{
  public MediaRouteControllerDialog$5(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onClick(View paramView)
  {
    paramView = this$0;
    boolean bool = mIsGroupExpanded ^ true;
    mIsGroupExpanded = bool;
    if (bool) {
      mVolumeGroupList.setVisibility(0);
    }
    this$0.loadInterpolator();
    this$0.updateLayoutHeight(true);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */