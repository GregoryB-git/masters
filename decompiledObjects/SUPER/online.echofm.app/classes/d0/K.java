package d0;

import X2.v;
import X2.w;
import X2.y;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import g0.M;
import java.util.HashMap;
import java.util.HashSet;

public class K
{
  public static final K C;
  public static final K D;
  public static final String E = M.w0(1);
  public static final String F = M.w0(2);
  public static final String G = M.w0(3);
  public static final String H = M.w0(4);
  public static final String I = M.w0(5);
  public static final String J = M.w0(6);
  public static final String K = M.w0(7);
  public static final String L = M.w0(8);
  public static final String M = M.w0(9);
  public static final String N = M.w0(10);
  public static final String O = M.w0(11);
  public static final String P = M.w0(12);
  public static final String Q = M.w0(13);
  public static final String R = M.w0(14);
  public static final String S = M.w0(15);
  public static final String T = M.w0(16);
  public static final String U = M.w0(17);
  public static final String V = M.w0(18);
  public static final String W = M.w0(19);
  public static final String X = M.w0(20);
  public static final String Y = M.w0(21);
  public static final String Z = M.w0(22);
  public static final String a0 = M.w0(23);
  public static final String b0 = M.w0(24);
  public static final String c0 = M.w0(25);
  public static final String d0 = M.w0(26);
  public static final String e0 = M.w0(27);
  public static final String f0 = M.w0(28);
  public static final String g0 = M.w0(29);
  public static final String h0 = M.w0(30);
  public static final String i0 = M.w0(31);
  public final w A;
  public final y B;
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final int j;
  public final boolean k;
  public final v l;
  public final int m;
  public final v n;
  public final int o;
  public final int p;
  public final int q;
  public final v r;
  public final b s;
  public final v t;
  public final int u;
  public final int v;
  public final boolean w;
  public final boolean x;
  public final boolean y;
  public final boolean z;
  
  static
  {
    K localK = new c().C();
    C = localK;
    D = localK;
  }
  
  public K(c paramc)
  {
    a = c.a(paramc);
    b = c.b(paramc);
    c = c.c(paramc);
    d = c.d(paramc);
    e = c.e(paramc);
    f = c.f(paramc);
    g = c.g(paramc);
    h = c.h(paramc);
    i = c.i(paramc);
    j = c.j(paramc);
    k = c.k(paramc);
    l = c.l(paramc);
    m = c.m(paramc);
    n = c.n(paramc);
    o = c.o(paramc);
    p = c.p(paramc);
    q = c.q(paramc);
    r = c.r(paramc);
    s = c.s(paramc);
    t = c.t(paramc);
    u = c.u(paramc);
    v = c.v(paramc);
    w = c.w(paramc);
    x = c.x(paramc);
    y = c.y(paramc);
    z = c.z(paramc);
    A = w.c(c.A(paramc));
    B = y.T(c.B(paramc));
  }
  
  public c a()
  {
    return new c(this);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (K)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e) || (f != f) || (g != g) || (h != h) || (k != k) || (i != i) || (j != j) || (!l.equals(l)) || (m != m) || (!n.equals(n)) || (o != o) || (p != p) || (q != q) || (!r.equals(r)) || (!s.equals(s)) || (!t.equals(t)) || (u != u) || (v != v) || (w != w) || (x != x) || (y != y) || (z != z) || (!A.equals(A)) || (!B.equals(B))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((((((((((((((((((((((((((a + 31) * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + k) * 31 + i) * 31 + j) * 31 + l.hashCode()) * 31 + m) * 31 + n.hashCode()) * 31 + o) * 31 + p) * 31 + q) * 31 + r.hashCode()) * 31 + s.hashCode()) * 31 + t.hashCode()) * 31 + u) * 31 + v) * 31 + w) * 31 + x) * 31 + y) * 31 + z) * 31 + A.hashCode()) * 31 + B.hashCode();
  }
  
  public static final class b
  {
    public static final b d = new a().d();
    public static final String e = M.w0(1);
    public static final String f = M.w0(2);
    public static final String g = M.w0(3);
    public final int a;
    public final boolean b;
    public final boolean c;
    
    public b(a parama)
    {
      a = a.a(parama);
      b = a.b(parama);
      c = a.c(parama);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        if ((a != a) || (b != b) || (c != c)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return ((a + 31) * 31 + b) * 31 + c;
    }
    
    public static final class a
    {
      public int a = 0;
      public boolean b = false;
      public boolean c = false;
      
      public K.b d()
      {
        return new K.b(this, null);
      }
      
      public a e(int paramInt)
      {
        a = paramInt;
        return this;
      }
      
      public a f(boolean paramBoolean)
      {
        b = paramBoolean;
        return this;
      }
      
      public a g(boolean paramBoolean)
      {
        c = paramBoolean;
        return this;
      }
    }
  }
  
  public static class c
  {
    public HashMap A;
    public HashSet B;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public v l;
    public int m;
    public v n;
    public int o;
    public int p;
    public int q;
    public v r;
    public K.b s;
    public v t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public c()
    {
      a = Integer.MAX_VALUE;
      b = Integer.MAX_VALUE;
      c = Integer.MAX_VALUE;
      d = Integer.MAX_VALUE;
      i = Integer.MAX_VALUE;
      j = Integer.MAX_VALUE;
      k = true;
      l = v.Y();
      m = 0;
      n = v.Y();
      o = 0;
      p = Integer.MAX_VALUE;
      q = Integer.MAX_VALUE;
      r = v.Y();
      s = K.b.d;
      t = v.Y();
      u = 0;
      v = 0;
      w = false;
      x = false;
      y = false;
      z = false;
      A = new HashMap();
      B = new HashSet();
    }
    
    public c(Context paramContext)
    {
      this();
      G(paramContext);
      I(paramContext, true);
    }
    
    public c(K paramK)
    {
      D(paramK);
    }
    
    public K C()
    {
      return new K(this);
    }
    
    public final void D(K paramK)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
      h = h;
      i = i;
      j = j;
      k = k;
      l = l;
      m = m;
      n = n;
      o = o;
      p = p;
      q = q;
      r = r;
      s = s;
      t = t;
      u = u;
      v = v;
      w = w;
      x = x;
      y = y;
      z = z;
      B = new HashSet(B);
      A = new HashMap(A);
    }
    
    public c E(K paramK)
    {
      D(paramK);
      return this;
    }
    
    public c F(K.b paramb)
    {
      s = paramb;
      return this;
    }
    
    public c G(Context paramContext)
    {
      if ((M.a < 23) && (Looper.myLooper() == null)) {
        return this;
      }
      paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
      if ((paramContext != null) && (paramContext.isEnabled()))
      {
        u = 1088;
        paramContext = paramContext.getLocale();
        if (paramContext != null) {
          t = v.Z(M.Z(paramContext));
        }
      }
      return this;
    }
    
    public c H(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      i = paramInt1;
      j = paramInt2;
      k = paramBoolean;
      return this;
    }
    
    public c I(Context paramContext, boolean paramBoolean)
    {
      paramContext = M.S(paramContext);
      return H(x, y, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     d0.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */