package androidx.mediarouter.app;

import android.widget.BaseAdapter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.Set;

class MediaRouteControllerDialog$10
  implements OverlayListView.OverlayObject.OnAnimationEndListener
{
  public MediaRouteControllerDialog$10(MediaRouteControllerDialog paramMediaRouteControllerDialog, MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onAnimationEnd()
  {
    this$0.mGroupMemberRoutesAnimatingWithBitmap.remove(val$route);
    this$0.mVolumeGroupAdapter.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */