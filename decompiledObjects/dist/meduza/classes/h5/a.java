package h5;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e0.e;
import java.util.Arrays;
import v3.g;
import v5.e0;
import x6.b;

public final class a
  implements g
{
  public static final String A = e0.E(0);
  public static final String B = e0.E(1);
  public static final String C = e0.E(2);
  public static final String D = e0.E(3);
  public static final String E = e0.E(4);
  public static final String F = e0.E(5);
  public static final String G = e0.E(6);
  public static final String H = e0.E(7);
  public static final String I = e0.E(8);
  public static final String J = e0.E(9);
  public static final String K = e0.E(10);
  public static final String L = e0.E(11);
  public static final String M = e0.E(12);
  public static final String N = e0.E(13);
  public static final String O = e0.E(14);
  public static final String P = e0.E(15);
  public static final String Q = e0.E(16);
  public static final e R = new e(16);
  public static final a z;
  public final CharSequence a;
  public final Layout.Alignment b;
  public final Layout.Alignment c;
  public final Bitmap d;
  public final float e;
  public final int f;
  public final int o;
  public final float p;
  public final int q;
  public final float r;
  public final float s;
  public final boolean t;
  public final int u;
  public final int v;
  public final float w;
  public final int x;
  public final float y;
  
  static
  {
    a locala = new a();
    a = "";
    z = locala.a();
  }
  
  public a(CharSequence paramCharSequence, Layout.Alignment paramAlignment1, Layout.Alignment paramAlignment2, Bitmap paramBitmap, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean, int paramInt5, int paramInt6, float paramFloat6)
  {
    if (paramCharSequence == null)
    {
      paramBitmap.getClass();
    }
    else
    {
      boolean bool;
      if (paramBitmap == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.q(bool);
    }
    if ((paramCharSequence instanceof Spanned)) {
      paramCharSequence = SpannedString.valueOf(paramCharSequence);
    } else if (paramCharSequence != null) {
      paramCharSequence = paramCharSequence.toString();
    } else {
      paramCharSequence = null;
    }
    a = paramCharSequence;
    b = paramAlignment1;
    c = paramAlignment2;
    d = paramBitmap;
    e = paramFloat1;
    f = paramInt1;
    o = paramInt2;
    p = paramFloat2;
    q = paramInt3;
    r = paramFloat4;
    s = paramFloat5;
    t = paramBoolean;
    u = paramInt5;
    v = paramInt4;
    w = paramFloat3;
    x = paramInt6;
    y = paramFloat6;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((TextUtils.equals(a, a)) && (b == b) && (c == c))
      {
        Bitmap localBitmap1 = d;
        if (localBitmap1 == null)
        {
          if (d != null) {
            break label257;
          }
        }
        else
        {
          Bitmap localBitmap2 = d;
          if ((localBitmap2 == null) || (!localBitmap1.sameAs(localBitmap2))) {
            break label257;
          }
        }
        if ((e == e) && (f == f) && (o == o) && (p == p) && (q == q) && (r == r) && (s == s) && (t == t) && (u == u) && (v == v) && (w == w) && (x == x) && (y == y)) {
          break label259;
        }
      }
      label257:
      bool = false;
      label259:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, Float.valueOf(e), Integer.valueOf(f), Integer.valueOf(o), Float.valueOf(p), Integer.valueOf(q), Float.valueOf(r), Float.valueOf(s), Boolean.valueOf(t), Integer.valueOf(u), Integer.valueOf(v), Float.valueOf(w), Integer.valueOf(x), Float.valueOf(y) });
  }
  
  public static final class a
  {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public int o;
    public int p;
    public float q;
    
    public a()
    {
      a = null;
      b = null;
      c = null;
      d = null;
      e = -3.4028235E38F;
      f = Integer.MIN_VALUE;
      g = Integer.MIN_VALUE;
      h = -3.4028235E38F;
      i = Integer.MIN_VALUE;
      j = Integer.MIN_VALUE;
      k = -3.4028235E38F;
      l = -3.4028235E38F;
      m = -3.4028235E38F;
      n = false;
      o = -16777216;
      p = Integer.MIN_VALUE;
    }
    
    public a(a parama)
    {
      a = a;
      b = d;
      c = b;
      d = c;
      e = e;
      f = f;
      g = o;
      h = p;
      i = q;
      j = v;
      k = w;
      l = r;
      m = s;
      n = t;
      o = u;
      p = x;
      q = y;
    }
    
    public final a a()
    {
      return new a(a, c, d, b, e, f, g, h, i, j, k, l, m, n, o, p, q);
    }
  }
}

/* Location:
 * Qualified Name:     h5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */