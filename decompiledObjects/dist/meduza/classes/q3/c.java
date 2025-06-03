package q3;

import f;
import g;
import java.util.Set;

public final class c
  extends e.a
{
  public final long a;
  public final long b;
  public final Set<e.b> c;
  
  public c(long paramLong1, long paramLong2, Set paramSet)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramSet;
  }
  
  public final long a()
  {
    return a;
  }
  
  public final Set<e.b> b()
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
    if ((paramObject instanceof e.a))
    {
      paramObject = (e.a)paramObject;
      if ((a != ((e.a)paramObject).a()) || (b != ((e.a)paramObject).c()) || (!c.equals(((e.a)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    return ((i ^ 0xF4243) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ConfigValue{delta=");
    localStringBuilder.append(a);
    localStringBuilder.append(", maxAllowedDelay=");
    localStringBuilder.append(b);
    localStringBuilder.append(", flags=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends e.a.a
  {
    public Long a;
    public Long b;
    public Set<e.b> c;
    
    public final c a()
    {
      if (a == null) {
        localObject1 = " delta";
      } else {
        localObject1 = "";
      }
      Object localObject2 = localObject1;
      if (b == null) {
        localObject2 = g.d((String)localObject1, " maxAllowedDelay");
      }
      Object localObject1 = localObject2;
      if (c == null) {
        localObject1 = g.d((String)localObject2, " flags");
      }
      if (((String)localObject1).isEmpty()) {
        return new c(a.longValue(), b.longValue(), c);
      }
      throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
    }
  }
}

/* Location:
 * Qualified Name:     q3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */