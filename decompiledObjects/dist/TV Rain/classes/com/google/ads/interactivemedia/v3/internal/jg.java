package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class jg
  implements iz
{
  private final vz a = new vz(new byte[5]);
  private final SparseArray<jj> b = new SparseArray();
  private final SparseIntArray c = new SparseIntArray();
  private final int d;
  
  public jg(je paramje, int paramInt)
  {
    d = paramInt;
  }
  
  public final void a(vy paramvy)
  {
    if (paramvy.e() != 2) {
      return;
    }
    Object localObject1;
    if ((je.c(e) != 1) && (je.c(e) != 2) && (je.d(e) != 1))
    {
      localObject1 = new wi(((wi)je.e(e).get(0)).a());
      je.e(e).add(localObject1);
    }
    else
    {
      localObject1 = (wi)je.e(e).get(0);
    }
    paramvy.d(2);
    int i = paramvy.f();
    paramvy.d(3);
    paramvy.a(a, 2);
    a.b(3);
    je.a(e, a.c(13));
    paramvy.a(a, 2);
    Object localObject2 = a;
    int j = 4;
    ((vz)localObject2).b(4);
    paramvy.d(a.c(12));
    int k = je.c(e);
    int m = 21;
    Object localObject3;
    if ((k == 2) && (je.f(e) == null))
    {
      localObject2 = new jl(21, null, null, wl.f);
      localObject3 = e;
      je.a((je)localObject3, je.g((je)localObject3).a(21, (jl)localObject2));
      je.f(e).a((wi)localObject1, je.h(e), new jn(i, 21, 8192));
    }
    b.clear();
    c.clear();
    int i6;
    for (k = paramvy.b(); k > 0; k = i6)
    {
      paramvy.a(a, 5);
      int n = a.c(8);
      a.b(3);
      int i1 = a.c(13);
      a.b(j);
      int i2 = a.c(12);
      int i3 = paramvy.d();
      int i4 = i3 + i2;
      int i5 = -1;
      localObject2 = null;
      ArrayList localArrayList = null;
      i6 = m;
      m = i5;
      while (paramvy.d() < i4)
      {
        int i7 = paramvy.e();
        j = paramvy.e();
        i5 = paramvy.d() + j;
        if (i7 == 5)
        {
          long l = paramvy.j();
          if (l != 1094921523L)
          {
            if (l == 1161904947L) {
              break label541;
            }
            if (l == 1094921524L)
            {
              j = 172;
              break label531;
            }
            j = m;
            localObject3 = localObject2;
            if (l != 1212503619L) {
              break label601;
            }
            j = 36;
            localObject3 = localObject2;
            break label601;
          }
        }
        else
        {
          if (i7 != 106) {
            break label534;
          }
        }
        j = 129;
        label531:
        break label720;
        label534:
        if (i7 == 122)
        {
          label541:
          j = 135;
        }
        else
        {
          if (i7 == 127)
          {
            j = m;
            localObject3 = localObject2;
            if (paramvy.e() == i6)
            {
              j = 172;
              localObject3 = localObject2;
            }
          }
          else
          {
            if (i7 != 123) {
              break label608;
            }
            j = 138;
            localObject3 = localObject2;
          }
          label601:
          label608:
          label632:
          do
          {
            for (;;)
            {
              localObject2 = localObject3;
              break;
              if (i7 != 10) {
                break label632;
              }
              localObject3 = paramvy.e(3).trim();
              j = m;
            }
            j = m;
            localObject3 = localObject2;
          } while (i7 != 89);
          localArrayList = new ArrayList();
          while (paramvy.d() < i5)
          {
            String str = paramvy.e(3).trim();
            j = paramvy.e();
            localObject3 = new byte[4];
            paramvy.a((byte[])localObject3, 0, 4);
            localArrayList.add(new ji(str, j, (byte[])localObject3));
          }
          j = 89;
        }
        label720:
        paramvy.d(i5 - paramvy.d());
        i5 = 4;
        i6 = 21;
        m = j;
        j = i5;
      }
      paramvy.c(i4);
      localObject2 = new jl(m, (String)localObject2, localArrayList, Arrays.copyOfRange(a, i3, i4));
      m = n;
      if (n == 6) {
        m = a;
      }
      i6 = k - (i2 + 5);
      if (je.c(e) == 2) {
        k = m;
      } else {
        k = i1;
      }
      if (!je.i(e).get(k))
      {
        if ((je.c(e) == 2) && (m == 21)) {
          localObject2 = je.f(e);
        } else {
          localObject2 = je.g(e).a(m, (jl)localObject2);
        }
        if ((je.c(e) != 2) || (i1 < c.get(k, 8192)))
        {
          c.put(k, i1);
          b.put(k, localObject2);
        }
      }
      m = 21;
    }
    paramvy = (vy)localObject1;
    m = c.size();
    for (j = 0; j < m; j++)
    {
      i6 = c.keyAt(j);
      k = c.valueAt(j);
      je.i(e).put(i6, true);
      je.j(e).put(k, true);
      localObject1 = (jj)b.valueAt(j);
      if (localObject1 != null)
      {
        if (localObject1 != je.f(e)) {
          ((jj)localObject1).a(paramvy, je.h(e), new jn(i, i6, 8192));
        }
        je.a(e).put(k, localObject1);
      }
    }
    if (je.c(e) == 2)
    {
      if (!je.k(e))
      {
        je.h(e).a();
        je.b(e, 0);
        je.a(e, true);
      }
    }
    else
    {
      je.a(e).remove(d);
      paramvy = e;
      if (je.c(paramvy) == 1) {
        j = 0;
      } else {
        j = je.d(e) - 1;
      }
      je.b(paramvy, j);
      if (je.d(e) == 0)
      {
        je.h(e).a();
        je.a(e, true);
      }
    }
  }
  
  public final void a(wi paramwi, fy paramfy, jn paramjn) {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */