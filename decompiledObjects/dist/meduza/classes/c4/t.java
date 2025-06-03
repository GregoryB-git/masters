package c4;

import f;
import g;

public abstract interface t
{
  public abstract boolean e();
  
  public abstract a g(long paramLong);
  
  public abstract long h();
  
  public static final class a
  {
    public final u a;
    public final u b;
    
    public a() {}
    
    public a(u paramu1, u paramu2)
    {
      a = paramu1;
      b = paramu2;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((!a.equals(a)) || (!b.equals(b))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      return b.hashCode() + i * 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("[");
      localStringBuilder.append(a);
      Object localObject;
      if (a.equals(b))
      {
        localObject = "";
      }
      else
      {
        localObject = f.l(", ");
        ((StringBuilder)localObject).append(b);
        localObject = ((StringBuilder)localObject).toString();
      }
      return g.f(localStringBuilder, (String)localObject, "]");
    }
  }
  
  public static class b
    implements t
  {
    public final long a;
    public final t.a b;
    
    public b(long paramLong)
    {
      this(paramLong, 0L);
    }
    
    public b(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      u localu;
      if (paramLong2 == 0L) {
        localu = u.c;
      } else {
        localu = new u(0L, paramLong2);
      }
      b = new t.a(localu, localu);
    }
    
    public final boolean e()
    {
      return false;
    }
    
    public final t.a g(long paramLong)
    {
      return b;
    }
    
    public final long h()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     c4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */