package u9;

import f;

public final class a
  extends h
{
  public final String a;
  public final long b;
  public final long c;
  
  public a(String paramString, long paramLong1, long paramLong2)
  {
    a = paramString;
    b = paramLong1;
    c = paramLong2;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final long b()
  {
    return c;
  }
  
  public final long c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      if ((!a.equals(((h)paramObject).a())) || (b != ((h)paramObject).c()) || (c != ((h)paramObject).b())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    long l = b;
    int j = (int)(l ^ l >>> 32);
    l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("InstallationTokenResult{token=");
    localStringBuilder.append(a);
    localStringBuilder.append(", tokenExpirationTimestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append(", tokenCreationTimestamp=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */