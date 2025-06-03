package a4;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f;
import g.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o7.l0;
import o7.r;
import o7.t;
import o7.t.b;
import o7.x;
import t5.c0;
import t5.u;
import v3.i0;
import v5.e0;
import w3.a0;

public final class b
  implements h
{
  public final UUID b;
  public final o.c c;
  public final w d;
  public final HashMap<String, String> e;
  public final boolean f;
  public final int[] g;
  public final boolean h;
  public final e i;
  public final c0 j;
  public final f k;
  public final long l;
  public final ArrayList m;
  public final Set<d> n;
  public final Set<a> o;
  public int p;
  public o q;
  public a r;
  public a s;
  public Looper t;
  public Handler u;
  public int v;
  public byte[] w;
  public a0 x;
  public volatile b y;
  
  public b(UUID paramUUID, o.c paramc, w paramw, HashMap paramHashMap, boolean paramBoolean1, int[] paramArrayOfInt, boolean paramBoolean2, u paramu, long paramLong)
  {
    paramUUID.getClass();
    x6.b.o("Use C.CLEARKEY_UUID instead", v3.h.b.equals(paramUUID) ^ true);
    b = paramUUID;
    c = paramc;
    d = paramw;
    e = paramHashMap;
    f = paramBoolean1;
    g = paramArrayOfInt;
    h = paramBoolean2;
    j = paramu;
    i = new e();
    k = new f();
    v = 0;
    m = new ArrayList();
    n = Collections.newSetFromMap(new IdentityHashMap());
    o = Collections.newSetFromMap(new IdentityHashMap());
    l = paramLong;
  }
  
  public static boolean g(a parama)
  {
    parama.p();
    int i1 = p;
    boolean bool1 = true;
    if (i1 == 1)
    {
      bool2 = bool1;
      if (e0.a < 19) {
        return bool2;
      }
      parama = parama.k();
      parama.getClass();
      if ((parama.getCause() instanceof ResourceBusyException)) {
        return bool1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public static ArrayList j(d paramd, UUID paramUUID, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(d);
    for (int i1 = 0; i1 < d; i1++)
    {
      d.b localb = a[i1];
      int i2;
      if ((!localb.a(paramUUID)) && ((!v3.h.c.equals(paramUUID)) || (!localb.a(v3.h.b)))) {
        i2 = 0;
      } else {
        i2 = 1;
      }
      if ((i2 != 0) && ((e != null) || (paramBoolean))) {
        localArrayList.add(localb);
      }
    }
    return localArrayList;
  }
  
  public final void a()
  {
    l(true);
    int i1 = p;
    p = (i1 + 1);
    if (i1 != 0) {
      return;
    }
    if (q == null)
    {
      o localo = c.b(b);
      q = localo;
      localo.g(new a());
    }
    else if (l != -9223372036854775807L)
    {
      for (i1 = 0; i1 < m.size(); i1++) {
        ((a)m.get(i1)).h(null);
      }
    }
  }
  
  public final h.b b(g.a parama, i0 parami0)
  {
    boolean bool;
    if (p > 0) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    x6.b.K(t);
    parama = new d(parama);
    Handler localHandler = u;
    localHandler.getClass();
    localHandler.post(new q(6, parama, parami0));
    return parama;
  }
  
  public final void c(Looper paramLooper, a0 parama0)
  {
    try
    {
      Object localObject = t;
      if (localObject == null)
      {
        t = paramLooper;
        localObject = new android/os/Handler;
        ((Handler)localObject).<init>(paramLooper);
        u = ((Handler)localObject);
      }
      else
      {
        boolean bool;
        if (localObject == paramLooper) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.H(bool);
        u.getClass();
      }
      x = parama0;
      return;
    }
    finally {}
  }
  
  public final e d(g.a parama, i0 parami0)
  {
    boolean bool = false;
    l(false);
    if (p > 0) {
      bool = true;
    }
    x6.b.H(bool);
    x6.b.K(t);
    return f(t, parama, parami0, true);
  }
  
  public final int e(i0 parami0)
  {
    int i1 = 0;
    int i2 = 0;
    l(false);
    Object localObject = q;
    localObject.getClass();
    int i3 = ((o)localObject).l();
    localObject = w;
    if (localObject == null)
    {
      i1 = v5.p.i(t);
      parami0 = g;
      for (i4 = 0; i4 < parami0.length; i4++) {
        if (parami0[i4] == i1) {
          break label84;
        }
      }
      i4 = -1;
      label84:
      if (i4 != -1) {
        i2 = i3;
      }
      return i2;
    }
    if (w == null)
    {
      if (j((d)localObject, b, true).isEmpty())
      {
        i4 = i1;
        if (d != 1) {
          break label257;
        }
        i4 = i1;
        if (!a[0].a(v3.h.b)) {
          break label257;
        }
        parami0 = f.l("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
        parami0.append(b);
        v5.m.f("DefaultDrmSessionMgr", parami0.toString());
      }
      parami0 = c;
      if ((parami0 != null) && (!"cenc".equals(parami0))) {
        if ("cbcs".equals(parami0))
        {
          i4 = i1;
          if (e0.a < 25) {
            break label257;
          }
        }
        else
        {
          i4 = i1;
          if ("cbc1".equals(parami0)) {
            break label257;
          }
          if ("cens".equals(parami0))
          {
            i4 = i1;
            break label257;
          }
        }
      }
    }
    int i4 = 1;
    label257:
    if (i4 == 0) {
      i3 = 1;
    }
    return i3;
  }
  
  public final e f(Looper paramLooper, g.a parama, i0 parami0, boolean paramBoolean)
  {
    if (y == null) {
      y = new b(paramLooper);
    }
    paramLooper = w;
    Object localObject = null;
    Iterator localIterator = null;
    int i1 = 0;
    if (paramLooper == null)
    {
      int i2 = v5.p.i(t);
      parama = q;
      parama.getClass();
      int i3;
      if ((parama.l() == 2) && (p.d)) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      paramLooper = localIterator;
      if (i3 == 0)
      {
        paramLooper = g;
        for (i3 = i1; i3 < paramLooper.length; i3++) {
          if (paramLooper[i3] == i2) {
            break label127;
          }
        }
        i3 = -1;
        label127:
        paramLooper = localIterator;
        if (i3 != -1) {
          if (parama.l() == 1)
          {
            paramLooper = localIterator;
          }
          else
          {
            paramLooper = r;
            if (paramLooper == null)
            {
              paramLooper = t.b;
              paramLooper = i(l0.e, true, null, paramBoolean);
              m.add(paramLooper);
              r = paramLooper;
            }
            else
            {
              paramLooper.h(null);
            }
            paramLooper = r;
          }
        }
      }
      return paramLooper;
    }
    if (w == null)
    {
      paramLooper = j(paramLooper, b, false);
      parami0 = paramLooper;
      if (paramLooper.isEmpty())
      {
        paramLooper = new c(b);
        v5.m.d("DefaultDrmSessionMgr", "DRM error", paramLooper);
        if (parama != null) {
          parama.e(paramLooper);
        }
        return new n(new e.a(6003, paramLooper));
      }
    }
    else
    {
      parami0 = null;
    }
    if (!f)
    {
      paramLooper = s;
    }
    else
    {
      localIterator = m.iterator();
      do
      {
        paramLooper = (Looper)localObject;
        if (!localIterator.hasNext()) {
          break;
        }
        paramLooper = (a)localIterator.next();
      } while (!e0.a(a, parami0));
    }
    if (paramLooper == null)
    {
      paramLooper = i(parami0, false, parama, paramBoolean);
      if (!f) {
        s = paramLooper;
      }
      m.add(paramLooper);
    }
    else
    {
      paramLooper.h(parama);
    }
    return paramLooper;
  }
  
  public final a h(List<d.b> paramList, boolean paramBoolean, g.a parama)
  {
    q.getClass();
    boolean bool = h;
    UUID localUUID = b;
    o localo = q;
    e locale = i;
    f localf = k;
    int i1 = v;
    byte[] arrayOfByte = w;
    HashMap localHashMap = e;
    w localw = d;
    Looper localLooper = t;
    localLooper.getClass();
    c0 localc0 = j;
    a0 locala0 = x;
    locala0.getClass();
    paramList = new a(localUUID, localo, locale, localf, paramList, i1, bool | paramBoolean, paramBoolean, arrayOfByte, localHashMap, localw, localLooper, localc0, locala0);
    paramList.h(parama);
    if (l != -9223372036854775807L) {
      paramList.h(null);
    }
    return paramList;
  }
  
  public final a i(List<d.b> paramList, boolean paramBoolean1, g.a parama, boolean paramBoolean2)
  {
    Object localObject1 = h(paramList, paramBoolean1, parama);
    Object localObject2 = localObject1;
    if (g((a)localObject1))
    {
      localObject2 = localObject1;
      if (!o.isEmpty())
      {
        localObject2 = x.q(o).n();
        while (((Iterator)localObject2).hasNext()) {
          ((e)((Iterator)localObject2).next()).f(null);
        }
        ((a)localObject1).f(parama);
        if (l != -9223372036854775807L) {
          ((a)localObject1).f(null);
        }
        localObject2 = h(paramList, paramBoolean1, parama);
      }
    }
    localObject1 = localObject2;
    if (g((a)localObject2))
    {
      localObject1 = localObject2;
      if (paramBoolean2)
      {
        localObject1 = localObject2;
        if (!n.isEmpty())
        {
          localObject1 = x.q(n).n();
          while (((Iterator)localObject1).hasNext()) {
            ((d)((Iterator)localObject1).next()).release();
          }
          if (!o.isEmpty())
          {
            localObject1 = x.q(o).n();
            while (((Iterator)localObject1).hasNext()) {
              ((e)((Iterator)localObject1).next()).f(null);
            }
          }
          ((a)localObject2).f(parama);
          if (l != -9223372036854775807L) {
            ((a)localObject2).f(null);
          }
          localObject1 = h(paramList, paramBoolean1, parama);
        }
      }
    }
    return (a)localObject1;
  }
  
  public final void k()
  {
    if ((q != null) && (p == 0) && (m.isEmpty()) && (n.isEmpty()))
    {
      o localo = q;
      localo.getClass();
      localo.release();
      q = null;
    }
  }
  
  public final void l(boolean paramBoolean)
  {
    if ((paramBoolean) && (t == null))
    {
      v5.m.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }
    else
    {
      Object localObject = Thread.currentThread();
      Looper localLooper = t;
      localLooper.getClass();
      if (localObject != localLooper.getThread())
      {
        localObject = f.l("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
        ((StringBuilder)localObject).append(Thread.currentThread().getName());
        ((StringBuilder)localObject).append("\nExpected thread: ");
        ((StringBuilder)localObject).append(t.getThread().getName());
        v5.m.g("DefaultDrmSessionMgr", ((StringBuilder)localObject).toString(), new IllegalStateException());
      }
    }
  }
  
  public final void release()
  {
    l(true);
    int i1 = p - 1;
    p = i1;
    if (i1 != 0) {
      return;
    }
    if (l != -9223372036854775807L)
    {
      localObject = new ArrayList(m);
      for (i1 = 0; i1 < ((ArrayList)localObject).size(); i1++) {
        ((a)((ArrayList)localObject).get(i1)).f(null);
      }
    }
    Object localObject = x.q(n).n();
    while (((Iterator)localObject).hasNext()) {
      ((d)((Iterator)localObject).next()).release();
    }
    k();
  }
  
  public final class a
    implements o.b
  {
    public a() {}
  }
  
  public final class b
    extends Handler
  {
    public b(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      byte[] arrayOfByte = (byte[])obj;
      if (arrayOfByte == null) {
        return;
      }
      Iterator localIterator = m.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        locala.p();
        if (Arrays.equals(v, arrayOfByte)) {
          if ((what == 2) && (e == 0) && (p == 4))
          {
            int i = e0.a;
            locala.a(false);
          }
        }
      }
    }
  }
  
  public static final class c
    extends Exception
  {
    public c(UUID paramUUID)
    {
      super();
    }
  }
  
  public final class d
    implements h.b
  {
    public final g.a a;
    public e b;
    public boolean c;
    
    public d(g.a parama)
    {
      a = parama;
    }
    
    public final void release()
    {
      Handler localHandler = u;
      localHandler.getClass();
      e0.M(localHandler, new b.m(this, 10));
    }
  }
  
  public final class e
    implements a.a
  {
    public final HashSet a = new HashSet();
    public a b;
    
    public final void a(Exception paramException, boolean paramBoolean)
    {
      b = null;
      Object localObject = t.p(a);
      a.clear();
      t.b localb = ((t)localObject).r(0);
      while (localb.hasNext())
      {
        localObject = (a)localb.next();
        int i;
        if (paramBoolean) {
          i = 1;
        } else {
          i = 3;
        }
        ((a)localObject).c(i, paramException);
      }
    }
  }
  
  public final class f
    implements a.b
  {
    public f() {}
  }
}

/* Location:
 * Qualified Name:     a4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */