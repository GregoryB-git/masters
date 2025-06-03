package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;

public final class i
  extends f
{
  public static final Parcelable.Creator<i> CREATOR = new g1();
  public final String a;
  
  public i(String paramString)
  {
    j.e(paramString);
    a = paramString;
  }
  
  public final String D()
  {
    return "facebook.com";
  }
  
  public final String E()
  {
    return "facebook.com";
  }
  
  public final f F()
  {
    return new i(a);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */