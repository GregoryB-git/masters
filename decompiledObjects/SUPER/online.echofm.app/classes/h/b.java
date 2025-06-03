package h;

import B.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;

public abstract class b
  extends Drawable
  implements Drawable.Callback
{
  public c o;
  public Rect p;
  public Drawable q;
  public Drawable r;
  public int s = 255;
  public boolean t;
  public int u = -1;
  public boolean v;
  public Runnable w;
  public long x;
  public long y;
  public b z;
  
  public static int f(Resources paramResources, int paramInt)
  {
    if (paramResources != null) {
      paramInt = getDisplayMetricsdensityDpi;
    }
    int i = paramInt;
    if (paramInt == 0) {
      i = 160;
    }
    return i;
  }
  
  public void a(boolean paramBoolean)
  {
    int i = 1;
    t = true;
    long l1 = SystemClock.uptimeMillis();
    Drawable localDrawable = q;
    long l2;
    if (localDrawable != null)
    {
      l2 = x;
      if (l2 == 0L) {
        break label100;
      }
      if (l2 <= l1) {
        localDrawable.setAlpha(s);
      }
    }
    else
    {
      x = 0L;
      break label100;
    }
    localDrawable.setAlpha((255 - (int)((l2 - l1) * 255L) / o.A) * s / 255);
    int j = 1;
    break label103;
    label100:
    j = 0;
    label103:
    localDrawable = r;
    if (localDrawable != null)
    {
      l2 = y;
      if (l2 == 0L) {
        break label192;
      }
      if (l2 <= l1)
      {
        localDrawable.setVisible(false, false);
        r = null;
      }
    }
    else
    {
      y = 0L;
      break label192;
    }
    localDrawable.setAlpha((int)((l2 - l1) * 255L) / o.B * s / 255);
    j = i;
    label192:
    if ((paramBoolean) && (j != 0)) {
      scheduleSelf(w, l1 + 16L);
    }
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    o.b(paramTheme);
  }
  
  public abstract c b();
  
  public int c()
  {
    return u;
  }
  
  public boolean canApplyTheme()
  {
    return o.canApplyTheme();
  }
  
  public final void d(Drawable paramDrawable)
  {
    if (z == null) {
      z = new b();
    }
    paramDrawable.setCallback(z.b(paramDrawable.getCallback()));
    try
    {
      if ((o.A <= 0) && (t)) {
        paramDrawable.setAlpha(s);
      }
    }
    finally
    {
      break label231;
    }
    Object localObject2 = o;
    if (E)
    {
      paramDrawable.setColorFilter(D);
    }
    else
    {
      if (H) {
        a.m(paramDrawable, F);
      }
      localObject2 = o;
      if (I) {
        a.n(paramDrawable, G);
      }
    }
    paramDrawable.setVisible(isVisible(), true);
    paramDrawable.setDither(o.x);
    paramDrawable.setState(getState());
    paramDrawable.setLevel(getLevel());
    paramDrawable.setBounds(getBounds());
    paramDrawable.setLayoutDirection(getLayoutDirection());
    paramDrawable.setAutoMirrored(o.C);
    localObject2 = p;
    if (localObject2 != null) {
      paramDrawable.setHotspotBounds(left, top, right, bottom);
    }
    paramDrawable.setCallback(z.a());
    return;
    label231:
    paramDrawable.setCallback(z.a());
    throw ((Throwable)localObject2);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = q;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = r;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
  }
  
  public final boolean e()
  {
    boolean bool;
    if (isAutoMirrored())
    {
      int i = a.e(this);
      bool = true;
      if (i == 1) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public boolean g(int paramInt)
  {
    if (paramInt == u) {
      return false;
    }
    long l = SystemClock.uptimeMillis();
    Object localObject;
    if (o.B > 0)
    {
      localObject = r;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
      localObject = q;
      if (localObject != null)
      {
        r = ((Drawable)localObject);
        y = (o.B + l);
      }
      else
      {
        r = null;
        y = 0L;
      }
    }
    else
    {
      localObject = q;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
    }
    if (paramInt >= 0)
    {
      localObject = o;
      if (paramInt < h)
      {
        localObject = ((c)localObject).g(paramInt);
        q = ((Drawable)localObject);
        u = paramInt;
        if (localObject == null) {
          break label191;
        }
        paramInt = o.A;
        if (paramInt > 0) {
          x = (l + paramInt);
        }
        d((Drawable)localObject);
        break label191;
      }
    }
    q = null;
    u = -1;
    label191:
    if ((x != 0L) || (y != 0L))
    {
      localObject = w;
      if (localObject == null) {
        w = new a();
      } else {
        unscheduleSelf((Runnable)localObject);
      }
      a(true);
    }
    invalidateSelf();
    return true;
  }
  
  public int getAlpha()
  {
    return s;
  }
  
  public int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | o.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (o.c())
    {
      o.d = getChangingConfigurations();
      return o;
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return q;
  }
  
  public void getHotspotBounds(Rect paramRect)
  {
    Rect localRect = p;
    if (localRect != null) {
      paramRect.set(localRect);
    } else {
      super.getHotspotBounds(paramRect);
    }
  }
  
  public int getIntrinsicHeight()
  {
    if (o.q()) {
      return o.i();
    }
    Drawable localDrawable = q;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicHeight();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getIntrinsicWidth()
  {
    if (o.q()) {
      return o.m();
    }
    Drawable localDrawable = q;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicWidth();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getMinimumHeight()
  {
    if (o.q()) {
      return o.j();
    }
    Drawable localDrawable = q;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getMinimumHeight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getMinimumWidth()
  {
    if (o.q()) {
      return o.k();
    }
    Drawable localDrawable = q;
    int i;
    if (localDrawable != null) {
      i = localDrawable.getMinimumWidth();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = q;
    int i;
    if ((localDrawable != null) && (localDrawable.isVisible())) {
      i = o.n();
    } else {
      i = -2;
    }
    return i;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Drawable localDrawable = q;
    if (localDrawable != null) {
      localDrawable.getOutline(paramOutline);
    }
  }
  
  public boolean getPadding(Rect paramRect)
  {
    Object localObject = o.l();
    int i;
    boolean bool;
    if (localObject != null)
    {
      paramRect.set((Rect)localObject);
      i = left;
      int j = top;
      int k = bottom;
      if ((right | i | j | k) != 0) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else
    {
      localObject = q;
      if (localObject != null) {
        bool = ((Drawable)localObject).getPadding(paramRect);
      } else {
        bool = super.getPadding(paramRect);
      }
    }
    if (e())
    {
      i = left;
      left = right;
      right = i;
    }
    return bool;
  }
  
  public void h(c paramc)
  {
    o = paramc;
    int i = u;
    if (i >= 0)
    {
      paramc = paramc.g(i);
      q = paramc;
      if (paramc != null) {
        d(paramc);
      }
    }
    r = null;
  }
  
  public final void i(Resources paramResources)
  {
    o.y(paramResources);
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    c localc = o;
    if (localc != null) {
      localc.p();
    }
    if ((paramDrawable == q) && (getCallback() != null)) {
      getCallback().invalidateDrawable(this);
    }
  }
  
  public boolean isAutoMirrored()
  {
    return o.C;
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = r;
    int i = 1;
    int j;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      r = null;
      j = 1;
    }
    else
    {
      j = 0;
    }
    localDrawable = q;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      if (t) {
        q.setAlpha(s);
      }
    }
    if (y != 0L)
    {
      y = 0L;
      j = i;
    }
    if (x != 0L) {
      x = 0L;
    } else if (j == 0) {
      return;
    }
    invalidateSelf();
  }
  
  public Drawable mutate()
  {
    if ((!v) && (super.mutate() == this))
    {
      c localc = b();
      localc.r();
      h(localc);
      v = true;
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = r;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
    localDrawable = q;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onLayoutDirectionChanged(int paramInt)
  {
    return o.w(paramInt, c());
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = r;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    localDrawable = q;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return false;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if ((paramDrawable == q) && (getCallback() != null)) {
      getCallback().scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    if ((!t) || (s != paramInt))
    {
      t = true;
      s = paramInt;
      Drawable localDrawable = q;
      if (localDrawable != null) {
        if (x == 0L) {
          localDrawable.setAlpha(paramInt);
        } else {
          a(false);
        }
      }
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = o;
    if (C != paramBoolean)
    {
      C = paramBoolean;
      localObject = q;
      if (localObject != null) {
        a.i((Drawable)localObject, paramBoolean);
      }
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = o;
    E = true;
    if (D != paramColorFilter)
    {
      D = paramColorFilter;
      localObject = q;
      if (localObject != null) {
        ((Drawable)localObject).setColorFilter(paramColorFilter);
      }
    }
  }
  
  public void setDither(boolean paramBoolean)
  {
    Object localObject = o;
    if (x != paramBoolean)
    {
      x = paramBoolean;
      localObject = q;
      if (localObject != null) {
        ((Drawable)localObject).setDither(paramBoolean);
      }
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = q;
    if (localDrawable != null) {
      a.j(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = p;
    if (localObject == null) {
      p = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      ((Rect)localObject).set(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    localObject = q;
    if (localObject != null) {
      a.k((Drawable)localObject, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    c localc = o;
    H = true;
    if (F != paramColorStateList)
    {
      F = paramColorStateList;
      a.m(q, paramColorStateList);
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    c localc = o;
    I = true;
    if (G != paramMode)
    {
      G = paramMode;
      a.n(q, paramMode);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable = r;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    localDrawable = q;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if ((paramDrawable == q) && (getCallback() != null)) {
      getCallback().unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      a(true);
      invalidateSelf();
    }
  }
  
  public static class b
    implements Drawable.Callback
  {
    public Drawable.Callback o;
    
    public Drawable.Callback a()
    {
      Drawable.Callback localCallback = o;
      o = null;
      return localCallback;
    }
    
    public b b(Drawable.Callback paramCallback)
    {
      o = paramCallback;
      return this;
    }
    
    public void invalidateDrawable(Drawable paramDrawable) {}
    
    public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
    {
      Drawable.Callback localCallback = o;
      if (localCallback != null) {
        localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
      }
    }
    
    public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
    {
      Drawable.Callback localCallback = o;
      if (localCallback != null) {
        localCallback.unscheduleDrawable(paramDrawable, paramRunnable);
      }
    }
  }
  
  public static abstract class c
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
    
    public c(c paramc, b paramb, Resources paramResources)
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
}

/* Location:
 * Qualified Name:     h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */