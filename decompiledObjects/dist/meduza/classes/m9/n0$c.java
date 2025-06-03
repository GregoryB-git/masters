package m9;

import eb.e1;
import f;
import java.util.List;
import ma.a0.c;
import ma.h;
import x6.b;

public final class n0$c
  extends n0
{
  public final n0.d a;
  public final List<Integer> b;
  public final h c;
  public final e1 d;
  
  public n0$c(n0.d paramd, a0.c paramc, h paramh, e1 parame1)
  {
    boolean bool;
    if ((parame1 != null) && (paramd != n0.d.c)) {
      bool = false;
    } else {
      bool = true;
    }
    b.Z("Got cause for a target change that was not a removal", bool, new Object[0]);
    a = paramd;
    b = paramc;
    c = paramh;
    if ((parame1 != null) && (!parame1.e())) {
      d = parame1;
    } else {
      d = null;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      Object localObject = (c)paramObject;
      if (a != a) {
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
      if (paramObject != null)
      {
        if ((localObject == null) || (!a.equals(a))) {
          bool2 = false;
        }
        return bool2;
      }
      if (localObject == null) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      return bool2;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    int k = c.hashCode();
    e1 locale1 = d;
    int m;
    if (locale1 != null) {
      m = a.hashCode();
    } else {
      m = 0;
    }
    return (k + (j + i * 31) * 31) * 31 + m;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("WatchTargetChange{changeType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", targetIds=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m9.n0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */