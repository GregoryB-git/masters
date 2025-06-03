package m2;

import java.util.Set;

public final class c$b
  extends f.b.a
{
  public Long a;
  public Long b;
  public Set c;
  
  public f.b a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" delta");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" maxAllowedDelay");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" flags");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new c(a.longValue(), b.longValue(), c, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public f.b.a b(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public f.b.a c(Set paramSet)
  {
    if (paramSet != null)
    {
      c = paramSet;
      return this;
    }
    throw new NullPointerException("Null flags");
  }
  
  public f.b.a d(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     m2.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */