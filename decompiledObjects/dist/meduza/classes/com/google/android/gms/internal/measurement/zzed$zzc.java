package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzed$zzc
  implements Application.ActivityLifecycleCallbacks
{
  public zzed$zzc(zzed paramzzed) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    zzed.zza(zza, new zzfq(this, paramBundle, paramActivity));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    zzed.zza(zza, new zzfv(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    zzed.zza(zza, new zzfr(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    zzed.zza(zza, new zzfs(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    zzdm localzzdm = new zzdm();
    zzed.zza(zza, new zzft(this, paramActivity, localzzdm));
    paramActivity = localzzdm.zza(50L);
    if (paramActivity != null) {
      paramBundle.putAll(paramActivity);
    }
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    zzed.zza(zza, new zzfp(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    zzed.zza(zza, new zzfu(this, paramActivity));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzed.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */