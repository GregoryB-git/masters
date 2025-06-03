package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzgr
  implements Iterator
{
  private int zzb;
  private boolean zzc;
  private Iterator zzd;
  
  private final Iterator zza()
  {
    if (zzd == null) {
      zzd = zzgv.zzh(zza).entrySet().iterator();
    }
    return zzd;
  }
  
  public final boolean hasNext()
  {
    int i = zzb;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i + 1 >= zzgv.zzf(zza).size()) {
      if (!zzgv.zzh(zza).isEmpty())
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
      zzgv.zzi(zza);
      if (zzb < zzgv.zzf(zza).size())
      {
        zzgv localzzgv = zza;
        int i = zzb;
        zzb = (i - 1);
        zzgv.zzd(localzzgv, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */