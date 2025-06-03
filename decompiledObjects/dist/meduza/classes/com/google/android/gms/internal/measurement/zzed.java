package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b.z;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a;
import d7.a;
import e7.f2;
import e7.h3;
import e7.j3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m6.j;
import v6.b;

public class zzed
{
  private static volatile zzed zzb;
  public final b zza;
  private final String zzc;
  private final ExecutorService zzd;
  private final a zze;
  private final List<Pair<j3, zzd>> zzf;
  private int zzg;
  private boolean zzh;
  private String zzi;
  private volatile zzdl zzj;
  
  private zzed(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramString1 == null) || (!zzc(paramString2, paramString3))) {
      paramString1 = "FA";
    }
    zzc = paramString1;
    zza = z.p;
    paramString1 = zzde.zza();
    zzep localzzep = new zzep(this);
    int i = 1;
    zzd = paramString1.zza(localzzep, 1);
    zze = new a(this);
    zzf = new ArrayList();
    int j;
    if ((zzb(paramContext)) && (!zzk())) {
      j = 0;
    } else {
      j = 1;
    }
    if (j == 0)
    {
      zzi = null;
      zzh = true;
      Log.w(zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
      return;
    }
    if (!zzc(paramString2, paramString3))
    {
      zzi = "fa";
      if ((paramString2 != null) && (paramString3 != null))
      {
        Log.v(zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
      }
      else
      {
        if (paramString2 == null) {
          j = 1;
        } else {
          j = 0;
        }
        if (paramString3 != null) {
          i = 0;
        }
        if ((j ^ i) != 0) {
          Log.w(zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
        }
      }
    }
    else
    {
      zzi = paramString2;
    }
    zza(new zzeg(this, paramString2, paramString3, paramContext, paramBundle));
    paramContext = (Application)paramContext.getApplicationContext();
    if (paramContext == null)
    {
      Log.w(zzc, "Unable to register lifecycle notifications. Application null.");
      return;
    }
    paramContext.registerActivityLifecycleCallbacks(new zzc());
  }
  
  public static zzed zza(Context paramContext)
  {
    return zza(paramContext, null, null, null, null);
  }
  
  public static zzed zza(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    j.i(paramContext);
    if (zzb == null) {
      try
      {
        if (zzb == null)
        {
          zzed localzzed = new com/google/android/gms/internal/measurement/zzed;
          localzzed.<init>(paramContext, paramString1, paramString2, paramString3, paramBundle);
          zzb = localzzed;
        }
      }
      finally {}
    }
    return zzb;
  }
  
  private final void zza(zzb paramzzb)
  {
    zzd.execute(paramzzb);
  }
  
  private final void zza(Exception paramException, boolean paramBoolean1, boolean paramBoolean2)
  {
    zzh |= paramBoolean1;
    if (paramBoolean1)
    {
      Log.w(zzc, "Data collection startup failed. No data will be collected.", paramException);
      return;
    }
    if (paramBoolean2) {
      zza(5, "Error with data collection. Data lost.", paramException, null, null);
    }
    Log.w(zzc, "Error with data collection. Data lost.", paramException);
  }
  
  private final void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
  {
    zza(new zzfn(this, paramLong, paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2));
  }
  
  private static boolean zzb(Context paramContext)
  {
    try
    {
      str = f2.a(paramContext);
      localResources = paramContext.getResources();
      if (!TextUtils.isEmpty(str)) {
        paramContext = str;
      } else {
        paramContext = f2.a(paramContext);
      }
      i = localResources.getIdentifier("google_app_id", "string", paramContext);
      paramContext = null;
      if (i != 0) {}
    }
    catch (IllegalStateException paramContext)
    {
      String str;
      Resources localResources;
      int i;
      label54:
      for (;;) {}
    }
    try
    {
      str = localResources.getString(i);
      paramContext = str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      break label54;
    }
    return paramContext != null;
  }
  
  private final boolean zzc(String paramString1, String paramString2)
  {
    return (paramString2 != null) && (paramString1 != null) && (!zzk());
  }
  
  private final boolean zzk()
  {
    boolean bool = false;
    try
    {
      Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
      bool = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public final int zza(String paramString)
  {
    zzdm localzzdm = new zzdm();
    zza(new zzfg(this, paramString, localzzdm));
    paramString = (Integer)zzdm.zza(localzzdm.zza(10000L), Integer.class);
    if (paramString == null) {
      return 25;
    }
    return paramString.intValue();
  }
  
  public final long zza()
  {
    Object localObject = new zzdm();
    zza(new zzex(this, (zzdm)localObject));
    localObject = ((zzdm)localObject).zzb(500L);
    if (localObject == null)
    {
      long l = System.nanoTime();
      ((z)zza).getClass();
      l = new Random(l ^ System.currentTimeMillis()).nextLong();
      int i = zzg + 1;
      zzg = i;
      return l + i;
    }
    return ((Long)localObject).longValue();
  }
  
  public final Bundle zza(Bundle paramBundle, boolean paramBoolean)
  {
    zzdm localzzdm = new zzdm();
    zza(new zzfd(this, paramBundle, localzzdm));
    if (paramBoolean) {
      return localzzdm.zza(5000L);
    }
    return null;
  }
  
  public final zzdl zza(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = zzdo.asInterface(DynamiteModule.c(paramContext, DynamiteModule.b, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
      return paramContext;
    }
    catch (DynamiteModule.a paramContext)
    {
      zza(paramContext, true, false);
    }
    return null;
  }
  
  public final Object zza(int paramInt)
  {
    zzdm localzzdm = new zzdm();
    zza(new zzfh(this, localzzdm, paramInt));
    return zzdm.zza(localzzdm.zza(15000L), Object.class);
  }
  
  public final List<Bundle> zza(String paramString1, String paramString2)
  {
    zzdm localzzdm = new zzdm();
    zza(new zzek(this, paramString1, paramString2, localzzdm));
    paramString2 = (List)zzdm.zza(localzzdm.zza(5000L), List.class);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = Collections.emptyList();
    }
    return paramString1;
  }
  
  public final Map<String, Object> zza(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = new zzdm();
    zza(new zzfc(this, paramString1, paramString2, paramBoolean, (zzdm)localObject1));
    Bundle localBundle = ((zzdm)localObject1).zza(5000L);
    if ((localBundle != null) && (localBundle.size() != 0))
    {
      paramString2 = new HashMap(localBundle.size());
      localObject1 = localBundle.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramString1 = (String)((Iterator)localObject1).next();
        Object localObject2 = localBundle.get(paramString1);
        if (((localObject2 instanceof Double)) || ((localObject2 instanceof Long)) || ((localObject2 instanceof String))) {
          paramString2.put(paramString1, localObject2);
        }
      }
      return paramString2;
    }
    return Collections.emptyMap();
  }
  
  public final void zza(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza(new zzfe(this, false, 5, paramString, paramObject1, null, null));
  }
  
  public final void zza(long paramLong)
  {
    zza(new zzes(this, paramLong));
  }
  
  public final void zza(Activity paramActivity, String paramString1, String paramString2)
  {
    zza(new zzem(this, zzeb.zza(paramActivity), paramString1, paramString2));
  }
  
  public final void zza(Intent paramIntent)
  {
    zza(new zzfm(this, paramIntent));
  }
  
  public final void zza(Bundle paramBundle)
  {
    zza(new zzei(this, paramBundle));
  }
  
  public final void zza(h3 paramh3)
  {
    zza localzza = new zza(paramh3);
    if (zzj != null) {
      try
      {
        zzj.setEventInterceptor(localzza);
        return;
      }
      catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException paramh3)
      {
        Log.w(zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
      }
    }
    zza(new zzfb(this, localzza));
  }
  
  public final void zza(j3 paramj3)
  {
    j.i(paramj3);
    List localList1 = zzf;
    int i = 0;
    try
    {
      while (i < zzf.size())
      {
        if (paramj3.equals(zzf.get(i)).first))
        {
          Log.w(zzc, "OnEventListener already registered.");
          return;
        }
        i++;
      }
      zzd localzzd = new com/google/android/gms/internal/measurement/zzed$zzd;
      localzzd.<init>(paramj3);
      List localList2 = zzf;
      Pair localPair = new android/util/Pair;
      localPair.<init>(paramj3, localzzd);
      localList2.add(localPair);
      if (zzj != null) {
        try
        {
          zzj.registerOnMeasurementEventListener(localzzd);
          return;
        }
        catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException paramj3)
        {
          Log.w(zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
        }
      }
      zza(new zzfl(this, localzzd));
      return;
    }
    finally {}
  }
  
  public final void zza(Boolean paramBoolean)
  {
    zza(new zzel(this, paramBoolean));
  }
  
  public final void zza(Runnable paramRunnable)
  {
    zza(new zzet(this, paramRunnable));
  }
  
  public final void zza(String paramString, Bundle paramBundle)
  {
    zza(null, paramString, paramBundle, false, true, null);
  }
  
  public final void zza(String paramString1, String paramString2, Bundle paramBundle)
  {
    zza(new zzeh(this, paramString1, paramString2, paramBundle));
  }
  
  public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    zza(paramString1, paramString2, paramBundle, true, false, Long.valueOf(paramLong));
  }
  
  public final void zza(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    zza(new zzef(this, paramString1, paramString2, paramObject, paramBoolean));
  }
  
  public final void zza(boolean paramBoolean)
  {
    zza(new zzfk(this, paramBoolean));
  }
  
  public final a zzb()
  {
    return zze;
  }
  
  public final void zzb(Bundle paramBundle)
  {
    zza(new zzeo(this, paramBundle));
  }
  
  public final void zzb(j3 paramj3)
  {
    j.i(paramj3);
    List localList = zzf;
    int i = 0;
    try
    {
      while (i < zzf.size())
      {
        if (paramj3.equals(zzf.get(i)).first))
        {
          paramj3 = (Pair)zzf.get(i);
          break label74;
        }
        i++;
      }
      paramj3 = null;
      label74:
      if (paramj3 == null)
      {
        Log.w(zzc, "OnEventListener had not been registered.");
        return;
      }
      zzf.remove(paramj3);
      paramj3 = (zzd)second;
      if (zzj != null) {
        try
        {
          zzj.unregisterOnMeasurementEventListener(paramj3);
          return;
        }
        catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException localRemoteException)
        {
          Log.w(zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
        }
      }
      zza(new zzfo(this, paramj3));
      return;
    }
    finally {}
  }
  
  public final void zzb(String paramString)
  {
    zza(new zzer(this, paramString));
  }
  
  public final void zzb(String paramString1, String paramString2)
  {
    zza(null, paramString1, paramString2, false);
  }
  
  public final void zzb(String paramString1, String paramString2, Bundle paramBundle)
  {
    zza(paramString1, paramString2, paramBundle, true, true, null);
  }
  
  public final Long zzc()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzfi(this, localzzdm));
    return localzzdm.zzb(120000L);
  }
  
  public final void zzc(Bundle paramBundle)
  {
    zza(new zzen(this, paramBundle));
  }
  
  public final void zzc(String paramString)
  {
    zza(new zzeu(this, paramString));
  }
  
  public final String zzd()
  {
    return zzi;
  }
  
  public final void zzd(Bundle paramBundle)
  {
    zza(new zzfj(this, paramBundle));
  }
  
  public final void zzd(String paramString)
  {
    zza(new zzej(this, paramString));
  }
  
  public final String zze()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzff(this, localzzdm));
    return localzzdm.zzc(120000L);
  }
  
  public final String zzf()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzey(this, localzzdm));
    return localzzdm.zzc(50L);
  }
  
  public final String zzg()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzez(this, localzzdm));
    return localzzdm.zzc(500L);
  }
  
  public final String zzh()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzfa(this, localzzdm));
    return localzzdm.zzc(500L);
  }
  
  public final String zzi()
  {
    zzdm localzzdm = new zzdm();
    zza(new zzev(this, localzzdm));
    return localzzdm.zzc(500L);
  }
  
  public final void zzj()
  {
    zza(new zzeq(this));
  }
  
  public static final class zza
    extends zzdv
  {
    private final h3 zza;
    
    public zza(h3 paramh3)
    {
      zza = paramh3;
    }
    
    public final int zza()
    {
      return System.identityHashCode(zza);
    }
    
    public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      ((AppMeasurementDynamiteService.a)zza).a(paramString1, paramString2, paramBundle, paramLong);
    }
  }
  
  public abstract class zzb
    implements Runnable
  {
    public final long zza;
    public final long zzb;
    private final boolean zzc;
    
    public zzb()
    {
      this(true);
    }
    
    public zzb(boolean paramBoolean)
    {
      ((z)zza).getClass();
      zza = System.currentTimeMillis();
      ((z)zza).getClass();
      zzb = SystemClock.elapsedRealtime();
      zzc = paramBoolean;
    }
    
    public void run()
    {
      if (zzed.zzc(zzed.this))
      {
        zzb();
        return;
      }
      try
      {
        zza();
        return;
      }
      catch (Exception localException)
      {
        zzed.zza(zzed.this, localException, false, zzc);
        zzb();
      }
    }
    
    public abstract void zza();
    
    public void zzb() {}
  }
  
  public final class zzc
    implements Application.ActivityLifecycleCallbacks
  {
    public zzc() {}
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      zzed.zza(zzed.this, new zzfq(this, paramBundle, paramActivity));
    }
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      zzed.zza(zzed.this, new zzfv(this, paramActivity));
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      zzed.zza(zzed.this, new zzfr(this, paramActivity));
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      zzed.zza(zzed.this, new zzfs(this, paramActivity));
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      zzdm localzzdm = new zzdm();
      zzed.zza(zzed.this, new zzft(this, paramActivity, localzzdm));
      paramActivity = localzzdm.zza(50L);
      if (paramActivity != null) {
        paramBundle.putAll(paramActivity);
      }
    }
    
    public final void onActivityStarted(Activity paramActivity)
    {
      zzed.zza(zzed.this, new zzfp(this, paramActivity));
    }
    
    public final void onActivityStopped(Activity paramActivity)
    {
      zzed.zza(zzed.this, new zzfu(this, paramActivity));
    }
  }
  
  public static final class zzd
    extends zzdv
  {
    private final j3 zza;
    
    public zzd(j3 paramj3)
    {
      zza = paramj3;
    }
    
    public final int zza()
    {
      return System.identityHashCode(zza);
    }
    
    public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      zza.a(paramString1, paramString2, paramBundle, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */