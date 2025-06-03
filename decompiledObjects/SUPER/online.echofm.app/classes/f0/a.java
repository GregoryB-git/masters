package f0;

import W2.k;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import g0.M;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  public static final String A = M.w0(6);
  public static final String B = M.w0(7);
  public static final String C = M.w0(8);
  public static final String D = M.w0(9);
  public static final String E = M.w0(10);
  public static final String F = M.w0(11);
  public static final String G = M.w0(12);
  public static final String H = M.w0(13);
  public static final String I = M.w0(14);
  public static final String J = M.w0(15);
  public static final String K = M.w0(16);
  public static final a r = new b().o("").a();
  public static final String s = M.w0(0);
  public static final String t = M.w0(17);
  public static final String u = M.w0(1);
  public static final String v = M.w0(2);
  public static final String w = M.w0(3);
  public static final String x = M.w0(18);
  public static final String y = M.w0(4);
  public static final String z = M.w0(5);
  public final CharSequence a;
  public final Layout.Alignment b;
  public final Layout.Alignment c;
  public final Bitmap d;
  public final float e;
  public final int f;
  public final int g;
  public final float h;
  public final int i;
  public final float j;
  public final float k;
  public final boolean l;
  public final int m;
  public final int n;
  public final float o;
  public final int p;
  public final float q;
  
  public a(CharSequence paramCharSequence, Layout.Alignment paramAlignment1, Layout.Alignment paramAlignment2, Bitmap paramBitmap, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean, int paramInt5, int paramInt6, float paramFloat6)
  {
    if (paramCharSequence == null)
    {
      g0.a.e(paramBitmap);
    }
    else
    {
      boolean bool;
      if (paramBitmap == null) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.a(bool);
    }
    if ((paramCharSequence instanceof Spanned)) {
      paramCharSequence = SpannedString.valueOf(paramCharSequence);
    }
    for (;;)
    {
      a = paramCharSequence;
      break;
      if (paramCharSequence != null) {
        paramCharSequence = paramCharSequence.toString();
      } else {
        paramCharSequence = null;
      }
    }
    b = paramAlignment1;
    c = paramAlignment2;
    d = paramBitmap;
    e = paramFloat1;
    f = paramInt1;
    g = paramInt2;
    h = paramFloat2;
    i = paramInt3;
    j = paramFloat4;
    k = paramFloat5;
    l = paramBoolean;
    m = paramInt5;
    n = paramInt4;
    o = paramFloat3;
    p = paramInt6;
    q = paramFloat6;
  }
  
  public static a b(Bundle paramBundle)
  {
    b localb = new b();
    Object localObject1 = paramBundle.getCharSequence(s);
    if (localObject1 != null)
    {
      localb.o((CharSequence)localObject1);
      localObject2 = paramBundle.getParcelableArrayList(t);
      if (localObject2 != null)
      {
        localObject1 = SpannableString.valueOf((CharSequence)localObject1);
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          c.c((Bundle)((Iterator)localObject2).next(), (Spannable)localObject1);
        }
        localb.o((CharSequence)localObject1);
      }
    }
    localObject1 = (Layout.Alignment)paramBundle.getSerializable(u);
    if (localObject1 != null) {
      localb.p((Layout.Alignment)localObject1);
    }
    localObject1 = (Layout.Alignment)paramBundle.getSerializable(v);
    if (localObject1 != null) {
      localb.j((Layout.Alignment)localObject1);
    }
    localObject1 = (Bitmap)paramBundle.getParcelable(w);
    if (localObject1 != null) {}
    for (;;)
    {
      localb.f((Bitmap)localObject1);
      break;
      localObject1 = paramBundle.getByteArray(x);
      if (localObject1 == null) {
        break;
      }
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length);
    }
    Object localObject2 = y;
    if (paramBundle.containsKey((String)localObject2))
    {
      localObject1 = z;
      if (paramBundle.containsKey((String)localObject1)) {
        localb.h(paramBundle.getFloat((String)localObject2), paramBundle.getInt((String)localObject1));
      }
    }
    localObject1 = A;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.i(paramBundle.getInt((String)localObject1));
    }
    localObject1 = B;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.k(paramBundle.getFloat((String)localObject1));
    }
    localObject1 = C;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.l(paramBundle.getInt((String)localObject1));
    }
    localObject1 = E;
    if (paramBundle.containsKey((String)localObject1))
    {
      localObject2 = D;
      if (paramBundle.containsKey((String)localObject2)) {
        localb.q(paramBundle.getFloat((String)localObject1), paramBundle.getInt((String)localObject2));
      }
    }
    localObject1 = F;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.n(paramBundle.getFloat((String)localObject1));
    }
    localObject1 = G;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.g(paramBundle.getFloat((String)localObject1));
    }
    localObject1 = H;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.s(paramBundle.getInt((String)localObject1));
    }
    if (!paramBundle.getBoolean(I, false)) {
      localb.b();
    }
    localObject1 = J;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.r(paramBundle.getInt((String)localObject1));
    }
    localObject1 = K;
    if (paramBundle.containsKey((String)localObject1)) {
      localb.m(paramBundle.getFloat((String)localObject1));
    }
    return localb.a();
  }
  
  public b a()
  {
    return new b(this, null);
  }
  
  public final Bundle c()
  {
    Bundle localBundle = new Bundle();
    Object localObject = a;
    if (localObject != null)
    {
      localBundle.putCharSequence(s, (CharSequence)localObject);
      localObject = a;
      if ((localObject instanceof Spanned))
      {
        localObject = c.a((Spanned)localObject);
        if (!((ArrayList)localObject).isEmpty()) {
          localBundle.putParcelableArrayList(t, (ArrayList)localObject);
        }
      }
    }
    localBundle.putSerializable(u, b);
    localBundle.putSerializable(v, c);
    localBundle.putFloat(y, e);
    localBundle.putInt(z, f);
    localBundle.putInt(A, g);
    localBundle.putFloat(B, h);
    localBundle.putInt(C, i);
    localBundle.putInt(D, n);
    localBundle.putFloat(E, o);
    localBundle.putFloat(F, j);
    localBundle.putFloat(G, k);
    localBundle.putBoolean(I, l);
    localBundle.putInt(H, m);
    localBundle.putInt(J, p);
    localBundle.putFloat(K, q);
    return localBundle;
  }
  
  public Bundle d()
  {
    Bundle localBundle = c();
    if (d != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      g0.a.f(d.compress(Bitmap.CompressFormat.PNG, 0, localByteArrayOutputStream));
      localBundle.putByteArray(x, localByteArrayOutputStream.toByteArray());
    }
    return localBundle;
  }
  
  public boolean equals(Object paramObject)
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
        if ((e == e) && (f == f) && (g == g) && (h == h) && (i == i) && (j == j) && (k == k) && (l == l) && (m == m) && (n == n) && (o == o) && (p == p) && (q == q)) {
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
  
  public int hashCode()
  {
    return k.b(new Object[] { a, b, c, d, Float.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Float.valueOf(h), Integer.valueOf(i), Float.valueOf(j), Float.valueOf(k), Boolean.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Float.valueOf(o), Integer.valueOf(p), Float.valueOf(q) });
  }
  
  public static final class b
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
    
    public b()
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
    
    public b(a parama)
    {
      a = a;
      b = d;
      c = b;
      d = c;
      e = e;
      f = f;
      g = g;
      h = h;
      i = i;
      j = n;
      k = o;
      l = j;
      m = k;
      n = l;
      o = m;
      p = p;
      q = q;
    }
    
    public a a()
    {
      return new a(a, c, d, b, e, f, g, h, i, j, k, l, m, n, o, p, q, null);
    }
    
    public b b()
    {
      n = false;
      return this;
    }
    
    public int c()
    {
      return g;
    }
    
    public int d()
    {
      return i;
    }
    
    public CharSequence e()
    {
      return a;
    }
    
    public b f(Bitmap paramBitmap)
    {
      b = paramBitmap;
      return this;
    }
    
    public b g(float paramFloat)
    {
      m = paramFloat;
      return this;
    }
    
    public b h(float paramFloat, int paramInt)
    {
      e = paramFloat;
      f = paramInt;
      return this;
    }
    
    public b i(int paramInt)
    {
      g = paramInt;
      return this;
    }
    
    public b j(Layout.Alignment paramAlignment)
    {
      d = paramAlignment;
      return this;
    }
    
    public b k(float paramFloat)
    {
      h = paramFloat;
      return this;
    }
    
    public b l(int paramInt)
    {
      i = paramInt;
      return this;
    }
    
    public b m(float paramFloat)
    {
      q = paramFloat;
      return this;
    }
    
    public b n(float paramFloat)
    {
      l = paramFloat;
      return this;
    }
    
    public b o(CharSequence paramCharSequence)
    {
      a = paramCharSequence;
      return this;
    }
    
    public b p(Layout.Alignment paramAlignment)
    {
      c = paramAlignment;
      return this;
    }
    
    public b q(float paramFloat, int paramInt)
    {
      k = paramFloat;
      j = paramInt;
      return this;
    }
    
    public b r(int paramInt)
    {
      p = paramInt;
      return this;
    }
    
    public b s(int paramInt)
    {
      o = paramInt;
      n = true;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     f0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */