package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzmm
  implements Iterator
{
  private int zza = -1;
  private boolean zzb;
  private Iterator zzc;
  
  private zzmm(zzmj paramzzmj) {}
  
  private final Iterator zza()
  {
    if (zzc == null) {
      zzc = zzmj.zzb(zzd).entrySet().iterator();
    }
    return zzc;
  }
  
  public final boolean hasNext()
  {
    return (zza + 1 < zzmj.zza(zzd)) || ((!zzmj.zzb(zzd).isEmpty()) && (zza().hasNext()));
  }
  
  public final void remove()
  {
    if (zzb)
    {
      zzb = false;
      zzmj.zzd(zzd);
      if (zza < zzmj.zza(zzd))
      {
        zzmj localzzmj = zzd;
        int i = zza;
        zza = (i - 1);
        zzmj.zza(localzzmj, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */