package androidx.mediarouter.media;

final class MediaRouter$CallbackRecord
{
  public final MediaRouter.Callback mCallback;
  public int mFlags;
  public final MediaRouter mRouter;
  public MediaRouteSelector mSelector;
  public long mTimestamp;
  
  public MediaRouter$CallbackRecord(MediaRouter paramMediaRouter, MediaRouter.Callback paramCallback)
  {
    mRouter = paramMediaRouter;
    mCallback = paramCallback;
    mSelector = MediaRouteSelector.EMPTY;
  }
  
  public boolean filterRouteEvent(MediaRouter.RouteInfo paramRouteInfo1, int paramInt1, MediaRouter.RouteInfo paramRouteInfo2, int paramInt2)
  {
    if (((mFlags & 0x2) == 0) && (!paramRouteInfo1.matchesSelector(mSelector)))
    {
      if ((MediaRouter.isTransferToLocalEnabled()) && (paramRouteInfo1.isDefaultOrBluetooth()) && (paramInt1 == 262) && (paramInt2 == 3) && (paramRouteInfo2 != null)) {
        return paramRouteInfo2.isDefaultOrBluetooth() ^ true;
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.CallbackRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */