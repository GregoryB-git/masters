package o2;

import ec.i;
import f;

public final class o$a
{
  public final long a;
  public final long b;
  
  public o$a(long paramLong1, long paramLong2)
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
    if ((paramObject != null) && (i.a(a.class, paramObject.getClass())))
    {
      paramObject = (a)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    return i * 31 + (int)(l >>> 32 ^ l);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PeriodicityInfo{repeatIntervalMillis=");
    localStringBuilder.append(a);
    localStringBuilder.append(", flexIntervalMillis=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o2.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */