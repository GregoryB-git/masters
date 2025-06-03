package l6;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.a.d;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import i6.q;
import i6.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k6.a.f;
import k6.e.a;
import k6.e.b;
import k6.n;
import m6.j;

public final class d0
  implements e.a, e.b
{
  public final LinkedList a = new LinkedList();
  public final a.f b;
  public final a c;
  public final u d;
  public final HashSet e = new HashSet();
  public final HashMap f = new HashMap();
  public final int u;
  public final zact v;
  public boolean w;
  public final ArrayList x = new ArrayList();
  public j6.b y = null;
  public int z = 0;
  
  public d0(d paramd, k6.d paramd1)
  {
    a.f localf = paramd1.zab(v.getLooper(), this);
    b = localf;
    c = paramd1.getApiKey();
    d = new u();
    u = paramd1.zaa();
    if (localf.requiresSignIn())
    {
      v = paramd1.zac(e, v);
      return;
    }
    v = null;
  }
  
  public final void a(j6.b paramb)
  {
    Object localObject = e.iterator();
    if (((Iterator)localObject).hasNext())
    {
      localObject = (b1)((Iterator)localObject).next();
      if (m6.h.a(paramb, j6.b.e)) {
        b.getEndpointPackageName();
      }
      localObject.getClass();
      throw null;
    }
    e.clear();
  }
  
  public final void b(Status paramStatus)
  {
    j.c(A.v);
    c(paramStatus, null, false);
  }
  
  public final void c(Status paramStatus, RuntimeException paramRuntimeException, boolean paramBoolean)
  {
    j.c(A.v);
    int i = 0;
    int j;
    if (paramStatus != null) {
      j = 0;
    } else {
      j = 1;
    }
    if (paramRuntimeException == null) {
      i = 1;
    }
    if (j != i)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext())
      {
        a1 locala1 = (a1)localIterator.next();
        if ((!paramBoolean) || (a == 2))
        {
          if (paramStatus != null) {
            locala1.a(paramStatus);
          } else {
            locala1.b(paramRuntimeException);
          }
          localIterator.remove();
        }
      }
      return;
    }
    throw new IllegalArgumentException("Status XOR exception should be null");
  }
  
  public final void d()
  {
    ArrayList localArrayList = new ArrayList(a);
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
    {
      a1 locala1 = (a1)localArrayList.get(j);
      if (!b.isConnected()) {
        break;
      }
      if (j(locala1)) {
        a.remove(locala1);
      }
    }
  }
  
  public final void e()
  {
    j.c(A.v);
    y = null;
    a(j6.b.e);
    i();
    Iterator localIterator = f.values().iterator();
    if (!localIterator.hasNext())
    {
      d();
      h();
      return;
    }
    ((n0)localIterator.next()).getClass();
    throw null;
  }
  
  public final void f(int paramInt)
  {
    j.c(A.v);
    y = null;
    w = true;
    String str = b.getLastDisconnectMessage();
    Object localObject1 = d;
    localObject1.getClass();
    StringBuilder localStringBuilder = new StringBuilder("The connection to Google Play services was lost");
    if (paramInt == 1)
    {
      localObject2 = " due to service disconnection.";
    }
    else
    {
      if (paramInt != 3) {
        break label80;
      }
      localObject2 = " due to dead object exception.";
    }
    localStringBuilder.append((String)localObject2);
    label80:
    if (str != null)
    {
      localStringBuilder.append(" Last reason for disconnect: ");
      localStringBuilder.append(str);
    }
    ((u)localObject1).a(new Status(20, localStringBuilder.toString(), null, null), true);
    localObject1 = c;
    Object localObject2 = A.v;
    ((Handler)localObject2).sendMessageDelayed(Message.obtain((Handler)localObject2, 9, localObject1), 5000L);
    localObject2 = c;
    localObject1 = A.v;
    ((Handler)localObject1).sendMessageDelayed(Message.obtain((Handler)localObject1, 11, localObject2), 120000L);
    A.o.a.clear();
    localObject2 = f.values().iterator();
    if (!((Iterator)localObject2).hasNext()) {
      return;
    }
    ((n0)((Iterator)localObject2).next()).getClass();
    throw null;
  }
  
  public final void g(j6.b paramb)
  {
    o(paramb, null);
  }
  
  public final void h()
  {
    Object localObject = c;
    A.v.removeMessages(12, localObject);
    a locala = c;
    localObject = A.v;
    ((Handler)localObject).sendMessageDelayed(((Handler)localObject).obtainMessage(12, locala), A.a);
  }
  
  public final void i()
  {
    if (w)
    {
      Object localObject1 = A;
      Object localObject2 = c;
      v.removeMessages(11, localObject2);
      localObject2 = A;
      localObject1 = c;
      v.removeMessages(9, localObject1);
      w = false;
    }
  }
  
  public final boolean j(a1 parama1)
  {
    if (!(parama1 instanceof j0))
    {
      parama1.d(d, b.requiresSignIn());
      try
      {
        parama1.c(this);
      }
      catch (DeadObjectException parama1)
      {
        r(1);
        b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
      }
      return true;
    }
    j0 localj0 = (j0)parama1;
    Object localObject1 = localj0.g(this);
    int i;
    if ((localObject1 != null) && (localObject1.length != 0))
    {
      localObject2 = b.getAvailableFeatures();
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = new j6.d[0];
      }
      r.b localb = new r.b(localObject3.length);
      for (i = 0; i < localObject3.length; i++)
      {
        localObject2 = localObject3[i];
        localb.put(a, Long.valueOf(((j6.d)localObject2).D()));
      }
      int j = localObject1.length;
      for (i = 0; i < j; i++)
      {
        localObject2 = localObject1[i];
        Long localLong = (Long)localb.getOrDefault(a, null);
        localObject3 = localObject2;
        if (localLong == null) {
          break label231;
        }
        if (localLong.longValue() < ((j6.d)localObject2).D())
        {
          localObject3 = localObject2;
          break label231;
        }
      }
    }
    Object localObject3 = null;
    label231:
    if (localObject3 == null)
    {
      parama1.d(d, b.requiresSignIn());
      try
      {
        parama1.c(this);
      }
      catch (DeadObjectException parama1)
      {
        r(1);
        b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
      }
      return true;
    }
    parama1 = b.getClass().getName();
    Object localObject2 = a;
    long l = ((j6.d)localObject3).D();
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(parama1);
    ((StringBuilder)localObject1).append(" could not execute call because it requires feature (");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(l);
    ((StringBuilder)localObject1).append(").");
    Log.w("GoogleApiManager", ((StringBuilder)localObject1).toString());
    if ((A.w) && (localj0.f(this)))
    {
      parama1 = new e0(c, (j6.d)localObject3);
      i = x.indexOf(parama1);
      if (i >= 0)
      {
        parama1 = (e0)x.get(i);
        A.v.removeMessages(15, parama1);
        localObject3 = A.v;
        ((Handler)localObject3).sendMessageDelayed(Message.obtain((Handler)localObject3, 15, parama1), 5000L);
      }
      else
      {
        x.add(parama1);
        localObject3 = A.v;
        ((Handler)localObject3).sendMessageDelayed(Message.obtain((Handler)localObject3, 15, parama1), 5000L);
        localObject3 = A.v;
        ((Handler)localObject3).sendMessageDelayed(Message.obtain((Handler)localObject3, 16, parama1), 120000L);
        parama1 = new j6.b(2, null);
        if (!k(parama1)) {
          A.c(parama1, u);
        }
      }
      return false;
    }
    localj0.b(new n((j6.d)localObject3));
    return true;
  }
  
  public final boolean k(j6.b paramb)
  {
    do
    {
      synchronized (d.z)
      {
        Object localObject2 = A;
        if ((s == null) || (!t.contains(c))) {
          break;
        }
        v localv = A.s;
        int i = u;
        localv.getClass();
        localObject2 = new l6/c1;
        ((c1)localObject2).<init>(paramb, i);
        paramb = b;
        do
        {
          if (paramb.compareAndSet(null, localObject2))
          {
            i = 1;
            break;
          }
        } while (paramb.get() == null);
        i = 0;
        if (i != 0)
        {
          zau localzau = c;
          paramb = new l6/d1;
          paramb.<init>(localv, (c1)localObject2);
          localzau.post(paramb);
        }
      }
    } while (paramb.get() == null);
    return true;
    return false;
  }
  
  public final boolean l(boolean paramBoolean)
  {
    j.c(A.v);
    if ((b.isConnected()) && (f.isEmpty()))
    {
      u localu = d;
      int i;
      if ((a.isEmpty()) && (b.isEmpty())) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        if (paramBoolean) {
          h();
        }
      }
      else
      {
        b.disconnect("Timing out service connection.");
        return true;
      }
    }
    return false;
  }
  
  public final void m()
  {
    j.c(A.v);
    if ((!b.isConnected()) && (!b.isConnecting())) {
      try
      {
        Object localObject1 = A;
        int i = o.a(e, b);
        Object localObject2;
        Object localObject3;
        if (i != 0)
        {
          localObject1 = new j6/b;
          ((j6.b)localObject1).<init>(i, null);
          localObject2 = b.getClass().getName();
          localObject3 = ((j6.b)localObject1).toString();
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("The service for ");
          ((StringBuilder)localObject4).append((String)localObject2);
          ((StringBuilder)localObject4).append(" is not available: ");
          ((StringBuilder)localObject4).append((String)localObject3);
          Log.w("GoogleApiManager", ((StringBuilder)localObject4).toString());
          o((j6.b)localObject1, null);
          return;
        }
        localObject1 = A;
        Object localObject4 = b;
        localObject1 = new g0((d)localObject1, (a.f)localObject4, c);
        if (((a.f)localObject4).requiresSignIn())
        {
          localObject4 = v;
          j.i(localObject4);
          localObject3 = f;
          if (localObject3 != null) {
            ((com.google.android.gms.common.internal.a)localObject3).disconnect();
          }
          e.h = Integer.valueOf(System.identityHashCode(localObject4));
          localObject3 = c;
          Context localContext = a;
          Handler localHandler = b;
          localObject2 = e;
          f = ((g7.b)localObject3).buildClient(localContext, localHandler.getLooper(), (m6.a)localObject2, g, (e.a)localObject4, (e.b)localObject4);
          u = ((r0)localObject1);
          localObject3 = d;
          if ((localObject3 != null) && (!((Set)localObject3).isEmpty()))
          {
            localObject4 = (h7.a)f;
            localObject4.getClass();
            ((com.google.android.gms.common.internal.a)localObject4).connect(new a.d((com.google.android.gms.common.internal.a)localObject4));
          }
          else
          {
            b.post(new q(localObject4, 1));
          }
        }
        try
        {
          b.connect((a.c)localObject1);
          return;
        }
        catch (SecurityException localSecurityException)
        {
          localObject4 = new j6.b(10);
        }
        o((j6.b)localObject4, localIllegalStateException);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        localObject4 = new j6.b(10);
      }
    }
  }
  
  public final void n(a1 parama1)
  {
    j.c(A.v);
    if (b.isConnected())
    {
      if (j(parama1))
      {
        h();
        return;
      }
      a.add(parama1);
      return;
    }
    a.add(parama1);
    parama1 = y;
    if (parama1 != null)
    {
      int i;
      if ((b != 0) && (c != null)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        o(parama1, null);
        return;
      }
    }
    m();
  }
  
  public final void o(j6.b paramb, RuntimeException paramRuntimeException)
  {
    j.c(A.v);
    Object localObject = v;
    if (localObject != null)
    {
      localObject = f;
      if (localObject != null) {
        ((com.google.android.gms.common.internal.a)localObject).disconnect();
      }
    }
    j.c(A.v);
    y = null;
    A.o.a.clear();
    a(paramb);
    if (((b instanceof o6.d)) && (b != 24))
    {
      localObject = A;
      b = true;
      localObject = v;
      ((Handler)localObject).sendMessageDelayed(((Handler)localObject).obtainMessage(19), 300000L);
    }
    if (b == 4)
    {
      b(d.y);
      return;
    }
    if (a.isEmpty())
    {
      y = paramb;
      return;
    }
    if (paramRuntimeException != null)
    {
      j.c(A.v);
      c(null, paramRuntimeException, false);
      return;
    }
    if (A.w)
    {
      c(d.d(c, paramb), null, true);
      if ((!a.isEmpty()) && (!k(paramb)) && (!A.c(paramb, u)))
      {
        if (b == 18) {
          w = true;
        }
        if (w)
        {
          paramRuntimeException = A;
          paramb = c;
          paramRuntimeException = v;
          paramRuntimeException.sendMessageDelayed(Message.obtain(paramRuntimeException, 9, paramb), 5000L);
          return;
        }
        b(d.d(c, paramb));
      }
      return;
    }
    b(d.d(c, paramb));
  }
  
  public final void p(j6.b paramb)
  {
    j.c(A.v);
    a.f localf = b;
    String str1 = localf.getClass().getName();
    String str2 = String.valueOf(paramb);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("onSignInFailed for ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" with ");
    localStringBuilder.append(str2);
    localf.disconnect(localStringBuilder.toString());
    o(paramb, null);
  }
  
  public final void q()
  {
    j.c(A.v);
    Status localStatus = d.x;
    b(localStatus);
    Object localObject = d;
    localObject.getClass();
    int i = 0;
    ((u)localObject).a(localStatus, false);
    localObject = (h.a[])f.keySet().toArray(new h.a[0]);
    int j = localObject.length;
    while (i < j)
    {
      n(new z0(localObject[i], new TaskCompletionSource()));
      i++;
    }
    a(new j6.b(4));
    if (b.isConnected()) {
      b.onUserSignOut(new c0(this));
    }
  }
  
  public final void r(int paramInt)
  {
    d locald = A;
    if (Looper.myLooper() == v.getLooper())
    {
      f(paramInt);
      return;
    }
    A.v.post(new a0(this, paramInt));
  }
  
  public final void s()
  {
    d locald = A;
    if (Looper.myLooper() == v.getLooper())
    {
      e();
      return;
    }
    A.v.post(new r(this, 1));
  }
}

/* Location:
 * Qualified Name:     l6.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */