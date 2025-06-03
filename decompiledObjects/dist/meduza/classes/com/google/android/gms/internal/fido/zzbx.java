package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

public final class zzbx
{
  public static int zza(Set paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramSet = localIterator.next();
      int j;
      if (paramSet != null) {
        j = paramSet.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */