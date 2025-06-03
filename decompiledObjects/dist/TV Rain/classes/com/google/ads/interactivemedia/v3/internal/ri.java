package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class ri
  implements mo, ny<re>, sf
{
  private final qz a;
  private final sd b;
  private final qw c;
  private final vc d;
  private final fj<?> e;
  private final un f;
  private final mu g;
  private final tk h;
  private final IdentityHashMap<nw, Integer> i;
  private final rn j;
  private final ly k;
  private final boolean l;
  private final boolean m;
  private mr n;
  private int o;
  private of p;
  private re[] q;
  private re[] r;
  private nz s;
  private boolean t;
  
  public ri(qz paramqz, sd paramsd, qw paramqw, vc paramvc, fj<?> paramfj, un paramun, mu parammu, tk paramtk, ly paramly, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramqz;
    b = paramsd;
    c = paramqw;
    d = paramvc;
    e = paramfj;
    f = paramun;
    g = parammu;
    h = paramtk;
    k = paramly;
    l = paramBoolean1;
    m = paramBoolean2;
    s = paramly.a(new nz[0]);
    i = new IdentityHashMap();
    j = new rn();
    q = new re[0];
    r = new re[0];
    parammu.a();
  }
  
  private static bw a(bw parambw)
  {
    String str1 = wl.a(f, 2);
    String str2 = vs.f(str1);
    return bw.a(a, b, h, str2, str1, g, e, n, o, p, null, c, d);
  }
  
  private static bw a(bw parambw1, bw parambw2, boolean paramBoolean)
  {
    int i1 = -1;
    String str1;
    kd localkd;
    int i2;
    int i3;
    int i4;
    Object localObject;
    if (parambw2 != null)
    {
      str1 = f;
      localkd = g;
      i2 = t;
      i3 = c;
      i4 = d;
      localObject = y;
      parambw2 = b;
    }
    else
    {
      str1 = wl.a(f, 1);
      localkd = g;
      if (paramBoolean)
      {
        i2 = t;
        i3 = c;
        i4 = d;
        localObject = y;
        parambw2 = b;
      }
      else
      {
        parambw2 = null;
        localObject = parambw2;
        i3 = 0;
        i4 = i3;
        i2 = -1;
      }
    }
    String str2 = vs.f(str1);
    if (paramBoolean) {
      i1 = e;
    }
    return bw.a(a, parambw2, h, str2, str1, localkd, i1, i2, -1, null, i3, i4, (String)localObject);
  }
  
  private re a(int paramInt, Uri[] paramArrayOfUri, bw[] paramArrayOfbw, bw parambw, List<bw> paramList, Map<String, fe> paramMap, long paramLong)
  {
    return new re(paramInt, this, new qq(a, b, paramArrayOfUri, paramArrayOfbw, c, d, j, paramList), paramMap, h, paramLong, parambw, e, f, g);
  }
  
  private static Map<String, fe> a(List<fe> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    HashMap localHashMap = new HashMap();
    int i1 = 0;
    while (i1 < localArrayList.size())
    {
      fe localfe1 = (fe)paramList.get(i1);
      String str = a;
      i1++;
      int i2 = i1;
      while (i2 < localArrayList.size())
      {
        fe localfe2 = (fe)localArrayList.get(i2);
        if (TextUtils.equals(a, str))
        {
          localfe1 = localfe1.a(localfe2);
          localArrayList.remove(i2);
        }
        else
        {
          i2++;
        }
      }
      localHashMap.put(str, localfe1);
    }
    return localHashMap;
  }
  
  private void a(long paramLong, List<rv> paramList, List<re> paramList1, List<int[]> paramList2, Map<String, fe> paramMap)
  {
    ArrayList localArrayList1 = new ArrayList(paramList.size());
    ArrayList localArrayList2 = new ArrayList(paramList.size());
    ArrayList localArrayList3 = new ArrayList(paramList.size());
    HashSet localHashSet = new HashSet();
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      Object localObject = getc;
      if (localHashSet.add(localObject))
      {
        localArrayList1.clear();
        localArrayList2.clear();
        localArrayList3.clear();
        int i2 = 0;
        int i4;
        for (int i3 = 1; i2 < paramList.size(); i3 = i4)
        {
          i4 = i3;
          if (wl.a(localObject, getc))
          {
            rv localrv = (rv)paramList.get(i2);
            localArrayList3.add(Integer.valueOf(i2));
            localArrayList1.add(a);
            localArrayList2.add(b);
            if (b.f != null) {
              i4 = 1;
            } else {
              i4 = 0;
            }
            i4 = i3 & i4;
          }
          i2++;
        }
        localObject = a(1, (Uri[])localArrayList1.toArray(new Uri[0]), (bw[])localArrayList2.toArray(new bw[0]), null, Collections.emptyList(), paramMap, paramLong);
        paramList2.add(wl.a(localArrayList3));
        paramList1.add(localObject);
        if ((l) && (i3 != 0)) {
          ((re)localObject).a(new od[] { new od((bw[])localArrayList2.toArray(new bw[0])) }, 0, new int[0]);
        }
      }
    }
  }
  
  private void a(rw paramrw, long paramLong, List<re> paramList, List<int[]> paramList1, Map<String, fe> paramMap)
  {
    int i1 = c.size();
    Object localObject1 = new int[i1];
    int i2 = 0;
    int i3 = i2;
    int i4 = i3;
    while (i2 < c.size())
    {
      localObject2 = c.get(i2)).b;
      if ((o <= 0) && (wl.a(f, 2) == null))
      {
        if (wl.a(f, 1) != null)
        {
          localObject1[i2] = 1;
          i4++;
        }
        else
        {
          localObject1[i2] = -1;
        }
      }
      else
      {
        localObject1[i2] = 2;
        i3++;
      }
      i2++;
    }
    if (i3 > 0)
    {
      i2 = 1;
      i4 = 0;
    }
    else if (i4 < i1)
    {
      i3 = i1 - i4;
      i2 = 0;
      i4 = 1;
    }
    else
    {
      i2 = 0;
      i4 = i2;
      i3 = i1;
    }
    Uri[] arrayOfUri = new Uri[i3];
    Object localObject2 = new bw[i3];
    int[] arrayOfInt = new int[i3];
    int i5 = 0;
    for (int i6 = i5; i5 < c.size(); i6 = i1)
    {
      if (i2 != 0)
      {
        i1 = i6;
        if (localObject1[i5] != 2) {}
      }
      else if (i4 != 0)
      {
        i1 = i6;
        if (localObject1[i5] == 1) {}
      }
      else
      {
        ry localry = (ry)c.get(i5);
        arrayOfUri[i6] = a;
        localObject2[i6] = b;
        arrayOfInt[i6] = i5;
        i1 = i6 + 1;
      }
      i5++;
    }
    localObject1 = 0f;
    paramMap = a(0, arrayOfUri, (bw[])localObject2, f, g, paramMap, paramLong);
    paramList.add(paramMap);
    paramList1.add(arrayOfInt);
    if ((l) && (localObject1 != null))
    {
      if (wl.a((String)localObject1, 2) != null) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      if (wl.a((String)localObject1, 1) != null) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      paramList = new ArrayList();
      if (i4 != 0)
      {
        paramList1 = new bw[i3];
        for (i4 = 0; i4 < i3; i4++) {
          paramList1[i4] = a(localObject2[i4]);
        }
        paramList.add(new od(paramList1));
        if ((i2 != 0) && ((f != null) || (d.isEmpty()))) {
          paramList.add(new od(new bw[] { a(localObject2[0], f, false) }));
        }
        paramrw = g;
        if (paramrw != null) {
          for (i3 = 0; i3 < paramrw.size(); i3++) {
            paramList.add(new od(new bw[] { (bw)paramrw.get(i3) }));
          }
        }
      }
      else
      {
        if (i2 == 0) {
          break label724;
        }
        paramList1 = new bw[i3];
        for (i2 = 0; i2 < i3; i2++) {
          paramList1[i2] = a(localObject2[i2], f, true);
        }
        paramList.add(new od(paramList1));
      }
      paramrw = new od(new bw[] { bw.a("ID3", "application/id3", null, -1, null) });
      paramList.add(paramrw);
      paramMap.a((od[])paramList.toArray(new od[0]), 0, new int[] { paramList.indexOf(paramrw) });
      return;
      label724:
      if (((String)localObject1).length() != 0) {
        paramrw = "Unexpected codecs attribute: ".concat((String)localObject1);
      } else {
        paramrw = new String("Unexpected codecs attribute: ");
      }
      throw new IllegalArgumentException(paramrw);
    }
  }
  
  private void d(long paramLong)
  {
    Object localObject1 = (rw)rp.a(b.b());
    if (m) {
      localObject2 = a(i);
    } else {
      localObject2 = Collections.emptyMap();
    }
    boolean bool = c.isEmpty();
    Object localObject3 = d;
    List localList = e;
    int i1 = 0;
    o = 0;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((bool ^ true)) {
      a((rw)localObject1, paramLong, localArrayList1, localArrayList2, (Map)localObject2);
    }
    a(paramLong, (List)localObject3, localArrayList1, localArrayList2, (Map)localObject2);
    for (int i2 = 0; i2 < localList.size(); i2++)
    {
      localObject1 = (rv)localList.get(i2);
      Uri localUri = a;
      bw localbw = b;
      localObject3 = Collections.emptyList();
      localObject3 = a(3, new Uri[] { localUri }, new bw[] { localbw }, null, (List)localObject3, (Map)localObject2, paramLong);
      localArrayList2.add(new int[] { i2 });
      localArrayList1.add(localObject3);
      ((re)localObject3).a(new od[] { new od(new bw[] { b }) }, 0, new int[0]);
    }
    q = ((re[])localArrayList1.toArray(new re[0]));
    Object localObject2 = (int[][])localArrayList2.toArray(new int[0][]);
    localObject2 = q;
    o = localObject2.length;
    localObject2[0].a(true);
    localObject2 = q;
    int i3 = localObject2.length;
    for (i2 = i1; i2 < i3; i2++) {
      localObject2[i2].b();
    }
    r = q;
  }
  
  public long a(long paramLong, cn paramcn)
  {
    return paramLong;
  }
  
  public long a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfsy.length];
    int[] arrayOfInt2 = new int[paramArrayOfsy.length];
    for (int i1 = 0; i1 < paramArrayOfsy.length; i1++)
    {
      localObject1 = paramArrayOfnw[i1];
      if (localObject1 == null) {
        i2 = -1;
      } else {
        i2 = ((Integer)i.get(localObject1)).intValue();
      }
      arrayOfInt1[i1] = i2;
      arrayOfInt2[i1] = -1;
      localObject1 = paramArrayOfsy[i1];
      if (localObject1 != null)
      {
        localObject2 = ((sy)localObject1).f();
        for (i2 = 0;; i2++)
        {
          localObject1 = q;
          if (i2 >= localObject1.length) {
            break;
          }
          if (localObject1[i2].f().a((od)localObject2) != -1)
          {
            arrayOfInt2[i1] = i2;
            break;
          }
        }
      }
    }
    i.clear();
    int i3 = paramArrayOfsy.length;
    nw[] arrayOfnw1 = new nw[i3];
    nw[] arrayOfnw2 = new nw[paramArrayOfsy.length];
    Object localObject1 = new sy[paramArrayOfsy.length];
    Object localObject2 = new re[q.length];
    i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    Object localObject3;
    for (;;)
    {
      localObject3 = paramArrayOfnw;
      if (i2 >= q.length) {
        break;
      }
      for (int i4 = 0; i4 < paramArrayOfsy.length; i4++)
      {
        i5 = arrayOfInt1[i4];
        Object localObject4 = null;
        if (i5 == i2) {
          localObject5 = localObject3[i4];
        } else {
          localObject5 = null;
        }
        arrayOfnw2[i4] = localObject5;
        localObject5 = localObject4;
        if (arrayOfInt2[i4] == i2) {
          localObject5 = paramArrayOfsy[i4];
        }
        localObject1[i4] = localObject5;
      }
      Object localObject5 = q[i2];
      boolean bool2 = ((re)localObject5).a((sy[])localObject1, paramArrayOfBoolean1, arrayOfnw2, paramArrayOfBoolean2, paramLong, bool1);
      int i5 = 0;
      int i6;
      for (i4 = 0;; i4 = i6)
      {
        i6 = paramArrayOfsy.length;
        boolean bool3 = true;
        if (i5 >= i6) {
          break;
        }
        if (arrayOfInt2[i5] == i2)
        {
          if (arrayOfnw2[i5] != null) {
            bool3 = true;
          } else {
            bool3 = false;
          }
          rp.c(bool3);
          arrayOfnw1[i5] = arrayOfnw2[i5];
          i.put(arrayOfnw2[i5], Integer.valueOf(i2));
          i6 = 1;
        }
        else
        {
          i6 = i4;
          if (arrayOfInt1[i5] == i2)
          {
            if (arrayOfnw2[i5] != null) {
              bool3 = false;
            }
            rp.c(bool3);
            i6 = i4;
          }
        }
        i5++;
      }
      if (i4 != 0)
      {
        localObject2[i1] = localObject5;
        i4 = i1 + 1;
        if (i1 == 0)
        {
          ((re)localObject5).a(true);
          if (!bool2)
          {
            localObject3 = r;
            if (localObject3.length != 0)
            {
              i1 = i4;
              if (localObject5 == localObject3[0]) {
                break label541;
              }
            }
          }
          j.a();
          bool1 = true;
          i1 = i4;
        }
        else
        {
          ((re)localObject5).a(false);
          i1 = i4;
        }
      }
      label541:
      i2++;
    }
    System.arraycopy(arrayOfnw1, 0, localObject3, 0, i3);
    paramArrayOfsy = (re[])Arrays.copyOf((Object[])localObject2, i1);
    r = paramArrayOfsy;
    s = k.a(paramArrayOfsy);
    return paramLong;
  }
  
  public void a(long paramLong)
  {
    s.a(paramLong);
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    re[] arrayOfre = r;
    int i1 = arrayOfre.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfre[i2].a(paramLong, paramBoolean);
    }
  }
  
  public void a(Uri paramUri)
  {
    b.c(paramUri);
  }
  
  public void a(mr parammr, long paramLong)
  {
    n = parammr;
    b.a(this);
    d(paramLong);
  }
  
  public boolean a(Uri paramUri, long paramLong)
  {
    re[] arrayOfre = q;
    int i1 = arrayOfre.length;
    boolean bool = true;
    for (int i2 = 0; i2 < i1; i2++) {
      bool &= arrayOfre[i2].a(paramUri, paramLong);
    }
    n.a(this);
    return bool;
  }
  
  public void a_()
    throws IOException
  {
    re[] arrayOfre = q;
    int i1 = arrayOfre.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfre[i2].c();
    }
  }
  
  public long b(long paramLong)
  {
    re[] arrayOfre = r;
    if (arrayOfre.length > 0)
    {
      boolean bool = arrayOfre[0].b(paramLong, false);
      for (int i1 = 1;; i1++)
      {
        arrayOfre = r;
        if (i1 >= arrayOfre.length) {
          break;
        }
        arrayOfre[i1].b(paramLong, bool);
      }
      if (bool) {
        j.a();
      }
    }
    return paramLong;
  }
  
  public of b()
  {
    return p;
  }
  
  public long c()
  {
    if (!t)
    {
      g.c();
      t = true;
    }
    return -9223372036854775807L;
  }
  
  public boolean c(long paramLong)
  {
    if (p == null)
    {
      re[] arrayOfre = q;
      int i1 = arrayOfre.length;
      for (int i2 = 0; i2 < i1; i2++) {
        arrayOfre[i2].b();
      }
      return false;
    }
    return s.c(paramLong);
  }
  
  public long d()
  {
    return s.d();
  }
  
  public long e()
  {
    return s.e();
  }
  
  public void f()
  {
    int i1 = o - 1;
    o = i1;
    if (i1 > 0) {
      return;
    }
    re[] arrayOfre = q;
    int i2 = arrayOfre.length;
    i1 = 0;
    int i3 = i1;
    while (i1 < i2)
    {
      i3 += fb;
      i1++;
    }
    od[] arrayOfod = new od[i3];
    arrayOfre = q;
    int i4 = arrayOfre.length;
    i1 = 0;
    i3 = i1;
    while (i1 < i4)
    {
      re localre = arrayOfre[i1];
      int i5 = fb;
      i2 = 0;
      while (i2 < i5)
      {
        arrayOfod[i3] = localre.f().a(i2);
        i2++;
        i3++;
      }
      i1++;
    }
    p = new of(arrayOfod);
    n.a(this);
  }
  
  public void g()
  {
    b.b(this);
    re[] arrayOfre = q;
    int i1 = arrayOfre.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfre[i2].h();
    }
    n = null;
    g.b();
  }
  
  public void h()
  {
    n.a(this);
  }
  
  public void i()
  {
    n.a(this);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ri
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */