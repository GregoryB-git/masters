package androidx.mediarouter.app;

import android.util.Log;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.Map;

final class MediaRouteControllerDialog$MediaRouterCallback
  extends MediaRouter.Callback
{
  public MediaRouteControllerDialog$MediaRouterCallback(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.update(true);
  }
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.update(false);
  }
  
  public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    SeekBar localSeekBar = (SeekBar)this$0.mVolumeSliderMap.get(paramRouteInfo);
    int i = paramRouteInfo.getVolume();
    if (MediaRouteControllerDialog.DEBUG)
    {
      paramMediaRouter = new StringBuilder();
      paramMediaRouter.append("onRouteVolumeChanged(), route.getVolume:");
      paramMediaRouter.append(i);
      Log.d("MediaRouteCtrlDialog", paramMediaRouter.toString());
    }
    if ((localSeekBar != null) && (this$0.mRouteInVolumeSliderTouched != paramRouteInfo)) {
      localSeekBar.setProgress(i);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.MediaRouterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */