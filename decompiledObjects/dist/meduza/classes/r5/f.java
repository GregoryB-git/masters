package r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
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
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o7.k0;
import o7.l0;
import o7.n;
import o7.n.a;
import o7.o0;
import o7.t;
import o7.u;
import v3.g0;
import v5.e0;
import v5.k;
import w3.v;
import x3.d.c;

public final class f
  extends j
{
  public static final k0<Integer> j;
  public static final k0<Integer> k;
  public final Object d = new Object();
  public final h.b e;
  public final boolean f;
  public c g;
  public f h;
  public x3.d i;
  
  static
  {
    Object localObject = new b0.d(3);
    if ((localObject instanceof k0)) {
      localObject = (k0)localObject;
    } else {
      localObject = new o7.m((Comparator)localObject);
    }
    j = (k0)localObject;
    localObject = new c(0);
    if ((localObject instanceof k0)) {
      localObject = (k0)localObject;
    } else {
      localObject = new o7.m((Comparator)localObject);
    }
    k = (k0)localObject;
  }
  
  public f(Context paramContext)
  {
    if (paramContext != null) {
      paramContext.getApplicationContext();
    }
    e = localb;
    g = localc;
    i = x3.d.o;
    boolean bool;
    if ((paramContext != null) && (e0.H(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    f = bool;
    if ((!bool) && (paramContext != null) && (e0.a >= 32)) {
      h = f.f(paramContext);
    }
    if ((g.s0) && (paramContext == null)) {
      v5.m.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
    }
  }
  
  public static void f(z4.j0 paramj0, c paramc, HashMap paramHashMap)
  {
    for (int m = 0; m < a; m++)
    {
      Object localObject = paramj0.a(m);
      localObject = (l)G.get(localObject);
      if (localObject != null)
      {
        l locall = (l)paramHashMap.get(Integer.valueOf(a.c));
        if ((locall == null) || ((b.isEmpty()) && (!b.isEmpty()))) {
          paramHashMap.put(Integer.valueOf(a.c), localObject);
        }
      }
    }
  }
  
  public static int g(v3.i0 parami0, String paramString, boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(c))) {
      return 4;
    }
    paramString = k(paramString);
    parami0 = k(c);
    int m = 0;
    if ((parami0 != null) && (paramString != null))
    {
      if ((!parami0.startsWith(paramString)) && (!paramString.startsWith(parami0)))
      {
        n = e0.a;
        if (parami0.split("-", 2)[0].equals(paramString.split("-", 2)[0])) {
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
      if (parami0 == null) {
        n = 1;
      }
    }
    return n;
  }
  
  public static boolean i(int paramInt, boolean paramBoolean)
  {
    paramInt &= 0x7;
    if ((paramInt != 4) && ((!paramBoolean) || (paramInt != 3))) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public static String k(String paramString)
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
  
  public static Pair l(int paramInt, j.a parama, int[][][] paramArrayOfInt, f.h.a parama1, Comparator paramComparator)
  {
    ArrayList localArrayList = new ArrayList();
    int m = a;
    int n = 0;
    for (;;)
    {
      Object localObject = parama;
      if (n >= m) {
        break;
      }
      int i1 = m;
      if (paramInt == b[n])
      {
        z4.j0 localj0 = c[n];
        for (int i2 = 0;; i2++)
        {
          i1 = m;
          if (i2 >= a) {
            break;
          }
          z4.i0 locali0 = localj0.a(i2);
          l0 locall0 = parama1.b(n, locali0, paramArrayOfInt[n][i2]);
          boolean[] arrayOfBoolean = new boolean[a];
          for (i1 = 0; i1 < a; i1++)
          {
            h localh1 = (h)locall0.get(i1);
            int i3 = localh1.f();
            if ((arrayOfBoolean[i1] == 0) && (i3 != 0))
            {
              if (i3 == 1)
              {
                localObject = t.t(localh1);
              }
              else
              {
                localObject = new ArrayList();
                ((ArrayList)localObject).add(localh1);
                for (i3 = i1 + 1; i3 < a; i3++)
                {
                  h localh2 = (h)locall0.get(i3);
                  if ((localh2.f() == 2) && (localh1.g(localh2)))
                  {
                    ((ArrayList)localObject).add(localh2);
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
      parama[paramInt] = getc;
    }
    paramArrayOfInt = (h)paramArrayOfInt.get(0);
    return Pair.create(new h.a(0, b, parama), Integer.valueOf(a));
  }
  
  public final void b()
  {
    synchronized (d)
    {
      if (e0.a >= 32)
      {
        f localf = h;
        if (localf != null) {
          localf.e();
        }
      }
      super.b();
      return;
    }
  }
  
  public final void d(x3.d paramd)
  {
    synchronized (d)
    {
      int m;
      if (!i.equals(paramd)) {
        m = 1;
      } else {
        m = 0;
      }
      i = paramd;
      if (m != 0) {
        j();
      }
      return;
    }
  }
  
  public final c h()
  {
    synchronized (d)
    {
      c localc = g;
      return localc;
    }
  }
  
  public final void j()
  {
    synchronized (d)
    {
      if ((g.s0) && (!f) && (e0.a >= 32))
      {
        f localf = h;
        if ((localf != null) && (b))
        {
          m = 1;
          break label55;
        }
      }
      int m = 0;
      label55:
      if (m != 0)
      {
        ??? = a;
        if (??? != null) {
          p.i(10);
        }
      }
      return;
    }
  }
  
  public static final class a
    extends f.h<a>
    implements Comparable<a>
  {
    public final int A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int e;
    public final boolean f;
    public final String o;
    public final f.c p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final int v;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;
    
    public a(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, boolean paramBoolean, e parame)
    {
      super(paramInt2, parami0);
      p = paramc;
      o = f.k(d.c);
      int i = 0;
      q = f.i(paramInt3, false);
      int j;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt2 = v.size();
        j = Integer.MAX_VALUE;
        if (paramInt1 >= paramInt2) {
          break;
        }
        int k = f.g(d, (String)v.get(paramInt1), false);
        if (k > 0)
        {
          paramInt2 = paramInt1;
          paramInt1 = k;
          break label108;
        }
      }
      paramInt1 = 0;
      paramInt2 = Integer.MAX_VALUE;
      label108:
      s = paramInt2;
      r = paramInt1;
      paramInt1 = d.e;
      paramInt2 = w;
      if ((paramInt1 != 0) && (paramInt1 == paramInt2)) {
        paramInt1 = Integer.MAX_VALUE;
      } else {
        paramInt1 = Integer.bitCount(paramInt1 & paramInt2);
      }
      t = paramInt1;
      parami0 = d;
      paramInt1 = e;
      boolean bool;
      if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
        bool = false;
      } else {
        bool = true;
      }
      u = bool;
      if ((d & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      x = bool;
      paramInt1 = G;
      y = paramInt1;
      z = H;
      paramInt2 = p;
      A = paramInt2;
      if (((paramInt2 == -1) || (paramInt2 <= y)) && ((paramInt1 == -1) || (paramInt1 <= x)) && (parame.apply(parami0))) {
        bool = true;
      } else {
        bool = false;
      }
      f = bool;
      parami0 = e0.z();
      for (paramInt1 = 0; paramInt1 < parami0.length; paramInt1++)
      {
        paramInt2 = f.g(d, parami0[paramInt1], false);
        if (paramInt2 > 0) {
          break label343;
        }
      }
      paramInt2 = 0;
      paramInt1 = Integer.MAX_VALUE;
      label343:
      v = paramInt1;
      w = paramInt2;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt2 = j;
        if (paramInt1 >= z.size()) {
          break;
        }
        parami0 = d.t;
        if ((parami0 != null) && (parami0.equals(z.get(paramInt1))))
        {
          paramInt2 = paramInt1;
          break;
        }
      }
      B = paramInt2;
      if ((paramInt3 & 0x180) == 128) {
        bool = true;
      } else {
        bool = false;
      }
      C = bool;
      if ((paramInt3 & 0x40) == 64) {
        bool = true;
      } else {
        bool = false;
      }
      D = bool;
      if (!f.i(paramInt3, p.t0))
      {
        paramInt1 = i;
      }
      else if ((!f) && (!p.n0))
      {
        paramInt1 = i;
      }
      else
      {
        if ((f.i(paramInt3, false)) && (f) && (d.p != -1))
        {
          parami0 = p;
          if ((!F) && (!E) && ((v0) || (!paramBoolean)))
          {
            paramInt1 = 2;
            break label577;
          }
        }
        paramInt1 = 1;
      }
      label577:
      e = paramInt1;
    }
    
    public final int f()
    {
      return e;
    }
    
    public final boolean g(f.h paramh)
    {
      paramh = (a)paramh;
      Object localObject = p;
      int i;
      if (!q0)
      {
        i = d.G;
        if ((i == -1) || (i != d.G)) {}
      }
      else if (!o0)
      {
        localObject = d.t;
        if ((localObject == null) || (!TextUtils.equals((CharSequence)localObject, d.t))) {}
      }
      else
      {
        localObject = p;
        if (!p0)
        {
          i = d.H;
          if ((i == -1) || (i != d.H)) {}
        }
        else
        {
          if ((r0) || ((C == C) && (D == D))) {
            break label148;
          }
        }
      }
      boolean bool = false;
      break label151;
      label148:
      bool = true;
      label151:
      return bool;
    }
    
    public final int h(a parama)
    {
      k0 localk0;
      if ((f) && (q)) {
        localk0 = f.j;
      } else {
        localk0 = f.j.a();
      }
      Object localObject1 = n.a.c(q, q);
      int i = s;
      int j = s;
      o7.j0.a.getClass();
      Object localObject2 = o0.a;
      localObject2 = ((n)localObject1).b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject2).a(r, r).a(t, t).c(x, x).c(u, u).b(Integer.valueOf(v), Integer.valueOf(v), (Comparator)localObject2).a(w, w).c(f, f).b(Integer.valueOf(B), Integer.valueOf(B), (Comparator)localObject2);
      i = A;
      j = A;
      if (p.E) {
        localObject1 = f.j.a();
      } else {
        localObject1 = f.k;
      }
      localObject1 = ((n)localObject2).b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject1).c(C, C).c(D, D).b(Integer.valueOf(y), Integer.valueOf(y), localk0).b(Integer.valueOf(z), Integer.valueOf(z), localk0);
      j = A;
      i = A;
      if (!e0.a(o, o)) {
        localk0 = f.k;
      }
      return ((n)localObject1).b(Integer.valueOf(j), Integer.valueOf(i), localk0).e();
    }
  }
  
  public static final class b
    implements Comparable<b>
  {
    public final boolean a;
    public final boolean b;
    
    public b(v3.i0 parami0, int paramInt)
    {
      int i = d;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      a = bool;
      b = f.i(paramInt, false);
    }
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (b)paramObject;
      return n.a.c(b, b).c(a, a).e();
    }
  }
  
  public static final class c
    extends m
  {
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
    public final SparseArray<Map<z4.j0, f.e>> w0;
    public final SparseBooleanArray x0;
    
    static
    {
      new c(new a());
      e0.E(1000);
      e0.E(1001);
      e0.E(1002);
      e0.E(1003);
      e0.E(1004);
      e0.E(1005);
      e0.E(1006);
      e0.E(1007);
      e0.E(1008);
      e0.E(1009);
      e0.E(1010);
      e0.E(1011);
      e0.E(1012);
      e0.E(1013);
      e0.E(1014);
      e0.E(1015);
      e0.E(1016);
    }
    
    public c(a parama)
    {
      super();
      j0 = A;
      k0 = B;
      l0 = C;
      m0 = D;
      n0 = E;
      o0 = F;
      p0 = G;
      q0 = H;
      r0 = I;
      s0 = J;
      t0 = K;
      u0 = L;
      v0 = M;
      w0 = N;
      x0 = O;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (c.class == paramObject.getClass()))
      {
        Object localObject1 = (c)paramObject;
        if ((super.equals(localObject1)) && (j0 == j0) && (k0 == k0) && (l0 == l0) && (m0 == m0) && (n0 == n0) && (o0 == o0) && (p0 == p0) && (q0 == q0) && (r0 == r0) && (s0 == s0) && (t0 == t0) && (u0 == u0) && (v0 == v0))
        {
          Object localObject2 = x0;
          paramObject = x0;
          int i = ((SparseBooleanArray)localObject2).size();
          int j;
          if (((SparseBooleanArray)paramObject).size() != i)
          {
            j = 0;
          }
          else
          {
            for (j = 0;; j++)
            {
              if (j >= i) {
                break label247;
              }
              if (((SparseBooleanArray)paramObject).indexOfKey(((SparseBooleanArray)localObject2).keyAt(j)) < 0) {
                break;
              }
            }
            label247:
            j = 1;
          }
          if (j != 0)
          {
            paramObject = w0;
            localObject1 = w0;
            int k = ((SparseArray)paramObject).size();
            if (((SparseArray)localObject1).size() != k)
            {
              j = 0;
            }
            else
            {
              for (j = 0;; j++)
              {
                if (j >= k) {
                  break label464;
                }
                i = ((SparseArray)localObject1).indexOfKey(((SparseArray)paramObject).keyAt(j));
                if (i < 0) {
                  break;
                }
                Object localObject3 = (Map)((SparseArray)paramObject).valueAt(j);
                localObject2 = (Map)((SparseArray)localObject1).valueAt(i);
                i = ((Map)localObject3).size();
                if (((Map)localObject2).size() == i)
                {
                  Iterator localIterator = ((Map)localObject3).entrySet().iterator();
                  z4.j0 localj0;
                  do
                  {
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = (Map.Entry)localIterator.next();
                    localj0 = (z4.j0)((Map.Entry)localObject3).getKey();
                  } while ((((Map)localObject2).containsKey(localj0)) && (e0.a(((Map.Entry)localObject3).getValue(), ((Map)localObject2).get(localj0))));
                }
                i = 0;
                break label450;
                i = 1;
                label450:
                if (i == 0) {
                  break;
                }
              }
              label464:
              j = 1;
            }
            if (j != 0) {
              break label477;
            }
          }
        }
        bool = false;
        label477:
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return (((((((((((((super.hashCode() + 31) * 31 + j0) * 31 + k0) * 31 + l0) * 31 + m0) * 31 + n0) * 31 + o0) * 31 + p0) * 31 + q0) * 31 + r0) * 31 + s0) * 31 + t0) * 31 + u0) * 31 + v0;
    }
    
    public static final class a
      extends m.a
    {
      public boolean A;
      public boolean B;
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
      public final SparseArray<Map<z4.j0, f.e>> N;
      public final SparseBooleanArray O;
      
      @Deprecated
      public a()
      {
        N = new SparseArray();
        O = new SparseBooleanArray();
        c();
      }
      
      public a(Context paramContext)
      {
        d(paramContext);
        e(paramContext);
        N = new SparseArray();
        O = new SparseBooleanArray();
        c();
      }
      
      public final m.a b(int paramInt1, int paramInt2)
      {
        super.b(paramInt1, paramInt2);
        return this;
      }
      
      public final void c()
      {
        A = true;
        B = false;
        C = true;
        D = false;
        E = true;
        F = false;
        G = false;
        H = false;
        I = false;
        J = true;
        K = true;
        L = false;
        M = true;
      }
      
      public final void d(Context paramContext)
      {
        int i = e0.a;
        if ((i >= 19) && ((i >= 23) || (Looper.myLooper() != null)))
        {
          paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
          if ((paramContext != null) && (paramContext.isEnabled()))
          {
            t = 1088;
            paramContext = paramContext.getLocale();
            if (paramContext != null)
            {
              if (i >= 21) {
                paramContext = paramContext.toLanguageTag();
              } else {
                paramContext = paramContext.toString();
              }
              s = t.t(paramContext);
            }
          }
        }
      }
      
      public final void e(Context paramContext)
      {
        int i = e0.a;
        Object localObject1 = null;
        if (i >= 17)
        {
          localObject2 = (DisplayManager)paramContext.getSystemService("display");
          if (localObject2 != null)
          {
            localObject2 = ((DisplayManager)localObject2).getDisplay(0);
            break label42;
          }
        }
        Object localObject2 = null;
        label42:
        Object localObject3 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = (WindowManager)paramContext.getSystemService("window");
          localObject2.getClass();
          localObject3 = ((WindowManager)localObject2).getDefaultDisplay();
        }
        if ((((Display)localObject3).getDisplayId() == 0) && (e0.H(paramContext)))
        {
          if (i < 28) {
            localObject2 = "sys.display-size";
          } else {
            localObject2 = "vendor.display-size";
          }
          try
          {
            Object localObject4 = Class.forName("android.os.SystemProperties");
            localObject4 = (String)((Class)localObject4).getMethod("get", new Class[] { String.class }).invoke(localObject4, new Object[] { localObject2 });
            localObject2 = localObject4;
          }
          catch (Exception localException)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Failed to read system property ");
            localStringBuilder.append((String)localObject2);
            v5.m.d("Util", localStringBuilder.toString(), localException);
            localObject2 = localObject1;
          }
          if (TextUtils.isEmpty((CharSequence)localObject2)) {}
        }
        try
        {
          localObject1 = ((String)localObject2).trim().split("x", -1);
          if (localObject1.length == 2)
          {
            int j = Integer.parseInt(localObject1[0]);
            i = Integer.parseInt(localObject1[1]);
            if ((j > 0) && (i > 0))
            {
              localObject1 = new android/graphics/Point;
              ((Point)localObject1).<init>(j, i);
              paramContext = (Context)localObject1;
            }
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;) {}
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Invalid display size: ");
        ((StringBuilder)localObject1).append((String)localObject2);
        v5.m.c("Util", ((StringBuilder)localObject1).toString());
        if (("Sony".equals(e0.c)) && (e0.d.startsWith("BRAVIA")) && (paramContext.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")))
        {
          paramContext = new Point(3840, 2160);
        }
        else
        {
          paramContext = new Point();
          i = e0.a;
          if (i >= 23)
          {
            localObject2 = ((Display)localObject3).getMode();
            x = ((Display.Mode)localObject2).getPhysicalWidth();
            y = ((Display.Mode)localObject2).getPhysicalHeight();
          }
          else if (i >= 17)
          {
            ((Display)localObject3).getRealSize(paramContext);
          }
          else
          {
            ((Display)localObject3).getSize(paramContext);
          }
        }
        b(x, y);
      }
    }
  }
  
  @Deprecated
  public static final class d
    extends m.a
  {}
  
  public static final class e
    implements v3.g
  {
    public static final String d = e0.E(0);
    public static final String e = e0.E(1);
    public static final String f = e0.E(2);
    public final int a;
    public final int[] b;
    public final int c;
    
    static
    {
      new v(12);
    }
    
    public e() {}
    
    public e(int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      a = paramInt1;
      paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      b = paramArrayOfInt;
      c = paramInt2;
      Arrays.sort(paramArrayOfInt);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (e.class == paramObject.getClass()))
      {
        paramObject = (e)paramObject;
        if ((a != a) || (!Arrays.equals(b, b)) || (c != c)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int i = a;
      return (Arrays.hashCode(b) + i * 31) * 31 + c;
    }
  }
  
  public static final class f
  {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public a d;
    
    public f(Spatializer paramSpatializer)
    {
      a = paramSpatializer;
      boolean bool;
      if (paramSpatializer.getImmersiveAudioLevel() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      b = bool;
    }
    
    public static f f(Context paramContext)
    {
      paramContext = (AudioManager)paramContext.getSystemService("audio");
      if (paramContext == null) {
        paramContext = null;
      } else {
        paramContext = new f(paramContext.getSpatializer());
      }
      return paramContext;
    }
    
    public final boolean a(v3.i0 parami0, x3.d paramd)
    {
      if (("audio/eac3-joc".equals(t)) && (G == 16)) {
        i = 12;
      } else {
        i = G;
      }
      AudioFormat.Builder localBuilder = new AudioFormat.Builder().setEncoding(2).setChannelMask(e0.o(i));
      int i = H;
      if (i != -1) {
        localBuilder.setSampleRate(i);
      }
      return a.canBeSpatialized(aa, localBuilder.build());
    }
    
    public final void b(f paramf, Looper paramLooper)
    {
      if ((d == null) && (c == null))
      {
        d = new a(paramf);
        paramf = new Handler(paramLooper);
        c = paramf;
        a.addOnSpatializerStateChangedListener(new g(paramf), d);
      }
    }
    
    public final boolean c()
    {
      return a.isAvailable();
    }
    
    public final boolean d()
    {
      return a.isEnabled();
    }
    
    public final void e()
    {
      Object localObject = d;
      if ((localObject != null) && (c != null))
      {
        a.removeOnSpatializerStateChangedListener((Spatializer.OnSpatializerStateChangedListener)localObject);
        localObject = c;
        int i = e0.a;
        ((Handler)localObject).removeCallbacksAndMessages(null);
        c = null;
        d = null;
      }
    }
    
    public final class a
      implements Spatializer.OnSpatializerStateChangedListener
    {
      public a() {}
      
      public final void onSpatializerAvailableChanged(Spatializer paramSpatializer, boolean paramBoolean)
      {
        f localf = f.f.this;
        paramSpatializer = f.j;
        localf.j();
      }
      
      public final void onSpatializerEnabledChanged(Spatializer paramSpatializer, boolean paramBoolean)
      {
        paramSpatializer = f.f.this;
        k0 localk0 = f.j;
        paramSpatializer.j();
      }
    }
  }
  
  public static final class g
    extends f.h<g>
    implements Comparable<g>
  {
    public final int e;
    public final boolean f;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    
    public g(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, String paramString)
    {
      super(paramInt2, parami0);
      int i = 0;
      f = f.i(paramInt3, false);
      paramInt1 = d.d & C;
      boolean bool;
      if ((paramInt1 & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      o = bool;
      if ((paramInt1 & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      p = bool;
      if (A.isEmpty()) {
        parami0 = t.t("");
      } else {
        parami0 = A;
      }
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt2 = parami0.size();
        j = Integer.MAX_VALUE;
        if (paramInt1 >= paramInt2) {
          break;
        }
        paramInt2 = f.g(d, (String)parami0.get(paramInt1), D);
        if (paramInt2 > 0) {
          break label159;
        }
      }
      paramInt2 = 0;
      paramInt1 = Integer.MAX_VALUE;
      label159:
      q = paramInt1;
      r = paramInt2;
      paramInt1 = d.e;
      int k = B;
      if ((paramInt1 != 0) && (paramInt1 == k)) {
        paramInt1 = j;
      } else {
        paramInt1 = Integer.bitCount(paramInt1 & k);
      }
      s = paramInt1;
      if ((d.e & 0x440) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      u = bool;
      if (f.k(paramString) == null) {
        bool = true;
      } else {
        bool = false;
      }
      int j = f.g(d, paramString, bool);
      t = j;
      if ((paramInt2 <= 0) && ((!A.isEmpty()) || (paramInt1 <= 0)) && (!o) && ((!p) || (j <= 0))) {
        paramInt2 = 0;
      } else {
        paramInt2 = 1;
      }
      paramInt1 = i;
      if (f.i(paramInt3, t0))
      {
        paramInt1 = i;
        if (paramInt2 != 0) {
          paramInt1 = 1;
        }
      }
      e = paramInt1;
    }
    
    public final int f()
    {
      return e;
    }
    
    public final int h(g paramg)
    {
      n localn = n.a.c(f, f);
      int i = q;
      int j = q;
      Object localObject1 = o7.j0.a;
      localObject1.getClass();
      Object localObject2 = o0.a;
      localn = localn.b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject2).a(r, r).a(s, s).c(o, o);
      boolean bool1 = p;
      boolean bool2 = p;
      if (r == 0) {
        localObject2 = localObject1;
      }
      localObject1 = localn.b(Boolean.valueOf(bool1), Boolean.valueOf(bool2), (Comparator)localObject2).a(t, t);
      localObject2 = localObject1;
      if (s == 0) {
        localObject2 = ((n)localObject1).d(u, u);
      }
      return ((n)localObject2).e();
    }
  }
  
  public static abstract class h<T extends h<T>>
  {
    public final int a;
    public final z4.i0 b;
    public final int c;
    public final v3.i0 d;
    
    public h(int paramInt1, int paramInt2, z4.i0 parami0)
    {
      a = paramInt1;
      b = parami0;
      c = paramInt2;
      d = d[paramInt2];
    }
    
    public abstract int f();
    
    public abstract boolean g(T paramT);
    
    public static abstract interface a<T extends f.h<T>>
    {
      public abstract l0 b(int paramInt, z4.i0 parami0, int[] paramArrayOfInt);
    }
  }
  
  public static final class i
    extends f.h<i>
  {
    public final boolean e;
    public final f.c f;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;
    
    public i(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      super(paramInt2, parami0);
      f = paramc;
      int i;
      if (l0) {
        i = 24;
      } else {
        i = 16;
      }
      boolean bool = k0;
      int j = 0;
      if ((bool) && ((paramInt4 & i) != 0)) {
        bool = true;
      } else {
        bool = false;
      }
      v = bool;
      float f1;
      if (paramBoolean)
      {
        parami0 = d;
        paramInt1 = y;
        if ((paramInt1 == -1) || (paramInt1 <= a))
        {
          paramInt1 = z;
          if ((paramInt1 == -1) || (paramInt1 <= b))
          {
            f1 = A;
            if ((f1 == -1.0F) || (f1 <= c))
            {
              paramInt1 = p;
              if ((paramInt1 == -1) || (paramInt1 <= d))
              {
                bool = true;
                break label172;
              }
            }
          }
        }
      }
      bool = false;
      label172:
      e = bool;
      if (paramBoolean)
      {
        parami0 = d;
        paramInt1 = y;
        if ((paramInt1 == -1) || (paramInt1 >= e))
        {
          paramInt1 = z;
          if ((paramInt1 == -1) || (paramInt1 >= f))
          {
            f1 = A;
            if ((f1 == -1.0F) || (f1 >= o))
            {
              paramInt1 = p;
              if ((paramInt1 == -1) || (paramInt1 >= p))
              {
                paramBoolean = true;
                break label280;
              }
            }
          }
        }
      }
      paramBoolean = false;
      label280:
      o = paramBoolean;
      p = f.i(paramInt3, false);
      parami0 = d;
      q = p;
      paramInt2 = y;
      if (paramInt2 != -1)
      {
        paramInt1 = z;
        if (paramInt1 != -1)
        {
          paramInt1 = paramInt2 * paramInt1;
          break label341;
        }
      }
      paramInt1 = -1;
      label341:
      r = paramInt1;
      paramInt1 = e;
      paramInt2 = u;
      paramInt4 = Integer.MAX_VALUE;
      if ((paramInt1 != 0) && (paramInt1 == paramInt2)) {
        paramInt1 = Integer.MAX_VALUE;
      } else {
        paramInt1 = Integer.bitCount(paramInt1 & paramInt2);
      }
      t = paramInt1;
      paramInt1 = d.e;
      if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      u = paramBoolean;
      for (paramInt1 = 0;; paramInt1++)
      {
        paramInt2 = paramInt4;
        if (paramInt1 >= t.size()) {
          break;
        }
        parami0 = d.t;
        if ((parami0 != null) && (parami0.equals(t.get(paramInt1))))
        {
          paramInt2 = paramInt1;
          break;
        }
      }
      s = paramInt2;
      if ((paramInt3 & 0x180) == 128) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      x = paramBoolean;
      if ((paramInt3 & 0x40) == 64) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      y = paramBoolean;
      paramc = d;
      parami0 = t;
      paramInt2 = 3;
      if (parami0 != null)
      {
        switch (parami0.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  paramInt1 = -1;
                  break;
                } while (!parami0.equals("video/x-vnd.on2.vp9"));
                paramInt1 = 4;
                break;
              } while (!parami0.equals("video/avc"));
              paramInt1 = 3;
              break;
            } while (!parami0.equals("video/hevc"));
            paramInt1 = 2;
            break;
          } while (!parami0.equals("video/av01"));
          paramInt1 = 1;
          break;
        } while (!parami0.equals("video/dolby-vision"));
        paramInt1 = 0;
      }
      switch (paramInt1)
      {
      default: 
        paramInt2 = 0;
        break;
      case 4: 
        paramInt2 = 2;
        break;
      case 3: 
        paramInt2 = 1;
        break;
      case 1: 
        paramInt2 = 4;
        break;
      case 0: 
        paramInt2 = 5;
      }
      z = paramInt2;
      if ((e & 0x4000) != 0)
      {
        paramInt1 = j;
      }
      else if (!f.i(paramInt3, f.t0))
      {
        paramInt1 = j;
      }
      else if ((!e) && (!f.j0))
      {
        paramInt1 = j;
      }
      else
      {
        if ((f.i(paramInt3, false)) && (o) && (e) && (d.p != -1))
        {
          parami0 = f;
          if ((!F) && (!E) && ((i & paramInt3) != 0))
          {
            paramInt1 = 2;
            break label897;
          }
        }
        paramInt1 = 1;
      }
      label897:
      w = paramInt1;
    }
    
    public static int h(i parami1, i parami2)
    {
      Object localObject = n.a.c(p, p).a(t, t).c(u, u).c(e, e).c(o, o);
      int i = s;
      int j = s;
      o7.j0.a.getClass();
      n localn = ((n)localObject).b(Integer.valueOf(i), Integer.valueOf(j), o0.a).c(x, x).c(y, y);
      localObject = localn;
      if (x)
      {
        localObject = localn;
        if (y) {
          localObject = localn.a(z, z);
        }
      }
      return ((n)localObject).e();
    }
    
    public static int i(i parami1, i parami2)
    {
      k0 localk01;
      if ((e) && (p)) {
        localk01 = f.j;
      } else {
        localk01 = f.j.a();
      }
      n.a locala = n.a;
      int i = q;
      int j = q;
      k0 localk02;
      if (f.E) {
        localk02 = f.j.a();
      } else {
        localk02 = f.k;
      }
      return locala.b(Integer.valueOf(i), Integer.valueOf(j), localk02).b(Integer.valueOf(r), Integer.valueOf(r), localk01).b(Integer.valueOf(q), Integer.valueOf(q), localk01).e();
    }
    
    public final int f()
    {
      return w;
    }
    
    public final boolean g(f.h paramh)
    {
      paramh = (i)paramh;
      boolean bool;
      if (((!v) && (!e0.a(d.t, d.t))) || ((!f.m0) && ((x != x) || (y != y)))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     r5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */