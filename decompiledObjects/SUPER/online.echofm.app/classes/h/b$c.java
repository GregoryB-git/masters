package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.SparseArray;

public abstract class b$c
  extends Drawable.ConstantState
{
  public int A;
  public int B;
  public boolean C;
  public ColorFilter D;
  public boolean E;
  public ColorStateList F;
  public PorterDuff.Mode G;
  public boolean H;
  public boolean I;
  public final b a;
  public Resources b;
  public int c = 160;
  public int d;
  public int e;
  public SparseArray f;
  public Drawable[] g;
  public int h;
  public boolean i;
  public boolean j;
  public Rect k;
  public boolean l;
  public boolean m;
  public int n;
  public int o;
  public int p;
  public int q;
  public boolean r;
  public int s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  public boolean y;
  public int z;
  
  public b$c(c paramc, b paramb, Resources paramResources)
  {
    int i1 = 0;
    i = false;
    l = false;
    x = true;
    A = 0;
    B = 0;
    a = paramb;
    if (paramResources != null) {
      paramb = paramResources;
    } else if (paramc != null) {
      paramb = b;
    } else {
      paramb = null;
    }
    b = paramb;
    if (paramc != null) {
      i2 = c;
    } else {
      i2 = 0;
    }
    int i2 = b.f(paramResources, i2);
    c = i2;
    if (paramc != null)
    {
      d = d;
      e = e;
      v = true;
      w = true;
      i = i;
      l = l;
      x = x;
      y = y;
      z = z;
      A = A;
      B = B;
      C = C;
      D = D;
      E = E;
      F = F;
      G = G;
      H = H;
      I = I;
      if (c == i2)
      {
        if (j)
        {
          k = new Rect(k);
          j = true;
        }
        if (m)
        {
          n = n;
          o = o;
          p = p;
          q = q;
          m = true;
        }
      }
      if (r)
      {
        s = s;
        r = true;
      }
      if (t)
      {
        u = u;
        t = true;
      }
      paramb = g;
      g = new Drawable[paramb.length];
      h = h;
      paramc = f;
      if (paramc != null) {}
      for (paramc = paramc.clone();; paramc = new SparseArray(h))
      {
        f = paramc;
        break;
      }
      int i3 = h;
      for (i2 = i1; i2 < i3; i2++)
      {
        paramc = paramb[i2];
        if (paramc != null)
        {
          paramc = paramc.getConstantState();
          if (paramc != null) {
            f.put(i2, paramc);
          } else {
            g[i2] = paramb[i2];
          }
        }
      }
    }
    g = new Drawable[10];
    h = 0;
  }
  
  public final int a(Drawable paramDrawable)
  {
    int i1 = h;
    if (i1 >= g.length) {
      o(i1, i1 + 10);
    }
    paramDrawable.mutate();
    paramDrawable.setVisible(false, true);
    paramDrawable.setCallback(a);
    g[i1] = paramDrawable;
    h += 1;
    int i2 = e;
    e = (paramDrawable.getChangingConfigurations() | i2);
    p();
    k = null;
    j = false;
    m = false;
    v = false;
    return i1;
  }
  
  public final void b(Resources.Theme paramTheme)
  {
    if (paramTheme != null)
    {
      e();
      int i1 = h;
      Drawable[] arrayOfDrawable = g;
      for (int i2 = 0; i2 < i1; i2++)
      {
        Drawable localDrawable = arrayOfDrawable[i2];
        if ((localDrawable != null) && (localDrawable.canApplyTheme()))
        {
          arrayOfDrawable[i2].applyTheme(paramTheme);
          e |= arrayOfDrawable[i2].getChangingConfigurations();
        }
      }
      y(paramTheme.getResources());
    }
  }
  
  public boolean c()
  {
    Drawable[] arrayOfDrawable;
    label84:
    try
    {
      if (v)
      {
        boolean bool = w;
        return bool;
      }
    }
    finally
    {
      break label84;
      e();
      v = true;
      int i1 = h;
      arrayOfDrawable = g;
      for (int i2 = 0; i2 < i1; i2++) {
        if (arrayOfDrawable[i2].getConstantState() == null)
        {
          w = false;
          return false;
        }
      }
      w = true;
      return true;
    }
  }
  
  public boolean canApplyTheme()
  {
    int i1 = h;
    Drawable[] arrayOfDrawable = g;
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = arrayOfDrawable[i2];
      if (localObject != null)
      {
        if (((Drawable)localObject).canApplyTheme()) {
          return true;
        }
      }
      else
      {
        localObject = (Drawable.ConstantState)f.get(i2);
        if ((localObject != null) && (((Drawable.ConstantState)localObject).canApplyTheme())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void d()
  {
    m = true;
    e();
    int i1 = h;
    Drawable[] arrayOfDrawable = g;
    o = -1;
    n = -1;
    int i2 = 0;
    q = 0;
    p = 0;
    while (i2 < i1)
    {
      Drawable localDrawable = arrayOfDrawable[i2];
      int i3 = localDrawable.getIntrinsicWidth();
      if (i3 > n) {
        n = i3;
      }
      i3 = localDrawable.getIntrinsicHeight();
      if (i3 > o) {
        o = i3;
      }
      i3 = localDrawable.getMinimumWidth();
      if (i3 > p) {
        p = i3;
      }
      i3 = localDrawable.getMinimumHeight();
      if (i3 > q) {
        q = i3;
      }
      i2++;
    }
  }
  
  public final void e()
  {
    Object localObject = f;
    if (localObject != null)
    {
      int i1 = ((SparseArray)localObject).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = f.keyAt(i2);
        localObject = (Drawable.ConstantState)f.valueAt(i2);
        g[i3] = s(((Drawable.ConstantState)localObject).newDrawable(b));
      }
      f = null;
    }
  }
  
  public final int f()
  {
    return g.length;
  }
  
  public final Drawable g(int paramInt)
  {
    Object localObject = g[paramInt];
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = f;
    if (localObject != null)
    {
      int i1 = ((SparseArray)localObject).indexOfKey(paramInt);
      if (i1 >= 0)
      {
        localObject = s(((Drawable.ConstantState)f.valueAt(i1)).newDrawable(b));
        g[paramInt] = localObject;
        f.removeAt(i1);
        if (f.size() == 0) {
          f = null;
        }
        return (Drawable)localObject;
      }
    }
    return null;
  }
  
  public int getChangingConfigurations()
  {
    return d | e;
  }
  
  public final int h()
  {
    return h;
  }
  
  public final int i()
  {
    if (!m) {
      d();
    }
    return o;
  }
  
  public final int j()
  {
    if (!m) {
      d();
    }
    return q;
  }
  
  public final int k()
  {
    if (!m) {
      d();
    }
    return p;
  }
  
  public final Rect l()
  {
    boolean bool = i;
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    Object localObject2 = k;
    if ((localObject2 == null) && (!j))
    {
      e();
      Rect localRect = new Rect();
      int i1 = h;
      Drawable[] arrayOfDrawable = g;
      int i2 = 0;
      while (i2 < i1)
      {
        Object localObject3 = localObject1;
        if (arrayOfDrawable[i2].getPadding(localRect))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Rect(0, 0, 0, 0);
          }
          int i3 = left;
          if (i3 > left) {
            left = i3;
          }
          i3 = top;
          if (i3 > top) {
            top = i3;
          }
          i3 = right;
          if (i3 > right) {
            right = i3;
          }
          i3 = bottom;
          localObject3 = localObject2;
          if (i3 > bottom)
          {
            bottom = i3;
            localObject3 = localObject2;
          }
        }
        i2++;
        localObject1 = localObject3;
      }
      j = true;
      k = ((Rect)localObject1);
      return (Rect)localObject1;
    }
    return (Rect)localObject2;
  }
  
  public final int m()
  {
    if (!m) {
      d();
    }
    return n;
  }
  
  public final int n()
  {
    if (r) {
      return s;
    }
    e();
    int i1 = h;
    Drawable[] arrayOfDrawable = g;
    int i2;
    if (i1 > 0) {
      i2 = arrayOfDrawable[0].getOpacity();
    } else {
      i2 = -2;
    }
    for (int i3 = 1; i3 < i1; i3++) {
      i2 = Drawable.resolveOpacity(i2, arrayOfDrawable[i3].getOpacity());
    }
    s = i2;
    r = true;
    return i2;
  }
  
  public void o(int paramInt1, int paramInt2)
  {
    Drawable[] arrayOfDrawable = new Drawable[paramInt2];
    System.arraycopy(g, 0, arrayOfDrawable, 0, paramInt1);
    g = arrayOfDrawable;
  }
  
  public void p()
  {
    r = false;
    t = false;
  }
  
  public final boolean q()
  {
    return l;
  }
  
  public abstract void r();
  
  public final Drawable s(Drawable paramDrawable)
  {
    paramDrawable.setLayoutDirection(z);
    paramDrawable = paramDrawable.mutate();
    paramDrawable.setCallback(a);
    return paramDrawable;
  }
  
  public final void t(boolean paramBoolean)
  {
    l = paramBoolean;
  }
  
  public final void u(int paramInt)
  {
    A = paramInt;
  }
  
  public final void v(int paramInt)
  {
    B = paramInt;
  }
  
  public final boolean w(int paramInt1, int paramInt2)
  {
    int i1 = h;
    Drawable[] arrayOfDrawable = g;
    int i2 = 0;
    boolean bool2;
    for (boolean bool1 = false; i2 < i1; bool1 = bool2)
    {
      Drawable localDrawable = arrayOfDrawable[i2];
      bool2 = bool1;
      if (localDrawable != null)
      {
        boolean bool3 = localDrawable.setLayoutDirection(paramInt1);
        bool2 = bool1;
        if (i2 == paramInt2) {
          bool2 = bool3;
        }
      }
      i2++;
    }
    z = paramInt1;
    return bool1;
  }
  
  public final void x(boolean paramBoolean)
  {
    i = paramBoolean;
  }
  
  public final void y(Resources paramResources)
  {
    if (paramResources != null)
    {
      b = paramResources;
      int i1 = b.f(paramResources, c);
      int i2 = c;
      c = i1;
      if (i2 != i1)
      {
        m = false;
        j = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     h.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */