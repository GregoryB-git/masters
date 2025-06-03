package com.google.android.gms.internal.auth_api_phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import k6.a;
import k6.a.a;
import k6.a.d;
import k6.a.g;
import k6.d.a;
import l6.q.a;

public final class zzv
  extends k6.d
{
  private static final a.g zza;
  private static final a.a zzb;
  private static final a zzc;
  
  static
  {
    a.g localg = new a.g();
    zza = localg;
    zzt localzzt = new zzt();
    zzb = localzzt;
    zzc = new a("SmsCodeBrowser.API", localzzt, localg);
  }
  
  public zzv(Activity paramActivity)
  {
    super(paramActivity, zzc, a.d.j, d.a.c);
  }
  
  public zzv(Context paramContext)
  {
    super(paramContext, zzc, a.d.j, d.a.c);
  }
  
  public final Task<Void> startSmsCodeRetriever()
  {
    q.a locala = new q.a();
    c = new j6.d[] { zzac.zzb };
    a = new zzs(this);
    d = 1566;
    return doWrite(locala.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */