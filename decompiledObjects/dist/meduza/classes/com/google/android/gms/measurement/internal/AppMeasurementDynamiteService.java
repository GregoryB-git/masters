package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzeb;
import d2.q;
import e7.a0;
import e7.a1;
import e7.b1;
import e7.b6;
import e7.d3;
import e7.e2;
import e7.f0;
import e7.f6;
import e7.h0;
import e7.h3;
import e7.i4;
import e7.j0;
import e7.j2;
import e7.j3;
import e7.k3;
import e7.k4;
import e7.l4;
import e7.m0;
import e7.m3;
import e7.n3;
import e7.n4;
import e7.o0;
import e7.o2;
import e7.o3;
import e7.p2;
import e7.p3;
import e7.q3;
import e7.q4;
import e7.r6;
import e7.s2;
import e7.s3;
import e7.s4;
import e7.t0;
import e7.t3;
import e7.x3;
import e7.z3;
import i6.p;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import l6.q0;
import m6.j;
import nc.g0;
import r.b;

public class AppMeasurementDynamiteService
  extends zzdo
{
  public j2 a = null;
  public final b b = new b();
  
  public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService paramAppMeasurementDynamiteService, zzdr paramzzdr)
  {
    try
    {
      paramzzdr.a_();
      return;
    }
    catch (RemoteException paramzzdr)
    {
      paramAppMeasurementDynamiteService = a;
      j.i(paramAppMeasurementDynamiteService);
      zzjr.c("Failed to call IDynamiteUploadBatchesCallback", paramzzdr);
    }
  }
  
  public void beginAdUnitExposure(String paramString, long paramLong)
  {
    g();
    e7.a locala = a.y;
    if (locala != null)
    {
      locala.u(paramString, paramLong);
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    g();
    a.k().a(paramString1, paramString2, paramBundle);
  }
  
  public void clearMeasurementEnabled(long paramLong)
  {
    g();
    k3 localk3 = a.k();
    localk3.t();
    localk3.zzl().u(new q0(2, localk3, null));
  }
  
  public void endAdUnitExposure(String paramString, long paramLong)
  {
    g();
    e7.a locala = a.y;
    if (locala != null)
    {
      locala.x(paramString, paramLong);
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final void g()
  {
    if (a != null) {
      return;
    }
    throw new IllegalStateException("Attempting to perform action before initialize.");
  }
  
  public void generateEventId(zzdq paramzzdq)
  {
    g();
    long l = a.m().y0();
    g();
    a.m().G(paramzzdq, l);
  }
  
  public void getAppInstanceId(zzdq paramzzdq)
  {
    g();
    a.zzl().u(new p(this, paramzzdq, 4));
  }
  
  public void getCachedAppInstanceId(zzdq paramzzdq)
  {
    g();
    r((String)a.k().p.get(), paramzzdq);
  }
  
  public void getConditionalUserProperties(String paramString1, String paramString2, zzdq paramzzdq)
  {
    g();
    a.zzl().u(new o2(this, paramzzdq, paramString1, paramString2));
  }
  
  public void getCurrentScreenClass(zzdq paramzzdq)
  {
    g();
    Object localObject = (j2)a.k().b;
    j2.b(w);
    localObject = w.d;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    r((String)localObject, paramzzdq);
  }
  
  public void getCurrentScreenName(zzdq paramzzdq)
  {
    g();
    Object localObject = (j2)a.k().b;
    j2.b(w);
    localObject = w.d;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    r((String)localObject, paramzzdq);
  }
  
  /* Error */
  public void getGmpAppId(zzdq paramzzdq)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 64	com/google/android/gms/measurement/internal/AppMeasurementDynamiteService:g	()V
    //   4: aload_0
    //   5: getfield 24	com/google/android/gms/measurement/internal/AppMeasurementDynamiteService:a	Le7/j2;
    //   8: invokevirtual 86	e7/j2:k	()Le7/k3;
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 169	d2/q:b	Ljava/lang/Object;
    //   16: checkcast 32	e7/j2
    //   19: getfield 194	e7/j2:b	Ljava/lang/String;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull +6 -> 30
    //   27: goto +108 -> 135
    //   30: aconst_null
    //   31: astore 4
    //   33: aload_2
    //   34: invokevirtual 198	d2/q:zza	()Landroid/content/Context;
    //   37: astore 5
    //   39: aload_2
    //   40: getfield 169	d2/q:b	Ljava/lang/Object;
    //   43: checkcast 32	e7/j2
    //   46: getfield 201	e7/j2:A	Ljava/lang/String;
    //   49: astore_3
    //   50: aload 5
    //   52: invokestatic 30	m6/j:i	(Ljava/lang/Object;)V
    //   55: aload 5
    //   57: invokevirtual 207	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   60: astore 6
    //   62: aload_3
    //   63: invokestatic 213	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   66: ifne +6 -> 72
    //   69: goto +9 -> 78
    //   72: aload 5
    //   74: invokestatic 218	e7/f2:a	(Landroid/content/Context;)Ljava/lang/String;
    //   77: astore_3
    //   78: aload 6
    //   80: ldc -36
    //   82: ldc -34
    //   84: aload_3
    //   85: invokevirtual 228	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   88: istore 7
    //   90: iload 7
    //   92: ifne +9 -> 101
    //   95: aload 4
    //   97: astore_3
    //   98: goto +37 -> 135
    //   101: aload 6
    //   103: iload 7
    //   105: invokevirtual 232	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   108: astore_3
    //   109: goto +26 -> 135
    //   112: astore_3
    //   113: aload_2
    //   114: getfield 169	d2/q:b	Ljava/lang/Object;
    //   117: checkcast 32	e7/j2
    //   120: invokevirtual 36	e7/j2:zzj	()Le7/a1;
    //   123: getfield 235	e7/a1:o	Le7/b1;
    //   126: ldc -19
    //   128: aload_3
    //   129: invokevirtual 50	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   132: aload 4
    //   134: astore_3
    //   135: aload_0
    //   136: aload_3
    //   137: aload_1
    //   138: invokevirtual 158	com/google/android/gms/measurement/internal/AppMeasurementDynamiteService:r	(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzdq;)V
    //   141: return
    //   142: astore_3
    //   143: aload 4
    //   145: astore_3
    //   146: goto -11 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	AppMeasurementDynamiteService
    //   0	149	1	paramzzdq	zzdq
    //   11	103	2	localk3	k3
    //   22	87	3	localObject1	Object
    //   112	17	3	localIllegalStateException	IllegalStateException
    //   134	3	3	localObject2	Object
    //   142	1	3	localNotFoundException	android.content.res.Resources.NotFoundException
    //   145	1	3	localObject3	Object
    //   31	113	4	localObject4	Object
    //   37	36	5	localContext	Context
    //   60	42	6	localResources	android.content.res.Resources
    //   88	16	7	i	int
    // Exception table:
    //   from	to	target	type
    //   33	69	112	java/lang/IllegalStateException
    //   72	78	112	java/lang/IllegalStateException
    //   78	90	112	java/lang/IllegalStateException
    //   101	109	112	java/lang/IllegalStateException
    //   101	109	142	android/content/res/Resources$NotFoundException
  }
  
  public void getMaxUserProperties(String paramString, zzdq paramzzdq)
  {
    g();
    a.k();
    j.e(paramString);
    g();
    a.m().F(paramzzdq, 25);
  }
  
  public void getSessionId(zzdq paramzzdq)
  {
    g();
    k3 localk3 = a.k();
    localk3.zzl().u(new s2(2, localk3, paramzzdq));
  }
  
  public void getTestFlag(zzdq paramzzdq, int paramInt)
  {
    g();
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4)
            {
              localObject1 = a.m();
              localObject2 = a.k();
              localObject2.getClass();
              localObject3 = new AtomicReference();
              ((r6)localObject1).I(paramzzdq, ((Boolean)((q)localObject2).zzl().q((AtomicReference)localObject3, 15000L, "boolean test flag value", new t3((k3)localObject2, (AtomicReference)localObject3, 0))).booleanValue());
            }
            return;
          }
          localObject2 = a.m();
          localObject1 = a.k();
          localObject1.getClass();
          localObject3 = new AtomicReference();
          ((r6)localObject2).F(paramzzdq, ((Integer)((q)localObject1).zzl().q((AtomicReference)localObject3, 15000L, "int test flag value", new t3((k3)localObject1, (AtomicReference)localObject3, 1))).intValue());
          return;
        }
        localObject1 = a.m();
        localObject3 = a.k();
        localObject3.getClass();
        localObject2 = new AtomicReference();
        double d = ((Double)((q)localObject3).zzl().q((AtomicReference)localObject2, 15000L, "double test flag value", new m3((k3)localObject3, (AtomicReference)localObject2, 2))).doubleValue();
        localObject2 = new Bundle();
        ((BaseBundle)localObject2).putDouble("r", d);
        try
        {
          paramzzdq.zza((Bundle)localObject2);
          return;
        }
        catch (RemoteException paramzzdq)
        {
          b).zzj().r.c("Error returning double value to wrapper", paramzzdq);
          return;
        }
      }
      localObject2 = a.m();
      localObject1 = a.k();
      localObject1.getClass();
      localObject3 = new AtomicReference();
      ((r6)localObject2).G(paramzzdq, ((Long)((q)localObject1).zzl().q((AtomicReference)localObject3, 15000L, "long test flag value", new q3((k3)localObject1, (AtomicReference)localObject3, 1))).longValue());
      return;
    }
    Object localObject1 = a.m();
    Object localObject3 = a.k();
    localObject3.getClass();
    Object localObject2 = new AtomicReference();
    ((r6)localObject1).N((String)((q)localObject3).zzl().q((AtomicReference)localObject2, 15000L, "String test flag value", new m3((k3)localObject3, (AtomicReference)localObject2, 1)), paramzzdq);
  }
  
  public void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, zzdq paramzzdq)
  {
    g();
    a.zzl().u(new n3(this, paramzzdq, paramString1, paramString2, paramBoolean));
  }
  
  public void initForTests(Map paramMap)
  {
    g();
  }
  
  public void initialize(IObjectWrapper paramIObjectWrapper, zzdz paramzzdz, long paramLong)
  {
    j2 localj2 = a;
    if (localj2 == null)
    {
      paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
      j.i(paramIObjectWrapper);
      a = j2.a(paramIObjectWrapper, paramzzdz, Long.valueOf(paramLong));
      return;
    }
    zzjr.b("Attempting to initialize multiple times");
  }
  
  public void isDataCollectionEnabled(zzdq paramzzdq)
  {
    g();
    a.zzl().u(new q0(6, this, paramzzdq));
  }
  
  public void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    g();
    a.k().E(paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2, paramLong);
  }
  
  public void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, zzdq paramzzdq, long paramLong)
  {
    g();
    j.e(paramString2);
    Bundle localBundle = new android/os/Bundle;
    if (paramBundle != null) {
      localBundle.<init>(paramBundle);
    } else {
      localBundle.<init>();
    }
    localBundle.putString("_o", "app");
    paramString2 = new f0(paramString2, new a0(paramBundle), "app", paramLong);
    a.zzl().u(new p2(this, paramzzdq, paramString2, paramString1));
  }
  
  public void logHealthData(int paramInt, String paramString, IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
  {
    g();
    Object localObject = null;
    if (paramIObjectWrapper1 == null) {
      paramIObjectWrapper1 = null;
    } else {
      paramIObjectWrapper1 = ObjectWrapper.unwrap(paramIObjectWrapper1);
    }
    if (paramIObjectWrapper2 == null) {
      paramIObjectWrapper2 = null;
    } else {
      paramIObjectWrapper2 = ObjectWrapper.unwrap(paramIObjectWrapper2);
    }
    if (paramIObjectWrapper3 == null) {
      paramIObjectWrapper3 = (IObjectWrapper)localObject;
    } else {
      paramIObjectWrapper3 = ObjectWrapper.unwrap(paramIObjectWrapper3);
    }
    a.zzj().t(paramInt, true, false, paramString, paramIObjectWrapper1, paramIObjectWrapper2, paramIObjectWrapper3);
  }
  
  public void onActivityCreated(IObjectWrapper paramIObjectWrapper, Bundle paramBundle, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityCreatedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramBundle, paramLong);
  }
  
  public void onActivityCreatedByScionActivityInfo(zzeb paramzzeb, Bundle paramBundle, long paramLong)
  {
    g();
    i4 locali4 = a.k().d;
    if (locali4 != null)
    {
      a.k().K();
      locali4.b(paramzzeb, paramBundle);
    }
  }
  
  public void onActivityDestroyed(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityDestroyedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramLong);
  }
  
  public void onActivityDestroyedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    g();
    i4 locali4 = a.k().d;
    if (locali4 != null)
    {
      a.k().K();
      locali4.a(paramzzeb);
    }
  }
  
  public void onActivityPaused(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityPausedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramLong);
  }
  
  public void onActivityPausedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    g();
    i4 locali4 = a.k().d;
    if (locali4 != null)
    {
      a.k().K();
      locali4.c(paramzzeb);
    }
  }
  
  public void onActivityResumed(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityResumedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramLong);
  }
  
  public void onActivityResumedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    g();
    i4 locali4 = a.k().d;
    if (locali4 != null)
    {
      a.k().K();
      locali4.e(paramzzeb);
    }
  }
  
  public void onActivitySaveInstanceState(IObjectWrapper paramIObjectWrapper, zzdq paramzzdq, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivitySaveInstanceStateByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramzzdq, paramLong);
  }
  
  public void onActivitySaveInstanceStateByScionActivityInfo(zzeb paramzzeb, zzdq paramzzdq, long paramLong)
  {
    g();
    i4 locali4 = a.k().d;
    Bundle localBundle = new Bundle();
    if (locali4 != null)
    {
      a.k().K();
      locali4.d(paramzzeb, localBundle);
    }
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzeb)
    {
      a.zzj().r.c("Error returning bundle value to wrapper", paramzzeb);
    }
  }
  
  public void onActivityStarted(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityStartedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramLong);
  }
  
  public void onActivityStartedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    g();
    if (a.k().d != null) {
      a.k().K();
    }
  }
  
  public void onActivityStopped(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    onActivityStoppedByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramLong);
  }
  
  public void onActivityStoppedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    g();
    if (a.k().d != null) {
      a.k().K();
    }
  }
  
  public void performAction(Bundle paramBundle, zzdq paramzzdq, long paramLong)
  {
    g();
    paramzzdq.zza(null);
  }
  
  public final void r(String paramString, zzdq paramzzdq)
  {
    g();
    a.m().N(paramString, paramzzdq);
  }
  
  public void registerOnMeasurementEventListener(zzdw paramzzdw)
  {
    g();
    synchronized (b)
    {
      j3 localj3 = (j3)b.getOrDefault(Integer.valueOf(paramzzdw.zza()), null);
      Object localObject = localj3;
      if (localj3 == null)
      {
        localObject = new com/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;
        ((b)localObject).<init>(this, paramzzdw);
        b.put(Integer.valueOf(paramzzdw.zza()), localObject);
      }
      paramzzdw = a.k();
      paramzzdw.t();
      if (!f.add(localObject)) {
        zzjr.b("OnEventListener already registered");
      }
      return;
    }
  }
  
  public void resetAnalyticsData(long paramLong)
  {
    g();
    k3 localk3 = a.k();
    localk3.P(null);
    localk3.zzl().u(new z3(localk3, paramLong, 1));
  }
  
  public void retrieveAndUploadBatches(zzdr paramzzdr)
  {
    g();
    Object localObject1 = a.o;
    Object localObject2 = h0.M0;
    if (!((e7.h)localObject1).x(null, (m0)localObject2)) {
      return;
    }
    localObject1 = a.k();
    p localp = new p(5, this, paramzzdr);
    if (((q)localObject1).h().x(null, (m0)localObject2))
    {
      ((j0)localObject1).t();
      if (((q)localObject1).zzl().w())
      {
        paramzzdr = zzjo;
        localObject1 = "Cannot retrieve and upload batches from analytics worker thread";
      }
      else
      {
        paramzzdr = ((q)localObject1).zzl();
        paramzzdr.getClass();
        if (Thread.currentThread() == e) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramzzdr = zzjo;
          localObject1 = "Cannot retrieve and upload batches from analytics network thread";
        }
        else
        {
          if (!g0.d()) {
            break label165;
          }
          paramzzdr = zzjo;
          localObject1 = "Cannot retrieve and upload batches from main thread";
        }
      }
      paramzzdr.b((String)localObject1);
      return;
      label165:
      zzjw.b("[sgtm] Started client-side batch upload work.");
      int j = 0;
      int k = j;
      int i = k;
      int m = k;
      int n;
      for (k = j; m == 0; k = n + k)
      {
        zzjw.b("[sgtm] Getting upload batches from service (FE)");
        paramzzdr = new AtomicReference();
        ((q)localObject1).zzl().q(paramzzdr, 10000L, "[sgtm] Getting upload batches", new q3((k3)localObject1, paramzzdr, 0));
        paramzzdr = (f6)paramzzdr.get();
        if ((paramzzdr == null) || (a.isEmpty())) {
          break;
        }
        zzjw.c("[sgtm] Retrieved upload batches. count", Integer.valueOf(a.size()));
        n = a.size();
        localObject2 = a.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Object localObject3 = (b6)((Iterator)localObject2).next();
          try
          {
            paramzzdr = new java/net/URI;
            paramzzdr.<init>(c);
            URL localURL = paramzzdr.toURL();
            paramzzdr = new AtomicReference();
            Object localObject5 = ((o0)localObject1).m();
            ((j0)localObject5).t();
            j.i(p);
            localObject5 = p;
            zzjw.a(Long.valueOf(a), c, Integer.valueOf(b.length), "[sgtm] Uploading data from app. row_id, url, uncompressed size");
            if (!TextUtils.isEmpty(o)) {
              zzjw.d("[sgtm] Uploading data from app. row_id", Long.valueOf(a), o);
            }
            HashMap localHashMap = new HashMap();
            Iterator localIterator = d.keySet().iterator();
            while (localIterator.hasNext())
            {
              localObject6 = (String)localIterator.next();
              localObject7 = d.getString((String)localObject6);
              if (!TextUtils.isEmpty((CharSequence)localObject7)) {
                localHashMap.put(localObject6, localObject7);
              }
            }
            Object localObject6 = (j2)b;
            j2.c(z);
            localObject6 = z;
            Object localObject7 = b;
            localObject3 = new p3((k3)localObject1, paramzzdr, (b6)localObject3);
            ((d3)localObject6).m();
            j.i(localURL);
            j.i(localObject7);
            ((q)localObject6).zzl().s(new n4((l4)localObject6, (String)localObject5, localURL, (byte[])localObject7, localHashMap, (k4)localObject3));
            try
            {
              localObject3 = ((q)localObject1).k();
              ((z)((q)localObject3).zzb()).getClass();
              long l1 = System.currentTimeMillis();
              long l2 = 60000L;
              try
              {
                while ((paramzzdr.get() == null) && (l2 > 0L))
                {
                  paramzzdr.wait(l2);
                  ((z)((q)localObject3).zzb()).getClass();
                  l2 = l1 + 60000L - System.currentTimeMillis();
                }
              }
              finally {}
              if (paramzzdr.get() != Boolean.TRUE) {
                break label783;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              zzjr.b("[sgtm] Interrupted waiting for uploading batch");
            }
            j = 1;
          }
          catch (MalformedURLException paramzzdr) {}catch (URISyntaxException paramzzdr)
          {
            for (;;) {}
          }
          zzjo.a(c, Long.valueOf(a), paramzzdr, "[sgtm] Bad upload url for row_id");
          label783:
          j = 0;
          if (j != 0) {
            i++;
          } else {
            m = 1;
          }
        }
      }
      zzjw.d("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(k), Integer.valueOf(i));
      localp.run();
    }
  }
  
  public void setConditionalUserProperty(Bundle paramBundle, long paramLong)
  {
    g();
    if (paramBundle == null)
    {
      a.zzj().o.b("Conditional user property must not be null");
      return;
    }
    a.k().w(paramBundle, paramLong);
  }
  
  public void setConsent(Bundle paramBundle, long paramLong)
  {
    g();
    k3 localk3 = a.k();
    localk3.zzl().v(new s3(localk3, paramBundle, paramLong));
  }
  
  public void setConsentThirdParty(Bundle paramBundle, long paramLong)
  {
    g();
    a.k().v(paramBundle, -20, paramLong);
  }
  
  public void setCurrentScreen(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2, long paramLong)
  {
    g();
    paramIObjectWrapper = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    setCurrentScreenByScionActivityInfo(zzeb.zza(paramIObjectWrapper), paramString1, paramString2, paramLong);
  }
  
  public void setCurrentScreenByScionActivityInfo(zzeb paramzzeb, String paramString1, String paramString2, long paramLong)
  {
    g();
    Object localObject1 = a;
    j2.b(w);
    s4 locals4 = w;
    if (!locals4.h().A())
    {
      paramzzeb = zzjt;
      paramString1 = "setCurrentScreen cannot be called while screen reporting is disabled.";
    }
    else
    {
      localObject2 = d;
      if (localObject2 == null)
      {
        paramzzeb = zzjt;
        paramString1 = "setCurrentScreen cannot be called while no activity active";
      }
      else if (o.get(Integer.valueOf(zza)) == null)
      {
        paramzzeb = zzjt;
        paramString1 = "setCurrentScreen must be called with an activity in the activity lifecycle";
      }
      else
      {
        localObject1 = paramString2;
        if (paramString2 == null) {
          localObject1 = locals4.b(zzb, "Activity");
        }
        boolean bool1 = Objects.equals(b, localObject1);
        boolean bool2 = Objects.equals(a, paramString1);
        if ((!bool1) || (!bool2)) {
          break label189;
        }
        paramzzeb = zzjt;
        paramString1 = "setCurrentScreen cannot be called with the same class and name";
      }
    }
    paramzzeb.b(paramString1);
    return;
    label189:
    if ((paramString1 != null) && ((paramString1.length() <= 0) || (paramString1.length() > locals4.h().n(null, false))))
    {
      paramString2 = zzjt;
      paramString1 = Integer.valueOf(paramString1.length());
      paramzzeb = "Invalid screen name length in setCurrentScreen. Length";
    }
    else
    {
      if ((localObject1 == null) || ((((String)localObject1).length() > 0) && (((String)localObject1).length() <= locals4.h().n(null, false)))) {
        break label303;
      }
      paramString2 = zzjt;
      paramString1 = Integer.valueOf(((String)localObject1).length());
      paramzzeb = "Invalid class name length in setCurrentScreen. Length";
    }
    paramString2.c(paramzzeb, paramString1);
    return;
    label303:
    Object localObject2 = zzjw;
    if (paramString1 == null) {
      paramString2 = "null";
    } else {
      paramString2 = paramString1;
    }
    ((b1)localObject2).d("Setting current screen to name, class", paramString2, localObject1);
    paramString1 = new q4(locals4.k().y0(), paramString1, (String)localObject1);
    o.put(Integer.valueOf(zza), paramString1);
    locals4.z(zzb, paramString1, true);
  }
  
  public void setDataCollectionEnabled(boolean paramBoolean)
  {
    g();
    k3 localk3 = a.k();
    localk3.t();
    localk3.zzl().u(new x3(localk3, paramBoolean));
  }
  
  public void setDefaultEventParameters(Bundle paramBundle)
  {
    g();
    k3 localk3 = a.k();
    localk3.getClass();
    if (paramBundle == null) {
      paramBundle = new Bundle();
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    localk3.zzl().u(new o3(localk3, paramBundle, 0));
  }
  
  public void setEventInterceptor(zzdw paramzzdw)
  {
    g();
    a locala = new a(paramzzdw);
    if (a.zzl().w())
    {
      paramzzdw = a.k();
      paramzzdw.l();
      paramzzdw.t();
      h3 localh3 = e;
      if (locala != localh3)
      {
        boolean bool;
        if (localh3 == null) {
          bool = true;
        } else {
          bool = false;
        }
        j.k(bool, "EventInterceptor already set.");
      }
      e = locala;
      return;
    }
    a.zzl().u(new a(this, locala));
  }
  
  public void setInstanceIdProvider(zzdx paramzzdx)
  {
    g();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean, long paramLong)
  {
    g();
    k3 localk3 = a.k();
    localk3.t();
    localk3.zzl().u(new q0(2, localk3, Boolean.valueOf(paramBoolean)));
  }
  
  public void setMinimumSessionDuration(long paramLong)
  {
    g();
  }
  
  public void setSessionTimeoutDuration(long paramLong)
  {
    g();
    k3 localk3 = a.k();
    localk3.zzl().u(new z3(localk3, paramLong, 0));
  }
  
  public void setSgtmDebugInfo(Intent paramIntent)
  {
    g();
    k3 localk3 = a.k();
    localk3.getClass();
    Uri localUri = paramIntent.getData();
    if (localUri == null)
    {
      zzju.b("Activity intent has no data. Preview Mode was not enabled.");
    }
    else
    {
      paramIntent = localUri.getQueryParameter("sgtm_debug_enable");
      if ((paramIntent != null) && (paramIntent.equals("1")))
      {
        paramIntent = localUri.getQueryParameter("sgtm_preview_key");
        if (!TextUtils.isEmpty(paramIntent))
        {
          zzju.c("Preview Mode was enabled. Using the sgtmPreviewKey: ", paramIntent);
          hd = paramIntent;
        }
      }
      else
      {
        zzju.b("Preview Mode was not enabled.");
        hd = null;
      }
    }
  }
  
  public void setUserId(String paramString, long paramLong)
  {
    g();
    k3 localk3 = a.k();
    if (paramString != null)
    {
      localk3.getClass();
      if (TextUtils.isEmpty(paramString))
      {
        b).zzj().r.b("User ID must be non-empty or null");
        return;
      }
    }
    localk3.zzl().u(new p(6, localk3, paramString));
    localk3.G(null, "_id", paramString, true, paramLong);
  }
  
  public void setUserProperty(String paramString1, String paramString2, IObjectWrapper paramIObjectWrapper, boolean paramBoolean, long paramLong)
  {
    g();
    paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
    a.k().G(paramString1, paramString2, paramIObjectWrapper, paramBoolean, paramLong);
  }
  
  public void unregisterOnMeasurementEventListener(zzdw paramzzdw)
  {
    g();
    synchronized (b)
    {
      j3 localj3 = (j3)b.remove(Integer.valueOf(paramzzdw.zza()));
      ??? = localj3;
      if (localj3 == null) {
        ??? = new b(paramzzdw);
      }
      paramzzdw = a.k();
      paramzzdw.t();
      if (!f.remove(???)) {
        zzjr.b("OnEventListener had not been registered");
      }
      return;
    }
  }
  
  public final class a
    implements h3
  {
    public zzdw a;
    
    public a(zzdw paramzzdw)
    {
      a = paramzzdw;
    }
    
    public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        a.zza(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString2)
      {
        paramString1 = a;
        if (paramString1 != null) {
          zzjr.c("Event interceptor threw exception", paramString2);
        }
      }
    }
  }
  
  public final class b
    implements j3
  {
    public zzdw a;
    
    public b(zzdw paramzzdw)
    {
      a = paramzzdw;
    }
    
    public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        a.zza(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString2)
      {
        paramString1 = a;
        if (paramString1 != null) {
          zzjr.c("Event listener threw exception", paramString2);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */