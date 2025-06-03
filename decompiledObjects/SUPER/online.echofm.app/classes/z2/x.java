package z2;

import A2.E;
import A2.c.c;
import A2.m;
import A2.n;
import V2.k;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import x2.j;
import y2.a.f;
import y2.e.a;
import y2.e.b;
import y2.g;

public final class x
  implements e.a, e.b
{
  public final Queue b = new LinkedList();
  public final a.f c;
  public final b d;
  public final o e;
  public final Set f = new HashSet();
  public final Map g = new HashMap();
  public final int h;
  public final M i;
  public boolean j;
  public final List k = new ArrayList();
  public x2.b l = null;
  public int m = 0;
  
  public x(e parame, y2.d paramd)
  {
    a.f localf = paramd.g(e.r(parame).getLooper(), this);
    c = localf;
    d = paramd.d();
    e = new o();
    h = paramd.f();
    if (localf.m())
    {
      i = paramd.h(e.q(parame), e.r(parame));
      return;
    }
    i = null;
  }
  
  public final void C()
  {
    n.c(e.r(n));
    l = null;
  }
  
  public final void D()
  {
    n.c(e.r(n));
    if ((!c.a()) && (!c.i())) {
      try
      {
        Object localObject1 = n;
        int i1 = e.y((e)localObject1).b(e.q((e)localObject1), c);
        if (i1 != 0)
        {
          localObject2 = new x2/b;
          ((x2.b)localObject2).<init>(i1, null);
          localObject1 = c.getClass().getName();
          String str = localObject2.toString();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("The service for ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append(" is not available: ");
          localStringBuilder.append(str);
          Log.w("GoogleApiManager", localStringBuilder.toString());
          G((x2.b)localObject2, null);
          return;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        break label230;
        Object localObject2 = n;
        a.f localf = c;
        localObject2 = new B((e)localObject2, localf, d);
        if (localf.m()) {
          ((M)n.i(i)).c1((L)localObject2);
        }
        try
        {
          c.p((c.c)localObject2);
          return;
        }
        catch (SecurityException localSecurityException)
        {
          localObject2 = new x2.b(10);
        }
        for (;;)
        {
          G((x2.b)localObject2, localSecurityException);
          return;
          label230:
          localObject2 = new x2.b(10);
        }
      }
    }
  }
  
  public final void E(T paramT)
  {
    n.c(e.r(n));
    if (c.a())
    {
      if (l(paramT))
      {
        i();
        return;
      }
      b.add(paramT);
      return;
    }
    b.add(paramT);
    paramT = l;
    if ((paramT != null) && (paramT.g()))
    {
      G(l, null);
      return;
    }
    D();
  }
  
  public final void F()
  {
    m += 1;
  }
  
  public final void G(x2.b paramb, Exception paramException)
  {
    n.c(e.r(n));
    Object localObject = i;
    if (localObject != null) {
      ((M)localObject).d1();
    }
    C();
    e.y(n).c();
    c(paramb);
    if (((c instanceof C2.e)) && (paramb.a() != 24))
    {
      e.C(n, true);
      localObject = n;
      e.r((e)localObject).sendMessageDelayed(e.r((e)localObject).obtainMessage(19), 300000L);
    }
    if (paramb.a() == 4)
    {
      d(e.t());
      return;
    }
    if (b.isEmpty())
    {
      l = paramb;
      return;
    }
    if (paramException != null)
    {
      n.c(e.r(n));
      e(null, paramException, false);
      return;
    }
    if (e.e(n))
    {
      e(e.u(d, paramb), null, true);
      if (b.isEmpty()) {
        return;
      }
      if (m(paramb)) {
        return;
      }
      if (!n.g(paramb, h))
      {
        if (paramb.a() == 18) {
          j = true;
        }
        if (j)
        {
          paramb = n;
          e.r(paramb).sendMessageDelayed(Message.obtain(e.r(paramb), 9, d), e.n(n));
          return;
        }
        d(e.u(d, paramb));
      }
      return;
    }
    d(e.u(d, paramb));
  }
  
  public final void H(x2.b paramb)
  {
    n.c(e.r(n));
    a.f localf = c;
    String str1 = localf.getClass().getName();
    String str2 = String.valueOf(paramb);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("onSignInFailed for ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" with ");
    localStringBuilder.append(str2);
    localf.f(localStringBuilder.toString());
    G(paramb, null);
  }
  
  public final void I()
  {
    n.c(e.r(n));
    if (j) {
      D();
    }
  }
  
  public final void J()
  {
    n.c(e.r(n));
    d(e.F);
    e.d();
    Object localObject1 = g.keySet();
    int i1 = 0;
    localObject1 = (h[])((Set)localObject1).toArray(new h[0]);
    int i2 = localObject1.length;
    while (i1 < i2)
    {
      Object localObject2 = localObject1[i1];
      E(new S(null, new k()));
      i1++;
    }
    c(new x2.b(4));
    if (c.a()) {
      c.b(new w(this));
    }
  }
  
  public final void K()
  {
    n.c(e.r(n));
    if (j)
    {
      k();
      Object localObject = n;
      if (e.s((e)localObject).g(e.q((e)localObject)) == 18) {
        localObject = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
      } else {
        localObject = new Status(22, "API failed to connect while resuming due to an unknown error.");
      }
      d((Status)localObject);
      c.f("Timing out connection while resuming.");
    }
  }
  
  public final boolean L()
  {
    return c.m();
  }
  
  public final boolean a()
  {
    return p(true);
  }
  
  public final x2.d b(x2.d[] paramArrayOfd)
  {
    if ((paramArrayOfd != null) && (paramArrayOfd.length != 0))
    {
      Object localObject1 = c.j();
      int i1 = 0;
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new x2.d[0];
      }
      int i2 = localObject2.length;
      localObject1 = new t.a(i2);
      x2.d locald;
      for (int i3 = 0; i3 < i2; i3++)
      {
        locald = localObject2[i3];
        ((Map)localObject1).put(locald.a(), Long.valueOf(locald.d()));
      }
      i2 = paramArrayOfd.length;
      i3 = i1;
      while (i3 < i2)
      {
        locald = paramArrayOfd[i3];
        localObject2 = (Long)((Map)localObject1).get(locald.a());
        if ((localObject2 != null) && (((Long)localObject2).longValue() >= locald.d())) {
          i3++;
        } else {
          return locald;
        }
      }
    }
    return null;
  }
  
  public final void c(x2.b paramb)
  {
    Iterator localIterator = f.iterator();
    if (localIterator.hasNext())
    {
      android.support.v4.media.a.a(localIterator.next());
      if (m.a(paramb, x2.b.s)) {
        c.k();
      }
      throw null;
    }
    f.clear();
  }
  
  public final void d(Status paramStatus)
  {
    n.c(e.r(n));
    e(paramStatus, null, false);
  }
  
  public final void e(Status paramStatus, Exception paramException, boolean paramBoolean)
  {
    n.c(e.r(n));
    int i1 = 1;
    int i2;
    if (paramStatus != null) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    if (paramException != null) {
      i1 = 0;
    }
    if (i2 != i1)
    {
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        T localT = (T)localIterator.next();
        if ((!paramBoolean) || (a == 2))
        {
          if (paramStatus != null) {
            localT.a(paramStatus);
          } else {
            localT.b(paramException);
          }
          localIterator.remove();
        }
      }
      return;
    }
    throw new IllegalArgumentException("Status XOR exception should be null");
  }
  
  public final void f()
  {
    ArrayList localArrayList = new ArrayList(b);
    int i1 = localArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      T localT = (T)localArrayList.get(i2);
      if (!c.a()) {
        break;
      }
      if (l(localT)) {
        b.remove(localT);
      }
    }
  }
  
  public final void g()
  {
    C();
    c(x2.b.s);
    k();
    Iterator localIterator = g.values().iterator();
    if (!localIterator.hasNext())
    {
      f();
      i();
      return;
    }
    android.support.v4.media.a.a(localIterator.next());
    throw null;
  }
  
  public final void h(int paramInt)
  {
    C();
    j = true;
    e.c(paramInt, c.l());
    Object localObject = n;
    e.r((e)localObject).sendMessageDelayed(Message.obtain(e.r((e)localObject), 9, d), e.n(n));
    localObject = n;
    e.r((e)localObject).sendMessageDelayed(Message.obtain(e.r((e)localObject), 11, d), e.o(n));
    e.y(n).c();
    localObject = g.values().iterator();
    if (!((Iterator)localObject).hasNext()) {
      return;
    }
    android.support.v4.media.a.a(((Iterator)localObject).next());
    throw null;
  }
  
  public final void i()
  {
    e.r(n).removeMessages(12, d);
    e locale = n;
    e.r(locale).sendMessageDelayed(e.r(locale).obtainMessage(12, d), e.p(n));
  }
  
  public final void j(T paramT)
  {
    paramT.d(e, L());
    try
    {
      paramT.c(this);
      return;
    }
    catch (DeadObjectException paramT)
    {
      n(1);
      c.f("DeadObjectException thrown while running ApiCallRunner.");
    }
  }
  
  public final void k()
  {
    if (j)
    {
      e.r(n).removeMessages(11, d);
      e.r(n).removeMessages(9, d);
      j = false;
    }
  }
  
  public final boolean l(T paramT)
  {
    if (!(paramT instanceof F))
    {
      j(paramT);
      return true;
    }
    F localF = (F)paramT;
    Object localObject = b(localF.g(this));
    if (localObject == null)
    {
      j(paramT);
      return true;
    }
    String str1 = c.getClass().getName();
    String str2 = ((x2.d)localObject).a();
    long l1 = ((x2.d)localObject).d();
    paramT = new StringBuilder();
    paramT.append(str1);
    paramT.append(" could not execute call because it requires feature (");
    paramT.append(str2);
    paramT.append(", ");
    paramT.append(l1);
    paramT.append(").");
    Log.w("GoogleApiManager", paramT.toString());
    if ((e.e(n)) && (localF.f(this)))
    {
      paramT = new z(d, (x2.d)localObject, null);
      int i1 = k.indexOf(paramT);
      if (i1 >= 0)
      {
        paramT = (z)k.get(i1);
        e.r(n).removeMessages(15, paramT);
        localObject = n;
        e.r((e)localObject).sendMessageDelayed(Message.obtain(e.r((e)localObject), 15, paramT), e.n(n));
      }
      else
      {
        k.add(paramT);
        localObject = n;
        e.r((e)localObject).sendMessageDelayed(Message.obtain(e.r((e)localObject), 15, paramT), e.n(n));
        localObject = n;
        e.r((e)localObject).sendMessageDelayed(Message.obtain(e.r((e)localObject), 16, paramT), e.o(n));
        paramT = new x2.b(2, null);
        if (!m(paramT)) {
          n.g(paramT, h);
        }
      }
      return false;
    }
    localF.b(new g((x2.d)localObject));
    return true;
  }
  
  public final boolean m(x2.b paramb)
  {
    synchronized ()
    {
      e locale = n;
      if ((e.v(locale) != null) && (e.B(locale).contains(d)))
      {
        e.v(n).s(paramb, h);
        return true;
      }
    }
  }
  
  public final void n(int paramInt)
  {
    if (Looper.myLooper() == e.r(n).getLooper())
    {
      h(paramInt);
      return;
    }
    e.r(n).post(new u(this, paramInt));
  }
  
  public final void o(x2.b paramb)
  {
    G(paramb, null);
  }
  
  public final boolean p(boolean paramBoolean)
  {
    n.c(e.r(n));
    if ((c.a()) && (g.size() == 0))
    {
      if (e.e())
      {
        if (paramBoolean) {
          i();
        }
        return false;
      }
      c.f("Timing out service connection.");
      return true;
    }
    return false;
  }
  
  public final int q()
  {
    return h;
  }
  
  public final int r()
  {
    return m;
  }
  
  public final a.f t()
  {
    return c;
  }
  
  public final void v(Bundle paramBundle)
  {
    if (Looper.myLooper() == e.r(n).getLooper())
    {
      g();
      return;
    }
    e.r(n).post(new t(this));
  }
  
  public final Map w()
  {
    return g;
  }
}

/* Location:
 * Qualified Name:     z2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */