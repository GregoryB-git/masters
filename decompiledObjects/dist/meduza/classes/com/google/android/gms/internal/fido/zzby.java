package com.google.android.gms.internal.fido;

import g;

final class zzby
  extends zzbc
{
  public final transient Object zza;
  
  public zzby(Object paramObject)
  {
    paramObject.getClass();
    zza = paramObject;
  }
  
  public final boolean contains(Object paramObject)
  {
    return zza.equals(paramObject);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final int size()
  {
    return 1;
  }
  
  public final String toString()
  {
    return g.e("[", zza.toString(), "]");
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    paramArrayOfObject[0] = zza;
    return 1;
  }
  
  public final zzcb zzd()
  {
    return new zzbl(zza);
  }
  
  public final zzaz zzi()
  {
    return zzaz.zzj(zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzby
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */