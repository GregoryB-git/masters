package com.google.android.recaptcha.internal;

import java.util.Iterator;

final class zzjo
  implements Iterator
{
  public boolean zza = true;
  
  public zzjo(zzjp paramzzjp, Iterator paramIterator) {}
  
  public final boolean hasNext()
  {
    return zzb.hasNext();
  }
  
  public final Object next()
  {
    Object localObject = zzb.next();
    zza = false;
    return localObject;
  }
  
  public final void remove()
  {
    zzjf.zze(zza ^ true, "no calls to next() since the last call to remove()");
    zzb.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */