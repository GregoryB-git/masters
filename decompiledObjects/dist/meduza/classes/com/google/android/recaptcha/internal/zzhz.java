package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import sb.q;

public final class zzhz
  implements zzhx
{
  private final zzhy zza;
  
  public zzhz(zzhy paramzzhy, zzhw paramzzhw)
  {
    zza = paramzzhy;
  }
  
  private final zztz zzb(String paramString, List paramList)
  {
    if (paramString.length() != 0) {
      try
      {
        long l = zza.zza(q.v(paramList));
        zzhv localzzhv = new com/google/android/recaptcha/internal/zzhv;
        localzzhv.<init>(l, 255L, zzhv.zzb());
        paramList = new java/lang/StringBuilder;
        paramList.<init>(paramString.length());
        for (int i = 0; i < paramString.length(); i++) {
          paramList.append((char)(paramString.charAt(i) ^ (int)localzzhv.zza()));
        }
        paramString = paramList.toString();
        paramString = zztz.zzg(zzkh.zzh().zzj(paramString));
        return paramString;
      }
      catch (Exception paramString)
      {
        throw new zzce(3, 18, paramString);
      }
    }
    throw new zzce(3, 17, null);
  }
  
  public final zztz zza(zzub paramzzub)
  {
    zzjh localzzjh = zzjh.zzb();
    paramzzub = zzb(paramzzub.zzj(), paramzzub.zzk());
    localzzjh.zzf();
    long l = localzzjh.zza(TimeUnit.MICROSECONDS);
    int i = zzbk.zza;
    zzbk.zza(zzbl.zzh.zza(), l);
    return paramzzub;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */