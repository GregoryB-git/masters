package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import b8.e;
import m6.j;
import r.b;

public final class i1
  implements e
{
  public static final Parcelable.Creator<i1> CREATOR = new h1();
  public final String a;
  public final String b;
  public b c;
  public boolean d;
  
  public i1(String paramString1, String paramString2, boolean paramBoolean)
  {
    j.e(paramString1);
    j.e(paramString2);
    a = paramString1;
    b = paramString2;
    c = c0.d(paramString2);
    d = paramBoolean;
  }
  
  public i1(boolean paramBoolean)
  {
    d = paramBoolean;
    b = null;
    a = null;
    c = null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.t(paramParcel, 3, d);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */