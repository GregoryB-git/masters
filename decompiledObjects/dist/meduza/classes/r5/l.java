package r5;

import e0.d;
import java.util.Collections;
import java.util.List;
import o7.t;
import v3.g;
import v5.e0;
import z4.i0;

public final class l
  implements g
{
  public static final String c = e0.E(0);
  public static final String d = e0.E(1);
  public static final d e = new d(17);
  public final i0 a;
  public final t<Integer> b;
  
  public l(i0 parami0, List<Integer> paramList)
  {
    if ((!paramList.isEmpty()) && ((((Integer)Collections.min(paramList)).intValue() < 0) || (((Integer)Collections.max(paramList)).intValue() >= a))) {
      throw new IndexOutOfBoundsException();
    }
    a = parami0;
    b = t.p(paramList);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l.class == paramObject.getClass()))
    {
      paramObject = (l)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() * 31 + i;
  }
}

/* Location:
 * Qualified Name:     r5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */