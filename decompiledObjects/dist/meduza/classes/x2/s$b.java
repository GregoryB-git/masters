package x2;

import ec.i;
import f;
import o2.o.b;

public final class s$b
{
  public String a;
  public o.b b;
  
  public s$b(o.b paramb, String paramString)
  {
    a = paramString;
    b = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return b == b;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IdAndState(id=");
    localStringBuilder.append(a);
    localStringBuilder.append(", state=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x2.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */