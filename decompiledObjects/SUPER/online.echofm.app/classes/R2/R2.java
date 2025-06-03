package R2;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.n6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.g;

public final class R2
  extends Q1
{
  public final D5 b;
  public Boolean c;
  public String d;
  
  public R2(D5 paramD5)
  {
    this(paramD5, null);
  }
  
  public R2(D5 paramD5, String paramString)
  {
    A2.n.i(paramD5);
    b = paramD5;
    d = null;
  }
  
  public final void D0(W5 paramW5)
  {
    A2.n.e(o);
    a1(o, false);
    v(new a3(this, paramW5));
  }
  
  public final List F(W5 paramW5, Bundle paramBundle)
  {
    c1(paramW5, false);
    A2.n.i(o);
    paramBundle = b.e().w(new k3(this, paramW5, paramBundle));
    try
    {
      paramBundle = (List)paramBundle.get();
      return paramBundle;
    }
    catch (ExecutionException paramBundle) {}catch (InterruptedException paramBundle) {}
    b.j().G().c("Failed to get trigger URIs. appId", Y1.v(o), paramBundle);
    return Collections.emptyList();
  }
  
  public final String G(W5 paramW5)
  {
    c1(paramW5, false);
    return b.R(paramW5);
  }
  
  public final void I0(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    v(new V2(this, paramString2, paramString3, paramString1, paramLong));
  }
  
  public final List K0(String paramString1, String paramString2, String paramString3)
  {
    a1(paramString1, true);
    paramString1 = b.e().w(new b3(this, paramString1, paramString2, paramString3));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    b.j().G().b("Failed to get conditional user properties as", paramString1);
    return Collections.emptyList();
  }
  
  public final List L0(W5 paramW5, boolean paramBoolean)
  {
    c1(paramW5, false);
    Object localObject1 = o;
    A2.n.i(localObject1);
    localObject1 = b.e().w(new j3(this, (String)localObject1));
    for (;;)
    {
      T5 localT5;
      try
      {
        localObject2 = (List)((Future)localObject1).get();
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(((List)localObject2).size());
        Iterator localIterator = ((List)localObject2).iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localT5 = (T5)localIterator.next();
        if (!paramBoolean) {
          if (S5.H0(c)) {
            continue;
          }
        }
      }
      catch (ExecutionException localExecutionException)
      {
        break label145;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label145;
      }
      Object localObject2 = new R2/R5;
      ((R5)localObject2).<init>(localT5);
      localInterruptedException.add(localObject2);
    }
    return localInterruptedException;
    label145:
    b.j().G().c("Failed to get user properties. appId", Y1.v(o), localInterruptedException);
    return null;
  }
  
  public final byte[] M0(I paramI, String paramString)
  {
    A2.n.e(paramString);
    A2.n.i(paramI);
    a1(paramString, true);
    b.j().F().b("Log and bundle. event", b.f0().c(o));
    long l1 = b.b().c() / 1000000L;
    Object localObject = b.e().B(new h3(this, paramI, paramString));
    try
    {
      byte[] arrayOfByte = (byte[])((Future)localObject).get();
      localObject = arrayOfByte;
      if (arrayOfByte == null)
      {
        b.j().G().b("Log and bundle returned null. appId", Y1.v(paramString));
        localObject = new byte[0];
      }
    }
    catch (ExecutionException localExecutionException)
    {
      break label205;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label205;
    }
    long l2 = b.b().c() / 1000000L;
    b.j().F().d("Log and bundle processed. event, size, time_ms", b.f0().c(o), Integer.valueOf(localInterruptedException.length), Long.valueOf(l2 - l1));
    return localInterruptedException;
    label205:
    b.j().G().d("Failed to log and bundle. appId, event, error", Y1.v(paramString), b.f0().c(o), localInterruptedException);
    return null;
  }
  
  public final void N(W5 paramW5)
  {
    c1(paramW5, false);
    v(new T2(this, paramW5));
  }
  
  public final void O0(Bundle paramBundle, W5 paramW5)
  {
    c1(paramW5, false);
    paramW5 = o;
    A2.n.i(paramW5);
    v(new Q2(this, paramW5, paramBundle));
  }
  
  public final n P0(W5 paramW5)
  {
    c1(paramW5, false);
    A2.n.e(o);
    if (n6.a())
    {
      Object localObject = b.e().B(new c3(this, paramW5));
      try
      {
        localObject = (n)((Future)localObject).get(10000L, TimeUnit.MILLISECONDS);
        return (n)localObject;
      }
      catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}catch (TimeoutException localTimeoutException) {}
      b.j().G().c("Failed to get consent. appId", Y1.v(o), localTimeoutException);
      return new n(null);
    }
    return new n(null);
  }
  
  public final void R0(I paramI, W5 paramW5)
  {
    A2.n.i(paramI);
    c1(paramW5, false);
    v(new f3(this, paramI, paramW5));
  }
  
  public final void S0(I paramI, String paramString1, String paramString2)
  {
    A2.n.i(paramI);
    A2.n.e(paramString1);
    a1(paramString1, true);
    v(new e3(this, paramI, paramString1));
  }
  
  public final void U0(W5 paramW5)
  {
    A2.n.e(o);
    A2.n.i(J);
    paramW5 = new d3(this, paramW5);
    A2.n.i(paramW5);
    if (b.e().J())
    {
      paramW5.run();
      return;
    }
    b.e().G(paramW5);
  }
  
  public final List V0(String paramString1, String paramString2, W5 paramW5)
  {
    c1(paramW5, false);
    paramW5 = o;
    A2.n.i(paramW5);
    paramString1 = b.e().w(new Y2(this, paramW5, paramString1, paramString2));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    b.j().G().b("Failed to get conditional user properties", paramString1);
    return Collections.emptyList();
  }
  
  public final List W(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    a1(paramString1, true);
    paramString2 = b.e().w(new Z2(this, paramString1, paramString2, paramString3));
    for (;;)
    {
      try
      {
        paramString3 = (List)paramString2.get();
        paramString2 = new java/util/ArrayList;
        paramString2.<init>(paramString3.size());
        Iterator localIterator = paramString3.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        paramString3 = (T5)localIterator.next();
        if (!paramBoolean) {
          if (S5.H0(c)) {
            continue;
          }
        }
      }
      catch (ExecutionException paramString2)
      {
        break label132;
      }
      catch (InterruptedException paramString2)
      {
        break label132;
      }
      R5 localR5 = new R2/R5;
      localR5.<init>(paramString3);
      paramString2.add(localR5);
    }
    return paramString2;
    label132:
    b.j().G().c("Failed to get user properties as. appId", Y1.v(paramString1), paramString2);
    return Collections.emptyList();
  }
  
  public final void Z(R5 paramR5, W5 paramW5)
  {
    A2.n.i(paramR5);
    c1(paramW5, false);
    v(new g3(this, paramR5, paramW5));
  }
  
  public final void a1(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramBoolean)
      {
        try
        {
          if (c != null) {
            break label88;
          }
          if ((!"com.google.android.gms".equals(d)) && (!E2.o.a(b.a(), Binder.getCallingUid())) && (!x2.o.a(b.a()).c(Binder.getCallingUid()))) {
            paramBoolean = false;
          }
        }
        catch (SecurityException localSecurityException1)
        {
          break label163;
        }
        paramBoolean = true;
        c = Boolean.valueOf(paramBoolean);
        label88:
        if (c.booleanValue()) {}
      }
      else
      {
        if ((d == null) && (x2.n.i(b.a(), Binder.getCallingUid(), paramString))) {
          d = paramString;
        }
        if (!paramString.equals(d)) {
          break label139;
        }
      }
      return;
      label139:
      SecurityException localSecurityException2 = new java/lang/SecurityException;
      localSecurityException2.<init>(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
      throw localSecurityException2;
      label163:
      b.j().G().b("Measurement Service called with invalid calling package. appId", Y1.v(paramString));
      throw localSecurityException2;
    }
    b.j().G().a("Measurement Service called without app package");
    throw new SecurityException("Measurement Service called without app package");
  }
  
  public final I b1(I paramI, W5 paramW5)
  {
    if ("_cmp".equals(o))
    {
      paramW5 = p;
      if ((paramW5 != null) && (paramW5.a() != 0))
      {
        paramW5 = p.q("_cis");
        if (("referrer broadcast".equals(paramW5)) || ("referrer API".equals(paramW5)))
        {
          b.j().J().b("Event has been filtered ", paramI.toString());
          return new I("_cmpx", p, q, r);
        }
      }
    }
    return paramI;
  }
  
  public final void c0(W5 paramW5)
  {
    c1(paramW5, false);
    v(new S2(this, paramW5));
  }
  
  public final void c1(W5 paramW5, boolean paramBoolean)
  {
    A2.n.i(paramW5);
    A2.n.e(o);
    a1(o, false);
    b.n0().j0(p, E);
  }
  
  public final void d1(I paramI, W5 paramW5)
  {
    if (!b.h0().W(o))
    {
      e1(paramI, paramW5);
      return;
    }
    b.j().K().b("EES config found for", o);
    Object localObject1 = b.h0();
    Object localObject2 = o;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = null;
    } else {
      localObject1 = (C)j.c(localObject2);
    }
    if (localObject1 == null) {
      b.j().K().b("EES not loaded for", o);
    }
    for (;;)
    {
      e1(paramI, paramW5);
      return;
      try
      {
        Map localMap = b.m0().O(p.g(), true);
        Object localObject3 = r3.a(o);
        localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = o;
        }
        localObject3 = new com/google/android/gms/internal/measurement/e;
        ((com.google.android.gms.internal.measurement.e)localObject3).<init>((String)localObject2, r, localMap);
        boolean bool = ((C)localObject1).d((com.google.android.gms.internal.measurement.e)localObject3);
        if (bool)
        {
          localObject2 = paramI;
          if (((C)localObject1).g())
          {
            b.j().K().b("EES edited event", o);
            localObject2 = b.m0().B(((C)localObject1).a().d());
          }
          e1((I)localObject2, paramW5);
          if (((C)localObject1).f())
          {
            localObject1 = ((C)localObject1).a().f().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramI = (com.google.android.gms.internal.measurement.e)((Iterator)localObject1).next();
              b.j().K().b("EES logging created event", paramI.e());
              e1(b.m0().B(paramI), paramW5);
            }
          }
          return;
        }
      }
      catch (d0 locald0)
      {
        b.j().G().c("EES error. appId, eventName", p, o);
        b.j().K().b("EES was not applied to event", o);
      }
    }
  }
  
  public final void e1(I paramI, W5 paramW5)
  {
    b.o0();
    b.q(paramI, paramW5);
  }
  
  public final void m0(e parame, W5 paramW5)
  {
    A2.n.i(parame);
    A2.n.i(q);
    c1(paramW5, false);
    parame = new e(parame);
    o = o;
    v(new U2(this, parame, paramW5));
  }
  
  public final void n0(e parame)
  {
    A2.n.i(parame);
    A2.n.i(q);
    A2.n.e(o);
    a1(o, true);
    v(new X2(this, new e(parame)));
  }
  
  public final void v(Runnable paramRunnable)
  {
    A2.n.i(paramRunnable);
    if (b.e().J())
    {
      paramRunnable.run();
      return;
    }
    b.e().D(paramRunnable);
  }
  
  public final List x0(String paramString1, String paramString2, boolean paramBoolean, W5 paramW5)
  {
    c1(paramW5, false);
    Object localObject = o;
    A2.n.i(localObject);
    paramString1 = b.e().w(new W2(this, (String)localObject, paramString1, paramString2));
    for (;;)
    {
      try
      {
        paramString2 = (List)paramString1.get();
        paramString1 = new java/util/ArrayList;
        paramString1.<init>(paramString2.size());
        Iterator localIterator = paramString2.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        paramString2 = (T5)localIterator.next();
        if (!paramBoolean) {
          if (S5.H0(c)) {
            continue;
          }
        }
      }
      catch (ExecutionException paramString1)
      {
        break label146;
      }
      catch (InterruptedException paramString1)
      {
        break label146;
      }
      localObject = new R2/R5;
      ((R5)localObject).<init>(paramString2);
      paramString1.add(localObject);
    }
    return paramString1;
    label146:
    b.j().G().c("Failed to query user properties. appId", Y1.v(o), paramString1);
    return Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     R2.R2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */