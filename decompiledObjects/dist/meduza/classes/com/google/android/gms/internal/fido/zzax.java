package com.google.android.gms.internal.fido;

import java.util.AbstractCollection;
import java.util.List;

final class zzax
  extends zzaz
{
  private final transient zzaz zza;
  
  public zzax(zzaz paramzzaz)
  {
    zza = paramzzaz;
  }
  
  private final int zzl(int paramInt)
  {
    return zza.size() - 1 - paramInt;
  }
  
  public final boolean contains(Object paramObject)
  {
    return zza.contains(paramObject);
  }
  
  public final Object get(int paramInt)
  {
    zzap.zza(paramInt, zza.size(), "index");
    return zza.get(zzl(paramInt));
  }
  
  public final int indexOf(Object paramObject)
  {
    int i = zza.lastIndexOf(paramObject);
    if (i >= 0) {
      return zzl(i);
    }
    return -1;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    int i = zza.indexOf(paramObject);
    if (i >= 0) {
      return zzl(i);
    }
    return -1;
  }
  
  public final int size()
  {
    return zza.size();
  }
  
  public final zzaz zzf()
  {
    return zza;
  }
  
  public final zzaz zzg(int paramInt1, int paramInt2)
  {
    zzap.zze(paramInt1, paramInt2, zza.size());
    zzaz localzzaz = zza;
    return localzzaz.zzg(localzzaz.size() - paramInt2, zza.size() - paramInt1).zzf();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */