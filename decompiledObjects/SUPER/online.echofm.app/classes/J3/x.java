package J3;

public final class x
  extends D
{
  public final D.a a;
  public final D.c b;
  public final D.b c;
  
  public x(D.a parama, D.c paramc, D.b paramb)
  {
    if (parama != null)
    {
      a = parama;
      if (paramc != null)
      {
        b = paramc;
        if (paramb != null)
        {
          c = paramb;
          return;
        }
        throw new NullPointerException("Null deviceData");
      }
      throw new NullPointerException("Null osData");
    }
    throw new NullPointerException("Null appData");
  }
  
  public D.a a()
  {
    return a;
  }
  
  public D.b c()
  {
    return c;
  }
  
  public D.c d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof D))
    {
      paramObject = (D)paramObject;
      if ((!a.equals(((D)paramObject).a())) || (!b.equals(((D)paramObject).d())) || (!c.equals(((D)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("StaticSessionData{appData=");
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
 * Qualified Name:     J3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */