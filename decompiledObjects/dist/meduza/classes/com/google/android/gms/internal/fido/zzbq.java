package com.google.android.gms.internal.fido;

import f;

public final class zzbq
{
  public static Object zza(Object paramObject, int paramInt)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(f.h("at index ", paramInt));
  }
  
  public static Object[] zzb(Object[] paramArrayOfObject, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      zza(paramArrayOfObject[i], i);
    }
    return paramArrayOfObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */