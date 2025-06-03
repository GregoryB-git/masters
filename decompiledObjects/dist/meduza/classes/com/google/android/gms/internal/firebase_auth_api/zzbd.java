package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzca;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class zzbd
  implements zzca
{
  private final InputStream zza;
  
  private zzbd(InputStream paramInputStream)
  {
    zza = paramInputStream;
  }
  
  public static zzca zza(byte[] paramArrayOfByte)
  {
    return new zzbd(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzuz zza()
  {
    try
    {
      com.google.android.gms.internal.firebase-auth-api.zzuz localzzuz = zzuz.zza(zza, zzajv.zza());
      return localzzuz;
    }
    finally
    {
      zza.close();
    }
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwl zzb()
  {
    try
    {
      com.google.android.gms.internal.firebase-auth-api.zzwl localzzwl = zzwl.zza(zza, zzajv.zza());
      return localzzwl;
    }
    finally
    {
      zza.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */