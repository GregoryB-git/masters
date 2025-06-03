package d0;

import android.net.Uri;
import android.os.Bundle;
import g0.M;
import g0.a;
import java.util.List;

public final class w$b
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
  
  public w$b() {}
  
  public w$b(w paramw)
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

/* Location:
 * Qualified Name:     d0.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */