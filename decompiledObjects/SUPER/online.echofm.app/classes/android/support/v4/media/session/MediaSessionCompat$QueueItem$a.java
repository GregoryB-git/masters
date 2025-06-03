package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class MediaSessionCompat$QueueItem$a
  implements Parcelable.Creator
{
  public MediaSessionCompat.QueueItem a(Parcel paramParcel)
  {
    return new MediaSessionCompat.QueueItem(paramParcel);
  }
  
  public MediaSessionCompat.QueueItem[] b(int paramInt)
  {
    return new MediaSessionCompat.QueueItem[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */