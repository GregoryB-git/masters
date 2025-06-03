package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzml
  implements Iterator
{
  private int zza;
  private Iterator zzb;
  
  private zzml(zzmj paramzzmj)
  {
    zza = zzmj.zza(paramzzmj);
  }
  
  private final Iterator zza()
  {
    if (zzb == null) {
      zzb = zzmj.zzc(zzc).entrySet().iterator();
    }
    return zzb;
  }
  
  public final boolean hasNext()
  {
    int i = zza;
    return ((i > 0) && (i <= zzmj.zza(zzc))) || (zza().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzml
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */