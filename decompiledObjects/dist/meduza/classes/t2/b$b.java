package t2;

import f;

public final class b$b
  extends b
{
  public final int a;
  
  public b$b(int paramInt)
  {
    a = paramInt;
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
    return a == a;
  }
  
  public final int hashCode()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ConstraintsNotMet(reason=");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     t2.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */