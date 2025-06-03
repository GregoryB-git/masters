package f2;

import java.util.Map;

public final class b$b
  extends i.a
{
  public String a;
  public Integer b;
  public h c;
  public Long d;
  public Long e;
  public Map f;
  
  public i d()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" transportName");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (c == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" encodedPayload");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (d == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" eventMillis");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (e == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" uptimeMillis");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (f == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" autoMetadata");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new b(a, b, c, d.longValue(), e.longValue(), f, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public Map e()
  {
    Map localMap = f;
    if (localMap != null) {
      return localMap;
    }
    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
  }
  
  public i.a f(Map paramMap)
  {
    if (paramMap != null)
    {
      f = paramMap;
      return this;
    }
    throw new NullPointerException("Null autoMetadata");
  }
  
  public i.a g(Integer paramInteger)
  {
    b = paramInteger;
    return this;
  }
  
  public i.a h(h paramh)
  {
    if (paramh != null)
    {
      c = paramh;
      return this;
    }
    throw new NullPointerException("Null encodedPayload");
  }
  
  public i.a i(long paramLong)
  {
    d = Long.valueOf(paramLong);
    return this;
  }
  
  public i.a j(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null transportName");
  }
  
  public i.a k(long paramLong)
  {
    e = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     f2.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */