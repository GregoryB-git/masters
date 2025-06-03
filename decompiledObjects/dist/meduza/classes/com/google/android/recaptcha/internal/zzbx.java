package com.google.android.recaptcha.internal;

import b.z;
import com.google.android.gms.tasks.Task;
import nc.j0;
import nc.s;

public final class zzbx
{
  public static final j0 zza(Task paramTask)
  {
    s locals = z.b();
    paramTask.addOnCompleteListener(zzbv.zza, new zzbu(locals));
    return new zzbw(locals);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */