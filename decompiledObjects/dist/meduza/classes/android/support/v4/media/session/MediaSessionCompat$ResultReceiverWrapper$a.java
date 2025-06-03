package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$ResultReceiverWrapper$a
  implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */