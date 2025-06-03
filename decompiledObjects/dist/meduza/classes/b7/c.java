package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum c
  implements Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new i1();
  public final String a;
  
  public c(String paramString1)
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
 * Qualified Name:     b7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */