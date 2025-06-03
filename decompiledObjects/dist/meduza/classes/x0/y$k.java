package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class y$k
  implements Parcelable
{
  public static final Parcelable.Creator<k> CREATOR = new a();
  public String a;
  public int b;
  
  public y$k(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = paramParcel.readInt();
  }
  
  public y$k(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeInt(b);
  }
  
  public final class a
    implements Parcelable.Creator<y.k>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new y.k(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new y.k[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x0.y.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */