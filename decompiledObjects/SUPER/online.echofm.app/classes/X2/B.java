package X2;

import W2.m;
import W2.n;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class B
{
  public static boolean a(Iterable paramIterable, n paramn)
  {
    return C.b(paramIterable.iterator(), paramn);
  }
  
  public static Collection b(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      paramIterable = (Collection)paramIterable;
    } else {
      paramIterable = E.i(paramIterable.iterator());
    }
    return paramIterable;
  }
  
  public static Object c(Iterable paramIterable, Object paramObject)
  {
    return C.m(paramIterable.iterator(), paramObject);
  }
  
  public static Object d(Iterable paramIterable)
  {
    if ((paramIterable instanceof List))
    {
      paramIterable = (List)paramIterable;
      if (!paramIterable.isEmpty()) {
        return f(paramIterable);
      }
      throw new NoSuchElementException();
    }
    return C.k(paramIterable.iterator());
  }
  
  public static Object e(Iterable paramIterable, Object paramObject)
  {
    if ((paramIterable instanceof Collection))
    {
      if (((Collection)paramIterable).isEmpty()) {
        return paramObject;
      }
      if ((paramIterable instanceof List)) {
        return f(E.a(paramIterable));
      }
    }
    return C.l(paramIterable.iterator(), paramObject);
  }
  
  public static Object f(List paramList)
  {
    return paramList.get(paramList.size() - 1);
  }
  
  public static Object g(Iterable paramIterable)
  {
    return C.n(paramIterable.iterator());
  }
  
  public static boolean h(Iterable paramIterable, n paramn)
  {
    if (((paramIterable instanceof RandomAccess)) && ((paramIterable instanceof List))) {
      return i((List)paramIterable, (n)m.j(paramn));
    }
    return C.r(paramIterable.iterator(), paramn);
  }
  
  public static boolean i(List paramList, n paramn)
  {
    boolean bool = false;
    int i = 0;
    int k;
    for (int j = i; i < paramList.size(); j = k)
    {
      Object localObject = paramList.get(i);
      k = j;
      if (!paramn.apply(localObject))
      {
        if (i > j) {
          try
          {
            paramList.set(j, localObject);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            j(paramList, paramn, j, i);
            return true;
          }
          catch (UnsupportedOperationException localUnsupportedOperationException)
          {
            j(paramList, paramn, j, i);
            return true;
          }
        }
        k = j + 1;
      }
      i++;
    }
    paramList.subList(j, paramList.size()).clear();
    if (i != j) {
      bool = true;
    }
    return bool;
  }
  
  public static void j(List paramList, n paramn, int paramInt1, int paramInt2)
  {
    for (int i = paramList.size() - 1; i > paramInt2; i--) {
      if (paramn.apply(paramList.get(i))) {
        paramList.remove(i);
      }
    }
    paramInt2--;
    while (paramInt2 >= paramInt1)
    {
      paramList.remove(paramInt2);
      paramInt2--;
    }
  }
  
  public static Object[] k(Iterable paramIterable)
  {
    return b(paramIterable).toArray();
  }
}

/* Location:
 * Qualified Name:     X2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */