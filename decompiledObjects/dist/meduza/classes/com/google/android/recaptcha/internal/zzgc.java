package com.google.android.recaptcha.internal;

import b.z;
import rb.g;

public final class zzgc
{
  public static final Class zza(Object paramObject)
  {
    int i;
    if ((paramObject instanceof Class))
    {
      paramObject = (Class)paramObject;
    }
    else
    {
      if (!(paramObject instanceof Integer)) {
        break label149;
      }
      i = ((Number)paramObject).intValue();
      if (i == 1) {
        paramObject = Integer.TYPE;
      } else if (i == 2) {
        paramObject = Short.TYPE;
      } else if (i == 3) {
        paramObject = Byte.TYPE;
      } else if (i == 4) {
        paramObject = Long.TYPE;
      } else if (i == 5) {
        paramObject = Character.TYPE;
      } else if (i == 6) {
        paramObject = Float.TYPE;
      } else if (i == 7) {
        paramObject = Double.TYPE;
      } else if (i == 8) {
        paramObject = Boolean.TYPE;
      } else {
        paramObject = null;
      }
      if (paramObject == null) {
        break label137;
      }
    }
    return (Class)paramObject;
    label137:
    throw new zzce(4, 6, null);
    label149:
    if ((paramObject instanceof String)) {
      try
      {
        String str = (String)paramObject;
        paramObject = Class.forName(str);
        i = zzav.zza;
        if (((zzfu)z.n(zzgb.zza).getValue()).zzb(str)) {
          return (Class)paramObject;
        }
        throw new zzce(6, 47, null);
      }
      catch (Exception paramObject)
      {
        throw new zzce(6, 8, (Throwable)paramObject);
      }
    }
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */