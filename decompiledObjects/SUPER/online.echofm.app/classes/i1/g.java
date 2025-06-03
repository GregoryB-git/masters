package i1;

import android.text.Layout.Alignment;

public final class g
{
  public String a;
  public int b;
  public boolean c;
  public int d;
  public boolean e;
  public int f = -1;
  public int g = -1;
  public int h = -1;
  public int i = -1;
  public int j = -1;
  public float k;
  public String l;
  public int m = -1;
  public int n = -1;
  public Layout.Alignment o;
  public Layout.Alignment p;
  public int q = -1;
  public b r;
  public float s = Float.MAX_VALUE;
  
  public g A(String paramString)
  {
    l = paramString;
    return this;
  }
  
  public g B(boolean paramBoolean)
  {
    i = paramBoolean;
    return this;
  }
  
  public g C(boolean paramBoolean)
  {
    f = paramBoolean;
    return this;
  }
  
  public g D(Layout.Alignment paramAlignment)
  {
    p = paramAlignment;
    return this;
  }
  
  public g E(int paramInt)
  {
    n = paramInt;
    return this;
  }
  
  public g F(int paramInt)
  {
    m = paramInt;
    return this;
  }
  
  public g G(float paramFloat)
  {
    s = paramFloat;
    return this;
  }
  
  public g H(Layout.Alignment paramAlignment)
  {
    o = paramAlignment;
    return this;
  }
  
  public g I(boolean paramBoolean)
  {
    q = paramBoolean;
    return this;
  }
  
  public g J(b paramb)
  {
    r = paramb;
    return this;
  }
  
  public g K(boolean paramBoolean)
  {
    g = paramBoolean;
    return this;
  }
  
  public g a(g paramg)
  {
    return r(paramg, true);
  }
  
  public int b()
  {
    if (e) {
      return d;
    }
    throw new IllegalStateException("Background color has not been defined.");
  }
  
  public int c()
  {
    if (c) {
      return b;
    }
    throw new IllegalStateException("Font color has not been defined.");
  }
  
  public String d()
  {
    return a;
  }
  
  public float e()
  {
    return k;
  }
  
  public int f()
  {
    return j;
  }
  
  public String g()
  {
    return l;
  }
  
  public Layout.Alignment h()
  {
    return p;
  }
  
  public int i()
  {
    return n;
  }
  
  public int j()
  {
    return m;
  }
  
  public float k()
  {
    return s;
  }
  
  public int l()
  {
    int i1 = h;
    if ((i1 == -1) && (i == -1)) {
      return -1;
    }
    int i2 = 0;
    if (i1 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i == 1) {
      i2 = 2;
    }
    return i1 | i2;
  }
  
  public Layout.Alignment m()
  {
    return o;
  }
  
  public boolean n()
  {
    int i1 = q;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public b o()
  {
    return r;
  }
  
  public boolean p()
  {
    return e;
  }
  
  public boolean q()
  {
    return c;
  }
  
  public final g r(g paramg, boolean paramBoolean)
  {
    if (paramg != null)
    {
      if ((!c) && (c)) {
        w(b);
      }
      if (h == -1) {
        h = h;
      }
      if (i == -1) {
        i = i;
      }
      Object localObject;
      if (a == null)
      {
        localObject = a;
        if (localObject != null) {
          a = ((String)localObject);
        }
      }
      if (f == -1) {
        f = f;
      }
      if (g == -1) {
        g = g;
      }
      if (n == -1) {
        n = n;
      }
      if (o == null)
      {
        localObject = o;
        if (localObject != null) {
          o = ((Layout.Alignment)localObject);
        }
      }
      if (p == null)
      {
        localObject = p;
        if (localObject != null) {
          p = ((Layout.Alignment)localObject);
        }
      }
      if (q == -1) {
        q = q;
      }
      if (j == -1)
      {
        j = j;
        k = k;
      }
      if (r == null) {
        r = r;
      }
      if (s == Float.MAX_VALUE) {
        s = s;
      }
      if ((paramBoolean) && (!e) && (e)) {
        u(d);
      }
      if ((paramBoolean) && (m == -1))
      {
        int i1 = m;
        if (i1 != -1) {
          m = i1;
        }
      }
    }
    return this;
  }
  
  public boolean s()
  {
    int i1 = f;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean t()
  {
    int i1 = g;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public g u(int paramInt)
  {
    d = paramInt;
    e = true;
    return this;
  }
  
  public g v(boolean paramBoolean)
  {
    h = paramBoolean;
    return this;
  }
  
  public g w(int paramInt)
  {
    b = paramInt;
    c = true;
    return this;
  }
  
  public g x(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public g y(float paramFloat)
  {
    k = paramFloat;
    return this;
  }
  
  public g z(int paramInt)
  {
    j = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     i1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */