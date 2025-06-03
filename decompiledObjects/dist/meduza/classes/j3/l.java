package j3;

import f;

public final class l
  extends v
{
  public final long a;
  
  public l(long paramLong)
  {
    a = paramLong;
  }
  
  public final long b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof v))
    {
      paramObject = (v)paramObject;
      if (a != ((v)paramObject).b()) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    return (int)(l ^ l >>> 32) ^ 0xF4243;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("LogResponse{nextRequestWaitMillis=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */