package com.google.android.gms.internal.auth;

import java.lang.reflect.Constructor;

final class zzeo
{
  private static final zzem zza = new zzen();
  private static final zzem zzb;
  
  static
  {
    zzem localzzem2;
    try
    {
      zzem localzzem1 = (zzem)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzem2 = null;
    }
    zzb = localzzem2;
  }
  
  public static zzem zza()
  {
    zzem localzzem = zzb;
    if (localzzem != null) {
      return localzzem;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  public static zzem zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzeo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */