package m9;

import f;
import j9.i;
import j9.m;
import java.util.List;
import ma.a0.c;

public final class n0$a
  extends n0
{
  public final List<Integer> a;
  public final List<Integer> b;
  public final i c;
  public final m d;
  
  public n0$a(List paramList, a0.c paramc, i parami, m paramm)
  {
    a = paramList;
    b = paramc;
    c = parami;
    d = paramm;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      Object localObject = (a)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      if (!c.equals(c)) {
        return false;
      }
      paramObject = d;
      localObject = d;
      if (paramObject != null) {
        bool = ((m)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    int k = c.hashCode();
    m localm = d;
    int m;
    if (localm != null) {
      m = localm.hashCode();
    } else {
      m = 0;
    }
    return (k + (j + i * 31) * 31) * 31 + m;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DocumentChange{updatedTargetIds=");
    localStringBuilder.append(a);
    localStringBuilder.append(", removedTargetIds=");
    localStringBuilder.append(b);
    localStringBuilder.append(", key=");
    localStringBuilder.append(c);
    localStringBuilder.append(", newDocument=");
    localStringBuilder.append(d);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m9.n0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */