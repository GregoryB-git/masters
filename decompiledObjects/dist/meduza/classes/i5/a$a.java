package i5;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h5.a;
import java.util.ArrayList;
import v5.e0;

public final class a$a
{
  public final ArrayList a;
  public final ArrayList b;
  public final StringBuilder c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  
  public a$a(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList1 = new ArrayList();
    a = localArrayList1;
    ArrayList localArrayList2 = new ArrayList();
    b = localArrayList2;
    StringBuilder localStringBuilder = new StringBuilder();
    c = localStringBuilder;
    g = paramInt1;
    localArrayList1.clear();
    localArrayList2.clear();
    localStringBuilder.setLength(0);
    d = 15;
    e = 0;
    f = 0;
    h = paramInt2;
  }
  
  public final void a(char paramChar)
  {
    if (c.length() < 32) {
      c.append(paramChar);
    }
  }
  
  public final void b()
  {
    int i = c.length();
    if (i > 0)
    {
      c.delete(i - 1, i);
      int j = a.size();
      for (;;)
      {
        j--;
        if (j < 0) {
          break;
        }
        a locala = (a)a.get(j);
        int k = c;
        if (k != i) {
          break;
        }
        c = (k - 1);
      }
    }
  }
  
  public final a c(int paramInt)
  {
    int i = e + f;
    int j = 32 - i;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (int k = 0; k < b.size(); k++)
    {
      localObject = (CharSequence)b.get(k);
      int m = e0.a;
      if (((CharSequence)localObject).length() > j) {
        localObject = ((CharSequence)localObject).subSequence(0, j);
      }
      localSpannableStringBuilder.append((CharSequence)localObject);
      localSpannableStringBuilder.append('\n');
    }
    Object localObject = d();
    k = e0.a;
    if (((SpannableString)localObject).length() > j) {
      localObject = ((SpannableString)localObject).subSequence(0, j);
    }
    localSpannableStringBuilder.append((CharSequence)localObject);
    if (localSpannableStringBuilder.length() == 0) {
      return null;
    }
    k = j - localSpannableStringBuilder.length();
    j = i - k;
    if (paramInt == Integer.MIN_VALUE) {
      if ((g == 2) && ((Math.abs(j) < 3) || (k < 0))) {
        paramInt = 1;
      } else if ((g == 2) && (j > 0)) {
        paramInt = 2;
      } else {
        paramInt = 0;
      }
    }
    float f1;
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        k = i;
      } else {
        k = 32 - k;
      }
      f1 = k / 32.0F * 0.8F + 0.1F;
    }
    else
    {
      f1 = 0.5F;
    }
    i = d;
    if (i > 7)
    {
      k = i - 15 - 2;
    }
    else
    {
      k = i;
      if (g == 1) {
        k = i - (h - 1);
      }
    }
    localObject = new h5.a.a();
    a = localSpannableStringBuilder;
    c = Layout.Alignment.ALIGN_NORMAL;
    e = k;
    f = 1;
    h = f1;
    i = paramInt;
    return ((h5.a.a)localObject).a();
  }
  
  public final SpannableString d()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(c);
    int i = localSpannableStringBuilder.length();
    int j = -1;
    int k = j;
    int m = k;
    int n = m;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = m;
    int i5 = k;
    while (i1 < a.size())
    {
      a locala = (a)a.get(i1);
      boolean bool = b;
      m = a;
      int i6 = i3;
      k = n;
      if (m != 8)
      {
        if (m == 7) {
          k = 1;
        } else {
          k = 0;
        }
        if (m != 7) {
          n = a.A[m];
        }
        i6 = k;
        k = n;
      }
      m = c;
      int i7 = i1 + 1;
      if (i7 < a.size()) {
        n = a.get(i7)).c;
      } else {
        n = i;
      }
      if (m == n)
      {
        i1 = i7;
        i3 = i6;
        n = k;
      }
      else
      {
        int i8;
        if ((j != -1) && (!bool))
        {
          localSpannableStringBuilder.setSpan(new UnderlineSpan(), j, m, 33);
          i8 = -1;
        }
        else
        {
          i8 = j;
          if (j == -1)
          {
            i8 = j;
            if (bool) {
              i8 = m;
            }
          }
        }
        int i9;
        if ((i5 != -1) && (i6 == 0))
        {
          localSpannableStringBuilder.setSpan(new StyleSpan(2), i5, m, 33);
          i9 = -1;
        }
        else
        {
          i9 = i5;
          if (i5 == -1)
          {
            i9 = i5;
            if (i6 != 0) {
              i9 = m;
            }
          }
        }
        i1 = i7;
        j = i8;
        i5 = i9;
        i3 = i6;
        n = k;
        if (k != i4)
        {
          if (i4 != -1) {
            localSpannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, m, 33);
          }
          i4 = k;
          i1 = i7;
          j = i8;
          i5 = i9;
          i2 = m;
          i3 = i6;
          n = k;
        }
      }
    }
    if ((j != -1) && (j != i)) {
      localSpannableStringBuilder.setSpan(new UnderlineSpan(), j, i, 33);
    }
    if ((i5 != -1) && (i5 != i)) {
      localSpannableStringBuilder.setSpan(new StyleSpan(2), i5, i, 33);
    }
    if ((i2 != i) && (i4 != -1)) {
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i, 33);
    }
    return new SpannableString(localSpannableStringBuilder);
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((a.isEmpty()) && (b.isEmpty()) && (c.length() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a
  {
    public final int a;
    public final boolean b;
    public int c;
    
    public a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     i5.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */