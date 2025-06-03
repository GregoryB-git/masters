package androidx.mediarouter.media;

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2
  implements Runnable
{
  public MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter.GlobalMediaRouter.MediaSessionRecord.1 param1, int paramInt) {}
  
  public void run()
  {
    MediaRouter.RouteInfo localRouteInfo = this$2.this$1.this$0.mSelectedRoute;
    if (localRouteInfo != null) {
      localRouteInfo.requestUpdateVolume(val$direction);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord.1.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */