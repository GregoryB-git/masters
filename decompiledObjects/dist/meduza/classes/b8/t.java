package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;

public final class t
  extends f
{
  public static final Parcelable.Creator<t> CREATOR = new r0();
  public String a;
  
  public t(String paramString)
  {
    j.e(paramString);
    a = paramString;
  }
  
  public final String D()
  {
    return "github.com";
  }
  
  public final String E()
  {
    return "github.com";
  }
  
  public final f F()
  {
    return new t(a);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */