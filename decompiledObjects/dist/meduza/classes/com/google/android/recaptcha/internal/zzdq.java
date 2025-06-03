package com.google.android.recaptcha.internal;

import android.app.Application;
import dc.a;
import ec.j;

public final class zzdq
  extends j
  implements a
{
  public static final zzdq zza = new zzdq();
  
  public zzdq()
  {
    super(0);
  }
  
  public final Object invoke()
  {
    int i = zzav.zza;
    i = Application.class.getName().hashCode();
    Object localObject = zzau.zza().zzb(i);
    if (localObject != null) {
      return (Application)localObject;
    }
    throw new zzbd(zzbb.zzb, zzba.zzax, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */