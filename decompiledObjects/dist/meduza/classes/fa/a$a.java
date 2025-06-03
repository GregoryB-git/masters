package fa;

import ec.i;
import f;
import vc.a;
import vc.d;

public final class a$a
{
  public final a a;
  public b b;
  
  public a$a(d paramd)
  {
    a = paramd;
    b = null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    b localb = b;
    int j;
    if (localb == null) {
      j = 0;
    } else {
      j = localb.hashCode();
    }
    return i * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Dependency(mutex=");
    localStringBuilder.append(a);
    localStringBuilder.append(", subscriber=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     fa.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */