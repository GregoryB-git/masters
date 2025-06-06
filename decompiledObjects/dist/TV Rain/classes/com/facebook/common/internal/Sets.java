package com.facebook.common.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class Sets
{
  public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet()
  {
    return new CopyOnWriteArraySet();
  }
  
  public static <E> HashSet<E> newHashSet()
  {
    return new HashSet();
  }
  
  public static <E> HashSet<E> newHashSet(Iterable<? extends E> paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      paramIterable = new HashSet((Collection)paramIterable);
    } else {
      paramIterable = newHashSet(paramIterable.iterator());
    }
    return paramIterable;
  }
  
  public static <E> HashSet<E> newHashSet(Iterator<? extends E> paramIterator)
  {
    HashSet localHashSet = newHashSet();
    while (paramIterator.hasNext()) {
      localHashSet.add(paramIterator.next());
    }
    return localHashSet;
  }
  
  public static <E> HashSet<E> newHashSet(E... paramVarArgs)
  {
    HashSet localHashSet = newHashSetWithCapacity(paramVarArgs.length);
    Collections.addAll(localHashSet, paramVarArgs);
    return localHashSet;
  }
  
  public static <E> HashSet<E> newHashSetWithCapacity(int paramInt)
  {
    return new HashSet(paramInt);
  }
  
  public static <E> Set<E> newIdentityHashSet()
  {
    return newSetFromMap(new IdentityHashMap());
  }
  
  public static <E> LinkedHashSet<E> newLinkedHashSet()
  {
    return new LinkedHashSet();
  }
  
  public static <E> Set<E> newSetFromMap(Map<E, Boolean> paramMap)
  {
    return Collections.newSetFromMap(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Sets
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */