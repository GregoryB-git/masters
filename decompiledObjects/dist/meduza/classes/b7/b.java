package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new h0();
  public final String a;
  
  public b(String paramString1)
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
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     b7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */