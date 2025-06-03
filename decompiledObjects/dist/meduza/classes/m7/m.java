package m7;

import f;

public final class m
  extends n
{
  public final int a;
  public final long b;
  
  public m(int paramInt, long paramLong)
  {
    a = paramInt;
    b = paramLong;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final long b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      paramObject = (n)paramObject;
      if ((a == ((n)paramObject).a()) && (b == ((n)paramObject).b())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = b;
    int i = a;
    return (int)(l ^ l >>> 32) ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EventRecord{eventType=");
    localStringBuilder.append(a);
    localStringBuilder.append(", eventTimestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */