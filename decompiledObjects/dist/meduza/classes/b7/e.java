package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import n6.a;

public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new k1();
  public final f0 a;
  public final n1 b;
  public final f c;
  public final p1 d;
  
  public e(f0 paramf0, n1 paramn1, f paramf, p1 paramp1)
  {
    a = paramf0;
    b = paramn1;
    c = paramf;
    d = paramp1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.E(paramParcel, 3, c, paramInt, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */