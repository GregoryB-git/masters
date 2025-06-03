package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzpb
  implements Iterator
{
  private int zzb;
  private boolean zzc;
  private Iterator zzd;
  
  private final Iterator zza()
  {
    if (zzd == null) {
      zzd = zzpe.zzh(zza).entrySet().iterator();
    }
    return zzd;
  }
  
  public final boolean hasNext()
  {
    int i = zzb;
    boolean bool1 = true;
    zzpe localzzpe = zza;
    boolean bool2 = bool1;
    if (i + 1 >= zzpe.zzb(localzzpe)) {
      if (!zzpe.zzh(localzzpe).isEmpty())
      {
        if (zza().hasNext()) {
          bool2 = bool1;
        } else {
          return false;
        }
      }
      else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final void remove()
  {
    if (zzc)
    {
      zzc = false;
      zzpe.zzi(zza);
      int i = zzb;
      zzpe localzzpe = zza;
      if (i < zzpe.zzb(localzzpe))
      {
        zzb = (i - 1);
        zzpe.zze(localzzpe, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */