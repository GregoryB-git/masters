package v3;

import a0.j;
import a4.d;
import a4.d.b;
import e0.e;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p4.a;
import p4.a.b;
import v5.e0;
import v5.p;
import w5.b;

public final class i0
  implements g
{
  public static final i0 Q = new i0(new a());
  public static final String R = e0.E(0);
  public static final String S = e0.E(1);
  public static final String T = e0.E(2);
  public static final String U = e0.E(3);
  public static final String V = e0.E(4);
  public static final String W = e0.E(5);
  public static final String X = e0.E(6);
  public static final String Y = e0.E(7);
  public static final String Z = e0.E(8);
  public static final String a0 = e0.E(9);
  public static final String b0 = e0.E(10);
  public static final String c0 = e0.E(11);
  public static final String d0 = e0.E(12);
  public static final String e0 = e0.E(13);
  public static final String f0 = e0.E(14);
  public static final String g0 = e0.E(15);
  public static final String h0 = e0.E(16);
  public static final String i0 = e0.E(17);
  public static final String j0 = e0.E(18);
  public static final String k0 = e0.E(19);
  public static final String l0 = e0.E(20);
  public static final String m0 = e0.E(21);
  public static final String n0 = e0.E(22);
  public static final String o0 = e0.E(23);
  public static final String p0 = e0.E(24);
  public static final String q0 = e0.E(25);
  public static final String r0 = e0.E(26);
  public static final String s0 = e0.E(27);
  public static final String t0 = e0.E(28);
  public static final String u0 = e0.E(29);
  public static final String v0 = e0.E(30);
  public static final String w0 = e0.E(31);
  public static final e x0 = new e(2);
  public final float A;
  public final int B;
  public final float C;
  public final byte[] D;
  public final int E;
  public final b F;
  public final int G;
  public final int H;
  public final int I;
  public final int J;
  public final int K;
  public final int L;
  public final int M;
  public final int N;
  public final int O;
  public int P;
  public final String a;
  public final String b;
  public final String c;
  public final int d;
  public final int e;
  public final int f;
  public final int o;
  public final int p;
  public final String q;
  public final a r;
  public final String s;
  public final String t;
  public final int u;
  public final List<byte[]> v;
  public final d w;
  public final long x;
  public final int y;
  public final int z;
  
  public i0(a parama)
  {
    a = a;
    b = b;
    c = e0.J(c);
    d = d;
    e = e;
    int i = f;
    f = i;
    int j = g;
    o = j;
    if (j != -1) {
      i = j;
    }
    p = i;
    q = h;
    r = i;
    s = j;
    t = k;
    u = l;
    List localList = m;
    Object localObject = localList;
    if (localList == null) {
      localObject = Collections.emptyList();
    }
    v = ((List)localObject);
    localObject = n;
    w = ((d)localObject);
    x = o;
    y = p;
    z = q;
    A = r;
    int k = s;
    j = 0;
    i = k;
    if (k == -1) {
      i = 0;
    }
    B = i;
    float f1 = t;
    float f2 = f1;
    if (f1 == -1.0F) {
      f2 = 1.0F;
    }
    C = f2;
    D = u;
    E = v;
    F = w;
    G = x;
    H = y;
    I = z;
    k = A;
    i = k;
    if (k == -1) {
      i = 0;
    }
    J = i;
    i = B;
    if (i == -1) {
      i = j;
    }
    K = i;
    L = C;
    M = D;
    N = E;
    j = F;
    i = j;
    if (j == 0)
    {
      i = j;
      if (localObject != null) {
        i = 1;
      }
    }
    O = i;
  }
  
  public final a a()
  {
    return new a(this);
  }
  
  public final i0 b(int paramInt)
  {
    a locala = a();
    F = paramInt;
    return locala.a();
  }
  
  public final boolean c(i0 parami0)
  {
    if (v.size() != v.size()) {
      return false;
    }
    for (int i = 0; i < v.size(); i++) {
      if (!Arrays.equals((byte[])v.get(i), (byte[])v.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  public final i0 d(i0 parami0)
  {
    if (this == parami0) {
      return this;
    }
    int i = p.i(t);
    String str1 = a;
    String str2 = b;
    if (str2 == null) {
      str2 = b;
    }
    Object localObject1 = c;
    Object localObject2;
    if (i != 3)
    {
      localObject2 = localObject1;
      if (i != 1) {}
    }
    else
    {
      localObject3 = c;
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = localObject3;
      }
    }
    int j = f;
    int k = j;
    if (j == -1) {
      k = f;
    }
    j = o;
    int m = j;
    if (j == -1) {
      m = o;
    }
    Object localObject3 = q;
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject4 = e0.q(i, q);
      localObject1 = localObject3;
      if (e0.Q((String)localObject4).length == 1) {
        localObject1 = localObject4;
      }
    }
    localObject3 = r;
    if (localObject3 == null) {
      localObject3 = r;
    }
    do
    {
      localObject4 = localObject3;
      break label283;
      localObject4 = r;
      if (localObject4 == null) {
        break;
      }
      localObject4 = a;
    } while (localObject4.length == 0);
    long l = b;
    Object localObject5 = a;
    j = e0.a;
    localObject3 = Arrays.copyOf((Object[])localObject5, localObject5.length + localObject4.length);
    System.arraycopy(localObject4, 0, localObject3, localObject5.length, localObject4.length);
    Object localObject4 = new a(l, (a.b[])localObject3);
    label283:
    float f1 = A;
    float f2 = f1;
    if (f1 == -1.0F)
    {
      f2 = f1;
      if (i == 2) {
        f2 = A;
      }
    }
    int n = d;
    int i1 = d;
    int i2 = e;
    int i3 = e;
    parami0 = w;
    Object localObject6 = w;
    ArrayList localArrayList = new ArrayList();
    int i4;
    if (parami0 != null)
    {
      localObject5 = c;
      localObject3 = a;
      j = localObject3.length;
      for (i = 0;; i++)
      {
        parami0 = (i0)localObject5;
        if (i >= j) {
          break;
        }
        parami0 = localObject3[i];
        if (e != null) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        if (i4 != 0) {
          localArrayList.add(parami0);
        }
      }
    }
    parami0 = null;
    localObject3 = parami0;
    if (localObject6 != null)
    {
      localObject3 = parami0;
      if (parami0 == null) {
        localObject3 = c;
      }
      j = localArrayList.size();
      localObject5 = a;
      i = localObject5.length;
      i4 = 0;
      parami0 = (i0)localObject3;
      localObject3 = localObject5;
      while (i4 < i)
      {
        localObject5 = localObject3[i4];
        int i5;
        if (e != null) {
          i5 = 1;
        } else {
          i5 = 0;
        }
        if (i5 != 0)
        {
          localObject6 = b;
          for (i5 = 0; i5 < j; i5++) {
            if (getb.equals(localObject6))
            {
              i5 = 1;
              break label572;
            }
          }
          i5 = 0;
          label572:
          int i6 = j;
          j = i6;
          if (i5 == 0)
          {
            localArrayList.add(localObject5);
            j = i6;
          }
        }
        i4++;
      }
      localObject3 = parami0;
    }
    if (localArrayList.isEmpty()) {
      parami0 = null;
    } else {
      parami0 = new d((String)localObject3, localArrayList);
    }
    localObject3 = new a(this);
    a = str1;
    b = str2;
    c = ((String)localObject2);
    d = (n | i1);
    e = (i2 | i3);
    f = k;
    g = m;
    h = ((String)localObject1);
    i = ((a)localObject4);
    n = parami0;
    r = f2;
    return new i0((a)localObject3);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i0.class == paramObject.getClass()))
    {
      paramObject = (i0)paramObject;
      int i = P;
      if (i != 0)
      {
        int j = P;
        if ((j != 0) && (i != j)) {
          return false;
        }
      }
      if ((d != d) || (e != e) || (f != f) || (o != o) || (u != u) || (x != x) || (y != y) || (z != z) || (B != B) || (E != E) || (G != G) || (H != H) || (I != I) || (J != J) || (K != K) || (L != L) || (M != M) || (N != N) || (O != O) || (Float.compare(A, A) != 0) || (Float.compare(C, C) != 0) || (!e0.a(a, a)) || (!e0.a(b, b)) || (!e0.a(q, q)) || (!e0.a(s, s)) || (!e0.a(t, t)) || (!e0.a(c, c)) || (!Arrays.equals(D, D)) || (!e0.a(r, r)) || (!e0.a(F, F)) || (!e0.a(w, w)) || (!c((i0)paramObject))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (P == 0)
    {
      Object localObject = a;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = ((String)localObject).hashCode();
      }
      localObject = b;
      int k;
      if (localObject != null) {
        k = ((String)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = c;
      int m;
      if (localObject == null) {
        m = 0;
      } else {
        m = ((String)localObject).hashCode();
      }
      int n = d;
      int i1 = e;
      int i2 = f;
      int i3 = o;
      localObject = q;
      int i4;
      if (localObject == null) {
        i4 = 0;
      } else {
        i4 = ((String)localObject).hashCode();
      }
      localObject = r;
      int i5;
      if (localObject == null) {
        i5 = 0;
      } else {
        i5 = ((a)localObject).hashCode();
      }
      localObject = s;
      int i6;
      if (localObject == null) {
        i6 = 0;
      } else {
        i6 = ((String)localObject).hashCode();
      }
      localObject = t;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      int i7 = u;
      int i8 = (int)x;
      int i9 = y;
      int i10 = z;
      int i11 = Float.floatToIntBits(A);
      int i12 = B;
      P = (((((((((((Float.floatToIntBits(C) + ((i11 + (((((((((((((((527 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31) * 31 + i12) * 31) * 31 + E) * 31 + G) * 31 + H) * 31 + I) * 31 + J) * 31 + K) * 31 + L) * 31 + M) * 31 + N) * 31 + O);
    }
    return P;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Format(");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(s);
    localStringBuilder.append(", ");
    localStringBuilder.append(t);
    localStringBuilder.append(", ");
    localStringBuilder.append(q);
    localStringBuilder.append(", ");
    localStringBuilder.append(p);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append(", [");
    localStringBuilder.append(y);
    localStringBuilder.append(", ");
    localStringBuilder.append(z);
    localStringBuilder.append(", ");
    localStringBuilder.append(A);
    localStringBuilder.append("], [");
    localStringBuilder.append(G);
    localStringBuilder.append(", ");
    return j.m(localStringBuilder, H, "])");
  }
  
  public static final class a
  {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public a i;
    public String j;
    public String k;
    public int l;
    public List<byte[]> m;
    public d n;
    public long o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public byte[] u;
    public int v;
    public b w;
    public int x;
    public int y;
    public int z;
    
    public a()
    {
      f = -1;
      g = -1;
      l = -1;
      o = Long.MAX_VALUE;
      p = -1;
      q = -1;
      r = -1.0F;
      t = 1.0F;
      v = -1;
      x = -1;
      y = -1;
      z = -1;
      C = -1;
      D = -1;
      E = -1;
      F = 0;
    }
    
    public a(i0 parami0)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = o;
      h = q;
      i = r;
      j = s;
      k = t;
      l = u;
      m = v;
      n = w;
      o = x;
      p = y;
      q = z;
      r = A;
      s = B;
      t = C;
      u = D;
      v = E;
      w = F;
      x = G;
      y = H;
      z = I;
      A = J;
      B = K;
      C = L;
      D = M;
      E = N;
      F = O;
    }
    
    public final i0 a()
    {
      return new i0(this);
    }
    
    public final void b(int paramInt)
    {
      a = Integer.toString(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     v3.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */