package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ApplicationInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import b.z;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import rb.g;

public final class zzen
{
  private static zzqk zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final zzeo zzf;
  private final Context zzg;
  private final Integer zzh;
  private final String zzi;
  private final long zzj;
  private final int zzk;
  private final int zzl;
  
  public zzen(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, zzeo paramzzeo, zzcc paramzzcc, Context paramContext, Integer paramInteger)
  {
    zzk = paramInt1;
    zzb = paramString1;
    zzl = paramInt2;
    zzc = paramString2;
    zzd = paramString3;
    zze = paramString4;
    zzf = paramzzeo;
    zzg = paramContext;
    zzh = paramInteger;
    zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    zzj = System.currentTimeMillis();
  }
  
  private final void zzc(int paramInt, zzqq paramzzqq)
  {
    Object localObject1 = "";
    zzra localzzra = zzrc.zzi();
    localzzra.zzy(zzk);
    localzzra.zzq(zzc);
    localzzra.zzt(zzd);
    localzzra.zzz(zzl);
    localObject2 = zze;
    if (localObject2 != null) {
      localzzra.zzx((String)localObject2);
    }
    localObject2 = zzh;
    if (localObject2 != null) {
      localzzra.zzv(((Integer)localObject2).intValue());
    }
    if (paramzzqq != null) {
      localzzra.zzs(paramzzqq);
    }
    localzzra.zzA(paramInt);
    localzzra.zzw(zzi);
    long l = zzj;
    localzzra.zzr(System.currentTimeMillis() - l);
    paramInt = zzav.zza;
    localObject2 = ((zzaz)z.n(zzel.zza).getValue()).zza().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramzzqq = (zzax)((Iterator)localObject2).next();
      localzzra.zzf(0);
    }
    paramInt = zzbk.zza;
    paramInt = zzk;
    l = localzzra.zze();
    paramInt -= 2;
    if (paramInt != 4)
    {
      if (paramInt != 5)
      {
        if (paramInt != 6)
        {
          if (paramInt != 7)
          {
            if (paramInt != 14) {
              paramzzqq = zzbl.zza;
            } else {
              paramzzqq = zzbl.zzf;
            }
          }
          else {
            paramzzqq = zzbl.zze;
          }
        }
        else {
          paramzzqq = zzbl.zzd;
        }
      }
      else {
        paramzzqq = zzbl.zzc;
      }
    }
    else {
      paramzzqq = zzbl.zzb;
    }
    zzbk.zza(paramzzqq.zza(), l * 1000L);
    paramzzqq = (zzbe)z.n(zzem.zza).getValue();
    Context localContext = zzg;
    Object localObject3 = zzbe.zza(localContext);
    localObject2 = zza;
    paramzzqq = (zzqq)localObject2;
    if (localObject2 == null)
    {
      localObject4 = zzqk.zzf();
      paramInt = Build.VERSION.SDK_INT;
      ((zzqh)localObject4).zzf(paramInt);
      localObject2 = "unknown";
      if (paramInt < 33) {}
    }
    try
    {
      int i = getPackageManagergetApplicationInfogetPackageNameof128LmetaData.getInt("com.google.android.gms.version", -1);
      paramInt = i;
      if (i == -1)
      {
        break label445;
        i = getPackageManagergetApplicationInfogetPackageName128metaData.getInt("com.google.android.gms.version", -1);
        paramInt = i;
        if (i == -1) {}
      }
      else
      {
        paramzzqq = String.valueOf(paramInt);
      }
    }
    catch (PackageManager.NameNotFoundException paramzzqq)
    {
      label445:
      for (;;) {}
    }
    paramzzqq = "unknown";
    ((zzqh)localObject4).zzs(paramzzqq);
    ((zzqh)localObject4).zzu("18.6.1");
    ((zzqh)localObject4).zzr(Build.MODEL);
    ((zzqh)localObject4).zzt(Build.MANUFACTURER);
    try
    {
      paramInt = Build.VERSION.SDK_INT;
      if (paramInt >= 33)
      {
        l = a.e(localContext.getPackageManager().getPackageInfo(localContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L)));
      }
      else
      {
        if (paramInt < 28) {
          break label551;
        }
        l = a.e(localContext.getPackageManager().getPackageInfo(localContext.getPackageName(), 0));
      }
      paramzzqq = String.valueOf(l);
      break label572;
      label551:
      paramzzqq = String.valueOf(getPackageManagergetPackageInfogetPackageName0versionCode);
    }
    catch (PackageManager.NameNotFoundException paramzzqq)
    {
      for (;;)
      {
        label572:
        paramzzqq = (zzqq)localObject2;
      }
    }
    ((zzqh)localObject4).zzq(paramzzqq);
    paramzzqq = (zzqk)((zzmx)localObject4).zzi();
    zza = paramzzqq;
    paramzzqq = (zzqh)paramzzqq.zzr();
    paramzzqq.zze((Iterable)localObject3);
    localObject3 = (zzqk)paramzzqq.zzi();
    try
    {
      paramzzqq = Locale.getDefault().getISO3Language();
    }
    catch (MissingResourceException paramzzqq)
    {
      paramzzqq = "";
    }
    try
    {
      localObject2 = Locale.getDefault().getISO3Country();
      localObject1 = localObject2;
    }
    catch (MissingResourceException localMissingResourceException)
    {
      for (;;) {}
    }
    Object localObject4 = zzb;
    localObject2 = zzro.zzf();
    ((zzrm)localObject2).zzr((String)localObject4);
    ((zzrm)localObject2).zze((zzqk)localObject3);
    ((zzrm)localObject2).zzq(paramzzqq);
    ((zzrm)localObject2).zzf((String)localObject1);
    localzzra.zzu((zzro)((zzmx)localObject2).zzi());
    paramzzqq = zztx.zzi();
    paramzzqq.zze(localzzra);
    paramzzqq = (zztx)paramzzqq.zzi();
    zzf.zza(paramzzqq);
  }
  
  public final void zza()
  {
    zzc(3, null);
  }
  
  public final void zzb(zzbd paramzzbd)
  {
    zzqo localzzqo = zzqq.zzg();
    localzzqo.zzr(String.valueOf(paramzzbd.zzb().zza()));
    localzzqo.zze(paramzzbd.zza().zza());
    localzzqo.zzq(paramzzbd.zzc().getErrorCode().getErrorCode());
    paramzzbd = paramzzbd.zzd();
    if (paramzzbd != null) {
      localzzqo.zzf(paramzzbd);
    }
    zzc(4, (zzqq)localzzqo.zzi());
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzen
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */