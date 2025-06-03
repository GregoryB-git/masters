package com.google.android.gms.internal.firebase_auth_api;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzamj
  implements Iterator
{
  private int zza;
  private Iterator zzb;
  
  private zzamj(com.google.android.gms.internal.firebase-auth-api.zzamh paramzzamh)
  {
    zza = zzamh.zza(paramzzamh);
  }
  
  private final Iterator zza()
  {
    if (zzb == null) {
      zzb = zzamh.zzc(zzc).entrySet().iterator();
    }
    return zzb;
  }
  
  public final boolean hasNext()
  {
    int i = zza;
    return ((i > 0) && (i <= zzamh.zza(zzc))) || (zza().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */