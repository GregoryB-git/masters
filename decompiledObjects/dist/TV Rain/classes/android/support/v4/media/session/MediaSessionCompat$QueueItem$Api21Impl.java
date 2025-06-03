package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaSessionCompat$QueueItem$Api21Impl
{
  @DoNotInline
  public static MediaSession.QueueItem createQueueItem(MediaDescription paramMediaDescription, long paramLong)
  {
    return new MediaSession.QueueItem(paramMediaDescription, paramLong);
  }
  
  @DoNotInline
  public static MediaDescription getDescription(MediaSession.QueueItem paramQueueItem)
  {
    return paramQueueItem.getDescription();
  }
  
  @DoNotInline
  public static long getQueueId(MediaSession.QueueItem paramQueueItem)
  {
    return paramQueueItem.getQueueId();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */