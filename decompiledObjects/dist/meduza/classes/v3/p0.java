package v3;

import android.net.Uri;
import android.os.Bundle;
import e0.e;
import java.util.Arrays;
import v5.e0;

public final class p0
  implements g
{
  public static final p0 Q = new p0(new a());
  public static final String R = e0.E(0);
  public static final String S = e0.E(1);
  public static final String T = e0.E(2);
  public static final String U = e0.E(3);
  public static final String V = e0.E(4);
  public static final String W = e0.E(5);
  public static final String X = e0.E(6);
  public static final String Y = e0.E(8);
  public static final String Z = e0.E(9);
  public static final String a0 = e0.E(10);
  public static final String b0 = e0.E(11);
  public static final String c0 = e0.E(12);
  public static final String d0 = e0.E(13);
  public static final String e0 = e0.E(14);
  public static final String f0 = e0.E(15);
  public static final String g0 = e0.E(16);
  public static final String h0 = e0.E(17);
  public static final String i0 = e0.E(18);
  public static final String j0 = e0.E(19);
  public static final String k0 = e0.E(20);
  public static final String l0 = e0.E(21);
  public static final String m0 = e0.E(22);
  public static final String n0 = e0.E(23);
  public static final String o0 = e0.E(24);
  public static final String p0 = e0.E(25);
  public static final String q0 = e0.E(26);
  public static final String r0 = e0.E(27);
  public static final String s0 = e0.E(28);
  public static final String t0 = e0.E(29);
  public static final String u0 = e0.E(30);
  public static final String v0 = e0.E(31);
  public static final String w0 = e0.E(32);
  public static final String x0 = e0.E(1000);
  public static final e y0 = new e(4);
  public final Integer A;
  public final Integer B;
  public final Integer C;
  public final Integer D;
  public final Integer E;
  public final Integer F;
  public final CharSequence G;
  public final CharSequence H;
  public final CharSequence I;
  public final Integer J;
  public final Integer K;
  public final CharSequence L;
  public final CharSequence M;
  public final CharSequence N;
  public final Integer O;
  public final Bundle P;
  public final CharSequence a;
  public final CharSequence b;
  public final CharSequence c;
  public final CharSequence d;
  public final CharSequence e;
  public final CharSequence f;
  public final CharSequence o;
  public final i1 p;
  public final i1 q;
  public final byte[] r;
  public final Integer s;
  public final Uri t;
  public final Integer u;
  public final Integer v;
  public final Integer w;
  public final Boolean x;
  public final Boolean y;
  @Deprecated
  public final Integer z;
  
  public p0(a parama)
  {
    Boolean localBoolean1 = p;
    Integer localInteger1 = o;
    Integer localInteger2 = F;
    boolean bool = true;
    int i = 1;
    int j = 0;
    int k = 0;
    Boolean localBoolean2;
    Integer localInteger4;
    if (localBoolean1 != null)
    {
      if (!localBoolean1.booleanValue())
      {
        localInteger3 = Integer.valueOf(-1);
        localBoolean2 = localBoolean1;
        localInteger4 = localInteger2;
      }
      else if (localInteger1 != null)
      {
        localBoolean2 = localBoolean1;
        localInteger3 = localInteger1;
        localInteger4 = localInteger2;
        if (localInteger1.intValue() != -1) {}
      }
      else
      {
        if (localInteger2 != null)
        {
          k = i;
          switch (localInteger2.intValue())
          {
          case 20: 
          case 26: 
          case 27: 
          case 28: 
          case 29: 
          case 30: 
          default: 
            k = 0;
            break;
          case 25: 
            k = 6;
            break;
          case 24: 
            k = 5;
            break;
          case 23: 
            k = 4;
            break;
          case 22: 
            k = 3;
            break;
          case 21: 
            k = 2;
          }
        }
        localInteger3 = Integer.valueOf(k);
        localBoolean2 = localBoolean1;
        localInteger4 = localInteger2;
      }
    }
    else
    {
      localBoolean2 = localBoolean1;
      localInteger3 = localInteger1;
      localInteger4 = localInteger2;
      if (localInteger1 != null)
      {
        if (localInteger1.intValue() == -1) {
          bool = false;
        }
        localBoolean1 = Boolean.valueOf(bool);
        localBoolean2 = localBoolean1;
        localInteger3 = localInteger1;
        localInteger4 = localInteger2;
        if (localBoolean1.booleanValue())
        {
          localBoolean2 = localBoolean1;
          localInteger3 = localInteger1;
          localInteger4 = localInteger2;
          if (localInteger2 == null)
          {
            k = j;
            switch (localInteger1.intValue())
            {
            default: 
              k = 20;
              break;
            case 6: 
              k = 25;
              break;
            case 5: 
              k = 24;
              break;
            case 4: 
              k = 23;
              break;
            case 3: 
              k = 22;
              break;
            case 2: 
              k = 21;
            }
            localInteger4 = Integer.valueOf(k);
            localInteger3 = localInteger1;
            localBoolean2 = localBoolean1;
          }
        }
      }
    }
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
    w = localInteger3;
    x = localBoolean2;
    y = q;
    Integer localInteger3 = r;
    z = localInteger3;
    A = localInteger3;
    B = s;
    C = t;
    D = u;
    E = v;
    F = w;
    G = x;
    H = y;
    I = z;
    J = A;
    K = B;
    L = C;
    M = D;
    N = E;
    O = localInteger4;
    P = G;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (p0.class == paramObject.getClass()))
    {
      paramObject = (p0)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(d, d)) || (!e0.a(e, e)) || (!e0.a(f, f)) || (!e0.a(o, o)) || (!e0.a(p, p)) || (!e0.a(q, q)) || (!Arrays.equals(r, r)) || (!e0.a(s, s)) || (!e0.a(t, t)) || (!e0.a(u, u)) || (!e0.a(v, v)) || (!e0.a(w, w)) || (!e0.a(x, x)) || (!e0.a(y, y)) || (!e0.a(A, A)) || (!e0.a(B, B)) || (!e0.a(C, C)) || (!e0.a(D, D)) || (!e0.a(E, E)) || (!e0.a(F, F)) || (!e0.a(G, G)) || (!e0.a(H, H)) || (!e0.a(I, I)) || (!e0.a(J, J)) || (!e0.a(K, K)) || (!e0.a(L, L)) || (!e0.a(M, M)) || (!e0.a(N, N)) || (!e0.a(O, O))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, e, f, o, p, q, Integer.valueOf(Arrays.hashCode(r)), s, t, u, v, w, x, y, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O });
  }
  
  public static final class a
  {
    public Integer A;
    public Integer B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public Integer F;
    public Bundle G;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public i1 h;
    public i1 i;
    public byte[] j;
    public Integer k;
    public Uri l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Boolean p;
    public Boolean q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public CharSequence x;
    public CharSequence y;
    public CharSequence z;
    
    public a() {}
    
    public a(p0 paramp0)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = o;
      h = p;
      i = q;
      j = r;
      k = s;
      l = t;
      m = u;
      n = v;
      o = w;
      p = x;
      q = y;
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
      G = P;
    }
    
    public final void a(byte[] paramArrayOfByte, int paramInt)
    {
      if ((j == null) || (e0.a(Integer.valueOf(paramInt), Integer.valueOf(3))) || (!e0.a(k, Integer.valueOf(3))))
      {
        j = ((byte[])paramArrayOfByte.clone());
        k = Integer.valueOf(paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     v3.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */