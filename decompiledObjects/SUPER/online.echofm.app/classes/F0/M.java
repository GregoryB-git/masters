package F0;

import g0.a;

public abstract interface M
{
  public abstract boolean h();
  
  public abstract a j(long paramLong);
  
  public abstract long l();
  
  public static final class a
  {
    public final N a;
    public final N b;
    
    public a(N paramN)
    {
      this(paramN, paramN);
    }
    
    public a(N paramN1, N paramN2)
    {
      a = ((N)a.e(paramN1));
      b = ((N)a.e(paramN2));
    }
    
    public boolean equals(Object paramObject)
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
    
    public int hashCode()
    {
      return a.hashCode() * 31 + b.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append(a);
      Object localObject;
      if (a.equals(b))
      {
        localObject = "";
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(b);
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append((String)localObject);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static class b
    implements M
  {
    public final long a;
    public final M.a b;
    
    public b(long paramLong)
    {
      this(paramLong, 0L);
    }
    
    public b(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      N localN;
      if (paramLong2 == 0L) {
        localN = N.c;
      } else {
        localN = new N(0L, paramLong2);
      }
      b = new M.a(localN);
    }
    
    public boolean h()
    {
      return false;
    }
    
    public M.a j(long paramLong)
    {
      return b;
    }
    
    public long l()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     F0.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */