package d1;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import g0.a;
import java.util.ArrayList;
import java.util.List;

public final class c$b
{
  public static final int[] A;
  public static final boolean[] B;
  public static final int[] C;
  public static final int[] D;
  public static final int[] E;
  public static final int[] F;
  public static final int v = h(2, 2, 2, 0);
  public static final int w;
  public static final int x;
  public static final int[] y;
  public static final int[] z;
  public final List a = new ArrayList();
  public final SpannableStringBuilder b = new SpannableStringBuilder();
  public boolean c;
  public boolean d;
  public int e;
  public boolean f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  public int p;
  public int q;
  public int r;
  public int s;
  public int t;
  public int u;
  
  static
  {
    int i1 = h(0, 0, 0, 0);
    w = i1;
    int i2 = h(0, 0, 0, 3);
    x = i2;
    y = new int[] { 0, 0, 0, 0, 0, 2, 0 };
    z = new int[] { 0, 0, 0, 0, 0, 0, 2 };
    A = new int[] { 3, 3, 3, 3, 3, 3, 1 };
    B = new boolean[] { 0, 0, 0, 1, 1, 1, 0 };
    C = new int[] { i1, i2, i1, i1, i2, i1, i1 };
    D = new int[] { 0, 1, 2, 3, 4, 3, 4 };
    E = new int[] { 0, 0, 0, 0, 0, 3, 3 };
    F = new int[] { i1, i1, i1, i1, i1, i2, i2 };
  }
  
  public c$b()
  {
    l();
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    return h(paramInt1, paramInt2, paramInt3, 0);
  }
  
  public static int h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    a.c(paramInt1, 0, 4);
    a.c(paramInt2, 0, 4);
    a.c(paramInt3, 0, 4);
    a.c(paramInt4, 0, 4);
    if ((paramInt4 != 0) && (paramInt4 != 1))
    {
      if (paramInt4 == 2) {
        break label62;
      }
      if (paramInt4 == 3) {}
    }
    else
    {
      paramInt4 = 255;
      break label65;
    }
    paramInt4 = 0;
    break label65;
    label62:
    paramInt4 = 127;
    label65:
    if (paramInt1 > 1) {
      paramInt1 = 255;
    } else {
      paramInt1 = 0;
    }
    if (paramInt2 > 1) {
      paramInt2 = 255;
    } else {
      paramInt2 = 0;
    }
    if (paramInt3 > 1) {
      i1 = 255;
    }
    return Color.argb(paramInt4, paramInt1, paramInt2, i1);
  }
  
  public void a(char paramChar)
  {
    if (paramChar == '\n')
    {
      a.add(d());
      b.clear();
      if (o != -1) {
        o = 0;
      }
      if (p != -1) {
        p = 0;
      }
      if (q != -1) {
        q = 0;
      }
      if (s != -1) {
        s = 0;
      }
      for (;;)
      {
        if ((a.size() < j) && (a.size() < 15))
        {
          u = a.size();
          break;
        }
        a.remove(0);
      }
    }
    b.append(paramChar);
  }
  
  public void b()
  {
    int i1 = b.length();
    if (i1 > 0) {
      b.delete(i1 - 1, i1);
    }
  }
  
  public c.a c()
  {
    if (j()) {
      return null;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    boolean bool = false;
    for (int i1 = 0; i1 < a.size(); i1++)
    {
      localSpannableStringBuilder.append((CharSequence)a.get(i1));
      localSpannableStringBuilder.append('\n');
    }
    localSpannableStringBuilder.append(d());
    i1 = k;
    Object localObject;
    if (i1 != 0) {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 == 3) {
            break label157;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unexpected justification value: ");
          ((StringBuilder)localObject).append(k);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        localObject = Layout.Alignment.ALIGN_CENTER;
      }
    }
    for (;;)
    {
      break;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      continue;
      label157:
      localObject = Layout.Alignment.ALIGN_NORMAL;
    }
    float f1;
    float f2;
    if (f)
    {
      f1 = h / 99.0F;
      f2 = g / 99.0F;
    }
    else
    {
      f1 = h / 209.0F;
      f2 = g / 74.0F;
    }
    int i2 = i;
    if (i2 / 3 == 0) {
      i1 = 0;
    } else if (i2 / 3 == 1) {
      i1 = 1;
    } else {
      i1 = 2;
    }
    if (i2 % 3 == 0) {
      i2 = 0;
    } else if (i2 % 3 == 1) {
      i2 = 1;
    } else {
      i2 = 2;
    }
    if (n != w) {
      bool = true;
    }
    return new c.a(localSpannableStringBuilder, (Layout.Alignment)localObject, f2 * 0.9F + 0.05F, 0, i1, f1 * 0.9F + 0.05F, i2, -3.4028235E38F, bool, n, e);
  }
  
  public SpannableString d()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(b);
    int i1 = localSpannableStringBuilder.length();
    if (i1 > 0)
    {
      if (o != -1) {
        localSpannableStringBuilder.setSpan(new StyleSpan(2), o, i1, 33);
      }
      if (p != -1) {
        localSpannableStringBuilder.setSpan(new UnderlineSpan(), p, i1, 33);
      }
      if (q != -1) {
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(r), q, i1, 33);
      }
      if (s != -1) {
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(t), s, i1, 33);
      }
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public void e()
  {
    a.clear();
    b.clear();
    o = -1;
    p = -1;
    q = -1;
    s = -1;
    u = 0;
  }
  
  public void f(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    c = true;
    d = paramBoolean1;
    e = paramInt1;
    f = paramBoolean2;
    g = paramInt2;
    h = paramInt3;
    i = paramInt5;
    paramInt1 = j;
    paramInt2 = paramInt4 + 1;
    if (paramInt1 != paramInt2)
    {
      j = paramInt2;
      while ((a.size() >= j) || (a.size() >= 15)) {
        a.remove(0);
      }
    }
    if ((paramInt6 != 0) && (l != paramInt6))
    {
      l = paramInt6;
      paramInt1 = paramInt6 - 1;
      q(C[paramInt1], x, B[paramInt1], 0, z[paramInt1], A[paramInt1], y[paramInt1]);
    }
    if ((paramInt7 != 0) && (m != paramInt7))
    {
      m = paramInt7;
      paramInt1 = paramInt7 - 1;
      m(0, 1, 1, false, false, E[paramInt1], D[paramInt1]);
      n(v, F[paramInt1], w);
    }
  }
  
  public boolean i()
  {
    return c;
  }
  
  public boolean j()
  {
    boolean bool;
    if ((i()) && ((!a.isEmpty()) || (b.length() != 0))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean k()
  {
    return d;
  }
  
  public void l()
  {
    e();
    c = false;
    d = false;
    e = 4;
    f = false;
    g = 0;
    h = 0;
    i = 0;
    j = 15;
    k = 0;
    l = 0;
    m = 0;
    int i1 = w;
    n = i1;
    r = v;
    t = i1;
  }
  
  public void m(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, int paramInt5)
  {
    if (o != -1)
    {
      if (!paramBoolean1)
      {
        b.setSpan(new StyleSpan(2), o, b.length(), 33);
        o = -1;
      }
    }
    else if (paramBoolean1) {
      o = b.length();
    }
    if (p != -1)
    {
      if (!paramBoolean2)
      {
        b.setSpan(new UnderlineSpan(), p, b.length(), 33);
        p = -1;
      }
    }
    else if (paramBoolean2) {
      p = b.length();
    }
  }
  
  public void n(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((q != -1) && (r != paramInt1)) {
      b.setSpan(new ForegroundColorSpan(r), q, b.length(), 33);
    }
    if (paramInt1 != v)
    {
      q = b.length();
      r = paramInt1;
    }
    if ((s != -1) && (t != paramInt2)) {
      b.setSpan(new BackgroundColorSpan(t), s, b.length(), 33);
    }
    if (paramInt2 != w)
    {
      s = b.length();
      t = paramInt2;
    }
  }
  
  public void o(int paramInt1, int paramInt2)
  {
    if (u != paramInt1) {
      a('\n');
    }
    u = paramInt1;
  }
  
  public void p(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public void q(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    n = paramInt1;
    k = paramInt6;
  }
}

/* Location:
 * Qualified Name:     d1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */