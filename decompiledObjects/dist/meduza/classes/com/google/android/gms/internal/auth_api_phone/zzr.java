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
import m6.j;

public final class zzr
  extends k6.d
{
  private static final a.g zza;
  private static final a.a zzb;
  private static final a zzc;
  
  static
  {
    a.g localg = new a.g();
    zza = localg;
    zzn localzzn = new zzn();
    zzb = localzzn;
    zzc = new a("SmsCodeAutofill.API", localzzn, localg);
  }
  
  public zzr(Activity paramActivity)
  {
    super(paramActivity, zzc, a.d.j, d.a.c);
  }
  
  public zzr(Context paramContext)
  {
    super(paramContext, zzc, a.d.j, d.a.c);
  }
  
  public final Task<Integer> checkPermissionState()
  {
    q.a locala = new q.a();
    c = new j6.d[] { zzac.zza };
    a = new zzk(this);
    d = 1564;
    return doRead(locala.a());
  }
  
  public final Task<Boolean> hasOngoingSmsRequest(String paramString)
  {
    j.i(paramString);
    j.a("The package name cannot be empty.", paramString.isEmpty() ^ true);
    q.a locala = new q.a();
    c = new j6.d[] { zzac.zza };
    a = new zzl(this, paramString);
    d = 1565;
    return doRead(locala.a());
  }
  
  public final Task<Void> startSmsCodeRetriever()
  {
    q.a locala = new q.a();
    c = new j6.d[] { zzac.zza };
    a = new zzm(this);
    d = 1563;
    return doWrite(locala.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */