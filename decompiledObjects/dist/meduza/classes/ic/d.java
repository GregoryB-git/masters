package ic;

import java.util.Iterator;
import va.a;

public class d
  implements Iterable<Integer>
{
  public final int a;
  public final int b;
  public final int c;
  
  public d(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != 0)
    {
      if (paramInt3 != Integer.MIN_VALUE)
      {
        a = paramInt1;
        b = a.e(paramInt1, paramInt2, paramInt3);
        c = paramInt3;
        return;
      }
      throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    throw new IllegalArgumentException("Step must be non-zero.");
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof d)) {
      if ((!isEmpty()) || (!((d)paramObject).isEmpty()))
      {
        int i = a;
        paramObject = (d)paramObject;
        if ((i != a) || (b != b) || (c != c)) {}
      }
      else
      {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public int hashCode()
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = (a * 31 + b) * 31 + c;
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    int i = c;
    boolean bool = true;
    if (i > 0 ? a <= b : a >= b) {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator iterator()
  {
    return new e(a, b, c);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder;
    int i;
    if (c > 0)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append("..");
      localStringBuilder.append(b);
      localStringBuilder.append(" step ");
      i = c;
    }
    else
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append(" downTo ");
      localStringBuilder.append(b);
      localStringBuilder.append(" step ");
      i = -c;
    }
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ic.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */