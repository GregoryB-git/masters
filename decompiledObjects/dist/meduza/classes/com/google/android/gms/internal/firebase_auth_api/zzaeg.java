package com.google.android.gms.internal.firebase_auth_api;

import android.app.Activity;
import b8.f0;
import b8.r;
import c8.t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzafw;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzags;
import com.google.android.gms.internal.firebase-auth-api.zzagt;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import com.google.android.gms.internal.firebase-auth-api.zzahg;
import com.google.android.gms.internal.firebase-auth-api.zzahs;
import com.google.android.gms.internal.firebase-auth-api.zzzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l6.g;
import m6.j;

abstract class zzaeg<ResultT, CallbackT>
  implements zzaer<ResultT>
{
  public final int zza;
  public final zzaei zzb = new zzaei(this);
  public u7.f zzc;
  public r zzd;
  public CallbackT zze;
  public t zzf;
  public zzaeh<ResultT> zzg;
  public final List<f0> zzh = new ArrayList();
  public Executor zzi;
  public zzagw zzj;
  public zzagl zzk;
  public zzafw zzl;
  public zzahg zzm;
  public b8.f zzn;
  public String zzo;
  public String zzp;
  public zzzs zzq;
  public zzagt zzr;
  public zzags zzs;
  public zzahs zzt;
  private boolean zzu;
  
  public zzaeg(int paramInt)
  {
    zza = paramInt;
  }
  
  public final zzaeg<ResultT, CallbackT> zza(f0 arg1, Activity paramActivity, Executor paramExecutor, String paramString)
  {
    paramString = zzafc.zza(paramString, ???, this);
    synchronized (zzh)
    {
      List localList = zzh;
      j.i(paramString);
      localList.add(paramString);
      if (paramActivity != null) {
        zza.zza(paramActivity, zzh);
      }
      j.i(paramExecutor);
      zzi = paramExecutor;
      return this;
    }
  }
  
  public final zzaeg<ResultT, CallbackT> zza(r paramr)
  {
    if (paramr != null)
    {
      zzd = paramr;
      return this;
    }
    throw new NullPointerException("firebaseUser cannot be null");
  }
  
  public final zzaeg<ResultT, CallbackT> zza(t paramt)
  {
    if (paramt != null)
    {
      zzf = paramt;
      return this;
    }
    throw new NullPointerException("external failure callback cannot be null");
  }
  
  public final zzaeg<ResultT, CallbackT> zza(CallbackT paramCallbackT)
  {
    if (paramCallbackT != null)
    {
      zze = paramCallbackT;
      return this;
    }
    throw new NullPointerException("external callback cannot be null");
  }
  
  public final zzaeg<ResultT, CallbackT> zza(u7.f paramf)
  {
    if (paramf != null)
    {
      zzc = paramf;
      return this;
    }
    throw new NullPointerException("firebaseApp cannot be null");
  }
  
  public final void zza(Status paramStatus)
  {
    zzu = true;
    zzg.zza(null, paramStatus);
  }
  
  public abstract void zzb();
  
  public final void zzb(ResultT paramResultT)
  {
    zzu = true;
    zzg.zza(paramResultT, null);
  }
  
  public static class zza
    extends l6.f
  {
    private final List<f0> zza;
    
    private zza(g paramg, List<f0> paramList)
    {
      super();
      mLifecycleFragment.c("PhoneAuthActivityStopCallback", this);
      zza = paramList;
    }
    
    public static void zza(Activity paramActivity, List<f0> paramList)
    {
      paramActivity = l6.f.getFragment(paramActivity);
      if ((zza)paramActivity.a(com.google.android.gms.internal.firebase-auth-api.zzaeg.zza.class, "PhoneAuthActivityStopCallback") == null) {
        new zza(paramActivity, paramList);
      }
    }
    
    public void onStop()
    {
      synchronized (zza)
      {
        zza.clear();
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaeg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */