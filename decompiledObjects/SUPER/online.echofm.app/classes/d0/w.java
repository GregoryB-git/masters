package d0;

import W2.k;
import android.net.Uri;
import android.os.Bundle;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.List;

public final class w
{
  public static final w H = new b().I();
  public static final String I = M.w0(0);
  public static final String J = M.w0(1);
  public static final String K = M.w0(2);
  public static final String L = M.w0(3);
  public static final String M = M.w0(4);
  public static final String N = M.w0(5);
  public static final String O = M.w0(6);
  public static final String P = M.w0(8);
  public static final String Q = M.w0(9);
  public static final String R = M.w0(10);
  public static final String S = M.w0(11);
  public static final String T = M.w0(12);
  public static final String U = M.w0(13);
  public static final String V = M.w0(14);
  public static final String W = M.w0(15);
  public static final String X = M.w0(16);
  public static final String Y = M.w0(17);
  public static final String Z = M.w0(18);
  public static final String a0 = M.w0(19);
  public static final String b0 = M.w0(20);
  public static final String c0 = M.w0(21);
  public static final String d0 = M.w0(22);
  public static final String e0 = M.w0(23);
  public static final String f0 = M.w0(24);
  public static final String g0 = M.w0(25);
  public static final String h0 = M.w0(26);
  public static final String i0 = M.w0(27);
  public static final String j0 = M.w0(28);
  public static final String k0 = M.w0(29);
  public static final String l0 = M.w0(30);
  public static final String m0 = M.w0(31);
  public static final String n0 = M.w0(32);
  public static final String o0 = M.w0(33);
  public static final String p0 = M.w0(1000);
  public final Integer A;
  public final Integer B;
  public final CharSequence C;
  public final CharSequence D;
  public final CharSequence E;
  public final Integer F;
  public final Bundle G;
  public final CharSequence a;
  public final CharSequence b;
  public final CharSequence c;
  public final CharSequence d;
  public final CharSequence e;
  public final CharSequence f;
  public final CharSequence g;
  public final Long h;
  public final byte[] i;
  public final Integer j;
  public final Uri k;
  public final Integer l;
  public final Integer m;
  public final Integer n;
  public final Boolean o;
  public final Boolean p;
  public final Integer q;
  public final Integer r;
  public final Integer s;
  public final Integer t;
  public final Integer u;
  public final Integer v;
  public final Integer w;
  public final CharSequence x;
  public final CharSequence y;
  public final CharSequence z;
  
  public w(b paramb)
  {
    Boolean localBoolean1 = b.a(paramb);
    Integer localInteger1 = b.l(paramb);
    Integer localInteger2 = b.w(paramb);
    boolean bool = false;
    int i1 = 0;
    Integer localInteger3;
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
        if (localInteger2 != null) {
          i1 = b(localInteger2.intValue());
        }
        localInteger3 = Integer.valueOf(i1);
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
        if (localInteger1.intValue() != -1) {
          bool = true;
        }
        localBoolean1 = Boolean.valueOf(bool);
        localBoolean2 = localBoolean1;
        localInteger3 = localInteger1;
        localInteger4 = localInteger2;
        if (bool)
        {
          localBoolean2 = localBoolean1;
          localInteger3 = localInteger1;
          localInteger4 = localInteger2;
          if (localInteger2 == null)
          {
            localInteger4 = Integer.valueOf(c(localInteger1.intValue()));
            localInteger3 = localInteger1;
            localBoolean2 = localBoolean1;
          }
        }
      }
    }
    a = b.C(paramb);
    b = b.D(paramb);
    c = b.E(paramb);
    d = b.F(paramb);
    e = b.G(paramb);
    f = b.H(paramb);
    g = b.b(paramb);
    h = b.c(paramb);
    b.d(paramb);
    b.e(paramb);
    i = b.f(paramb);
    j = b.g(paramb);
    k = b.h(paramb);
    l = b.i(paramb);
    m = b.j(paramb);
    n = localInteger3;
    o = localBoolean2;
    p = b.k(paramb);
    q = b.m(paramb);
    r = b.m(paramb);
    s = b.n(paramb);
    t = b.o(paramb);
    u = b.p(paramb);
    v = b.q(paramb);
    w = b.r(paramb);
    x = b.s(paramb);
    y = b.t(paramb);
    z = b.u(paramb);
    A = b.v(paramb);
    B = b.x(paramb);
    C = b.y(paramb);
    D = b.z(paramb);
    E = b.A(paramb);
    F = localInteger4;
    G = b.B(paramb);
  }
  
  public static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 20: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    default: 
      return 0;
    case 25: 
      return 6;
    case 24: 
      return 5;
    case 23: 
      return 4;
    case 22: 
      return 3;
    case 21: 
      return 2;
    }
    return 1;
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 20;
    case 6: 
      return 25;
    case 5: 
      return 24;
    case 4: 
      return 23;
    case 3: 
      return 22;
    case 2: 
      return 21;
    }
    return 0;
  }
  
  public b a()
  {
    return new b(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (w.class == paramObject.getClass()))
    {
      paramObject = (w)paramObject;
      if ((M.c(a, a)) && (M.c(b, b)) && (M.c(c, c)) && (M.c(d, d)) && (M.c(e, e)) && (M.c(f, f)) && (M.c(g, g)) && (M.c(h, h)) && (M.c(null, null)) && (M.c(null, null)) && (Arrays.equals(i, i)) && (M.c(j, j)) && (M.c(k, k)) && (M.c(l, l)) && (M.c(m, m)) && (M.c(n, n)) && (M.c(o, o)) && (M.c(p, p)) && (M.c(r, r)) && (M.c(s, s)) && (M.c(t, t)) && (M.c(u, u)) && (M.c(v, v)) && (M.c(w, w)) && (M.c(x, x)) && (M.c(y, y)) && (M.c(z, z)) && (M.c(A, A)) && (M.c(B, B)) && (M.c(C, C)) && (M.c(D, D)) && (M.c(E, E)) && (M.c(F, F)))
      {
        int i1;
        if (G == null) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        int i2;
        if (G == null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i1 == i2) {}
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
    CharSequence localCharSequence1 = a;
    boolean bool = false;
    CharSequence localCharSequence2 = b;
    CharSequence localCharSequence3 = c;
    CharSequence localCharSequence4 = d;
    CharSequence localCharSequence5 = e;
    CharSequence localCharSequence6 = f;
    CharSequence localCharSequence7 = g;
    Long localLong = h;
    int i1 = Arrays.hashCode(i);
    Integer localInteger1 = j;
    Uri localUri = k;
    Integer localInteger2 = l;
    Integer localInteger3 = m;
    Integer localInteger4 = n;
    Boolean localBoolean1 = o;
    Boolean localBoolean2 = p;
    Integer localInteger5 = r;
    Integer localInteger6 = s;
    Integer localInteger7 = t;
    Integer localInteger8 = u;
    Integer localInteger9 = v;
    Integer localInteger10 = w;
    CharSequence localCharSequence8 = x;
    CharSequence localCharSequence9 = y;
    CharSequence localCharSequence10 = z;
    Integer localInteger11 = A;
    Integer localInteger12 = B;
    CharSequence localCharSequence11 = C;
    CharSequence localCharSequence12 = D;
    CharSequence localCharSequence13 = E;
    Integer localInteger13 = F;
    if (G == null) {
      bool = true;
    }
    return k.b(new Object[] { localCharSequence1, localCharSequence2, localCharSequence3, localCharSequence4, localCharSequence5, localCharSequence6, localCharSequence7, localLong, null, null, Integer.valueOf(i1), localInteger1, localUri, localInteger2, localInteger3, localInteger4, localBoolean1, localBoolean2, localInteger5, localInteger6, localInteger7, localInteger8, localInteger9, localInteger10, localCharSequence8, localCharSequence9, localCharSequence10, localInteger11, localInteger12, localCharSequence11, localCharSequence12, localCharSequence13, localInteger13, Boolean.valueOf(bool) });
  }
  
  public static final class b
  {
    public Integer A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public Integer E;
    public Bundle F;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public byte[] i;
    public Integer j;
    public Uri k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Boolean o;
    public Boolean p;
    public Integer q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public CharSequence w;
    public CharSequence x;
    public CharSequence y;
    public Integer z;
    
    public b() {}
    
    public b(w paramw)
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
    }
    
    public w I()
    {
      return new w(this, null);
    }
    
    public b J(byte[] paramArrayOfByte, int paramInt)
    {
      if ((i == null) || (M.c(Integer.valueOf(paramInt), Integer.valueOf(3))) || (!M.c(j, Integer.valueOf(3))))
      {
        i = ((byte[])paramArrayOfByte.clone());
        j = Integer.valueOf(paramInt);
      }
      return this;
    }
    
    public b K(w paramw)
    {
      if (paramw == null) {
        return this;
      }
      Object localObject = a;
      if (localObject != null) {
        n0((CharSequence)localObject);
      }
      localObject = b;
      if (localObject != null) {
        P((CharSequence)localObject);
      }
      localObject = c;
      if (localObject != null) {
        O((CharSequence)localObject);
      }
      localObject = d;
      if (localObject != null) {
        N((CharSequence)localObject);
      }
      localObject = e;
      if (localObject != null) {
        X((CharSequence)localObject);
      }
      localObject = f;
      if (localObject != null) {
        m0((CharSequence)localObject);
      }
      localObject = g;
      if (localObject != null) {
        V((CharSequence)localObject);
      }
      localObject = h;
      if (localObject != null) {
        Y((Long)localObject);
      }
      localObject = k;
      if ((localObject != null) || (i != null))
      {
        R((Uri)localObject);
        Q(i, j);
      }
      localObject = l;
      if (localObject != null) {
        q0((Integer)localObject);
      }
      localObject = m;
      if (localObject != null) {
        p0((Integer)localObject);
      }
      localObject = n;
      if (localObject != null) {
        a0((Integer)localObject);
      }
      localObject = o;
      if (localObject != null) {
        c0((Boolean)localObject);
      }
      localObject = p;
      if (localObject != null) {
        d0((Boolean)localObject);
      }
      localObject = q;
      if (localObject != null) {
        h0((Integer)localObject);
      }
      localObject = r;
      if (localObject != null) {
        h0((Integer)localObject);
      }
      localObject = s;
      if (localObject != null) {
        g0((Integer)localObject);
      }
      localObject = t;
      if (localObject != null) {
        f0((Integer)localObject);
      }
      localObject = u;
      if (localObject != null) {
        k0((Integer)localObject);
      }
      localObject = v;
      if (localObject != null) {
        j0((Integer)localObject);
      }
      localObject = w;
      if (localObject != null) {
        i0((Integer)localObject);
      }
      localObject = x;
      if (localObject != null) {
        r0((CharSequence)localObject);
      }
      localObject = y;
      if (localObject != null) {
        T((CharSequence)localObject);
      }
      localObject = z;
      if (localObject != null) {
        U((CharSequence)localObject);
      }
      localObject = A;
      if (localObject != null) {
        W((Integer)localObject);
      }
      localObject = B;
      if (localObject != null) {
        o0((Integer)localObject);
      }
      localObject = C;
      if (localObject != null) {
        b0((CharSequence)localObject);
      }
      localObject = D;
      if (localObject != null) {
        S((CharSequence)localObject);
      }
      localObject = E;
      if (localObject != null) {
        l0((CharSequence)localObject);
      }
      localObject = F;
      if (localObject != null) {
        e0((Integer)localObject);
      }
      paramw = G;
      if (paramw != null) {
        Z(paramw);
      }
      return this;
    }
    
    public b L(x paramx)
    {
      for (int i1 = 0; i1 < paramx.e(); i1++) {
        paramx.d(i1).D(this);
      }
      return this;
    }
    
    public b M(List paramList)
    {
      for (int i1 = 0; i1 < paramList.size(); i1++)
      {
        x localx = (x)paramList.get(i1);
        for (int i2 = 0; i2 < localx.e(); i2++) {
          localx.d(i2).D(this);
        }
      }
      return this;
    }
    
    public b N(CharSequence paramCharSequence)
    {
      d = paramCharSequence;
      return this;
    }
    
    public b O(CharSequence paramCharSequence)
    {
      c = paramCharSequence;
      return this;
    }
    
    public b P(CharSequence paramCharSequence)
    {
      b = paramCharSequence;
      return this;
    }
    
    public b Q(byte[] paramArrayOfByte, Integer paramInteger)
    {
      if (paramArrayOfByte == null) {
        paramArrayOfByte = null;
      } else {
        paramArrayOfByte = (byte[])paramArrayOfByte.clone();
      }
      i = paramArrayOfByte;
      j = paramInteger;
      return this;
    }
    
    public b R(Uri paramUri)
    {
      k = paramUri;
      return this;
    }
    
    public b S(CharSequence paramCharSequence)
    {
      C = paramCharSequence;
      return this;
    }
    
    public b T(CharSequence paramCharSequence)
    {
      x = paramCharSequence;
      return this;
    }
    
    public b U(CharSequence paramCharSequence)
    {
      y = paramCharSequence;
      return this;
    }
    
    public b V(CharSequence paramCharSequence)
    {
      g = paramCharSequence;
      return this;
    }
    
    public b W(Integer paramInteger)
    {
      z = paramInteger;
      return this;
    }
    
    public b X(CharSequence paramCharSequence)
    {
      e = paramCharSequence;
      return this;
    }
    
    public b Y(Long paramLong)
    {
      boolean bool;
      if ((paramLong != null) && (paramLong.longValue() < 0L)) {
        bool = false;
      } else {
        bool = true;
      }
      a.a(bool);
      h = paramLong;
      return this;
    }
    
    public b Z(Bundle paramBundle)
    {
      F = paramBundle;
      return this;
    }
    
    public b a0(Integer paramInteger)
    {
      n = paramInteger;
      return this;
    }
    
    public b b0(CharSequence paramCharSequence)
    {
      B = paramCharSequence;
      return this;
    }
    
    public b c0(Boolean paramBoolean)
    {
      o = paramBoolean;
      return this;
    }
    
    public b d0(Boolean paramBoolean)
    {
      p = paramBoolean;
      return this;
    }
    
    public b e0(Integer paramInteger)
    {
      E = paramInteger;
      return this;
    }
    
    public b f0(Integer paramInteger)
    {
      s = paramInteger;
      return this;
    }
    
    public b g0(Integer paramInteger)
    {
      r = paramInteger;
      return this;
    }
    
    public b h0(Integer paramInteger)
    {
      q = paramInteger;
      return this;
    }
    
    public b i0(Integer paramInteger)
    {
      v = paramInteger;
      return this;
    }
    
    public b j0(Integer paramInteger)
    {
      u = paramInteger;
      return this;
    }
    
    public b k0(Integer paramInteger)
    {
      t = paramInteger;
      return this;
    }
    
    public b l0(CharSequence paramCharSequence)
    {
      D = paramCharSequence;
      return this;
    }
    
    public b m0(CharSequence paramCharSequence)
    {
      f = paramCharSequence;
      return this;
    }
    
    public b n0(CharSequence paramCharSequence)
    {
      a = paramCharSequence;
      return this;
    }
    
    public b o0(Integer paramInteger)
    {
      A = paramInteger;
      return this;
    }
    
    public b p0(Integer paramInteger)
    {
      m = paramInteger;
      return this;
    }
    
    public b q0(Integer paramInteger)
    {
      l = paramInteger;
      return this;
    }
    
    public b r0(CharSequence paramCharSequence)
    {
      w = paramCharSequence;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */