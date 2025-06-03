package com.google.android.recaptcha.internal;

import nc.d2;

public final class zzf
{
  public static final zzbd zza(Exception paramException, zzbd paramzzbd)
  {
    if ((paramException instanceof d2)) {
      paramzzbd = new zzbd(zzbb.zzb, zzba.zzb, paramException.getMessage());
    } else if ((paramException instanceof zzbd)) {
      return (zzbd)paramException;
    }
    return paramzzbd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */