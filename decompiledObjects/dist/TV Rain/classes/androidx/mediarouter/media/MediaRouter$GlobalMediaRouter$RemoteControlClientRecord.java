package androidx.mediarouter.media;

final class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord
  implements RemoteControlClientCompat.VolumeCallback
{
  private boolean mDisconnected;
  private final RemoteControlClientCompat mRccCompat;
  
  public MediaRouter$GlobalMediaRouter$RemoteControlClientRecord(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, Object paramObject)
  {
    paramGlobalMediaRouter = RemoteControlClientCompat.obtain(mApplicationContext, paramObject);
    mRccCompat = paramGlobalMediaRouter;
    paramGlobalMediaRouter.setVolumeCallback(this);
    updatePlaybackInfo();
  }
  
  public void disconnect()
  {
    mDisconnected = true;
    mRccCompat.setVolumeCallback(null);
  }
  
  public Object getRemoteControlClient()
  {
    return mRccCompat.getRemoteControlClient();
  }
  
  public void onVolumeSetRequest(int paramInt)
  {
    if (!mDisconnected)
    {
      MediaRouter.RouteInfo localRouteInfo = this$0.mSelectedRoute;
      if (localRouteInfo != null) {
        localRouteInfo.requestSetVolume(paramInt);
      }
    }
  }
  
  public void onVolumeUpdateRequest(int paramInt)
  {
    if (!mDisconnected)
    {
      MediaRouter.RouteInfo localRouteInfo = this$0.mSelectedRoute;
      if (localRouteInfo != null) {
        localRouteInfo.requestUpdateVolume(paramInt);
      }
    }
  }
  
  public void updatePlaybackInfo()
  {
    mRccCompat.setPlaybackInfo(this$0.mPlaybackInfo);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.RemoteControlClientRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */