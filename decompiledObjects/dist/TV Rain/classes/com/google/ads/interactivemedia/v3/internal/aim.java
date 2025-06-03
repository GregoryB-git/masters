package com.google.ads.interactivemedia.v3.internal;

import a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import z2;

public class aim
{
  public Object[] a;
  public int b;
  public boolean c;
  
  public aim()
  {
    this(4);
  }
  
  public aim(int paramInt)
  {
    a = new Object[paramInt * 2];
    b = 0;
    c = false;
  }
  
  public static int a(int paramInt, double paramDouble)
  {
    paramInt = Math.max(paramInt, 2);
    int i = Integer.highestOneBit(paramInt);
    if (paramInt > (int)(i * 1.0D))
    {
      paramInt = i << 1;
      if (paramInt > 0) {
        return paramInt;
      }
      return 1073741824;
    }
    return i;
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      int i = paramInt1 + (paramInt1 >> 1) + 1;
      paramInt1 = i;
      if (i < paramInt2) {
        paramInt1 = Integer.highestOneBit(paramInt2 - 1) << 1;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < 0) {
        paramInt2 = Integer.MAX_VALUE;
      }
      return paramInt2;
    }
    throw new AssertionError("cannot store more than MAX_VALUE elements");
  }
  
  public static int a(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder(a.b(paramString, 40));
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static int a(Set<?> paramSet)
  {
    paramSet = paramSet.iterator();
    int i = 0;
    while (paramSet.hasNext())
    {
      Object localObject = paramSet.next();
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  public static <T> aio<T> a(T paramT)
  {
    return new aif(paramT);
  }
  
  public static Object a(Object paramObject, int paramInt)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(z2.k(20, "at index ", paramInt));
  }
  
  public static String a(Map<?, ?> paramMap)
  {
    StringBuilder localStringBuilder = d(paramMap.size());
    localStringBuilder.append('{');
    Iterator localIterator = paramMap.entrySet().iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      i = 0;
      localStringBuilder.append(paramMap.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(paramMap.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static <E> HashSet<E> a(int paramInt)
  {
    return new HashSet(c(4));
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      paramObject1 = String.valueOf(paramObject1);
      throw new NullPointerException(z2.l(((String)paramObject1).length() + 26, "null value in entry: ", (String)paramObject1, "=null"));
    }
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder(((String)paramObject1).length() + 24);
    ((StringBuilder)paramObject2).append("null key in entry: null=");
    ((StringBuilder)paramObject2).append((String)paramObject1);
    throw new NullPointerException(((StringBuilder)paramObject2).toString());
  }
  
  public static void a(boolean paramBoolean)
  {
    ahf.b(paramBoolean, "no calls to next() since the last call to remove()");
  }
  
  public static boolean a(Iterator<?> paramIterator1, Iterator<?> paramIterator2)
  {
    while (paramIterator1.hasNext())
    {
      if (!paramIterator2.hasNext()) {
        return false;
      }
      if (!ahf.a(paramIterator1.next(), paramIterator2.next())) {
        return false;
      }
    }
    return !paramIterator2.hasNext();
  }
  
  public static boolean a(List<?> paramList, Object paramObject)
  {
    if (paramObject == ahf.a(paramList)) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    paramObject = (List)paramObject;
    int i = paramList.size();
    if (i != ((List)paramObject).size()) {
      return false;
    }
    if (((paramList instanceof RandomAccess)) && ((paramObject instanceof RandomAccess)))
    {
      for (int j = 0; j < i; j++) {
        if (!ahf.a(paramList.get(j), ((List)paramObject).get(j))) {
          return false;
        }
      }
      return true;
    }
    return a(paramList.iterator(), ((List)paramObject).iterator());
  }
  
  public static boolean a(Map<?, ?> paramMap, Object paramObject)
  {
    if (paramMap == paramObject) {
      return true;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = (Map)paramObject;
      return paramMap.entrySet().equals(((Map)paramObject).entrySet());
    }
    return false;
  }
  
  public static boolean a(Set<?> paramSet, Object paramObject)
  {
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool = paramSet.containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static Object[] a(Object... paramVarArgs)
  {
    return b(paramVarArgs, paramVarArgs.length);
  }
  
  public static <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    return (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), paramInt);
  }
  
  public static int b(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return e(i);
  }
  
  public static int b(List<?> paramList, Object paramObject)
  {
    if ((paramList instanceof RandomAccess)) {
      return d(paramList, paramObject);
    }
    paramList = paramList.listIterator();
    while (paramList.hasNext()) {
      if (ahf.a(paramObject, paramList.next())) {
        return paramList.previousIndex();
      }
    }
    return -1;
  }
  
  public static <K, V> HashMap<K, V> b(int paramInt)
  {
    return new HashMap(c(2));
  }
  
  public static Object[] b(Object[] paramArrayOfObject, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      a(paramArrayOfObject[i], i);
    }
    return paramArrayOfObject;
  }
  
  public static int c(int paramInt)
  {
    if (paramInt < 3)
    {
      a(paramInt, "expectedSize");
      return paramInt + 1;
    }
    if (paramInt < 1073741824) {
      return (int)(paramInt / 0.75F + 1.0F);
    }
    return Integer.MAX_VALUE;
  }
  
  public static int c(List<?> paramList, Object paramObject)
  {
    if ((paramList instanceof RandomAccess)) {
      return e(paramList, paramObject);
    }
    paramList = paramList.listIterator(paramList.size());
    while (paramList.hasPrevious()) {
      if (ahf.a(paramObject, paramList.previous())) {
        return paramList.nextIndex();
      }
    }
    return -1;
  }
  
  private static int d(List<?> paramList, Object paramObject)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (paramObject == null) {
      for (j = k; j < i; j++) {
        if (paramList.get(j) == null) {
          return j;
        }
      }
    }
    while (j < i)
    {
      if (paramObject.equals(paramList.get(j))) {
        return j;
      }
      j++;
    }
    return -1;
  }
  
  public static StringBuilder d(int paramInt)
  {
    a(paramInt, "size");
    return new StringBuilder((int)Math.min(paramInt << 3, 1073741824L));
  }
  
  public static int e(int paramInt)
  {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  private static int e(List<?> paramList, Object paramObject)
  {
    if (paramObject == null) {
      for (i = paramList.size() - 1; i >= 0; i--) {
        if (paramList.get(i) == null) {
          return i;
        }
      }
    }
    for (int i = paramList.size() - 1; i >= 0; i--) {
      if (paramObject.equals(paramList.get(i))) {
        return i;
      }
    }
    return -1;
  }
  
  private void f(int paramInt)
  {
    paramInt <<= 1;
    Object[] arrayOfObject = a;
    if (paramInt > arrayOfObject.length)
    {
      a = Arrays.copyOf(arrayOfObject, a(arrayOfObject.length, paramInt));
      c = false;
    }
  }
  
  public aib a()
  {
    b();
    c = true;
    return aig.a(b, a);
  }
  
  public aim a(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection))
    {
      int i = b;
      f(((Collection)paramIterable).size() + i);
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      a((Map.Entry)paramIterable.next());
    }
    return this;
  }
  
  public aim a(Map.Entry paramEntry)
  {
    return b(paramEntry.getKey(), paramEntry.getValue());
  }
  
  public aim b(Object paramObject1, Object paramObject2)
  {
    f(b + 1);
    a(paramObject1, paramObject2);
    Object[] arrayOfObject = a;
    int i = b;
    arrayOfObject[(i * 2)] = paramObject1;
    arrayOfObject[(i * 2 + 1)] = paramObject2;
    b = (i + 1);
    return this;
  }
  
  public void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aim
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */