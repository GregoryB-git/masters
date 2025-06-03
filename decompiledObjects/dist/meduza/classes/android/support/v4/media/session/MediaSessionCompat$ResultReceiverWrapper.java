package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
  public ResultReceiver a;
  
  public MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.writeToParcel(paramParcel, paramInt);
  }
  
  public final class a
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */