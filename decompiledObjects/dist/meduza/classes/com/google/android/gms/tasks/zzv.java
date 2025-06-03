package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l6.f;
import l6.g;

final class zzv
  extends f
{
  private final List zza = new ArrayList();
  
  private zzv(g paramg)
  {
    super(paramg);
    mLifecycleFragment.c("TaskOnStopCallback", this);
  }
  
  public static zzv zza(Activity paramActivity)
  {
    synchronized (f.getFragment(paramActivity))
    {
      zzv localzzv = (zzv)???.a(zzv.class, "TaskOnStopCallback");
      paramActivity = localzzv;
      if (localzzv == null)
      {
        paramActivity = new com/google/android/gms/tasks/zzv;
        paramActivity.<init>(???);
      }
      return paramActivity;
    }
  }
  
  public final void onStop()
  {
    synchronized (zza)
    {
      Iterator localIterator = zza.iterator();
      while (localIterator.hasNext())
      {
        zzq localzzq = (zzq)((WeakReference)localIterator.next()).get();
        if (localzzq != null) {
          localzzq.zzc();
        }
      }
      zza.clear();
      return;
    }
  }
  
  public final void zzb(zzq paramzzq)
  {
    synchronized (zza)
    {
      List localList2 = zza;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramzzq);
      localList2.add(localWeakReference);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */