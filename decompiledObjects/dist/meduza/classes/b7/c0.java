package b7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum c0
  implements Parcelable
{
  public static final Parcelable.Creator<c0> CREATOR = new a1();
  public final String a;
  
  static
  {
    c0 localc01 = new c0("RESIDENT_KEY_DISCOURAGED", 0, "discouraged");
    c0 localc02 = new c0("RESIDENT_KEY_PREFERRED", 1, "preferred");
    c0 localc03 = new c0("RESIDENT_KEY_REQUIRED", 2, "required");
    b = localc03;
    c = new c0[] { localc01, localc02, localc03 };
  }
  
  public c0(String paramString1)
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
 * Qualified Name:     b7.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */