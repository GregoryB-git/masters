package com.google.android.gms.internal.auth;

import java.lang.reflect.Constructor;

final class zzgd
{
  private static final zzgc zza;
  private static final zzgc zzb = new zzgc();
  
  static
  {
    zzgc localzzgc2;
    try
    {
      zzgc localzzgc1 = (zzgc)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzgc2 = null;
    }
    zza = localzzgc2;
  }
  
  public static zzgc zza()
  {
    return zza;
  }
  
  public static zzgc zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */