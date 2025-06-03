package com.google.android.gms.internal.measurement;

import W2.g;
import W2.l;
import W2.m;
import W2.s;
import W2.t;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class S2
{
  public static final Object g = new Object();
  public static volatile Z2 h;
  public static final AtomicReference i = new AtomicReference();
  public static d3 j = new d3(T2.a);
  public static final AtomicInteger k = new AtomicInteger();
  public final a3 a;
  public final String b;
  public final Object c;
  public volatile int d = -1;
  public volatile Object e;
  public final boolean f;
  
  public S2(a3 parama3, String paramString, Object paramObject, boolean paramBoolean)
  {
    String str = a;
    if ((str == null) && (b == null)) {
      throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
    if ((str != null) && (b != null)) {
      throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
    }
    a = parama3;
    b = paramString;
    c = paramObject;
    f = paramBoolean;
  }
  
  public static void l(Context paramContext)
  {
    if ((h == null) && (paramContext != null)) {
      label108:
      label113:
      label121:
      synchronized (g)
      {
        if (h == null)
        {
          try
          {
            localObject2 = h;
            localObject3 = paramContext.getApplicationContext();
            if (localObject3 != null) {
              paramContext = (Context)localObject3;
            }
            if (localObject2 != null) {
              if (((Z2)localObject2).a() == paramContext) {
                break label108;
              }
            }
          }
          finally
          {
            break label113;
          }
          B2.d();
          b3.c();
          J2.b();
          Object localObject3 = new com/google/android/gms/internal/measurement/U2;
          ((U2)localObject3).<init>(paramContext);
          Object localObject2 = t.a((s)localObject3);
          localObject3 = new com/google/android/gms/internal/measurement/x2;
          ((x2)localObject3).<init>(paramContext, (s)localObject2);
          h = (Z2)localObject3;
          k.incrementAndGet();
          break label121;
          throw paramContext;
        }
      }
    }
  }
  
  public static void m()
  {
    k.incrementAndGet();
  }
  
  public final Object f()
  {
    if (!f) {
      m.p(j.a(b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
    }
    int m = k.get();
    if (d < m)
    {
      Z2 localZ2;
      Object localObject1;
      Object localObject3;
      try
      {
        if (d >= m) {
          break label284;
        }
        localZ2 = h;
        localObject1 = l.a();
        Object localObject2 = null;
        localObject3 = localObject2;
        if (localZ2 != null)
        {
          l locall = (l)localZ2.b().get();
          localObject1 = locall;
          localObject3 = localObject2;
          if (locall.c())
          {
            localObject1 = (K2)locall.b();
            localObject3 = a;
            localObject3 = ((K2)localObject1).a(b, a, d, b);
            localObject1 = locall;
          }
        }
      }
      finally
      {
        break label289;
      }
      boolean bool;
      if (localZ2 != null) {
        bool = true;
      } else {
        bool = false;
      }
      m.p(bool, "Must call PhenotypeFlagInitializer.maybeInit() first");
      if (a.f)
      {
        localObject5 = g(localZ2);
        if (localObject5 != null) {
          break label244;
        }
        localObject5 = j(localZ2);
        if (localObject5 != null) {
          break label244;
        }
      }
      else
      {
        localObject5 = j(localZ2);
        if (localObject5 != null) {
          break label244;
        }
        localObject5 = g(localZ2);
        if (localObject5 != null) {
          break label244;
        }
      }
      Object localObject5 = c;
      label244:
      if (((l)localObject1).c()) {
        if (localObject3 == null) {
          localObject5 = c;
        } else {
          localObject5 = h(localObject3);
        }
      }
      e = localObject5;
      d = m;
      label284:
      break label294;
      label289:
      throw ((Throwable)localObject5);
    }
    label294:
    return e;
  }
  
  public final Object g(Z2 paramZ2)
  {
    Object localObject = a;
    if (!e)
    {
      localObject = i;
      if ((localObject == null) || (((Boolean)((g)localObject).apply(paramZ2.a())).booleanValue()))
      {
        localObject = J2.a(paramZ2.a());
        paramZ2 = a;
        if (e) {
          paramZ2 = null;
        } else {
          paramZ2 = i(c);
        }
        paramZ2 = ((E2)localObject).i(paramZ2);
        if (paramZ2 != null) {
          return h(paramZ2);
        }
      }
    }
    return null;
  }
  
  public abstract Object h(Object paramObject);
  
  public final String i(String paramString)
  {
    if ((paramString != null) && (paramString.isEmpty())) {
      return b;
    }
    String str = b;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public final Object j(Z2 paramZ2)
  {
    if (a.b != null)
    {
      if (Q2.b(paramZ2.a(), a.b))
      {
        if (a.h) {
          paramZ2 = B2.a(paramZ2.a().getContentResolver(), P2.a(P2.b(paramZ2.a(), a.b.getLastPathSegment())), R2.o);
        } else {
          paramZ2 = B2.a(paramZ2.a().getContentResolver(), a.b, R2.o);
        }
      }
      else {
        paramZ2 = null;
      }
    }
    else {
      paramZ2 = b3.b(paramZ2.a(), a.a, R2.o);
    }
    if (paramZ2 != null)
    {
      paramZ2 = paramZ2.i(k());
      if (paramZ2 != null) {
        return h(paramZ2);
      }
    }
    return null;
  }
  
  public final String k()
  {
    return i(a.d);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.S2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */