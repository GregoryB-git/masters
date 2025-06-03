package W5;

import g6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import l6.c;
import n6.b;

public class w
  extends v
{
  public static Comparable A(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Iterator localIterator = paramIterable.iterator();
    if (!localIterator.hasNext()) {
      return null;
    }
    paramIterable = (Comparable)localIterator.next();
    while (localIterator.hasNext())
    {
      Comparable localComparable = (Comparable)localIterator.next();
      if (paramIterable.compareTo(localComparable) > 0) {
        paramIterable = localComparable;
      }
    }
    return paramIterable;
  }
  
  public static Object B(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof List)) {
      return C((List)paramIterable);
    }
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      if (!paramIterable.hasNext()) {
        return localObject;
      }
      throw new IllegalArgumentException("Collection has more than one element.");
    }
    throw new NoSuchElementException("Collection is empty.");
  }
  
  public static final Object C(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    int i = paramList.size();
    if (i != 0)
    {
      if (i == 1) {
        return paramList.get(0);
      }
      throw new IllegalArgumentException("List has more than one element.");
    }
    throw new NoSuchElementException("List is empty.");
  }
  
  public static List D(List paramList, c paramc)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramc, "indices");
    if (paramc.isEmpty()) {
      return m.f();
    }
    return m.G((Iterable)paramList.subList(paramc.q().intValue(), paramc.k().intValue() + 1));
  }
  
  public static List E(Iterable paramIterable, Comparator paramComparator)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      if (localCollection.size() <= 1) {
        return m.G(paramIterable);
      }
      paramIterable = localCollection.toArray(new Object[0]);
      j.g(paramIterable, paramComparator);
      return g.b(paramIterable);
    }
    paramIterable = H(paramIterable);
    m.m(paramIterable, paramComparator);
    return paramIterable;
  }
  
  public static final Collection F(Iterable paramIterable, Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "destination");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      paramCollection.add(paramIterable.next());
    }
    return paramCollection;
  }
  
  public static List G(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      int i = localCollection.size();
      if (i != 0)
      {
        if (i != 1)
        {
          paramIterable = m.I(localCollection);
        }
        else
        {
          if ((paramIterable instanceof List)) {
            paramIterable = ((List)paramIterable).get(0);
          } else {
            paramIterable = paramIterable.iterator().next();
          }
          paramIterable = m.b(paramIterable);
        }
      }
      else {
        paramIterable = m.f();
      }
      return paramIterable;
    }
    return o.j(H(paramIterable));
  }
  
  public static final List H(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection)) {
      return m.I((Collection)paramIterable);
    }
    return (List)F(paramIterable, new ArrayList());
  }
  
  public static List I(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    return new ArrayList(paramCollection);
  }
  
  public static Set J(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      int i = localCollection.size();
      if (i != 0)
      {
        if (i != 1)
        {
          paramIterable = (Set)F(paramIterable, new LinkedHashSet(C.a(localCollection.size())));
        }
        else
        {
          if ((paramIterable instanceof List)) {
            paramIterable = ((List)paramIterable).get(0);
          } else {
            paramIterable = paramIterable.iterator().next();
          }
          paramIterable = I.a(paramIterable);
        }
      }
      else {
        paramIterable = I.b();
      }
      return paramIterable;
    }
    return K.e((Set)F(paramIterable, new LinkedHashSet()));
  }
  
  public static b n(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    return new a(paramIterable);
  }
  
  public static boolean o(Iterable paramIterable, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection)) {
      return ((Collection)paramIterable).contains(paramObject);
    }
    boolean bool;
    if (t(paramIterable, paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List p(Iterable paramIterable, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if (paramInt >= 0)
    {
      if (paramInt == 0) {
        return m.G(paramIterable);
      }
      Object localObject1;
      Object localObject2;
      if ((paramIterable instanceof Collection))
      {
        Collection localCollection = (Collection)paramIterable;
        i = localCollection.size() - paramInt;
        if (i <= 0) {
          return m.f();
        }
        if (i == 1) {
          return m.b(y(paramIterable));
        }
        localObject1 = new ArrayList(i);
        localObject2 = localObject1;
        if ((paramIterable instanceof List))
        {
          if ((paramIterable instanceof RandomAccess))
          {
            i = localCollection.size();
            while (paramInt < i)
            {
              ((ArrayList)localObject1).add(((List)paramIterable).get(paramInt));
              paramInt++;
            }
          }
          paramIterable = ((List)paramIterable).listIterator(paramInt);
          while (paramIterable.hasNext()) {
            ((ArrayList)localObject1).add(paramIterable.next());
          }
          return (List)localObject1;
        }
      }
      else
      {
        localObject2 = new ArrayList();
      }
      paramIterable = paramIterable.iterator();
      int i = 0;
      while (paramIterable.hasNext())
      {
        localObject1 = paramIterable.next();
        if (i >= paramInt) {
          ((ArrayList)localObject2).add(localObject1);
        } else {
          i++;
        }
      }
      return o.j((List)localObject2);
    }
    paramIterable = new StringBuilder();
    paramIterable.append("Requested element count ");
    paramIterable.append(paramInt);
    paramIterable.append(" is less than zero.");
    throw new IllegalArgumentException(paramIterable.toString().toString());
  }
  
  public static Object q(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof List)) {
      return m.r((List)paramIterable);
    }
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext()) {
      return paramIterable.next();
    }
    throw new NoSuchElementException("Collection is empty.");
  }
  
  public static Object r(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    if (!paramList.isEmpty()) {
      return paramList.get(0);
    }
    throw new NoSuchElementException("List is empty.");
  }
  
  public static Object s(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    if (paramList.isEmpty()) {
      paramList = null;
    } else {
      paramList = paramList.get(0);
    }
    return paramList;
  }
  
  public static final int t(Iterable paramIterable, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof List)) {
      return ((List)paramIterable).indexOf(paramObject);
    }
    paramIterable = paramIterable.iterator();
    for (int i = 0; paramIterable.hasNext(); i++)
    {
      Object localObject = paramIterable.next();
      if (i < 0) {
        m.k();
      }
      if (Intrinsics.a(paramObject, localObject)) {
        return i;
      }
    }
    return -1;
  }
  
  public static final Appendable u(Iterable paramIterable, Appendable paramAppendable, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramAppendable, "buffer");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramAppendable.append(paramCharSequence2);
    paramIterable = paramIterable.iterator();
    int i = 0;
    int j;
    for (;;)
    {
      j = i;
      if (!paramIterable.hasNext()) {
        break;
      }
      paramCharSequence2 = paramIterable.next();
      i++;
      if (i > 1) {
        paramAppendable.append(paramCharSequence1);
      }
      if (paramInt >= 0)
      {
        j = i;
        if (i > paramInt) {
          break;
        }
      }
      i.a(paramAppendable, paramCharSequence2, paraml);
    }
    if ((paramInt >= 0) && (j > paramInt)) {
      paramAppendable.append(paramCharSequence4);
    }
    paramAppendable.append(paramCharSequence3);
    return paramAppendable;
  }
  
  public static final String w(Iterable paramIterable, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, l paraml)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence1, "separator");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
    Intrinsics.checkNotNullParameter(paramCharSequence3, "postfix");
    Intrinsics.checkNotNullParameter(paramCharSequence4, "truncated");
    paramIterable = ((StringBuilder)u(paramIterable, new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paraml)).toString();
    Intrinsics.checkNotNullExpressionValue(paramIterable, "toString(...)");
    return paramIterable;
  }
  
  public static final Object y(Iterable paramIterable)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof List)) {
      return m.z((List)paramIterable);
    }
    paramIterable = paramIterable.iterator();
    if (paramIterable.hasNext())
    {
      Object localObject;
      do
      {
        localObject = paramIterable.next();
      } while (paramIterable.hasNext());
      return localObject;
    }
    throw new NoSuchElementException("Collection is empty.");
  }
  
  public static Object z(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    if (!paramList.isEmpty()) {
      return paramList.get(m.h(paramList));
    }
    throw new NoSuchElementException("List is empty.");
  }
  
  public static final class a
    implements b
  {
    public a(Iterable paramIterable) {}
    
    public Iterator iterator()
    {
      return a.iterator();
    }
  }
}

/* Location:
 * Qualified Name:     W5.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */