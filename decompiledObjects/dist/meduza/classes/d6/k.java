package d6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import b7.t;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class k
  extends a
{
  public static final Parcelable.Creator<k> CREATOR = new c0();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final Uri e;
  public final String f;
  public final String o;
  public final String p;
  public final t q;
  
  public k(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, String paramString6, String paramString7, t paramt)
  {
    j.i(paramString1);
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramUri;
    f = paramString5;
    o = paramString6;
    p = paramString7;
    q = paramt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = (k)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d)) && (h.a(e, e)) && (h.a(f, f)) && (h.a(o, o)) && (h.a(p, p)) && (h.a(q, q));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, e, f, o, p, q });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.E(paramParcel, 5, e, paramInt, false);
    z.F(paramParcel, 6, f, false);
    z.F(paramParcel, 7, o, false);
    z.F(paramParcel, 8, p, false);
    z.E(paramParcel, 9, q, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */