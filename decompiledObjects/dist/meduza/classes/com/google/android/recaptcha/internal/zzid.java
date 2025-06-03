package com.google.android.recaptcha.internal;

import android.content.Context;

public final class zzid
  implements zzih
{
  private final Context zza;
  
  public zzid(Context paramContext)
  {
    zza = paramContext;
  }
  
  public final Object zza(Object... paramVarArgs)
  {
    return zza.getSharedPreferences("_GRECAPTCHA", 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzid
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */