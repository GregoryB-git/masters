package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcr;
import java.security.GeneralSecurityException;

public final class zzew$zzb
{
  private com.google.android.gms.internal.firebase-auth-api.zzew.zzc zza;
  private String zzb;
  private com.google.android.gms.internal.firebase-auth-api.zzew.zza zzc;
  private zzcr zzd;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew.zzb zza(zzcr paramzzcr)
  {
    zzd = paramzzcr;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzew.zza paramzza)
  {
    zzc = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzew.zzc paramzzc)
  {
    zza = paramzzc;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew.zzb zza(String paramString)
  {
    zzb = paramString;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew zza()
  {
    if (zza == null) {
      zza = zzew.zzc.zzb;
    }
    if (zzb != null)
    {
      if (zzc != null)
      {
        Object localObject1 = zzd;
        if (localObject1 != null)
        {
          if (!((zzcg)localObject1).zza())
          {
            localObject1 = zzc;
            Object localObject2 = zzd;
            boolean bool = localObject1.equals(zzew.zza.zza);
            int i = 1;
            if (((!bool) || (!(localObject2 instanceof zzdr))) && ((!localObject1.equals(zzew.zza.zzc)) || (!(localObject2 instanceof zzeg))) && ((!localObject1.equals(zzew.zza.zzb)) || (!(localObject2 instanceof zzfy))) && ((!localObject1.equals(zzew.zza.zzd)) || (!(localObject2 instanceof zzdc))) && ((!localObject1.equals(zzew.zza.zze)) || (!(localObject2 instanceof zzdk))) && ((!localObject1.equals(zzew.zza.zzf)) || (!(localObject2 instanceof zzea)))) {
              i = 0;
            }
            if (i != 0) {
              return new zzew(zza, zzb, zzc, zzd, null);
            }
            localObject1 = zzc.toString();
            localObject2 = String.valueOf(zzd);
            StringBuilder localStringBuilder = new StringBuilder("Cannot use parsing strategy ");
            localStringBuilder.append((String)localObject1);
            localStringBuilder.append(" when new keys are picked according to ");
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append(".");
            throw new GeneralSecurityException(localStringBuilder.toString());
          }
          throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        throw new GeneralSecurityException("dekParametersForNewKeys must be set");
      }
      throw new GeneralSecurityException("dekParsingStrategy must be set");
    }
    throw new GeneralSecurityException("kekUri must be set");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzew.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */