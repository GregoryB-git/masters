package m8;

import f;

public final class b0
  extends g0
{
  public final g0.a a;
  public final g0.c b;
  public final g0.b c;
  
  public b0(c0 paramc0, e0 parame0, d0 paramd0)
  {
    a = paramc0;
    b = parame0;
    c = paramd0;
  }
  
  public final g0.a a()
  {
    return a;
  }
  
  public final g0.b b()
  {
    return c;
  }
  
  public final g0.c c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g0))
    {
      paramObject = (g0)paramObject;
      if ((!a.equals(((g0)paramObject).a())) || (!b.equals(((g0)paramObject).c())) || (!c.equals(((g0)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("StaticSessionData{appData=");
    localStringBuilder.append(a);
    localStringBuilder.append(", osData=");
    localStringBuilder.append(b);
    localStringBuilder.append(", deviceData=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */