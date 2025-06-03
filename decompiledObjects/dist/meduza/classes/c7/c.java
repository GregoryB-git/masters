package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@Deprecated
public enum c
  implements Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new i();
  public final String a;
  
  static
  {
    c localc = new c("UNKNOWN", 0, "UNKNOWN");
    b = localc;
    c = new c[] { localc, new c("V1", 1, "U2F_V1"), new c("V2", 2, "U2F_V2") };
  }
  
  public c(String paramString1)
  {
    a = paramString1;
  }
  
  public static c f(String paramString)
  {
    if (paramString == null) {
      return b;
    }
    for (c localc : values()) {
      if (paramString.equals(a)) {
        return localc;
      }
    }
    throw new a(paramString);
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
 * Qualified Name:     c7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */