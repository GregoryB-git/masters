package A0;

import X2.P;
import X2.v.a;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d0.I;
import d0.J;
import d0.K;
import d0.K.b;
import d0.K.c;
import d0.b;
import d0.b.d;
import g0.M;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import k0.Y0;
import k0.Z0;
import k0.a1.a;
import k0.b1;
import x0.x.b;

public class n
  extends A
  implements a1.a
{
  public static final P k = P.b(new d());
  public final Object d = new Object();
  public final Context e;
  public final y.b f;
  public final boolean g;
  public e h;
  public g i;
  public b j;
  
  public n(Context paramContext)
  {
    this(paramContext, new a.b());
  }
  
  public n(Context paramContext, y.b paramb)
  {
    this(paramContext, e.h(paramContext), paramb);
  }
  
  public n(Context paramContext, K paramK, y.b paramb)
  {
    this(paramK, paramb, paramContext);
  }
  
  public n(K paramK, y.b paramb, Context paramContext)
  {
    Context localContext;
    if (paramContext != null) {
      localContext = paramContext.getApplicationContext();
    } else {
      localContext = null;
    }
    e = localContext;
    f = paramb;
    if ((paramK instanceof e)) {}
    for (paramK = (e)paramK;; paramK = paramb.g().d0(paramK).a0())
    {
      h = paramK;
      break;
      if (paramContext == null) {
        paramb = e.A0;
      } else {
        paramb = e.h(paramContext);
      }
    }
    j = b.g;
    boolean bool;
    if ((paramContext != null) && (M.E0(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    g = bool;
    if ((!bool) && (paramContext != null) && (M.a >= 32)) {
      i = g.g(paramContext);
    }
    if ((h.t0) && (paramContext == null)) {
      g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
    }
  }
  
  public static void D(A.a parama, e parame, y.a[] paramArrayOfa)
  {
    int m = parama.d();
    for (int n = 0; n < m; n++)
    {
      x0.Z localZ = parama.f(n);
      if (parame.k(n, localZ))
      {
        parame.j(n, localZ);
        paramArrayOfa[n] = null;
      }
    }
  }
  
  public static void E(A.a parama, K paramK, y.a[] paramArrayOfa)
  {
    int m = parama.d();
    paramArrayOfa = new HashMap();
    int n = 0;
    for (int i1 = 0; i1 < m; i1++) {
      F(parama.f(i1), paramK, paramArrayOfa);
    }
    F(parama.h(), paramK, paramArrayOfa);
    for (i1 = n; i1 < m; i1++) {
      android.support.v4.media.a.a(paramArrayOfa.get(Integer.valueOf(parama.e(i1))));
    }
  }
  
  public static void F(x0.Z paramZ, K paramK, Map paramMap)
  {
    for (int m = 0; m < a; m++)
    {
      paramMap = paramZ.b(m);
      android.support.v4.media.a.a(A.get(paramMap));
    }
  }
  
  public static int G(d0.q paramq, String paramString, boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(d))) {
      return 4;
    }
    paramString = X(paramString);
    paramq = X(d);
    int m = 0;
    if ((paramq != null) && (paramString != null))
    {
      if ((!paramq.startsWith(paramString)) && (!paramString.startsWith(paramq)))
      {
        if (M.c1(paramq, "-")[0].equals(M.c1(paramString, "-")[0])) {
          return 2;
        }
        return 0;
      }
      return 3;
    }
    int n = m;
    if (paramBoolean)
    {
      n = m;
      if (paramq == null) {
        n = 1;
      }
    }
    return n;
  }
  
  public static int H(J paramJ, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int m = Integer.MAX_VALUE;
    int n = m;
    if (paramInt1 != Integer.MAX_VALUE) {
      if (paramInt2 == Integer.MAX_VALUE)
      {
        n = m;
      }
      else
      {
        int i1 = 0;
        for (;;)
        {
          n = m;
          if (i1 >= a) {
            break;
          }
          d0.q localq = paramJ.a(i1);
          int i2 = t;
          n = m;
          if (i2 > 0)
          {
            int i3 = u;
            n = m;
            if (i3 > 0)
            {
              Point localPoint = I(paramBoolean, paramInt1, paramInt2, i2, i3);
              i3 = t;
              int i4 = u;
              i2 = i3 * i4;
              n = m;
              if (i3 >= (int)(x * 0.98F))
              {
                n = m;
                if (i4 >= (int)(y * 0.98F))
                {
                  n = m;
                  if (i2 < m) {
                    n = i2;
                  }
                }
              }
            }
          }
          i1++;
          m = n;
        }
      }
    }
    return n;
  }
  
  public static Point I(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean)
    {
      m = 0;
      if (paramInt3 > paramInt4) {
        n = 1;
      } else {
        n = 0;
      }
      if (paramInt1 > paramInt2) {
        m = 1;
      }
      if (n != m) {}
    }
    else
    {
      n = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = n;
    }
    int m = paramInt3 * paramInt1;
    int n = paramInt4 * paramInt2;
    if (m >= n) {
      return new Point(paramInt2, M.k(n, paramInt3));
    }
    return new Point(M.k(m, paramInt4), paramInt1);
  }
  
  public static int K(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt1 == paramInt2)) {
      return Integer.MAX_VALUE;
    }
    return Integer.bitCount(paramInt1 & paramInt2);
  }
  
  public static int L(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int m = paramString.hashCode();
    int n = -1;
    switch (m)
    {
    default: 
      break;
    case 1599127257: 
      if (paramString.equals("video/x-vnd.on2.vp9")) {
        n = 4;
      }
      break;
    case 1331836730: 
      if (paramString.equals("video/avc")) {
        n = 3;
      }
      break;
    case -1662541442: 
      if (paramString.equals("video/hevc")) {
        n = 2;
      }
      break;
    case -1662735862: 
      if (paramString.equals("video/av01")) {
        n = 1;
      }
      break;
    case -1851077871: 
      if (paramString.equals("video/dolby-vision")) {
        n = 0;
      }
      break;
    }
    switch (n)
    {
    default: 
      return 0;
    case 4: 
      return 2;
    case 3: 
      return 1;
    case 2: 
      return 3;
    case 1: 
      return 4;
    }
    return 5;
  }
  
  public static boolean N(d0.q paramq)
  {
    paramq = paramq.n;
    if (paramq == null) {
      return false;
    }
    paramq.hashCode();
    int m = paramq.hashCode();
    int n = -1;
    switch (m)
    {
    default: 
      break;
    case 1504578661: 
      if (paramq.equals("audio/eac3")) {
        n = 3;
      }
      break;
    case 187078297: 
      if (paramq.equals("audio/ac4")) {
        n = 2;
      }
      break;
    case 187078296: 
      if (paramq.equals("audio/ac3")) {
        n = 1;
      }
      break;
    case -2123537834: 
      if (paramq.equals("audio/eac3-joc")) {
        n = 0;
      }
      break;
    }
    switch (n)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static void T(e parame, A.a parama, int[][][] paramArrayOfInt, b1[] paramArrayOfb1, y[] paramArrayOfy)
  {
    int m = -1;
    boolean bool1 = false;
    int n = 0;
    int i4;
    for (int i1 = n; n < parama.d(); i1 = i4)
    {
      int i2 = parama.e(n);
      y localy = paramArrayOfy[n];
      if ((i2 != 1) && (localy != null)) {
        return;
      }
      int i3 = m;
      i4 = i1;
      if (i2 == 1)
      {
        i3 = m;
        i4 = i1;
        if (localy != null)
        {
          i3 = m;
          i4 = i1;
          if (localy.length() == 1)
          {
            i2 = parama.f(n).d(localy.d());
            i3 = m;
            i4 = i1;
            if (Y(parame, paramArrayOfInt[n][i2][localy.c(0)], localy.m()))
            {
              i4 = i1 + 1;
              i3 = n;
            }
          }
        }
      }
      n++;
      m = i3;
    }
    if (i1 == 1)
    {
      if (s.b) {
        n = 1;
      } else {
        n = 2;
      }
      parame = paramArrayOfb1[m];
      boolean bool2 = bool1;
      if (parame != null)
      {
        bool2 = bool1;
        if (b) {
          bool2 = true;
        }
      }
      paramArrayOfb1[m] = new b1(n, bool2);
    }
  }
  
  public static void U(A.a parama, int[][][] paramArrayOfInt, b1[] paramArrayOfb1, y[] paramArrayOfy)
  {
    int m = -1;
    int n = m;
    int i1 = 0;
    int i3;
    while (i1 < parama.d())
    {
      int i2 = parama.e(i1);
      y localy = paramArrayOfy[i1];
      int i4;
      if (i2 != 1)
      {
        i3 = m;
        i4 = n;
        if (i2 != 2) {}
      }
      else
      {
        i3 = m;
        i4 = n;
        if (localy != null)
        {
          i3 = m;
          i4 = n;
          if (Z(paramArrayOfInt[i1], parama.f(i1), localy))
          {
            if (i2 == 1) {
              if (n == -1) {}
            }
            while (m != -1)
            {
              i1 = 0;
              break label155;
              i4 = i1;
              i3 = m;
              break;
            }
            i3 = i1;
            i4 = n;
          }
        }
      }
      i1++;
      m = i3;
      n = i4;
    }
    i1 = 1;
    label155:
    if ((n != -1) && (m != -1)) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((i1 & i3) != 0)
    {
      parama = new b1(0, true);
      paramArrayOfb1[n] = parama;
      paramArrayOfb1[m] = parama;
    }
  }
  
  public static String X(String paramString)
  {
    String str;
    if (!TextUtils.isEmpty(paramString))
    {
      str = paramString;
      if (!TextUtils.equals(paramString, "und")) {}
    }
    else
    {
      str = null;
    }
    return str;
  }
  
  public static boolean Y(e parame, int paramInt, d0.q paramq)
  {
    int m = Z0.f(paramInt);
    boolean bool = false;
    if (m == 0) {
      return false;
    }
    if ((s.c) && ((Z0.f(paramInt) & 0x800) == 0)) {
      return false;
    }
    if (s.b)
    {
      if ((E == 0) && (F == 0)) {
        m = 0;
      } else {
        m = 1;
      }
      if ((Z0.f(paramInt) & 0x400) != 0) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if ((m == 0) || (paramInt != 0)) {
        bool = true;
      }
      return bool;
    }
    return true;
  }
  
  public static boolean Z(int[][] paramArrayOfInt, x0.Z paramZ, y paramy)
  {
    if (paramy == null) {
      return false;
    }
    int m = paramZ.d(paramy.d());
    for (int n = 0; n < paramy.length(); n++) {
      if (Z0.j(paramArrayOfInt[m][paramy.c(n)]) != 32) {
        return false;
      }
    }
    return true;
  }
  
  public e J()
  {
    synchronized (d)
    {
      e locale = h;
      return locale;
    }
  }
  
  public final boolean M(d0.q paramq)
  {
    g localg;
    synchronized (d)
    {
      if ((!h.t0) || (g) || (B <= 2)) {
        break label138;
      }
      if (N(paramq))
      {
        if (M.a < 32) {
          break label138;
        }
        localg = i;
        if ((localg == null) || (!localg.e())) {
          break label138;
        }
      }
    }
    if (M.a >= 32)
    {
      localg = i;
      if ((localg != null) && (localg.e()) && (i.c()) && (i.d()) && (i.a(j, paramq))) {}
    }
    else
    {
      bool = false;
      break label141;
    }
    label138:
    boolean bool = true;
    label141:
    return bool;
  }
  
  public final void V()
  {
    synchronized (d)
    {
      if ((h.t0) && (!g) && (M.a >= 32))
      {
        g localg = i;
        if ((localg != null) && (localg.e())) {
          m = 1;
        }
      }
    }
    int m = 0;
    if (m != 0) {
      f();
    }
    return;
    throw ((Throwable)localObject2);
  }
  
  public final void W(Y0 paramY0)
  {
    synchronized (d)
    {
      boolean bool = h.x0;
      if (bool) {
        g(paramY0);
      }
      return;
    }
  }
  
  public void a(Y0 paramY0)
  {
    W(paramY0);
  }
  
  public y.a[] a0(A.a parama, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, e parame)
  {
    int m = parama.d();
    y.a[] arrayOfa = new y.a[m];
    Pair localPair1 = g0(parama, paramArrayOfInt, paramArrayOfInt1, parame);
    boolean bool = x;
    Object localObject = null;
    Pair localPair2;
    if ((!bool) && (localPair1 != null)) {
      localPair2 = null;
    } else {
      localPair2 = c0(parama, paramArrayOfInt, parame);
    }
    if (localPair2 != null) {
      arrayOfa[((Integer)second).intValue()] = ((y.a)first);
    } else if (localPair1 != null) {
      arrayOfa[((Integer)second).intValue()] = ((y.a)first);
    }
    paramArrayOfInt1 = b0(parama, paramArrayOfInt, paramArrayOfInt1, parame);
    if (paramArrayOfInt1 != null) {
      arrayOfa[((Integer)second).intValue()] = ((y.a)first);
    }
    int n = 0;
    if (paramArrayOfInt1 == null)
    {
      paramArrayOfInt1 = (int[])localObject;
    }
    else
    {
      paramArrayOfInt1 = first;
      paramArrayOfInt1 = a.a(b[0]).d;
    }
    paramArrayOfInt1 = e0(parama, paramArrayOfInt, parame, paramArrayOfInt1);
    int i1 = n;
    if (paramArrayOfInt1 != null) {
      arrayOfa[((Integer)second).intValue()] = ((y.a)first);
    }
    for (i1 = n; i1 < m; i1++)
    {
      n = parama.e(i1);
      if ((n != 2) && (n != 1) && (n != 3) && (n != 4)) {
        arrayOfa[i1] = d0(n, parama.f(i1), paramArrayOfInt[i1], parame);
      }
    }
    return arrayOfa;
  }
  
  public Pair b0(A.a parama, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, e parame)
  {
    boolean bool1 = false;
    boolean bool2;
    for (int m = 0;; m++)
    {
      bool2 = bool1;
      if (m >= parama.d()) {
        break;
      }
      if ((2 == parama.e(m)) && (fa > 0))
      {
        bool2 = true;
        break;
      }
    }
    return f0(1, parama, paramArrayOfInt, new g(this, parame, bool2, paramArrayOfInt1), new h());
  }
  
  public Pair c0(A.a parama, int[][][] paramArrayOfInt, e parame)
  {
    if (s.a == 2) {
      return null;
    }
    return f0(4, parama, paramArrayOfInt, new e(parame), new f());
  }
  
  public a1.a d()
  {
    return this;
  }
  
  public y.a d0(int paramInt, x0.Z paramZ, int[][] paramArrayOfInt, e parame)
  {
    paramInt = s.a;
    Object localObject1 = null;
    if (paramInt == 2) {
      return null;
    }
    int m = 0;
    int n = m;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    while (m < a)
    {
      J localJ = paramZ.b(m);
      int[] arrayOfInt = paramArrayOfInt[m];
      paramInt = 0;
      while (paramInt < a)
      {
        Object localObject4 = localObject2;
        int i1 = n;
        Object localObject5 = localObject3;
        if (Z0.k(arrayOfInt[paramInt], u0))
        {
          d locald = new d(localJ.a(paramInt), arrayOfInt[paramInt]);
          if (localObject3 != null)
          {
            localObject4 = localObject2;
            i1 = n;
            localObject5 = localObject3;
            if (locald.c((d)localObject3) <= 0) {}
          }
          else
          {
            localObject4 = localJ;
            i1 = paramInt;
            localObject5 = locald;
          }
        }
        paramInt++;
        localObject2 = localObject4;
        n = i1;
        localObject3 = localObject5;
      }
      m++;
    }
    if (localObject2 == null) {
      paramZ = (x0.Z)localObject1;
    } else {
      paramZ = new y.a((J)localObject2, new int[] { n });
    }
    return paramZ;
  }
  
  public Pair e0(A.a parama, int[][][] paramArrayOfInt, e parame, String paramString)
  {
    if (s.a == 2) {
      return null;
    }
    return f0(3, parama, paramArrayOfInt, new k(parame, paramString), new l());
  }
  
  public final Pair f0(int paramInt, A.a parama, int[][][] paramArrayOfInt, n.i.a parama1, Comparator paramComparator)
  {
    ArrayList localArrayList = new ArrayList();
    int m = parama.d();
    int n = 0;
    for (;;)
    {
      Object localObject = parama;
      if (n >= m) {
        break;
      }
      int i1 = m;
      if (paramInt == ((A.a)localObject).e(n))
      {
        x0.Z localZ = ((A.a)localObject).f(n);
        for (int i2 = 0;; i2++)
        {
          i1 = m;
          if (i2 >= a) {
            break;
          }
          J localJ = localZ.b(i2);
          List localList = parama1.a(n, localJ, paramArrayOfInt[n][i2]);
          boolean[] arrayOfBoolean = new boolean[a];
          for (i1 = 0; i1 < a; i1++)
          {
            i locali1 = (i)localList.get(i1);
            int i3 = locali1.c();
            if ((arrayOfBoolean[i1] != 0) || (i3 != 0))
            {
              if (i3 == 1)
              {
                localObject = X2.v.Z(locali1);
              }
              else
              {
                localObject = new ArrayList();
                ((List)localObject).add(locali1);
                for (i3 = i1 + 1; i3 < a; i3++)
                {
                  i locali2 = (i)localList.get(i3);
                  if ((locali2.c() == 2) && (locali1.e(locali2)))
                  {
                    ((List)localObject).add(locali2);
                    arrayOfBoolean[i3] = true;
                  }
                }
              }
              localArrayList.add(localObject);
            }
          }
        }
      }
      n++;
      m = i1;
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    paramArrayOfInt = (List)Collections.max(localArrayList, paramComparator);
    parama = new int[paramArrayOfInt.size()];
    for (paramInt = 0; paramInt < paramArrayOfInt.size(); paramInt++) {
      parama[paramInt] = getq;
    }
    paramArrayOfInt = (i)paramArrayOfInt.get(0);
    return Pair.create(new y.a(p, parama), Integer.valueOf(o));
  }
  
  public Pair g0(A.a parama, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, e parame)
  {
    if (s.a == 2) {
      return null;
    }
    return f0(2, parama, paramArrayOfInt, new i(parame, paramArrayOfInt1), new j());
  }
  
  public boolean h()
  {
    return true;
  }
  
  public final void h0(e parame)
  {
    g0.a.e(parame);
    synchronized (d)
    {
      boolean bool = h.equals(parame);
      h = parame;
      if ((bool ^ true))
      {
        if ((t0) && (e == null)) {
          g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
      }
      return;
    }
  }
  
  public void j()
  {
    synchronized (d)
    {
      if (M.a >= 32)
      {
        g localg = i;
        if (localg != null) {
          localg.f();
        }
      }
    }
    super.j();
    return;
    throw ((Throwable)localObject2);
  }
  
  public void l(b paramb)
  {
    synchronized (d)
    {
      boolean bool = j.equals(paramb);
      j = paramb;
      if ((bool ^ true)) {
        V();
      }
      return;
    }
  }
  
  public void m(K paramK)
  {
    if ((paramK instanceof e)) {
      h0((e)paramK);
    }
    h0(new n.e.a(J(), null).d0(paramK).a0());
  }
  
  public final Pair q(A.a parama, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, x.b paramb, I paramI)
  {
    e locale;
    synchronized (d)
    {
      locale = h;
      if ((t0) && (M.a >= 32))
      {
        g localg = i;
        if (localg != null) {
          localg.b(this, (Looper)g0.a.h(Looper.myLooper()));
        }
      }
    }
    int m = parama.d();
    paramArrayOfInt1 = a0(parama, paramArrayOfInt, paramArrayOfInt1, locale);
    E(parama, locale, paramArrayOfInt1);
    D(parama, locale, paramArrayOfInt1);
    int n = 0;
    for (int i1 = 0; i1 < m; i1++)
    {
      int i2 = parama.e(i1);
      if ((locale.i(i1)) || (B.contains(Integer.valueOf(i2)))) {
        paramArrayOfInt1[i1] = null;
      }
    }
    paramb = f.a(paramArrayOfInt1, b(), paramb, paramI);
    paramI = new b1[m];
    for (i1 = n; i1 < m; i1++)
    {
      n = parama.e(i1);
      if ((!locale.i(i1)) && (!B.contains(Integer.valueOf(n))) && ((parama.e(i1) == -2) || (paramb[i1] != null))) {
        paramArrayOfInt1 = b1.c;
      } else {
        paramArrayOfInt1 = null;
      }
      paramI[i1] = paramArrayOfInt1;
    }
    if (v0) {
      U(parama, paramArrayOfInt, paramI, paramb);
    }
    if (s.a != 0) {
      T(locale, parama, paramArrayOfInt, paramI, paramb);
    }
    return Pair.create(paramI, paramb);
  }
  
  public static final class b
    extends n.i
    implements Comparable
  {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int s;
    public final boolean t;
    public final String u;
    public final n.e v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;
    
    public b(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, boolean paramBoolean, W2.n paramn, int paramInt4)
    {
      super(paramJ, paramInt2);
      v = parame;
      if (s0) {
        paramInt2 = 24;
      } else {
        paramInt2 = 16;
      }
      boolean bool1 = o0;
      boolean bool2 = true;
      if ((bool1) && ((paramInt4 & paramInt2) != 0)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      A = bool1;
      u = n.X(r.d);
      w = Z0.k(paramInt3, false);
      int i;
      int j;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt4 = n.size();
        i = Integer.MAX_VALUE;
        if (paramInt1 >= paramInt4) {
          break;
        }
        j = n.G(r, (String)n.get(paramInt1), false);
        if (j > 0)
        {
          paramInt4 = paramInt1;
          paramInt1 = j;
          break label163;
        }
      }
      paramInt1 = 0;
      paramInt4 = Integer.MAX_VALUE;
      label163:
      y = paramInt4;
      x = paramInt1;
      z = n.y(r.f, o);
      paramJ = r;
      paramInt1 = f;
      if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
        bool1 = false;
      } else {
        bool1 = true;
      }
      B = bool1;
      if ((e & 0x1) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      E = bool1;
      paramInt4 = B;
      F = paramInt4;
      G = C;
      paramInt1 = i;
      H = paramInt1;
      if (((paramInt1 == -1) || (paramInt1 <= q)) && ((paramInt4 == -1) || (paramInt4 <= p)) && (paramn.apply(paramJ))) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      t = bool1;
      paramJ = M.l0();
      for (paramInt1 = 0; paramInt1 < paramJ.length; paramInt1++)
      {
        j = n.G(r, paramJ[paramInt1], false);
        if (j > 0)
        {
          paramInt4 = paramInt1;
          paramInt1 = j;
          break label392;
        }
      }
      paramInt1 = 0;
      paramInt4 = Integer.MAX_VALUE;
      label392:
      C = paramInt4;
      D = paramInt1;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt4 = i;
        if (paramInt1 >= r.size()) {
          break;
        }
        paramJ = r.n;
        if ((paramJ != null) && (paramJ.equals(r.get(paramInt1))))
        {
          paramInt4 = paramInt1;
          break;
        }
      }
      I = paramInt4;
      if (Z0.g(paramInt3) == 128) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      J = bool1;
      if (Z0.i(paramInt3) == 64) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      K = bool1;
      s = m(paramInt3, paramBoolean, paramInt2);
    }
    
    public static int h(List paramList1, List paramList2)
    {
      return ((b)Collections.max(paramList1)).j((b)Collections.max(paramList2));
    }
    
    public static X2.v l(int paramInt1, J paramJ, n.e parame, int[] paramArrayOfInt, boolean paramBoolean, W2.n paramn, int paramInt2)
    {
      v.a locala = X2.v.M();
      for (int i = 0; i < a; i++) {
        locala.h(new b(paramInt1, paramJ, i, parame, paramArrayOfInt[i], paramBoolean, paramn, paramInt2));
      }
      return locala.k();
    }
    
    public int c()
    {
      return s;
    }
    
    public int j(b paramb)
    {
      P localP;
      if ((t) && (w)) {
        localP = n.A();
      } else {
        localP = n.A().g();
      }
      X2.n localn1 = X2.n.j().g(w, w).f(Integer.valueOf(y), Integer.valueOf(y), P.d().g()).d(x, x).d(z, z).g(E, E).g(B, B).f(Integer.valueOf(C), Integer.valueOf(C), P.d().g()).d(D, D).g(t, t).f(Integer.valueOf(I), Integer.valueOf(I), P.d().g());
      X2.n localn2 = localn1;
      if (v.y) {
        localn2 = localn1.f(Integer.valueOf(H), Integer.valueOf(H), n.A().g());
      }
      localn1 = localn2.g(J, J).g(K, K).f(Integer.valueOf(F), Integer.valueOf(F), localP).f(Integer.valueOf(G), Integer.valueOf(G), localP);
      localn2 = localn1;
      if (M.c(u, u)) {
        localn2 = localn1.f(Integer.valueOf(H), Integer.valueOf(H), localP);
      }
      return localn2.i();
    }
    
    public final int m(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      if (!Z0.k(paramInt1, v.u0)) {
        return 0;
      }
      if ((!t) && (!v.n0)) {
        return 0;
      }
      n.e locale = v;
      int i = s.a;
      int j = 2;
      if ((i == 2) && (!n.B(locale, paramInt1, r))) {
        return 0;
      }
      if ((Z0.k(paramInt1, false)) && (t) && (r.i != -1))
      {
        locale = v;
        if ((!z) && (!y) && ((w0) || (!paramBoolean)) && (s.a != 2) && ((paramInt1 & paramInt2) != 0)) {
          return j;
        }
      }
      paramInt1 = 1;
      return paramInt1;
    }
    
    public boolean n(b paramb)
    {
      int i;
      if (!v.q0)
      {
        i = r.B;
        if ((i == -1) || (i != r.B)) {}
      }
      else
      {
        Object localObject;
        if (!A)
        {
          localObject = r.n;
          if ((localObject == null) || (!TextUtils.equals((CharSequence)localObject, r.n))) {}
        }
        else
        {
          localObject = v;
          if (!p0)
          {
            i = r.C;
            if ((i == -1) || (i != r.C)) {}
          }
          else
          {
            if ((r0) || ((J == J) && (K == K))) {
              break label141;
            }
          }
        }
      }
      boolean bool = false;
      break label144;
      label141:
      bool = true;
      label144:
      return bool;
    }
  }
  
  public static final class c
    extends n.i
    implements Comparable
  {
    public final int s;
    public final int t;
    
    public c(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3)
    {
      super(paramJ, paramInt2);
      s = Z0.k(paramInt3, u0);
      t = r.d();
    }
    
    public static int h(List paramList1, List paramList2)
    {
      return ((c)paramList1.get(0)).j((c)paramList2.get(0));
    }
    
    public static X2.v l(int paramInt, J paramJ, n.e parame, int[] paramArrayOfInt)
    {
      v.a locala = X2.v.M();
      for (int i = 0; i < a; i++) {
        locala.h(new c(paramInt, paramJ, i, parame, paramArrayOfInt[i]));
      }
      return locala.k();
    }
    
    public int c()
    {
      return s;
    }
    
    public int j(c paramc)
    {
      return Integer.compare(t, t);
    }
    
    public boolean m(c paramc)
    {
      return false;
    }
  }
  
  public static final class d
    implements Comparable
  {
    public final boolean o;
    public final boolean p;
    
    public d(d0.q paramq, int paramInt)
    {
      int i = e;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      o = bool;
      p = Z0.k(paramInt, false);
    }
    
    public int c(d paramd)
    {
      return X2.n.j().g(p, p).g(o, o).i();
    }
  }
  
  public static final class e
    extends K
  {
    public static final e A0;
    public static final e B0;
    public static final String C0 = M.w0(1000);
    public static final String D0 = M.w0(1001);
    public static final String E0 = M.w0(1002);
    public static final String F0 = M.w0(1003);
    public static final String G0 = M.w0(1004);
    public static final String H0 = M.w0(1005);
    public static final String I0 = M.w0(1006);
    public static final String J0 = M.w0(1007);
    public static final String K0 = M.w0(1008);
    public static final String L0 = M.w0(1009);
    public static final String M0 = M.w0(1010);
    public static final String N0 = M.w0(1011);
    public static final String O0 = M.w0(1012);
    public static final String P0 = M.w0(1013);
    public static final String Q0 = M.w0(1014);
    public static final String R0 = M.w0(1015);
    public static final String S0 = M.w0(1016);
    public static final String T0 = M.w0(1017);
    public static final String U0 = M.w0(1018);
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final SparseArray y0;
    public final SparseBooleanArray z0;
    
    static
    {
      e locale = new a().a0();
      A0 = locale;
      B0 = locale;
    }
    
    public e(a parama)
    {
      super();
      j0 = a.J(parama);
      k0 = a.K(parama);
      l0 = a.L(parama);
      m0 = a.M(parama);
      n0 = a.N(parama);
      o0 = a.O(parama);
      p0 = a.P(parama);
      q0 = a.Q(parama);
      r0 = a.R(parama);
      s0 = a.S(parama);
      t0 = a.T(parama);
      u0 = a.U(parama);
      v0 = a.V(parama);
      w0 = a.W(parama);
      x0 = a.X(parama);
      y0 = a.Y(parama);
      z0 = a.Z(parama);
    }
    
    public static boolean d(SparseBooleanArray paramSparseBooleanArray1, SparseBooleanArray paramSparseBooleanArray2)
    {
      int i = paramSparseBooleanArray1.size();
      if (paramSparseBooleanArray2.size() != i) {
        return false;
      }
      for (int j = 0; j < i; j++) {
        if (paramSparseBooleanArray2.indexOfKey(paramSparseBooleanArray1.keyAt(j)) < 0) {
          return false;
        }
      }
      return true;
    }
    
    public static boolean e(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
    {
      int i = paramSparseArray1.size();
      if (paramSparseArray2.size() != i) {
        return false;
      }
      int j = 0;
      while (j < i)
      {
        int k = paramSparseArray2.indexOfKey(paramSparseArray1.keyAt(j));
        if ((k >= 0) && (f((Map)paramSparseArray1.valueAt(j), (Map)paramSparseArray2.valueAt(k)))) {
          j++;
        } else {
          return false;
        }
      }
      return true;
    }
    
    public static boolean f(Map paramMap1, Map paramMap2)
    {
      int i = paramMap1.size();
      if (paramMap2.size() != i) {
        return false;
      }
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap1 = (Map.Entry)localIterator.next();
        x0.Z localZ = (x0.Z)paramMap1.getKey();
        if ((!paramMap2.containsKey(localZ)) || (!M.c(paramMap1.getValue(), paramMap2.get(localZ)))) {
          return false;
        }
      }
      return true;
    }
    
    public static e h(Context paramContext)
    {
      return new a(paramContext).a0();
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (e.class == paramObject.getClass()))
      {
        paramObject = (e)paramObject;
        if ((!super.equals(paramObject)) || (j0 != j0) || (k0 != k0) || (l0 != l0) || (m0 != m0) || (n0 != n0) || (o0 != o0) || (p0 != p0) || (q0 != q0) || (r0 != r0) || (s0 != s0) || (t0 != t0) || (u0 != u0) || (v0 != v0) || (w0 != w0) || (x0 != x0) || (!d(z0, z0)) || (!e(y0, y0))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public a g()
    {
      return new a(this, null);
    }
    
    public int hashCode()
    {
      return (((((((((((((((super.hashCode() + 31) * 31 + j0) * 31 + k0) * 31 + l0) * 31 + m0) * 31 + n0) * 31 + o0) * 31 + p0) * 31 + q0) * 31 + r0) * 31 + s0) * 31 + t0) * 31 + u0) * 31 + v0) * 31 + w0) * 31 + x0;
    }
    
    public boolean i(int paramInt)
    {
      return z0.get(paramInt);
    }
    
    public n.f j(int paramInt, x0.Z paramZ)
    {
      Map localMap = (Map)y0.get(paramInt);
      if (localMap != null) {
        android.support.v4.media.a.a(localMap.get(paramZ));
      }
      return null;
    }
    
    public boolean k(int paramInt, x0.Z paramZ)
    {
      Map localMap = (Map)y0.get(paramInt);
      boolean bool;
      if ((localMap != null) && (localMap.containsKey(paramZ))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public static final class a
      extends K.c
    {
      public boolean C;
      public boolean D;
      public boolean E;
      public boolean F;
      public boolean G;
      public boolean H;
      public boolean I;
      public boolean J;
      public boolean K;
      public boolean L;
      public boolean M;
      public boolean N;
      public boolean O;
      public boolean P;
      public boolean Q;
      public final SparseArray R;
      public final SparseBooleanArray S;
      
      public a()
      {
        R = new SparseArray();
        S = new SparseBooleanArray();
        c0();
      }
      
      public a(n.e parame)
      {
        super();
        C = j0;
        D = k0;
        E = l0;
        F = m0;
        G = n0;
        H = o0;
        I = p0;
        J = q0;
        K = r0;
        L = s0;
        M = t0;
        N = u0;
        O = v0;
        P = w0;
        Q = x0;
        R = b0(n.e.b(parame));
        S = n.e.c(parame).clone();
      }
      
      public a(Context paramContext)
      {
        super();
        R = new SparseArray();
        S = new SparseBooleanArray();
        c0();
      }
      
      public static SparseArray b0(SparseArray paramSparseArray)
      {
        SparseArray localSparseArray = new SparseArray();
        for (int i = 0; i < paramSparseArray.size(); i++) {
          localSparseArray.put(paramSparseArray.keyAt(i), new HashMap((Map)paramSparseArray.valueAt(i)));
        }
        return localSparseArray;
      }
      
      public n.e a0()
      {
        return new n.e(this, null);
      }
      
      public final void c0()
      {
        C = true;
        D = false;
        E = true;
        F = false;
        G = true;
        H = false;
        I = false;
        J = false;
        K = false;
        L = true;
        M = true;
        N = true;
        O = false;
        P = true;
        Q = false;
      }
      
      public a d0(K paramK)
      {
        super.E(paramK);
        return this;
      }
      
      public a e0(Context paramContext)
      {
        super.G(paramContext);
        return this;
      }
      
      public a f0(int paramInt1, int paramInt2, boolean paramBoolean)
      {
        super.H(paramInt1, paramInt2, paramBoolean);
        return this;
      }
      
      public a g0(Context paramContext, boolean paramBoolean)
      {
        super.I(paramContext, paramBoolean);
        return this;
      }
    }
  }
  
  public static final abstract class f {}
  
  public static class g
  {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer.OnSpatializerStateChangedListener d;
    
    public g(Spatializer paramSpatializer)
    {
      a = paramSpatializer;
      boolean bool;
      if (p.a(paramSpatializer) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      b = bool;
    }
    
    public static g g(Context paramContext)
    {
      paramContext = (AudioManager)paramContext.getSystemService("audio");
      if (paramContext == null) {
        paramContext = null;
      } else {
        paramContext = new g(o.a(paramContext));
      }
      return paramContext;
    }
    
    public boolean a(b paramb, d0.q paramq)
    {
      if (("audio/eac3-joc".equals(n)) && (B == 16)) {
        i = 12;
      } else {
        i = B;
      }
      int i = M.M(i);
      if (i == 0) {
        return false;
      }
      AudioFormat.Builder localBuilder = new AudioFormat.Builder().setEncoding(2).setChannelMask(i);
      i = C;
      if (i != -1) {
        localBuilder.setSampleRate(i);
      }
      return u.a(a, aa, localBuilder.build());
    }
    
    public void b(final n paramn, Looper paramLooper)
    {
      if ((d == null) && (c == null))
      {
        d = new a(paramn);
        paramLooper = new Handler(paramLooper);
        c = paramLooper;
        paramn = a;
        Objects.requireNonNull(paramLooper);
        q.a(paramn, new m0.Z(paramLooper), d);
      }
    }
    
    public boolean c()
    {
      return s.a(a);
    }
    
    public boolean d()
    {
      return t.a(a);
    }
    
    public boolean e()
    {
      return b;
    }
    
    public void f()
    {
      Spatializer.OnSpatializerStateChangedListener localOnSpatializerStateChangedListener = d;
      if ((localOnSpatializerStateChangedListener != null) && (c != null))
      {
        r.a(a, localOnSpatializerStateChangedListener);
        ((Handler)M.i(c)).removeCallbacksAndMessages(null);
        c = null;
        d = null;
      }
    }
    
    public class a
      implements Spatializer.OnSpatializerStateChangedListener
    {
      public a(n paramn) {}
      
      public void onSpatializerAvailableChanged(Spatializer paramSpatializer, boolean paramBoolean)
      {
        n.C(paramn);
      }
      
      public void onSpatializerEnabledChanged(Spatializer paramSpatializer, boolean paramBoolean)
      {
        n.C(paramn);
      }
    }
  }
  
  public static final class h
    extends n.i
    implements Comparable
  {
    public final boolean A;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;
    
    public h(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, String paramString)
    {
      super(paramJ, paramInt2);
      int i = 0;
      t = Z0.k(paramInt3, false);
      paramInt1 = r.e & v;
      boolean bool;
      if ((paramInt1 & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      u = bool;
      if ((paramInt1 & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      v = bool;
      if (t.isEmpty()) {
        paramJ = X2.v.Z("");
      } else {
        paramJ = t;
      }
      for (paramInt1 = 0; paramInt1 < paramJ.size(); paramInt1++)
      {
        paramInt2 = n.G(r, (String)paramJ.get(paramInt1), w);
        if (paramInt2 > 0) {
          break label153;
        }
      }
      paramInt1 = Integer.MAX_VALUE;
      paramInt2 = 0;
      label153:
      w = paramInt1;
      x = paramInt2;
      paramInt1 = n.y(r.f, u);
      y = paramInt1;
      if ((r.f & 0x440) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      A = bool;
      if (n.X(paramString) == null) {
        bool = true;
      } else {
        bool = false;
      }
      int j = n.G(r, paramString, bool);
      z = j;
      if ((paramInt2 <= 0) && ((!t.isEmpty()) || (paramInt1 <= 0)) && (!u) && ((!v) || (j <= 0))) {
        paramInt1 = 0;
      } else {
        paramInt1 = 1;
      }
      paramInt2 = i;
      if (Z0.k(paramInt3, u0))
      {
        paramInt2 = i;
        if (paramInt1 != 0) {
          paramInt2 = 1;
        }
      }
      s = paramInt2;
    }
    
    public static int h(List paramList1, List paramList2)
    {
      return ((h)paramList1.get(0)).j((h)paramList2.get(0));
    }
    
    public static X2.v l(int paramInt, J paramJ, n.e parame, int[] paramArrayOfInt, String paramString)
    {
      v.a locala = X2.v.M();
      for (int i = 0; i < a; i++) {
        locala.h(new h(paramInt, paramJ, i, parame, paramArrayOfInt[i], paramString));
      }
      return locala.k();
    }
    
    public int c()
    {
      return s;
    }
    
    public int j(h paramh)
    {
      X2.n localn = X2.n.j().g(t, t).f(Integer.valueOf(w), Integer.valueOf(w), P.d().g()).d(x, x).d(y, y).g(u, u);
      boolean bool1 = v;
      boolean bool2 = v;
      if (x == 0) {
        localObject = P.d();
      } else {
        localObject = P.d().g();
      }
      localn = localn.f(Boolean.valueOf(bool1), Boolean.valueOf(bool2), (Comparator)localObject).d(z, z);
      Object localObject = localn;
      if (y == 0) {
        localObject = localn.h(A, A);
      }
      return ((X2.n)localObject).i();
    }
    
    public boolean m(h paramh)
    {
      return false;
    }
  }
  
  public static abstract class i
  {
    public final int o;
    public final J p;
    public final int q;
    public final d0.q r;
    
    public i(int paramInt1, J paramJ, int paramInt2)
    {
      o = paramInt1;
      p = paramJ;
      q = paramInt2;
      r = paramJ.a(paramInt2);
    }
    
    public abstract int c();
    
    public abstract boolean e(i parami);
    
    public static abstract interface a
    {
      public abstract List a(int paramInt, J paramJ, int[] paramArrayOfInt);
    }
  }
  
  public static final class j
    extends n.i
  {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final boolean s;
    public final n.e t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;
    
    public j(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      super(paramJ, paramInt2);
      t = parame;
      if (l0) {
        paramInt2 = 24;
      } else {
        paramInt2 = 16;
      }
      boolean bool1 = k0;
      boolean bool2 = true;
      if ((bool1) && ((paramInt4 & paramInt2) != 0)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      C = bool1;
      if (paramBoolean)
      {
        paramJ = r;
        paramInt1 = t;
        if ((paramInt1 == -1) || (paramInt1 <= a))
        {
          paramInt1 = u;
          if ((paramInt1 == -1) || (paramInt1 <= b))
          {
            f = v;
            if ((f == -1.0F) || (f <= c))
            {
              paramInt1 = i;
              if ((paramInt1 == -1) || (paramInt1 <= d))
              {
                bool1 = true;
                break label169;
              }
            }
          }
        }
      }
      bool1 = false;
      label169:
      s = bool1;
      if (paramBoolean)
      {
        paramJ = r;
        paramInt1 = t;
        if ((paramInt1 == -1) || (paramInt1 >= e))
        {
          paramInt1 = u;
          if ((paramInt1 == -1) || (paramInt1 >= f))
          {
            f = v;
            if ((f == -1.0F) || (f >= g))
            {
              paramInt1 = i;
              if ((paramInt1 == -1) || (paramInt1 >= h))
              {
                paramBoolean = true;
                break label277;
              }
            }
          }
        }
      }
      paramBoolean = false;
      label277:
      u = paramBoolean;
      v = Z0.k(paramInt3, false);
      paramJ = r;
      float f = v;
      if ((f != -1.0F) && (f >= 10.0F)) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      w = paramBoolean;
      x = i;
      y = paramJ.d();
      A = n.y(r.f, m);
      paramInt1 = r.f;
      if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      B = paramBoolean;
      for (paramInt1 = 0; paramInt1 < l.size(); paramInt1++)
      {
        paramJ = r.n;
        if ((paramJ != null) && (paramJ.equals(l.get(paramInt1)))) {
          break label462;
        }
      }
      paramInt1 = Integer.MAX_VALUE;
      label462:
      z = paramInt1;
      if (Z0.g(paramInt3) == 128) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      E = paramBoolean;
      if (Z0.i(paramInt3) == 64) {
        paramBoolean = bool2;
      } else {
        paramBoolean = false;
      }
      F = paramBoolean;
      G = n.z(r.n);
      D = p(paramInt3, paramInt2);
    }
    
    public static int l(j paramj1, j paramj2)
    {
      X2.n localn1 = X2.n.j().g(v, v).d(A, A).g(B, B).g(w, w).g(s, s).g(u, u).f(Integer.valueOf(z), Integer.valueOf(z), P.d().g()).g(E, E).g(F, F);
      X2.n localn2 = localn1;
      if (E)
      {
        localn2 = localn1;
        if (F) {
          localn2 = localn1.d(G, G);
        }
      }
      return localn2.i();
    }
    
    public static int m(j paramj1, j paramj2)
    {
      P localP;
      if ((s) && (v)) {
        localP = n.A();
      } else {
        localP = n.A().g();
      }
      X2.n localn1 = X2.n.j();
      X2.n localn2 = localn1;
      if (t.y) {
        localn2 = localn1.f(Integer.valueOf(x), Integer.valueOf(x), n.A().g());
      }
      return localn2.f(Integer.valueOf(y), Integer.valueOf(y), localP).f(Integer.valueOf(x), Integer.valueOf(x), localP).i();
    }
    
    public static int n(List paramList1, List paramList2)
    {
      return X2.n.j().f((j)Collections.max(paramList1, new v()), (j)Collections.max(paramList2, new v()), new v()).d(paramList1.size(), paramList2.size()).f((j)Collections.max(paramList1, new w()), (j)Collections.max(paramList2, new w()), new w()).i();
    }
    
    public static X2.v o(int paramInt1, J paramJ, n.e parame, int[] paramArrayOfInt, int paramInt2)
    {
      int i = n.x(paramJ, i, j, k);
      v.a locala = X2.v.M();
      for (int j = 0; j < a; j++)
      {
        int k = paramJ.a(j).d();
        boolean bool;
        if ((i != Integer.MAX_VALUE) && ((k == -1) || (k > i))) {
          bool = false;
        } else {
          bool = true;
        }
        locala.h(new j(paramInt1, paramJ, j, parame, paramArrayOfInt[j], paramInt2, bool));
      }
      return locala.k();
    }
    
    public int c()
    {
      return D;
    }
    
    public final int p(int paramInt1, int paramInt2)
    {
      if ((r.f & 0x4000) != 0) {
        return 0;
      }
      if (!Z0.k(paramInt1, t.u0)) {
        return 0;
      }
      if ((!s) && (!t.j0)) {
        return 0;
      }
      if ((Z0.k(paramInt1, false)) && (u) && (s) && (r.i != -1))
      {
        n.e locale = t;
        if ((!z) && (!y) && ((paramInt1 & paramInt2) != 0)) {
          return 2;
        }
      }
      paramInt1 = 1;
      return paramInt1;
    }
    
    public boolean r(j paramj)
    {
      boolean bool;
      if (((!C) && (!M.c(r.n, r.n))) || ((!t.m0) && ((E != E) || (F != F)))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     A0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */