package v3;

import e0.e;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;
import o7.l0;
import o7.t;
import o7.t.b;
import v5.e0;
import x6.b;
import z4.i0;

public final class s1
  implements g
{
  public static final s1 b;
  public final t<a> a;
  
  static
  {
    t.b localb = t.b;
    b = new s1(l0.e);
    e0.E(0);
  }
  
  public s1(l0 paraml0)
  {
    a = t.p(paraml0);
  }
  
  public final boolean a(int paramInt)
  {
    for (int i = 0; i < a.size(); i++)
    {
      a locala = (a)a.get(i);
      boolean[] arrayOfBoolean = e;
      int j = arrayOfBoolean.length;
      for (int k = 0; k < j; k++) {
        if (arrayOfBoolean[k] == 1)
        {
          k = 1;
          break label72;
        }
      }
      k = 0;
      label72:
      if ((k != 0) && (b.c == paramInt)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (s1.class == paramObject.getClass()))
    {
      paramObject = (s1)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public static final class a
    implements g
  {
    public static final String f = e0.E(0);
    public static final String o = e0.E(1);
    public static final String p = e0.E(3);
    public static final String q = e0.E(4);
    public final int a;
    public final i0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;
    
    static
    {
      new e(9);
    }
    
    public a(i0 parami0, boolean paramBoolean, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
    {
      int i = a;
      a = i;
      int j = paramArrayOfInt.length;
      boolean bool1 = false;
      if ((i == j) && (i == paramArrayOfBoolean.length)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b.q(bool2);
      b = parami0;
      boolean bool2 = bool1;
      if (paramBoolean)
      {
        bool2 = bool1;
        if (i > 1) {
          bool2 = true;
        }
      }
      c = bool2;
      d = ((int[])paramArrayOfInt.clone());
      e = ((boolean[])paramArrayOfBoolean.clone());
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((c != c) || (!b.equals(b)) || (!Arrays.equals(d, d)) || (!Arrays.equals(e, e))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = b.hashCode();
      int j = c;
      int k = Arrays.hashCode(d);
      return Arrays.hashCode(e) + (k + (i * 31 + j) * 31) * 31;
    }
  }
}

/* Location:
 * Qualified Name:     v3.s1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */