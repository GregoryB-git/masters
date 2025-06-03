package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    c = paramParcel.readInt();
    d = paramParcel.readInt();
    e = paramParcel.readInt();
    b = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeInt(e);
    paramParcel.writeInt(b);
  }
  
  public final class a
    implements Parcelable.Creator<ParcelableVolumeInfo>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new ParcelableVolumeInfo(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new ParcelableVolumeInfo[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.ParcelableVolumeInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */