package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;

public final class n0
  extends f
{
  public static final Parcelable.Creator<n0> CREATOR = new z0();
  public String a;
  public String b;
  
  public n0(String paramString1, String paramString2)
  {
    j.e(paramString1);
    a = paramString1;
    j.e(paramString2);
    b = paramString2;
  }
  
  public final String D()
  {
    return "twitter.com";
  }
  
  public final String E()
  {
    return "twitter.com";
  }
  
  public final f F()
  {
    return new n0(a, b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */