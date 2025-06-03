package g9;

import f;
import j9.j;
import java.util.ArrayList;
import java.util.List;
import t8.e;

public final class s0
{
  public final f0 a;
  public final j b;
  public final j c;
  public final List<i> d;
  public final boolean e;
  public final e<j9.i> f;
  public final boolean g;
  public boolean h;
  public boolean i;
  
  public s0(f0 paramf0, j paramj1, j paramj2, ArrayList paramArrayList, boolean paramBoolean1, e parame, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    a = paramf0;
    b = paramj1;
    c = paramj2;
    d = paramArrayList;
    e = paramBoolean1;
    f = parame;
    g = paramBoolean2;
    h = paramBoolean3;
    i = paramBoolean4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s0)) {
      return false;
    }
    paramObject = (s0)paramObject;
    if (e != e) {
      return false;
    }
    if (g != g) {
      return false;
    }
    if (h != h) {
      return false;
    }
    if (!a.equals(a)) {
      return false;
    }
    if (!f.equals(f)) {
      return false;
    }
    if (!b.equals(b)) {
      return false;
    }
    if (!c.equals(c)) {
      return false;
    }
    if (i != i) {
      return false;
    }
    return d.equals(d);
  }
  
  public final int hashCode()
  {
    int j = a.hashCode();
    int k = b.hashCode();
    int m = c.hashCode();
    int n = d.hashCode();
    return ((((f.hashCode() + (n + (m + (k + j * 31) * 31) * 31) * 31) * 31 + e) * 31 + g) * 31 + h) * 31 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ViewSnapshot(");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append(", ");
    localStringBuilder.append(d);
    localStringBuilder.append(", isFromCache=");
    localStringBuilder.append(e);
    localStringBuilder.append(", mutatedKeys=");
    localStringBuilder.append(f.size());
    localStringBuilder.append(", didSyncStateChange=");
    localStringBuilder.append(g);
    localStringBuilder.append(", excludesMetadataChanges=");
    localStringBuilder.append(h);
    localStringBuilder.append(", hasCachedResults=");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g9.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */