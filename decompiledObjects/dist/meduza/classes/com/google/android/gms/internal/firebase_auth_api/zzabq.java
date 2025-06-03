package com.google.android.gms.internal.firebase_auth_api;

import android.app.Activity;
import android.text.TextUtils;
import b8.c;
import b8.c0;
import b8.f0;
import b8.g;
import b8.g0;
import b8.h;
import b8.h0;
import b8.j0;
import b8.k0;
import b8.p0;
import b8.r;
import b8.s;
import c8.e;
import c8.i;
import c8.k;
import c8.n;
import c8.s0;
import c8.u;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m6.j;

public final class zzabq
  extends zzaep
{
  public zzabq(u7.f paramf, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService)
  {
    zza = new zzado(paramf, paramScheduledExecutorService);
    zzb = paramExecutor;
  }
  
  public static i zza(u7.f paramf, com.google.android.gms.internal.firebase-auth-api.zzagl paramzzagl)
  {
    j.i(paramf);
    j.i(paramzzagl);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new e(paramzzagl));
    List localList = paramzzagl.zzl();
    if ((localList != null) && (!localList.isEmpty())) {
      for (int i = 0; i < localList.size(); i++) {
        localArrayList.add(new e((zzahc)localList.get(i)));
      }
    }
    paramf = new i(paramf, localArrayList);
    q = new k(paramzzagl.zzb(), paramzzagl.zza());
    r = paramzzagl.zzn();
    s = paramzzagl.zze();
    paramf.P(x6.b.G0(paramzzagl.zzk()));
    paramf.N(paramzzagl.zzd());
    return paramf;
  }
  
  public final Task<zzags> zza()
  {
    return zza(new zzaca());
  }
  
  public final Task<Void> zza(r paramr, u paramu)
  {
    return zza((zzabx)new zzabx().zza(paramr).zza(paramu).zza(paramu));
  }
  
  public final Task<Void> zza(n paramn, h0 paramh0, String paramString1, long paramLong, boolean paramBoolean1, boolean paramBoolean2, String paramString2, String paramString3, String paramString4, boolean paramBoolean3, f0 paramf0, Executor paramExecutor, Activity paramActivity)
  {
    paramn = b;
    j.e(paramn);
    paramn = new zzadd(paramh0, paramn, paramString1, paramLong, paramBoolean1, paramBoolean2, paramString2, paramString3, paramString4, paramBoolean3);
    paramn.zza(paramf0, paramActivity, paramExecutor, a);
    return zza(paramn);
  }
  
  public final Task<zzahs> zza(n paramn, String paramString)
  {
    return zza(new zzada(paramn, paramString));
  }
  
  public final Task<Void> zza(n paramn, String paramString1, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2, String paramString3, String paramString4, String paramString5, boolean paramBoolean3, f0 paramf0, Executor paramExecutor, Activity paramActivity)
  {
    paramn = new zzadb(paramn, paramString1, paramString2, paramLong, paramBoolean1, paramBoolean2, paramString3, paramString4, paramString5, paramBoolean3);
    paramn.zza(paramf0, paramActivity, paramExecutor, paramString1);
    return zza(paramn);
  }
  
  public final Task<Void> zza(String paramString)
  {
    return zza(new zzacs(paramString));
  }
  
  public final Task<zzagt> zza(String paramString1, String paramString2)
  {
    return zza(new zzacd(paramString1, paramString2));
  }
  
  public final Task<Void> zza(String paramString1, String paramString2, c paramc)
  {
    q = 7;
    return zza(new zzadl(paramString1, paramString2, paramc));
  }
  
  public final Task<Void> zza(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return zza(new zzacr(paramString1, paramString2, paramString3, paramString4));
  }
  
  public final Task<g> zza(u7.f paramf, c0 paramc0, String paramString, z0 paramz0)
  {
    zzafc.zza();
    return zza((zzacy)new zzacy(paramc0, paramString).zza(paramf).zza(paramz0));
  }
  
  public final Task<Void> zza(u7.f paramf, c paramc, String paramString)
  {
    return zza((zzacq)new zzacq(paramString, paramc).zza(paramf));
  }
  
  public final Task<g> zza(u7.f paramf, b8.f paramf1, String paramString, z0 paramz0)
  {
    return zza((zzacu)new zzacu(paramf1, paramString).zza(paramf).zza(paramz0));
  }
  
  public final Task<Void> zza(u7.f paramf, g0 paramg0, r paramr, String paramString, z0 paramz0)
  {
    zzafc.zza();
    paramg0 = new zzabz(paramg0, paramr.zze(), paramString, null);
    paramg0.zza(paramf).zza(paramz0);
    return zza(paramg0);
  }
  
  public final Task<g> zza(u7.f paramf, h paramh, String paramString, z0 paramz0)
  {
    return zza((zzacz)new zzacz(paramh, paramString).zza(paramf).zza(paramz0));
  }
  
  public final Task<Void> zza(u7.f paramf, k0 paramk0, r paramr, String paramString1, String paramString2, z0 paramz0)
  {
    paramk0 = new zzabz(paramk0, paramr.zze(), paramString1, paramString2);
    paramk0.zza(paramf).zza(paramz0);
    return zza(paramk0);
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, c0 paramc0, s0 params0)
  {
    zzafc.zza();
    return zza((zzadj)new zzadj(paramc0).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, c0 paramc0, String paramString, s0 params0)
  {
    zzafc.zza();
    return zza((zzacm)new zzacm(paramc0, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zza(u7.f paramf, r paramr, b8.f paramf1, String paramString, s0 params0)
  {
    j.i(paramf);
    j.i(paramf1);
    j.i(paramr);
    j.i(params0);
    List localList = paramr.zzg();
    if ((localList != null) && (localList.contains(paramf1.D()))) {
      return Tasks.forException(zzadr.zza(new Status(17015, null, null, null)));
    }
    if ((paramf1 instanceof h))
    {
      paramf1 = (h)paramf1;
      if (!(TextUtils.isEmpty(c) ^ true)) {
        return zza((zzacc)new zzacc(paramf1, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
      }
      return zza((zzach)new zzach(paramf1).zza(paramf).zza(paramr).zza(params0).zza(params0));
    }
    if ((paramf1 instanceof c0))
    {
      paramf1 = (c0)paramf1;
      zzafc.zza();
      return zza((zzace)new zzace(paramf1).zza(paramf).zza(paramr).zza(params0).zza(params0));
    }
    return zza((zzacf)new zzacf(paramf1).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zza(u7.f paramf, r paramr, g0 paramg0, String paramString, z0 paramz0)
  {
    zzafc.zza();
    paramg0 = new zzaby(paramg0, paramString, null);
    paramg0.zza(paramf).zza(paramz0);
    if (paramr != null) {
      paramg0.zza(paramr);
    }
    return zza(paramg0);
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, h paramh, String paramString, s0 params0)
  {
    return zza((zzaci)new zzaci(paramh, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zza(u7.f paramf, r paramr, k0 paramk0, String paramString1, String paramString2, z0 paramz0)
  {
    paramk0 = new zzaby(paramk0, paramString1, paramString2);
    paramk0.zza(paramf).zza(paramz0);
    if (paramr != null) {
      paramk0.zza(paramr);
    }
    return zza(paramk0);
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, p0 paramp0, s0 params0)
  {
    return zza((zzadi)new zzadi(paramp0).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, s0 params0)
  {
    return zza((zzaco)new zzaco().zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<s> zza(u7.f paramf, r paramr, String paramString, s0 params0)
  {
    return zza((zzacb)new zzacb(paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, String paramString1, String paramString2, s0 params0)
  {
    return zza((zzadc)new zzadc(paramr.zze(), paramString1, paramString2).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zza(u7.f paramf, r paramr, String paramString1, String paramString2, String paramString3, String paramString4, s0 params0)
  {
    return zza((zzack)new zzack(paramString1, paramString2, paramString3, paramString4).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zza(u7.f paramf, z0 paramz0, String paramString)
  {
    return zza((zzacv)new zzacv(paramString).zza(paramf).zza(paramz0));
  }
  
  public final Task<Void> zza(u7.f paramf, String paramString1, c paramc, String paramString2, String paramString3)
  {
    q = 1;
    return zza((zzact)new zzact(paramString1, paramc, paramString2, paramString3, "sendPasswordResetEmail").zza(paramf));
  }
  
  public final Task<Void> zza(u7.f paramf, String paramString1, String paramString2)
  {
    return zza((zzabt)new zzabt(paramString1, paramString2).zza(paramf));
  }
  
  public final Task<g> zza(u7.f paramf, String paramString1, String paramString2, z0 paramz0)
  {
    return zza((zzacx)new zzacx(paramString1, paramString2).zza(paramf).zza(paramz0));
  }
  
  public final Task<Void> zza(u7.f paramf, String paramString1, String paramString2, String paramString3)
  {
    return zza((zzabv)new zzabv(paramString1, paramString2, paramString3).zza(paramf));
  }
  
  public final Task<g> zza(u7.f paramf, String paramString1, String paramString2, String paramString3, String paramString4, z0 paramz0)
  {
    return zza((zzabu)new zzabu(paramString1, paramString2, paramString3, paramString4).zza(paramf).zza(paramz0));
  }
  
  public final void zza(u7.f paramf, com.google.android.gms.internal.firebase-auth-api.zzahk paramzzahk, f0 paramf0, Activity paramActivity, Executor paramExecutor)
  {
    zza((zzadn)new zzadn(paramzzahk).zza(paramf).zza(paramf0, paramActivity, paramExecutor, paramzzahk.zzd()));
  }
  
  public final Task<g> zzb(u7.f paramf, r paramr, c0 paramc0, String paramString, s0 params0)
  {
    zzafc.zza();
    return zza((zzacp)new zzacp(paramc0, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zzb(u7.f paramf, r paramr, b8.f paramf1, String paramString, s0 params0)
  {
    return zza((zzacg)new zzacg(paramf1, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zzb(u7.f paramf, r paramr, h paramh, String paramString, s0 params0)
  {
    return zza((zzacl)new zzacl(paramh, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zzb(u7.f paramf, r paramr, String paramString, s0 params0)
  {
    j.i(paramf);
    j.e(paramString);
    j.i(paramr);
    j.i(params0);
    List localList = paramr.zzg();
    if (((localList != null) && (!localList.contains(paramString))) || (paramr.H())) {
      return Tasks.forException(zzadr.zza(new Status(17016, paramString, null, null)));
    }
    paramString.getClass();
    if (!paramString.equals("password")) {
      return zza((zzade)new zzade(paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
    }
    return zza((zzadf)new zzadf().zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<g> zzb(u7.f paramf, r paramr, String paramString1, String paramString2, String paramString3, String paramString4, s0 params0)
  {
    return zza((zzacn)new zzacn(paramString1, paramString2, paramString3, paramString4).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zzb(u7.f paramf, String paramString1, c paramc, String paramString2, String paramString3)
  {
    q = 6;
    return zza((zzact)new zzact(paramString1, paramc, paramString2, paramString3, "sendSignInLinkToEmail").zza(paramf));
  }
  
  public final Task<b8.b> zzb(u7.f paramf, String paramString1, String paramString2)
  {
    return zza((zzabs)new zzabs(paramString1, paramString2).zza(paramf));
  }
  
  public final Task<g> zzb(u7.f paramf, String paramString1, String paramString2, String paramString3, String paramString4, z0 paramz0)
  {
    return zza((zzacw)new zzacw(paramString1, paramString2, paramString3, paramString4).zza(paramf).zza(paramz0));
  }
  
  public final Task<g> zzc(u7.f paramf, r paramr, b8.f paramf1, String paramString, s0 params0)
  {
    return zza((zzacj)new zzacj(paramf1, paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<Void> zzc(u7.f paramf, r paramr, String paramString, s0 params0)
  {
    return zza((zzadh)new zzadh(paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<j0> zzc(u7.f paramf, String paramString1, String paramString2)
  {
    return zza((zzabw)new zzabw(paramString1, paramString2).zza(paramf));
  }
  
  public final Task<Void> zzd(u7.f paramf, r paramr, String paramString, s0 params0)
  {
    return zza((zzadg)new zzadg(paramString).zza(paramf).zza(paramr).zza(params0).zza(params0));
  }
  
  public final Task<String> zzd(u7.f paramf, String paramString1, String paramString2)
  {
    return zza((zzadk)new zzadk(paramString1, paramString2).zza(paramf));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzabq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */