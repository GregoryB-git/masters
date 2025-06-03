package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import b2.c;
import b2.d;
import b2.e;

public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  public final e a;
  
  public ParcelImpl(Parcel paramParcel)
  {
    a = new d(paramParcel).w();
  }
  
  public ParcelImpl(e parame)
  {
    a = parame;
  }
  
  public <T extends e> T a()
  {
    return a;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new d(paramParcel).Q(a);
  }
  
  public static final class a
    implements Parcelable.Creator<ParcelImpl>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new ParcelImpl(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new ParcelImpl[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.ParcelImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */