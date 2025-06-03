package androidx.mediarouter.app;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

class MediaRouteDynamicControllerDialog$MediaRouteVolumeSliderHolder$1
  implements View.OnClickListener
{
  public MediaRouteDynamicControllerDialog$MediaRouteVolumeSliderHolder$1(MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder paramMediaRouteVolumeSliderHolder) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this$1.this$0;
    if (mRouteForVolumeUpdatingByUser != null) {
      mHandler.removeMessages(2);
    }
    localObject = this$1;
    this$0.mRouteForVolumeUpdatingByUser = mRoute;
    boolean bool = paramView.isActivated() ^ true;
    int i;
    if (bool) {
      i = 0;
    } else {
      i = this$1.getUnmutedVolume();
    }
    this$1.setMute(bool);
    this$1.mVolumeSlider.setProgress(i);
    this$1.mRoute.requestSetVolume(i);
    this$1.this$0.mHandler.sendEmptyMessageDelayed(2, 500L);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */