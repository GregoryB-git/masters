package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m6.h;

public final class x
  extends j
{
  public static final Parcelable.Creator<x> CREATOR = new w0();
  public final byte[] a;
  public final Double b;
  public final String c;
  public final List d;
  public final Integer e;
  public final d0 f;
  public final g1 o;
  public final d p;
  public final Long q;
  
  public x(byte[] paramArrayOfByte, Double paramDouble, String paramString1, ArrayList paramArrayList, Integer paramInteger, d0 paramd0, String paramString2, d paramd, Long paramLong)
  {
    m6.j.i(paramArrayOfByte);
    a = paramArrayOfByte;
    b = paramDouble;
    m6.j.i(paramString1);
    c = paramString1;
    d = paramArrayList;
    e = paramInteger;
    f = paramd0;
    q = paramLong;
    if (paramString2 != null) {
      try
      {
        o = g1.f(paramString2);
      }
      catch (f1 paramArrayOfByte)
      {
        throw new IllegalArgumentException(paramArrayOfByte);
      }
    } else {
      o = null;
    }
    p = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof x)) {
      return false;
    }
    paramObject = (x)paramObject;
    if ((Arrays.equals(a, a)) && (h.a(b, b)) && (h.a(c, c)))
    {
      List localList1 = d;
      if ((localList1 != null) || (d != null))
      {
        if (localList1 != null)
        {
          List localList2 = d;
          if ((localList2 == null) || (!localList1.containsAll(localList2)) || (!d.containsAll(d))) {}
        }
      }
      else if ((h.a(e, e)) && (h.a(f, f)) && (h.a(o, o)) && (h.a(p, p)) && (h.a(q, q))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(Arrays.hashCode(a)), b, c, d, e, f, o, p, q });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.w(paramParcel, 2, a, false);
    z.x(paramParcel, 3, b);
    z.F(paramParcel, 4, c, false);
    z.I(paramParcel, 5, d, false);
    z.B(paramParcel, 6, e);
    z.E(paramParcel, 7, f, paramInt, false);
    Object localObject = o;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = a;
    }
    z.F(paramParcel, 8, (String)localObject, false);
    z.E(paramParcel, 9, p, paramInt, false);
    z.D(paramParcel, 10, q);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */