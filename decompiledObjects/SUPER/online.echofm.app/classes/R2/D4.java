package R2;

import B2.a;
import D2.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class D4
  extends f1
{
  public final a5 c;
  public R1 d;
  public volatile Boolean e;
  public final x f;
  public final w5 g;
  public final List h = new ArrayList();
  public final x i;
  
  public D4(N2 paramN2)
  {
    super(paramN2);
    g = new w5(paramN2.b());
    c = new a5(this);
    f = new G4(this, paramN2);
    i = new P4(this, paramN2);
  }
  
  private final void P(Runnable paramRunnable)
  {
    n();
    if (c0())
    {
      paramRunnable.run();
      return;
    }
    if (h.size() >= 1000L)
    {
      j().G().a("Discarding data. Max runnable queue size reached");
      return;
    }
    h.add(paramRunnable);
    i.b(60000L);
    Y();
  }
  
  private final void f0()
  {
    n();
    j().K().b("Processing queued up service tasks", Integer.valueOf(h.size()));
    Iterator localIterator = h.iterator();
    while (localIterator.hasNext())
    {
      Runnable localRunnable = (Runnable)localIterator.next();
      try
      {
        localRunnable.run();
      }
      catch (RuntimeException localRuntimeException)
      {
        j().G().b("Task exception while flushing queue", localRuntimeException);
      }
    }
    h.clear();
    i.a();
  }
  
  private final void g0()
  {
    n();
    g.c();
    f.b(((Long)K.L.a(null)).longValue());
  }
  
  private final boolean h0()
  {
    n();
    v();
    if (e == null)
    {
      n();
      v();
      Object localObject = i().K();
      boolean bool1 = true;
      boolean bool2 = true;
      if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
      {
        int j;
        if (p().C() == 1)
        {
          j = 1;
        }
        else
        {
          j().K().a("Checking service availability");
          int k = k().u(12451000);
          if (k != 0)
          {
            j = 0;
            if (k != 1) {
              if (k != 2) {
                if (k != 3) {
                  if (k != 9)
                  {
                    if (k != 18)
                    {
                      j().L().b("Unexpected service status", Integer.valueOf(k));
                      bool2 = false;
                      break label278;
                    }
                    localObject = j().L();
                  }
                }
              }
            }
          }
          for (String str = "Service updating";; str = "Service available")
          {
            ((a2)localObject).a(str);
            break;
            localObject = j().L();
            for (str = "Service invalid";; str = "Service disabled")
            {
              ((a2)localObject).a(str);
              break;
              localObject = j().L();
            }
            j().F().a("Service container out of date");
            if (k().G0() < 17443) {}
            for (;;)
            {
              j = 1;
              bool2 = false;
              break label278;
              if (localObject != null) {
                break;
              }
              break label278;
              j().K().a("Service missing");
            }
            localObject = j().K();
          }
        }
        label278:
        if ((!bool2) && (f().S()))
        {
          j().G().a("No way to upload. Consider using the full version of Analytics");
          bool1 = bool2;
        }
        else
        {
          bool1 = bool2;
          if (j != 0)
          {
            i().w(bool2);
            bool1 = bool2;
          }
        }
      }
      e = Boolean.valueOf(bool1);
    }
    return e.booleanValue();
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final void C(e parame)
  {
    A2.n.i(parame);
    n();
    v();
    boolean bool = q().E(parame);
    e locale = new e(parame);
    P(new W4(this, true, j0(true), bool, locale, parame));
  }
  
  public final void D(I paramI, String paramString)
  {
    A2.n.i(paramI);
    n();
    v();
    boolean bool = q().F(paramI);
    P(new T4(this, true, j0(true), bool, paramI, paramString));
  }
  
  public final void E(R1 paramR1)
  {
    n();
    A2.n.i(paramR1);
    d = paramR1;
    g0();
    f0();
  }
  
  public final void F(R1 paramR1, a parama, W5 paramW5)
  {
    n();
    v();
    int j = 100;
    for (int k = 0; (k < 1001) && (j == 100); k++)
    {
      ArrayList localArrayList = new ArrayList();
      Object localObject = q().C(100);
      if (localObject != null)
      {
        localArrayList.addAll((Collection)localObject);
        j = ((List)localObject).size();
      }
      else
      {
        j = 0;
      }
      if ((parama != null) && (j < 100)) {
        localArrayList.add(parama);
      }
      int m = localArrayList.size();
      int n = 0;
      while (n < m)
      {
        localObject = localArrayList.get(n);
        n++;
        localObject = (a)localObject;
        a2 locala2;
        String str;
        if ((localObject instanceof I))
        {
          try
          {
            paramR1.R0((I)localObject, paramW5);
          }
          catch (RemoteException localRemoteException1)
          {
            locala2 = j().G();
            str = "Failed to send event to the service";
          }
        }
        else
        {
          for (;;)
          {
            locala2.b(str, localRemoteException1);
            break;
            if ((localRemoteException1 instanceof R5))
            {
              try
              {
                paramR1.Z((R5)localRemoteException1, paramW5);
              }
              catch (RemoteException localRemoteException2)
              {
                locala2 = j().G();
                str = "Failed to send user property to the service";
              }
              continue;
            }
            if (!(localRemoteException2 instanceof e)) {
              break label271;
            }
            try
            {
              paramR1.m0((e)localRemoteException2, paramW5);
            }
            catch (RemoteException localRemoteException3)
            {
              locala2 = j().G();
              str = "Failed to send conditional user property to the service";
            }
          }
          label271:
          j().G().a("Discarding data. Unrecognized parcel type.");
        }
      }
    }
  }
  
  public final void G(w4 paramw4)
  {
    n();
    v();
    P(new M4(this, paramw4));
  }
  
  public final void J(R5 paramR5)
  {
    n();
    v();
    boolean bool = q().G(paramR5);
    P(new J4(this, j0(true), bool, paramR5));
  }
  
  public final void K(Bundle paramBundle)
  {
    n();
    v();
    P(new Q4(this, j0(false), paramBundle));
  }
  
  public final void L(y0 paramy0)
  {
    n();
    v();
    P(new K4(this, j0(false), paramy0));
  }
  
  public final void M(y0 paramy0, I paramI, String paramString)
  {
    n();
    v();
    if (k().u(12451000) != 0)
    {
      j().L().a("Not bundling data. Service unavailable or out of date");
      k().Y(paramy0, new byte[0]);
      return;
    }
    P(new S4(this, paramI, paramString, paramy0));
  }
  
  public final void N(y0 paramy0, String paramString1, String paramString2)
  {
    n();
    v();
    P(new Y4(this, paramString1, paramString2, j0(false), paramy0));
  }
  
  public final void O(y0 paramy0, String paramString1, String paramString2, boolean paramBoolean)
  {
    n();
    v();
    P(new F4(this, paramString1, paramString2, j0(false), paramBoolean, paramy0));
  }
  
  public final void Q(AtomicReference paramAtomicReference)
  {
    n();
    v();
    P(new L4(this, paramAtomicReference, j0(false)));
  }
  
  public final void R(AtomicReference paramAtomicReference, Bundle paramBundle)
  {
    n();
    v();
    P(new H4(this, paramAtomicReference, j0(false), paramBundle));
  }
  
  public final void S(AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3)
  {
    n();
    v();
    P(new V4(this, paramAtomicReference, paramString1, paramString2, paramString3, j0(false)));
  }
  
  public final void T(AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    n();
    v();
    P(new X4(this, paramAtomicReference, paramString1, paramString2, paramString3, j0(false), paramBoolean));
  }
  
  public final void U(boolean paramBoolean)
  {
    n();
    v();
    if (paramBoolean) {
      q().H();
    }
    if (e0()) {
      P(new U4(this, j0(false)));
    }
  }
  
  public final n V()
  {
    n();
    v();
    R1 localR1 = d;
    if (localR1 == null)
    {
      Y();
      j().F().a("Failed to get consents; not connected to service yet.");
      return null;
    }
    Object localObject = j0(false);
    A2.n.i(localObject);
    try
    {
      localObject = localR1.P0((W5)localObject);
      g0();
      return (n)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      j().G().b("Failed to get consents; remote exception", localRemoteException);
    }
    return null;
  }
  
  public final Boolean W()
  {
    return e;
  }
  
  public final void X()
  {
    n();
    v();
    W5 localW5 = j0(true);
    q().I();
    P(new O4(this, localW5));
  }
  
  public final void Y()
  {
    n();
    v();
    if (c0()) {
      return;
    }
    if (h0())
    {
      c.a();
      return;
    }
    if (!f().S())
    {
      Object localObject = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        localObject = new Intent("com.google.android.gms.measurement.START");
        ((Intent)localObject).setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        c.c((Intent)localObject);
        return;
      }
      j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
    }
  }
  
  public final void Z()
  {
    n();
    v();
    c.d();
    try
    {
      b.b().c(a(), c);
      d = null;
      return;
    }
    catch (IllegalStateException|IllegalArgumentException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  public final void a0()
  {
    n();
    v();
    W5 localW5 = j0(false);
    q().H();
    P(new I4(this, localW5));
  }
  
  public final void b0()
  {
    n();
    v();
    P(new R4(this, j0(true)));
  }
  
  public final boolean c0()
  {
    n();
    v();
    return d != null;
  }
  
  public final boolean d0()
  {
    n();
    v();
    if (!h0()) {
      return true;
    }
    return k().G0() >= 200900;
  }
  
  public final boolean e0()
  {
    n();
    v();
    if (!h0()) {
      return true;
    }
    return k().G0() >= ((Integer)K.r0.a(null)).intValue();
  }
  
  public final W5 j0(boolean paramBoolean)
  {
    S1 localS1 = p();
    String str;
    if (paramBoolean) {
      str = j().O();
    } else {
      str = null;
    }
    return localS1.B(str);
  }
}

/* Location:
 * Qualified Name:     R2.D4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */