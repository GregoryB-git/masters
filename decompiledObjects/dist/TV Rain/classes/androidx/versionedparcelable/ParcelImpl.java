package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator()
  {
    public ParcelImpl createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ParcelImpl(paramAnonymousParcel);
    }
    
    public ParcelImpl[] newArray(int paramAnonymousInt)
    {
      return new ParcelImpl[paramAnonymousInt];
    }
  };
  private final VersionedParcelable mParcel;
  
  public ParcelImpl(Parcel paramParcel)
  {
    mParcel = new VersionedParcelParcel(paramParcel).readVersionedParcelable();
  }
  
  public ParcelImpl(VersionedParcelable paramVersionedParcelable)
  {
    mParcel = paramVersionedParcelable;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public <T extends VersionedParcelable> T getVersionedParcel()
  {
    return mParcel;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new VersionedParcelParcel(paramParcel).writeVersionedParcelable(mParcel);
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.ParcelImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */