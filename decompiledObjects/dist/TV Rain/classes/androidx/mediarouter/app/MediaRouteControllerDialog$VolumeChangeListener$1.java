package androidx.mediarouter.app;

class MediaRouteControllerDialog$VolumeChangeListener$1
  implements Runnable
{
  public MediaRouteControllerDialog$VolumeChangeListener$1(MediaRouteControllerDialog.VolumeChangeListener paramVolumeChangeListener) {}
  
  public void run()
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$1.this$0;
    if (mRouteInVolumeSliderTouched != null)
    {
      mRouteInVolumeSliderTouched = null;
      if (mHasPendingUpdate) {
        localMediaRouteControllerDialog.update(mPendingUpdateAnimationNeeded);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.VolumeChangeListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */