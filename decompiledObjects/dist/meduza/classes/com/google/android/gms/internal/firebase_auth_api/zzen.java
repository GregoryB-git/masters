package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public class zzen
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzep zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzb;
  private final Integer zzc;
  
  private zzen(com.google.android.gms.internal.firebase-auth-api.zzep paramzzep, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzep;
    zzb = paramzzzn;
    zzc = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzen zza(com.google.android.gms.internal.firebase-auth-api.zzep paramzzep, Integer paramInteger)
  {
    com.google.android.gms.internal.firebase-auth-api.zzzn localzzzn;
    if (paramzzep.zzb() == zzep.zza.zza)
    {
      if (paramInteger != null) {
        localzzzn = zzzn.zza(ByteBuffer.allocate(5).put((byte)1).putInt(paramInteger.intValue()).array());
      } else {
        throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
      }
    }
    else
    {
      if (paramzzep.zzb() != zzep.zza.zzb) {
        break label91;
      }
      if (paramInteger != null) {
        break label81;
      }
      localzzzn = zzzn.zza(new byte[0]);
    }
    return new zzen(paramzzep, localzzzn, paramInteger);
    label81:
    throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    label91:
    throw new GeneralSecurityException(f.j("Unknown Variant: ", String.valueOf(paramzzep.zzb())));
  }
  
  public final Integer zza()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzep zzb()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzc()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzen
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */