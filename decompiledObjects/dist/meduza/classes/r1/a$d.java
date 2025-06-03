package r1;

import ec.i;
import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.h;

public final class a$d
{
  public final String a;
  public final boolean b;
  public final List<String> c;
  public List<String> d;
  
  public a$d(String paramString, boolean paramBoolean, List<String> paramList1, List<String> paramList2)
  {
    a = paramString;
    b = paramBoolean;
    c = paramList1;
    d = paramList2;
    paramString = paramList2;
    if (paramList2.isEmpty())
    {
      int i = paramList1.size();
      paramList1 = new ArrayList(i);
      for (int j = 0;; j++)
      {
        paramString = paramList1;
        if (j >= i) {
          break;
        }
        paramList1.add("ASC");
      }
    }
    d = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    boolean bool = b;
    paramObject = (d)paramObject;
    if (bool != b) {
      return false;
    }
    if (!i.a(c, c)) {
      return false;
    }
    if (!i.a(d, d)) {
      return false;
    }
    if (h.n0(a, "index_")) {
      bool = h.n0(a, "index_");
    } else {
      bool = i.a(a, a);
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i;
    if (h.n0(a, "index_")) {
      i = -1184239155;
    } else {
      i = a.hashCode();
    }
    int j = b;
    int k = c.hashCode();
    return d.hashCode() + (k + (i * 31 + j) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Index{name='");
    localStringBuilder.append(a);
    localStringBuilder.append("', unique=");
    localStringBuilder.append(b);
    localStringBuilder.append(", columns=");
    localStringBuilder.append(c);
    localStringBuilder.append(", orders=");
    localStringBuilder.append(d);
    localStringBuilder.append("'}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r1.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */