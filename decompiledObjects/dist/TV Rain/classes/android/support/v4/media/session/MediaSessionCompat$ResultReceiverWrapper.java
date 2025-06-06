package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator()
  {
    public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel paramAnonymousParcel)
    {
      return new MediaSessionCompat.ResultReceiverWrapper(paramAnonymousParcel);
    }
    
    public MediaSessionCompat.ResultReceiverWrapper[] newArray(int paramAnonymousInt)
    {
      return new MediaSessionCompat.ResultReceiverWrapper[paramAnonymousInt];
    }
  };
  public ResultReceiver mResultReceiver;
  
  public MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    mResultReceiver = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaSessionCompat$ResultReceiverWrapper(@NonNull ResultReceiver paramResultReceiver)
  {
    mResultReceiver = paramResultReceiver;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    mResultReceiver.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */