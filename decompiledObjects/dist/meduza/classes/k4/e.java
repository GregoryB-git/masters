package k4;

import a4.d.b;
import android.util.Pair;
import android.util.SparseArray;
import b.a0;
import c4.i;
import c4.p;
import c4.s;
import c4.t;
import c4.t.b;
import c4.v;
import c4.v.a;
import f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.c0;
import v5.e0;
import v5.q;
import v5.u;

public final class e
  implements c4.h
{
  public static final byte[] I = { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  public static final i0 J;
  public int A;
  public int B;
  public int C;
  public boolean D;
  public c4.j E;
  public v[] F;
  public v[] G;
  public boolean H;
  public final int a;
  public final j b;
  public final List<i0> c;
  public final SparseArray<b> d;
  public final u e;
  public final u f;
  public final u g;
  public final byte[] h;
  public final u i;
  public final c0 j;
  public final r4.c k;
  public final u l;
  public final ArrayDeque<a.a> m;
  public final ArrayDeque<a> n;
  public final v o;
  public int p;
  public int q;
  public long r;
  public int s;
  public u t;
  public long u;
  public int v;
  public long w;
  public long x;
  public long y;
  public b z;
  
  static
  {
    i0.a locala = new i0.a();
    k = "application/x-emsg";
    J = locala.a();
  }
  
  public e()
  {
    this(0, null, null, Collections.emptyList());
  }
  
  public e(int paramInt, c0 paramc0, j paramj, List<i0> paramList)
  {
    this(paramInt, paramc0, paramj, paramList, null);
  }
  
  public e(int paramInt, c0 paramc0, j paramj, List<i0> paramList, v paramv)
  {
    a = paramInt;
    j = paramc0;
    b = paramj;
    c = Collections.unmodifiableList(paramList);
    o = paramv;
    k = new r4.c();
    l = new u(16);
    e = new u(q.a);
    f = new u(5);
    g = new u();
    paramc0 = new byte[16];
    h = paramc0;
    i = new u(paramc0);
    m = new ArrayDeque();
    n = new ArrayDeque();
    d = new SparseArray();
    x = -9223372036854775807L;
    w = -9223372036854775807L;
    y = -9223372036854775807L;
    E = c4.j.i;
    F = new v[0];
    G = new v[0];
  }
  
  public static a4.d a(ArrayList paramArrayList)
  {
    int i1 = paramArrayList.size();
    Object localObject1 = null;
    Object localObject2 = null;
    int i2 = 0;
    while (i2 < i1)
    {
      Object localObject3 = (a.b)paramArrayList.get(i2);
      Object localObject4 = localObject2;
      if (a == 1886614376)
      {
        localObject4 = localObject2;
        if (localObject2 == null) {
          localObject4 = new ArrayList();
        }
        localObject3 = b.a;
        localObject2 = h.b((byte[])localObject3);
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = a;
        }
        if (localObject2 == null) {
          v5.m.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          ((ArrayList)localObject4).add(new d.b((UUID)localObject2, null, "video/mp4", (byte[])localObject3));
        }
      }
      i2++;
      localObject2 = localObject4;
    }
    if (localObject2 == null) {
      paramArrayList = (ArrayList)localObject1;
    } else {
      paramArrayList = new a4.d(null, false, (d.b[])((List)localObject2).toArray(new d.b[0]));
    }
    return paramArrayList;
  }
  
  public static void c(u paramu, int paramInt, l paraml)
  {
    paramu.G(paramInt + 8);
    paramInt = paramu.f() & 0xFFFFFF;
    if ((paramInt & 0x1) == 0)
    {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramInt = paramu.y();
      if (paramInt == 0)
      {
        Arrays.fill(l, 0, e, false);
        return;
      }
      if (paramInt == e)
      {
        Arrays.fill(l, 0, paramInt, bool);
        paramInt = c;
        int i1 = b;
        n.D(paramInt - i1);
        k = true;
        o = true;
        u localu = n;
        paramu.d(a, 0, c);
        n.G(0);
        o = false;
        return;
      }
      paramu = a0.j.n("Senc sample count ", paramInt, " is different from fragment sample count");
      paramu.append(e);
      throw a1.a(paramu.toString(), null);
    }
    throw a1.c("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  public final void b(c4.j paramj)
  {
    E = paramj;
    p = 0;
    s = 0;
    Object localObject = new v[2];
    F = ((v[])localObject);
    v localv = o;
    if (localv != null)
    {
      localObject[0] = localv;
      i1 = 1;
    }
    else
    {
      i1 = 0;
    }
    int i2 = a;
    int i3 = 100;
    int i4 = i1;
    if ((i2 & 0x4) != 0)
    {
      localObject[i1] = paramj.r(100, 5);
      i4 = i1 + 1;
      i3 = 101;
    }
    localObject = (v[])e0.K(i4, F);
    F = ((v[])localObject);
    i4 = localObject.length;
    for (int i1 = 0; i1 < i4; i1++) {
      localObject[i1].d(J);
    }
    G = new v[c.size()];
    i1 = 0;
    while (i1 < G.length)
    {
      localObject = E.r(i3, 3);
      ((v)localObject).d((i0)c.get(i1));
      G[i1] = localObject;
      i1++;
      i3++;
    }
    localObject = b;
    if (localObject != null)
    {
      paramj = new b(paramj.r(0, b), new m(b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0));
      d.put(0, paramj);
      E.m();
    }
  }
  
  public final int d(i parami, s params)
  {
    params = this;
    Object localObject1 = parami;
    label1074:
    label1728:
    label2685:
    label2752:
    label2993:
    label3698:
    for (;;)
    {
      int i1 = p;
      int i2 = 0;
      int i3 = 0;
      long l1;
      Object localObject3;
      long l3;
      if (i1 != 0)
      {
        Object localObject5;
        long l2;
        if (i1 != 1)
        {
          l1 = Long.MAX_VALUE;
          if (i1 != 2)
          {
            localObject2 = z;
            localObject3 = localObject2;
            Object localObject4;
            int i4;
            boolean bool;
            if (localObject2 == null)
            {
              localObject4 = d;
              i4 = ((SparseArray)localObject4).size();
              l1 = Long.MAX_VALUE;
              localObject3 = null;
              i1 = 0;
              while (i1 < i4)
              {
                localObject5 = (b)((SparseArray)localObject4).valueAt(i1);
                bool = l;
                if (!bool)
                {
                  localObject2 = localObject3;
                  l2 = l1;
                  if (f == d.b) {}
                }
                else if ((bool) && (h == b.d))
                {
                  localObject2 = localObject3;
                  l2 = l1;
                }
                else
                {
                  if (!bool) {
                    l3 = d.c[f];
                  } else {
                    l3 = b.f[h];
                  }
                  localObject2 = localObject3;
                  l2 = l1;
                  if (l3 < l1)
                  {
                    localObject2 = localObject5;
                    l2 = l3;
                  }
                }
                i1++;
                localObject3 = localObject2;
                l1 = l2;
              }
              if (localObject3 == null)
              {
                i1 = (int)(u - parami.getPosition());
                if (i1 >= 0)
                {
                  ((i)localObject1).j(i1);
                  p = 0;
                  s = 0;
                  i1 = i2;
                }
                else
                {
                  throw a1.a("Offset to end of mdat was negative.", null);
                }
              }
              else
              {
                if (!l) {
                  l3 = d.c[f];
                } else {
                  l3 = b.f[h];
                }
                i2 = (int)(l3 - parami.getPosition());
                i1 = i2;
                if (i2 < 0)
                {
                  v5.m.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                  i1 = 0;
                }
                ((i)localObject1).j(i1);
                z = ((b)localObject3);
              }
            }
            else
            {
              if (p == 3)
              {
                if (!l) {
                  i1 = d.d[f];
                } else {
                  i1 = b.h[f];
                }
                A = i1;
                if (f < i)
                {
                  ((i)localObject1).j(i1);
                  localObject5 = ((b)localObject3).a();
                  if (localObject5 != null)
                  {
                    localObject2 = b.n;
                    i1 = d;
                    if (i1 != 0) {
                      ((u)localObject2).H(i1);
                    }
                    localObject5 = b;
                    i2 = f;
                    i1 = i3;
                    if (k)
                    {
                      i1 = i3;
                      if (l[i2] != 0) {
                        i1 = 1;
                      }
                    }
                    if (i1 != 0) {
                      ((u)localObject2).H(((u)localObject2).A() * 6);
                    }
                  }
                  if (!((b)localObject3).b()) {
                    z = null;
                  }
                  p = 3;
                }
                else
                {
                  if (d.a.g == 1)
                  {
                    A = (i1 - 8);
                    ((i)localObject1).j(8);
                  }
                  if ("audio/ac4".equals(d.a.f.t))
                  {
                    B = ((b)localObject3).c(A, 7);
                    x3.c.a(A, i);
                    a.b(7, i);
                    i1 = B + 7;
                  }
                  else
                  {
                    i1 = ((b)localObject3).c(A, 0);
                  }
                  B = i1;
                  A += i1;
                  p = 4;
                  C = 0;
                }
              }
              else
              {
                localObject4 = d;
                localObject2 = a;
                localObject5 = a;
                if (!l)
                {
                  l3 = f[f];
                }
                else
                {
                  localObject4 = b;
                  i1 = f;
                  l3 = i[i1];
                }
                localObject4 = j;
                l1 = l3;
                if (localObject4 != null) {
                  l1 = ((c0)localObject4).a(l3);
                }
                i2 = j;
                if (i2 != 0)
                {
                  localObject4 = f.a;
                  localObject4[0] = ((byte)0);
                  localObject4[1] = ((byte)0);
                  localObject4[2] = ((byte)0);
                  i3 = 4 - i2;
                  while (B < A)
                  {
                    i1 = C;
                    Object localObject6;
                    if (i1 == 0)
                    {
                      ((i)localObject1).readFully((byte[])localObject4, i3, i2 + 1);
                      f.G(0);
                      i1 = f.f();
                      if (i1 >= 1)
                      {
                        C = (i1 - 1);
                        e.G(0);
                        ((v)localObject5).b(4, e);
                        ((v)localObject5).b(1, f);
                        if (G.length > 0)
                        {
                          localObject6 = f.t;
                          i1 = localObject4[4];
                          byte[] arrayOfByte = q.a;
                          if ((("video/avc".equals(localObject6)) && ((i1 & 0x1F) == 6)) || (("video/hevc".equals(localObject6)) && ((i1 & 0x7E) >> 1 == 39))) {
                            i1 = 1;
                          } else {
                            i1 = 0;
                          }
                          if (i1 != 0)
                          {
                            bool = true;
                            break label1074;
                          }
                        }
                        bool = false;
                        D = bool;
                        B += 5;
                        A += i3;
                      }
                      else
                      {
                        throw a1.a("Invalid NAL length", null);
                      }
                    }
                    else
                    {
                      if (D)
                      {
                        g.D(i1);
                        ((i)localObject1).readFully(g.a, 0, C);
                        localObject6 = g;
                        ((v)localObject5).b(C, (u)localObject6);
                        i1 = C;
                        localObject6 = g;
                        i4 = q.e(a, c);
                        g.G("video/hevc".equals(f.t));
                        g.F(i4);
                        c4.b.a(l1, g, G);
                      }
                      else
                      {
                        i1 = ((v)localObject5).e((t5.h)localObject1, i1, false);
                      }
                      B += i1;
                      C -= i1;
                    }
                  }
                }
                for (;;)
                {
                  i1 = B;
                  i3 = A;
                  if (i1 >= i3) {
                    break;
                  }
                  i1 = ((v)localObject5).e((t5.h)localObject1, i3 - i1, false);
                  B += i1;
                }
                if (!l) {
                  i1 = d.g[f];
                } else if (b.j[f] != 0) {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                i3 = i1;
                if (((b)localObject3).a() != null) {
                  i3 = i1 | 0x40000000;
                }
                localObject2 = ((b)localObject3).a();
                if (localObject2 != null) {
                  localObject2 = c;
                } else {
                  localObject2 = null;
                }
                ((v)localObject5).c(l1, i3, A, 0, (v.a)localObject2);
                while (!n.isEmpty())
                {
                  localObject2 = (a)n.removeFirst();
                  v -= c;
                  l2 = a;
                  l3 = l2;
                  if (b) {
                    l3 = l2 + l1;
                  }
                  localObject5 = j;
                  l2 = l3;
                  if (localObject5 != null) {
                    l2 = ((c0)localObject5).a(l3);
                  }
                  localObject5 = F;
                  i1 = localObject5.length;
                  for (i3 = 0; i3 < i1; i3++) {
                    localObject5[i3].c(l2, 1, c, v, null);
                  }
                }
                if (!((b)localObject3).b()) {
                  z = null;
                }
                p = 3;
              }
              i1 = 1;
            }
            if (i1 != 0) {
              return 0;
            }
          }
          else
          {
            i3 = d.size();
            i1 = 0;
            for (localObject2 = null; i1 < i3; localObject2 = localObject3)
            {
              localObject5 = d.valueAt(i1)).b;
              l3 = l1;
              localObject3 = localObject2;
              if (o)
              {
                l2 = c;
                l3 = l1;
                localObject3 = localObject2;
                if (l2 < l1)
                {
                  localObject3 = (b)d.valueAt(i1);
                  l3 = l2;
                }
              }
              i1++;
              l1 = l3;
            }
            if (localObject2 != null) {
              break label1728;
            }
            p = 3;
          }
          for (;;)
          {
            break label3698;
            i1 = (int)(l1 - parami.getPosition());
            if (i1 < 0) {
              break;
            }
            ((i)localObject1).j(i1);
            localObject2 = b;
            localObject3 = n;
            ((i)localObject1).readFully(a, 0, c);
            n.G(0);
            o = false;
          }
          throw a1.a("Offset to encryption data was negative.", null);
        }
        i1 = (int)r - s;
        Object localObject2 = t;
        if (localObject2 != null)
        {
          ((i)localObject1).readFully(a, 8, i1);
          i1 = q;
          localObject3 = new a.b(i1, (u)localObject2);
          l2 = parami.getPosition();
          if (!m.isEmpty())
          {
            m.peek()).c.add(localObject3);
          }
          else
          {
            long l6;
            if (i1 == 1936286840)
            {
              ((u)localObject2).G(8);
              i1 = ((u)localObject2).f();
              ((u)localObject2).H(4);
              long l4 = ((u)localObject2).w();
              if ((i1 >> 24 & 0xFF) == 0)
              {
                l3 = ((u)localObject2).w();
                l1 = ((u)localObject2).w();
              }
              else
              {
                l3 = ((u)localObject2).z();
                l1 = ((u)localObject2).z();
              }
              long l5 = l1 + l2;
              l6 = e0.O(l3, 1000000L, l4);
              ((u)localObject2).H(2);
              i1 = ((u)localObject2).A();
              localObject3 = new int[i1];
              localObject5 = new long[i1];
              params = new long[i1];
              localObject1 = new long[i1];
              l1 = l6;
              i3 = 0;
              l2 = l3;
              l3 = l5;
              while (i3 < i1)
              {
                i2 = ((u)localObject2).f();
                if ((i2 & 0x80000000) == 0)
                {
                  l5 = ((u)localObject2).w();
                  localObject3[i3] = (i2 & 0x7FFFFFFF);
                  localObject5[i3] = l3;
                  localObject1[i3] = l1;
                  l2 += l5;
                  l1 = e0.O(l2, 1000000L, l4);
                  params[i3] = (l1 - localObject1[i3]);
                  ((u)localObject2).H(4);
                  l3 += localObject3[i3];
                  i3++;
                }
                else
                {
                  throw a1.a("Unhandled indirect reference", null);
                }
              }
              localObject1 = Pair.create(Long.valueOf(l6), new c4.c((int[])localObject3, (long[])localObject5, params, (long[])localObject1));
              l3 = ((Long)first).longValue();
              params = this;
              y = l3;
              E.t((t)second);
              H = true;
            }
            else
            {
              localObject1 = params;
              params = (s)localObject1;
              if (i1 == 1701671783) {
                if (F.length == 0)
                {
                  params = (s)localObject1;
                }
                else
                {
                  ((u)localObject2).G(8);
                  i1 = ((u)localObject2).f() >> 24 & 0xFF;
                  if (i1 != 0)
                  {
                    if (i1 != 1)
                    {
                      f.p("Skipping unsupported emsg version: ", i1, "FragmentedMp4Extractor");
                      params = (s)localObject1;
                      break label2752;
                    }
                    l1 = ((u)localObject2).w();
                    l3 = e0.O(((u)localObject2).z(), 1000000L, l1);
                    l2 = e0.O(((u)localObject2).w(), 1000L, l1);
                    l1 = ((u)localObject2).w();
                    params = ((u)localObject2).p();
                    params.getClass();
                    localObject3 = ((u)localObject2).p();
                    localObject3.getClass();
                    l6 = -9223372036854775807L;
                  }
                  else
                  {
                    params = ((u)localObject2).p();
                    params.getClass();
                    localObject3 = ((u)localObject2).p();
                    localObject3.getClass();
                    l1 = ((u)localObject2).w();
                    l6 = e0.O(((u)localObject2).w(), 1000000L, l1);
                    l3 = y;
                    if (l3 != -9223372036854775807L) {
                      l3 += l6;
                    } else {
                      l3 = -9223372036854775807L;
                    }
                    l2 = e0.O(((u)localObject2).w(), 1000L, l1);
                    l1 = ((u)localObject2).w();
                  }
                  i1 = c - b;
                  localObject5 = new byte[i1];
                  ((u)localObject2).d((byte[])localObject5, 0, i1);
                  params = new r4.a(params, (String)localObject3, l2, l1, (byte[])localObject5);
                  params = new u(k.e(params));
                  i3 = c - b;
                  for (localObject2 : F)
                  {
                    params.G(0);
                    ((v)localObject2).b(i3, params);
                  }
                  if (l3 == -9223372036854775807L)
                  {
                    localObject3 = n;
                    params = new a(i3, l6, true);
                  }
                  else
                  {
                    if (n.isEmpty()) {
                      break label2685;
                    }
                    localObject3 = n;
                    params = new a(i3, l3, false);
                  }
                  ((ArrayDeque)localObject3).addLast(params);
                  v += i3;
                  params = (s)localObject1;
                  break label2752;
                  params = j;
                  l1 = l3;
                  if (params != null) {
                    l1 = params.a(l3);
                  }
                  localObject3 = F;
                  i2 = localObject3.length;
                  for (i1 = 0;; i1++)
                  {
                    params = (s)localObject1;
                    if (i1 >= i2) {
                      break;
                    }
                    localObject3[i1].c(l1, 1, i3, 0, null);
                  }
                }
              }
            }
            localObject1 = parami;
          }
        }
        else
        {
          ((i)localObject1).j(i1);
        }
        params.e(parami.getPosition());
      }
      else
      {
        if (s == 0)
        {
          localObject3 = l.a;
          i1 = 0;
          if (((i)localObject1).b((byte[])localObject3, 0, 8, true))
          {
            s = 8;
            l.G(0);
            r = l.w();
            q = l.f();
          }
        }
        else
        {
          l3 = r;
          if (l3 == 1L)
          {
            ((i)localObject1).readFully(l.a, 8, 8);
            s += 8;
            l3 = l.z();
          }
          else
          {
            if (l3 != 0L) {
              break label2993;
            }
            l1 = parami.getLength();
            l3 = l1;
            if (l1 == -1L)
            {
              l3 = l1;
              if (!m.isEmpty()) {
                l3 = m.peek()).b;
              }
            }
            if (l3 == -1L) {
              break label2993;
            }
            l3 = l3 - parami.getPosition() + s;
          }
          r = l3;
          if (r < s) {
            break label3708;
          }
          l3 = parami.getPosition() - s;
          i1 = q;
          if (((i1 == 1836019558) || (i1 == 1835295092)) && (!H))
          {
            E.t(new t.b(x, l3));
            H = true;
          }
          if (q == 1836019558)
          {
            i3 = d.size();
            for (i1 = 0; i1 < i3; i1++)
            {
              localObject3 = d.valueAt(i1)).b;
              localObject3.getClass();
              c = l3;
              b = l3;
            }
          }
          i3 = q;
          if (i3 == 1835295092)
          {
            z = null;
            u = (l3 + r);
            p = 2;
            i1 = 1;
          }
          else
          {
            localObject3 = null;
            if ((i3 != 1836019574) && (i3 != 1953653099) && (i3 != 1835297121) && (i3 != 1835626086) && (i3 != 1937007212) && (i3 != 1836019558) && (i3 != 1953653094) && (i3 != 1836475768) && (i3 != 1701082227)) {
              i1 = 0;
            } else {
              i1 = 1;
            }
            if (i1 != 0)
            {
              l3 = parami.getPosition() + r - 8L;
              m.push(new a.a(q, l3));
              if (r == s)
              {
                params.e(l3);
              }
              else
              {
                p = 0;
                s = 0;
              }
            }
            for (;;)
            {
              i1 = 1;
              break;
              if ((i3 != 1751411826) && (i3 != 1835296868) && (i3 != 1836476516) && (i3 != 1936286840) && (i3 != 1937011556) && (i3 != 1937011827) && (i3 != 1668576371) && (i3 != 1937011555) && (i3 != 1937011578) && (i3 != 1937013298) && (i3 != 1937007471) && (i3 != 1668232756) && (i3 != 1937011571) && (i3 != 1952867444) && (i3 != 1952868452) && (i3 != 1953196132) && (i3 != 1953654136) && (i3 != 1953658222) && (i3 != 1886614376) && (i3 != 1935763834) && (i3 != 1935763823) && (i3 != 1936027235) && (i3 != 1970628964) && (i3 != 1935828848) && (i3 != 1936158820) && (i3 != 1701606260) && (i3 != 1835362404) && (i3 != 1701671783)) {
                i1 = 0;
              } else {
                i1 = 1;
              }
              if (i1 != 0)
              {
                if (s == 8)
                {
                  if (r <= 2147483647L)
                  {
                    localObject3 = new u((int)r);
                    System.arraycopy(l.a, 0, a, 0, 8);
                  }
                  else
                  {
                    throw a1.c("Leaf atom with length > 2147483647 (unsupported).");
                  }
                }
                else {
                  throw a1.c("Leaf atom defines extended atom size (unsupported).");
                }
              }
              else {
                if (r > 2147483647L) {
                  break label3701;
                }
              }
              t = ((u)localObject3);
              p = 1;
            }
          }
        }
        if (i1 == 0) {
          return -1;
        }
      }
    }
    label3701:
    throw a1.c("Skipping atom with length > 2147483647 (unsupported).");
    label3708:
    throw a1.c("Atom size less than header length (unsupported).");
  }
  
  public final void e(long paramLong)
  {
    Object localObject1 = this;
    Object localObject2 = localObject1;
    Object localObject7;
    for (Object localObject3 = localObject2; (!m.isEmpty()) && (m.peek()).b == paramLong); localObject3 = localObject7)
    {
      Object localObject4 = (a.a)m.pop();
      int i1 = a;
      Object localObject5;
      Object localObject6;
      int i2;
      long l1;
      Object localObject8;
      int i3;
      boolean bool;
      Object localObject9;
      if (i1 == 1836019574)
      {
        if (b == null) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0)
        {
          localObject5 = a(c);
          localObject6 = ((a.a)localObject4).b(1836475768);
          localObject6.getClass();
          localObject7 = new SparseArray();
          i2 = c.size();
          l1 = -9223372036854775807L;
          for (i1 = 0; i1 < i2; i1++)
          {
            localObject8 = (a.b)c.get(i1);
            i3 = a;
            if (i3 == 1953654136)
            {
              localObject8 = b;
              ((u)localObject8).G(12);
              localObject8 = Pair.create(Integer.valueOf(((u)localObject8).f()), new c(((u)localObject8).f() - 1, ((u)localObject8).f(), ((u)localObject8).f(), ((u)localObject8).f()));
              ((SparseArray)localObject7).put(((Integer)first).intValue(), (c)second);
            }
            else if (i3 == 1835362404)
            {
              localObject8 = b;
              ((u)localObject8).G(8);
              if ((((u)localObject8).f() >> 24 & 0xFF) == 0) {
                l1 = ((u)localObject8).w();
              } else {
                l1 = ((u)localObject8).z();
              }
            }
          }
          localObject6 = new p();
          if ((a & 0x10) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          localObject5 = b.e((a.a)localObject4, (p)localObject6, l1, (a4.d)localObject5, bool, false, new d((e)localObject2));
          i2 = ((ArrayList)localObject5).size();
          if (d.size() == 0)
          {
            for (i1 = 0; i1 < i2; i1++)
            {
              localObject9 = (m)((ArrayList)localObject5).get(i1);
              localObject4 = a;
              localObject8 = E.r(i1, b);
              i3 = a;
              if (((SparseArray)localObject7).size() == 1)
              {
                localObject6 = (c)((SparseArray)localObject7).valueAt(0);
              }
              else
              {
                localObject6 = (c)((SparseArray)localObject7).get(i3);
                localObject6.getClass();
              }
              localObject6 = new b((v)localObject8, (m)localObject9, (c)localObject6);
              d.put(a, localObject6);
              x = Math.max(x, e);
            }
            E.m();
          }
          else
          {
            if (d.size() == i2) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.H(bool);
            for (i1 = 0; i1 < i2; i1++)
            {
              localObject8 = (m)((ArrayList)localObject5).get(i1);
              localObject6 = a;
              localObject4 = (b)d.get(a);
              i3 = a;
              if (((SparseArray)localObject7).size() == 1)
              {
                localObject6 = (c)((SparseArray)localObject7).valueAt(0);
              }
              else
              {
                localObject6 = (c)((SparseArray)localObject7).get(i3);
                localObject6.getClass();
              }
              d = ((m)localObject8);
              e = ((c)localObject6);
              a.d(a.f);
              ((b)localObject4).d();
            }
          }
          localObject6 = localObject2;
          localObject7 = localObject3;
        }
        else
        {
          throw new IllegalStateException("Unexpected moov box.");
        }
      }
      else if (i1 == 1836019558)
      {
        localObject3 = d;
        int i4;
        if (b != null) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        i1 = a;
        localObject1 = h;
        i3 = d.size();
        i2 = 0;
        localObject2 = localObject4;
        while (i2 < i3)
        {
          localObject7 = (a.a)d.get(i2);
          if (a == 1953653094)
          {
            localObject6 = ((a.a)localObject7).c(1952868452);
            localObject6.getClass();
            localObject5 = b;
            ((u)localObject5).G(8);
            int i5 = ((u)localObject5).f() & 0xFFFFFF;
            i6 = ((u)localObject5).f();
            if (i4 != 0) {
              localObject6 = ((SparseArray)localObject3).valueAt(0);
            } else {
              localObject6 = ((SparseArray)localObject3).get(i6);
            }
            localObject4 = (b)localObject6;
            int i7;
            int i8;
            if (localObject4 == null)
            {
              localObject4 = null;
            }
            else
            {
              if ((i5 & 0x1) != 0)
              {
                l1 = ((u)localObject5).z();
                localObject6 = b;
                b = l1;
                c = l1;
              }
              localObject6 = e;
              if ((i5 & 0x2) != 0) {
                i6 = ((u)localObject5).f() - 1;
              } else {
                i6 = a;
              }
              if ((i5 & 0x8) != 0) {
                i7 = ((u)localObject5).f();
              } else {
                i7 = b;
              }
              if ((i5 & 0x10) != 0) {
                i8 = ((u)localObject5).f();
              } else {
                i8 = c;
              }
              if ((i5 & 0x20) != 0) {
                i5 = ((u)localObject5).f();
              } else {
                i5 = d;
              }
              b.a = new c(i6, i7, i8, i5);
            }
            if (localObject4 != null)
            {
              localObject6 = b;
              l1 = p;
              bool = q;
              ((b)localObject4).d();
              l = true;
              localObject5 = ((a.a)localObject7).c(1952867444);
              if ((localObject5 != null) && ((i1 & 0x2) == 0))
              {
                localObject5 = b;
                ((u)localObject5).G(8);
                if ((((u)localObject5).f() >> 24 & 0xFF) == 1) {
                  l1 = ((u)localObject5).z();
                } else {
                  l1 = ((u)localObject5).w();
                }
                p = l1;
                q = true;
              }
              else
              {
                p = l1;
                q = bool;
              }
              localObject5 = c;
              int i9 = ((ArrayList)localObject5).size();
              i8 = 0;
              i7 = 0;
              for (i6 = 0; i8 < i9; i6 = i5)
              {
                localObject8 = (a.b)((List)localObject5).get(i8);
                i10 = i7;
                i5 = i6;
                if (a == 1953658222)
                {
                  localObject8 = b;
                  ((u)localObject8).G(12);
                  i11 = ((u)localObject8).y();
                  i10 = i7;
                  i5 = i6;
                  if (i11 > 0)
                  {
                    i5 = i6 + i11;
                    i10 = i7 + 1;
                  }
                }
                i8++;
                i7 = i10;
              }
              int i10 = i4;
              int i11 = i3;
              h = 0;
              g = 0;
              f = 0;
              localObject8 = b;
              d = i7;
              e = i6;
              if (g.length < i7)
              {
                f = new long[i7];
                g = new int[i7];
              }
              if (h.length < i6)
              {
                i3 = i6 * 125 / 100;
                h = new int[i3];
                i = new long[i3];
                j = new boolean[i3];
                l = new boolean[i3];
              }
              int i12 = 0;
              int i13 = 0;
              i4 = 0;
              Object localObject10;
              Object localObject11;
              label1838:
              label1841:
              long l2;
              while (i12 < i9)
              {
                localObject8 = (a.b)((List)localObject5).get(i12);
                if (a == 1953658222)
                {
                  localObject8 = b;
                  ((u)localObject8).G(8);
                  i5 = ((u)localObject8).f() & 0xFFFFFF;
                  localObject10 = d.a;
                  localObject9 = b;
                  localObject11 = a;
                  i3 = e0.a;
                  g[i13] = ((u)localObject8).y();
                  arrayOfLong = f;
                  l1 = b;
                  arrayOfLong[i13] = l1;
                  if ((i5 & 0x1) != 0) {
                    arrayOfLong[i13] = (l1 + ((u)localObject8).f());
                  }
                  if ((i5 & 0x4) != 0) {
                    i8 = 1;
                  } else {
                    i8 = 0;
                  }
                  i3 = d;
                  if (i8 != 0) {
                    i3 = ((u)localObject8).f();
                  }
                  if ((i5 & 0x100) != 0) {
                    i6 = 1;
                  } else {
                    i6 = 0;
                  }
                  if ((i5 & 0x200) != 0) {
                    i7 = 1;
                  } else {
                    i7 = 0;
                  }
                  int i14;
                  if ((i5 & 0x400) != 0) {
                    i14 = 1;
                  } else {
                    i14 = 0;
                  }
                  if ((i5 & 0x800) != 0) {
                    i5 = 1;
                  } else {
                    i5 = 0;
                  }
                  arrayOfLong = h;
                  if (arrayOfLong != null) {
                    if (arrayOfLong.length == 1)
                    {
                      localObject12 = i;
                      if (localObject12 != null)
                      {
                        l1 = arrayOfLong[0];
                        if ((l1 != 0L) && (e0.O(l1 + localObject12[0], 1000000L, d) < e)) {
                          break label1838;
                        }
                        i15 = 1;
                        break label1841;
                      }
                    }
                  }
                  int i15 = 0;
                  int i16 = i8;
                  if (i15 != 0) {
                    l1 = i[0];
                  } else {
                    l1 = 0L;
                  }
                  Object localObject12 = h;
                  arrayOfLong = i;
                  boolean[] arrayOfBoolean = j;
                  if ((b == 2) && ((i1 & 0x1) != 0)) {
                    i8 = 1;
                  } else {
                    i8 = 0;
                  }
                  int i17 = g[i13] + i4;
                  l2 = c;
                  long l3 = p;
                  i15 = i4;
                  int i18 = i7;
                  i4 = i17;
                  i17 = i6;
                  i7 = i16;
                  while (i15 < i4)
                  {
                    if (i17 != 0) {
                      i16 = ((u)localObject8).f();
                    } else {
                      i16 = b;
                    }
                    if (i16 >= 0)
                    {
                      int i19;
                      if (i18 != 0) {
                        i19 = ((u)localObject8).f();
                      } else {
                        i19 = c;
                      }
                      if (i19 >= 0)
                      {
                        if (i14 != 0) {
                          i6 = ((u)localObject8).f();
                        } else if ((i15 == 0) && (i7 != 0)) {
                          i6 = i3;
                        } else {
                          i6 = d;
                        }
                        int i20;
                        if (i5 != 0) {
                          i20 = ((u)localObject8).f();
                        } else {
                          i20 = 0;
                        }
                        long l4 = e0.O(i20 + l3 - l1, 1000000L, l2);
                        arrayOfLong[i15] = l4;
                        if (!q) {
                          arrayOfLong[i15] = (l4 + d.h);
                        }
                        localObject12[i15] = i19;
                        if (((i6 >> 16 & 0x1) == 0) && ((i8 == 0) || (i15 == 0))) {
                          bool = true;
                        } else {
                          bool = false;
                        }
                        arrayOfBoolean[i15] = bool;
                        l3 += i16;
                        i15++;
                      }
                      else
                      {
                        localObject1 = new StringBuilder();
                        ((StringBuilder)localObject1).append("Unexpected negative value: ");
                        ((StringBuilder)localObject1).append(i19);
                        throw a1.a(((StringBuilder)localObject1).toString(), null);
                      }
                    }
                    else
                    {
                      localObject1 = new StringBuilder();
                      ((StringBuilder)localObject1).append("Unexpected negative value: ");
                      ((StringBuilder)localObject1).append(i16);
                      throw a1.a(((StringBuilder)localObject1).toString(), null);
                    }
                  }
                  p = l3;
                  i13++;
                }
                i12++;
              }
              localObject5 = localObject2;
              i4 = i1;
              i6 = i2;
              localObject2 = d.a;
              localObject4 = a;
              localObject4.getClass();
              i1 = a;
              localObject2 = k;
              if (localObject2 == null) {
                localObject2 = null;
              } else {
                localObject2 = localObject2[i1];
              }
              localObject4 = ((a.a)localObject7).c(1935763834);
              if (localObject4 != null)
              {
                localObject2.getClass();
                localObject4 = b;
                i7 = d;
                ((u)localObject4).G(8);
                if ((((u)localObject4).f() & 0xFFFFFF & 0x1) == 1) {
                  ((u)localObject4).H(8);
                }
                i1 = ((u)localObject4).v();
                i3 = ((u)localObject4).y();
                if (i3 <= e)
                {
                  if (i1 == 0)
                  {
                    localObject8 = l;
                    i2 = 0;
                    i1 = 0;
                    while (i2 < i3)
                    {
                      i8 = ((u)localObject4).v();
                      i1 += i8;
                      if (i8 > i7) {
                        bool = true;
                      } else {
                        bool = false;
                      }
                      localObject8[i2] = bool;
                      i2++;
                    }
                  }
                  else
                  {
                    if (i1 > i7) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    i1 = i1 * i3 + 0;
                    Arrays.fill(l, 0, i3, bool);
                  }
                  Arrays.fill(l, i3, e, false);
                  if (i1 > 0)
                  {
                    n.D(i1);
                    k = true;
                    o = true;
                  }
                }
                else
                {
                  localObject1 = a0.j.n("Saiz sample count ", i3, " is greater than fragment sample count");
                  ((StringBuilder)localObject1).append(e);
                  throw a1.a(((StringBuilder)localObject1).toString(), null);
                }
              }
              localObject4 = ((a.a)localObject7).c(1935763823);
              if (localObject4 != null)
              {
                localObject4 = b;
                ((u)localObject4).G(8);
                i2 = ((u)localObject4).f();
                if ((0xFFFFFF & i2 & 0x1) == 1) {
                  ((u)localObject4).H(8);
                }
                i1 = ((u)localObject4).y();
                if (i1 == 1)
                {
                  l2 = c;
                  if ((i2 >> 24 & 0xFF) == 0) {
                    l1 = ((u)localObject4).w();
                  } else {
                    l1 = ((u)localObject4).z();
                  }
                  c = (l2 + l1);
                }
                else
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("Unexpected saio entry count: ");
                  ((StringBuilder)localObject1).append(i1);
                  throw a1.a(((StringBuilder)localObject1).toString(), null);
                }
              }
              long[] arrayOfLong = null;
              localObject4 = ((a.a)localObject7).c(1936027235);
              if (localObject4 != null) {
                c(b, 0, (l)localObject6);
              }
              if (localObject2 != null) {
                localObject2 = b;
              } else {
                localObject2 = null;
              }
              i1 = 0;
              localObject8 = null;
              for (localObject4 = localObject8; i1 < c.size(); localObject4 = localObject11)
              {
                localObject11 = (a.b)c.get(i1);
                localObject9 = b;
                i2 = a;
                if (i2 == 1935828848)
                {
                  ((u)localObject9).G(12);
                  localObject10 = localObject8;
                  localObject11 = localObject4;
                  if (((u)localObject9).f() == 1936025959)
                  {
                    localObject10 = localObject9;
                    localObject11 = localObject4;
                  }
                }
                else
                {
                  localObject10 = localObject8;
                  localObject11 = localObject4;
                  if (i2 == 1936158820)
                  {
                    ((u)localObject9).G(12);
                    localObject10 = localObject8;
                    localObject11 = localObject4;
                    if (((u)localObject9).f() == 1936025959)
                    {
                      localObject11 = localObject9;
                      localObject10 = localObject8;
                    }
                  }
                }
                i1++;
                localObject8 = localObject10;
              }
              if ((localObject8 != null) && (localObject4 != null))
              {
                ((u)localObject8).G(8);
                i1 = ((u)localObject8).f();
                ((u)localObject8).H(4);
                if ((i1 >> 24 & 0xFF) == 1) {
                  ((u)localObject8).H(4);
                }
                if (((u)localObject8).f() == 1)
                {
                  ((u)localObject4).G(8);
                  i1 = ((u)localObject4).f() >> 24 & 0xFF;
                  ((u)localObject4).H(4);
                  if (i1 == 1)
                  {
                    if (((u)localObject4).w() == 0L) {
                      throw a1.c("Variable length description in sgpd found (unsupported)");
                    }
                  }
                  else if (i1 >= 2) {
                    ((u)localObject4).H(4);
                  }
                  if (((u)localObject4).w() == 1L)
                  {
                    ((u)localObject4).H(1);
                    i3 = ((u)localObject4).v();
                    if (((u)localObject4).v() == 1) {
                      bool = true;
                    } else {
                      bool = false;
                    }
                    if (bool)
                    {
                      i1 = ((u)localObject4).v();
                      localObject9 = new byte[16];
                      ((u)localObject4).d((byte[])localObject9, 0, 16);
                      localObject8 = arrayOfLong;
                      if (i1 == 0)
                      {
                        i2 = ((u)localObject4).v();
                        localObject8 = new byte[i2];
                        ((u)localObject4).d((byte[])localObject8, 0, i2);
                      }
                      k = true;
                      m = new k(bool, (String)localObject2, i1, (byte[])localObject9, (i3 & 0xF0) >> 4, i3 & 0xF, (byte[])localObject8);
                    }
                  }
                  else
                  {
                    throw a1.c("Entry count in sgpd != 1 (unsupported).");
                  }
                }
                else
                {
                  throw a1.c("Entry count in sbgp != 1 (unsupported).");
                }
              }
              i2 = c.size();
              for (i1 = 0; i1 < i2; i1++)
              {
                localObject2 = (a.b)c.get(i1);
                if (a == 1970628964)
                {
                  localObject4 = b;
                  ((u)localObject4).G(8);
                  localObject2 = localObject1;
                  ((u)localObject4).d((byte[])localObject2, 0, 16);
                  if (Arrays.equals((byte[])localObject2, I)) {
                    c((u)localObject4, 16, (l)localObject6);
                  }
                }
              }
              localObject2 = localObject1;
              i3 = i11;
              i2 = i10;
              localObject1 = localObject5;
              i1 = i4;
              break label3399;
            }
          }
          localObject6 = localObject1;
          localObject1 = localObject2;
          int i6 = i2;
          i2 = i4;
          localObject2 = localObject6;
          label3399:
          i6++;
          localObject6 = localObject2;
          localObject2 = localObject1;
          localObject1 = localObject6;
          i4 = i2;
          i2 = i6;
        }
        localObject6 = a(c);
        localObject1 = this;
        if (localObject6 != null)
        {
          i2 = d.size();
          for (i1 = 0; i1 < i2; i1++)
          {
            localObject3 = (b)d.valueAt(i1);
            localObject7 = d.a;
            localObject2 = b.a;
            i3 = e0.a;
            i3 = a;
            localObject2 = k;
            if (localObject2 == null) {
              localObject2 = null;
            } else {
              localObject2 = localObject2[i3];
            }
            if (localObject2 != null) {
              localObject2 = b;
            } else {
              localObject2 = null;
            }
            localObject2 = ((a4.d)localObject6).a((String)localObject2);
            localObject7 = d.a.f;
            localObject7.getClass();
            localObject7 = new i0.a((i0)localObject7);
            n = ((a4.d)localObject2);
            localObject2 = new i0((i0.a)localObject7);
            a.d((i0)localObject2);
          }
        }
        if (w != -9223372036854775807L)
        {
          i3 = d.size();
          for (i1 = 0; i1 < i3; i1++)
          {
            localObject2 = (b)d.valueAt(i1);
            l1 = w;
            for (i2 = f;; i2++)
            {
              localObject3 = b;
              if ((i2 >= e) || (i[i2] > l1)) {
                break;
              }
              if (j[i2] != 0) {
                i = i2;
              }
            }
          }
          w = -9223372036854775807L;
        }
        localObject2 = localObject1;
        localObject7 = localObject2;
        localObject6 = localObject2;
      }
      else
      {
        localObject5 = localObject1;
        localObject6 = localObject2;
        localObject7 = localObject3;
        localObject1 = localObject5;
        if (!m.isEmpty())
        {
          m.peek()).d.add(localObject4);
          localObject1 = localObject5;
          localObject7 = localObject3;
          localObject6 = localObject2;
        }
      }
      localObject2 = localObject6;
    }
    p = 0;
    s = 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    int i1 = d.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((b)d.valueAt(i2)).d();
    }
    n.clear();
    v = 0;
    w = paramLong2;
    m.clear();
    p = 0;
    s = 0;
  }
  
  public final boolean i(i parami)
  {
    return a0.L(parami, true, false);
  }
  
  public final void release() {}
  
  public static final class a
  {
    public final long a;
    public final boolean b;
    public final int c;
    
    public a(int paramInt, long paramLong, boolean paramBoolean)
    {
      a = paramLong;
      b = paramBoolean;
      c = paramInt;
    }
  }
  
  public static final class b
  {
    public final v a;
    public final l b;
    public final u c;
    public m d;
    public c e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final u j;
    public final u k;
    public boolean l;
    
    public b(v paramv, m paramm, c paramc)
    {
      a = paramv;
      d = paramm;
      e = paramc;
      b = new l();
      c = new u();
      j = new u(1);
      k = new u();
      d = paramm;
      e = paramc;
      paramv.d(a.f);
      d();
    }
    
    public final k a()
    {
      boolean bool = l;
      Object localObject1 = null;
      if (!bool) {
        return null;
      }
      Object localObject2 = b;
      Object localObject3 = a;
      int m = e0.a;
      m = a;
      localObject2 = m;
      if (localObject2 == null)
      {
        localObject2 = d.a.k;
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = localObject2[m];
        }
      }
      localObject3 = localObject1;
      if (localObject2 != null)
      {
        localObject3 = localObject1;
        if (a) {
          localObject3 = localObject2;
        }
      }
      return (k)localObject3;
    }
    
    public final boolean b()
    {
      f += 1;
      if (!l) {
        return false;
      }
      int m = g + 1;
      g = m;
      int[] arrayOfInt = b.g;
      int n = h;
      if (m == arrayOfInt[n])
      {
        h = (n + 1);
        g = 0;
        return false;
      }
      return true;
    }
    
    public final int c(int paramInt1, int paramInt2)
    {
      Object localObject1 = a();
      if (localObject1 == null) {
        return 0;
      }
      int m = d;
      if (m != 0)
      {
        localObject1 = b.n;
      }
      else
      {
        localObject2 = e;
        m = e0.a;
        k.E((byte[])localObject2, localObject2.length);
        localObject1 = k;
        m = localObject2.length;
      }
      Object localObject2 = b;
      int n = f;
      if ((k) && (l[n] != 0)) {
        n = 1;
      } else {
        n = 0;
      }
      int i1;
      if ((n == 0) && (paramInt2 == 0)) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      localObject2 = j;
      byte[] arrayOfByte = a;
      int i2;
      if (i1 != 0) {
        i2 = 128;
      } else {
        i2 = 0;
      }
      arrayOfByte[0] = ((byte)(byte)(i2 | m));
      ((u)localObject2).G(0);
      a.a(1, j);
      a.a(m, (u)localObject1);
      if (i1 == 0) {
        return m + 1;
      }
      if (n == 0)
      {
        c.D(8);
        localObject2 = c;
        localObject1 = a;
        localObject1[0] = ((byte)0);
        localObject1[1] = ((byte)1);
        localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
        localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
        localObject1[4] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
        localObject1[5] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
        localObject1[6] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
        localObject1[7] = ((byte)(byte)(paramInt1 & 0xFF));
        a.a(8, (u)localObject2);
        return m + 1 + 8;
      }
      localObject2 = b.n;
      paramInt1 = ((u)localObject2).A();
      ((u)localObject2).H(-2);
      paramInt1 = paramInt1 * 6 + 2;
      localObject1 = localObject2;
      if (paramInt2 != 0)
      {
        c.D(paramInt1);
        localObject1 = c.a;
        ((u)localObject2).d((byte[])localObject1, 0, paramInt1);
        paramInt2 = ((localObject1[2] & 0xFF) << 8 | localObject1[3] & 0xFF) + paramInt2;
        localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
        localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
        localObject1 = c;
      }
      a.a(paramInt1, (u)localObject1);
      return m + 1 + paramInt1;
    }
    
    public final void d()
    {
      l locall = b;
      d = 0;
      p = 0L;
      q = false;
      k = false;
      o = false;
      m = null;
      f = 0;
      h = 0;
      g = 0;
      i = 0;
      l = false;
    }
  }
}

/* Location:
 * Qualified Name:     k4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */