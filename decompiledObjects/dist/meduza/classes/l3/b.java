package l3;

import f;

public final class b
  extends g
{
  public final int a;
  public final long b;
  
  public b(int paramInt, long paramLong)
  {
    if (paramInt != 0)
    {
      a = paramInt;
      b = paramLong;
      return;
    }
    throw new NullPointerException("Null status");
  }
  
  public final long a()
  {
    return b;
  }
  
  public final int b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g))
    {
      paramObject = (g)paramObject;
      if ((!q0.g.b(a, ((g)paramObject).b())) || (b != ((g)paramObject).a())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = q0.g.c(a);
    long l = b;
    return (i ^ 0xF4243) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BackendResponse{status=");
    localStringBuilder.append(g.r(a));
    localStringBuilder.append(", nextRequestWaitMillis=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     l3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */