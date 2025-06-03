package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import ec.i;
import java.util.Map;
import rb.d;
import sb.z;

public final class zzbd
  extends Exception
{
  private static final Map zzb;
  private final zzbb zzc;
  private final zzba zzd;
  private final String zze;
  private final Map zzf;
  
  static
  {
    d locald = new d(zztv.zzc, new zzbd(zzbb.zzc, zzba.zzd, null));
    zztv localzztv = zztv.zzd;
    zzbb localzzbb = zzbb.zzb;
    zzb = z.K0(new d[] { locald, new d(localzztv, new zzbd(localzzbb, zzba.zzc, null)), new d(zztv.zze, new zzbd(zzbb.zzd, zzba.zze, null)), new d(zztv.zzf, new zzbd(zzbb.zze, zzba.zzf, null)), new d(zztv.zzi, new zzbd(zzbb.zzf, zzba.zzg, null)), new d(zztv.zzh, new zzbd(zzbb.zzg, zzba.zzh, null)), new d(zztv.zzj, new zzbd(localzzbb, zzba.zzj, null)) });
  }
  
  public zzbd(zzbb paramzzbb, zzba paramzzba, String paramString)
  {
    zzc = paramzzbb;
    zzd = paramzzba;
    zze = paramString;
    paramzzbb = zzbb.zzc;
    paramzzba = RecaptchaErrorCode.NETWORK_ERROR;
    zzf = z.K0(new d[] { new d(paramzzbb, new RecaptchaException(paramzzba, null, 2, null)), new d(zzbb.zzh, new RecaptchaException(paramzzba, null, 2, null)), new d(zzbb.zzi, new RecaptchaException(paramzzba, null, 2, null)), new d(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new d(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new d(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new d(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new d(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new d(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)) });
  }
  
  public final zzba zza()
  {
    return zzd;
  }
  
  public final zzbb zzb()
  {
    return zzc;
  }
  
  public final RecaptchaException zzc()
  {
    Object localObject = zzd;
    if (i.a(localObject, zzba.zzI))
    {
      localObject = new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
    }
    else if (i.a(localObject, zzba.zzao))
    {
      localObject = new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
    }
    else
    {
      RecaptchaException localRecaptchaException = (RecaptchaException)zzf.get(zzc);
      localObject = localRecaptchaException;
      if (localRecaptchaException == null) {
        localObject = new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null);
      }
    }
    return (RecaptchaException)localObject;
  }
  
  public final String zzd()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */