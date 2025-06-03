package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$QueueItem$a
  implements Parcelable.Creator<MediaSessionCompat.QueueItem>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new MediaSessionCompat.QueueItem(paramParcel);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new MediaSessionCompat.QueueItem[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */