package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

public final class rn
{
  private final SparseArray<wi> a = new SparseArray();
  
  public final wi a(int paramInt)
  {
    wi localwi1 = (wi)a.get(paramInt);
    wi localwi2 = localwi1;
    if (localwi1 == null)
    {
      localwi2 = new wi(Long.MAX_VALUE);
      a.put(paramInt, localwi2);
    }
    return localwi2;
  }
  
  public final void a()
  {
    a.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */