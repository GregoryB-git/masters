package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList<E>
  extends ArrayList<E>
{
  private ImmutableList(int paramInt)
  {
    super(paramInt);
  }
  
  private ImmutableList(List<E> paramList)
  {
    super(paramList);
  }
  
  public static <E> ImmutableList<E> copyOf(List<E> paramList)
  {
    return new ImmutableList(paramList);
  }
  
  public static <E> ImmutableList<E> of(E... paramVarArgs)
  {
    ImmutableList localImmutableList = new ImmutableList(paramVarArgs.length);
    Collections.addAll(localImmutableList, paramVarArgs);
    return localImmutableList;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.ImmutableList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */