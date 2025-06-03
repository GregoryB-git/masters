package ea;

import ec.i;
import f;

public final class y
{
  public final m a;
  public final f0 b;
  public final b c;
  
  public y(f0 paramf0, b paramb)
  {
    a = localm;
    b = paramf0;
    c = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof y)) {
      return false;
    }
    paramObject = (y)paramObject;
    if (a != a) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    return i.a(c, c);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    return c.hashCode() + (j + i * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionEvent(eventType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", sessionData=");
    localStringBuilder.append(b);
    localStringBuilder.append(", applicationInfo=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */