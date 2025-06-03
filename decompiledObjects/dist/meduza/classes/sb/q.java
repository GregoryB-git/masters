package sb;

import a0.j;
import dc.l;
import ec.i;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p2.m0;
import va.a;

public class q
  extends p
{
  public static final boolean l(Collection paramCollection, Serializable paramSerializable)
  {
    i.e(paramCollection, "<this>");
    return paramCollection.contains(paramSerializable);
  }
  
  public static final ArrayList m(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = localIterator.next();
      if (paramList != null) {
        localArrayList.add(paramList);
      }
    }
    return localArrayList;
  }
  
  public static final <T> T n(List<? extends T> paramList)
  {
    i.e(paramList, "<this>");
    if (!paramList.isEmpty()) {
      return (T)paramList.get(0);
    }
    throw new NoSuchElementException("List is empty.");
  }
  
  public static final void o(Iterable paramIterable, StringBuilder paramStringBuilder, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, l paraml)
  {
    i.e(paramIterable, "<this>");
    i.e(paramCharSequence1, "separator");
    i.e(paramCharSequence2, "prefix");
    i.e(paramCharSequence3, "postfix");
    i.e(paramCharSequence4, "truncated");
    paramStringBuilder.append(paramCharSequence2);
    paramCharSequence2 = paramIterable.iterator();
    int i = 0;
    int j;
    for (;;)
    {
      j = i;
      if (!paramCharSequence2.hasNext()) {
        break;
      }
      paramIterable = paramCharSequence2.next();
      i++;
      if (i > 1) {
        paramStringBuilder.append(paramCharSequence1);
      }
      if (paramInt >= 0)
      {
        j = i;
        if (i > paramInt) {
          break;
        }
      }
      m0.g(paramStringBuilder, paramIterable, paraml);
    }
    if ((paramInt >= 0) && (j > paramInt)) {
      paramStringBuilder.append(paramCharSequence4);
    }
    paramStringBuilder.append(paramCharSequence3);
  }
  
  public static String p(Iterable paramIterable, String paramString1, String paramString2, String paramString3, l paraml, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramString1 = ", ";
    }
    if ((paramInt & 0x2) != 0) {
      paramString2 = "";
    }
    if ((paramInt & 0x4) != 0) {
      paramString3 = "";
    }
    int i;
    if ((paramInt & 0x8) != 0) {
      i = -1;
    } else {
      i = 0;
    }
    String str;
    if ((paramInt & 0x10) != 0) {
      str = "...";
    } else {
      str = null;
    }
    if ((paramInt & 0x20) != 0) {
      paraml = null;
    }
    i.e(paramIterable, "<this>");
    i.e(paramString1, "separator");
    i.e(paramString2, "prefix");
    i.e(paramString3, "postfix");
    i.e(str, "truncated");
    StringBuilder localStringBuilder = new StringBuilder();
    o(paramIterable, localStringBuilder, paramString1, paramString2, paramString3, i, str, paraml);
    return localStringBuilder.toString();
  }
  
  public static final List q(List paramList, int paramInt)
  {
    i.e(paramList, "<this>");
    int i;
    if (paramInt >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramInt == 0) {
        return s.a;
      }
      if (paramInt >= paramList.size()) {
        return u(paramList);
      }
      if (paramInt == 1) {
        return a.f(n(paramList));
      }
      ArrayList localArrayList = new ArrayList(paramInt);
      paramList = paramList.iterator();
      i = 0;
      int j;
      do
      {
        if (!paramList.hasNext()) {
          break;
        }
        localArrayList.add(paramList.next());
        j = i + 1;
        i = j;
      } while (j != paramInt);
      paramInt = localArrayList.size();
      if (paramInt != 0)
      {
        if (paramInt != 1) {
          paramList = localArrayList;
        } else {
          paramList = a.f(localArrayList.get(0));
        }
      }
      else {
        paramList = s.a;
      }
      return paramList;
    }
    throw new IllegalArgumentException(j.h("Requested element count ", paramInt, " is less than zero.").toString());
  }
  
  public static final byte[] r(ArrayList paramArrayList)
  {
    byte[] arrayOfByte = new byte[paramArrayList.size()];
    paramArrayList = paramArrayList.iterator();
    for (int i = 0; paramArrayList.hasNext(); i++) {
      arrayOfByte[i] = ((Number)paramArrayList.next()).byteValue();
    }
    return arrayOfByte;
  }
  
  public static final void s(Iterable paramIterable, AbstractCollection paramAbstractCollection)
  {
    i.e(paramIterable, "<this>");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      paramAbstractCollection.add(paramIterable.next());
    }
  }
  
  public static final int[] t(ArrayList paramArrayList)
  {
    int[] arrayOfInt = new int[paramArrayList.size()];
    paramArrayList = paramArrayList.iterator();
    for (int i = 0; paramArrayList.hasNext(); i++) {
      arrayOfInt[i] = ((Number)paramArrayList.next()).intValue();
    }
    return arrayOfInt;
  }
  
  public static final <T> List<T> u(Iterable<? extends T> paramIterable)
  {
    i.e(paramIterable, "<this>");
    boolean bool = paramIterable instanceof Collection;
    Object localObject;
    if (bool)
    {
      localObject = (Collection)paramIterable;
      i = ((Collection)localObject).size();
      if (i != 0)
      {
        if (i != 1)
        {
          paramIterable = w((Collection)localObject);
        }
        else
        {
          if ((paramIterable instanceof List)) {
            paramIterable = ((List)paramIterable).get(0);
          } else {
            paramIterable = ((Collection)localObject).iterator().next();
          }
          paramIterable = a.f(paramIterable);
        }
      }
      else {
        paramIterable = s.a;
      }
      return paramIterable;
    }
    if (bool)
    {
      paramIterable = w((Collection)paramIterable);
    }
    else
    {
      localObject = new ArrayList();
      s(paramIterable, (AbstractCollection)localObject);
      paramIterable = (Iterable<? extends T>)localObject;
    }
    int i = paramIterable.size();
    if (i != 0)
    {
      if (i == 1) {
        paramIterable = a.f(paramIterable.get(0));
      }
    }
    else {
      paramIterable = s.a;
    }
    return paramIterable;
  }
  
  public static final long[] v(Collection<Long> paramCollection)
  {
    i.e(paramCollection, "<this>");
    long[] arrayOfLong = new long[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    for (int i = 0; paramCollection.hasNext(); i++) {
      arrayOfLong[i] = ((Number)paramCollection.next()).longValue();
    }
    return arrayOfLong;
  }
  
  public static final ArrayList w(Collection paramCollection)
  {
    i.e(paramCollection, "<this>");
    return new ArrayList(paramCollection);
  }
  
  public static final <T> Set<T> x(Iterable<? extends T> paramIterable)
  {
    i.e(paramIterable, "<this>");
    if ((paramIterable instanceof Collection))
    {
      localObject = (Collection)paramIterable;
      i = ((Collection)localObject).size();
      if (i != 0)
      {
        if (i != 1)
        {
          localObject = new LinkedHashSet(y.H0(((Collection)localObject).size()));
          s(paramIterable, (AbstractCollection)localObject);
          paramIterable = (Iterable<? extends T>)localObject;
        }
        else
        {
          if ((paramIterable instanceof List)) {
            paramIterable = ((List)paramIterable).get(0);
          } else {
            paramIterable = ((Collection)localObject).iterator().next();
          }
          paramIterable = Collections.singleton(paramIterable);
          i.d(paramIterable, "singleton(...)");
        }
      }
      else {
        paramIterable = u.a;
      }
      return paramIterable;
    }
    Object localObject = new LinkedHashSet();
    s(paramIterable, (AbstractCollection)localObject);
    int i = ((Set)localObject).size();
    if (i != 0)
    {
      if (i != 1)
      {
        paramIterable = (Iterable<? extends T>)localObject;
      }
      else
      {
        paramIterable = Collections.singleton(((Set)localObject).iterator().next());
        i.d(paramIterable, "singleton(...)");
      }
    }
    else {
      paramIterable = u.a;
    }
    return paramIterable;
  }
}

/* Location:
 * Qualified Name:     sb.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */