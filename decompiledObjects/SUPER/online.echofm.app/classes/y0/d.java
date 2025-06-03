package y0;

import F0.L;
import F0.T;
import F0.T.a;
import F0.n;
import F0.r;
import F0.s;
import F0.t;
import X0.e;
import android.util.SparseArray;
import c1.o;
import c1.t.a;
import c1.u;
import d0.i;
import d0.q;
import d0.q.b;
import java.util.List;
import java.util.Objects;
import l0.y1;

public final class d
  implements t, f
{
  public static final b x = new b();
  public static final L y = new L();
  public final r o;
  public final int p;
  public final q q;
  public final SparseArray r;
  public boolean s;
  public f.b t;
  public long u;
  public F0.M v;
  public q[] w;
  
  public d(r paramr, int paramInt, q paramq)
  {
    o = paramr;
    p = paramInt;
    q = paramq;
    r = new SparseArray();
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    a locala = (a)r.get(paramInt1);
    Object localObject = locala;
    if (locala == null)
    {
      boolean bool;
      if (w == null) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.f(bool);
      if (paramInt2 == p) {
        localObject = q;
      } else {
        localObject = null;
      }
      localObject = new a(paramInt1, paramInt2, (q)localObject);
      ((a)localObject).g(t, u);
      r.put(paramInt1, localObject);
    }
    return (T)localObject;
  }
  
  public void b(f.b paramb, long paramLong1, long paramLong2)
  {
    t = paramb;
    u = paramLong2;
    if (!s)
    {
      o.b(this);
      if (paramLong1 != -9223372036854775807L) {
        o.a(0L, paramLong1);
      }
      s = true;
    }
    else
    {
      r localr = o;
      long l = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        l = 0L;
      }
      localr.a(0L, l);
      for (int i = 0; i < r.size(); i++) {
        ((a)r.valueAt(i)).g(paramb, paramLong2);
      }
    }
  }
  
  public boolean c(s params)
  {
    int i = o.i(params, y);
    boolean bool1 = false;
    if (i != 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.f(bool2);
    boolean bool2 = bool1;
    if (i == 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public F0.h d()
  {
    Object localObject = v;
    if ((localObject instanceof F0.h)) {
      localObject = (F0.h)localObject;
    } else {
      localObject = null;
    }
    return (F0.h)localObject;
  }
  
  public void e(F0.M paramM)
  {
    v = paramM;
  }
  
  public q[] f()
  {
    return w;
  }
  
  public void j()
  {
    q[] arrayOfq = new q[r.size()];
    for (int i = 0; i < r.size(); i++) {
      arrayOfq[i] = ((q)g0.a.h(r.valueAt(i)).e));
    }
    w = arrayOfq;
  }
  
  public void release()
  {
    o.release();
  }
  
  public static final class a
    implements T
  {
    public final int a;
    public final int b;
    public final q c;
    public final n d;
    public q e;
    public T f;
    public long g;
    
    public a(int paramInt1, int paramInt2, q paramq)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramq;
      d = new n();
    }
    
    public void a(g0.z paramz, int paramInt1, int paramInt2)
    {
      ((T)g0.M.i(f)).e(paramz, paramInt1);
    }
    
    public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
    {
      long l = g;
      if ((l != -9223372036854775807L) && (paramLong >= l)) {
        f = d;
      }
      ((T)g0.M.i(f)).b(paramLong, paramInt1, paramInt2, paramInt3, parama);
    }
    
    public int c(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
    {
      return ((T)g0.M.i(f)).f(parami, paramInt1, paramBoolean);
    }
    
    public void d(q paramq)
    {
      q localq1 = c;
      q localq2 = paramq;
      if (localq1 != null) {
        localq2 = paramq.h(localq1);
      }
      e = localq2;
      ((T)g0.M.i(f)).d(e);
    }
    
    public void g(f.b paramb, long paramLong)
    {
      if (paramb == null)
      {
        f = d;
        return;
      }
      g = paramLong;
      T localT = paramb.a(a, b);
      f = localT;
      paramb = e;
      if (paramb != null) {
        localT.d(paramb);
      }
    }
  }
  
  public static final class b
    implements f.a
  {
    public t.a a = new c1.h();
    public boolean b;
    
    public q b(q paramq)
    {
      Object localObject = paramq;
      if (b)
      {
        localObject = paramq;
        if (a.a(paramq))
        {
          localObject = paramq.a().o0("application/x-media3-cues").S(a.c(paramq));
          StringBuilder localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append(n);
          if (j != null)
          {
            StringBuilder localStringBuilder2 = new StringBuilder();
            localStringBuilder2.append(" ");
            localStringBuilder2.append(j);
            paramq = localStringBuilder2.toString();
          }
          else
          {
            paramq = "";
          }
          localStringBuilder1.append(paramq);
          localObject = ((q.b)localObject).O(localStringBuilder1.toString()).s0(Long.MAX_VALUE).K();
        }
      }
      return (q)localObject;
    }
    
    public f c(int paramInt, q paramq, boolean paramBoolean, List paramList, T paramT, y1 paramy1)
    {
      paramy1 = m;
      if (d0.z.r(paramy1))
      {
        if (!b) {
          return null;
        }
        paramList = new o(a.b(paramq), paramq);
      }
      else
      {
        boolean bool = d0.z.q(paramy1);
        int i = 1;
        if (bool)
        {
          if (!b) {
            i = 3;
          }
          paramList = new e(a, i);
        }
        else if (Objects.equals(paramy1, "image/jpeg"))
        {
          paramList = new N0.a(1);
        }
        else if (Objects.equals(paramy1, "image/png"))
        {
          paramList = new b1.a();
        }
        else
        {
          if (paramBoolean) {
            i = 4;
          } else {
            i = 0;
          }
          int j = i;
          if (!b) {
            j = i | 0x20;
          }
          paramList = new Z0.h(a, j, null, null, paramList, paramT);
        }
      }
      paramT = paramList;
      if (b)
      {
        paramT = paramList;
        if (!d0.z.r(paramy1))
        {
          paramT = paramList;
          if (!(paramList.d() instanceof Z0.h))
          {
            paramT = paramList;
            if (!(paramList.d() instanceof e)) {
              paramT = new u(paramList, a);
            }
          }
        }
      }
      return new d(paramT, paramInt, paramq);
    }
    
    public b d(boolean paramBoolean)
    {
      b = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     y0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */