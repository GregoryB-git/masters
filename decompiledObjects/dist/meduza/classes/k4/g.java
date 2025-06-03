package k4;

import android.util.Pair;
import b.a0;
import c4.h;
import c4.p;
import c4.s;
import c4.t.a;
import c4.t.b;
import c4.v;
import c4.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n7.o;
import u4.l;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v4.c.b;
import v4.e;
import v5.e0;
import v5.q;

public final class g
  implements h, c4.t
{
  public final int a = 0;
  public final v5.u b = new v5.u(q.a);
  public final v5.u c = new v5.u(4);
  public final v5.u d = new v5.u();
  public final v5.u e = new v5.u(16);
  public final ArrayDeque<a.a> f = new ArrayDeque();
  public final i g = new i();
  public final ArrayList h = new ArrayList();
  public int i = 0;
  public int j;
  public long k;
  public int l;
  public v5.u m;
  public int n = -1;
  public int o;
  public int p;
  public int q;
  public c4.j r = c4.j.i;
  public a[] s = new a[0];
  public long[][] t;
  public int u;
  public long v;
  public int w;
  public v4.b x;
  
  public g()
  {
    this(0);
  }
  
  public g(int paramInt) {}
  
  public final void b(c4.j paramj)
  {
    r = paramj;
  }
  
  public final int d(c4.i parami, s params)
  {
    int i1;
    label612:
    label2005:
    label2173:
    label2256:
    label2272:
    label2642:
    do
    {
      int i2;
      Object localObject1;
      Object localObject2;
      long l1;
      Object localObject3;
      int i3;
      long l2;
      long l3;
      do
      {
        i1 = i;
        i2 = 0;
        if (i1 == 0) {
          break;
        }
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 == 3)
            {
              localObject1 = g;
              localObject2 = h;
              i1 = b;
              if (i1 != 0)
              {
                if (i1 != 1)
                {
                  if (i1 != 2)
                  {
                    if (i1 == 3)
                    {
                      l1 = parami.getPosition();
                      i1 = (int)(parami.getLength() - parami.getPosition() - c);
                      localObject3 = new v5.u(i1);
                      parami.readFully(a, 0, i1);
                      for (i3 = 0; i3 < a.size(); i3++)
                      {
                        Object localObject4 = (i.a)a.get(i3);
                        ((v5.u)localObject3).G((int)(a - l1));
                        ((v5.u)localObject3).H(4);
                        i2 = ((v5.u)localObject3).i();
                        parami = ((v5.u)localObject3).s(i2);
                        switch (parami.hashCode())
                        {
                        default: 
                          break;
                        case 1760745220: 
                          if (parami.equals("Super_SlowMotion_BGM")) {
                            i1 = 4;
                          }
                          break;
                        case -830665521: 
                          if (parami.equals("Super_SlowMotion_Deflickering_On")) {
                            i1 = 3;
                          }
                          break;
                        case -1251387154: 
                          if (parami.equals("Super_SlowMotion_Data")) {
                            i1 = 2;
                          }
                          break;
                        case -1332107749: 
                          if (parami.equals("Super_SlowMotion_Edit_Data")) {
                            i1 = 1;
                          }
                          break;
                        case -1711564334: 
                          if (parami.equals("SlowMotion_Data")) {
                            i1 = 0;
                          }
                          break;
                        }
                        i1 = -1;
                        if (i1 != 0)
                        {
                          if (i1 != 1)
                          {
                            if (i1 != 2)
                            {
                              if (i1 != 3)
                              {
                                if (i1 == 4) {
                                  i1 = 2817;
                                } else {
                                  throw a1.a("Invalid SEF name", null);
                                }
                              }
                              else {
                                i1 = 2820;
                              }
                            }
                            else {
                              i1 = 2816;
                            }
                          }
                          else {
                            i1 = 2819;
                          }
                        }
                        else {
                          i1 = 2192;
                        }
                        i4 = b;
                        if (i1 != 2192)
                        {
                          if ((i1 != 2816) && (i1 != 2817) && (i1 != 2819) && (i1 != 2820)) {
                            throw new IllegalStateException();
                          }
                        }
                        else
                        {
                          parami = new ArrayList();
                          localObject4 = ((v5.u)localObject3).s(i4 - (i2 + 8));
                          localObject4 = i.e.b((CharSequence)localObject4);
                          i1 = 0;
                          for (;;)
                          {
                            if (i1 >= ((List)localObject4).size()) {
                              break label612;
                            }
                            Object localObject5 = i.d.b((CharSequence)((List)localObject4).get(i1));
                            if (((List)localObject5).size() == 3) {
                              try
                              {
                                l2 = Long.parseLong((String)((List)localObject5).get(0));
                                l3 = Long.parseLong((String)((List)localObject5).get(1));
                                i2 = Integer.parseInt((String)((List)localObject5).get(2));
                                localObject5 = new v4/c$b;
                                ((c.b)localObject5).<init>(1 << i2 - 1, l2, l3);
                                parami.add(localObject5);
                                i1++;
                              }
                              catch (NumberFormatException parami)
                              {
                                throw a1.a(null, parami);
                              }
                            }
                          }
                          throw a1.a(null, null);
                          ((ArrayList)localObject2).add(new v4.c(parami));
                        }
                      }
                      a = 0L;
                    }
                    else
                    {
                      throw new IllegalStateException();
                    }
                  }
                  else
                  {
                    l3 = parami.getLength();
                    i3 = c - 12 - 8;
                    localObject3 = new v5.u(i3);
                    parami.readFully(a, 0, i3);
                    for (i1 = 0; i1 < i3 / 12; i1++)
                    {
                      ((v5.u)localObject3).H(2);
                      i2 = ((v5.u)localObject3).k();
                      if ((i2 != 2192) && (i2 != 2816)) {
                        if ((i2 != 2817) && (i2 != 2819))
                        {
                          if (i2 != 2820)
                          {
                            ((v5.u)localObject3).H(8);
                            continue;
                          }
                        }
                        else {}
                      }
                      l2 = c;
                      l1 = ((v5.u)localObject3).i();
                      i2 = ((v5.u)localObject3).i();
                      a.add(new i.a(l3 - l2 - l1, i2));
                    }
                    if (a.isEmpty())
                    {
                      l3 = 0L;
                    }
                    else
                    {
                      b = 3;
                      l3 = a.get(0)).a;
                    }
                    a = l3;
                  }
                }
                else
                {
                  localObject3 = new v5.u(8);
                  parami.readFully(a, 0, 8);
                  c = (((v5.u)localObject3).i() + 8);
                  if (((v5.u)localObject3).f() != 1397048916)
                  {
                    a = 0L;
                  }
                  else
                  {
                    a = (parami.getPosition() - (c - 12));
                    b = 2;
                  }
                }
              }
              else
              {
                l3 = parami.getLength();
                if ((l3 != -1L) && (l3 >= 8L)) {
                  l3 -= 8L;
                } else {
                  l3 = 0L;
                }
                a = l3;
                b = 1;
              }
              if (a == 0L)
              {
                i = 0;
                l = 0;
              }
              return 1;
            }
            throw new IllegalStateException();
          }
          long l4 = parami.getPosition();
          int i5;
          if (n == -1)
          {
            long l5 = Long.MAX_VALUE;
            long l6 = l5;
            l1 = l6;
            i1 = 0;
            i5 = -1;
            i3 = -1;
            int i6 = 1;
            i4 = 1;
            for (;;)
            {
              localObject1 = s;
              if (i1 >= localObject1.length) {
                break;
              }
              localObject1 = localObject1[i1];
              int i7 = e;
              localObject1 = b;
              long l7;
              if (i7 == b)
              {
                l7 = l5;
              }
              else
              {
                l3 = c[i7];
                localObject1 = t;
                i2 = e0.a;
                long l8 = localObject1[i1][i7];
                l7 = l3 - l4;
                if ((l7 >= 0L) && (l7 < 262144L)) {
                  i2 = 0;
                } else {
                  i2 = 1;
                }
                int i8;
                if ((i2 != 0) || (i4 == 0))
                {
                  i8 = i3;
                  i7 = i4;
                  l2 = l6;
                  l3 = l1;
                  if (i2 == i4)
                  {
                    i8 = i3;
                    i7 = i4;
                    l2 = l6;
                    l3 = l1;
                    if (l7 >= l1) {}
                  }
                }
                else
                {
                  i7 = i2;
                  i8 = i1;
                  l3 = l7;
                  l2 = l8;
                }
                i3 = i8;
                i4 = i7;
                l7 = l5;
                l6 = l2;
                l1 = l3;
                if (l8 < l5)
                {
                  i5 = i1;
                  l1 = l3;
                  l6 = l2;
                  l7 = l8;
                  i4 = i7;
                  i6 = i2;
                  i3 = i8;
                }
              }
              i1++;
              l5 = l7;
            }
            if ((l5 == Long.MAX_VALUE) || (i6 == 0) || (l6 < l5 + 10485760L)) {
              i5 = i3;
            }
            n = i5;
            if (i5 == -1)
            {
              i1 = -1;
              break label2005;
            }
          }
          localObject1 = s[n];
          localObject3 = c;
          int i4 = e;
          localObject2 = b;
          l3 = c[i4];
          i3 = d[i4];
          localObject2 = d;
          l1 = l3 - l4 + o;
          if ((l1 >= 0L) && (l1 < 262144L))
          {
            l3 = l1;
            i1 = i3;
            if (a.g == 1)
            {
              l3 = l1 + 8L;
              i1 = i3 - 8;
            }
            parami.j((int)l3);
            params = a;
            i5 = j;
            if (i5 != 0)
            {
              params = c.a;
              params[0] = ((byte)0);
              params[1] = ((byte)0);
              params[2] = ((byte)0);
              i3 = 4 - i5;
              for (;;)
              {
                i2 = i1;
                if (p >= i1) {
                  break;
                }
                i2 = q;
                if (i2 == 0)
                {
                  parami.readFully(params, i3, i5);
                  o += i5;
                  c.G(0);
                  i2 = c.f();
                  if (i2 >= 0)
                  {
                    q = i2;
                    b.G(0);
                    ((v)localObject3).b(4, b);
                    p += 4;
                    i1 += i3;
                  }
                  else
                  {
                    throw a1.a("Invalid NAL length", null);
                  }
                }
                else
                {
                  i2 = ((v)localObject3).e(parami, i2, false);
                  o += i2;
                  p += i2;
                  q -= i2;
                }
              }
            }
            else
            {
              if ("audio/ac4".equals(f.t))
              {
                if (p == 0)
                {
                  x3.c.a(i1, d);
                  ((v)localObject3).b(7, d);
                  p += 7;
                }
                i3 = i1 + 7;
              }
              else
              {
                i3 = i1;
                if (localObject2 != null)
                {
                  ((w)localObject2).c(parami);
                  i3 = i1;
                }
              }
              for (;;)
              {
                i1 = p;
                i2 = i3;
                if (i1 >= i3) {
                  break;
                }
                i1 = ((v)localObject3).e(parami, i3 - i1, false);
                o += i1;
                p += i1;
                q -= i1;
              }
            }
            parami = b;
            l3 = f[i4];
            i1 = g[i4];
            if (localObject2 != null)
            {
              ((w)localObject2).b((v)localObject3, l3, i1, i2, 0, null);
              if (i4 + 1 == b.b) {
                ((w)localObject2).a((v)localObject3, null);
              }
            }
            else
            {
              ((v)localObject3).c(l3, i1, i2, 0, null);
            }
            e += 1;
            n = -1;
            o = 0;
            p = 0;
            q = 0;
            i1 = 0;
          }
          else
          {
            a = l3;
            i1 = 1;
          }
          return i1;
        }
        l1 = k - l;
        l3 = parami.getPosition();
        localObject3 = m;
        if (localObject3 != null)
        {
          parami.readFully(a, l, (int)l1);
          if (j == 1718909296)
          {
            ((v5.u)localObject3).G(8);
            i1 = ((v5.u)localObject3).f();
            if (i1 != 1751476579)
            {
              if (i1 != 1903435808) {
                i1 = 0;
              } else {
                i1 = 1;
              }
            }
            else {
              i1 = 2;
            }
            if (i1 == 0)
            {
              ((v5.u)localObject3).H(4);
              while (c - b > 0)
              {
                i1 = ((v5.u)localObject3).f();
                if (i1 != 1751476579)
                {
                  if (i1 != 1903435808) {
                    i1 = 0;
                  } else {
                    i1 = 1;
                  }
                }
                else {
                  i1 = 2;
                }
                if (i1 != 0) {
                  break label2173;
                }
              }
              i1 = 0;
            }
            w = i1;
          }
          else if (!f.isEmpty())
          {
            localObject1 = (a.a)f.peek();
            localObject3 = new a.b(j, (v5.u)localObject3);
            c.add(localObject3);
          }
        }
        else
        {
          if (l1 >= 262144L) {
            break label2256;
          }
          parami.j((int)l1);
        }
        i3 = 0;
        break label2272;
        a = (parami.getPosition() + l1);
        i3 = 1;
        j(l3 + l1);
        i1 = i2;
        if (i3 != 0)
        {
          i1 = i2;
          if (i != 2) {
            i1 = 1;
          }
        }
      } while (i1 == 0);
      return 1;
      if (l == 0)
      {
        if (!parami.b(e.a, 0, 8, true))
        {
          if ((w == 2) && ((a & 0x2) != 0))
          {
            localObject3 = r.r(0, 4);
            localObject1 = x;
            if (localObject1 == null) {
              localObject1 = null;
            } else {
              localObject1 = new p4.a(new p4.a.b[] { localObject1 });
            }
            localObject2 = new i0.a();
            i = ((p4.a)localObject1);
            ((v)localObject3).d(new i0((i0.a)localObject2));
            r.m();
            r.t(new t.b(-9223372036854775807L));
          }
          i1 = 0;
        }
        else
        {
          l = 8;
          e.G(0);
          k = e.w();
          j = e.f();
        }
      }
      else
      {
        l3 = k;
        if (l3 == 1L)
        {
          parami.readFully(e.a, 8, 8);
          l += 8;
          l3 = e.z();
        }
        else
        {
          if (l3 != 0L) {
            break label2642;
          }
          l1 = parami.getLength();
          l3 = l1;
          if (l1 == -1L)
          {
            localObject1 = (a.a)f.peek();
            l3 = l1;
            if (localObject1 != null) {
              l3 = b;
            }
          }
          if (l3 == -1L) {
            break label2642;
          }
          l3 = l3 - parami.getPosition() + l;
        }
        k = l3;
        l3 = k;
        i3 = l;
        if (l3 < i3) {
          break;
        }
        i2 = j;
        if ((i2 != 1836019574) && (i2 != 1953653099) && (i2 != 1835297121) && (i2 != 1835626086) && (i2 != 1937007212) && (i2 != 1701082227) && (i2 != 1835365473)) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if (i1 != 0)
        {
          l2 = parami.getPosition();
          l3 = k;
          l1 = l;
          l2 = l2 + l3 - l1;
          if ((l3 != l1) && (j == 1835365473))
          {
            d.D(8);
            parami.m(d.a, 0, 8);
            localObject3 = d;
            localObject1 = b.a;
            i3 = b;
            ((v5.u)localObject3).H(4);
            i1 = i3;
            if (((v5.u)localObject3).f() != 1751411826) {
              i1 = i3 + 4;
            }
            ((v5.u)localObject3).G(i1);
            parami.j(d.b);
            parami.i();
          }
          f.push(new a.a(j, l2));
          if (k == l)
          {
            j(l2);
          }
          else
          {
            i = 0;
            l = 0;
          }
        }
        else
        {
          if ((i2 != 1835296868) && (i2 != 1836476516) && (i2 != 1751411826) && (i2 != 1937011556) && (i2 != 1937011827) && (i2 != 1937011571) && (i2 != 1668576371) && (i2 != 1701606260) && (i2 != 1937011555) && (i2 != 1937011578) && (i2 != 1937013298) && (i2 != 1937007471) && (i2 != 1668232756) && (i2 != 1953196132) && (i2 != 1718909296) && (i2 != 1969517665) && (i2 != 1801812339) && (i2 != 1768715124)) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          if (i1 != 0)
          {
            boolean bool;
            if (i3 == 8) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.H(bool);
            if (k <= 2147483647L) {
              bool = true;
            } else {
              bool = false;
            }
            x6.b.H(bool);
            localObject1 = new v5.u((int)k);
            System.arraycopy(e.a, 0, a, 0, 8);
          }
          else
          {
            l1 = parami.getPosition();
            l3 = l;
            l1 -= l3;
            if (j == 1836086884) {
              x = new v4.b(0L, l1, -9223372036854775807L, l1 + l3, k - l3);
            }
            localObject1 = null;
          }
          m = ((v5.u)localObject1);
          i = 1;
        }
        i1 = 1;
      }
    } while (i1 != 0);
    return -1;
    throw a1.c("Atom size less than header length (unsupported).");
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    f.clear();
    l = 0;
    n = -1;
    o = 0;
    p = 0;
    q = 0;
    Object localObject;
    if (paramLong1 == 0L)
    {
      if (i != 3)
      {
        i = 0;
        l = 0;
      }
      else
      {
        localObject = g;
        a.clear();
        b = 0;
        h.clear();
      }
    }
    else {
      label166:
      for (w localw : s)
      {
        m localm = b;
        for (int i3 = e0.f(f, paramLong2, false); i3 >= 0; i3--) {
          if ((g[i3] & 0x1) != 0) {
            break label166;
          }
        }
        i3 = -1;
        int i4 = i3;
        if (i3 == -1) {
          i4 = localm.a(paramLong2);
        }
        e = i4;
        localw = d;
        if (localw != null)
        {
          b = false;
          c = 0;
        }
      }
    }
  }
  
  public final t.a g(long paramLong)
  {
    Object localObject = s;
    if (localObject.length == 0)
    {
      localObject = c4.u.c;
      localObject = new t.a((c4.u)localObject, (c4.u)localObject);
    }
    else
    {
      int i1 = u;
      label87:
      long l2;
      if (i1 != -1)
      {
        localObject = b;
        for (i1 = e0.f(f, paramLong, false); i1 >= 0; i1--) {
          if ((g[i1] & 0x1) != 0) {
            break label87;
          }
        }
        i1 = -1;
        i2 = i1;
        if (i1 == -1) {
          i2 = ((m)localObject).a(paramLong);
        }
        if (i2 == -1)
        {
          localObject = c4.u.c;
          return new t.a((c4.u)localObject, (c4.u)localObject);
        }
        l1 = f[i2];
        l2 = c[i2];
        if ((l1 < paramLong) && (i2 < b - 1))
        {
          i1 = ((m)localObject).a(paramLong);
          if ((i1 != -1) && (i1 != i2))
          {
            l3 = f[i1];
            paramLong = c[i1];
            break label230;
          }
        }
        paramLong = l1;
      }
      else
      {
        l2 = Long.MAX_VALUE;
      }
      long l4 = -1L;
      long l3 = -9223372036854775807L;
      long l1 = paramLong;
      paramLong = l4;
      label230:
      int i2 = 0;
      l4 = paramLong;
      for (;;)
      {
        localObject = s;
        if (i2 >= localObject.length) {
          break;
        }
        long l5 = l4;
        long l6 = l2;
        if (i2 != u)
        {
          localObject = b;
          for (i1 = e0.f(f, l1, false); i1 >= 0; i1--) {
            if ((g[i1] & 0x1) != 0) {
              break label314;
            }
          }
          i1 = -1;
          label314:
          int i3 = i1;
          if (i1 == -1) {
            i3 = ((m)localObject).a(l1);
          }
          if (i3 == -1) {
            paramLong = l2;
          } else {
            paramLong = Math.min(c[i3], l2);
          }
          l5 = l4;
          l6 = paramLong;
          if (l3 != -9223372036854775807L)
          {
            for (i1 = e0.f(f, l3, false); i1 >= 0; i1--) {
              if ((g[i1] & 0x1) != 0) {
                break label414;
              }
            }
            i1 = -1;
            label414:
            i3 = i1;
            if (i1 == -1) {
              i3 = ((m)localObject).a(l3);
            }
            if (i3 == -1)
            {
              l5 = l4;
              l6 = paramLong;
            }
            else
            {
              l5 = Math.min(c[i3], l4);
              l6 = paramLong;
            }
          }
        }
        i2++;
        l4 = l5;
        l2 = l6;
      }
      localObject = new c4.u(l1, l2);
      if (l3 == -9223372036854775807L) {
        localObject = new t.a((c4.u)localObject, (c4.u)localObject);
      } else {
        localObject = new t.a((c4.u)localObject, new c4.u(l3, l4));
      }
    }
    return (t.a)localObject;
  }
  
  public final long h()
  {
    return v;
  }
  
  public final boolean i(c4.i parami)
  {
    boolean bool;
    if ((a & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return a0.L(parami, false, bool);
  }
  
  public final void j(long paramLong)
  {
    while ((!f.isEmpty()) && (f.peek()).b == paramLong))
    {
      Object localObject1 = (a.a)f.pop();
      if (a == 1836019574)
      {
        Object localObject2 = new ArrayList();
        boolean bool1;
        if (w == 1) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        Object localObject5 = new p();
        Object localObject6 = ((a.a)localObject1).c(1969517665);
        Object localObject8;
        int i2;
        boolean bool2;
        if (localObject6 != null)
        {
          localObject7 = b.a;
          localObject8 = b;
          ((v5.u)localObject8).G(8);
          localObject9 = null;
          for (localObject10 = null;; localObject10 = localObject6)
          {
            i1 = c;
            i2 = b;
            if (i1 - i2 < 8) {
              break;
            }
            int i3 = ((v5.u)localObject8).f();
            i1 = ((v5.u)localObject8).f();
            if (i1 == 1835365473)
            {
              ((v5.u)localObject8).G(i2);
              ((v5.u)localObject8).H(8);
              i4 = b;
              ((v5.u)localObject8).H(4);
              i1 = i4;
              if (((v5.u)localObject8).f() != 1751411826) {
                i1 = i4 + 4;
              }
              ((v5.u)localObject8).G(i1);
              for (;;)
              {
                i4 = b;
                if (i4 >= i2 + i3) {
                  break;
                }
                i1 = ((v5.u)localObject8).f();
                if (((v5.u)localObject8).f() == 1768715124)
                {
                  ((v5.u)localObject8).G(i4);
                  i5 = i4 + i1;
                  ((v5.u)localObject8).H(8);
                  localObject11 = new ArrayList();
                  localObject6 = localObject2;
                  int i6;
                  for (;;)
                  {
                    i1 = b;
                    if (i1 >= i5) {
                      break label1444;
                    }
                    i6 = ((v5.u)localObject8).f() + i1;
                    i1 = ((v5.u)localObject8).f();
                    i4 = i1 >> 24 & 0xFF;
                    if ((i4 == 169) || (i4 == 253) || (i1 == 1735291493)) {}
                    for (;;)
                    {
                      try
                      {
                        i1 = f.e((v5.u)localObject8);
                        if (i1 > 0)
                        {
                          localObject2 = f.a;
                          if (i1 <= 192)
                          {
                            localObject2 = localObject2[(i1 - 1)];
                            continue;
                          }
                        }
                        localObject2 = null;
                        if (localObject2 != null)
                        {
                          localObject2 = new l("TCON", null, o7.t.t(localObject2));
                        }
                        else
                        {
                          v5.m.f("MetadataUtil", "Failed to parse standard genre code");
                          bool2 = bool1;
                          continue;
                          if (i1 == 1684632427)
                          {
                            localObject2 = "TPOS";
                          }
                          else
                          {
                            if (i1 != 1953655662) {
                              continue;
                            }
                            localObject2 = "TRCK";
                          }
                          i4 = ((v5.u)localObject8).f();
                          if ((((v5.u)localObject8).f() == 1684108385) && (i4 >= 22))
                          {
                            ((v5.u)localObject8).H(10);
                            i4 = ((v5.u)localObject8).A();
                            if (i4 > 0)
                            {
                              localObject7 = new java/lang/StringBuilder;
                              ((StringBuilder)localObject7).<init>();
                              ((StringBuilder)localObject7).append("");
                              ((StringBuilder)localObject7).append(i4);
                              localObject9 = ((StringBuilder)localObject7).toString();
                              i1 = ((v5.u)localObject8).A();
                              localObject7 = localObject9;
                              if (i1 > 0)
                              {
                                localObject7 = new java/lang/StringBuilder;
                                ((StringBuilder)localObject7).<init>();
                                ((StringBuilder)localObject7).append((String)localObject9);
                                ((StringBuilder)localObject7).append("/");
                                ((StringBuilder)localObject7).append(i1);
                                localObject7 = ((StringBuilder)localObject7).toString();
                              }
                              localObject2 = new l((String)localObject2, null, o7.t.t(localObject7));
                              continue;
                            }
                          }
                          localObject2 = null;
                          localObject7 = new java/lang/StringBuilder;
                          ((StringBuilder)localObject7).<init>();
                          ((StringBuilder)localObject7).append("Failed to parse index/count attribute: ");
                          ((StringBuilder)localObject7).append(a.a(i1));
                          v5.m.f("MetadataUtil", ((StringBuilder)localObject7).toString());
                          continue;
                          localObject7 = null;
                          if (i1 == 1953329263)
                          {
                            localObject2 = f.d(i1, "TBPM", (v5.u)localObject8, true, false);
                            continue;
                          }
                          if (i1 == 1668311404)
                          {
                            localObject2 = "TCMP";
                            bool2 = true;
                          }
                          else
                          {
                            if (i1 == 1668249202)
                            {
                              localObject2 = f.b((v5.u)localObject8);
                              continue;
                            }
                            if (i1 == 1631670868)
                            {
                              localObject2 = "TPE2";
                              continue;
                            }
                            if (i1 == 1936682605)
                            {
                              localObject2 = "TSOT";
                              continue;
                            }
                            if (i1 == 1936679276)
                            {
                              localObject2 = "TSO2";
                              continue;
                            }
                            if (i1 == 1936679282)
                            {
                              localObject2 = "TSOA";
                              continue;
                            }
                            if (i1 == 1936679265)
                            {
                              localObject2 = "TSOP";
                              continue;
                            }
                            if (i1 == 1936679791)
                            {
                              localObject2 = "TSOC";
                              continue;
                            }
                            if (i1 != 1920233063) {
                              continue;
                            }
                            localObject2 = "ITUNESADVISORY";
                            bool2 = false;
                          }
                          localObject2 = f.d(i1, (String)localObject2, (v5.u)localObject8, bool2, bool2);
                          continue;
                          if (i1 != 1885823344) {
                            continue;
                          }
                          localObject2 = f.d(i1, "ITUNESGAPLESS", (v5.u)localObject8, false, true);
                          continue;
                        }
                        break label1411;
                        if (i1 == 1936683886)
                        {
                          localObject2 = "TVSHOWSORT";
                        }
                        else
                        {
                          if (i1 != 1953919848) {
                            continue;
                          }
                          localObject2 = "TVSHOW";
                        }
                        break label1400;
                        if (i1 == 757935405)
                        {
                          i1 = -1;
                          i4 = -1;
                          localObject2 = null;
                          i7 = b;
                          if (i7 < i6)
                          {
                            i8 = ((v5.u)localObject8).f();
                            int i9 = ((v5.u)localObject8).f();
                            ((v5.u)localObject8).H(4);
                            if (i9 == 1835360622)
                            {
                              localObject7 = ((v5.u)localObject8).q(i8 - 12);
                            }
                            else if (i9 == 1851878757)
                            {
                              localObject2 = ((v5.u)localObject8).q(i8 - 12);
                            }
                            else
                            {
                              if (i9 == 1684108385)
                              {
                                i1 = i8;
                                i4 = i7;
                              }
                              ((v5.u)localObject8).H(i8 - 12);
                            }
                            continue;
                          }
                          bool2 = bool1;
                          if (localObject7 != null)
                          {
                            bool2 = bool1;
                            if (localObject2 != null) {
                              if (i4 == -1)
                              {
                                bool2 = bool1;
                              }
                              else
                              {
                                ((v5.u)localObject8).G(i4);
                                ((v5.u)localObject8).H(16);
                                localObject2 = new u4.i((String)localObject7, (String)localObject2, ((v5.u)localObject8).q(i1 - 16));
                                break label1411;
                              }
                            }
                          }
                          bool1 = bool2;
                          localObject2 = null;
                        }
                      }
                      finally
                      {
                        break label1434;
                      }
                      bool2 = bool1;
                      i4 = 0xFFFFFF & i1;
                      if (i4 == 6516084)
                      {
                        localObject2 = f.a(i1, (v5.u)localObject8);
                        bool1 = bool2;
                        break label1411;
                      }
                      if ((i4 == 7233901) || (i4 == 7631467)) {
                        break label1395;
                      }
                      if ((i4 == 6516589) || (i4 == 7828084)) {
                        break;
                      }
                      if (i4 == 6578553)
                      {
                        localObject4 = "TDRC";
                        break label1400;
                      }
                      if (i4 == 4280916)
                      {
                        localObject4 = "TPE1";
                        break label1400;
                      }
                      if (i4 == 7630703)
                      {
                        localObject4 = "TSSE";
                        break label1400;
                      }
                      if (i4 == 6384738)
                      {
                        localObject4 = "TALB";
                        break label1400;
                      }
                      if (i4 == 7108978)
                      {
                        localObject4 = "USLT";
                        break label1400;
                      }
                      if (i4 == 6776174)
                      {
                        localObject4 = f.c(i1, (v5.u)localObject8, "TCON");
                        bool1 = bool2;
                        break label1411;
                      }
                      if (i4 == 6779504)
                      {
                        localObject4 = "TIT1";
                        break label1400;
                      }
                      localObject4 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject4).<init>();
                      ((StringBuilder)localObject4).append("Skipped unknown metadata entry: ");
                      ((StringBuilder)localObject4).append(a.a(i1));
                      v5.m.b("MetadataUtil", ((StringBuilder)localObject4).toString());
                    }
                    localObject4 = "TCOM";
                    break label1400;
                    label1395:
                    localObject4 = "TIT2";
                    label1400:
                    localObject4 = f.c(i1, (v5.u)localObject8, (String)localObject4);
                    label1411:
                    ((v5.u)localObject8).G(i6);
                    if (localObject4 != null) {
                      ((ArrayList)localObject11).add(localObject4);
                    }
                  }
                  label1434:
                  ((v5.u)localObject8).G(i6);
                  throw ((Throwable)localObject4);
                  label1444:
                  localObject4 = null;
                  if (((ArrayList)localObject11).isEmpty())
                  {
                    localObject7 = localObject6;
                    break label1504;
                  }
                  localObject4 = new p4.a((List)localObject11);
                  localObject7 = localObject6;
                  break label1504;
                }
                ((v5.u)localObject8).G(i4 + i1);
              }
              localObject6 = null;
              localObject7 = localObject4;
              localObject4 = localObject6;
              label1504:
              localObject11 = localObject4;
              localObject6 = localObject10;
            }
            else
            {
              bool2 = bool1;
              localObject11 = localObject9;
              localObject6 = localObject10;
              localObject7 = localObject4;
              bool1 = bool2;
              if (i1 == 1936553057)
              {
                ((v5.u)localObject8).G(i2);
                ((v5.u)localObject8).H(12);
                for (;;)
                {
                  i4 = b;
                  if (i4 >= i2 + i3) {
                    break;
                  }
                  i1 = ((v5.u)localObject8).f();
                  if (((v5.u)localObject8).f() == 1935766900)
                  {
                    if (i1 < 14) {
                      break;
                    }
                    ((v5.u)localObject8).H(5);
                    i1 = ((v5.u)localObject8).v();
                    if ((i1 != 12) && (i1 != 13)) {
                      break;
                    }
                    float f1;
                    if (i1 == 12) {
                      f1 = 240.0F;
                    } else {
                      f1 = 120.0F;
                    }
                    ((v5.u)localObject8).H(1);
                    localObject6 = new p4.a(new p4.a.b[] { new e(f1, ((v5.u)localObject8).v()) });
                    localObject11 = localObject9;
                    localObject7 = localObject4;
                    bool1 = bool2;
                    break label1731;
                  }
                  ((v5.u)localObject8).G(i4 + i1);
                }
                localObject6 = null;
                bool1 = bool2;
                localObject7 = localObject4;
                localObject11 = localObject9;
              }
            }
            label1731:
            ((v5.u)localObject8).G(i2 + i3);
            localObject4 = localObject7;
            localObject9 = localObject11;
          }
          localObject7 = localObject4;
          localObject6 = Pair.create(localObject9, localObject10);
          localObject4 = (p4.a)first;
          localObject6 = (p4.a)second;
          if (localObject4 != null) {
            ((p)localObject5).b((p4.a)localObject4);
          }
        }
        else
        {
          localObject7 = localObject4;
          localObject6 = null;
          localObject4 = localObject6;
        }
        Object localObject10 = ((a.a)localObject1).b(1835365473);
        Object localObject12;
        if (localObject10 != null)
        {
          localObject9 = b.a;
          localObject11 = ((a.a)localObject10).c(1751411826);
          localObject9 = ((a.a)localObject10).c(1801812339);
          localObject10 = ((a.a)localObject10).c(1768715124);
          if ((localObject11 != null) && (localObject9 != null) && (localObject10 != null))
          {
            localObject11 = b;
            ((v5.u)localObject11).G(16);
            if (((v5.u)localObject11).f() == 1835299937)
            {
              localObject11 = b;
              ((v5.u)localObject11).G(12);
              i4 = ((v5.u)localObject11).f();
              localObject9 = new String[i4];
              for (i1 = 0; i1 < i4; i1++)
              {
                i5 = ((v5.u)localObject11).f();
                ((v5.u)localObject11).H(4);
                localObject9[i1] = ((v5.u)localObject11).s(i5 - 8);
              }
              localObject11 = b;
              ((v5.u)localObject11).G(8);
              localObject8 = new ArrayList();
              i1 = i4;
              for (;;)
              {
                i4 = c;
                i5 = b;
                if (i4 - i5 <= 8) {
                  break;
                }
                i8 = ((v5.u)localObject11).f();
                i4 = ((v5.u)localObject11).f() - 1;
                if ((i4 >= 0) && (i4 < i1))
                {
                  localObject12 = localObject9[i4];
                  for (;;)
                  {
                    i4 = b;
                    if (i4 >= i5 + i8) {
                      break;
                    }
                    i2 = ((v5.u)localObject11).f();
                    if (((v5.u)localObject11).f() == 1684108385)
                    {
                      i7 = ((v5.u)localObject11).f();
                      i4 = ((v5.u)localObject11).f();
                      i2 -= 16;
                      localObject10 = new byte[i2];
                      ((v5.u)localObject11).d((byte[])localObject10, 0, i2);
                      localObject10 = new v4.a((String)localObject12, (byte[])localObject10, i4, i7);
                      break label2169;
                    }
                    ((v5.u)localObject11).G(i4 + i2);
                  }
                  localObject10 = null;
                  label2169:
                  i4 = i1;
                  i1 = i4;
                  if (localObject10 != null)
                  {
                    ((ArrayList)localObject8).add(localObject10);
                    i1 = i4;
                  }
                }
                else
                {
                  f.p("Skipped metadata with unknown key index: ", i4, "AtomParsers");
                }
                ((v5.u)localObject11).G(i5 + i8);
              }
              if (!((ArrayList)localObject8).isEmpty())
              {
                localObject9 = new p4.a((List)localObject8);
                break label2249;
              }
            }
          }
        }
        Object localObject9 = null;
        label2249:
        int i4 = -1;
        if ((a & 0x1) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        long l1 = -9223372036854775807L;
        localObject10 = b.e((a.a)localObject1, (p)localObject5, -9223372036854775807L, null, bool2, bool1, new g());
        int i7 = ((ArrayList)localObject10).size();
        int i8 = 0;
        int i1 = i4;
        Object localObject11 = localObject7;
        Object localObject7 = localObject5;
        localObject5 = localObject10;
        while (i8 < i7)
        {
          localObject10 = (m)((ArrayList)localObject5).get(i8);
          if (b == 0)
          {
            localObject10 = localObject6;
            i4 = -1;
            localObject6 = localObject4;
            localObject4 = localObject10;
          }
          else
          {
            localObject12 = a;
            l2 = e;
            if (l2 == -9223372036854775807L) {
              l2 = h;
            }
            l1 = Math.max(l1, l2);
            a locala = new a((j)localObject12, (m)localObject10, r.r(i8, b));
            if ("audio/true-hd".equals(f.t)) {
              i4 = e * 16;
            } else {
              i4 = e + 30;
            }
            localObject1 = f;
            localObject1.getClass();
            i0.a locala1 = new i0.a((i0)localObject1);
            l = i4;
            i5 = b;
            if ((i5 == 2) && (l2 > 0L))
            {
              i4 = b;
              if (i4 > 1) {
                r = (i4 / ((float)l2 / 1000000.0F));
              }
            }
            if (i5 == 1)
            {
              i2 = a;
              if ((i2 != -1) && (b != -1)) {
                i4 = 1;
              } else {
                i4 = 0;
              }
              if (i4 != 0)
              {
                A = i2;
                B = b;
              }
            }
            localObject8 = new p4.a[2];
            localObject8[0] = localObject6;
            if (h.isEmpty()) {
              localObject10 = null;
            } else {
              localObject10 = new p4.a(h);
            }
            localObject8[1] = localObject10;
            localObject1 = new p4.a(new p4.a.b[0]);
            p4.a.b[] arrayOfb;
            if (i5 == 1)
            {
              localObject10 = localObject1;
              if (localObject4 != null) {
                localObject10 = localObject4;
              }
            }
            else
            {
              localObject10 = localObject1;
              if (i5 == 2)
              {
                localObject10 = localObject1;
                if (localObject9 != null) {
                  for (i4 = 0;; i4++)
                  {
                    arrayOfb = a;
                    localObject10 = localObject1;
                    if (i4 >= arrayOfb.length) {
                      break;
                    }
                    localObject10 = arrayOfb[i4];
                    if ((localObject10 instanceof v4.a))
                    {
                      localObject10 = (v4.a)localObject10;
                      if ("com.android.capture.fps".equals(a))
                      {
                        localObject10 = new p4.a(new p4.a.b[] { localObject10 });
                        break;
                      }
                    }
                  }
                }
              }
            }
            i4 = 0;
            localObject1 = localObject10;
            localObject10 = localObject8;
            while (i4 < 2)
            {
              localObject8 = localObject10[i4];
              if (localObject8 != null)
              {
                localObject8 = a;
                if (localObject8.length == 0) {}
              }
              else
              {
                l2 = b;
                arrayOfb = a;
                i5 = e0.a;
                localObject1 = Arrays.copyOf(arrayOfb, arrayOfb.length + localObject8.length);
                System.arraycopy(localObject8, 0, localObject1, arrayOfb.length, localObject8.length);
                localObject1 = new p4.a(l2, (p4.a.b[])localObject1);
              }
              i4++;
            }
            localObject10 = localObject4;
            if (a.length > 0) {
              i = ((p4.a)localObject1);
            }
            c.d(new i0(locala1));
            if (b == 2)
            {
              i5 = i1;
              if (i1 == -1) {
                i5 = ((ArrayList)localObject11).size();
              }
            }
            else
            {
              i5 = i1;
            }
            ((ArrayList)localObject11).add(locala);
            i4 = -1;
            localObject4 = localObject6;
            localObject6 = localObject10;
            i1 = i5;
          }
          i8++;
          localObject10 = localObject6;
          localObject6 = localObject4;
          localObject4 = localObject10;
        }
        long l2 = 0L;
        u = i1;
        v = l1;
        localObject10 = (a[])((ArrayList)localObject11).toArray(new a[0]);
        s = ((a[])localObject10);
        Object localObject4 = new long[localObject10.length][];
        localObject11 = new int[localObject10.length];
        localObject6 = new long[localObject10.length];
        localObject9 = new boolean[localObject10.length];
        for (i1 = 0; i1 < localObject10.length; i1++)
        {
          localObject4[i1] = new long[b.b];
          localObject6[i1] = b.f[0];
        }
        int i5 = 0;
        l1 = l2;
        while (i5 < localObject10.length)
        {
          long l3 = Long.MAX_VALUE;
          i1 = 0;
          for (i8 = i4; i1 < localObject10.length; i8 = i7)
          {
            l2 = l3;
            i7 = i8;
            if (localObject9[i1] == 0)
            {
              long l4 = localObject6[i1];
              l2 = l3;
              i7 = i8;
              if (l4 <= l3)
              {
                i7 = i1;
                l2 = l4;
              }
            }
            i1++;
            l3 = l2;
          }
          i1 = localObject11[i8];
          localObject7 = localObject4[i8];
          localObject7[i1] = l1;
          localObject5 = b;
          l1 += d[i1];
          i1++;
          localObject11[i8] = i1;
          if (i1 < localObject7.length)
          {
            localObject6[i8] = f[i1];
          }
          else
          {
            localObject9[i8] = 1;
            i5++;
          }
        }
        t = ((long[][])localObject4);
        r.m();
        r.t(this);
        f.clear();
        i = 2;
      }
      else if (!f.isEmpty())
      {
        f.peek()).d.add(localObject1);
      }
    }
    if (i != 2)
    {
      i = 0;
      l = 0;
    }
  }
  
  public final void release() {}
  
  public static final class a
  {
    public final j a;
    public final m b;
    public final v c;
    public final w d;
    public int e;
    
    public a(j paramj, m paramm, v paramv)
    {
      a = paramj;
      b = paramm;
      c = paramv;
      if ("audio/true-hd".equals(f.t)) {
        paramj = new w();
      } else {
        paramj = null;
      }
      d = paramj;
    }
  }
}

/* Location:
 * Qualified Name:     k4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */