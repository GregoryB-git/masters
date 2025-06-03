package l6;

import W5.B;
import b6.c;

public class a
  implements Iterable, h6.a
{
  public static final a r = new a(null);
  public final int o;
  public final int p;
  public final int q;
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != 0)
    {
      if (paramInt3 != Integer.MIN_VALUE)
      {
        o = paramInt1;
        p = c.b(paramInt1, paramInt2, paramInt3);
        q = paramInt3;
        return;
      }
      throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    throw new IllegalArgumentException("Step must be non-zero.");
  }
  
  public final int a()
  {
    return o;
  }
  
  public final int d()
  {
    return p;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      if ((!isEmpty()) || (!((a)paramObject).isEmpty()))
      {
        int i = o;
        paramObject = (a)paramObject;
        if ((i != o) || (p != p) || (q != q)) {}
      }
      else
      {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int f()
  {
    return q;
  }
  
  public B g()
  {
    return new b(o, p, q);
  }
  
  public int hashCode()
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = (o * 31 + p) * 31 + q;
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    int i = q;
    boolean bool = false;
    if (i > 0)
    {
      if (o <= p) {}
    }
    else {
      while (o < p)
      {
        bool = true;
        break;
      }
    }
    return bool;
  }
  
  public String toString()
  {
    Object localObject;
    if (q > 0)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(o);
      ((StringBuilder)localObject).append("..");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append(" step ");
    }
    for (int i = q;; i = -q)
    {
      ((StringBuilder)localObject).append(i);
      localObject = ((StringBuilder)localObject).toString();
      break;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(o);
      ((StringBuilder)localObject).append(" downTo ");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append(" step ");
    }
    return (String)localObject;
  }
  
  public static final class a
  {
    public final a a(int paramInt1, int paramInt2, int paramInt3)
    {
      return new a(paramInt1, paramInt2, paramInt3);
    }
  }
}

/* Location:
 * Qualified Name:     l6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */