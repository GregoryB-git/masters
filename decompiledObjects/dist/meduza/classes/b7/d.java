package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import n6.a;

public final class d
  extends a
{
  public static final Parcelable.Creator<d> CREATOR = new l1();
  public final r a;
  public final a2 b;
  public final e0 c;
  public final g2 d;
  public final j0 e;
  public final l0 f;
  public final c2 o;
  public final o0 p;
  public final s q;
  public final q0 r;
  
  public d(r paramr, a2 parama2, e0 parame0, g2 paramg2, j0 paramj0, l0 paraml0, c2 paramc2, o0 paramo0, s params, q0 paramq0)
  {
    a = paramr;
    c = parame0;
    b = parama2;
    d = paramg2;
    e = paramj0;
    f = paraml0;
    o = paramc2;
    p = paramo0;
    q = params;
    r = paramq0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d)) && (h.a(e, e)) && (h.a(f, f)) && (h.a(o, o)) && (h.a(p, p)) && (h.a(q, q)) && (h.a(r, r));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, e, f, o, p, q, r });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 2, a, paramInt, false);
    z.E(paramParcel, 3, b, paramInt, false);
    z.E(paramParcel, 4, c, paramInt, false);
    z.E(paramParcel, 5, d, paramInt, false);
    z.E(paramParcel, 6, e, paramInt, false);
    z.E(paramParcel, 7, f, paramInt, false);
    z.E(paramParcel, 8, o, paramInt, false);
    z.E(paramParcel, 9, p, paramInt, false);
    z.E(paramParcel, 10, q, paramInt, false);
    z.E(paramParcel, 11, r, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */