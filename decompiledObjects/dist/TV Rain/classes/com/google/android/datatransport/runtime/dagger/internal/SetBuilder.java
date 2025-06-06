package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SetBuilder<T>
{
  private static final String SET_CONTRIBUTIONS_CANNOT_BE_NULL = "Set contributions cannot be null";
  private final List<T> contributions;
  
  private SetBuilder(int paramInt)
  {
    contributions = new ArrayList(paramInt);
  }
  
  public static <T> SetBuilder<T> newSetBuilder(int paramInt)
  {
    return new SetBuilder(paramInt);
  }
  
  public SetBuilder<T> add(T paramT)
  {
    contributions.add(Preconditions.checkNotNull(paramT, "Set contributions cannot be null"));
    return this;
  }
  
  public SetBuilder<T> addAll(Collection<? extends T> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      Preconditions.checkNotNull(localIterator.next(), "Set contributions cannot be null");
    }
    contributions.addAll(paramCollection);
    return this;
  }
  
  public Set<T> build()
  {
    int i = contributions.size();
    if (i != 0)
    {
      if (i != 1) {
        return Collections.unmodifiableSet(new HashSet(contributions));
      }
      return Collections.singleton(contributions.get(0));
    }
    return Collections.emptySet();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.SetBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */