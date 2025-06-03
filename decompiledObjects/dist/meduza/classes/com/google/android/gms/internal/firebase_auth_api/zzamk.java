package com.google.android.gms.internal.firebase_auth_api;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzamk
  implements Iterator
{
  private int zza = -1;
  private boolean zzb;
  private Iterator zzc;
  
  private zzamk(com.google.android.gms.internal.firebase-auth-api.zzamh paramzzamh) {}
  
  private final Iterator zza()
  {
    if (zzc == null) {
      zzc = zzamh.zzb(zzd).entrySet().iterator();
    }
    return zzc;
  }
  
  public final boolean hasNext()
  {
    return (zza + 1 < zzamh.zza(zzd)) || ((!zzamh.zzb(zzd).isEmpty()) && (zza().hasNext()));
  }
  
  public final void remove()
  {
    if (zzb)
    {
      zzb = false;
      zzamh.zzd(zzd);
      if (zza < zzamh.zza(zzd))
      {
        com.google.android.gms.internal.firebase-auth-api.zzamh localzzamh = zzd;
        int i = zza;
        zza = (i - 1);
        zzamh.zza(localzzamh, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */