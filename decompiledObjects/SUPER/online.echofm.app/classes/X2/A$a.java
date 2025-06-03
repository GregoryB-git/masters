package X2;

import W2.m;
import java.util.AbstractCollection;
import java.util.Comparator;

public final class A$a
  extends y.a
{
  public final Comparator f;
  
  public A$a(Comparator paramComparator)
  {
    f = ((Comparator)m.j(paramComparator));
  }
  
  public a m(Object paramObject)
  {
    super.h(paramObject);
    return this;
  }
  
  public a n(Object... paramVarArgs)
  {
    super.i(paramVarArgs);
    return this;
  }
  
  public a o(Iterable paramIterable)
  {
    super.j(paramIterable);
    return this;
  }
  
  public A p()
  {
    Object localObject = a;
    localObject = A.e0(f, b, (Object[])localObject);
    b = ((AbstractCollection)localObject).size();
    c = true;
    return (A)localObject;
  }
}

/* Location:
 * Qualified Name:     X2.A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */