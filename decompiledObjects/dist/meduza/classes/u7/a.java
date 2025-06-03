package u7;

import f;

public final class a
  extends l
{
  public final long a;
  public final long b;
  public final long c;
  
  public a(long paramLong1, long paramLong2, long paramLong3)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
  }
  
  public final long a()
  {
    return b;
  }
  
  public final long b()
  {
    return a;
  }
  
  public final long c()
  {
    return c;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof l))
    {
      paramObject = (l)paramObject;
      if ((a != ((l)paramObject).b()) || (b != ((l)paramObject).a()) || (c != ((l)paramObject).c())) {
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
    int j = (int)(l ^ l >>> 32);
    l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l >>> 32 ^ l);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("StartupTime{epochMillis=");
    localStringBuilder.append(a);
    localStringBuilder.append(", elapsedRealtime=");
    localStringBuilder.append(b);
    localStringBuilder.append(", uptimeMillis=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */