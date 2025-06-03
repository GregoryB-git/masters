package X2;

import W2.m;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class y$a
  extends t.a
{
  public Object[] d;
  public int e;
  
  public y$a()
  {
    super(4);
  }
  
  public a h(Object paramObject)
  {
    m.j(paramObject);
    if ((d != null) && (y.M(b) <= d.length))
    {
      k(paramObject);
      return this;
    }
    d = null;
    super.d(paramObject);
    return this;
  }
  
  public a i(Object... paramVarArgs)
  {
    if (d != null)
    {
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++) {
        h(paramVarArgs[j]);
      }
    }
    super.e(paramVarArgs);
    return this;
  }
  
  public a j(Iterable paramIterable)
  {
    m.j(paramIterable);
    if (d != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext()) {
        h(paramIterable.next());
      }
    }
    super.b(paramIterable);
    return this;
  }
  
  public final void k(Object paramObject)
  {
    Objects.requireNonNull(d);
    int i = d.length;
    int j = paramObject.hashCode();
    for (int k = s.b(j);; k++)
    {
      k &= i - 1;
      Object[] arrayOfObject = d;
      Object localObject = arrayOfObject[k];
      if (localObject == null)
      {
        arrayOfObject[k] = paramObject;
        e += j;
        super.d(paramObject);
        return;
      }
      if (localObject.equals(paramObject)) {
        return;
      }
    }
  }
  
  public y l()
  {
    int i = b;
    if (i != 0)
    {
      if (i != 1)
      {
        if ((d != null) && (y.M(i) == d.length))
        {
          if (y.s(b, a.length)) {}
          for (localObject = Arrays.copyOf(a, b);; localObject = a) {
            break;
          }
          i = e;
          Object[] arrayOfObject = d;
          localObject = new U((Object[])localObject, i, arrayOfObject, arrayOfObject.length - 1, b);
        }
        else
        {
          localObject = y.D(b, a);
          b = ((AbstractCollection)localObject).size();
        }
        c = true;
        d = null;
        return (y)localObject;
      }
      Object localObject = a[0];
      Objects.requireNonNull(localObject);
      return y.Y(localObject);
    }
    return y.X();
  }
}

/* Location:
 * Qualified Name:     X2.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */