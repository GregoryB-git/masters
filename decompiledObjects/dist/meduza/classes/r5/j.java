package r5;

import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n7.q;
import o7.g0;
import o7.h0;
import o7.l0;
import o7.n;
import o7.n.a;
import o7.r;
import o7.t;
import o7.t.a;
import p2.m0;
import t5.e;
import v3.k1;
import v3.l1;
import v3.s1;
import v3.s1.a;
import v5.e0;
import x6.b;

public abstract class j
  extends o
{
  public a c;
  
  public final void a(Object paramObject)
  {
    c = ((a)paramObject);
  }
  
  public final p c(k1[] arg1, z4.j0 paramj0)
  {
    Object localObject1 = new int[???.length + 1];
    int i = ???.length + 1;
    Object localObject2 = new z4.i0[i][];
    Object localObject3 = new int[???.length + 1][][];
    int k;
    for (int j = 0; j < i; j++)
    {
      k = a;
      localObject2[j] = new z4.i0[k];
      localObject3[j] = new int[k][];
    }
    i = ???.length;
    Object localObject4 = new int[i];
    for (j = 0; j < i; j++) {
      localObject4[j] = ???[j].o();
    }
    int n;
    int i1;
    int i2;
    Object localObject7;
    for (int m = 0;; m++)
    {
      localObject5 = paramj0;
      if (m >= a) {
        break;
      }
      localObject6 = ((z4.j0)localObject5).a(m);
      if (c == 5) {
        n = 1;
      } else {
        n = 0;
      }
      i1 = ???.length;
      i2 = 1;
      j = 0;
      int i3 = 0;
      while (j < ???.length)
      {
        localObject5 = ???[j];
        i = 0;
        for (k = 0; k < a; k++) {
          i = Math.max(i, ((k1)localObject5).a(d[k]) & 0x7);
        }
        if (localObject1[j] == 0) {
          k = 1;
        } else {
          k = 0;
        }
        int i4;
        int i5;
        int i6;
        if (i <= i3)
        {
          i4 = i1;
          i5 = i3;
          i6 = i2;
          if (i == i3)
          {
            i4 = i1;
            i5 = i3;
            i6 = i2;
            if (n != 0)
            {
              i4 = i1;
              i5 = i3;
              i6 = i2;
              if (i2 == 0)
              {
                i4 = i1;
                i5 = i3;
                i6 = i2;
                if (k == 0) {}
              }
            }
          }
        }
        else
        {
          i4 = j;
          i6 = k;
          i5 = i;
        }
        j++;
        i1 = i4;
        i3 = i5;
        i2 = i6;
      }
      if (i1 == ???.length)
      {
        localObject5 = new int[a];
      }
      else
      {
        localObject7 = ???[i1];
        localObject5 = new int[a];
        for (j = 0; j < a; j++) {
          localObject5[j] = ((k1)localObject7).a(d[j]);
        }
      }
      j = localObject1[i1];
      localObject2[i1][j] = localObject6;
      localObject3[i1][j] = localObject5;
      localObject1[i1] = (j + 1);
    }
    Object localObject6 = new z4.j0[???.length];
    Object localObject5 = new String[???.length];
    paramj0 = new int[???.length];
    for (j = 0; j < ???.length; j++)
    {
      i = localObject1[j];
      localObject6[j] = new z4.j0((z4.i0[])e0.K(i, localObject2[j]));
      localObject3[j] = ((int[][])e0.K(i, localObject3[j]));
      localObject5[j] = ???[j].getName();
      paramj0[j] = a;
    }
    localObject2 = new a(paramj0, (z4.j0[])localObject6, (int[])localObject4, (int[][][])localObject3, new z4.j0((z4.i0[])e0.K(localObject1[???.length], localObject2[???.length])));
    Object localObject8 = (f)this;
    synchronized (d)
    {
      localObject6 = g;
      if ((s0) && (e0.a >= 32))
      {
        paramj0 = h;
        if (paramj0 != null)
        {
          localObject5 = Looper.myLooper();
          b.K(localObject5);
          paramj0.b((f)localObject8, (Looper)localObject5);
        }
      }
      n = a;
      localObject7 = new h.a[n];
      ??? = f.l(2, (a)localObject2, (int[][][])localObject3, new k1.a(8, localObject6, localObject4), new c(1));
      if (??? != null) {
        localObject7[((Integer)second).intValue()] = ((h.a)first);
      }
      for (j = 0; j < a; j++) {
        if ((2 == b[j]) && (c[j].a > 0))
        {
          bool2 = true;
          break label802;
        }
      }
      boolean bool2 = false;
      label802:
      ??? = f.l(1, (a)localObject2, (int[][][])localObject3, new d(localObject8, localObject6, bool2), new v4.d(4));
      if (??? != null) {
        localObject7[((Integer)second).intValue()] = ((h.a)first);
      }
      if (??? == null)
      {
        ??? = null;
      }
      else
      {
        paramj0 = (h.a)first;
        ??? = a;
        j = b[0];
        ??? = d[j].c;
      }
      ??? = f.l(3, (a)localObject2, (int[][][])localObject3, new o9.l(5, localObject6, ???), new v4.d(3));
      if (??? != null) {
        localObject7[((Integer)second).intValue()] = ((h.a)first);
      }
      for (i = 0; i < n; i++)
      {
        j = b[i];
        if ((j != 2) && (j != 1) && (j != 3))
        {
          localObject4 = c[i];
          arrayOfLong = localObject3[i];
          paramj0 = null;
          k = 0;
          m = 0;
          for (??? = null; k < a; ??? = (k1[])localObject5)
          {
            localObject1 = ((z4.j0)localObject4).a(k);
            long l1 = arrayOfLong[k];
            localObject5 = ???;
            j = 0;
            ??? = (k1[])localObject1;
            while (j < a)
            {
              if (f.i(l1[j], t0))
              {
                localObject1 = new f.b(d[j], l1[j]);
                if ((localObject5 == null) || (n.a.c(b, b).c(a, a).e() > 0))
                {
                  m = j;
                  localObject5 = localObject1;
                  paramj0 = ???;
                }
              }
              j++;
            }
            k++;
          }
          if (paramj0 == null) {
            ??? = null;
          } else {
            ??? = new h.a(0, paramj0, new int[] { m });
          }
          localObject7[i] = ???;
        }
      }
      i = a;
      paramj0 = new HashMap();
      for (j = 0; j < i; j++) {
        f.f(c[j], (f.c)localObject6, paramj0);
      }
      f.f(f, (f.c)localObject6, paramj0);
      for (j = 0; j < i; j++)
      {
        ??? = (l)paramj0.get(Integer.valueOf(b[j]));
        if (??? != null)
        {
          if ((!b.isEmpty()) && (c[j].b(a) != -1)) {
            ??? = new h.a(0, a, r7.a.F(b));
          } else {
            ??? = null;
          }
          localObject7[j] = ???;
        }
      }
      k = a;
      for (j = 0; j < k; j++)
      {
        paramj0 = c[j];
        ??? = (Map)w0.get(j);
        if ((??? != null) && (???.containsKey(paramj0))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          ??? = (Map)w0.get(j);
          if (??? != null) {
            ??? = (f.e)???.get(paramj0);
          } else {
            ??? = null;
          }
          if ((??? != null) && (b.length != 0))
          {
            paramj0 = paramj0.a(a);
            localObject5 = b;
            ??? = new h.a(c, paramj0, (int[])localObject5);
          }
          else
          {
            ??? = null;
          }
          localObject7[j] = ???;
        }
      }
      for (j = 0; j < n; j++)
      {
        i = b[j];
        if ((!x0.get(j)) && (!H.contains(Integer.valueOf(i)))) {
          continue;
        }
        localObject7[j] = null;
      }
      ??? = e;
      localObject5 = b;
      b.K(localObject5);
      ((a.b)???).getClass();
      localObject1 = new ArrayList();
      for (j = 0; j < n; j++)
      {
        ??? = localObject7[j];
        if ((??? != null) && (b.length > 1))
        {
          ??? = t.b;
          ??? = new t.a();
          ???.c(new a.a(0L, 0L));
        }
        else
        {
          ??? = null;
        }
        ((ArrayList)localObject1).add(???);
      }
      localObject8 = new long[n][];
      long l2;
      long l3;
      for (j = 0; j < n; j++)
      {
        ??? = localObject7[j];
        if (??? == null)
        {
          localObject8[j] = new long[0];
        }
        else
        {
          localObject8[j] = new long[b.length];
          for (i = 0;; i++)
          {
            localObject4 = b;
            if (i >= localObject4.length) {
              break;
            }
            paramj0 = a;
            k = localObject4[i];
            l2 = d[k].p;
            paramj0 = localObject8[j];
            l3 = l2;
            if (l2 == -1L) {
              l3 = 0L;
            }
            paramj0[i] = l3;
          }
          Arrays.sort(localObject8[j]);
        }
      }
      int[] arrayOfInt = new int[n];
      long[] arrayOfLong = new long[n];
      for (j = 0; j < n; j++)
      {
        ??? = localObject8[j];
        if (???.length == 0) {
          l3 = 0L;
        } else {
          l3 = ???[0];
        }
        arrayOfLong[j] = l3;
      }
      a.v((ArrayList)localObject1, arrayOfLong);
      ??? = o7.j0.a;
      ???.getClass();
      m0.o(2, "expectedValuesPerKey");
      h0 localh0 = new h0(new TreeMap(???), new g0(2));
      j = 0;
      paramj0 = (z4.j0)localObject3;
      ??? = (k1[])localObject2;
      while (j < n)
      {
        localObject4 = localObject8[j];
        if (localObject4.length <= 1)
        {
          localObject4 = localObject5;
          localObject5 = ???;
        }
        else
        {
          k = localObject4.length;
          double[] arrayOfDouble = new double[k];
          i = 0;
          localObject4 = paramj0;
          paramj0 = ???;
          for (;;)
          {
            localObject3 = localObject8[j];
            ??? = (k1[])localObject4;
            m = localObject3.length;
            d1 = 0.0D;
            if (i >= m) {
              break;
            }
            l3 = localObject3[i];
            if (l3 != -1L) {
              d1 = Math.log(l3);
            }
            arrayOfDouble[i] = d1;
            i++;
            localObject4 = ???;
          }
          localObject3 = paramj0;
          localObject2 = localObject5;
          k--;
          double d1 = arrayOfDouble[k] - arrayOfDouble[0];
          i = 0;
          for (;;)
          {
            localObject5 = localObject3;
            paramj0 = ???;
            localObject4 = localObject2;
            if (i >= k) {
              break;
            }
            double d2 = arrayOfDouble[i];
            i++;
            double d3 = arrayOfDouble[i];
            if (d1 == 0.0D) {
              d3 = 1.0D;
            } else {
              d3 = ((d2 + d3) * 0.5D - arrayOfDouble[0]) / d1;
            }
            paramj0 = Double.valueOf(d3);
            localObject5 = Integer.valueOf(j);
            localObject4 = (Collection)d.get(paramj0);
            if (localObject4 == null)
            {
              localObject4 = (List)f.get();
              if (((Collection)localObject4).add(localObject5))
              {
                e += 1;
                d.put(paramj0, localObject4);
              }
              else
              {
                throw new AssertionError("New Collection violated the Collection spec");
              }
            }
            else if (((Collection)localObject4).add(localObject5))
            {
              e += 1;
            }
          }
        }
        j++;
        ??? = (k1[])localObject5;
        localObject5 = localObject4;
      }
      localObject4 = t.p(localh0.g());
      for (j = 0; j < ((AbstractCollection)localObject4).size(); j++)
      {
        k = ((Integer)((List)localObject4).get(j)).intValue();
        i = arrayOfInt[k] + 1;
        arrayOfInt[k] = i;
        arrayOfLong[k] = localObject8[k][i];
        a.v((ArrayList)localObject1, arrayOfLong);
      }
      for (j = 0; j < n; j++) {
        if (((ArrayList)localObject1).get(j) != null) {
          arrayOfLong[j] *= 2L;
        }
      }
      a.v((ArrayList)localObject1, arrayOfLong);
      localObject3 = new t.a();
      for (j = 0; j < ((ArrayList)localObject1).size(); j++)
      {
        localObject4 = (t.a)((ArrayList)localObject1).get(j);
        if (localObject4 == null) {
          localObject4 = l0.e;
        } else {
          localObject4 = ((t.a)localObject4).e();
        }
        ((t.a)localObject3).c(localObject4);
      }
      localObject2 = ((t.a)localObject3).e();
      localObject3 = new h[n];
      for (j = 0; j < n; j++)
      {
        localObject1 = localObject7[j];
        if (localObject1 != null)
        {
          localObject4 = b;
          if (localObject4.length != 0)
          {
            if (localObject4.length == 1)
            {
              localObject8 = a;
              localObject4 = new i(localObject4[0], c, (z4.i0)localObject8);
            }
            else
            {
              localObject8 = a;
              i = c;
              localObject1 = (t)((l0)localObject2).get(j);
              l2 = '✐';
              l3 = '憨';
              localObject4 = new a((z4.i0)localObject8, (int[])localObject4, i, (e)localObject5, l2, l3, l3, (t)localObject1);
            }
            localObject3[j] = localObject4;
          }
        }
      }
      localObject4 = new l1[n];
      for (j = 0; j < n; j++)
      {
        i = b[j];
        if ((!x0.get(j)) && (!H.contains(Integer.valueOf(i)))) {
          i = 0;
        } else {
          i = 1;
        }
        if ((i == 0) && ((b[j] == -2) || (localObject3[j] != null))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          localObject5 = l1.b;
        } else {
          localObject5 = null;
        }
        localObject4[j] = localObject5;
      }
      if (u0)
      {
        k = -1;
        i = -1;
        j = 0;
        while (j < a)
        {
          i2 = b[j];
          localObject5 = localObject3[j];
          if ((i2 != 1) && (i2 != 2)) {}
          while (localObject5 == null)
          {
            n = k;
            m = i;
            break;
          }
          localObject2 = paramj0[j];
          n = c[j].b(((k)localObject5).a());
          for (m = 0; m < ((k)localObject5).length(); m++) {
            if ((localObject2[n][localObject5.c(m)] & 0x20) != 32)
            {
              i1 = 0;
              break label2921;
            }
          }
          i1 = 1;
          label2921:
          n = k;
          m = i;
          if (i1 != 0)
          {
            if (i2 == 1)
            {
              if (i == -1)
              {
                m = j;
                n = k;
                break label2980;
              }
            }
            else {
              if (k == -1) {
                break label2972;
              }
            }
            j = 0;
            break label2997;
            label2972:
            n = j;
            m = i;
          }
          label2980:
          j++;
          k = n;
          i = m;
        }
        j = 1;
        label2997:
        if ((i != -1) && (k != -1)) {
          m = 1;
        } else {
          m = 0;
        }
        if ((j & m) != 0)
        {
          paramj0 = new l1(true);
          localObject4[i] = paramj0;
          localObject4[k] = paramj0;
        }
      }
      localObject3 = Pair.create(localObject4, localObject3);
      localObject4 = (k[])second;
      localObject5 = new List[localObject4.length];
      for (j = 0; j < localObject4.length; j++)
      {
        paramj0 = localObject4[j];
        if (paramj0 != null)
        {
          paramj0 = t.t(paramj0);
        }
        else
        {
          paramj0 = t.b;
          paramj0 = l0.e;
        }
        localObject5[j] = paramj0;
      }
      localObject2 = new t.a();
      i = 0;
      paramj0 = (z4.j0)localObject5;
      while (i < a)
      {
        localObject1 = c[i];
        localObject6 = paramj0[i];
        for (k = 0; k < a; k++)
        {
          localObject7 = ((z4.j0)localObject1).a(k);
          n = c[i].a(k).a;
          localObject5 = new int[n];
          j = 0;
          m = 0;
          while (j < n)
          {
            if ((e[i][k][j] & 0x7) == 4)
            {
              localObject5[m] = j;
              m++;
            }
            j++;
          }
          localObject8 = Arrays.copyOf((int[])localObject5, m);
          j = 16;
          n = 0;
          i1 = 0;
          m = 0;
          localObject5 = null;
          boolean bool1;
          while (n < localObject8.length)
          {
            i2 = localObject8[n];
            localObject4 = c[i].a(k).d[i2].t;
            if (m == 0) {
              localObject5 = localObject4;
            } else {
              bool1 = e0.a(localObject5, localObject4) ^ true | i1;
            }
            j = Math.min(j, e[i][k][n] & 0x18);
            n++;
            m++;
          }
          m = j;
          if (bool1) {
            m = Math.min(j, d[i]);
          }
          if (m != 0) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          j = a;
          localObject8 = new int[j];
          localObject5 = new boolean[j];
          for (j = 0; j < a; j++)
          {
            localObject8[j] = (e[i][k][j] & 0x7);
            for (m = 0; m < ((List)localObject6).size(); m++)
            {
              localObject4 = (k)((List)localObject6).get(m);
              if ((((k)localObject4).a().equals(localObject7)) && (((k)localObject4).f(j) != -1))
              {
                i7 = 1;
                break label3539;
              }
            }
            int i7 = 0;
            label3539:
            localObject5[j] = i7;
          }
          ((t.a)localObject2).c(new s1.a((z4.i0)localObject7, bool2, (int[])localObject8, (boolean[])localObject5));
        }
        i++;
      }
      localObject5 = f;
      for (j = 0; j < a; j++)
      {
        paramj0 = ((z4.j0)localObject5).a(j);
        localObject4 = new int[a];
        Arrays.fill((int[])localObject4, 0);
        ((t.a)localObject2).c(new s1.a(paramj0, false, (int[])localObject4, new boolean[a]));
      }
      paramj0 = new s1(((t.a)localObject2).e());
      return new p((l1[])first, (h[])second, paramj0, ???);
    }
  }
  
  public final a e()
  {
    return c;
  }
  
  public static final class a
  {
    public final int a;
    public final int[] b;
    public final z4.j0[] c;
    public final int[] d;
    public final int[][][] e;
    public final z4.j0 f;
    
    public a(int[] paramArrayOfInt1, z4.j0[] paramArrayOfj0, int[] paramArrayOfInt2, int[][][] paramArrayOfInt, z4.j0 paramj0)
    {
      b = paramArrayOfInt1;
      c = paramArrayOfj0;
      e = paramArrayOfInt;
      d = paramArrayOfInt2;
      f = paramj0;
      a = paramArrayOfInt1.length;
    }
  }
}

/* Location:
 * Qualified Name:     r5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */