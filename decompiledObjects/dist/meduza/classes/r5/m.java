package r5;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o7.l0;
import o7.t;
import o7.t.a;
import o7.u;
import o7.x;
import v3.g;
import v5.b;
import z4.i0;

public class m
  implements g
{
  public static final m I = new m(new a());
  public static final String J = v5.e0.E(1);
  public static final String K = v5.e0.E(2);
  public static final String L = v5.e0.E(3);
  public static final String M = v5.e0.E(4);
  public static final String N = v5.e0.E(5);
  public static final String O = v5.e0.E(6);
  public static final String P = v5.e0.E(7);
  public static final String Q = v5.e0.E(8);
  public static final String R = v5.e0.E(9);
  public static final String S = v5.e0.E(10);
  public static final String T = v5.e0.E(11);
  public static final String U = v5.e0.E(12);
  public static final String V = v5.e0.E(13);
  public static final String W = v5.e0.E(14);
  public static final String X = v5.e0.E(15);
  public static final String Y = v5.e0.E(16);
  public static final String Z = v5.e0.E(17);
  public static final String a0 = v5.e0.E(18);
  public static final String b0 = v5.e0.E(19);
  public static final String c0 = v5.e0.E(20);
  public static final String d0 = v5.e0.E(21);
  public static final String e0 = v5.e0.E(22);
  public static final String f0 = v5.e0.E(23);
  public static final String g0 = v5.e0.E(24);
  public static final String h0 = v5.e0.E(25);
  public static final String i0 = v5.e0.E(26);
  public final t<String> A;
  public final int B;
  public final int C;
  public final boolean D;
  public final boolean E;
  public final boolean F;
  public final u<i0, l> G;
  public final x<Integer> H;
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int o;
  public final int p;
  public final int q;
  public final int r;
  public final boolean s;
  public final t<String> t;
  public final int u;
  public final t<String> v;
  public final int w;
  public final int x;
  public final int y;
  public final t<String> z;
  
  public m(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    o = g;
    p = h;
    q = i;
    r = j;
    s = k;
    t = l;
    u = m;
    v = n;
    w = o;
    x = p;
    y = q;
    z = r;
    A = s;
    B = t;
    C = u;
    D = v;
    E = w;
    F = x;
    G = u.b(y);
    H = x.q(z);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      m localm = (m)paramObject;
      if ((a == a) && (b == b) && (c == c) && (d == d) && (e == e) && (f == f) && (o == o) && (p == p) && (s == s) && (q == q) && (r == r) && (t.equals(t)) && (u == u) && (v.equals(v)) && (w == w) && (x == x) && (y == y) && (z.equals(z)) && (A.equals(A)) && (B == B) && (C == C) && (D == D) && (E == E) && (F == F))
      {
        u localu = G;
        paramObject = G;
        localu.getClass();
        if ((o7.e0.a(localu, paramObject)) && (H.equals(H))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a;
    int j = b;
    int k = c;
    int m = d;
    int n = e;
    int i1 = f;
    int i2 = o;
    int i3 = p;
    int i4 = s;
    int i5 = q;
    int i6 = r;
    int i7 = t.hashCode();
    int i8 = u;
    int i9 = v.hashCode();
    int i10 = w;
    int i11 = x;
    int i12 = y;
    int i13 = z.hashCode();
    int i14 = A.hashCode();
    int i15 = B;
    int i16 = C;
    int i17 = D;
    int i18 = E;
    int i19 = F;
    int i20 = G.hashCode();
    return H.hashCode() + (i20 + ((((((i14 + (i13 + ((((i9 + ((i7 + (((((((((((i + 31) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31) * 31 + i8) * 31) * 31 + i10) * 31 + i11) * 31 + i12) * 31) * 31) * 31 + i15) * 31 + i16) * 31 + i17) * 31 + i18) * 31 + i19) * 31) * 31;
  }
  
  public static class a
  {
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
    public t<String> l;
    public int m;
    public t<String> n;
    public int o;
    public int p;
    public int q;
    public t<String> r;
    public t<String> s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public HashMap<i0, l> y;
    public HashSet<Integer> z;
    
    @Deprecated
    public a()
    {
      a = Integer.MAX_VALUE;
      b = Integer.MAX_VALUE;
      c = Integer.MAX_VALUE;
      d = Integer.MAX_VALUE;
      i = Integer.MAX_VALUE;
      j = Integer.MAX_VALUE;
      k = true;
      Object localObject = t.b;
      localObject = l0.e;
      l = ((t)localObject);
      m = 0;
      n = ((t)localObject);
      o = 0;
      p = Integer.MAX_VALUE;
      q = Integer.MAX_VALUE;
      r = ((t)localObject);
      s = ((t)localObject);
      t = 0;
      u = 0;
      v = false;
      w = false;
      x = false;
      y = new HashMap();
      z = new HashSet();
    }
    
    public a(Bundle paramBundle)
    {
      Object localObject1 = m.O;
      Object localObject2 = m.I;
      a = paramBundle.getInt((String)localObject1, a);
      b = paramBundle.getInt(m.P, b);
      c = paramBundle.getInt(m.Q, c);
      d = paramBundle.getInt(m.R, d);
      e = paramBundle.getInt(m.S, e);
      f = paramBundle.getInt(m.T, f);
      g = paramBundle.getInt(m.U, o);
      h = paramBundle.getInt(m.V, p);
      i = paramBundle.getInt(m.W, q);
      j = paramBundle.getInt(m.X, r);
      k = paramBundle.getBoolean(m.Y, s);
      localObject1 = paramBundle.getStringArray(m.Z);
      int i1 = 0;
      if (localObject1 == null) {
        localObject1 = new String[0];
      }
      l = t.q((Object[])localObject1);
      m = paramBundle.getInt(m.h0, u);
      localObject1 = paramBundle.getStringArray(m.J);
      if (localObject1 == null) {
        localObject1 = new String[0];
      }
      n = a((String[])localObject1);
      o = paramBundle.getInt(m.K, w);
      p = paramBundle.getInt(m.a0, x);
      q = paramBundle.getInt(m.b0, y);
      localObject1 = paramBundle.getStringArray(m.c0);
      if (localObject1 == null) {
        localObject1 = new String[0];
      }
      r = t.q((Object[])localObject1);
      localObject1 = paramBundle.getStringArray(m.L);
      if (localObject1 == null) {
        localObject1 = new String[0];
      }
      s = a((String[])localObject1);
      t = paramBundle.getInt(m.M, B);
      u = paramBundle.getInt(m.i0, C);
      v = paramBundle.getBoolean(m.N, D);
      w = paramBundle.getBoolean(m.d0, E);
      x = paramBundle.getBoolean(m.e0, F);
      localObject1 = paramBundle.getParcelableArrayList(m.f0);
      if (localObject1 == null) {
        localObject1 = l0.e;
      } else {
        localObject1 = b.a(l.e, (ArrayList)localObject1);
      }
      y = new HashMap();
      for (int i2 = 0; i2 < d; i2++)
      {
        localObject2 = (l)((l0)localObject1).get(i2);
        y.put(a, localObject2);
      }
      paramBundle = paramBundle.getIntArray(m.g0);
      if (paramBundle == null) {
        paramBundle = new int[0];
      }
      z = new HashSet();
      int i3 = paramBundle.length;
      for (i2 = i1; i2 < i3; i2++)
      {
        i1 = paramBundle[i2];
        z.add(Integer.valueOf(i1));
      }
    }
    
    public static l0 a(String[] paramArrayOfString)
    {
      Object localObject = t.b;
      t.a locala = new t.a();
      int i1 = paramArrayOfString.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        localObject = paramArrayOfString[i2];
        localObject.getClass();
        locala.c(v5.e0.J((String)localObject));
      }
      return locala.e();
    }
    
    public a b(int paramInt1, int paramInt2)
    {
      i = paramInt1;
      j = paramInt2;
      k = true;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     r5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */