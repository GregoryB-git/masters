package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

@SuppressLint({"BanParcelableUsage"})
final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
  public ResultReceiver o;
  
  public MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    o = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.writeToParcel(paramParcel, paramInt);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public MediaSessionCompat.ResultReceiverWrapper a(Parcel paramParcel)
    {
      return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
    }
    
    public MediaSessionCompat.ResultReceiverWrapper[] b(int paramInt)
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