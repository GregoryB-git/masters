package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token$a
  implements Parcelable.Creator<MediaSessionCompat.Token>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new MediaSessionCompat.Token(paramParcel.readParcelable(null), null, null);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new MediaSessionCompat.Token[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */