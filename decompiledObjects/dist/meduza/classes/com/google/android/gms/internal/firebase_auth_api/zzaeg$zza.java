package com.google.android.gms.internal.firebase_auth_api;

import android.app.Activity;
import b8.f0;
import java.util.List;
import l6.f;
import l6.g;

class zzaeg$zza
  extends f
{
  private final List<f0> zza;
  
  private zzaeg$zza(g paramg, List<f0> paramList)
  {
    super(paramg);
    mLifecycleFragment.c("PhoneAuthActivityStopCallback", this);
    zza = paramList;
  }
  
  public static void zza(Activity paramActivity, List<f0> paramList)
  {
    paramActivity = f.getFragment(paramActivity);
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaeg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */