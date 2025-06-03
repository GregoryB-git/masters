package com.google.android.recaptcha.internal;

import ec.i;
import java.lang.reflect.Method;
import java.util.List;
import sb.j;
import sb.s;

public final class zzga
  extends zzfx
{
  private final zzfz zza;
  private final String zzb;
  
  public zzga(zzfz paramzzfz, String paramString, Object paramObject)
  {
    super(paramObject);
    zza = paramzzfz;
    zzb = paramString;
  }
  
  public final boolean zza(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (i.a(paramMethod.getName(), zzb))
    {
      paramMethod = zza;
      if (paramArrayOfObject != null) {
        paramObject = j.j(paramArrayOfObject);
      } else {
        paramObject = s.a;
      }
      paramMethod.zzb((List)paramObject);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */