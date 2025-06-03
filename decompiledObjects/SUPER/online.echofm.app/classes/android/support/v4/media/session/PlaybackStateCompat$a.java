package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PlaybackStateCompat$a
  implements Parcelable.Creator
{
  public PlaybackStateCompat a(Parcel paramParcel)
  {
    return new PlaybackStateCompat(paramParcel);
  }
  
  public PlaybackStateCompat[] b(int paramInt)
  {
    return new PlaybackStateCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */