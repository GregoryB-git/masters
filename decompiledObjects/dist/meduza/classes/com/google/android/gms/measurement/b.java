package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import b.z;
import d2.q;
import e7.a;
import e7.a1;
import e7.b1;
import e7.e2;
import e7.e4;
import e7.f4;
import e7.j2;
import e7.k3;
import e7.q4;
import e7.q6;
import e7.r6;
import e7.s4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import nc.g0;
import r.h;

public final class b
  extends AppMeasurement.a
{
  public final j2 a;
  public final k3 b;
  
  public b(j2 paramj2)
  {
    j.i(paramj2);
    a = paramj2;
    b = paramj2.k();
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    a.k().a(paramString1, paramString2, paramBundle);
  }
  
  public final List<Bundle> b(String paramString1, String paramString2)
  {
    k3 localk3 = b;
    if (localk3.zzl().w())
    {
      zzjo.b("Cannot get conditional user properties from analytics worker thread");
      paramString1 = new ArrayList(0);
    }
    else if (g0.d())
    {
      zzjo.b("Cannot get conditional user properties from main thread");
      paramString1 = new ArrayList(0);
    }
    else
    {
      AtomicReference localAtomicReference = new AtomicReference();
      ((j2)b).zzl().q(localAtomicReference, 5000L, "get conditional user properties", new e4(localk3, localAtomicReference, paramString1, paramString2));
      paramString1 = (List)localAtomicReference.get();
      if (paramString1 == null)
      {
        zzjo.c("Timed out waiting for get conditional user properties", null);
        paramString1 = new ArrayList();
      }
      else
      {
        paramString1 = r6.g0(paramString1);
      }
    }
    return paramString1;
  }
  
  public final Map<String, Object> c(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = b;
    if (((q)localObject1).zzl().w())
    {
      paramString2 = zzjo;
      paramString1 = "Cannot get user properties from analytics worker thread";
    }
    else
    {
      if (!g0.d()) {
        break label58;
      }
      paramString2 = zzjo;
      paramString1 = "Cannot get user properties from main thread";
    }
    paramString2.b(paramString1);
    break label133;
    label58:
    Object localObject2 = new AtomicReference();
    ((j2)b).zzl().q((AtomicReference)localObject2, 5000L, "get user properties", new f4((k3)localObject1, (AtomicReference)localObject2, paramString1, paramString2, paramBoolean));
    paramString2 = (List)((AtomicReference)localObject2).get();
    if (paramString2 == null)
    {
      zzjo.c("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(paramBoolean));
      label133:
      paramString1 = Collections.emptyMap();
    }
    else
    {
      paramString1 = new r.b(paramString2.size());
      localObject1 = paramString2.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (q6)((Iterator)localObject1).next();
        paramString2 = ((q6)localObject2).D();
        if (paramString2 != null) {
          paramString1.put(b, paramString2);
        }
      }
    }
    return paramString1;
  }
  
  public final void d(String paramString1, String paramString2, Bundle paramBundle)
  {
    k3 localk3 = b;
    ((z)localk3.zzb()).getClass();
    localk3.E(paramString1, paramString2, paramBundle, true, true, System.currentTimeMillis());
  }
  
  public final int zza(String paramString)
  {
    j.e(paramString);
    return 25;
  }
  
  public final void zza(Bundle paramBundle)
  {
    k3 localk3 = b;
    ((z)localk3.zzb()).getClass();
    localk3.w(paramBundle, System.currentTimeMillis());
  }
  
  public final void zzb(String paramString)
  {
    j2 localj2 = a;
    a locala = y;
    if (locala != null)
    {
      v.getClass();
      locala.u(paramString, SystemClock.elapsedRealtime());
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final void zzc(String paramString)
  {
    j2 localj2 = a;
    a locala = y;
    if (locala != null)
    {
      v.getClass();
      locala.x(paramString, SystemClock.elapsedRealtime());
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final long zzf()
  {
    return a.m().y0();
  }
  
  public final String zzg()
  {
    return (String)b.p.get();
  }
  
  public final String zzh()
  {
    Object localObject = (j2)b.b;
    j2.b(w);
    localObject = w.d;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final String zzi()
  {
    Object localObject = (j2)b.b;
    j2.b(w);
    localObject = w.d;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final String zzj()
  {
    return (String)b.p.get();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */