package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class t
  extends a
{
  public static final Parcelable.Creator<t> CREATOR = new t0();
  public final String a;
  public final String b;
  public final byte[] c;
  public final h d;
  public final g e;
  public final i f;
  public final e o;
  public final String p;
  
  public t(String paramString1, String paramString2, byte[] paramArrayOfByte, h paramh, g paramg, i parami, e parame, String paramString3)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramh != null) && (paramg == null))
    {
      bool2 = bool1;
      if (parami == null) {}
    }
    else if ((paramh == null) && (paramg != null))
    {
      bool2 = bool1;
      if (parami == null) {}
    }
    else if ((paramh == null) && (paramg == null) && (parami != null))
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
    }
    j.b(bool2);
    a = paramString1;
    b = paramString2;
    c = paramArrayOfByte;
    d = paramh;
    e = paramg;
    f = parami;
    o = parame;
    p = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof t)) {
      return false;
    }
    paramObject = (t)paramObject;
    return (m6.h.a(a, a)) && (m6.h.a(b, b)) && (Arrays.equals(c, c)) && (m6.h.a(d, d)) && (m6.h.a(e, e)) && (m6.h.a(f, f)) && (m6.h.a(o, o)) && (m6.h.a(p, p));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, e, d, f, o, p });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.w(paramParcel, 3, c, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.E(paramParcel, 5, e, paramInt, false);
    z.E(paramParcel, 6, f, paramInt, false);
    z.E(paramParcel, 7, o, paramInt, false);
    z.F(paramParcel, 8, p, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */