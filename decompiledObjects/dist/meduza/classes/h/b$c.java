package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import y.a.a;
import y.a.b;

public abstract class b$c
  extends Drawable.ConstantState
{
  public boolean A;
  public ColorFilter B;
  public boolean C;
  public ColorStateList D;
  public PorterDuff.Mode E;
  public boolean F;
  public boolean G;
  public final b a;
  public Resources b;
  public int c;
  public int d;
  public int e;
  public SparseArray<Drawable.ConstantState> f;
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
  public int x;
  public int y;
  public int z;
  
  public b$c(c paramc, b paramb, Resources paramResources)
  {
    int i1 = 0;
    i = false;
    l = false;
    w = true;
    y = 0;
    z = 0;
    a = paramb;
    Object localObject = null;
    if (paramResources != null) {
      paramb = paramResources;
    } else if (paramc != null) {
      paramb = b;
    } else {
      paramb = null;
    }
    b = paramb;
    int i2;
    if (paramc != null) {
      i2 = c;
    } else {
      i2 = 0;
    }
    int i3 = b.u;
    if (paramResources != null) {
      i2 = getDisplayMetricsdensityDpi;
    }
    i3 = i2;
    if (i2 == 0) {
      i3 = 160;
    }
    c = i3;
    if (paramc != null)
    {
      d = d;
      e = e;
      u = true;
      v = true;
      i = i;
      l = l;
      w = w;
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
      if (c == i3)
      {
        if (j)
        {
          paramb = (b)localObject;
          if (k != null) {
            paramb = new Rect(k);
          }
          k = paramb;
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
      if (t) {
        t = true;
      }
      paramb = g;
      g = new Drawable[paramb.length];
      h = h;
      paramc = f;
      if (paramc != null) {
        paramc = paramc.clone();
      } else {
        paramc = new SparseArray(h);
      }
      f = paramc;
      i3 = h;
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
    if (i1 >= g.length)
    {
      i2 = i1 + 10;
      d.a locala = (d.a)this;
      Object localObject = new Drawable[i2];
      Drawable[] arrayOfDrawable = g;
      if (arrayOfDrawable != null) {
        System.arraycopy(arrayOfDrawable, 0, localObject, 0, i1);
      }
      g = ((Drawable[])localObject);
      localObject = new int[i2][];
      System.arraycopy(H, 0, localObject, 0, i1);
      H = ((int[][])localObject);
    }
    paramDrawable.mutate();
    paramDrawable.setVisible(false, true);
    paramDrawable.setCallback(a);
    g[i1] = paramDrawable;
    h += 1;
    int i2 = e;
    e = (paramDrawable.getChangingConfigurations() | i2);
    r = false;
    t = false;
    k = null;
    j = false;
    m = false;
    u = false;
    return i1;
  }
  
  public final void b()
  {
    m = true;
    c();
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
  
  public final void c()
  {
    Object localObject1 = f;
    if (localObject1 != null)
    {
      int i1 = ((SparseArray)localObject1).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = f.keyAt(i2);
        Object localObject2 = (Drawable.ConstantState)f.valueAt(i2);
        localObject1 = g;
        localObject2 = ((Drawable.ConstantState)localObject2).newDrawable(b);
        a.b.b((Drawable)localObject2, x);
        localObject2 = ((Drawable)localObject2).mutate();
        ((Drawable)localObject2).setCallback(a);
        localObject1[i3] = localObject2;
      }
      f = null;
    }
  }
  
  public final boolean canApplyTheme()
  {
    int i1 = h;
    Drawable[] arrayOfDrawable = g;
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = arrayOfDrawable[i2];
      if (localObject != null)
      {
        if (a.a.b((Drawable)localObject)) {
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
  
  public final Drawable d(int paramInt)
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
        localObject = ((Drawable.ConstantState)f.valueAt(i1)).newDrawable(b);
        a.b.b((Drawable)localObject, x);
        localObject = ((Drawable)localObject).mutate();
        ((Drawable)localObject).setCallback(a);
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
  
  public abstract void e();
  
  public final int getChangingConfigurations()
  {
    return d | e;
  }
}

/* Location:
 * Qualified Name:     h.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */