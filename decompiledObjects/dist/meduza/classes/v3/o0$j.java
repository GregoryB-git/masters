package v3;

import android.net.Uri;
import v5.e0;

public class o0$j
{
  public final Uri a;
  public final String b;
  public final String c;
  public final int d;
  public final int e;
  public final String f;
  public final String g;
  
  public o0$j(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof j)) {
      return false;
    }
    paramObject = (j)paramObject;
    if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (d != d) || (e != e) || (!e0.a(f, f)) || (!e0.a(g, g))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    String str = b;
    int j = 0;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    str = c;
    int m;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    int n = d;
    int i1 = e;
    str = f;
    int i2;
    if (str == null) {
      i2 = 0;
    } else {
      i2 = str.hashCode();
    }
    str = g;
    if (str != null) {
      j = str.hashCode();
    }
    return (((((i * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + j;
  }
  
  public static final class a
  {
    public Uri a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    
    public a(o0.j paramj)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
    }
  }
}

/* Location:
 * Qualified Name:     v3.o0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */