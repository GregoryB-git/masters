package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet<E>
  extends HashSet<E>
{
  private ImmutableSet(Set<E> paramSet)
  {
    super(paramSet);
  }
  
  public static <E> ImmutableSet<E> copyOf(Set<E> paramSet)
  {
    return new ImmutableSet(paramSet);
  }
  
  public static <E> ImmutableSet<E> of(E... paramVarArgs)
  {
    HashSet localHashSet = new HashSet(paramVarArgs.length);
    Collections.addAll(localHashSet, paramVarArgs);
    return new ImmutableSet(localHashSet);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.ImmutableSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */