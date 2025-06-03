package com.google.android.gms.internal.common;

import f;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class zzal
{
  public static Object[] zza(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 0;
    while (i < paramInt) {
      if (paramArrayOfObject[i] != null) {
        i++;
      } else {
        throw new NullPointerException(f.h("at index ", i));
      }
    }
    return paramArrayOfObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */