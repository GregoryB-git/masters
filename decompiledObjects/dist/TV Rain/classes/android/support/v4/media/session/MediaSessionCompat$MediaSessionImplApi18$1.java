package android.support.v4.media.session;

import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;

class MediaSessionCompat$MediaSessionImplApi18$1
  implements RemoteControlClient.OnPlaybackPositionUpdateListener
{
  public MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat.MediaSessionImplApi18 paramMediaSessionImplApi18) {}
  
  public void onPlaybackPositionUpdate(long paramLong)
  {
    this$0.postToHandler(18, -1, -1, Long.valueOf(paramLong), null);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */