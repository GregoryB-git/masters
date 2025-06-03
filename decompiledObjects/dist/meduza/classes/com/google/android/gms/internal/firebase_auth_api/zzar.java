package com.google.android.gms.internal.firebase_auth_api;

import java.util.Objects;

final class zzar<E>
  extends zzaj<E>
{
  public static final zzaj<Object> zza = new zzar(new Object[0], 0);
  private final transient Object[] zzb;
  private final transient int zzc;
  
  public zzar(Object[] paramArrayOfObject, int paramInt)
  {
    zzb = paramArrayOfObject;
    zzc = paramInt;
  }
  
  public final E get(int paramInt)
  {
    zzw.zza(paramInt, zzc);
    Object localObject = zzb[paramInt];
    Objects.requireNonNull(localObject);
    return (E)localObject;
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final int zza()
  {
    return zzc;
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(zzb, 0, paramArrayOfObject, paramInt, zzc);
    return paramInt + zzc;
  }
  
  public final int zzb()
  {
    return 0;
  }
  
  public final boolean zze()
  {
    return false;
  }
  
  public final Object[] zzf()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */