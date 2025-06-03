package m4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c4.a;
import c4.e;
import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v3.a1;
import v5.e0;
import v5.m;
import v5.u;
import x6.b;

public final class c0
  implements h
{
  public final int a;
  public final List<v5.c0> b;
  public final u c;
  public final SparseIntArray d;
  public final d0.c e;
  public final SparseArray<d0> f;
  public final SparseBooleanArray g;
  public final SparseBooleanArray h;
  public final b0 i;
  public a0 j;
  public j k;
  public int l;
  public boolean m;
  public boolean n;
  public boolean o;
  public d0 p;
  public int q;
  public int r;
  
  public c0(int paramInt, v5.c0 paramc0, g paramg)
  {
    e = paramg;
    a = paramInt;
    if ((paramInt != 1) && (paramInt != 2))
    {
      paramg = new ArrayList();
      b = paramg;
      paramg.add(paramc0);
    }
    else
    {
      b = Collections.singletonList(paramc0);
    }
    c = new u(new byte['Ⓒ'], 0);
    paramg = new SparseBooleanArray();
    g = paramg;
    h = new SparseBooleanArray();
    paramc0 = new SparseArray();
    f = paramc0;
    d = new SparseIntArray();
    i = new b0();
    k = j.i;
    r = -1;
    paramg.clear();
    paramc0.clear();
    paramc0 = new SparseArray();
    int i1 = paramc0.size();
    for (paramInt = 0; paramInt < i1; paramInt++) {
      f.put(paramc0.keyAt(paramInt), (d0)paramc0.valueAt(paramInt));
    }
    f.put(0, new y(new a()));
    p = null;
  }
  
  public final void b(j paramj)
  {
    k = paramj;
  }
  
  public final int d(i parami, s params)
  {
    long l1 = parami.getLength();
    boolean bool = m;
    int i1 = 0;
    int i3;
    if (bool)
    {
      if ((l1 != -1L) && (a != 2)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      long l2 = -9223372036854775807L;
      if (i2 != 0)
      {
        localObject = i;
        if (!d)
        {
          i3 = r;
          if (i3 <= 0)
          {
            ((b0)localObject).a(parami);
            i2 = i1;
          }
          else
          {
            if (!f)
            {
              l1 = parami.getLength();
              i2 = (int)Math.min(a, l1);
              l1 -= i2;
              if (parami.getPosition() != l1)
              {
                a = l1;
              }
              else
              {
                c.D(i2);
                parami.i();
                parami.m(c.a, 0, i2);
                parami = c;
                int i4 = b;
                i5 = c;
                for (i6 = i5 - 188;; i6--)
                {
                  l1 = l2;
                  if (i6 < i4) {
                    break;
                  }
                  params = a;
                  i7 = -4;
                  i2 = 0;
                  while (i7 <= 4)
                  {
                    i8 = i7 * 188 + i6;
                    if ((i8 >= i4) && (i8 < i5) && (params[i8] == 71))
                    {
                      i8 = i2 + 1;
                      i2 = i8;
                      if (i8 == 5)
                      {
                        i2 = 1;
                        break label305;
                      }
                    }
                    else
                    {
                      i2 = 0;
                    }
                    i7++;
                  }
                  i2 = 0;
                  label305:
                  if (i2 != 0)
                  {
                    l1 = b.a0.A(i6, i3, parami);
                    if (l1 != -9223372036854775807L) {
                      break;
                    }
                  }
                }
                h = l1;
                f = true;
                i2 = i1;
                break label662;
              }
            }
            else
            {
              if (h == -9223372036854775807L) {
                break label652;
              }
              if (e) {
                break label549;
              }
              i2 = (int)Math.min(a, parami.getLength());
              long l3 = parami.getPosition();
              l1 = 0;
              if (l3 == l1) {
                break label428;
              }
              a = l1;
            }
            i2 = 1;
            break label662;
            label428:
            c.D(i2);
            parami.i();
            parami.m(c.a, 0, i2);
            parami = c;
            i2 = b;
            i6 = c;
            for (;;)
            {
              l1 = l2;
              if (i2 >= i6) {
                break;
              }
              if (a[i2] == 71)
              {
                l1 = b.a0.A(i2, i3, parami);
                if (l1 != -9223372036854775807L) {
                  break;
                }
              }
              i2++;
            }
            g = l1;
            e = true;
            i2 = i1;
            break label662;
            label549:
            l2 = g;
            if (l2 != -9223372036854775807L)
            {
              l2 = b.b(l2);
              l2 = b.b(h) - l2;
              i = l2;
              if (l2 < 0L)
              {
                params = f.l("Invalid duration: ");
                params.append(i);
                params.append(". Using TIME_UNSET instead.");
                m.f("TsDurationReader", params.toString());
                i = -9223372036854775807L;
              }
            }
            label652:
            ((b0)localObject).a(parami);
            i2 = i1;
          }
          label662:
          return i2;
        }
      }
      if (!n)
      {
        n = true;
        localObject = i;
        l2 = i;
        j localj;
        if (l2 != -9223372036854775807L)
        {
          localObject = new a0(b, l2, l1, r, 112800);
          j = ((a0)localObject);
          localj = k;
          localObject = a;
        }
        else
        {
          localj = k;
          localObject = new t.b(l2);
        }
        localj.t((c4.t)localObject);
      }
      if (o)
      {
        o = false;
        f(0L, 0L);
        if (parami.getPosition() != 0L)
        {
          a = 0L;
          return 1;
        }
      }
      localObject = j;
      if (localObject != null)
      {
        if (c != null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0) {
          return ((a)localObject).a(parami, params);
        }
      }
    }
    Object localObject = c;
    params = a;
    int i2 = b;
    if (9400 - i2 < 188)
    {
      i6 = c - i2;
      if (i6 > 0) {
        System.arraycopy(params, i2, params, 0, i6);
      }
      c.E(params, i6);
    }
    for (;;)
    {
      localObject = c;
      i2 = c;
      if (i2 - b >= 188) {
        break;
      }
      i6 = parami.read(params, i2, 9400 - i2);
      if (i6 == -1)
      {
        i2 = 0;
        break label987;
      }
      c.F(i2 + i6);
    }
    i2 = 1;
    label987:
    if (i2 == 0) {
      return -1;
    }
    parami = c;
    int i6 = b;
    int i7 = c;
    parami = a;
    for (i2 = i6; (i2 < i7) && (parami[i2] != 71); i2++) {}
    c.G(i2);
    i1 = i2 + 188;
    parami = null;
    if (i1 > i7)
    {
      i2 = i2 - i6 + q;
      q = i2;
      if ((a == 2) && (i2 > 376)) {
        throw a1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
      }
    }
    else
    {
      q = 0;
    }
    params = c;
    int i8 = c;
    if (i1 > i8) {
      return 0;
    }
    int i5 = params.f();
    if ((0x800000 & i5) == 0)
    {
      if ((0x400000 & i5) != 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      i7 = i2 | 0x0;
      i3 = (0x1FFF00 & i5) >> 8;
      if ((i5 & 0x20) != 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i5 & 0x10) != 0) {
        i6 = 1;
      } else {
        i6 = 0;
      }
      if (i6 != 0) {
        parami = (d0)f.get(i3);
      }
      if (parami != null)
      {
        if (a != 2)
        {
          i6 = i5 & 0xF;
          i5 = d.get(i3, i6 - 1);
          d.put(i3, i6);
          if (i5 == i6) {
            break label1489;
          }
          if (i6 != (i5 + 1 & 0xF)) {
            parami.b();
          }
        }
        i6 = i7;
        if (i2 != 0)
        {
          i5 = c.v();
          if ((c.v() & 0x40) != 0) {
            i2 = 2;
          } else {
            i2 = 0;
          }
          i6 = i7 | i2;
          c.H(i5 - 1);
        }
        bool = m;
        if ((a != 2) && (!bool) && (h.get(i3, false))) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        if (i2 != 0)
        {
          c.F(i1);
          parami.a(i6, c);
          c.F(i8);
        }
        if ((a != 2) && (!bool) && (m) && (l1 != -1L)) {
          o = true;
        }
      }
    }
    label1489:
    c.G(i1);
    return 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (a != 2) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    int i1 = b.size();
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1) {}
      int i4;
      a0 locala0;
      synchronized ((v5.c0)b.get(i2))
      {
        paramLong1 = b;
        int i3;
        if (paramLong1 == -9223372036854775807L) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        i4 = i3;
        if (i3 == 0)
        {
          paramLong1 = ???.c();
          if ((paramLong1 != -9223372036854775807L) && (paramLong1 != 0L) && (paramLong1 != paramLong2)) {
            i4 = 1;
          } else {
            i4 = 0;
          }
        }
        if (i4 != 0) {
          ???.d(paramLong2);
        }
        i2++;
      }
    }
  }
  
  public final boolean i(i parami)
  {
    byte[] arrayOfByte = c.a;
    parami = (e)parami;
    parami.c(arrayOfByte, 0, 940, false);
    for (int i1 = 0; i1 < 188; i1++)
    {
      for (int i2 = 0; i2 < 5; i2++) {
        if (arrayOfByte[(i2 * 188 + i1)] != 71)
        {
          i2 = 0;
          break label72;
        }
      }
      i2 = 1;
      label72:
      if (i2 != 0)
      {
        parami.j(i1);
        return true;
      }
    }
    return false;
  }
  
  public final void release() {}
  
  public final class a
    implements x
  {
    public final v5.t a = new v5.t(new byte[4], 4);
    
    public a() {}
    
    public final void a(u paramu)
    {
      if (paramu.v() != 0) {
        return;
      }
      if ((paramu.v() & 0x80) == 0) {
        return;
      }
      paramu.H(6);
      int i = (c - b) / 4;
      for (int j = 0; j < i; j++)
      {
        Object localObject = a;
        paramu.d(a, 0, 4);
        ((v5.t)localObject).k(0);
        int k = a.g(16);
        a.m(3);
        if (k == 0)
        {
          a.m(13);
        }
        else
        {
          k = a.g(13);
          if (f.get(k) == null)
          {
            localObject = c0.this;
            f.put(k, new y(new c0.b((c0)localObject, k)));
            localObject = c0.this;
            l += 1;
          }
        }
      }
      paramu = c0.this;
      if (a != 2) {
        f.remove(0);
      }
    }
    
    public final void c(v5.c0 paramc0, j paramj, d0.d paramd) {}
  }
  
  public final class b
    implements x
  {
    public final v5.t a = new v5.t(new byte[5], 5);
    public final SparseArray<d0> b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    
    public b(int paramInt)
    {
      d = paramInt;
    }
    
    public final void a(u paramu)
    {
      if (paramu.v() != 2) {
        return;
      }
      Object localObject1 = c0.this;
      int i = a;
      v5.c0 localc0;
      if ((i != 1) && (i != 2) && (l != 1))
      {
        localc0 = new v5.c0(((v5.c0)b.get(0)).c());
        b.add(localc0);
      }
      else
      {
        localc0 = (v5.c0)b.get(0);
      }
      if ((paramu.v() & 0x80) == 0) {
        return;
      }
      paramu.H(1);
      int j = paramu.A();
      paramu.H(3);
      localObject1 = a;
      paramu.d(a, 0, 2);
      ((v5.t)localObject1).k(0);
      a.m(3);
      r = a.g(13);
      localObject1 = a;
      paramu.d(a, 0, 2);
      ((v5.t)localObject1).k(0);
      localObject1 = a;
      i = 4;
      ((v5.t)localObject1).m(4);
      paramu.H(a.g(12));
      localObject1 = c0.this;
      int k = a;
      int m = 21;
      Object localObject2;
      if ((k == 2) && (p == null))
      {
        localObject1 = new d0.b(21, null, null, e0.f);
        localObject2 = c0.this;
        p = e.a(21, (d0.b)localObject1);
        localObject1 = c0.this;
        localObject2 = p;
        if (localObject2 != null) {
          ((d0)localObject2).c(localc0, k, new d0.d(j, 21, 8192));
        }
      }
      b.clear();
      c.clear();
      int n = c - b;
      while (n > 0)
      {
        localObject1 = a;
        paramu.d(a, 0, 5);
        ((v5.t)localObject1).k(0);
        int i1 = a.g(8);
        a.m(3);
        int i2 = a.g(13);
        a.m(i);
        int i3 = a.g(12);
        int i4 = b;
        int i5 = i3 + i4;
        int i6 = -1;
        localObject1 = null;
        localObject2 = null;
        k = m;
        m = i;
        i = i6;
        while (b < i5)
        {
          int i7 = paramu.v();
          m = paramu.v();
          i6 = b + m;
          if (i6 > i5)
          {
            m = 4;
            break;
          }
          m = 172;
          if (i7 == 5)
          {
            long l = paramu.w();
            if (l != 1094921523L)
            {
              if (l == 1161904947L) {
                break label587;
              }
              if (l == 1094921524L) {
                break label610;
              }
              if (l != 1212503619L) {
                break label616;
              }
              i = 36;
              break label616;
            }
          }
          else
          {
            if (i7 != 106) {
              break label580;
            }
          }
          label580:
          label587:
          label610:
          for (i = 129;; i = m)
          {
            break;
            if (i7 == 122)
            {
              i = 135;
              break;
            }
            if (i7 != 127) {
              break label619;
            }
            if (paramu.v() != k) {
              break;
            }
          }
          for (;;)
          {
            label616:
            break;
            label619:
            if (i7 == 123)
            {
              i = 138;
            }
            else
            {
              if (i7 != 10) {
                break label659;
              }
              localObject1 = paramu.s(3).trim();
            }
          }
          Object localObject3 = localObject1;
          Object localObject4 = localObject2;
          break label766;
          label659:
          if (i7 == 89)
          {
            localObject4 = new ArrayList();
            while (b < i6)
            {
              localObject2 = paramu.s(3).trim();
              paramu.v();
              localObject3 = new byte[4];
              paramu.d((byte[])localObject3, 0, 4);
              ((ArrayList)localObject4).add(new d0.a((String)localObject2, (byte[])localObject3));
            }
            i = 89;
            localObject3 = localObject1;
          }
          else
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (i7 == 111)
            {
              i = 257;
              localObject4 = localObject2;
              localObject3 = localObject1;
            }
          }
          label766:
          paramu.H(i6 - b);
          m = 4;
          k = 21;
          localObject1 = localObject3;
          localObject2 = localObject4;
        }
        paramu.G(i5);
        localObject1 = new d0.b(i, (String)localObject1, (ArrayList)localObject2, Arrays.copyOfRange(a, i4, i5));
        if (i1 != 6)
        {
          k = i1;
          if (i1 != 5) {}
        }
        else
        {
          k = i;
        }
        n -= i3 + 5;
        localObject2 = c0.this;
        if (a == 2) {
          i = k;
        } else {
          i = i2;
        }
        if (!g.get(i))
        {
          localObject2 = c0.this;
          if ((a == 2) && (k == 21)) {
            localObject1 = p;
          } else {
            localObject1 = e.a(k, (d0.b)localObject1);
          }
          if ((a != 2) || (i2 < c.get(i, 8192)))
          {
            c.put(i, i2);
            b.put(i, localObject1);
          }
        }
        i = m;
        m = 21;
      }
      m = c.size();
      for (i = 0; i < m; i++)
      {
        n = c.keyAt(i);
        k = c.valueAt(i);
        g.put(n, true);
        h.put(k, true);
        localObject1 = (d0)b.valueAt(i);
        if (localObject1 != null)
        {
          paramu = c0.this;
          if (localObject1 != p) {
            ((d0)localObject1).c(localc0, k, new d0.d(j, n, 8192));
          }
          f.put(k, localObject1);
        }
      }
      paramu = c0.this;
      if (a == 2)
      {
        if (m) {
          return;
        }
        k.m();
        paramu = c0.this;
        l = 0;
      }
      else
      {
        f.remove(d);
        paramu = c0.this;
        if (a == 1) {
          i = 0;
        } else {
          i = l - 1;
        }
        l = i;
        if (i != 0) {
          return;
        }
        k.m();
        paramu = c0.this;
      }
      m = true;
    }
    
    public final void c(v5.c0 paramc0, j paramj, d0.d paramd) {}
  }
}

/* Location:
 * Qualified Name:     m4.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */