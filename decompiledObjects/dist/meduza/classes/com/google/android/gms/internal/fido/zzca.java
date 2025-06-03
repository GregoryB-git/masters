package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.SortedSet;

final class zzca
{
  public static boolean zza(Comparator paramComparator, Iterable paramIterable)
  {
    paramComparator.getClass();
    paramIterable.getClass();
    if ((paramIterable instanceof SortedSet))
    {
      Comparator localComparator = ((SortedSet)paramIterable).comparator();
      paramIterable = localComparator;
      if (localComparator == null) {
        paramIterable = zzbp.zza;
      }
    }
    else
    {
      if (!(paramIterable instanceof zzbz)) {
        break label63;
      }
      paramIterable = ((zzbz)paramIterable).comparator();
    }
    return paramComparator.equals(paramIterable);
    label63:
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */