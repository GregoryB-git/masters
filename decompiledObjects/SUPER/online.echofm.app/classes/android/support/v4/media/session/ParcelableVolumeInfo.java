package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
  public int o;
  public int p;
  public int q;
  public int r;
  public int s;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    q = paramParcel.readInt();
    r = paramParcel.readInt();
    s = paramParcel.readInt();
    p = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeInt(s);
    paramParcel.writeInt(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public ParcelableVolumeInfo a(Parcel paramParcel)
    {
      return new ParcelableVolumeInfo(paramParcel);
    }
    
    public ParcelableVolumeInfo[] b(int paramInt)
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