package z2;

import A2.E;
import A2.h;
import A2.o;
import A2.t;
import V2.k;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.a;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import y2.d;

public class e
  implements Handler.Callback
{
  public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.");
  public static final Status G = new Status(4, "The user must be signed in to make this API call.");
  public static final Object H = new Object();
  public static e I;
  public p A = null;
  public final Set B = new t.b();
  public final Set C = new t.b();
  public final Handler D;
  public volatile boolean E = true;
  public long o = 5000L;
  public long p = 120000L;
  public long q = 10000L;
  public boolean r = false;
  public A2.r s;
  public t t;
  public final Context u;
  public final x2.j v;
  public final E w;
  public final AtomicInteger x = new AtomicInteger(1);
  public final AtomicInteger y = new AtomicInteger(0);
  public final Map z = new ConcurrentHashMap(5, 0.75F, 1);
  
  public e(Context paramContext, Looper paramLooper, x2.j paramj)
  {
    u = paramContext;
    paramLooper = new K2.i(paramLooper, this);
    D = paramLooper;
    v = paramj;
    w = new E(paramj);
    if (E2.i.a(paramContext)) {
      E = false;
    }
    paramLooper.sendMessage(paramLooper.obtainMessage(6));
  }
  
  public static Status h(b paramb, x2.b paramb1)
  {
    paramb = paramb.b();
    String str = String.valueOf(paramb1);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("API: ");
    localStringBuilder.append(paramb);
    localStringBuilder.append(" is not available on this device. Connection failed with: ");
    localStringBuilder.append(str);
    return new Status(paramb1, localStringBuilder.toString());
  }
  
  public static e x(Context paramContext)
  {
    synchronized (H)
    {
      if (I == null)
      {
        Looper localLooper = h.c().getLooper();
        e locale = new z2/e;
        locale.<init>(paramContext.getApplicationContext(), localLooper, x2.j.m());
        I = locale;
      }
    }
    paramContext = I;
    return paramContext;
  }
  
  public final void D(d paramd, int paramInt, m paramm, k paramk, l paraml)
  {
    l(paramk, paramm.d(), paramd);
    paramk = new Q(paramInt, paramm, paramk, paraml);
    paramm = D;
    paramm.sendMessage(paramm.obtainMessage(4, new I(paramk, y.get(), paramd)));
  }
  
  public final void E(A2.l paraml, int paramInt1, long paramLong, int paramInt2)
  {
    Handler localHandler = D;
    localHandler.sendMessage(localHandler.obtainMessage(18, new H(paraml, paramInt1, paramLong, paramInt2)));
  }
  
  public final void F(x2.b paramb, int paramInt)
  {
    if (!g(paramb, paramInt))
    {
      Handler localHandler = D;
      localHandler.sendMessage(localHandler.obtainMessage(5, paramInt, 0, paramb));
    }
  }
  
  public final void a()
  {
    Handler localHandler = D;
    localHandler.sendMessage(localHandler.obtainMessage(3));
  }
  
  public final void b(d paramd)
  {
    Handler localHandler = D;
    localHandler.sendMessage(localHandler.obtainMessage(7, paramd));
  }
  
  public final void c(p paramp)
  {
    synchronized (H)
    {
      if (A != paramp)
      {
        A = paramp;
        B.clear();
      }
    }
    B.addAll(paramp.t());
  }
  
  public final void d(p paramp)
  {
    synchronized (H)
    {
      if (A == paramp)
      {
        A = null;
        B.clear();
      }
    }
  }
  
  public final boolean f()
  {
    if (r) {
      return false;
    }
    A2.p localp = o.b().a();
    if ((localp != null) && (!localp.f())) {
      return false;
    }
    int i = w.a(u, 203400000);
    return (i == -1) || (i == 0);
  }
  
  public final boolean g(x2.b paramb, int paramInt)
  {
    return v.w(u, paramb, paramInt);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    long l = 300000L;
    Object localObject1 = null;
    Object localObject2;
    switch (i)
    {
    default: 
      paramMessage = new StringBuilder();
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i);
      Log.w("GoogleApiManager", paramMessage.toString());
      return false;
    case 19: 
      r = false;
      break;
    case 18: 
      paramMessage = (H)obj;
      if (c == 0L)
      {
        paramMessage = new A2.r(b, Arrays.asList(new A2.l[] { a }));
        j().a(paramMessage);
      }
      else
      {
        localObject1 = s;
        if (localObject1 != null)
        {
          localObject2 = ((A2.r)localObject1).d();
          if ((((A2.r)localObject1).a() == b) && ((localObject2 == null) || (((List)localObject2).size() < d)))
          {
            s.f(a);
          }
          else
          {
            D.removeMessages(17);
            k();
          }
        }
        if (s == null)
        {
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(a);
          s = new A2.r(b, (List)localObject1);
          localObject1 = D;
          ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(17), c);
        }
      }
      break;
    case 17: 
      k();
      break;
    case 16: 
      paramMessage = (z)obj;
      if (z.containsKey(z.b(paramMessage))) {
        x.B((x)z.get(z.b(paramMessage)), paramMessage);
      }
      break;
    case 15: 
      paramMessage = (z)obj;
      if (z.containsKey(z.b(paramMessage))) {
        x.A((x)z.get(z.b(paramMessage)), paramMessage);
      }
      break;
    case 14: 
      a.a(obj);
      throw null;
    case 12: 
      if (z.containsKey(obj)) {
        ((x)z.get(obj)).a();
      }
      break;
    case 11: 
      if (z.containsKey(obj)) {
        ((x)z.get(obj)).K();
      }
      break;
    case 10: 
      paramMessage = C.iterator();
      while (paramMessage.hasNext())
      {
        localObject1 = (b)paramMessage.next();
        localObject1 = (x)z.remove(localObject1);
        if (localObject1 != null) {
          ((x)localObject1).J();
        }
      }
      C.clear();
      break;
    case 9: 
      if (z.containsKey(obj)) {
        ((x)z.get(obj)).I();
      }
      break;
    case 7: 
      i((d)obj);
      break;
    case 6: 
      if ((u.getApplicationContext() instanceof Application))
      {
        c.c((Application)u.getApplicationContext());
        c.b().a(new s(this));
        if (!c.b().e(true)) {
          q = 300000L;
        }
      }
      break;
    case 5: 
      i = arg1;
      localObject2 = (x2.b)obj;
      Object localObject3 = z.values().iterator();
      do
      {
        paramMessage = (Message)localObject1;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        paramMessage = (x)((Iterator)localObject3).next();
      } while (paramMessage.q() != i);
      if (paramMessage != null)
      {
        if (((x2.b)localObject2).a() == 13)
        {
          localObject1 = v.e(((x2.b)localObject2).a());
          localObject2 = ((x2.b)localObject2).d();
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Error resolution was canceled by the user, original error message: ");
          ((StringBuilder)localObject3).append((String)localObject1);
          ((StringBuilder)localObject3).append(": ");
          ((StringBuilder)localObject3).append((String)localObject2);
          x.x(paramMessage, new Status(17, ((StringBuilder)localObject3).toString()));
        }
        else
        {
          x.x(paramMessage, h(x.u(paramMessage), (x2.b)localObject2));
        }
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Could not find API instance ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append(" while trying to fail enqueued calls.");
        paramMessage = new Exception();
        Log.wtf("GoogleApiManager", ((StringBuilder)localObject1).toString(), paramMessage);
      }
      break;
    case 4: 
    case 8: 
    case 13: 
      localObject2 = (I)obj;
      localObject1 = (x)z.get(c.d());
      paramMessage = (Message)localObject1;
      if (localObject1 == null) {
        paramMessage = i(c);
      }
      if ((paramMessage.L()) && (y.get() != b))
      {
        a.a(F);
        paramMessage.J();
      }
      else
      {
        paramMessage.E(a);
      }
      break;
    case 3: 
      paramMessage = z.values().iterator();
    case 2: 
    case 1: 
      while (paramMessage.hasNext())
      {
        localObject1 = (x)paramMessage.next();
        ((x)localObject1).C();
        ((x)localObject1).D();
        continue;
        a.a(obj);
        throw null;
        if (true == ((Boolean)obj).booleanValue()) {
          l = 10000L;
        }
        q = l;
        D.removeMessages(12);
        paramMessage = z.keySet().iterator();
        while (paramMessage.hasNext())
        {
          localObject2 = (b)paramMessage.next();
          localObject1 = D;
          ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(12, localObject2), q);
        }
      }
    }
    return true;
  }
  
  public final x i(d paramd)
  {
    b localb = paramd.d();
    x localx1 = (x)z.get(localb);
    x localx2 = localx1;
    if (localx1 == null)
    {
      localx2 = new x(this, paramd);
      z.put(localb, localx2);
    }
    if (localx2.L()) {
      C.add(localb);
    }
    localx2.D();
    return localx2;
  }
  
  public final t j()
  {
    if (t == null) {
      t = A2.s.a(u);
    }
    return t;
  }
  
  public final void k()
  {
    A2.r localr = s;
    if (localr != null)
    {
      if ((localr.a() > 0) || (f())) {
        j().a(localr);
      }
      s = null;
    }
  }
  
  public final void l(k paramk, int paramInt, d paramd)
  {
    if (paramInt != 0)
    {
      paramd = G.b(this, paramInt, paramd.d());
      if (paramd != null)
      {
        paramk = paramk.a();
        Handler localHandler = D;
        localHandler.getClass();
        paramk.c(new r(localHandler), paramd);
      }
    }
  }
  
  public final int m()
  {
    return x.getAndIncrement();
  }
  
  public final x w(b paramb)
  {
    return (x)z.get(paramb);
  }
}

/* Location:
 * Qualified Name:     z2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */