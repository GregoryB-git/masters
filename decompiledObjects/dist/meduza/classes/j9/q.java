package j9;

import a0.j;
import f;
import u7.m;

public final class q
  implements Comparable<q>
{
  public static final q b = new q(new m(0, 0L));
  public final m a;
  
  public q(m paramm)
  {
    a = paramm;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof q)) {
      return false;
    }
    if (f((q)paramObject) != 0) {
      bool = false;
    }
    return bool;
  }
  
  public final int f(q paramq)
  {
    return a.f(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SnapshotVersion(seconds=");
    localStringBuilder.append(a.a);
    localStringBuilder.append(", nanos=");
    return j.m(localStringBuilder, a.b, ")");
  }
}

/* Location:
 * Qualified Name:     j9.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */