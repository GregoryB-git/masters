package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class MediaSessionCompat$Token$a
  implements Parcelable.Creator
{
  public MediaSessionCompat.Token a(Parcel paramParcel)
  {
    return new MediaSessionCompat.Token(paramParcel.readParcelable(null));
  }
  
  public MediaSessionCompat.Token[] b(int paramInt)
  {
    return new MediaSessionCompat.Token[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */