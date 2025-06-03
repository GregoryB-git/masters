package com.google.ads.interactivemedia.v3.internal;

import a;
import android.util.Pair;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

final class pa
  implements mo, ny<or<os>>, ot<os>
{
  private static final Pattern b = Pattern.compile("CC([1-4])=(.+)");
  public final int a;
  private final rt c;
  private final vc d;
  private final fj<?> e;
  private final un f;
  private final long g;
  private final ux h;
  private final tk i;
  private final of j;
  private final pd[] k;
  private final ly l;
  private final ps m;
  private final IdentityHashMap<or<os>, px> n;
  private final mu o;
  private mr p;
  private or<os>[] q;
  private pt[] r;
  private nz s;
  private aaa t;
  private int u;
  private List<py> v;
  private boolean w;
  
  public pa(int paramInt1, aaa paramaaa, int paramInt2, rt paramrt, vc paramvc, fj<?> paramfj, un paramun, mu parammu, long paramLong, ux paramux, tk paramtk, ly paramly, pu parampu)
  {
    a = paramInt1;
    t = paramaaa;
    u = paramInt2;
    c = paramrt;
    d = paramvc;
    e = paramfj;
    f = paramun;
    o = parammu;
    g = paramLong;
    h = paramux;
    i = paramtk;
    l = paramly;
    m = new ps(paramaaa, parampu, paramtk);
    q = new or[0];
    r = new pt[0];
    n = new IdentityHashMap();
    s = paramly.a(q);
    paramaaa = paramaaa.a(paramInt2);
    paramtk = d;
    v = paramtk;
    paramun = c;
    int i1 = paramun.size();
    paramux = new SparseIntArray(i1);
    for (paramInt1 = 0; paramInt1 < i1; paramInt1++) {
      paramux.put(geta, paramInt1);
    }
    paramrt = new int[i1][];
    paramly = new boolean[i1];
    paramInt2 = 0;
    label312:
    int i3;
    for (paramInt1 = paramInt2; paramInt2 < i1; paramInt1 = i2)
    {
      i2 = paramInt1;
      if (paramly[paramInt2] == 0)
      {
        paramly[paramInt2] = 1;
        paramvc = gete;
        for (i2 = 0; i2 < paramvc.size(); i2++)
        {
          paramaaa = (pz)paramvc.get(i2);
          if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(a)) {
            break label312;
          }
        }
        paramaaa = null;
        if (paramaaa == null)
        {
          i2 = paramInt1 + 1;
          paramrt[paramInt1] = { paramInt2 };
        }
        for (paramInt1 = i2;; paramInt1 = i2)
        {
          i2 = paramInt1;
          break;
          paramaaa = wl.a(b, ",");
          i3 = paramaaa.length + 1;
          paramvc = new int[i3];
          paramvc[0] = paramInt2;
          i4 = paramaaa.length;
          i5 = 1;
          for (i2 = 0; i2 < i4; i2++)
          {
            int i6 = paramux.get(Integer.parseInt(paramaaa[i2]), -1);
            if (i6 != -1)
            {
              paramly[i6] = 1;
              paramvc[i5] = i6;
              i5++;
            }
          }
          paramaaa = paramvc;
          if (i5 < i3) {
            paramaaa = Arrays.copyOf(paramvc, i5);
          }
          i2 = paramInt1 + 1;
          paramrt[paramInt1] = paramaaa;
        }
      }
      paramInt2++;
    }
    paramaaa = paramrt;
    if (paramInt1 < i1) {
      paramaaa = (int[][])Arrays.copyOf(paramrt, paramInt1);
    }
    int i4 = paramaaa.length;
    parampu = new boolean[i4];
    paramly = new bw[i4][];
    int i2 = 0;
    paramInt2 = 0;
    while (i2 < i4)
    {
      paramrt = paramaaa[i2];
      i1 = paramrt.length;
      for (paramInt1 = 0; paramInt1 < i1; paramInt1++)
      {
        paramvc = getc;
        for (i5 = 0; i5 < paramvc.size(); i5++) {
          if (!getd.isEmpty())
          {
            i5 = 1;
            break label619;
          }
        }
      }
      i5 = 0;
      label619:
      paramInt1 = paramInt2;
      if (i5 != 0)
      {
        parampu[i2] = 1;
        paramInt1 = paramInt2 + 1;
      }
      for (i1 : paramaaa[i2])
      {
        localObject = (wa)paramun.get(i1);
        paramvc = getd;
        for (i1 = 0; i1 < paramvc.size(); i1++)
        {
          paramux = (pz)paramvc.get(i1);
          if ("urn:scte:dash:cc:cea-608:2015".equals(a))
          {
            paramrt = b;
            if (paramrt == null)
            {
              paramrt = new bw[1];
              paramrt[0] = a(a, null, -1);
              break label893;
            }
            paramvc = wl.a(paramrt, ";");
            paramux = new bw[paramvc.length];
            for (paramInt2 = 0;; paramInt2++)
            {
              paramrt = paramux;
              if (paramInt2 >= paramvc.length) {
                break;
              }
              paramrt = b.matcher(paramvc[paramInt2]);
              if (!paramrt.matches())
              {
                paramrt = new bw[1];
                paramrt[0] = a(a, null, -1);
                break;
              }
              paramux[paramInt2] = a(a, paramrt.group(2), Integer.parseInt(paramrt.group(1)));
            }
          }
        }
      }
      paramrt = new bw[0];
      label893:
      paramly[i2] = paramrt;
      paramInt2 = paramInt1;
      if (paramrt.length != 0) {
        paramInt2 = paramInt1 + 1;
      }
      i2++;
    }
    paramInt1 = paramtk.size() + (paramInt2 + i4);
    Object localObject = new od[paramInt1];
    paramux = new pd[paramInt1];
    paramInt2 = 0;
    int i5 = 0;
    i2 = i4;
    paramrt = paramun;
    while (i5 < i2)
    {
      int[] arrayOfInt = paramaaa[i5];
      ArrayList localArrayList = new ArrayList();
      i1 = arrayOfInt.length;
      for (paramInt1 = 0; paramInt1 < i1; paramInt1++) {
        localArrayList.addAll(getc);
      }
      paramInt1 = localArrayList.size();
      bw[] arrayOfbw = new bw[paramInt1];
      for (i1 = 0; i1 < paramInt1; i1++)
      {
        paramun = geta;
        paramvc = paramun;
        if (l != null) {
          paramvc = paramun.a(paramfj.d());
        }
        arrayOfbw[i1] = paramvc;
      }
      paramvc = (wa)paramrt.get(arrayOfInt[0]);
      paramInt1 = paramInt2 + 1;
      if (parampu[i5] != 0)
      {
        i4 = paramInt1 + 1;
        i1 = paramInt1;
        paramInt1 = i4;
      }
      else
      {
        i1 = -1;
      }
      if (paramly[i5].length != 0)
      {
        i3 = paramInt1 + 1;
        i4 = paramInt1;
        paramInt1 = i3;
      }
      else
      {
        i4 = -1;
      }
      localObject[paramInt2] = new od(arrayOfbw);
      paramux[paramInt2] = pd.a(b, arrayOfInt, paramInt2, i1, i4);
      if (i1 != -1)
      {
        i3 = a;
        paramvc = new StringBuilder(16);
        paramvc.append(i3);
        paramvc.append(":emsg");
        localObject[i1] = new od(new bw[] { bw.a(paramvc.toString(), "application/x-emsg", null, -1, null) });
        paramux[i1] = pd.a(arrayOfInt, paramInt2);
      }
      if (i4 != -1)
      {
        localObject[i4] = new od(paramly[i5]);
        paramux[i4] = pd.b(arrayOfInt, paramInt2);
      }
      i5++;
      paramInt2 = paramInt1;
    }
    paramInt1 = 0;
    while (paramInt1 < paramtk.size())
    {
      localObject[paramInt2] = new od(new bw[] { bw.a(((py)paramtk.get(paramInt1)).a(), "application/x-emsg", null, -1, null) });
      paramux[paramInt2] = pd.a(paramInt1);
      paramInt1++;
      paramInt2++;
    }
    paramaaa = Pair.create(new of((od[])localObject), paramux);
    j = ((of)first);
    k = ((pd[])second);
    parammu.a();
  }
  
  private final int a(int paramInt, int[] paramArrayOfInt)
  {
    paramInt = paramArrayOfInt[paramInt];
    if (paramInt == -1) {
      return -1;
    }
    int i1 = k[paramInt].e;
    for (paramInt = 0; paramInt < paramArrayOfInt.length; paramInt++)
    {
      int i2 = paramArrayOfInt[paramInt];
      if ((i2 == i1) && (k[i2].c == 0)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  private static bw a(int paramInt1, String paramString, int paramInt2)
  {
    String str;
    if (paramInt2 != -1) {
      str = z2.k(12, ":", paramInt2);
    } else {
      str = "";
    }
    StringBuilder localStringBuilder = new StringBuilder(a.b(str, 18));
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(":cea608");
    localStringBuilder.append(str);
    return bw.a(localStringBuilder.toString(), "application/cea-608", null, -1, 0, paramString, paramInt2, null, Long.MAX_VALUE, null);
  }
  
  private final or<os> a(pd parampd, sy paramsy, long paramLong)
  {
    int i1 = f;
    int i2 = 0;
    boolean bool;
    if (i1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject1 = null;
    if (bool)
    {
      localObject2 = j.a(i1);
      i1 = 1;
    }
    else
    {
      i1 = 0;
      localObject2 = null;
    }
    int i3 = g;
    int i4;
    if (i3 != -1) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    od localod;
    if (i4 != 0)
    {
      localod = j.a(i3);
      i1 += a;
    }
    else
    {
      localod = null;
    }
    bw[] arrayOfbw = new bw[i1];
    int[] arrayOfInt = new int[i1];
    if (bool)
    {
      arrayOfbw[0] = ((od)localObject2).a(0);
      arrayOfInt[0] = 4;
      i1 = 1;
    }
    else
    {
      i1 = 0;
    }
    ArrayList localArrayList = new ArrayList();
    if (i4 != 0) {
      for (i4 = i2; i4 < a; i4++)
      {
        localObject2 = localod.a(i4);
        arrayOfbw[i1] = localObject2;
        arrayOfInt[i1] = 3;
        localArrayList.add(localObject2);
        i1++;
      }
    }
    Object localObject2 = localObject1;
    if (t.d)
    {
      localObject2 = localObject1;
      if (bool) {
        localObject2 = m.a();
      }
    }
    paramsy = c.a(h, t, u, a, paramsy, b, g, bool, localArrayList, (px)localObject2, d);
    parampd = new or(b, arrayOfInt, arrayOfbw, paramsy, this, i, paramLong, e, f, o);
    try
    {
      n.put(parampd, localObject2);
      return parampd;
    }
    finally {}
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    for (or localor : q) {
      if (a == 2) {
        return localor.a(paramLong, paramcn);
      }
    }
    return paramLong;
  }
  
  public final long a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt = new int[paramArrayOfsy.length];
    int i1 = 0;
    Object localObject;
    for (int i2 = 0; i2 < paramArrayOfsy.length; i2++)
    {
      localObject = paramArrayOfsy[i2];
      if (localObject != null) {
        arrayOfInt[i2] = j.a(((sy)localObject).f());
      } else {
        arrayOfInt[i2] = -1;
      }
    }
    for (i2 = 0; i2 < paramArrayOfsy.length; i2++) {
      if ((paramArrayOfsy[i2] == null) || (paramArrayOfBoolean1[i2] == 0))
      {
        localObject = paramArrayOfnw[i2];
        if ((localObject instanceof or)) {
          ((or)localObject).a(this);
        } else if ((localObject instanceof oq)) {
          ((oq)localObject).a();
        }
        paramArrayOfnw[i2] = null;
      }
    }
    for (i2 = 0;; i2++)
    {
      i3 = paramArrayOfsy.length;
      boolean bool = true;
      if (i2 >= i3) {
        break;
      }
      paramArrayOfBoolean1 = paramArrayOfnw[i2];
      if (((paramArrayOfBoolean1 instanceof mg)) || ((paramArrayOfBoolean1 instanceof oq)))
      {
        i3 = a(i2, arrayOfInt);
        if (i3 == -1)
        {
          bool = paramArrayOfnw[i2] instanceof mg;
        }
        else
        {
          paramArrayOfBoolean1 = paramArrayOfnw[i2];
          if ((!(paramArrayOfBoolean1 instanceof oq)) || (a != paramArrayOfnw[i3])) {
            bool = false;
          }
        }
        if (!bool)
        {
          paramArrayOfBoolean1 = paramArrayOfnw[i2];
          if ((paramArrayOfBoolean1 instanceof oq)) {
            ((oq)paramArrayOfBoolean1).a();
          }
          paramArrayOfnw[i2] = null;
        }
      }
    }
    for (i2 = 0; i2 < paramArrayOfsy.length; i2++)
    {
      paramArrayOfBoolean1 = paramArrayOfsy[i2];
      if (paramArrayOfBoolean1 != null)
      {
        localObject = paramArrayOfnw[i2];
        if (localObject == null)
        {
          paramArrayOfBoolean2[i2] = true;
          i3 = arrayOfInt[i2];
          localObject = k[i3];
          i3 = c;
          if (i3 == 0) {
            paramArrayOfnw[i2] = a((pd)localObject, paramArrayOfBoolean1, paramLong);
          } else if (i3 == 2) {
            paramArrayOfnw[i2] = new pt((py)v.get(d), paramArrayOfBoolean1.f().a(0), t.d);
          }
        }
        else if ((localObject instanceof or))
        {
          ((or)localObject).a().a(paramArrayOfBoolean1);
        }
      }
    }
    for (i2 = 0; i2 < paramArrayOfsy.length; i2++) {
      if ((paramArrayOfnw[i2] == null) && (paramArrayOfsy[i2] != null))
      {
        i3 = arrayOfInt[i2];
        paramArrayOfBoolean1 = k[i3];
        if (c == 1)
        {
          i3 = a(i2, arrayOfInt);
          if (i3 == -1) {
            paramArrayOfnw[i2] = new mg();
          } else {
            paramArrayOfnw[i2] = ((or)paramArrayOfnw[i3]).a(paramLong, b);
          }
        }
      }
    }
    paramArrayOfBoolean1 = new ArrayList();
    paramArrayOfsy = new ArrayList();
    int i3 = paramArrayOfnw.length;
    for (i2 = i1; i2 < i3; i2++)
    {
      paramArrayOfBoolean2 = paramArrayOfnw[i2];
      if ((paramArrayOfBoolean2 instanceof or)) {
        paramArrayOfBoolean1.add((or)paramArrayOfBoolean2);
      } else if ((paramArrayOfBoolean2 instanceof pt)) {
        paramArrayOfsy.add((pt)paramArrayOfBoolean2);
      }
    }
    paramArrayOfnw = new or[paramArrayOfBoolean1.size()];
    q = paramArrayOfnw;
    paramArrayOfBoolean1.toArray(paramArrayOfnw);
    paramArrayOfBoolean1 = new pt[paramArrayOfsy.size()];
    r = paramArrayOfBoolean1;
    paramArrayOfsy.toArray(paramArrayOfBoolean1);
    s = l.a(q);
    return paramLong;
  }
  
  public final void a(long paramLong)
  {
    s.a(paramLong);
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    or[] arrayOfor = q;
    int i1 = arrayOfor.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfor[i2].a(paramLong, paramBoolean);
    }
  }
  
  public final void a(aaa paramaaa, int paramInt)
  {
    t = paramaaa;
    u = paramInt;
    m.a(paramaaa);
    Object localObject = q;
    int i1;
    int i2;
    if (localObject != null)
    {
      i1 = localObject.length;
      for (i2 = 0; i2 < i1; i2++) {
        localObject[i2].a().a(paramaaa, paramInt);
      }
      p.a(this);
    }
    v = ad;
    for (pt localpt : r)
    {
      localObject = v.iterator();
      while (((Iterator)localObject).hasNext())
      {
        py localpy = (py)((Iterator)localObject).next();
        if (localpy.a().equals(localpt.a()))
        {
          int i3 = paramaaa.a();
          boolean bool = true;
          if ((!d) || (paramInt != i3 - 1)) {
            bool = false;
          }
          localpt.a(localpy, bool);
        }
      }
    }
  }
  
  public final void a(mr parammr, long paramLong)
  {
    p = parammr;
    parammr.a(this);
  }
  
  public final void a(or<os> paramor)
  {
    try
    {
      paramor = (px)n.remove(paramor);
      if (paramor != null) {
        paramor.a();
      }
      return;
    }
    finally {}
  }
  
  public final void a_()
    throws IOException
  {
    h.a();
  }
  
  public final long b(long paramLong)
  {
    Object localObject = q;
    int i1 = localObject.length;
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++) {
      localObject[i3].b(paramLong);
    }
    localObject = r;
    i1 = localObject.length;
    for (i3 = i2; i3 < i1; i3++) {
      localObject[i3].b(paramLong);
    }
    return paramLong;
  }
  
  public final of b()
  {
    return j;
  }
  
  public final long c()
  {
    if (!w)
    {
      o.c();
      w = true;
    }
    return -9223372036854775807L;
  }
  
  public final boolean c(long paramLong)
  {
    return s.c(paramLong);
  }
  
  public final long d()
  {
    return s.d();
  }
  
  public final long e()
  {
    return s.e();
  }
  
  public final void f()
  {
    m.b();
    or[] arrayOfor = q;
    int i1 = arrayOfor.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfor[i2].a(this);
    }
    p = null;
    o.b();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */