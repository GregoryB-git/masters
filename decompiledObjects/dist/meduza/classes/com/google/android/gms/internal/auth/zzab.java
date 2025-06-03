package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a.a;
import k6.a.d;
import k6.a.g;
import k6.d.a;
import l6.q.a;
import m6.j;
import z5.b;
import z5.i;

final class zzab
  extends k6.d
  implements zzg
{
  private static final a.g zza;
  private static final a.a zzb;
  private static final k6.a zzc;
  private static final p6.a zzd = new p6.a("Auth", new String[] { "GoogleAuthServiceClient" });
  private final Context zze;
  
  static
  {
    a.g localg = new a.g();
    zza = localg;
    zzv localzzv = new zzv();
    zzb = localzzv;
    zzc = new k6.a("GoogleAuthService.API", localzzv, localg);
  }
  
  public zzab(Context paramContext)
  {
    super(paramContext, zzc, a.d.j, d.a.c);
    zze = paramContext;
  }
  
  public static void zzf(Status paramStatus, Object paramObject, TaskCompletionSource paramTaskCompletionSource)
  {
    boolean bool;
    if (paramStatus.D()) {
      bool = paramTaskCompletionSource.trySetResult(paramObject);
    } else {
      bool = paramTaskCompletionSource.trySetException(a0.r(paramStatus));
    }
    if (!bool) {
      zzd.f("The task is already complete.", new Object[0]);
    }
  }
  
  public final Task zza(zzbw paramzzbw)
  {
    q.a locala = new q.a();
    c = new j6.d[] { i.c };
    a = new zzt(this, paramzzbw);
    d = 1513;
    return doWrite(locala.a());
  }
  
  public final Task zzb(b paramb)
  {
    if (paramb != null)
    {
      q.a locala = new q.a();
      c = new j6.d[] { i.b };
      a = new zzu(this, paramb);
      d = 1515;
      return doWrite(locala.a());
    }
    throw new NullPointerException("request cannot be null.");
  }
  
  public final Task zzc(Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (paramAccount != null)
    {
      j.f("Scope cannot be null!", paramString);
      q.a locala = new q.a();
      c = new j6.d[] { i.c };
      a = new zzs(this, paramAccount, paramString, paramBundle);
      d = 1512;
      return doWrite(locala.a());
    }
    throw new NullPointerException("Account name cannot be null!");
  }
  
  public final Task zzd(Account paramAccount)
  {
    if (paramAccount != null)
    {
      q.a locala = new q.a();
      c = new j6.d[] { i.b };
      a = new zzr(this, paramAccount);
      d = 1517;
      return doWrite(locala.a());
    }
    throw new NullPointerException("account cannot be null.");
  }
  
  public final Task zze(String paramString)
  {
    if (paramString != null)
    {
      q.a locala = new q.a();
      c = new j6.d[] { i.b };
      a = new zzq(this, paramString);
      d = 1514;
      return doWrite(locala.a());
    }
    throw new NullPointerException("Client package name cannot be null!");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */