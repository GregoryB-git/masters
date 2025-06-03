package com.google.android.recaptcha.internal;

import ec.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sb.k;
import sb.s;

public final class zzhy
{
  private List zza = s.a;
  
  public final long zza(long[] paramArrayOfLong)
  {
    Object localObject = zza;
    paramArrayOfLong = k.q(paramArrayOfLong);
    i.e(localObject, "<this>");
    int i = ((Collection)localObject).size();
    ArrayList localArrayList = new ArrayList(paramArrayOfLong.size() + i);
    localArrayList.addAll((Collection)localObject);
    localArrayList.addAll(paramArrayOfLong);
    localObject = localArrayList.iterator();
    if (((Iterator)localObject).hasNext())
    {
      long l;
      for (paramArrayOfLong = ((Iterator)localObject).next(); ((Iterator)localObject).hasNext(); paramArrayOfLong = Long.valueOf(((Number)paramArrayOfLong).longValue() ^ l)) {
        l = ((Number)((Iterator)localObject).next()).longValue();
      }
      return ((Number)paramArrayOfLong).longValue();
    }
    throw new UnsupportedOperationException("Empty collection can't be reduced.");
  }
  
  public final void zzb(long[] paramArrayOfLong)
  {
    zza = k.q(paramArrayOfLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */