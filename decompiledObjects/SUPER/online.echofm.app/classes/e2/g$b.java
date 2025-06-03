package e2;

import java.util.List;

public final class g$b
  extends m.a
{
  public Long a;
  public Long b;
  public k c;
  public Integer d;
  public String e;
  public List f;
  public p g;
  
  public m a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" requestTimeMs");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" requestUptimeMs");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new g(a.longValue(), b.longValue(), c, d, e, f, g, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public m.a b(k paramk)
  {
    c = paramk;
    return this;
  }
  
  public m.a c(List paramList)
  {
    f = paramList;
    return this;
  }
  
  public m.a d(Integer paramInteger)
  {
    d = paramInteger;
    return this;
  }
  
  public m.a e(String paramString)
  {
    e = paramString;
    return this;
  }
  
  public m.a f(p paramp)
  {
    g = paramp;
    return this;
  }
  
  public m.a g(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public m.a h(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     e2.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */