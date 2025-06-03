package X2;

import W2.m;
import java.util.Arrays;
import java.util.Collection;

public abstract class t$a
  extends t.b
{
  public Object[] a;
  public int b;
  public boolean c;
  
  public t$a(int paramInt)
  {
    i.b(paramInt, "initialCapacity");
    a = new Object[paramInt];
    b = 0;
  }
  
  public t.b b(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      g(b + localCollection.size());
      if ((localCollection instanceof t))
      {
        b = ((t)localCollection).d(a, b);
        return this;
      }
    }
    super.b(paramIterable);
    return this;
  }
  
  public a d(Object paramObject)
  {
    m.j(paramObject);
    g(b + 1);
    Object[] arrayOfObject = a;
    int i = b;
    b = (i + 1);
    arrayOfObject[i] = paramObject;
    return this;
  }
  
  public t.b e(Object... paramVarArgs)
  {
    f(paramVarArgs, paramVarArgs.length);
    return this;
  }
  
  public final void f(Object[] paramArrayOfObject, int paramInt)
  {
    O.c(paramArrayOfObject, paramInt);
    g(b + paramInt);
    System.arraycopy(paramArrayOfObject, 0, a, b, paramInt);
    b += paramInt;
  }
  
  public final void g(int paramInt)
  {
    Object[] arrayOfObject = a;
    if (arrayOfObject.length < paramInt) {}
    for (a = Arrays.copyOf(arrayOfObject, t.b.c(arrayOfObject.length, paramInt));; a = ((Object[])arrayOfObject.clone()))
    {
      c = false;
      break;
      if (!c) {
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     X2.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */