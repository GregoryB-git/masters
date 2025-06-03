package d0;

import X2.v;
import android.text.TextUtils;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public final class q
{
  public static final q M = new b().K();
  public static final String N = M.w0(0);
  public static final String O = M.w0(1);
  public static final String P = M.w0(2);
  public static final String Q = M.w0(3);
  public static final String R = M.w0(4);
  public static final String S = M.w0(5);
  public static final String T = M.w0(6);
  public static final String U = M.w0(7);
  public static final String V = M.w0(8);
  public static final String W = M.w0(9);
  public static final String X = M.w0(10);
  public static final String Y = M.w0(11);
  public static final String Z = M.w0(12);
  public static final String a0 = M.w0(13);
  public static final String b0 = M.w0(14);
  public static final String c0 = M.w0(15);
  public static final String d0 = M.w0(16);
  public static final String e0 = M.w0(17);
  public static final String f0 = M.w0(18);
  public static final String g0 = M.w0(19);
  public static final String h0 = M.w0(20);
  public static final String i0 = M.w0(21);
  public static final String j0 = M.w0(22);
  public static final String k0 = M.w0(23);
  public static final String l0 = M.w0(24);
  public static final String m0 = M.w0(25);
  public static final String n0 = M.w0(26);
  public static final String o0 = M.w0(27);
  public static final String p0 = M.w0(28);
  public static final String q0 = M.w0(29);
  public static final String r0 = M.w0(30);
  public static final String s0 = M.w0(31);
  public static final String t0 = M.w0(32);
  public final h A;
  public final int B;
  public final int C;
  public final int D;
  public final int E;
  public final int F;
  public final int G;
  public final int H;
  public final int I;
  public final int J;
  public final int K;
  public int L;
  public final String a;
  public final String b;
  public final List c;
  public final String d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final String j;
  public final x k;
  public final Object l;
  public final String m;
  public final String n;
  public final int o;
  public final int p;
  public final List q;
  public final m r;
  public final long s;
  public final int t;
  public final int u;
  public final float v;
  public final int w;
  public final float x;
  public final byte[] y;
  public final int z;
  
  public q(b paramb)
  {
    a = b.w(paramb);
    Object localObject = M.L0(b.E(paramb));
    d = ((String)localObject);
    if ((b.a(paramb).isEmpty()) && (b.l(paramb) != null)) {}
    for (localObject = v.Z(new t((String)localObject, b.l(paramb)));; localObject = b.a(paramb))
    {
      c = ((List)localObject);
      for (localObject = b.l(paramb);; localObject = c(b.a(paramb), (String)localObject))
      {
        b = ((String)localObject);
        break label132;
        if ((b.a(paramb).isEmpty()) || (b.l(paramb) != null)) {
          break;
        }
        c = b.a(paramb);
      }
      a.f(f(paramb));
    }
    label132:
    e = b.F(paramb);
    f = b.G(paramb);
    int i1 = b.H(paramb);
    g = i1;
    int i2 = b.I(paramb);
    h = i2;
    if (i2 != -1) {
      i1 = i2;
    }
    i = i1;
    j = b.J(paramb);
    k = b.b(paramb);
    l = b.c(paramb);
    m = b.d(paramb);
    n = b.e(paramb);
    o = b.f(paramb);
    p = b.g(paramb);
    if (b.h(paramb) == null) {
      localObject = Collections.emptyList();
    } else {
      localObject = b.h(paramb);
    }
    q = ((List)localObject);
    localObject = b.i(paramb);
    r = ((m)localObject);
    s = b.j(paramb);
    t = b.k(paramb);
    u = b.m(paramb);
    v = b.n(paramb);
    i1 = b.o(paramb);
    i2 = 0;
    if (i1 == -1) {
      i1 = 0;
    } else {
      i1 = b.o(paramb);
    }
    w = i1;
    float f1;
    if (b.p(paramb) == -1.0F) {
      f1 = 1.0F;
    } else {
      f1 = b.p(paramb);
    }
    x = f1;
    y = b.q(paramb);
    z = b.r(paramb);
    A = b.s(paramb);
    B = b.t(paramb);
    C = b.u(paramb);
    D = b.v(paramb);
    if (b.x(paramb) == -1) {
      i1 = 0;
    } else {
      i1 = b.x(paramb);
    }
    E = i1;
    if (b.y(paramb) == -1) {
      i1 = i2;
    } else {
      i1 = b.y(paramb);
    }
    F = i1;
    G = b.z(paramb);
    H = b.A(paramb);
    I = b.B(paramb);
    J = b.C(paramb);
    if ((b.D(paramb) == 0) && (localObject != null)) {}
    for (i1 = 1;; i1 = b.D(paramb))
    {
      K = i1;
      break;
    }
  }
  
  public static String c(List paramList, String paramString)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      t localt = (t)localIterator.next();
      if (TextUtils.equals(a, paramString)) {
        return b;
      }
    }
    return get0b;
  }
  
  public static boolean f(b paramb)
  {
    if ((b.a(paramb).isEmpty()) && (b.l(paramb) == null)) {
      return true;
    }
    for (int i1 = 0; i1 < b.a(paramb).size(); i1++) {
      if (agetb.equals(b.l(paramb))) {
        return true;
      }
    }
    return false;
  }
  
  public static String g(q paramq)
  {
    if (paramq == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("id=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mimeType=");
    localStringBuilder.append(n);
    if (m != null)
    {
      localStringBuilder.append(", container=");
      localStringBuilder.append(m);
    }
    if (i != -1)
    {
      localStringBuilder.append(", bitrate=");
      localStringBuilder.append(i);
    }
    if (j != null)
    {
      localStringBuilder.append(", codecs=");
      localStringBuilder.append(j);
    }
    if (r != null)
    {
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      for (int i1 = 0;; i1++)
      {
        localObject = r;
        if (i1 >= r) {
          break;
        }
        UUID localUUID = ep;
        if (localUUID.equals(g.b)) {
          localObject = "cenc";
        }
        for (;;)
        {
          localLinkedHashSet.add(localObject);
          break;
          if (localUUID.equals(g.c))
          {
            localObject = "clearkey";
          }
          else if (localUUID.equals(g.e))
          {
            localObject = "playready";
          }
          else if (localUUID.equals(g.d))
          {
            localObject = "widevine";
          }
          else if (localUUID.equals(g.a))
          {
            localObject = "universal";
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("unknown (");
            ((StringBuilder)localObject).append(localUUID);
            ((StringBuilder)localObject).append(")");
            localObject = ((StringBuilder)localObject).toString();
          }
        }
      }
      localStringBuilder.append(", drm=[");
      W2.h.f(',').b(localStringBuilder, localLinkedHashSet);
      localStringBuilder.append(']');
    }
    if ((t != -1) && (u != -1))
    {
      localStringBuilder.append(", res=");
      localStringBuilder.append(t);
      localStringBuilder.append("x");
      localStringBuilder.append(u);
    }
    Object localObject = A;
    if ((localObject != null) && (((h)localObject).i()))
    {
      localStringBuilder.append(", color=");
      localStringBuilder.append(A.m());
    }
    if (v != -1.0F)
    {
      localStringBuilder.append(", fps=");
      localStringBuilder.append(v);
    }
    if (B != -1)
    {
      localStringBuilder.append(", channels=");
      localStringBuilder.append(B);
    }
    if (C != -1)
    {
      localStringBuilder.append(", sample_rate=");
      localStringBuilder.append(C);
    }
    if (d != null)
    {
      localStringBuilder.append(", language=");
      localStringBuilder.append(d);
    }
    if (!c.isEmpty())
    {
      localStringBuilder.append(", labels=[");
      W2.h.f(',').b(localStringBuilder, c);
      localStringBuilder.append("]");
    }
    if (e != 0)
    {
      localStringBuilder.append(", selectionFlags=[");
      W2.h.f(',').b(localStringBuilder, M.j0(e));
      localStringBuilder.append("]");
    }
    if (f != 0)
    {
      localStringBuilder.append(", roleFlags=[");
      W2.h.f(',').b(localStringBuilder, M.i0(f));
      localStringBuilder.append("]");
    }
    if (l != null)
    {
      localStringBuilder.append(", customData=");
      localStringBuilder.append(l);
    }
    return localStringBuilder.toString();
  }
  
  public b a()
  {
    return new b(this, null);
  }
  
  public q b(int paramInt)
  {
    return a().R(paramInt).K();
  }
  
  public int d()
  {
    int i1 = t;
    int i2 = -1;
    int i3 = i2;
    if (i1 != -1)
    {
      i3 = u;
      if (i3 == -1) {
        i3 = i2;
      } else {
        i3 = i1 * i3;
      }
    }
    return i3;
  }
  
  public boolean e(q paramq)
  {
    if (q.size() != q.size()) {
      return false;
    }
    for (int i1 = 0; i1 < q.size(); i1++) {
      if (!Arrays.equals((byte[])q.get(i1), (byte[])q.get(i1))) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (q.class == paramObject.getClass()))
    {
      paramObject = (q)paramObject;
      int i1 = L;
      if (i1 != 0)
      {
        int i2 = L;
        if ((i2 != 0) && (i1 != i2)) {
          return false;
        }
      }
      if ((e != e) || (f != f) || (g != g) || (h != h) || (o != o) || (s != s) || (t != t) || (u != u) || (w != w) || (z != z) || (B != B) || (C != C) || (D != D) || (E != E) || (F != F) || (G != G) || (I != I) || (J != J) || (K != K) || (Float.compare(v, v) != 0) || (Float.compare(x, x) != 0) || (!Objects.equals(a, a)) || (!Objects.equals(b, b)) || (!c.equals(c)) || (!Objects.equals(j, j)) || (!Objects.equals(m, m)) || (!Objects.equals(n, n)) || (!Objects.equals(d, d)) || (!Arrays.equals(y, y)) || (!Objects.equals(k, k)) || (!Objects.equals(A, A)) || (!Objects.equals(r, r)) || (!e((q)paramObject)) || (!Objects.equals(l, l))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public q h(q paramq)
  {
    if (this == paramq) {
      return this;
    }
    int i1 = z.k(n);
    String str1 = a;
    int i2 = I;
    int i3 = J;
    String str2 = b;
    if (str2 == null) {
      str2 = b;
    }
    List localList;
    if (!c.isEmpty()) {
      localList = c;
    } else {
      localList = c;
    }
    Object localObject1 = d;
    Object localObject2;
    if (i1 != 3)
    {
      localObject2 = localObject1;
      if (i1 != 1) {}
    }
    else
    {
      localObject3 = d;
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = localObject3;
      }
    }
    int i4 = g;
    int i5 = i4;
    if (i4 == -1) {
      i5 = g;
    }
    int i6 = h;
    i4 = i6;
    if (i6 == -1) {
      i4 = h;
    }
    localObject1 = j;
    Object localObject3 = localObject1;
    if (localObject1 == null)
    {
      String str3 = M.Q(j, i1);
      localObject3 = localObject1;
      if (M.d1(str3).length == 1) {
        localObject3 = str3;
      }
    }
    localObject1 = k;
    if (localObject1 == null) {
      localObject1 = k;
    } else {
      localObject1 = ((x)localObject1).b(k);
    }
    float f1 = v;
    float f2 = f1;
    if (f1 == -1.0F)
    {
      f2 = f1;
      if (i1 == 2) {
        f2 = v;
      }
    }
    i1 = e;
    int i7 = e;
    int i8 = f;
    i6 = f;
    paramq = m.d(r, r);
    return a().a0(str1).c0(str2).d0(localList).e0((String)localObject2).q0(i1 | i7).m0(i8 | i6).M(i5).j0(i4).O((String)localObject3).h0((x)localObject1).U(paramq).X(f2).t0(i2).u0(i3).K();
  }
  
  public int hashCode()
  {
    if (L == 0)
    {
      Object localObject = a;
      int i1 = 0;
      int i2;
      if (localObject == null) {
        i2 = 0;
      } else {
        i2 = ((String)localObject).hashCode();
      }
      localObject = b;
      int i3;
      if (localObject == null) {
        i3 = 0;
      } else {
        i3 = ((String)localObject).hashCode();
      }
      int i4 = c.hashCode();
      localObject = d;
      int i5;
      if (localObject == null) {
        i5 = 0;
      } else {
        i5 = ((String)localObject).hashCode();
      }
      int i6 = e;
      int i7 = f;
      int i8 = g;
      int i9 = h;
      localObject = j;
      int i10;
      if (localObject == null) {
        i10 = 0;
      } else {
        i10 = ((String)localObject).hashCode();
      }
      localObject = k;
      int i11;
      if (localObject == null) {
        i11 = 0;
      } else {
        i11 = ((x)localObject).hashCode();
      }
      localObject = l;
      int i12;
      if (localObject == null) {
        i12 = 0;
      } else {
        i12 = localObject.hashCode();
      }
      localObject = m;
      int i13;
      if (localObject == null) {
        i13 = 0;
      } else {
        i13 = ((String)localObject).hashCode();
      }
      localObject = n;
      if (localObject != null) {
        i1 = ((String)localObject).hashCode();
      }
      L = ((((((((((((((((((((((((((((((527 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i1) * 31 + o) * 31 + (int)s) * 31 + t) * 31 + u) * 31 + Float.floatToIntBits(v)) * 31 + w) * 31 + Float.floatToIntBits(x)) * 31 + z) * 31 + B) * 31 + C) * 31 + D) * 31 + E) * 31 + F) * 31 + G) * 31 + I) * 31 + J) * 31 + K);
    }
    return L;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Format(");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(m);
    localStringBuilder.append(", ");
    localStringBuilder.append(n);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    localStringBuilder.append(d);
    localStringBuilder.append(", [");
    localStringBuilder.append(t);
    localStringBuilder.append(", ");
    localStringBuilder.append(u);
    localStringBuilder.append(", ");
    localStringBuilder.append(v);
    localStringBuilder.append(", ");
    localStringBuilder.append(A);
    localStringBuilder.append("], [");
    localStringBuilder.append(B);
    localStringBuilder.append(", ");
    localStringBuilder.append(C);
    localStringBuilder.append("])");
    return localStringBuilder.toString();
  }
  
  public static final class b
  {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public String a;
    public String b;
    public List c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public x j;
    public Object k;
    public String l;
    public String m;
    public int n;
    public int o;
    public List p;
    public m q;
    public long r;
    public int s;
    public int t;
    public float u;
    public int v;
    public float w;
    public byte[] x;
    public int y;
    public h z;
    
    public b()
    {
      c = v.Y();
      g = -1;
      h = -1;
      n = -1;
      o = -1;
      r = Long.MAX_VALUE;
      s = -1;
      t = -1;
      u = -1.0F;
      w = 1.0F;
      y = -1;
      A = -1;
      B = -1;
      C = -1;
      F = -1;
      G = 1;
      H = -1;
      I = -1;
      J = 0;
    }
    
    public b(q paramq)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
      h = h;
      i = j;
      j = k;
      k = l;
      l = m;
      m = n;
      n = o;
      o = p;
      p = q;
      q = r;
      r = s;
      s = t;
      t = u;
      u = v;
      v = w;
      w = x;
      x = y;
      y = z;
      z = A;
      A = B;
      B = C;
      C = D;
      D = E;
      E = F;
      F = G;
      G = H;
      H = I;
      I = J;
      J = K;
    }
    
    public q K()
    {
      return new q(this, null);
    }
    
    public b L(int paramInt)
    {
      F = paramInt;
      return this;
    }
    
    public b M(int paramInt)
    {
      g = paramInt;
      return this;
    }
    
    public b N(int paramInt)
    {
      A = paramInt;
      return this;
    }
    
    public b O(String paramString)
    {
      i = paramString;
      return this;
    }
    
    public b P(h paramh)
    {
      z = paramh;
      return this;
    }
    
    public b Q(String paramString)
    {
      l = z.t(paramString);
      return this;
    }
    
    public b R(int paramInt)
    {
      J = paramInt;
      return this;
    }
    
    public b S(int paramInt)
    {
      G = paramInt;
      return this;
    }
    
    public b T(Object paramObject)
    {
      k = paramObject;
      return this;
    }
    
    public b U(m paramm)
    {
      q = paramm;
      return this;
    }
    
    public b V(int paramInt)
    {
      D = paramInt;
      return this;
    }
    
    public b W(int paramInt)
    {
      E = paramInt;
      return this;
    }
    
    public b X(float paramFloat)
    {
      u = paramFloat;
      return this;
    }
    
    public b Y(int paramInt)
    {
      t = paramInt;
      return this;
    }
    
    public b Z(int paramInt)
    {
      a = Integer.toString(paramInt);
      return this;
    }
    
    public b a0(String paramString)
    {
      a = paramString;
      return this;
    }
    
    public b b0(List paramList)
    {
      p = paramList;
      return this;
    }
    
    public b c0(String paramString)
    {
      b = paramString;
      return this;
    }
    
    public b d0(List paramList)
    {
      c = v.U(paramList);
      return this;
    }
    
    public b e0(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public b f0(int paramInt)
    {
      n = paramInt;
      return this;
    }
    
    public b g0(int paramInt)
    {
      o = paramInt;
      return this;
    }
    
    public b h0(x paramx)
    {
      j = paramx;
      return this;
    }
    
    public b i0(int paramInt)
    {
      C = paramInt;
      return this;
    }
    
    public b j0(int paramInt)
    {
      h = paramInt;
      return this;
    }
    
    public b k0(float paramFloat)
    {
      w = paramFloat;
      return this;
    }
    
    public b l0(byte[] paramArrayOfByte)
    {
      x = paramArrayOfByte;
      return this;
    }
    
    public b m0(int paramInt)
    {
      f = paramInt;
      return this;
    }
    
    public b n0(int paramInt)
    {
      v = paramInt;
      return this;
    }
    
    public b o0(String paramString)
    {
      m = z.t(paramString);
      return this;
    }
    
    public b p0(int paramInt)
    {
      B = paramInt;
      return this;
    }
    
    public b q0(int paramInt)
    {
      e = paramInt;
      return this;
    }
    
    public b r0(int paramInt)
    {
      y = paramInt;
      return this;
    }
    
    public b s0(long paramLong)
    {
      r = paramLong;
      return this;
    }
    
    public b t0(int paramInt)
    {
      H = paramInt;
      return this;
    }
    
    public b u0(int paramInt)
    {
      I = paramInt;
      return this;
    }
    
    public b v0(int paramInt)
    {
      s = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */