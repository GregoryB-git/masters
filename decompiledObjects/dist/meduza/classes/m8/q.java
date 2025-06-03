package m8;

import f;

public final class q
  extends f0.e.d.a.b.c
{
  public final String a;
  public final String b;
  public final long c;
  
  public q(String paramString1, String paramString2, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  public final long a()
  {
    return c;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final String c()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b.c))
    {
      paramObject = (f0.e.d.a.b.c)paramObject;
      if ((!a.equals(((f0.e.d.a.b.c)paramObject).c())) || (!b.equals(((f0.e.d.a.b.c)paramObject).b())) || (c != ((f0.e.d.a.b.c)paramObject).a())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    long l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Signal{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", code=");
    localStringBuilder.append(b);
    localStringBuilder.append(", address=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */