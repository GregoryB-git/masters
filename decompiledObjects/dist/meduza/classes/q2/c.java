package q2;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.a0;
import f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nc.j1;
import o2.j;
import o2.o.b;
import p2.h0;
import p2.i0;
import p2.r;
import p2.t;
import p2.x;
import t2.b.a;
import t2.b.b;
import t2.e;
import t2.h;
import x2.s;
import y2.q;

public final class c
  implements t, t2.d, p2.d
{
  public static final String w = j.f("GreedyScheduler");
  public final Context a;
  public final HashMap b = new HashMap();
  public b c;
  public boolean d;
  public final Object e = new Object();
  public final l.l f = new l.l(2);
  public final r o;
  public final h0 p;
  public final androidx.work.a q;
  public final HashMap r = new HashMap();
  public Boolean s;
  public final e t;
  public final a3.b u;
  public final d v;
  
  public c(Context paramContext, androidx.work.a parama, v2.n paramn, r paramr, i0 parami0, a3.b paramb)
  {
    a = paramContext;
    paramContext = f;
    c = new b(this, paramContext, c);
    v = new d(paramContext, parami0);
    u = paramb;
    t = new e(paramn);
    q = parama;
    o = paramr;
    p = parami0;
  }
  
  public final void a(x2.l paraml, boolean paramBoolean)
  {
    ??? = f.f(paraml);
    if (??? != null) {
      v.a((x)???);
    }
    synchronized (e)
    {
      ??? = (j1)b.remove(paraml);
      if (??? != null)
      {
        ??? = j.d();
        String str = w;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Stopping tracking for ");
        localStringBuilder.append(paraml);
        ((j)???).a(str, localStringBuilder.toString());
        ((j1)???).cancel(null);
      }
      if (!paramBoolean) {
        synchronized (e)
        {
          r.remove(paraml);
        }
      }
      return;
    }
  }
  
  public final boolean b()
  {
    return false;
  }
  
  public final void c(String paramString)
  {
    if (s == null) {
      s = Boolean.valueOf(q.a(a, q));
    }
    if (!s.booleanValue())
    {
      j.d().e(w, "Ignoring schedule request in non-main process");
      return;
    }
    if (!d)
    {
      o.a(this);
      d = true;
    }
    Object localObject1 = j.d();
    String str = w;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Cancelling work ID ");
    ((StringBuilder)localObject2).append(paramString);
    ((j)localObject1).a(str, ((StringBuilder)localObject2).toString());
    localObject1 = c;
    if (localObject1 != null)
    {
      localObject2 = (Runnable)d.remove(paramString);
      if (localObject2 != null) {
        b.b((Runnable)localObject2);
      }
    }
    paramString = f.e(paramString).iterator();
    while (paramString.hasNext())
    {
      localObject1 = (x)paramString.next();
      v.a((x)localObject1);
      p.a((x)localObject1);
    }
  }
  
  public final void d(s params, t2.b paramb)
  {
    params = a0.s(params);
    Object localObject1;
    Object localObject2;
    if ((paramb instanceof b.a))
    {
      if (!f.a(params))
      {
        localObject1 = j.d();
        paramb = w;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Constraints met: Scheduling work ID ");
        ((StringBuilder)localObject2).append(params);
        ((j)localObject1).a(paramb, ((StringBuilder)localObject2).toString());
        params = f.h(params);
        v.b(params);
        p.b(params);
      }
    }
    else
    {
      localObject2 = j.d();
      localObject1 = w;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Constraints not met: Cancelling work ID ");
      localStringBuilder.append(params);
      ((j)localObject2).a((String)localObject1, localStringBuilder.toString());
      params = f.f(params);
      if (params != null)
      {
        v.a(params);
        int i = a;
        p.d(params, i);
      }
    }
  }
  
  public final void e(s... arg1)
  {
    if (s == null) {
      s = Boolean.valueOf(q.a(a, q));
    }
    if (!s.booleanValue())
    {
      j.d().e(w, "Ignoring schedule request in a secondary process");
      return;
    }
    if (!d)
    {
      o.a(this);
      d = true;
    }
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    int i = ???.length;
    int j = 0;
    Object localObject1;
    Object localObject2;
    Object localObject5;
    while (j < i)
    {
      localObject1 = ???[j];
      localObject2 = a0.s((s)localObject1);
      if (!f.a((x2.l)localObject2)) {}
      synchronized (e)
      {
        x2.l locall = a0.s((s)localObject1);
        localObject5 = (a)r.get(locall);
        localObject2 = localObject5;
        int k;
        if (localObject5 == null)
        {
          localObject2 = new q2/c$a;
          k = k;
          q.c.getClass();
          ((a)localObject2).<init>(k, System.currentTimeMillis());
          r.put(locall, localObject2);
        }
        long l1 = b;
        long l2 = Math.max(k - a - 5, 0);
        l1 = Math.max(((s)localObject1).a(), l2 * 30000L + l1);
        q.c.getClass();
        l2 = System.currentTimeMillis();
        if (b == o.b.a) {
          if (l2 < l1)
          {
            localObject2 = c;
            if (localObject2 != null)
            {
              localObject5 = (Runnable)d.remove(a);
              if (localObject5 != null) {
                b.b((Runnable)localObject5);
              }
              localObject5 = new a((b)localObject2, (s)localObject1);
              d.put(a, localObject5);
              l2 = c.a();
              b.a((Runnable)localObject5, l1 - l2);
            }
          }
          else if (((s)localObject1).b())
          {
            k = Build.VERSION.SDK_INT;
            localObject2 = j;
            if (c)
            {
              localObject5 = j.d();
              ??? = w;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Ignoring ");
              ((StringBuilder)localObject2).append(localObject1);
              localObject1 = ". Requires device idle.";
            }
            else
            {
              if ((k < 24) || (!((o2.c)localObject2).a())) {
                break label551;
              }
              localObject5 = j.d();
              ??? = w;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Ignoring ");
              ((StringBuilder)localObject2).append(localObject1);
              localObject1 = ". Requires ContentUri triggers.";
            }
            ((StringBuilder)localObject2).append((String)localObject1);
            ((j)localObject5).a((String)???, ((StringBuilder)localObject2).toString());
            break label671;
            label551:
            localHashSet1.add(localObject1);
            localHashSet2.add(a);
          }
          else if (!f.a(a0.s((s)localObject1)))
          {
            localObject5 = j.d();
            ??? = w;
            localObject2 = f.l("Starting work for ");
            ((StringBuilder)localObject2).append(a);
            ((j)localObject5).a((String)???, ((StringBuilder)localObject2).toString());
            localObject2 = f;
            localObject2.getClass();
            localObject2 = ((l.l)localObject2).h(a0.s((s)localObject1));
            v.b((x)localObject2);
            p.b((x)localObject2);
          }
        }
        label671:
        j++;
      }
    }
    synchronized (e)
    {
      if (!localHashSet1.isEmpty())
      {
        localObject2 = TextUtils.join(",", localHashSet2);
        ??? = j.d();
        localObject5 = w;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Starting tracking for ");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((j)???).a((String)localObject5, ((StringBuilder)localObject1).toString());
        localObject5 = localHashSet1.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          ??? = (s)((Iterator)localObject5).next();
          localObject2 = a0.s((s)???);
          if (!b.containsKey(localObject2))
          {
            ??? = h.a(t, (s)???, u.a(), this);
            b.put(localObject2, ???);
          }
        }
      }
      return;
    }
  }
  
  public static final class a
  {
    public final int a;
    public final long b;
    
    public a(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     q2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */