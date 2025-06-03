package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Objects;

public final class zzew
  extends zzcr
{
  private final com.google.android.gms.internal.firebase-auth-api.zzew.zzc zza;
  private final String zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzew.zza zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzcr zzd;
  
  private zzew(com.google.android.gms.internal.firebase-auth-api.zzew.zzc paramzzc, String paramString, com.google.android.gms.internal.firebase-auth-api.zzew.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzcr paramzzcr)
  {
    zza = paramzzc;
    zzb = paramString;
    zzc = paramzza;
    zzd = paramzzcr;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzew)) {
      return false;
    }
    paramObject = (zzew)paramObject;
    return (zzc.equals(zzc)) && (zzd.equals(zzd)) && (zzb.equals(zzb)) && (zza.equals(zza));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzew.class, zzb, zzc, zzd, zza });
  }
  
  public final String toString()
  {
    String str1 = zzb;
    String str2 = String.valueOf(zzc);
    String str3 = String.valueOf(zzd);
    String str4 = String.valueOf(zza);
    StringBuilder localStringBuilder = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", dekParsingStrategy: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", dekParametersForNewKeys: ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", variant: ");
    localStringBuilder.append(str4);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zza != zzc.zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzcr zzb()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew.zzc zzc()
  {
    return zza;
  }
  
  public final String zzd()
  {
    return zzb;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zza = new zza("ASSUME_AES_GCM");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zzb = new zza("ASSUME_XCHACHA20POLY1305");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zzc = new zza("ASSUME_CHACHA20POLY1305");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zzd = new zza("ASSUME_AES_CTR_HMAC");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zze = new zza("ASSUME_AES_EAX");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zza zzf = new zza("ASSUME_AES_GCM_SIV");
    private final String zzg;
    
    private zza(String paramString)
    {
      zzg = paramString;
    }
    
    public final String toString()
    {
      return zzg;
    }
  }
  
  public static final class zzb
  {
    private com.google.android.gms.internal.firebase-auth-api.zzew.zzc zza;
    private String zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzew.zza zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzcr zzd;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzew.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzcr paramzzcr)
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
  
  public static final class zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zzc zza = new zzc("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzew.zzc zzb = new zzc("NO_PREFIX");
    private final String zzc;
    
    private zzc(String paramString)
    {
      zzc = paramString;
    }
    
    public final String toString()
    {
      return zzc;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */