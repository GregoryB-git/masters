package com.google.android.gms.measurement.internal;

import A2.n;
import H2.b;
import R2.B;
import R2.C3;
import R2.D;
import R2.F3;
import R2.G2;
import R2.I;
import R2.I3;
import R2.L3;
import R2.N2;
import R2.N3;
import R2.N4;
import R2.O5;
import R2.P3;
import R2.R3;
import R2.S5;
import R2.X3;
import R2.Y1;
import R2.a2;
import R2.d4;
import R2.f1;
import R2.i3;
import R2.k4;
import R2.m3;
import R2.n4;
import R2.u3;
import R2.v3;
import R2.v4;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService
  extends w0
{
  public N2 b = null;
  public final Map c = new t.a();
  
  public void beginAdUnitExposure(@NonNull String paramString, long paramLong)
  {
    o();
    b.y().z(paramString, paramLong);
  }
  
  public void clearConditionalUserProperty(@NonNull String paramString1, @NonNull String paramString2, @NonNull Bundle paramBundle)
  {
    o();
    b.H().X(paramString1, paramString2, paramBundle);
  }
  
  public void clearMeasurementEnabled(long paramLong)
  {
    o();
    b.H().R(null);
  }
  
  public void endAdUnitExposure(@NonNull String paramString, long paramLong)
  {
    o();
    b.y().D(paramString, paramLong);
  }
  
  public void generateEventId(y0 paramy0)
  {
    o();
    long l = b.L().P0();
    o();
    b.L().T(paramy0, l);
  }
  
  public void getAppInstanceId(y0 paramy0)
  {
    o();
    b.e().D(new i3(this, paramy0));
  }
  
  public void getCachedAppInstanceId(y0 paramy0)
  {
    o();
    v(paramy0, b.H().i0());
  }
  
  public void getConditionalUserProperties(String paramString1, String paramString2, y0 paramy0)
  {
    o();
    b.e().D(new N4(this, paramy0, paramString1, paramString2));
  }
  
  public void getCurrentScreenClass(y0 paramy0)
  {
    o();
    v(paramy0, b.H().j0());
  }
  
  public void getCurrentScreenName(y0 paramy0)
  {
    o();
    v(paramy0, b.H().k0());
  }
  
  public void getGmpAppId(y0 paramy0)
  {
    o();
    v(paramy0, b.H().l0());
  }
  
  public void getMaxUserProperties(String paramString, y0 paramy0)
  {
    o();
    b.H();
    n.e(paramString);
    o();
    b.L().S(paramy0, 25);
  }
  
  public void getSessionId(y0 paramy0)
  {
    o();
    C3 localC3 = b.H();
    localC3.e().D(new d4(localC3, paramy0));
  }
  
  public void getTestFlag(y0 paramy0, int paramInt)
  {
    o();
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4) {
              b.L().X(paramy0, b.H().e0().booleanValue());
            }
            return;
          }
          b.L().S(paramy0, b.H().g0().intValue());
          return;
        }
        S5 localS5 = b.L();
        double d = b.H().f0().doubleValue();
        Bundle localBundle = new Bundle();
        localBundle.putDouble("r", d);
        try
        {
          paramy0.l(localBundle);
          return;
        }
        catch (RemoteException paramy0)
        {
          a.j().L().b("Error returning double value to wrapper", paramy0);
          return;
        }
      }
      b.L().T(paramy0, b.H().h0().longValue());
      return;
    }
    b.L().V(paramy0, b.H().m0());
  }
  
  public void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, y0 paramy0)
  {
    o();
    b.e().D(new N3(this, paramy0, paramString1, paramString2, paramBoolean));
  }
  
  public void initForTests(@NonNull Map paramMap)
  {
    o();
  }
  
  public void initialize(H2.a parama, H0 paramH0, long paramLong)
  {
    N2 localN2 = b;
    if (localN2 == null)
    {
      b = N2.c((Context)n.i((Context)b.v(parama)), paramH0, Long.valueOf(paramLong));
      return;
    }
    localN2.j().L().a("Attempting to initialize multiple times");
  }
  
  public void isDataCollectionEnabled(y0 paramy0)
  {
    o();
    b.e().D(new O5(this, paramy0));
  }
  
  public void logEvent(@NonNull String paramString1, @NonNull String paramString2, @NonNull Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    o();
    b.H().Z(paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2, paramLong);
  }
  
  public void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, y0 paramy0, long paramLong)
  {
    o();
    n.e(paramString2);
    Bundle localBundle = new android/os/Bundle;
    if (paramBundle != null) {
      localBundle.<init>(paramBundle);
    } else {
      localBundle.<init>();
    }
    localBundle.putString("_o", "app");
    paramString2 = new I(paramString2, new D(paramBundle), "app", paramLong);
    b.e().D(new n4(this, paramy0, paramString2, paramString1));
  }
  
  public void logHealthData(int paramInt, @NonNull String paramString, @NonNull H2.a parama1, @NonNull H2.a parama2, @NonNull H2.a parama3)
  {
    o();
    Object localObject = null;
    if (parama1 == null) {
      parama1 = null;
    } else {
      parama1 = b.v(parama1);
    }
    if (parama2 == null) {
      parama2 = null;
    } else {
      parama2 = b.v(parama2);
    }
    if (parama3 == null) {}
    for (parama3 = (H2.a)localObject;; parama3 = b.v(parama3)) {
      break;
    }
    b.j().z(paramInt, true, false, paramString, parama1, parama2, parama3);
  }
  
  public final void o()
  {
    if (b != null) {
      return;
    }
    throw new IllegalStateException("Attempting to perform action before initialize.");
  }
  
  public void onActivityCreated(@NonNull H2.a parama, @NonNull Bundle paramBundle, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityCreated((Activity)b.v(parama), paramBundle);
    }
  }
  
  public void onActivityDestroyed(@NonNull H2.a parama, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityDestroyed((Activity)b.v(parama));
    }
  }
  
  public void onActivityPaused(@NonNull H2.a parama, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityPaused((Activity)b.v(parama));
    }
  }
  
  public void onActivityResumed(@NonNull H2.a parama, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityResumed((Activity)b.v(parama));
    }
  }
  
  public void onActivitySaveInstanceState(H2.a parama, y0 paramy0, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    Bundle localBundle = new Bundle();
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivitySaveInstanceState((Activity)b.v(parama), localBundle);
    }
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException parama)
    {
      b.j().L().b("Error returning bundle value to wrapper", parama);
    }
  }
  
  public void onActivityStarted(@NonNull H2.a parama, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityStarted((Activity)b.v(parama));
    }
  }
  
  public void onActivityStopped(@NonNull H2.a parama, long paramLong)
  {
    o();
    k4 localk4 = b.H().c;
    if (localk4 != null)
    {
      b.H().o0();
      localk4.onActivityStopped((Activity)b.v(parama));
    }
  }
  
  public void performAction(Bundle paramBundle, y0 paramy0, long paramLong)
  {
    o();
    paramy0.l(null);
  }
  
  public void registerOnMeasurementEventListener(E0 paramE0)
  {
    o();
    Object localObject;
    synchronized (c)
    {
      u3 localu3 = (u3)c.get(Integer.valueOf(paramE0.a()));
      localObject = localu3;
      if (localu3 == null)
      {
        localObject = new com/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;
        ((b)localObject).<init>(this, paramE0);
        c.put(Integer.valueOf(paramE0.a()), localObject);
      }
    }
    b.H().I((u3)localObject);
  }
  
  public void resetAnalyticsData(long paramLong)
  {
    o();
    C3 localC3 = b.H();
    localC3.T(null);
    localC3.e().D(new X3(localC3, paramLong));
  }
  
  public void setConditionalUserProperty(@NonNull Bundle paramBundle, long paramLong)
  {
    o();
    if (paramBundle == null)
    {
      b.j().G().a("Conditional user property must not be null");
      return;
    }
    b.H().Q(paramBundle, paramLong);
  }
  
  public void setConsent(@NonNull Bundle paramBundle, long paramLong)
  {
    o();
    C3 localC3 = b.H();
    localC3.e().G(new I3(localC3, paramBundle, paramLong));
  }
  
  public void setConsentThirdParty(@NonNull Bundle paramBundle, long paramLong)
  {
    o();
    b.H().P(paramBundle, -20, paramLong);
  }
  
  public void setCurrentScreen(@NonNull H2.a parama, @NonNull String paramString1, @NonNull String paramString2, long paramLong)
  {
    o();
    b.I().N((Activity)b.v(parama), paramString1, paramString2);
  }
  
  public void setDataCollectionEnabled(boolean paramBoolean)
  {
    o();
    C3 localC3 = b.H();
    localC3.v();
    localC3.e().D(new P3(localC3, paramBoolean));
  }
  
  public void setDefaultEventParameters(@NonNull Bundle paramBundle)
  {
    o();
    C3 localC3 = b.H();
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    localC3.e().D(new F3(localC3, paramBundle));
  }
  
  public void setEventInterceptor(E0 paramE0)
  {
    o();
    paramE0 = new a(paramE0);
    if (b.e().J())
    {
      b.H().J(paramE0);
      return;
    }
    b.e().D(new a(this, paramE0));
  }
  
  public void setInstanceIdProvider(F0 paramF0)
  {
    o();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean, long paramLong)
  {
    o();
    b.H().R(Boolean.valueOf(paramBoolean));
  }
  
  public void setMinimumSessionDuration(long paramLong)
  {
    o();
  }
  
  public void setSessionTimeoutDuration(long paramLong)
  {
    o();
    C3 localC3 = b.H();
    localC3.e().D(new R3(localC3, paramLong));
  }
  
  public void setUserId(@NonNull String paramString, long paramLong)
  {
    o();
    C3 localC3 = b.H();
    if ((paramString != null) && (TextUtils.isEmpty(paramString)))
    {
      a.j().L().a("User ID must be non-empty or null");
      return;
    }
    localC3.e().D(new L3(localC3, paramString));
    localC3.c0(null, "_id", paramString, true, paramLong);
  }
  
  public void setUserProperty(@NonNull String paramString1, @NonNull String paramString2, @NonNull H2.a parama, boolean paramBoolean, long paramLong)
  {
    o();
    parama = b.v(parama);
    b.H().c0(paramString1, paramString2, parama, paramBoolean, paramLong);
  }
  
  public void unregisterOnMeasurementEventListener(E0 paramE0)
  {
    o();
    synchronized (c)
    {
      u3 localu3 = (u3)c.remove(Integer.valueOf(paramE0.a()));
      ??? = localu3;
      if (localu3 == null) {
        ??? = new b(paramE0);
      }
      b.H().u0((u3)???);
      return;
    }
  }
  
  public final void v(y0 paramy0, String paramString)
  {
    o();
    b.L().V(paramy0, paramString);
  }
  
  public final class a
    implements v3
  {
    public E0 a;
    
    public a(E0 paramE0)
    {
      a = paramE0;
    }
    
    public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        a.L(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString1)
      {
        paramString2 = b;
        if (paramString2 != null) {
          paramString2.j().L().b("Event interceptor threw exception", paramString1);
        }
      }
    }
  }
  
  public final class b
    implements u3
  {
    public E0 a;
    
    public b(E0 paramE0)
    {
      a = paramE0;
    }
    
    public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        a.L(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString2)
      {
        paramString1 = b;
        if (paramString1 != null) {
          paramString1.j().L().b("Event listener threw exception", paramString2);
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