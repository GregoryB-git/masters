package A2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import x2.b;
import x2.d;

public abstract class c
{
  public static final String[] D = { "service_esmobile", "service_googleme" };
  public static final d[] E = new d[0];
  public boolean A = false;
  public volatile a0 B = null;
  public AtomicInteger C = new AtomicInteger(0);
  public int a;
  public long b;
  public long c;
  public int d;
  public long e;
  public volatile String f = null;
  public m0 g;
  public final Context h;
  public final Looper i;
  public final h j;
  public final x2.k k;
  public final Handler l;
  public final Object m = new Object();
  public final Object n = new Object();
  public k o;
  public c p;
  public IInterface q;
  public final ArrayList r = new ArrayList();
  public X s;
  public int t = 1;
  public final a u;
  public final b v;
  public final int w;
  public final String x;
  public volatile String y;
  public b z = null;
  
  public c(Context paramContext, Looper paramLooper, int paramInt, a parama, b paramb, String paramString)
  {
    this(paramContext, paramLooper, localh, localk, paramInt, parama, paramb, paramString);
  }
  
  public c(Context paramContext, Looper paramLooper, h paramh, x2.k paramk, int paramInt, a parama, b paramb, String paramString)
  {
    n.j(paramContext, "Context must not be null");
    h = paramContext;
    n.j(paramLooper, "Looper must not be null");
    i = paramLooper;
    n.j(paramh, "Supervisor must not be null");
    j = paramh;
    n.j(paramk, "API availability must not be null");
    k = paramk;
    l = new U(this, paramLooper);
    w = paramInt;
    u = parama;
    v = paramb;
    x = paramString;
  }
  
  public Bundle A()
  {
    return new Bundle();
  }
  
  public String B()
  {
    return null;
  }
  
  public Set C()
  {
    return Collections.emptySet();
  }
  
  public final IInterface D()
  {
    Object localObject1 = m;
    DeadObjectException localDeadObjectException;
    label50:
    try
    {
      if (t != 5)
      {
        r();
        IInterface localIInterface = q;
        n.j(localIInterface, "Client is connected but service is null");
        return localIInterface;
      }
    }
    finally
    {
      break label50;
      localDeadObjectException = new android/os/DeadObjectException;
      localDeadObjectException.<init>();
      throw localDeadObjectException;
    }
  }
  
  public abstract String E();
  
  public abstract String F();
  
  public String G()
  {
    return "com.google.android.gms";
  }
  
  public e H()
  {
    a0 locala0 = B;
    if (locala0 == null) {
      return null;
    }
    return r;
  }
  
  public boolean I()
  {
    return h() >= 211700000;
  }
  
  public boolean J()
  {
    return B != null;
  }
  
  public void K(IInterface paramIInterface)
  {
    c = System.currentTimeMillis();
  }
  
  public void L(b paramb)
  {
    d = paramb.a();
    e = System.currentTimeMillis();
  }
  
  public void M(int paramInt)
  {
    a = paramInt;
    b = System.currentTimeMillis();
  }
  
  public void N(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = l;
    localHandler.sendMessage(localHandler.obtainMessage(1, paramInt2, -1, new Y(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  public boolean O()
  {
    return false;
  }
  
  public void P(String paramString)
  {
    y = paramString;
  }
  
  public void Q(int paramInt)
  {
    Handler localHandler = l;
    localHandler.sendMessage(localHandler.obtainMessage(6, C.get(), paramInt));
  }
  
  public void R(c paramc, int paramInt, PendingIntent paramPendingIntent)
  {
    n.j(paramc, "Connection progress callbacks cannot be null.");
    p = paramc;
    paramc = l;
    paramc.sendMessage(paramc.obtainMessage(3, C.get(), paramInt, paramPendingIntent));
  }
  
  public boolean S()
  {
    return false;
  }
  
  public final String X()
  {
    String str1 = x;
    String str2 = str1;
    if (str1 == null) {
      str2 = h.getClass().getName();
    }
    return str2;
  }
  
  public boolean a()
  {
    synchronized (m)
    {
      boolean bool;
      if (t == 4) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public void b(e parame)
  {
    parame.a();
  }
  
  public void c()
  {
    C.incrementAndGet();
    synchronized (r)
    {
      int i1 = r.size();
      int i2 = 0;
      if (i2 < i1)
      {
        ((V)r.get(i2)).d();
        i2++;
      }
    }
  }
  
  public final void e0(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    paramBundle = l;
    paramBundle.sendMessage(paramBundle.obtainMessage(7, paramInt2, -1, new Z(this, paramInt1, null)));
  }
  
  public void f(String paramString)
  {
    f = paramString;
    c();
  }
  
  public boolean g()
  {
    return true;
  }
  
  public abstract int h();
  
  public boolean i()
  {
    synchronized (m)
    {
      int i1 = t;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i1 != 2) {
        if (i1 == 3) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
  }
  
  public final void i0(int paramInt, IInterface paramIInterface)
  {
    boolean bool = false;
    int i1;
    if (paramInt != 4) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    int i2;
    if (paramIInterface == null) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    if (i1 == i2) {
      bool = true;
    }
    n.a(bool);
    Object localObject1 = m;
    try
    {
      t = paramInt;
      q = paramIInterface;
      if (paramInt == 1) {
        break label565;
      }
      if ((paramInt != 2) && (paramInt != 3))
      {
        if (paramInt != 4) {
          break label634;
        }
        n.i(paramIInterface);
        K(paramIInterface);
      }
    }
    finally
    {
      break label638;
    }
    paramIInterface = s;
    if (paramIInterface != null)
    {
      localObject2 = g;
      if (localObject2 != null)
      {
        localObject3 = ((m0)localObject2).c();
        str1 = ((m0)localObject2).b();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Calling connect() while still connected, missing disconnect() for ");
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(" on ");
        ((StringBuilder)localObject2).append(str1);
        Log.e("GmsClient", ((StringBuilder)localObject2).toString());
        localObject2 = j;
        localObject3 = g.c();
        n.i(localObject3);
        ((h)localObject2).e((String)localObject3, g.b(), g.a(), paramIInterface, X(), g.d());
        C.incrementAndGet();
      }
    }
    Object localObject3 = new A2/X;
    ((X)localObject3).<init>(this, C.get());
    s = ((X)localObject3);
    if ((t == 3) && (B() != null))
    {
      paramIInterface = new A2/m0;
      paramIInterface.<init>(y().getPackageName(), B(), true, h.a(), false);
    }
    else
    {
      paramIInterface = new m0(G(), F(), false, h.a(), I());
    }
    g = paramIInterface;
    if ((paramIInterface.d()) && (h() < 17895000))
    {
      paramIInterface = new java/lang/IllegalStateException;
      paramIInterface.<init>("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(g.c())));
      throw paramIInterface;
    }
    h localh = j;
    paramIInterface = g.c();
    n.i(paramIInterface);
    String str2 = g.b();
    paramInt = g.a();
    String str1 = X();
    bool = g.d();
    Executor localExecutor = w();
    Object localObject2 = new A2/e0;
    ((e0)localObject2).<init>(paramIInterface, str2, paramInt, bool);
    if (!localh.f((e0)localObject2, (ServiceConnection)localObject3, str1, localExecutor))
    {
      localObject2 = g.c();
      localObject3 = g.b();
      paramIInterface = new java/lang/StringBuilder;
      paramIInterface.<init>();
      paramIInterface.append("unable to connect to service: ");
      paramIInterface.append((String)localObject2);
      paramIInterface.append(" on ");
      paramIInterface.append((String)localObject3);
      Log.w("GmsClient", paramIInterface.toString());
      e0(16, null, C.get());
      break label634;
      label565:
      localObject2 = s;
      if (localObject2 != null)
      {
        paramIInterface = j;
        localObject3 = g.c();
        n.i(localObject3);
        paramIInterface.e((String)localObject3, g.b(), g.a(), (ServiceConnection)localObject2, X(), g.d());
        s = null;
      }
    }
    label634:
    return;
    label638:
    throw paramIInterface;
  }
  
  public final d[] j()
  {
    a0 locala0 = B;
    if (locala0 == null) {
      return null;
    }
    return p;
  }
  
  public String k()
  {
    if (a())
    {
      m0 localm0 = g;
      if (localm0 != null) {
        return localm0.b();
      }
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public String l()
  {
    return f;
  }
  
  public boolean m()
  {
    return false;
  }
  
  public void o(i arg1, Set paramSet)
  {
    Object localObject1 = A();
    int i1 = w;
    String str = y;
    int i2 = x2.k.a;
    Scope[] arrayOfScope = f.C;
    Object localObject2 = new Bundle();
    d[] arrayOfd = f.D;
    localObject2 = new f(6, i1, i2, null, null, arrayOfScope, (Bundle)localObject2, null, arrayOfd, arrayOfd, true, 0, false, str);
    r = h.getPackageName();
    u = ((Bundle)localObject1);
    if (paramSet != null) {
      t = ((Scope[])paramSet.toArray(new Scope[0]));
    }
    if (m())
    {
      localObject1 = u();
      paramSet = (Set)localObject1;
      if (localObject1 == null) {
        paramSet = new Account("<<default account>>", "com.google");
      }
      v = paramSet;
      if (??? != null) {
        s = ???.asBinder();
      }
    }
    else if (O())
    {
      v = u();
    }
    w = E;
    x = v();
    if (S()) {
      A = true;
    }
    try
    {
      synchronized (n)
      {
        paramSet = o;
        if (paramSet != null)
        {
          localObject1 = new A2/W;
          ((W)localObject1).<init>(this, C.get());
          paramSet.h0((j)localObject1, (f)localObject2);
        }
      }
      Log.w("GmsClient", "mServiceBroker is null, client disconnected");
      return;
    }
    catch (RuntimeException ???)
    {
      break label295;
    }
    catch (RemoteException ???)
    {
      break label295;
    }
    catch (SecurityException ???)
    {
      break label322;
    }
    catch (DeadObjectException ???) {}
    throw paramSet;
    label295:
    Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
    N(8, null, null, C.get());
    return;
    label322:
    throw ???;
    Log.w("GmsClient", "IGmsServiceBroker.getService failed", ???);
    Q(3);
  }
  
  public void p(c paramc)
  {
    n.j(paramc, "Connection progress callbacks cannot be null.");
    p = paramc;
    i0(2, null);
  }
  
  public void q()
  {
    int i1 = k.h(h, h());
    if (i1 != 0)
    {
      i0(1, null);
      R(new d(), i1, null);
      return;
    }
    p(new d());
  }
  
  public final void r()
  {
    if (a()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  public abstract IInterface s(IBinder paramIBinder);
  
  public boolean t()
  {
    return false;
  }
  
  public Account u()
  {
    return null;
  }
  
  public d[] v()
  {
    return E;
  }
  
  public Executor w()
  {
    return null;
  }
  
  public Bundle x()
  {
    return null;
  }
  
  public final Context y()
  {
    return h;
  }
  
  public int z()
  {
    return w;
  }
  
  public static abstract interface a
  {
    public abstract void n(int paramInt);
    
    public abstract void v(Bundle paramBundle);
  }
  
  public static abstract interface b
  {
    public abstract void o(b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void b(b paramb);
  }
  
  public class d
    implements c.c
  {
    public d() {}
    
    public final void b(b paramb)
    {
      if (paramb.i())
      {
        paramb = c.this;
        paramb.o(null, paramb.C());
        return;
      }
      if (c.V(c.this) != null) {
        c.V(c.this).o(paramb);
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     A2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */