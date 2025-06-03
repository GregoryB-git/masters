package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;

@NullMarked
public final class zzu
  extends zzs
{
  public static boolean zza(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */