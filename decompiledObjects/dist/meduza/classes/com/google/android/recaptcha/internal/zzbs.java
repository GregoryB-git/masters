package com.google.android.recaptcha.internal;

import android.content.Context;
import j6.f;

public final class zzbs
{
  private final f zza;
  
  public zzbs()
  {
    zza = localf;
  }
  
  public zzbs(f paramf)
  {
    zza = paramf;
  }
  
  public final int zza(Context paramContext)
  {
    int i = zza.b(paramContext);
    if ((i != 1) && (i != 3) && (i != 9)) {
      return 3;
    }
    return 4;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */