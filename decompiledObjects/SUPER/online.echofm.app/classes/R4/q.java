package R4;

import kotlin.jvm.internal.Intrinsics;

public final class q
{
  public final j a;
  public final t b;
  public final b c;
  
  public q(j paramj, t paramt, b paramb)
  {
    a = paramj;
    b = paramt;
    c = paramb;
  }
  
  public final b a()
  {
    return c;
  }
  
  public final j b()
  {
    return a;
  }
  
  public final t c()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof q)) {
      return false;
    }
    paramObject = (q)paramObject;
    if (a != a) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    return Intrinsics.a(c, c);
  }
  
  public int hashCode()
  {
    return (a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SessionEvent(eventType=");
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
 * Qualified Name:     R4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */