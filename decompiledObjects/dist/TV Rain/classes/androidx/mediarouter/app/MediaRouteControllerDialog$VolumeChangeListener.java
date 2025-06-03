package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

class MediaRouteControllerDialog$VolumeChangeListener
  implements SeekBar.OnSeekBarChangeListener
{
  private final Runnable mStopTrackingTouch = new Runnable()
  {
    public void run()
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
      if (mRouteInVolumeSliderTouched != null)
      {
        mRouteInVolumeSliderTouched = null;
        if (mHasPendingUpdate) {
          localMediaRouteControllerDialog.update(mPendingUpdateAnimationNeeded);
        }
      }
    }
  };
  
  public MediaRouteControllerDialog$VolumeChangeListener(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramSeekBar = (MediaRouter.RouteInfo)paramSeekBar.getTag();
      if (MediaRouteControllerDialog.DEBUG)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(")");
        Log.d("MediaRouteCtrlDialog", localStringBuilder.toString());
      }
      paramSeekBar.requestSetVolume(paramInt);
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    if (mRouteInVolumeSliderTouched != null) {
      mVolumeSlider.removeCallbacks(mStopTrackingTouch);
    }
    this$0.mRouteInVolumeSliderTouched = ((MediaRouter.RouteInfo)paramSeekBar.getTag());
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this$0.mVolumeSlider.postDelayed(mStopTrackingTouch, 500L);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.VolumeChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */