package e2;

public final class h
  extends n
{
  public final long a;
  
  public h(long paramLong)
  {
    a = paramLong;
  }
  
  public long c()
  {
    return a;
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
      if (a != ((n)paramObject).c()) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = a;
    return (int)(l ^ l >>> 32) ^ 0xF4243;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LogResponse{nextRequestWaitMillis=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     e2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */