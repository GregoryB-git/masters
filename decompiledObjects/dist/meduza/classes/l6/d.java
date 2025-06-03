package l6;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzab;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k6.a.f;
import m6.g;
import m6.h;
import m6.k;
import m6.l;
import m6.m;
import m6.u;
import r.g.a;
import v6.f;

public final class d
  implements Handler.Callback
{
  public static d A;
  public static final Status x = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
  public static final Status y = new Status(4, "The user must be signed in to make this API call.", null, null);
  public static final Object z = new Object();
  public long a = 10000L;
  public boolean b = false;
  public m c;
  public o6.c d;
  public final Context e;
  public final j6.e f;
  public final u o;
  public final AtomicInteger p;
  public final AtomicInteger q;
  public final ConcurrentHashMap r;
  public v s;
  public final r.d t;
  public final r.d u;
  public final zau v;
  public volatile boolean w;
  
  public d(Context paramContext, Looper paramLooper, j6.e parame)
  {
    boolean bool = true;
    p = new AtomicInteger(1);
    q = new AtomicInteger(0);
    r = new ConcurrentHashMap(5, 0.75F, 1);
    s = null;
    t = new r.d();
    u = new r.d();
    w = true;
    e = paramContext;
    paramLooper = new zau(paramLooper, this);
    v = paramLooper;
    f = parame;
    o = new u(parame);
    paramContext = paramContext.getPackageManager();
    if (x6.b.h == null)
    {
      if ((!v6.e.a()) || (!paramContext.hasSystemFeature("android.hardware.type.automotive"))) {
        bool = false;
      }
      x6.b.h = Boolean.valueOf(bool);
    }
    if (x6.b.h.booleanValue()) {
      w = false;
    }
    paramLooper.sendMessage(paramLooper.obtainMessage(6));
  }
  
  public static Status d(a parama, j6.b paramb)
  {
    return new Status(17, a0.j.k("API: ", b.c, " is not available on this device. Connection failed with: ", String.valueOf(paramb)), c, paramb);
  }
  
  @ResultIgnorabilityUnspecified
  public static d g(Context paramContext)
  {
    synchronized (z)
    {
      if (A == null) {
        synchronized (m6.c.a)
        {
          Object localObject3 = m6.c.c;
          if (localObject3 == null) {
            for (;;)
            {
              localObject3 = new android/os/HandlerThread;
              ((HandlerThread)localObject3).<init>("GoogleApiHandler", 9);
              m6.c.c = (HandlerThread)localObject3;
              ((Thread)localObject3).start();
              localObject3 = m6.c.c;
            }
          }
          localObject3 = ((HandlerThread)localObject3).getLooper();
          ??? = new l6/d;
          ((d)???).<init>(paramContext.getApplicationContext(), (Looper)localObject3, j6.e.d);
          A = (d)???;
        }
      }
    }
  }
  
  public final void a(v paramv)
  {
    synchronized (z)
    {
      if (s != paramv)
      {
        s = paramv;
        t.clear();
      }
      t.addAll(e);
      return;
    }
  }
  
  public final boolean b()
  {
    if (b) {
      return false;
    }
    l locall = aa;
    if ((locall != null) && (!b)) {
      return false;
    }
    int i = o.a.get(203400000, -1);
    return (i == -1) || (i == 0);
  }
  
  @ResultIgnorabilityUnspecified
  public final boolean c(j6.b paramb, int paramInt)
  {
    j6.e locale = f;
    Context localContext = e;
    locale.getClass();
    boolean bool1 = x6.b.d0(localContext);
    boolean bool2 = true;
    if (!bool1)
    {
      int i = b;
      int j;
      if ((i != 0) && (c != null)) {
        j = 1;
      } else {
        j = 0;
      }
      Object localObject;
      if (j != 0)
      {
        localObject = c;
      }
      else
      {
        localObject = locale.a(localContext, null, i);
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = PendingIntent.getActivity(localContext, 0, (Intent)localObject, 201326592);
        }
      }
      if (localObject != null)
      {
        i = b;
        j = GoogleApiActivity.b;
        paramb = new Intent(localContext, GoogleApiActivity.class);
        paramb.putExtra("pending_intent", (Parcelable)localObject);
        paramb.putExtra("failing_client_id", paramInt);
        paramb.putExtra("notify_manager", true);
        locale.g(localContext, i, PendingIntent.getActivity(localContext, 0, paramb, zap.zaa | 0x8000000));
        break label195;
      }
    }
    bool2 = false;
    label195:
    return bool2;
  }
  
  @ResultIgnorabilityUnspecified
  public final d0 e(k6.d paramd)
  {
    Object localObject = r;
    a locala = paramd.getApiKey();
    d0 locald0 = (d0)((ConcurrentHashMap)localObject).get(locala);
    localObject = locald0;
    if (locald0 == null)
    {
      localObject = new d0(this, paramd);
      r.put(locala, localObject);
    }
    if (b.requiresSignIn()) {
      u.add(locala);
    }
    ((d0)localObject).m();
    return (d0)localObject;
  }
  
  public final void f(TaskCompletionSource paramTaskCompletionSource, int paramInt, k6.d paramd)
  {
    if (paramInt != 0)
    {
      paramd = paramd.getApiKey();
      Object localObject1;
      boolean bool;
      if (b())
      {
        localObject1 = aa;
        bool = true;
        if (localObject1 == null) {
          break label151;
        }
        if (b)
        {
          bool = c;
          localObject1 = (d0)r.get(paramd);
          if (localObject1 != null)
          {
            Object localObject2 = b;
            if (!(localObject2 instanceof com.google.android.gms.common.internal.a)) {
              break label146;
            }
            localObject2 = (com.google.android.gms.common.internal.a)localObject2;
            if ((((com.google.android.gms.common.internal.a)localObject2).hasConnectionInfo()) && (!((com.google.android.gms.common.internal.a)localObject2).isConnecting()))
            {
              localObject2 = k0.a((d0)localObject1, (com.google.android.gms.common.internal.a)localObject2, paramInt);
              if (localObject2 == null) {
                break label146;
              }
              z += 1;
              bool = c;
              break label151;
            }
          }
          break label151;
        }
      }
      label146:
      paramd = null;
      break label198;
      label151:
      long l1;
      if (bool) {
        l1 = System.currentTimeMillis();
      } else {
        l1 = 0L;
      }
      long l2;
      if (bool) {
        l2 = SystemClock.elapsedRealtime();
      } else {
        l2 = 0L;
      }
      paramd = new k0(this, paramInt, paramd, l1, l2);
      label198:
      if (paramd != null)
      {
        localObject1 = paramTaskCompletionSource.getTask();
        paramTaskCompletionSource = v;
        paramTaskCompletionSource.getClass();
        ((Task)localObject1).addOnCompleteListener(new y(paramTaskCompletionSource), paramd);
      }
    }
  }
  
  public final void h(j6.b paramb, int paramInt)
  {
    if (!c(paramb, paramInt))
    {
      zau localzau = v;
      localzau.sendMessage(localzau.obtainMessage(5, paramInt, 0, paramb));
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    int j = 0;
    long l = 300000L;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int k;
    switch (i)
    {
    default: 
      paramMessage = new StringBuilder();
      paramMessage.append("Unknown message id: ");
      paramMessage.append(i);
      Log.w("GoogleApiManager", paramMessage.toString());
      return false;
    case 19: 
      b = false;
      break;
    case 18: 
      paramMessage = (l0)obj;
      if (c == 0L)
      {
        paramMessage = new m(b, Arrays.asList(new g[] { a }));
        if (d == null) {
          d = new o6.c(e, m6.n.b);
        }
        d.a(paramMessage);
      }
      else
      {
        localObject1 = c;
        if (localObject1 != null)
        {
          localObject2 = b;
          if ((a == b) && ((localObject2 == null) || (((List)localObject2).size() < d)))
          {
            localObject1 = c;
            localObject2 = a;
            if (b == null) {
              b = new ArrayList();
            }
            b.add(localObject2);
          }
          else
          {
            v.removeMessages(17);
            localObject1 = c;
            if (localObject1 != null)
            {
              if ((a > 0) || (b()))
              {
                if (d == null) {
                  d = new o6.c(e, m6.n.b);
                }
                d.a((m)localObject1);
              }
              c = null;
            }
          }
        }
        if (c == null)
        {
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).add(a);
          c = new m(b, (List)localObject1);
          localObject1 = v;
          ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(17), c);
        }
      }
      break;
    case 17: 
      paramMessage = c;
      if (paramMessage != null)
      {
        if ((a > 0) || (b()))
        {
          if (d == null) {
            d = new o6.c(e, m6.n.b);
          }
          d.a(paramMessage);
        }
        c = null;
      }
      break;
    case 16: 
      localObject1 = (e0)obj;
      if (r.containsKey(a))
      {
        paramMessage = (d0)r.get(a);
        if (x.remove(localObject1))
        {
          A.v.removeMessages(15, localObject1);
          A.v.removeMessages(16, localObject1);
          localObject2 = b;
          localObject1 = new ArrayList(a.size());
          Iterator localIterator = a.iterator();
          while (localIterator.hasNext())
          {
            a1 locala1 = (a1)localIterator.next();
            if ((locala1 instanceof j0))
            {
              localObject3 = ((j0)locala1).g(paramMessage);
              if (localObject3 != null)
              {
                k = localObject3.length;
                for (i = 0; i < k; i++) {
                  if (h.a(localObject3[i], localObject2))
                  {
                    if (i < 0) {
                      break;
                    }
                    i = 1;
                    break label738;
                  }
                }
                i = 0;
                if (i != 0) {
                  ((ArrayList)localObject1).add(locala1);
                }
              }
            }
          }
          k = ((ArrayList)localObject1).size();
          i = j;
        }
      }
      break;
    case 15: 
    case 14: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 8: 
    case 13: 
    case 3: 
    case 2: 
    case 1: 
      label738:
      while (i < k)
      {
        localObject3 = (a1)((ArrayList)localObject1).get(i);
        a.remove(localObject3);
        ((a1)localObject3).b(new k6.n((j6.d)localObject2));
        i++;
        continue;
        paramMessage = (e0)obj;
        if (r.containsKey(a))
        {
          localObject1 = (d0)r.get(a);
          if ((x.contains(paramMessage)) && (!w)) {
            if (!b.isConnected())
            {
              ((d0)localObject1).m();
            }
            else
            {
              ((d0)localObject1).d();
              break;
              localObject1 = (w)obj;
              paramMessage = a;
              boolean bool;
              if (!r.containsKey(paramMessage))
              {
                localObject1 = b;
                paramMessage = Boolean.FALSE;
              }
              else
              {
                bool = ((d0)r.get(paramMessage)).l(false);
                localObject1 = b;
                paramMessage = Boolean.valueOf(bool);
              }
              ((TaskCompletionSource)localObject1).setResult(paramMessage);
              break;
              if (r.containsKey(obj))
              {
                ((d0)r.get(obj)).l(true);
                break;
                if (r.containsKey(obj))
                {
                  localObject1 = (d0)r.get(obj);
                  m6.j.c(A.v);
                  if (w)
                  {
                    ((d0)localObject1).i();
                    paramMessage = A;
                    if (f.b(e) == 18) {
                      paramMessage = new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null);
                    } else {
                      paramMessage = new Status(22, "API failed to connect while resuming due to an unknown error.", null, null);
                    }
                    ((d0)localObject1).b(paramMessage);
                    b.disconnect("Timing out connection while resuming.");
                    break;
                    paramMessage = u.iterator();
                    for (;;)
                    {
                      localObject1 = (g.a)paramMessage;
                      if (!((g.a)localObject1).hasNext()) {
                        break;
                      }
                      localObject1 = (a)((g.a)localObject1).next();
                      localObject1 = (d0)r.remove(localObject1);
                      if (localObject1 != null) {
                        ((d0)localObject1).q();
                      }
                    }
                    u.clear();
                    break;
                    if (r.containsKey(obj))
                    {
                      paramMessage = (d0)r.get(obj);
                      m6.j.c(A.v);
                      if (w)
                      {
                        paramMessage.m();
                        break;
                        e((k6.d)obj);
                        break;
                        if ((e.getApplicationContext() instanceof Application))
                        {
                          b.a((Application)e.getApplicationContext());
                          localObject2 = b.e;
                          paramMessage = new z(this);
                          localObject2.getClass();
                          try
                          {
                            c.add(paramMessage);
                            if (!b.get())
                            {
                              localObject1 = f.c;
                              paramMessage = (Message)localObject1;
                              if (localObject1 == null)
                              {
                                if (Build.VERSION.SDK_INT >= 28) {
                                  i = 1;
                                } else {
                                  i = 0;
                                }
                                if (i != 0) {
                                  paramMessage = Boolean.valueOf(com.google.android.recaptcha.internal.a.p());
                                } else {
                                  try
                                  {
                                    paramMessage = zzl.zza(Process.class, "isIsolated", new zzj[0]);
                                    if (paramMessage != null)
                                    {
                                      paramMessage = (Boolean)paramMessage;
                                    }
                                    else
                                    {
                                      paramMessage = new com/google/android/gms/internal/common/zzac;
                                      paramMessage.<init>(zzab.zza("expected a non-null reference", new Object[0]));
                                      throw paramMessage;
                                    }
                                  }
                                  catch (ReflectiveOperationException paramMessage)
                                  {
                                    paramMessage = Boolean.FALSE;
                                  }
                                }
                                f.c = paramMessage;
                              }
                              if (!paramMessage.booleanValue())
                              {
                                paramMessage = new ActivityManager.RunningAppProcessInfo();
                                ActivityManager.getMyMemoryState(paramMessage);
                                if ((!b.getAndSet(true)) && (importance > 100)) {
                                  a.set(true);
                                }
                              }
                              else
                              {
                                bool = true;
                                break label1520;
                              }
                            }
                            bool = a.get();
                            label1520:
                            if (bool) {
                              break;
                            }
                            a = 300000L;
                          }
                          finally {}
                          i = arg1;
                          localObject1 = (j6.b)obj;
                          localObject2 = r.values().iterator();
                          while (((Iterator)localObject2).hasNext())
                          {
                            paramMessage = (d0)((Iterator)localObject2).next();
                            if (u == i) {
                              break label1603;
                            }
                          }
                          paramMessage = null;
                          label1603:
                          if (paramMessage != null)
                          {
                            if (b == 13)
                            {
                              localObject2 = f;
                              i = b;
                              localObject2.getClass();
                              localObject2 = j6.j.a;
                              paramMessage.b(new Status(17, a0.j.k("Error resolution was canceled by the user, original error message: ", j6.b.E(i), ": ", d), null, null));
                            }
                            else
                            {
                              paramMessage.b(d(c, (j6.b)localObject1));
                            }
                          }
                          else
                          {
                            Log.wtf("GoogleApiManager", a0.j.h("Could not find API instance ", i, " while trying to fail enqueued calls."), new Exception());
                            break;
                            localObject2 = (m0)obj;
                            localObject1 = (d0)r.get(c.getApiKey());
                            paramMessage = (Message)localObject1;
                            if (localObject1 == null) {
                              paramMessage = e(c);
                            }
                            if ((b.requiresSignIn()) && (q.get() != b))
                            {
                              a.a(x);
                              paramMessage.q();
                            }
                            else
                            {
                              paramMessage.n(a);
                              break;
                              paramMessage = r.values().iterator();
                              while (paramMessage.hasNext())
                              {
                                localObject1 = (d0)paramMessage.next();
                                m6.j.c(A.v);
                                y = null;
                                ((d0)localObject1).m();
                                continue;
                                ((b1)obj).getClass();
                                throw null;
                                if (true == ((Boolean)obj).booleanValue()) {
                                  l = 10000L;
                                }
                                a = l;
                                v.removeMessages(12);
                                localObject2 = r.keySet().iterator();
                                while (((Iterator)localObject2).hasNext())
                                {
                                  paramMessage = (a)((Iterator)localObject2).next();
                                  localObject1 = v;
                                  ((Handler)localObject1).sendMessageDelayed(((Handler)localObject1).obtainMessage(12, paramMessage), a);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     l6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */