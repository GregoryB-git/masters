package s3;

public final class a
  extends n
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
  
  public long b()
  {
    return b;
  }
  
  public long c()
  {
    return a;
  }
  
  public long d()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      paramObject = (n)paramObject;
      if ((a != ((n)paramObject).c()) || (b != ((n)paramObject).b()) || (c != ((n)paramObject).d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    int j = (int)(l ^ l >>> 32);
    l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l >>> 32 ^ l);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("StartupTime{epochMillis=");
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
 * Qualified Name:     s3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */