package l1;

import F0.M.b;
import F0.e;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c1.t.a;
import c1.v;
import d0.A;
import g0.a;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class J
  implements r
{
  public static final x v = new I();
  public final int a;
  public final int b;
  public final int c;
  public final List d;
  public final z e;
  public final SparseIntArray f;
  public final K.c g;
  public final t.a h;
  public final SparseArray i;
  public final SparseBooleanArray j;
  public final SparseBooleanArray k;
  public final H l;
  public G m;
  public t n;
  public int o;
  public boolean p;
  public boolean q;
  public boolean r;
  public K s;
  public int t;
  public int u;
  
  public J(int paramInt1, int paramInt2, t.a parama, g0.E paramE, K.c paramc, int paramInt3)
  {
    g = ((K.c)a.e(paramc));
    c = paramInt3;
    a = paramInt1;
    b = paramInt2;
    h = parama;
    if ((paramInt1 != 1) && (paramInt1 != 2))
    {
      parama = new ArrayList();
      d = parama;
      parama.add(paramE);
    }
    else
    {
      d = Collections.singletonList(paramE);
    }
    e = new z(new byte['Ⓒ'], 0);
    j = new SparseBooleanArray();
    k = new SparseBooleanArray();
    i = new SparseArray();
    f = new SparseIntArray();
    l = new H(paramInt3);
    n = t.a;
    u = -1;
    A();
  }
  
  public J(int paramInt, t.a parama)
  {
    this(1, paramInt, parama, new g0.E(0L), new j(0), 112800);
  }
  
  private void z(long paramLong)
  {
    if (!q)
    {
      q = true;
      t localt;
      if (l.b() != -9223372036854775807L)
      {
        localObject = new G(l.c(), l.b(), paramLong, u, c);
        m = ((G)localObject);
        localt = n;
      }
      for (Object localObject = ((e)localObject).b();; localObject = new M.b(l.b()))
      {
        localt.e((F0.M)localObject);
        break;
        localt = n;
      }
    }
  }
  
  public final void A()
  {
    j.clear();
    i.clear();
    SparseArray localSparseArray = g.a();
    int i1 = localSparseArray.size();
    for (int i2 = 0; i2 < i1; i2++) {
      i.put(localSparseArray.keyAt(i2), (K)localSparseArray.valueAt(i2));
    }
    i.put(0, new E(new a()));
    s = null;
  }
  
  public final boolean B(int paramInt)
  {
    boolean bool;
    if ((a != 2) && (!p))
    {
      SparseBooleanArray localSparseBooleanArray = k;
      bool = false;
      if (localSparseBooleanArray.get(paramInt, false)) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (a != 2) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    int i1 = d.size();
    Object localObject;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject = (g0.E)d.get(i2);
      int i3;
      if (((g0.E)localObject).f() == -9223372036854775807L) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (i3 == 0)
      {
        paramLong1 = ((g0.E)localObject).d();
        if ((paramLong1 == -9223372036854775807L) || (paramLong1 == 0L) || (paramLong1 == paramLong2)) {
          continue;
        }
      }
      else
      {
        if (i3 == 0) {
          continue;
        }
      }
      ((g0.E)localObject).i(paramLong2);
    }
    if (paramLong2 != 0L)
    {
      localObject = m;
      if (localObject != null) {
        ((e)localObject).h(paramLong2);
      }
    }
    e.P(0);
    f.clear();
    for (i2 = 0; i2 < i.size(); i2++) {
      ((K)i.valueAt(i2)).b();
    }
    t = 0;
  }
  
  public void b(t paramt)
  {
    Object localObject = paramt;
    if ((b & 0x1) == 0) {
      localObject = new v(paramt, h);
    }
    n = ((t)localObject);
  }
  
  public boolean e(s params)
  {
    byte[] arrayOfByte = e.e();
    params.n(arrayOfByte, 0, 940);
    int i1 = 0;
    if (i1 < 188)
    {
      for (int i2 = 0;; i2++)
      {
        if (i2 >= 5) {
          break label64;
        }
        if (arrayOfByte[(i2 * 188 + i1)] != 71)
        {
          i1++;
          break;
        }
      }
      label64:
      params.i(i1);
      return true;
    }
    return false;
  }
  
  public int i(s params, F0.L paramL)
  {
    long l1 = params.a();
    int i1 = a;
    int i2 = 0;
    boolean bool;
    if (i1 == 2) {
      bool = true;
    } else {
      bool = false;
    }
    if (p)
    {
      if ((l1 != -1L) && (!bool) && (!l.d())) {
        return l.e(params, paramL, u);
      }
      z(l1);
      if (r)
      {
        r = false;
        a(0L, 0L);
        if (params.p() != 0L)
        {
          a = 0L;
          return 1;
        }
      }
      G localG = m;
      if ((localG != null) && (localG.d())) {
        return m.c(params, paramL);
      }
    }
    if (!w(params))
    {
      while (i2 < i.size())
      {
        params = (K)i.valueAt(i2);
        if ((params instanceof y))
        {
          params = (y)params;
          if (params.d(bool)) {
            params.a(new z(), 1);
          }
        }
        i2++;
      }
      return -1;
    }
    int i3 = x();
    int i4 = e.g();
    if (i3 > i4) {
      return 0;
    }
    int i5 = e.p();
    if ((0x800000 & i5) != 0) {}
    for (;;)
    {
      e.T(i3);
      return 0;
      if ((0x400000 & i5) != 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i6 = (0x1FFF00 & i5) >> 8;
      if ((i5 & 0x20) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i5 & 0x10) != 0) {
        params = (K)i.get(i6);
      } else {
        params = null;
      }
      if (params != null)
      {
        int i7;
        if (a != 2)
        {
          i7 = i5 & 0xF;
          i5 = f.get(i6, i7 - 1);
          f.put(i6, i7);
          if (i5 == i7) {
            continue;
          }
          if (i7 != (i5 + 1 & 0xF)) {
            params.b();
          }
        }
        i5 = i2;
        if (i1 != 0)
        {
          i7 = e.G();
          if ((e.G() & 0x40) != 0) {
            i1 = 2;
          } else {
            i1 = 0;
          }
          i5 = i2 | i1;
          e.U(i7 - 1);
        }
        bool = p;
        if (B(i6))
        {
          e.S(i3);
          params.a(e, i5);
          e.S(i4);
        }
        if ((a != 2) && (!bool) && (p) && (l1 != -1L)) {
          r = true;
        }
      }
    }
  }
  
  public void release() {}
  
  public final boolean w(s params)
  {
    byte[] arrayOfByte = e.e();
    int i1;
    if (9400 - e.f() < 188)
    {
      i1 = e.a();
      if (i1 > 0) {
        System.arraycopy(arrayOfByte, e.f(), arrayOfByte, 0, i1);
      }
      e.R(arrayOfByte, i1);
    }
    while (e.a() < 188)
    {
      int i2 = e.g();
      i1 = params.read(arrayOfByte, i2, 9400 - i2);
      if (i1 == -1) {
        return false;
      }
      e.S(i2 + i1);
    }
    return true;
  }
  
  public final int x()
  {
    int i1 = e.f();
    int i2 = e.g();
    int i3 = L.a(e.e(), i1, i2);
    e.T(i3);
    int i4 = i3 + 188;
    if (i4 > i2)
    {
      i2 = t + (i3 - i1);
      t = i2;
      if ((a == 2) && (i2 > 376)) {
        throw A.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
      }
    }
    else
    {
      t = 0;
    }
    return i4;
  }
  
  public class a
    implements D
  {
    public final g0.y a = new g0.y(new byte[4]);
    
    public a() {}
    
    public void a(z paramz)
    {
      if (paramz.G() != 0) {
        return;
      }
      if ((paramz.G() & 0x80) == 0) {
        return;
      }
      paramz.U(6);
      int i = paramz.a() / 4;
      for (int j = 0; j < i; j++)
      {
        paramz.k(a, 4);
        int k = a.h(16);
        a.r(3);
        if (k == 0)
        {
          a.r(13);
        }
        else
        {
          k = a.h(13);
          if (J.f(J.this).get(k) == null)
          {
            J.f(J.this).put(k, new E(new J.b(J.this, k)));
            J.m(J.this);
          }
        }
      }
      if (J.n(J.this) != 2) {
        J.f(J.this).remove(0);
      }
    }
    
    public void c(g0.E paramE, t paramt, K.d paramd) {}
  }
  
  public class b
    implements D
  {
    public final g0.y a = new g0.y(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    
    public b(int paramInt)
    {
      d = paramInt;
    }
    
    public void a(z paramz)
    {
      if (paramz.G() != 2) {
        return;
      }
      g0.E localE;
      if ((J.n(J.this) != 1) && (J.n(J.this) != 2) && (J.h(J.this) != 1))
      {
        localE = new g0.E(((g0.E)J.o(J.this).get(0)).d());
        J.o(J.this).add(localE);
      }
      else
      {
        localE = (g0.E)J.o(J.this).get(0);
      }
      if ((paramz.G() & 0x80) == 0) {
        return;
      }
      paramz.U(1);
      int i = paramz.M();
      paramz.U(3);
      paramz.k(a, 2);
      a.r(3);
      J.p(J.this, a.h(13));
      paramz.k(a, 2);
      a.r(4);
      paramz.U(a.h(12));
      Object localObject;
      if ((J.n(J.this) == 2) && (J.q(J.this) == null))
      {
        K.b localb = new K.b(21, null, 0, null, g0.M.f);
        localObject = J.this;
        J.r((J)localObject, J.s((J)localObject).b(21, localb));
        if (J.q(J.this) != null) {
          J.q(J.this).c(localE, J.t(J.this), new K.d(i, 21, 8192));
        }
      }
      b.clear();
      c.clear();
      int k;
      int m;
      for (int j = paramz.a(); j > 0; j = k)
      {
        paramz.k(a, 5);
        k = a.h(8);
        a.r(3);
        m = a.h(13);
        a.r(4);
        int n = a.h(12);
        localObject = b(paramz, n);
        if (k != 6)
        {
          i1 = k;
          if (k != 5) {}
        }
        else
        {
          i1 = a;
        }
        k = j - (n + 5);
        if (J.n(J.this) == 2) {
          j = i1;
        } else {
          j = m;
        }
        if (!J.u(J.this).get(j))
        {
          if ((J.n(J.this) == 2) && (i1 == 21)) {
            localObject = J.q(J.this);
          } else {
            localObject = J.s(J.this).b(i1, (K.b)localObject);
          }
          if ((J.n(J.this) != 2) || (m < c.get(j, 8192)))
          {
            c.put(j, m);
            b.put(j, localObject);
          }
        }
      }
      j = c.size();
      for (int i1 = 0; i1 < j; i1++)
      {
        m = c.keyAt(i1);
        k = c.valueAt(i1);
        J.u(J.this).put(m, true);
        J.v(J.this).put(k, true);
        paramz = (K)b.valueAt(i1);
        if (paramz != null)
        {
          if (paramz != J.q(J.this)) {
            paramz.c(localE, J.t(J.this), new K.d(i, m, 8192));
          }
          J.f(J.this).put(k, paramz);
        }
      }
      if (J.n(J.this) == 2)
      {
        if (!J.j(J.this))
        {
          J.t(J.this).j();
          J.l(J.this, 0);
        }
      }
      else {
        for (;;)
        {
          J.k(J.this, true);
          break;
          J.f(J.this).remove(d);
          paramz = J.this;
          if (J.n(paramz) == 1) {
            i1 = 0;
          } else {
            i1 = J.h(J.this) - 1;
          }
          J.l(paramz, i1);
          if (J.h(J.this) != 0) {
            break;
          }
          J.t(J.this).j();
        }
      }
    }
    
    public final K.b b(z paramz, int paramInt)
    {
      int i = paramz.f();
      int j = i + paramInt;
      paramInt = -1;
      Object localObject1 = null;
      Object localObject2 = localObject1;
      int k = 0;
      while (paramz.f() < j)
      {
        int m = paramz.G();
        int n = paramz.G();
        int i1 = paramz.f() + n;
        if (i1 > j) {
          break;
        }
        long l;
        if (m == 5)
        {
          l = paramz.I();
          if (l == 1094921523L) {
            break label172;
          }
          if (l == 1161904947L) {
            break label198;
          }
          if (l != 1094921524L) {}
        }
        Object localObject3;
        Object localObject4;
        label172:
        label198:
        do
        {
          paramInt = 172;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          break label476;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          if (l != 1212503619L) {
            break label476;
          }
          paramInt = 36;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          break label476;
          if (m == 106)
          {
            paramInt = 129;
            localObject3 = localObject1;
            n = k;
            localObject4 = localObject2;
            break label476;
          }
          if (m == 122)
          {
            paramInt = 135;
            localObject3 = localObject1;
            n = k;
            localObject4 = localObject2;
            break label476;
          }
          if (m != 127) {
            break;
          }
          m = paramz.G();
        } while (m == 21);
        if (m == 14)
        {
          paramInt = 136;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
        }
        else
        {
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          if (m == 33)
          {
            paramInt = 139;
            localObject3 = localObject1;
            n = k;
            localObject4 = localObject2;
            break label476;
            if (m == 123) {}
            for (paramInt = 138;; paramInt = 257)
            {
              localObject3 = localObject1;
              n = k;
              localObject4 = localObject2;
              break;
              if (m == 10)
              {
                localObject3 = paramz.D(3).trim();
                n = paramz.G();
                localObject4 = localObject2;
                break;
              }
              if (m == 89)
              {
                localObject4 = new ArrayList();
                while (paramz.f() < i1)
                {
                  localObject3 = paramz.D(3).trim();
                  paramInt = paramz.G();
                  localObject2 = new byte[4];
                  paramz.l((byte[])localObject2, 0, 4);
                  ((List)localObject4).add(new K.a((String)localObject3, paramInt, (byte[])localObject2));
                }
                paramInt = 89;
                localObject3 = localObject1;
                n = k;
                break;
              }
              localObject3 = localObject1;
              n = k;
              localObject4 = localObject2;
              if (m != 111) {
                break;
              }
            }
          }
        }
        label476:
        paramz.U(i1 - paramz.f());
        localObject1 = localObject3;
        k = n;
        localObject2 = localObject4;
      }
      paramz.T(j);
      return new K.b(paramInt, (String)localObject1, k, (List)localObject2, Arrays.copyOfRange(paramz.e(), i, j));
    }
    
    public void c(g0.E paramE, t paramt, K.d paramd) {}
  }
}

/* Location:
 * Qualified Name:     l1.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */