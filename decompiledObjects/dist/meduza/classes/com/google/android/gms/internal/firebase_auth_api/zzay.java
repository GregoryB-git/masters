package com.google.android.gms.internal.firebase_auth_api;

import java.util.Objects;

final class zzay
  extends zzaj<Object>
{
  private final transient Object[] zza;
  private final transient int zzb;
  private final transient int zzc;
  
  public zzay(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    zza = paramArrayOfObject;
    zzb = paramInt1;
    zzc = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzw.zza(paramInt, zzc);
    Object localObject = zza[(paramInt * 2 + zzb)];
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final boolean zze()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */