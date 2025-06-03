package com.google.android.recaptcha.internal;

import dc.p;
import ec.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import sb.s;

public final class zzfy
  extends zzfx
{
  private final p zza;
  private final String zzb;
  
  public zzfy(p paramp, String paramString, Object paramObject)
  {
    super(paramObject);
    zza = paramp;
    zzb = paramString;
  }
  
  public final boolean zza(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (i.a(paramMethod.getName(), zzb))
    {
      zztf localzztf = zzti.zzf();
      if (paramArrayOfObject != null)
      {
        paramMethod = new ArrayList(paramArrayOfObject.length);
        for (i = 0;; i++)
        {
          paramObject = paramMethod;
          if (i >= paramArrayOfObject.length) {
            break;
          }
          paramObject = paramArrayOfObject[i];
          zztg localzztg = zzth.zzf();
          localzztg.zzw(paramObject.toString());
          paramMethod.add((zzth)localzztg.zzi());
        }
      }
      paramObject = s.a;
      localzztf.zze((Iterable)paramObject);
      paramMethod = (zzti)localzztf.zzi();
      paramObject = zza;
      paramMethod = paramMethod.zzd();
      int i = paramMethod.length;
      ((p)paramObject).invoke(paramArrayOfObject, zzkh.zzh().zzi(paramMethod, 0, i));
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */