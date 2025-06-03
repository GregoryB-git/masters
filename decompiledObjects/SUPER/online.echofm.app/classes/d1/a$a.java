package d1;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import f0.a;
import f0.a.b;
import java.util.ArrayList;
import java.util.List;

public final class a$a
{
  public final List a = new ArrayList();
  public final List b = new ArrayList();
  public final StringBuilder c = new StringBuilder();
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  
  public a$a(int paramInt1, int paramInt2)
  {
    j(paramInt1);
    h = paramInt2;
  }
  
  public static void n(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == -1) {
      return;
    }
    paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt3), paramInt1, paramInt2, 33);
  }
  
  public static void o(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt1, paramInt2, 33);
  }
  
  public static void q(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
  }
  
  public void e(char paramChar)
  {
    if (c.length() < 32) {
      c.append(paramChar);
    }
  }
  
  public void f()
  {
    int i = c.length();
    if (i > 0)
    {
      c.delete(i - 1, i);
      for (int j = a.size() - 1; j >= 0; j--)
      {
        a locala = (a)a.get(j);
        int k = c;
        if (k != i) {
          break;
        }
        c = (k - 1);
      }
    }
  }
  
  public a g(int paramInt)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (int i = 0; i < b.size(); i++)
    {
      localSpannableStringBuilder.append((CharSequence)b.get(i));
      localSpannableStringBuilder.append('\n');
    }
    localSpannableStringBuilder.append(h());
    if (localSpannableStringBuilder.length() == 0) {
      return null;
    }
    i = e + f;
    int j = 32 - i - localSpannableStringBuilder.length();
    int k = i - j;
    if (paramInt == Integer.MIN_VALUE) {
      if ((g == 2) && ((Math.abs(k) < 3) || (j < 0))) {
        paramInt = 1;
      } else if ((g == 2) && (k > 0)) {
        paramInt = 2;
      } else {
        paramInt = 0;
      }
    }
    if (paramInt != 1)
    {
      if (paramInt != 2) {}
      for (;;)
      {
        f1 = i / 32.0F * 0.8F + 0.1F;
        break;
        i = 32 - j;
      }
    }
    float f1 = 0.5F;
    j = d;
    if (j > 7)
    {
      i = j - 17;
    }
    else
    {
      i = j;
      if (g == 1) {
        i = j - (h - 1);
      }
    }
    return new a.b().o(localSpannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i, 1).k(f1).l(paramInt).a();
  }
  
  public final SpannableString h()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(c);
    int i = localSpannableStringBuilder.length();
    int j = -1;
    int k = j;
    int m = k;
    int n = m;
    int i1 = 0;
    int i2 = i1;
    int i3 = i2;
    int i4 = m;
    int i5 = i2;
    int i6 = k;
    while (i1 < a.size())
    {
      a locala = (a)a.get(i1);
      boolean bool = b;
      i2 = a;
      k = n;
      int i7 = i3;
      if (i2 != 8)
      {
        if (i2 == 7) {
          k = 1;
        } else {
          k = 0;
        }
        if (i2 != 7) {
          n = a.q()[i2];
        }
        i7 = k;
        k = n;
      }
      i2 = c;
      int i8 = i1 + 1;
      if (i8 < a.size()) {
        n = a.get(i8)).c;
      } else {
        n = i;
      }
      if (i2 == n)
      {
        i1 = i8;
        n = k;
        i3 = i7;
      }
      else
      {
        if ((j != -1) && (!bool))
        {
          q(localSpannableStringBuilder, j, i2);
          m = -1;
        }
        else
        {
          m = j;
          if (j == -1)
          {
            m = j;
            if (bool) {
              m = i2;
            }
          }
        }
        int i9;
        if ((i6 != -1) && (i7 == 0))
        {
          o(localSpannableStringBuilder, i6, i2);
          i9 = -1;
        }
        else
        {
          i9 = i6;
          if (i6 == -1)
          {
            i9 = i6;
            if (i7 != 0) {
              i9 = i2;
            }
          }
        }
        i1 = i8;
        j = m;
        i6 = i9;
        n = k;
        i3 = i7;
        if (k != i4)
        {
          n(localSpannableStringBuilder, i5, i2, i4);
          i4 = k;
          i1 = i8;
          j = m;
          i6 = i9;
          i5 = i2;
          n = k;
          i3 = i7;
        }
      }
    }
    if ((j != -1) && (j != i)) {
      q(localSpannableStringBuilder, j, i);
    }
    if ((i6 != -1) && (i6 != i)) {
      o(localSpannableStringBuilder, i6, i);
    }
    if (i5 != i) {
      n(localSpannableStringBuilder, i5, i, i4);
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public boolean i()
  {
    boolean bool;
    if ((a.isEmpty()) && (b.isEmpty()) && (c.length() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void j(int paramInt)
  {
    g = paramInt;
    a.clear();
    b.clear();
    c.setLength(0);
    d = 15;
    e = 0;
    f = 0;
  }
  
  public void k()
  {
    b.add(h());
    c.setLength(0);
    a.clear();
    int i = Math.min(h, d);
    while (b.size() >= i) {
      b.remove(0);
    }
  }
  
  public void l(int paramInt)
  {
    g = paramInt;
  }
  
  public void m(int paramInt)
  {
    h = paramInt;
  }
  
  public void p(int paramInt, boolean paramBoolean)
  {
    a.add(new a(paramInt, paramBoolean, c.length()));
  }
  
  public static class a
  {
    public final int a;
    public final boolean b;
    public int c;
    
    public a(int paramInt1, boolean paramBoolean, int paramInt2)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     d1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */