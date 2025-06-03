package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class f
  extends a
{
  public static final Parcelable.Creator<f> CREATOR = new t();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final int f;
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt)
  {
    j.i(paramString1);
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramBoolean;
    f = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {
      return false;
    }
    paramObject = (f)paramObject;
    return (h.a(a, a)) && (h.a(d, d)) && (h.a(b, b)) && (h.a(Boolean.valueOf(e), Boolean.valueOf(e))) && (f == f);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, d, Boolean.valueOf(e), Integer.valueOf(f) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.t(paramParcel, 5, e);
    z.z(paramParcel, 6, f);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */