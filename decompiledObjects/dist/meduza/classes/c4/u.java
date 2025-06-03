package c4;

import f;

public final class u
{
  public static final u c = new u(0L, 0L);
  public final long a;
  public final long b;
  
  public u(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (u.class == paramObject.getClass()))
    {
      paramObject = (u)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)a * 31 + (int)b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[timeUs=");
    localStringBuilder.append(a);
    localStringBuilder.append(", position=");
    localStringBuilder.append(b);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     c4.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */