package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;

public final class i0
  extends f
{
  public static final Parcelable.Creator<i0> CREATOR = new x0();
  public final String a;
  
  public i0(String paramString)
  {
    j.e(paramString);
    a = paramString;
  }
  
  public final String D()
  {
    return "playgames.google.com";
  }
  
  public final String E()
  {
    return "playgames.google.com";
  }
  
  public final f F()
  {
    return new i0(a);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */