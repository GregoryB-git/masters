package androidx.recyclerview.widget;

import a0.j;
import android.util.SparseArray;
import android.view.View;
import d0.c;
import e0.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import r.e;
import r.h;

public final class RecyclerView$p
{
  public final ArrayList<RecyclerView.v> a;
  public ArrayList<RecyclerView.v> b;
  public final ArrayList<RecyclerView.v> c;
  public final List<RecyclerView.v> d;
  public int e;
  public int f;
  public RecyclerView.o g;
  
  public RecyclerView$p(RecyclerView paramRecyclerView)
  {
    paramRecyclerView = new ArrayList();
    a = paramRecyclerView;
    b = null;
    c = new ArrayList();
    d = Collections.unmodifiableList(paramRecyclerView);
    e = 2;
    f = 2;
  }
  
  public static void d(RecyclerView.v paramv)
  {
    if (!paramv.f()) {
      throw null;
    }
    paramv = new java/lang/IllegalArgumentException;
    throw null;
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < h.i0.a()))
    {
      localObject = h;
      if (!i0.d) {
        return paramInt;
      }
      return c.a(paramInt, 0);
    }
    Object localObject = j.n("invalid position ", paramInt, ". State item count is ");
    ((StringBuilder)localObject).append(h.i0.a());
    ((StringBuilder)localObject).append(h.l());
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public final void b()
  {
    int i = c.size();
    for (;;)
    {
      i--;
      if (i < 0) {
        break;
      }
      c(i);
    }
    c.clear();
    Object localObject = RecyclerView.s0;
    localObject = h.h0;
    localObject.getClass();
    c = 0;
  }
  
  public final void c(int paramInt)
  {
    RecyclerView.v localv = (RecyclerView.v)c.get(paramInt);
    Object localObject1 = RecyclerView.s0;
    localv.getClass();
    localObject1 = h.l0;
    if (localObject1 != null)
    {
      localObject1 = e;
      if ((localObject1 instanceof m.a)) {
        localObject1 = (e0.a)e.remove(null);
      } else {
        localObject1 = null;
      }
      d0.h(null, (e0.a)localObject1);
    }
    localObject1 = h.r;
    if (localObject1 != null) {
      ((RecyclerView.q)localObject1).a();
    }
    int i = h.s.size();
    for (int j = 0; j < i; j++) {
      ((RecyclerView.q)h.s.get(j)).a();
    }
    h.getClass();
    localObject1 = h;
    if (i0 != null)
    {
      localObject1 = e;
      localObject2 = b;
      if (a) {
        ((e)localObject2).c();
      }
      for (j = d - 1; j >= 0; j--)
      {
        localObject2 = b;
        if (a) {
          ((e)localObject2).c();
        }
        if (localv == c[j])
        {
          e locale = b;
          localObject3 = c;
          localObject2 = localObject3[j];
          Object localObject4 = e.e;
          if (localObject2 == localObject4) {
            break;
          }
          localObject3[j] = localObject4;
          a = true;
          break;
        }
      }
      localObject1 = (q.a)a.remove(localv);
      if (localObject1 != null) {
        q.a.a.c(localObject1);
      }
    }
    l = null;
    if (g == null) {
      g = new RecyclerView.o();
    }
    Object localObject3 = g;
    localObject3.getClass();
    Object localObject2 = (RecyclerView.o.a)a.get(0);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new RecyclerView.o.a();
      a.put(0, localObject1);
    }
    localObject1 = a;
    if (a.get(0)).b > ((ArrayList)localObject1).size())
    {
      f = 0;
      a = -1;
      b = -1;
      c = -1L;
      d = -1;
      i = 0;
      e = null;
      localObject2 = g;
      if (localObject2 != null) {
        ((ArrayList)localObject2).clear();
      }
      f &= 0xFBFF;
      localv.getClass();
      localv.getClass();
      localObject2 = RecyclerView.s0;
      ((ArrayList)localObject1).add(localv);
    }
    c.remove(paramInt);
  }
  
  public final void e(int paramInt, long paramLong)
  {
    if ((paramInt >= 0) && (paramInt < h.i0.a()))
    {
      boolean bool = h.i0.d;
      int i = 0;
      int j = 0;
      int k;
      if (bool)
      {
        localObject1 = b;
        if (localObject1 != null)
        {
          k = ((ArrayList)localObject1).size();
          if (k != 0)
          {
            for (m = 0; m < k; m++)
            {
              localObject1 = (RecyclerView.v)b.get(m);
              if ((f & 0x20) != 0) {
                n = 1;
              } else {
                n = 0;
              }
              if ((n == 0) && (((RecyclerView.v)localObject1).c() == paramInt))
              {
                ((RecyclerView.v)localObject1).b(32);
                break label154;
              }
            }
            h.getClass();
            throw null;
          }
        }
        localObject1 = null;
        label154:
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          m = 1;
          break label179;
        }
      }
      else
      {
        localObject2 = null;
      }
      int m = 0;
      localObject1 = localObject2;
      label179:
      int n = m;
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        int i1 = a.size();
        for (n = 0; n < i1; n++)
        {
          localObject1 = (RecyclerView.v)a.get(n);
          if ((f & 0x20) != 0) {
            k = 1;
          } else {
            k = 0;
          }
          if ((k == 0) && (((RecyclerView.v)localObject1).c() == paramInt) && (!((RecyclerView.v)localObject1).d()) && ((h.i0.d) || (!((RecyclerView.v)localObject1).e())))
          {
            ((RecyclerView.v)localObject1).b(32);
            break label388;
          }
        }
        localObject1 = h.d;
        if (c.size() <= 0)
        {
          k = c.size();
          for (n = 0; n < k; n++)
          {
            localObject1 = (RecyclerView.v)c.get(n);
            if ((!((RecyclerView.v)localObject1).d()) && (((RecyclerView.v)localObject1).c() == paramInt)) {
              throw null;
            }
          }
          localObject1 = null;
          label388:
          n = m;
          localObject2 = localObject1;
          if (localObject1 != null) {
            if (((RecyclerView.v)localObject1).e())
            {
              if (!h.i0.d)
              {
                ((RecyclerView.v)localObject1).b(4);
                if (!((RecyclerView.v)localObject1).f())
                {
                  m = f;
                  paramInt = j;
                  if ((m & 0x20) != 0) {
                    paramInt = 1;
                  }
                  if (paramInt != 0) {
                    f = (m & 0xFFFFFFDF);
                  }
                }
                else
                {
                  h.removeDetachedView(null, false);
                  j.f((RecyclerView.v)localObject1);
                }
                d((RecyclerView.v)localObject1);
                throw null;
              }
              n = 1;
              localObject2 = localObject1;
            }
            else
            {
              if (a >= 0)
              {
                h.getClass();
                throw null;
              }
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Inconsistency detected. Invalid view holder adapter position");
              ((StringBuilder)localObject2).append(localObject1);
              ((StringBuilder)localObject2).append(h.l());
              throw new IndexOutOfBoundsException(((StringBuilder)localObject2).toString());
            }
          }
        }
        else
        {
          localObject2 = (View)c.get(0);
          ((k)a).getClass();
          RecyclerView.p((View)localObject2);
          throw null;
        }
      }
      if (localObject2 == null)
      {
        m = h.c.a(paramInt, 0);
        if (m >= 0)
        {
          h.getClass();
          throw null;
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Inconsistency detected. Invalid item position ");
        ((StringBuilder)localObject1).append(paramInt);
        ((StringBuilder)localObject1).append("(offset:");
        ((StringBuilder)localObject1).append(m);
        ((StringBuilder)localObject1).append(").state:");
        ((StringBuilder)localObject1).append(h.i0.a());
        ((StringBuilder)localObject1).append(h.l());
        throw new IndexOutOfBoundsException(((StringBuilder)localObject1).toString());
      }
      if (n != 0)
      {
        localObject1 = h.i0;
        if (!d)
        {
          n = f;
          if ((0x2000 & n) != 0) {
            m = 1;
          } else {
            m = 0;
          }
          if (m != 0)
          {
            m = n & 0xDFFF | 0x0;
            f = m;
            if (e)
            {
              if ((!((RecyclerView.v)localObject2).d()) && ((m & 0xE & 0x4) == 0))
              {
                localObject1 = l;
                if (localObject1 != null) {
                  ((RecyclerView)localObject1).o((RecyclerView.v)localObject2);
                }
              }
              localObject1 = h.O;
              if ((f & 0x400) == 0)
              {
                localObject2 = g;
                if ((localObject2 != null) && (((ArrayList)localObject2).size() != 0)) {}
              }
              else
              {
                localObject2 = RecyclerView.v.m;
              }
              localObject1.getClass();
              throw null;
            }
          }
        }
      }
      if (h.i0.d)
      {
        if ((f & 0x1) != 0) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0)
        {
          d = paramInt;
          break label1147;
        }
      }
      n = f;
      if ((n & 0x1) != 0) {
        m = 1;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        if ((n & 0x2) != 0) {
          m = 1;
        } else {
          m = 0;
        }
        if ((m == 0) && (!((RecyclerView.v)localObject2).d())) {}
      }
      else
      {
        h.c.a(paramInt, 0);
        localObject1 = h;
        l = ((RecyclerView)localObject1);
        long l1 = ((RecyclerView)localObject1).getNanoTime();
        if (paramLong == Long.MAX_VALUE) {
          break label1149;
        }
        RecyclerView.o localo = g;
        localObject2 = (RecyclerView.o.a)a.get(0);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new RecyclerView.o.a();
          a.put(0, localObject1);
        }
        long l2 = c;
        if (l2 != 0L)
        {
          paramInt = i;
          if (l1 + l2 >= paramLong) {}
        }
        else
        {
          paramInt = 1;
        }
        if (paramInt != 0) {
          break label1149;
        }
      }
      label1147:
      throw null;
      label1149:
      h.getClass();
      throw null;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Invalid item position ");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append("(");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append("). Item count:");
    ((StringBuilder)localObject1).append(h.i0.a());
    ((StringBuilder)localObject1).append(h.l());
    throw new IndexOutOfBoundsException(((StringBuilder)localObject1).toString());
  }
  
  public final void f(RecyclerView.v paramv)
  {
    ArrayList localArrayList;
    if (k) {
      localArrayList = b;
    } else {
      localArrayList = a;
    }
    localArrayList.remove(paramv);
    j = null;
    k = false;
    f &= 0xFFFFFFDF;
  }
  
  public final void g()
  {
    RecyclerView.j localj = h.q;
    f = (e + 0);
    int i = c.size();
    for (;;)
    {
      i--;
      if ((i < 0) || (c.size() <= f)) {
        break;
      }
      c(i);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */