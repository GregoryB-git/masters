package com.google.android.gms.internal.auth;

import java.lang.reflect.Constructor;

final class zzft
{
  private static final zzfs zza;
  private static final zzfs zzb = new zzfs();
  
  static
  {
    zzfs localzzfs2;
    try
    {
      zzfs localzzfs1 = (zzfs)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
    catch (Exception localException)
    {
      localzzfs2 = null;
    }
    zza = localzzfs2;
  }
  
  public static zzfs zza()
  {
    return zza;
  }
  
  public static zzfs zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */