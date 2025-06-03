package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;

public final class MediaSessionCompat$QueueItem$b
{
  public static MediaSession.QueueItem a(MediaDescription paramMediaDescription, long paramLong)
  {
    return new MediaSession.QueueItem(paramMediaDescription, paramLong);
  }
  
  public static MediaDescription b(MediaSession.QueueItem paramQueueItem)
  {
    return paramQueueItem.getDescription();
  }
  
  public static long c(MediaSession.QueueItem paramQueueItem)
  {
    return paramQueueItem.getQueueId();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */