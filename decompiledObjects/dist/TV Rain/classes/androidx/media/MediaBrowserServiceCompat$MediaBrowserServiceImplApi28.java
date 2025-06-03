package androidx.media;

import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi28
  extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi26
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi28(MediaBrowserServiceCompat paramMediaBrowserServiceCompat)
  {
    super(paramMediaBrowserServiceCompat);
  }
  
  public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
  {
    MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
    if (localConnectionRecord != null)
    {
      if (localConnectionRecord == mConnectionFromFwk) {
        return new MediaSessionManager.RemoteUserInfo(c.e(mServiceFwk));
      }
      return browserInfo;
    }
    throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */