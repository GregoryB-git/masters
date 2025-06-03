package com.google.android.gms.internal.firebase_auth_api;

import c8.n;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

final class zzadb
  extends zzaeg<Void, z0>
{
  private final String zzaa;
  private final String zzab;
  private final String zzac;
  private final boolean zzad;
  private final String zzu;
  private final String zzv;
  private final String zzw;
  private final long zzx;
  private final boolean zzy;
  private final boolean zzz;
  
  public zzadb(n paramn, String paramString1, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, String paramString3, String paramString4, String paramString5, boolean paramBoolean3)
  {
    super(8);
    j.i(paramn);
    j.e(paramString1);
    paramn = a;
    j.e(paramn);
    zzu = paramn;
    zzv = paramString1;
    zzw = paramString2;
    zzx = paramLong;
    zzy = paramBoolean1;
    zzz = paramBoolean2;
    zzaa = paramString3;
    zzab = paramString4;
    zzac = paramString5;
    zzad = paramBoolean3;
  }
  
  public final String zza()
  {
    return "startMfaEnrollment";
  }
  
  public final void zza(TaskCompletionSource paramTaskCompletionSource, com.google.android.gms.internal.firebase-auth-api.zzado paramzzado)
  {
    zzg = new zzaeq(this, paramTaskCompletionSource);
    paramzzado.zza(zzu, zzv, zzw, zzx, zzy, zzz, zzaa, zzab, zzac, zzad, zzb);
  }
  
  public final void zzb() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */