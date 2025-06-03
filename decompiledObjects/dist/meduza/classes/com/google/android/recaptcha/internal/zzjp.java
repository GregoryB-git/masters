package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

final class zzjp
  extends zzjk
{
  public zzjp(Iterable paramIterable, int paramInt) {}
  
  public final Iterator iterator()
  {
    Object localObject = zza;
    if ((localObject instanceof List))
    {
      localObject = (List)localObject;
      return ((List)localObject).subList(Math.min(((List)localObject).size(), zzb), ((List)localObject).size()).iterator();
    }
    int i = zzb;
    localObject = ((Iterable)localObject).iterator();
    localObject.getClass();
    int j = 0;
    boolean bool;
    if (i >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzjf.zzb(bool, "numberToAdvance must be nonnegative");
    while ((j < i) && (((Iterator)localObject).hasNext()))
    {
      ((Iterator)localObject).next();
      j++;
    }
    return new zzjo(this, (Iterator)localObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */