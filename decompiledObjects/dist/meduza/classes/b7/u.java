package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import m6.h;

public final class u
  extends j
{
  public static final Parcelable.Creator<u> CREATOR = new s0();
  public final y a;
  public final a0 b;
  public final byte[] c;
  public final List d;
  public final Double e;
  public final List f;
  public final k o;
  public final Integer p;
  public final d0 q;
  public final c r;
  public final d s;
  
  public u(y paramy, a0 parama0, byte[] paramArrayOfByte, ArrayList paramArrayList1, Double paramDouble, ArrayList paramArrayList2, k paramk, Integer paramInteger, d0 paramd0, String paramString, d paramd)
  {
    m6.j.i(paramy);
    a = paramy;
    m6.j.i(parama0);
    b = parama0;
    m6.j.i(paramArrayOfByte);
    c = paramArrayOfByte;
    m6.j.i(paramArrayList1);
    d = paramArrayList1;
    e = paramDouble;
    f = paramArrayList2;
    o = paramk;
    p = paramInteger;
    q = paramd0;
    if (paramString != null)
    {
      try
      {
        paramy = c.values();
        i = paramy.length;
        j = 0;
      }
      catch (c.a paramy)
      {
        for (;;)
        {
          int i;
          int j;
          break;
          j++;
          continue;
          paramy = new b7/c$a;
          paramy.<init>(paramString);
          throw paramy;
        }
        throw new IllegalArgumentException(paramy);
      }
      if (j < i)
      {
        parama0 = paramy[j];
        if (paramString.equals(a))
        {
          r = parama0;
          break label156;
        }
      }
    }
    r = null;
    label156:
    s = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof u)) {
      return false;
    }
    u localu = (u)paramObject;
    if ((h.a(a, a)) && (h.a(b, b)) && (Arrays.equals(c, c)) && (h.a(e, e)) && (d.containsAll(d)) && (d.containsAll(d)))
    {
      List localList = f;
      if ((localList != null) || (f != null))
      {
        if (localList != null)
        {
          paramObject = f;
          if ((paramObject == null) || (!localList.containsAll((Collection)paramObject)) || (!f.containsAll(f))) {}
        }
      }
      else if ((h.a(o, o)) && (h.a(p, p)) && (h.a(q, q)) && (h.a(r, r)) && (h.a(s, s))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, Integer.valueOf(Arrays.hashCode(c)), d, e, f, o, p, q, r, s });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 2, a, paramInt, false);
    z.E(paramParcel, 3, b, paramInt, false);
    z.w(paramParcel, 4, c, false);
    z.I(paramParcel, 5, d, false);
    z.x(paramParcel, 6, e);
    z.I(paramParcel, 7, f, false);
    z.E(paramParcel, 8, o, paramInt, false);
    z.B(paramParcel, 9, p);
    z.E(paramParcel, 10, q, paramInt, false);
    Object localObject = r;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = a;
    }
    z.F(paramParcel, 11, (String)localObject, false);
    z.E(paramParcel, 12, s, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */