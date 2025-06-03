package androidx.mediarouter.media;

import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener;

class MediaRouter$GlobalMediaRouter$1
  implements MediaSessionCompat.OnActiveChangeListener
{
  public MediaRouter$GlobalMediaRouter$1(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
  public void onActiveChanged()
  {
    Object localObject = this$0.mRccMediaSession;
    if (localObject != null) {
      if (((MediaSessionCompat)localObject).isActive())
      {
        localObject = this$0;
        ((MediaRouter.GlobalMediaRouter)localObject).addRemoteControlClient(mRccMediaSession.getRemoteControlClient());
      }
      else
      {
        localObject = this$0;
        ((MediaRouter.GlobalMediaRouter)localObject).removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */