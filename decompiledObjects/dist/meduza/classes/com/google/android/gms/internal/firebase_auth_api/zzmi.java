package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzbe;
import com.google.android.gms.internal.firebase-auth-api.zzbz;
import com.google.android.gms.internal.firebase-auth-api.zzwf;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

public final class zzmi
{
  private static final Object zza = new Object();
  private static final String zzb = "zzmi";
  private com.google.android.gms.internal.firebase-auth-api.zzbx zzc;
  
  private zzmi(com.google.android.gms.internal.firebase-auth-api.zzmi.zza paramzza)
  {
    new zzmp(zza.zza(paramzza), zza.zzc(paramzza), zza.zzd(paramzza));
    zzc = zza.zzb(paramzza);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzbs zza()
  {
    try
    {
      com.google.android.gms.internal.firebase-auth-api.zzbs localzzbs = zzc.zza();
      return localzzbs;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static final class zza
  {
    private Context zza = null;
    private String zzb = null;
    private String zzc = null;
    private String zzd = null;
    private zzbe zze = null;
    private boolean zzf = true;
    private com.google.android.gms.internal.firebase-auth-api.zzbp zzg = null;
    private zzwf zzh = null;
    private com.google.android.gms.internal.firebase-auth-api.zzbx zzi;
    
    private static com.google.android.gms.internal.firebase-auth-api.zzbx zza(byte[] paramArrayOfByte)
    {
      return zzbx.zza(zzce.zza(zzbd.zza(paramArrayOfByte), zzbl.zza()));
    }
    
    private final zzbe zzb()
    {
      zzmi.zzd();
      Object localObject = new zzmn();
      try
      {
        boolean bool = zzmn.zzc(zzd);
        try
        {
          localObject = ((zzmn)localObject).zza(zzd);
          return (zzbe)localObject;
        }
        catch (ProviderException localProviderException1) {}catch (GeneralSecurityException localGeneralSecurityException1) {}
        if (!bool) {
          break label52;
        }
      }
      catch (ProviderException localProviderException2)
      {
        for (;;) {}
      }
      catch (GeneralSecurityException localGeneralSecurityException2)
      {
        label52:
        for (;;) {}
      }
      Log.w(zzmi.zzc(), "cannot use Android Keystore, it'll be disabled", localGeneralSecurityException1);
      return null;
      throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[] { zzd }), localGeneralSecurityException1);
    }
    
    private final com.google.android.gms.internal.firebase-auth-api.zzbx zzb(byte[] paramArrayOfByte)
    {
      try
      {
        Object localObject = new com/google/android/gms/internal/firebase_auth_api/zzmn;
        ((zzmn)localObject).<init>();
        zze = ((zzmn)localObject).zza(zzd);
        try
        {
          localObject = zzbx.zza(zzbs.zza(zzbd.zza(paramArrayOfByte), zze, new byte[0]));
          return (com.google.android.gms.internal.firebase-auth-api.zzbx)localObject;
        }
        catch (GeneralSecurityException localGeneralSecurityException1) {}catch (IOException localIOException) {}
        try
        {
          paramArrayOfByte = zza(paramArrayOfByte);
          return paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          throw localIOException;
        }
        try
        {
          paramArrayOfByte = zza(paramArrayOfByte);
          Log.w(zzmi.zzc(), "cannot use Android Keystore, it'll be disabled", localGeneralSecurityException2);
          return paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          throw localGeneralSecurityException2;
        }
      }
      catch (ProviderException localProviderException) {}catch (GeneralSecurityException localGeneralSecurityException2) {}
    }
    
    private static byte[] zzb(Context paramContext, String paramString1, String paramString2)
    {
      if (paramString1 != null)
      {
        paramContext = paramContext.getApplicationContext();
        if (paramString2 == null) {
          paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext);
        } else {
          paramContext = paramContext.getSharedPreferences(paramString2, 0);
        }
        try
        {
          paramContext = paramContext.getString(paramString1, null);
          if (paramContext == null) {
            return null;
          }
          paramContext = zzza.zza(paramContext);
          return paramContext;
        }
        catch (ClassCastException|IllegalArgumentException paramContext)
        {
          throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[] { paramString1 }));
        }
      }
      throw new IllegalArgumentException("keysetName cannot be null");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzmi.zza zza(Context paramContext, String paramString1, String paramString2)
    {
      if (paramContext != null)
      {
        zza = paramContext;
        zzb = paramString1;
        zzc = paramString2;
        return this;
      }
      throw new IllegalArgumentException("need an Android context");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzmi.zza zza(zzwf paramzzwf)
    {
      zzh = paramzzwf;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzmi.zza zza(String paramString)
    {
      if (paramString.startsWith("android-keystore://"))
      {
        if (zzf)
        {
          zzd = paramString;
          return this;
        }
        throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
      }
      throw new IllegalArgumentException("key URI must start with android-keystore://");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzmi zza()
    {
      try
      {
        if (zzb != null)
        {
          Object localObject1 = zzh;
          if ((localObject1 != null) && (zzg == null)) {
            zzg = zzbp.zza(zzco.zza(((zzain)localObject1).zzk()));
          }
          synchronized (zzmi.zzb())
          {
            localObject1 = zzb(zza, zzb, zzc);
            if (localObject1 == null)
            {
              if (zzd != null) {
                zze = zzb();
              }
              localObject1 = zzg;
              if (localObject1 != null)
              {
                com.google.android.gms.internal.firebase-auth-api.zzbs localzzbs = zzbs.zza((com.google.android.gms.internal.firebase-auth-api.zzbp)localObject1);
                localObject1 = new com/google/android/gms/internal/firebase_auth_api/zzmp;
                ((zzmp)localObject1).<init>(zza, zzb, zzc);
                zzmi.zza(localzzbs, (zzbz)localObject1, zze);
                localObject1 = zzbx.zza(localzzbs);
              }
            }
            for (;;)
            {
              zzi = ((com.google.android.gms.internal.firebase-auth-api.zzbx)localObject1);
              break;
              localObject1 = new java/security/GeneralSecurityException;
              ((GeneralSecurityException)localObject1).<init>("cannot read or generate keyset");
              throw ((Throwable)localObject1);
              if (zzd != null)
              {
                zzmi.zzd();
                localObject1 = zzb((byte[])localObject1);
              }
              else
              {
                localObject1 = zza((byte[])localObject1);
              }
            }
            localObject1 = new com/google/android/gms/internal/firebase_auth_api/zzmi;
            ((zzmi)localObject1).<init>(this, null);
            return (com.google.android.gms.internal.firebase-auth-api.zzmi)localObject1;
          }
        }
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("keysetName cannot be null");
        throw localIllegalArgumentException;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */