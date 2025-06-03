package a3;

import W2.m;
import java.io.Serializable;
import java.util.Arrays;

public final class e
  implements Serializable
{
  public static final e r = new e(new int[0]);
  public final int[] o;
  public final transient int p;
  public final int q;
  
  public e(int[] paramArrayOfInt)
  {
    this(paramArrayOfInt, 0, paramArrayOfInt.length);
  }
  
  public e(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    o = paramArrayOfInt;
    p = paramInt1;
    q = paramInt2;
  }
  
  public static e a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0) {
      paramArrayOfInt = r;
    } else {
      paramArrayOfInt = new e(Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length));
    }
    return paramArrayOfInt;
  }
  
  public static e f()
  {
    return r;
  }
  
  public int b(int paramInt)
  {
    m.h(paramInt, e());
    return o[(p + paramInt)];
  }
  
  public boolean c()
  {
    boolean bool;
    if (q == p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((p <= 0) && (q >= o.length)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int e()
  {
    return q - p;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if (e() != ((e)paramObject).e()) {
      return false;
    }
    for (int i = 0; i < e(); i++) {
      if (b(i) != ((e)paramObject).b(i)) {
        return false;
      }
    }
    return true;
  }
  
  public int[] g()
  {
    return Arrays.copyOfRange(o, p, q);
  }
  
  public e h()
  {
    e locale;
    if (d()) {
      locale = new e(g());
    } else {
      locale = this;
    }
    return locale;
  }
  
  public int hashCode()
  {
    int i = p;
    int j = 1;
    while (i < q)
    {
      j = j * 31 + f.i(o[i]);
      i++;
    }
    return j;
  }
  
  public Object readResolve()
  {
    e locale;
    if (c()) {
      locale = r;
    } else {
      locale = this;
    }
    return locale;
  }
  
  public String toString()
  {
    if (c()) {
      return "[]";
    }
    StringBuilder localStringBuilder = new StringBuilder(e() * 5);
    localStringBuilder.append('[');
    localStringBuilder.append(o[p]);
    int i = p;
    for (;;)
    {
      i++;
      if (i >= q) {
        break;
      }
      localStringBuilder.append(", ");
      localStringBuilder.append(o[i]);
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public Object writeReplace()
  {
    return h();
  }
}

/* Location:
 * Qualified Name:     a3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */