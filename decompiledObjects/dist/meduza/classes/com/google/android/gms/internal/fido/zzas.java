package com.google.android.gms.internal.fido;

import g;

final class zzas
{
  public static void zza(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      throw new NullPointerException(g.e("null value in entry: ", paramObject1.toString(), "=null"));
    }
    throw new NullPointerException("null key in entry: null=".concat(String.valueOf(paramObject2)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */