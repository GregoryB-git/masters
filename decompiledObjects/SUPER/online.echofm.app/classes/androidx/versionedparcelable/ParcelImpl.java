package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import v1.b;
import v1.c;
import v1.d;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  public final d o;
  
  public ParcelImpl(Parcel paramParcel)
  {
    o = new c(paramParcel).u();
  }
  
  public ParcelImpl(d paramd)
  {
    o = paramd;
  }
  
  public d a()
  {
    return o;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new c(paramParcel).L(o);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public ParcelImpl a(Parcel paramParcel)
    {
      return new ParcelImpl(paramParcel);
    }
    
    public ParcelImpl[] b(int paramInt)
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