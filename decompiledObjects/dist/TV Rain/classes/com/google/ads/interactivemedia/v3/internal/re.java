package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class re
  implements fy, nx, nz, uo<ok>, us
{
  private boolean A;
  private boolean B;
  private int C;
  private bw D;
  private bw E;
  private boolean F;
  private of G;
  private Set<od> H;
  private int[] I;
  private int J;
  private boolean K;
  private boolean[] L;
  private boolean[] M;
  private long N;
  private long O;
  private boolean P;
  private boolean Q;
  private boolean R;
  private boolean S;
  private long T;
  private int U;
  private final int a;
  private final ri b;
  private final qq c;
  private final tk d;
  private final bw e;
  private final fj<?> f;
  private final un g;
  private final um h;
  private final mu i;
  private final qv j;
  private final ArrayList<ra> k;
  private final List<ra> l;
  private final Runnable m;
  private final Runnable n;
  private final Handler o;
  private final ArrayList<rf> p;
  private final Map<String, fe> q;
  private nv[] r;
  private mh[] s;
  private int[] t;
  private boolean u;
  private int v;
  private boolean w;
  private int x;
  private int y;
  private int z;
  
  public re(int paramInt, ri paramri, qq paramqq, Map<String, fe> paramMap, tk paramtk, long paramLong, bw parambw, fj<?> paramfj, un paramun, mu parammu)
  {
    a = paramInt;
    b = paramri;
    c = paramqq;
    q = paramMap;
    d = paramtk;
    e = parambw;
    f = paramfj;
    g = paramun;
    i = parammu;
    h = new um("Loader:HlsSampleStreamWrapper");
    j = new qv();
    t = new int[0];
    v = -1;
    x = -1;
    r = new nv[0];
    s = new mh[0];
    M = new boolean[0];
    L = new boolean[0];
    paramri = new ArrayList();
    k = paramri;
    l = Collections.unmodifiableList(paramri);
    p = new ArrayList();
    m = new rh(this);
    n = new rg(this);
    o = new Handler();
    N = paramLong;
    O = paramLong;
  }
  
  private static bw a(bw parambw1, bw parambw2, boolean paramBoolean)
  {
    if (parambw1 == null) {
      return parambw2;
    }
    int i1;
    if (paramBoolean) {
      i1 = e;
    } else {
      i1 = -1;
    }
    int i2 = t;
    if (i2 == -1) {
      i2 = t;
    }
    int i3 = vs.g(i);
    String str1 = wl.a(f, i3);
    String str2 = vs.f(str1);
    String str3 = str2;
    if (str2 == null) {
      str3 = i;
    }
    return parambw2.a(a, b, str3, str1, g, i1, n, o, i2, c, y);
  }
  
  private final of a(od[] paramArrayOfod)
  {
    for (int i1 = 0; i1 < paramArrayOfod.length; i1++)
    {
      od localod = paramArrayOfod[i1];
      bw[] arrayOfbw = new bw[a];
      for (int i2 = 0; i2 < a; i2++)
      {
        bw localbw1 = localod.a(i2);
        bw localbw2 = localbw1;
        if (l != null) {
          localbw2 = localbw1.a(f.d());
        }
        arrayOfbw[i2] = localbw2;
      }
      paramArrayOfod[i1] = new od(arrayOfbw);
    }
    return new of(paramArrayOfod);
  }
  
  private static fx b(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(54);
    localStringBuilder.append("Unmapped track with id ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" of type ");
    localStringBuilder.append(paramInt2);
    Log.w("HlsSampleStreamWrapper", localStringBuilder.toString());
    return new fx();
  }
  
  private static int e(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return 0;
        }
        return 1;
      }
      return 3;
    }
    return 2;
  }
  
  private final void m()
  {
    nv[] arrayOfnv = r;
    int i1 = arrayOfnv.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfnv[i2].a(P);
    }
    P = false;
  }
  
  private final void n()
  {
    if ((!F) && (I == null) && (A))
    {
      Object localObject1 = r;
      int i1 = localObject1.length;
      boolean bool = false;
      int i2 = 0;
      for (int i3 = 0; i3 < i1; i3++) {
        if (localObject1[i3].h() == null) {
          return;
        }
      }
      localObject1 = G;
      Object localObject4;
      if (localObject1 != null)
      {
        i4 = b;
        localObject1 = new int[i4];
        I = ((int[])localObject1);
        Arrays.fill((int[])localObject1, -1);
        for (i3 = 0; i3 < i4; i3++) {
          for (i1 = 0;; i1++)
          {
            localObject1 = r;
            if (i1 >= localObject1.length) {
              break;
            }
            localObject2 = localObject1[i1].h();
            localObject1 = G.a(i3).a(0);
            localObject3 = i;
            localObject4 = i;
            i5 = vs.g((String)localObject3);
            if (i5 != 3) {
              if (i5 != vs.g((String)localObject4)) {
                break label190;
              }
            }
            for (;;)
            {
              i5 = 1;
              break;
              if (!wl.a(localObject3, localObject4)) {}
              label190:
              do
              {
                i5 = 0;
                break label233;
                if ((!"application/cea-608".equals(localObject3)) && (!"application/cea-708".equals(localObject3))) {
                  break;
                }
              } while (z != z);
            }
            label233:
            if (i5 != 0)
            {
              I[i3] = i1;
              break;
            }
          }
        }
        localObject3 = p;
        i1 = ((ArrayList)localObject3).size();
        i3 = i2;
        while (i3 < i1)
        {
          localObject1 = ((ArrayList)localObject3).get(i3);
          i3++;
          ((rf)localObject1).a();
        }
        return;
      }
      int i6 = r.length;
      i1 = 0;
      i2 = -1;
      int i4 = 6;
      for (;;)
      {
        i3 = 2;
        if (i1 >= i6) {
          break;
        }
        localObject1 = r[i1].h().i;
        if (!vs.b((String)localObject1)) {
          if (vs.a((String)localObject1)) {
            i3 = 1;
          } else if (vs.c((String)localObject1)) {
            i3 = 3;
          } else {
            i3 = 6;
          }
        }
        int i7;
        if (e(i3) > e(i4))
        {
          i5 = i1;
          i7 = i3;
        }
        else
        {
          i7 = i4;
          i5 = i2;
          if (i3 == i4)
          {
            i7 = i4;
            i5 = i2;
            if (i2 != -1)
            {
              i5 = -1;
              i7 = i4;
            }
          }
        }
        i1++;
        i4 = i7;
        i2 = i5;
      }
      Object localObject2 = c.b();
      int i5 = a;
      J = -1;
      I = new int[i6];
      for (i3 = 0; i3 < i6; i3++) {
        I[i3] = i3;
      }
      Object localObject3 = new od[i6];
      for (i3 = 0; i3 < i6; i3++)
      {
        localObject4 = r[i3].h();
        if (i3 == i2)
        {
          localObject1 = new bw[i5];
          if (i5 == 1) {
            localObject1[0] = ((bw)localObject4).a(((od)localObject2).a(0));
          } else {
            for (i1 = 0; i1 < i5; i1++) {
              localObject1[i1] = a(((od)localObject2).a(i1), (bw)localObject4, true);
            }
          }
          localObject3[i3] = new od((bw[])localObject1);
          J = i3;
        }
        else
        {
          if ((i4 == 2) && (vs.a(i))) {
            localObject1 = e;
          } else {
            localObject1 = null;
          }
          localObject3[i3] = new od(new bw[] { a((bw)localObject1, (bw)localObject4, false) });
        }
      }
      G = a((od[])localObject3);
      if (H == null) {
        bool = true;
      }
      rp.c(bool);
      H = Collections.emptySet();
      B = true;
      b.f();
    }
  }
  
  private final ra o()
  {
    ArrayList localArrayList = k;
    return (ra)localArrayList.get(localArrayList.size() - 1);
  }
  
  private final boolean p()
  {
    return O != -9223372036854775807L;
  }
  
  public final int a(int paramInt)
  {
    int i1 = I[paramInt];
    if (i1 == -1)
    {
      if (H.contains(G.a(paramInt))) {
        return -3;
      }
      return -2;
    }
    boolean[] arrayOfBoolean = L;
    if (arrayOfBoolean[i1] != 0) {
      return -2;
    }
    arrayOfBoolean[i1] = true;
    return i1;
  }
  
  public final int a(int paramInt, long paramLong)
  {
    if (p()) {
      return 0;
    }
    nv localnv = r[paramInt];
    if ((R) && (paramLong > localnv.i())) {
      return localnv.o();
    }
    paramInt = localnv.b(paramLong, true, true);
    if (paramInt == -1) {
      return 0;
    }
    return paramInt;
  }
  
  public final int a(int paramInt, by paramby, ez paramez, boolean paramBoolean)
  {
    if (p()) {
      return -3;
    }
    boolean bool = k.isEmpty();
    int i1 = 0;
    int i3;
    Object localObject;
    if (!bool)
    {
      for (i2 = 0;; i2++)
      {
        i3 = k.size();
        int i4 = 1;
        if (i2 >= i3 - 1) {
          break;
        }
        int i5 = k.get(i2)).a;
        int i6 = r.length;
        int i7;
        for (i3 = 0;; i3++)
        {
          i7 = i4;
          if (i3 >= i6) {
            break;
          }
          if ((L[i3] != 0) && (r[i3].g() == i5))
          {
            i7 = 0;
            break;
          }
        }
        if (i7 == 0) {
          break;
        }
      }
      wl.a(k, 0, i2);
      localObject = (ra)k.get(0);
      bw localbw = e;
      if (!localbw.equals(E)) {
        i.a(a, localbw, f, g, h);
      }
      E = localbw;
    }
    int i2 = s[paramInt].a(paramby, paramez, paramBoolean, R, N);
    if (i2 == -5)
    {
      localObject = c;
      paramez = (ez)localObject;
      if (paramInt == z)
      {
        i3 = r[paramInt].g();
        for (paramInt = i1; (paramInt < k.size()) && (k.get(paramInt)).a != i3); paramInt++) {}
        if (paramInt < k.size()) {
          paramez = k.get(paramInt)).e;
        } else {
          paramez = D;
        }
        paramez = ((bw)localObject).a(paramez);
      }
      c = paramez;
    }
    return i2;
  }
  
  public final gi a(int paramInt1, int paramInt2)
  {
    Object localObject1 = r;
    int i1 = localObject1.length;
    int i2 = 0;
    if (paramInt2 == 1)
    {
      i3 = v;
      if (i3 != -1)
      {
        if (u)
        {
          if (t[i3] == paramInt1) {
            return localObject1[i3];
          }
          return b(paramInt1, paramInt2);
        }
        u = true;
        t[i3] = paramInt1;
        return localObject1[i3];
      }
      if (S) {
        return b(paramInt1, paramInt2);
      }
    }
    else if (paramInt2 == 2)
    {
      i3 = x;
      if (i3 != -1)
      {
        if (w)
        {
          if (t[i3] == paramInt1) {
            return localObject1[i3];
          }
          return b(paramInt1, paramInt2);
        }
        w = true;
        t[i3] = paramInt1;
        return localObject1[i3];
      }
      if (S) {
        return b(paramInt1, paramInt2);
      }
    }
    else
    {
      for (i3 = 0; i3 < i1; i3++) {
        if (t[i3] == paramInt1) {
          return r[i3];
        }
      }
      if (S) {
        return b(paramInt1, paramInt2);
      }
    }
    localObject1 = new rl(d, q);
    ((nv)localObject1).a(T);
    ((nv)localObject1).a(U);
    ((nv)localObject1).a(this);
    Object localObject2 = t;
    int i3 = i1 + 1;
    localObject2 = Arrays.copyOf((int[])localObject2, i3);
    t = ((int[])localObject2);
    localObject2[i1] = paramInt1;
    localObject2 = (nv[])Arrays.copyOf(r, i3);
    r = ((nv[])localObject2);
    localObject2[i1] = localObject1;
    localObject2 = (mh[])Arrays.copyOf(s, i3);
    s = ((mh[])localObject2);
    localObject2[i1] = new mh(r[i1], f);
    localObject2 = Arrays.copyOf(M, i3);
    M = ((boolean[])localObject2);
    if ((paramInt2 == 1) || (paramInt2 == 2)) {
      i2 = 1;
    }
    localObject2[i1] = i2;
    K |= i2;
    if (paramInt2 == 1)
    {
      u = true;
      v = i1;
    }
    else if (paramInt2 == 2)
    {
      w = true;
      x = i1;
    }
    if (e(paramInt2) > e(y))
    {
      z = i1;
      y = paramInt2;
    }
    L = Arrays.copyOf(L, i3);
    return (gi)localObject1;
  }
  
  public final void a()
  {
    S = true;
    o.post(n);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = 0;
    if (!paramBoolean2)
    {
      u = false;
      w = false;
    }
    U = paramInt;
    nv[] arrayOfnv = r;
    int i2 = arrayOfnv.length;
    for (int i3 = 0; i3 < i2; i3++) {
      arrayOfnv[i3].a(paramInt);
    }
    if (paramBoolean1)
    {
      arrayOfnv = r;
      i3 = arrayOfnv.length;
      for (paramInt = i1; paramInt < i3; paramInt++) {
        arrayOfnv[paramInt].b();
      }
    }
  }
  
  public final void a(long paramLong) {}
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    if ((A) && (!p()))
    {
      int i1 = r.length;
      for (int i2 = 0; i2 < i1; i2++) {
        r[i2].a(paramLong, paramBoolean, L[i2]);
      }
    }
  }
  
  public final void a(ge paramge) {}
  
  public final void a(boolean paramBoolean)
  {
    c.a(paramBoolean);
  }
  
  public final void a(od[] paramArrayOfod, int paramInt, int... paramVarArgs)
  {
    B = true;
    G = a(paramArrayOfod);
    H = new HashSet();
    int i1 = paramVarArgs.length;
    for (paramInt = 0; paramInt < i1; paramInt++)
    {
      int i2 = paramVarArgs[paramInt];
      H.add(G.a(i2));
    }
    J = 0;
    paramVarArgs = o;
    paramArrayOfod = b;
    paramArrayOfod.getClass();
    paramVarArgs.post(rj.a(paramArrayOfod));
  }
  
  public final boolean a(Uri paramUri, long paramLong)
  {
    return c.a(paramUri, paramLong);
  }
  
  public final boolean a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong, boolean paramBoolean)
  {
    rp.c(B);
    int i1 = C;
    int i2 = 0;
    Object localObject;
    for (int i3 = 0; i3 < paramArrayOfsy.length; i3++)
    {
      localObject = paramArrayOfnw[i3];
      if ((localObject != null) && ((paramArrayOfsy[i3] == null) || (paramArrayOfBoolean1[i3] == 0)))
      {
        C -= 1;
        ((rf)localObject).d();
        paramArrayOfnw[i3] = null;
      }
    }
    boolean bool1;
    if ((!paramBoolean) && (Q ? i1 != 0 : paramLong == N)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    sy localsy1 = c.c();
    paramArrayOfBoolean1 = localsy1;
    i3 = 0;
    boolean bool2;
    while (i3 < paramArrayOfsy.length)
    {
      sy localsy2 = paramArrayOfsy[i3];
      localObject = paramArrayOfBoolean1;
      bool2 = bool1;
      if (localsy2 != null)
      {
        i1 = G.a(localsy2.f());
        if (i1 == J)
        {
          c.a(localsy2);
          paramArrayOfBoolean1 = localsy2;
        }
        localObject = paramArrayOfBoolean1;
        bool2 = bool1;
        if (paramArrayOfnw[i3] == null)
        {
          C += 1;
          localObject = new rf(this, i1);
          paramArrayOfnw[i3] = localObject;
          paramArrayOfBoolean2[i3] = true;
          if (I != null) {
            ((rf)localObject).a();
          }
          localObject = paramArrayOfBoolean1;
          bool2 = bool1;
          if (A)
          {
            localObject = paramArrayOfBoolean1;
            bool2 = bool1;
            if (!bool1)
            {
              localObject = r[I[i1]];
              ((nv)localObject).l();
              if ((((nv)localObject).b(paramLong, true, true) == -1) && (((nv)localObject).f() != 0)) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              bool2 = bool1;
              localObject = paramArrayOfBoolean1;
            }
          }
        }
      }
      i3++;
      paramArrayOfBoolean1 = (boolean[])localObject;
      bool1 = bool2;
    }
    if (C == 0)
    {
      c.d();
      E = null;
      P = true;
      k.clear();
      if (h.b())
      {
        if (A)
        {
          paramArrayOfsy = r;
          i1 = paramArrayOfsy.length;
          for (i3 = 0; i3 < i1; i3++) {
            paramArrayOfsy[i3].n();
          }
        }
        h.c();
        bool2 = bool1;
      }
      else
      {
        m();
        bool2 = bool1;
      }
    }
    else
    {
      if ((!k.isEmpty()) && (!wl.a(paramArrayOfBoolean1, localsy1)))
      {
        if (!Q)
        {
          long l1 = 0L;
          if (paramLong < 0L) {
            l1 = -paramLong;
          }
          paramArrayOfsy = o();
          localObject = c.a(paramArrayOfsy, paramLong);
          paramArrayOfBoolean1.a(paramLong, l1, -9223372036854775807L, l, (oz[])localObject);
          i3 = c.b().a(e);
          if (paramArrayOfBoolean1.i() == i3)
          {
            i3 = 0;
            break label575;
          }
        }
        i3 = 1;
        label575:
        if (i3 != 0)
        {
          P = true;
          paramBoolean = true;
          bool1 = paramBoolean;
        }
      }
      bool2 = bool1;
      if (bool1)
      {
        b(paramLong, paramBoolean);
        for (i3 = 0;; i3++)
        {
          bool2 = bool1;
          if (i3 >= paramArrayOfnw.length) {
            break;
          }
          if (paramArrayOfnw[i3] != null) {
            paramArrayOfBoolean2[i3] = true;
          }
        }
      }
    }
    p.clear();
    i1 = paramArrayOfnw.length;
    for (i3 = i2; i3 < i1; i3++)
    {
      paramArrayOfsy = paramArrayOfnw[i3];
      if (paramArrayOfsy != null) {
        p.add((rf)paramArrayOfsy);
      }
    }
    Q = true;
    return bool2;
  }
  
  public final void b()
  {
    if (!B) {
      c(N);
    }
  }
  
  public final void b(int paramInt)
  {
    paramInt = I[paramInt];
    rp.c(L[paramInt]);
    L[paramInt] = false;
  }
  
  public final void b(long paramLong)
  {
    T = paramLong;
    nv[] arrayOfnv = r;
    int i1 = arrayOfnv.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfnv[i2].a(paramLong);
    }
  }
  
  public final boolean b(long paramLong, boolean paramBoolean)
  {
    N = paramLong;
    if (p())
    {
      O = paramLong;
      return true;
    }
    if ((A) && (!paramBoolean))
    {
      int i1 = r.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        nv localnv = r[i2];
        localnv.l();
        int i3;
        if (localnv.b(paramLong, true, false) != -1) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if ((i3 == 0) && ((M[i2] != 0) || (!K)))
        {
          i2 = 0;
          break label119;
        }
      }
      i2 = 1;
      label119:
      if (i2 != 0) {
        return false;
      }
    }
    O = paramLong;
    R = false;
    k.clear();
    if (h.b()) {
      h.c();
    } else {
      m();
    }
    return true;
  }
  
  public final void c()
    throws IOException
  {
    j();
    if ((R) && (!B)) {
      throw new ce("Loading finished before preparation is complete.");
    }
  }
  
  public final boolean c(int paramInt)
  {
    return (!p()) && (s[paramInt].a(R));
  }
  
  public final boolean c(long paramLong)
  {
    if ((!R) && (!h.b()))
    {
      long l1;
      if (p())
      {
        localObject1 = Collections.emptyList();
        l1 = O;
      }
      for (;;)
      {
        break;
        localObject1 = l;
        localObject2 = o();
        if (((ra)localObject2).h()) {
          l1 = i;
        } else {
          l1 = Math.max(N, h);
        }
      }
      Object localObject2 = c;
      if ((!B) && (((List)localObject1).isEmpty())) {
        bool = false;
      } else {
        bool = true;
      }
      ((qq)localObject2).a(paramLong, l1, (List)localObject1, bool, j);
      qv localqv = j;
      boolean bool = b;
      Object localObject1 = a;
      localObject2 = c;
      localqv.a();
      if (bool)
      {
        O = -9223372036854775807L;
        R = true;
        return true;
      }
      if (localObject1 == null)
      {
        if (localObject2 != null) {
          b.a((Uri)localObject2);
        }
        return false;
      }
      if ((localObject1 instanceof ra))
      {
        O = -9223372036854775807L;
        localObject2 = (ra)localObject1;
        ((ra)localObject2).a(this);
        k.add(localObject2);
        D = e;
      }
      paramLong = h.a((ut)localObject1, this, g.a(d));
      i.a(c, d, a, e, f, g, h, i, paramLong);
      return true;
    }
    return false;
  }
  
  public final long d()
  {
    if (R) {
      return Long.MIN_VALUE;
    }
    if (p()) {
      return O;
    }
    long l1 = N;
    Object localObject = o();
    if (!((ra)localObject).h()) {
      if (k.size() > 1)
      {
        localObject = k;
        localObject = (ra)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
      }
      else
      {
        localObject = null;
      }
    }
    long l2 = l1;
    if (localObject != null) {
      l2 = Math.max(l1, i);
    }
    l1 = l2;
    if (A)
    {
      localObject = r;
      int i1 = localObject.length;
      for (int i2 = 0;; i2++)
      {
        l1 = l2;
        if (i2 >= i1) {
          break;
        }
        l2 = Math.max(l2, localObject[i2].i());
      }
    }
    return l1;
  }
  
  public final void d(int paramInt)
    throws IOException
  {
    j();
    s[paramInt].b();
  }
  
  public final long e()
  {
    if (p()) {
      return O;
    }
    if (R) {
      return Long.MIN_VALUE;
    }
    return oi;
  }
  
  public final of f()
  {
    return G;
  }
  
  public final void g()
  {
    m();
    mh[] arrayOfmh = s;
    int i1 = arrayOfmh.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfmh[i2].a();
    }
  }
  
  public final void h()
  {
    if (B)
    {
      Object localObject = r;
      int i1 = localObject.length;
      int i2 = 0;
      for (int i3 = 0; i3 < i1; i3++) {
        localObject[i3].n();
      }
      localObject = s;
      i1 = localObject.length;
      for (i3 = i2; i3 < i1; i3++) {
        localObject[i3].a();
      }
    }
    h.a(this);
    o.removeCallbacksAndMessages(null);
    F = true;
    p.clear();
  }
  
  public final void i()
  {
    o.post(m);
  }
  
  public final void j()
    throws IOException
  {
    h.a();
    c.a();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.re
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */