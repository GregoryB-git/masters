package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum d0$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b1();
  public final String a;
  
  public d0$a(String paramString1)
  {
    a = paramString1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
  }
}

/* Location:
 * Qualified Name:     b7.d0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */