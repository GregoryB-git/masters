package x2;

import ec.i;
import f;

public final class l
{
  public final String a;
  public final int b;
  
  public l(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof l)) {
      return false;
    }
    paramObject = (l)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return b == b;
  }
  
  public final int hashCode()
  {
    return a.hashCode() * 31 + b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("WorkGenerationalId(workSpecId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", generation=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */