package android.support.v4.media.session;

import android.media.Rating;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.support.v4.media.RatingCompat;

class MediaSessionCompat$MediaSessionImplApi19$1
  implements RemoteControlClient.OnMetadataUpdateListener
{
  public MediaSessionCompat$MediaSessionImplApi19$1(MediaSessionCompat.MediaSessionImplApi19 paramMediaSessionImplApi19) {}
  
  public void onMetadataUpdate(int paramInt, Object paramObject)
  {
    if ((paramInt == 268435457) && ((paramObject instanceof Rating))) {
      this$0.postToHandler(19, -1, -1, RatingCompat.fromRating(paramObject), null);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */