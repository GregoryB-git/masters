package i5;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import x6.b;

public final class b$b
{
  public static final int[] A;
  public static final boolean[] B;
  public static final int[] C;
  public static final int[] D;
  public static final int[] E;
  public static final int[] F;
  public static final int w = c(2, 2, 2, 0);
  public static final int x;
  public static final int[] y;
  public static final int[] z;
  public final ArrayList a = new ArrayList();
  public final SpannableStringBuilder b = new SpannableStringBuilder();
  public boolean c;
  public boolean d;
  public int e;
  public boolean f;
  public int g;
  public int h;
  public int i;
  public int j;
  public boolean k;
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
  public int v;
  
  static
  {
    int i1 = c(0, 0, 0, 0);
    x = i1;
    int i2 = c(0, 0, 0, 3);
    y = new int[] { 0, 0, 0, 0, 0, 2, 0 };
    z = new int[] { 0, 0, 0, 0, 0, 0, 2 };
    A = new int[] { 3, 3, 3, 3, 3, 3, 1 };
    B = new boolean[] { 0, 0, 0, 1, 1, 1, 0 };
    C = new int[] { i1, i2, i1, i1, i2, i1, i1 };
    D = new int[] { 0, 1, 2, 3, 4, 3, 4 };
    E = new int[] { 0, 0, 0, 0, 0, 3, 3 };
    F = new int[] { i1, i1, i1, i1, i1, i2, i2 };
  }
  
  public b$b()
  {
    d();
  }
  
  public static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b.x(paramInt1, 4);
    b.x(paramInt2, 4);
    b.x(paramInt3, 4);
    b.x(paramInt4, 4);
    int i1 = 0;
    if ((paramInt4 != 0) && (paramInt4 != 1)) {
      if (paramInt4 != 2)
      {
        if (paramInt4 == 3)
        {
          paramInt4 = 0;
          break label60;
        }
      }
      else
      {
        paramInt4 = 127;
        break label60;
      }
    }
    paramInt4 = 255;
    label60:
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
  
  public final void a(char paramChar)
  {
    if (paramChar == '\n')
    {
      a.add(b());
      b.clear();
      if (p != -1) {
        p = 0;
      }
      if (q != -1) {
        q = 0;
      }
      if (r != -1) {
        r = 0;
      }
      if (t != -1) {
        t = 0;
      }
      while (((k) && (a.size() >= j)) || (a.size() >= 15)) {
        a.remove(0);
      }
    }
    b.append(paramChar);
  }
  
  public final SpannableString b()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(b);
    int i1 = localSpannableStringBuilder.length();
    if (i1 > 0)
    {
      if (p != -1) {
        localSpannableStringBuilder.setSpan(new StyleSpan(2), p, i1, 33);
      }
      if (q != -1) {
        localSpannableStringBuilder.setSpan(new UnderlineSpan(), q, i1, 33);
      }
      if (r != -1) {
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(s), r, i1, 33);
      }
      if (t != -1) {
        localSpannableStringBuilder.setSpan(new BackgroundColorSpan(u), t, i1, 33);
      }
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public final void d()
  {
    a.clear();
    b.clear();
    p = -1;
    q = -1;
    r = -1;
    t = -1;
    v = 0;
    c = false;
    d = false;
    e = 4;
    f = false;
    g = 0;
    h = 0;
    i = 0;
    j = 15;
    k = true;
    l = 0;
    m = 0;
    n = 0;
    int i1 = x;
    o = i1;
    s = w;
    u = i1;
  }
  
  public final void e(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (p != -1)
    {
      if (!paramBoolean1)
      {
        b.setSpan(new StyleSpan(2), p, b.length(), 33);
        p = -1;
      }
    }
    else if (paramBoolean1) {
      p = b.length();
    }
    if (q != -1)
    {
      if (!paramBoolean2)
      {
        b.setSpan(new UnderlineSpan(), q, b.length(), 33);
        q = -1;
      }
    }
    else if (paramBoolean2) {
      q = b.length();
    }
  }
  
  public final void f(int paramInt1, int paramInt2)
  {
    if ((r != -1) && (s != paramInt1)) {
      b.setSpan(new ForegroundColorSpan(s), r, b.length(), 33);
    }
    if (paramInt1 != w)
    {
      r = b.length();
      s = paramInt1;
    }
    if ((t != -1) && (u != paramInt2)) {
      b.setSpan(new BackgroundColorSpan(u), t, b.length(), 33);
    }
    if (paramInt2 != x)
    {
      t = b.length();
      u = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     i5.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */