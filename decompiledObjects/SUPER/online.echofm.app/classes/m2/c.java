package m2;

import java.util.Set;

public final class c
  extends f.b
{
  public final long a;
  public final long b;
  public final Set c;
  
  public c(long paramLong1, long paramLong2, Set paramSet)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramSet;
  }
  
  public long b()
  {
    return a;
  }
  
  public Set c()
  {
    return c;
  }
  
  public long d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f.b))
    {
      paramObject = (f.b)paramObject;
      if ((a != ((f.b)paramObject).b()) || (b != ((f.b)paramObject).d()) || (!c.equals(((f.b)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    return ((i ^ 0xF4243) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ConfigValue{delta=");
    localStringBuilder.append(a);
    localStringBuilder.append(", maxAllowedDelay=");
    localStringBuilder.append(b);
    localStringBuilder.append(", flags=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     m2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */