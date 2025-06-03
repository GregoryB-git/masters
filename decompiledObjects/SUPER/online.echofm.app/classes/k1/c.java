package k1;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  public String a = "";
  public String b = "";
  public Set c = Collections.emptySet();
  public String d = "";
  public String e = null;
  public int f;
  public boolean g = false;
  public int h;
  public boolean i = false;
  public int j = -1;
  public int k = -1;
  public int l = -1;
  public int m = -1;
  public int n = -1;
  public float o;
  public int p = -1;
  public boolean q = false;
  
  public static int B(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if (!paramString1.isEmpty())
    {
      int i1 = -1;
      if (paramInt1 != -1)
      {
        if (paramString1.equals(paramString2)) {
          i1 = paramInt1 + paramInt2;
        }
        return i1;
      }
    }
    return paramInt1;
  }
  
  public c A(boolean paramBoolean)
  {
    k = paramBoolean;
    return this;
  }
  
  public int a()
  {
    if (i) {
      return h;
    }
    throw new IllegalStateException("Background color not defined.");
  }
  
  public boolean b()
  {
    return q;
  }
  
  public int c()
  {
    if (g) {
      return f;
    }
    throw new IllegalStateException("Font color not defined");
  }
  
  public String d()
  {
    return e;
  }
  
  public float e()
  {
    return o;
  }
  
  public int f()
  {
    return n;
  }
  
  public int g()
  {
    return p;
  }
  
  public int h(String paramString1, String paramString2, Set paramSet, String paramString3)
  {
    if ((a.isEmpty()) && (b.isEmpty()) && (c.isEmpty()) && (d.isEmpty())) {
      return TextUtils.isEmpty(paramString2);
    }
    int i1 = B(B(B(0, a, paramString1, 1073741824), b, paramString2, 2), d, paramString3, 4);
    if ((i1 != -1) && (paramSet.containsAll(c))) {
      return i1 + c.size() * 4;
    }
    return 0;
  }
  
  public int i()
  {
    int i1 = l;
    if ((i1 == -1) && (m == -1)) {
      return -1;
    }
    int i2 = 0;
    if (i1 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (m == 1) {
      i2 = 2;
    }
    return i1 | i2;
  }
  
  public boolean j()
  {
    return i;
  }
  
  public boolean k()
  {
    return g;
  }
  
  public boolean l()
  {
    int i1 = j;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean m()
  {
    int i1 = k;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public c n(int paramInt)
  {
    h = paramInt;
    i = true;
    return this;
  }
  
  public c o(boolean paramBoolean)
  {
    l = paramBoolean;
    return this;
  }
  
  public c p(boolean paramBoolean)
  {
    q = paramBoolean;
    return this;
  }
  
  public c q(int paramInt)
  {
    f = paramInt;
    g = true;
    return this;
  }
  
  public c r(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = W2.c.e(paramString);
    }
    e = paramString;
    return this;
  }
  
  public c s(float paramFloat)
  {
    o = paramFloat;
    return this;
  }
  
  public c t(int paramInt)
  {
    n = paramInt;
    return this;
  }
  
  public c u(boolean paramBoolean)
  {
    m = paramBoolean;
    return this;
  }
  
  public c v(int paramInt)
  {
    p = paramInt;
    return this;
  }
  
  public void w(String[] paramArrayOfString)
  {
    c = new HashSet(Arrays.asList(paramArrayOfString));
  }
  
  public void x(String paramString)
  {
    a = paramString;
  }
  
  public void y(String paramString)
  {
    b = paramString;
  }
  
  public void z(String paramString)
  {
    d = paramString;
  }
}

/* Location:
 * Qualified Name:     k1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */