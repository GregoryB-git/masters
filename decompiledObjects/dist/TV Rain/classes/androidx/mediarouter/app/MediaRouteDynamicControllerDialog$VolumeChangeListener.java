package androidx.mediarouter.app;

import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.Map;

class MediaRouteDynamicControllerDialog$VolumeChangeListener
  implements SeekBar.OnSeekBarChangeListener
{
  public MediaRouteDynamicControllerDialog$VolumeChangeListener(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramSeekBar = (MediaRouter.RouteInfo)paramSeekBar.getTag();
      MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder localMediaRouteVolumeSliderHolder = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)this$0.mVolumeSliderHolderMap.get(paramSeekBar.getId());
      if (localMediaRouteVolumeSliderHolder != null)
      {
        if (paramInt == 0) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        localMediaRouteVolumeSliderHolder.setMute(paramBoolean);
      }
      paramSeekBar.requestSetVolume(paramInt);
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    if (mRouteForVolumeUpdatingByUser != null) {
      mHandler.removeMessages(2);
    }
    this$0.mRouteForVolumeUpdatingByUser = ((MediaRouter.RouteInfo)paramSeekBar.getTag());
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this$0.mHandler.sendEmptyMessageDelayed(2, 500L);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.VolumeChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */