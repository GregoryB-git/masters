package F0;

import g0.a;

public final class M$a
{
  public final N a;
  public final N b;
  
  public M$a(N paramN)
  {
    this(paramN, paramN);
  }
  
  public M$a(N paramN1, N paramN2)
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

/* Location:
 * Qualified Name:     F0.M.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */