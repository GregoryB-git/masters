package h;

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
import y.a;
import y.a.a;
import y.a.b;

public class b
  extends Drawable
  implements Drawable.Callback
{
  public c a;
  public Rect b;
  public Drawable c;
  public Drawable d;
  public int e = 255;
  public boolean f;
  public int o = -1;
  public boolean p;
  public a q;
  public long r;
  public long s;
  public b t;
  
  public final void a(boolean paramBoolean)
  {
    int i = 1;
    f = true;
    long l1 = SystemClock.uptimeMillis();
    Drawable localDrawable = c;
    long l2;
    if (localDrawable != null)
    {
      l2 = r;
      if (l2 == 0L) {
        break label100;
      }
      if (l2 <= l1)
      {
        localDrawable.setAlpha(e);
      }
      else
      {
        localDrawable.setAlpha((255 - (int)((l2 - l1) * 255L) / a.y) * e / 255);
        j = 1;
        break label103;
      }
    }
    r = 0L;
    label100:
    int j = 0;
    label103:
    localDrawable = d;
    if (localDrawable != null)
    {
      l2 = s;
      if (l2 == 0L) {
        break label192;
      }
      if (l2 <= l1)
      {
        localDrawable.setVisible(false, false);
        d = null;
      }
      else
      {
        localDrawable.setAlpha((int)((l2 - l1) * 255L) / a.z * e / 255);
        j = i;
        break label192;
      }
    }
    s = 0L;
    label192:
    if ((paramBoolean) && (j != 0)) {
      scheduleSelf(q, l1 + 16L);
    }
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    c localc = a;
    if (paramTheme != null)
    {
      localc.c();
      int i = h;
      Drawable[] arrayOfDrawable = g;
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = arrayOfDrawable[j];
        if ((localDrawable != null) && (a.a.b(localDrawable)))
        {
          a.a.a(arrayOfDrawable[j], paramTheme);
          e |= arrayOfDrawable[j].getChangingConfigurations();
        }
      }
      paramTheme = paramTheme.getResources();
      if (paramTheme != null)
      {
        b = paramTheme;
        i = getDisplayMetricsdensityDpi;
        j = i;
        if (i == 0) {
          j = 160;
        }
        i = c;
        c = j;
        if (i != j)
        {
          m = false;
          j = false;
        }
      }
    }
    else
    {
      localc.getClass();
    }
  }
  
  public c b()
  {
    throw null;
  }
  
  public final void c(Drawable paramDrawable)
  {
    if (t == null) {
      t = new b();
    }
    Object localObject1 = t;
    a = paramDrawable.getCallback();
    paramDrawable.setCallback((Drawable.Callback)localObject1);
    try
    {
      if ((a.y <= 0) && (f)) {
        paramDrawable.setAlpha(e);
      }
      localObject1 = a;
      if (C)
      {
        paramDrawable.setColorFilter(B);
      }
      else
      {
        if (F) {
          a.a.h(paramDrawable, D);
        }
        localObject1 = a;
        if (G) {
          a.a.i(paramDrawable, E);
        }
      }
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setDither(a.w);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      a.b.b(paramDrawable, a.b.a(this));
      paramDrawable.setAutoMirrored(a.A);
      localObject1 = b;
      if (localObject1 != null) {
        a.a.f(paramDrawable, left, top, right, bottom);
      }
      return;
    }
    finally
    {
      localObject1 = t;
      Object localObject2 = a;
      a = null;
      paramDrawable.setCallback((Drawable.Callback)localObject2);
    }
  }
  
  public final boolean canApplyTheme()
  {
    return a.canApplyTheme();
  }
  
  public final boolean d(int paramInt)
  {
    if (paramInt == o) {
      return false;
    }
    long l = SystemClock.uptimeMillis();
    Object localObject;
    if (a.z > 0)
    {
      localObject = d;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
      localObject = c;
      if (localObject != null)
      {
        d = ((Drawable)localObject);
        s = (a.z + l);
      }
      else
      {
        d = null;
        s = 0L;
      }
    }
    else
    {
      localObject = c;
      if (localObject != null) {
        ((Drawable)localObject).setVisible(false, false);
      }
    }
    if (paramInt >= 0)
    {
      localObject = a;
      if (paramInt < h)
      {
        localObject = ((c)localObject).d(paramInt);
        c = ((Drawable)localObject);
        o = paramInt;
        if (localObject == null) {
          break label191;
        }
        paramInt = a.y;
        if (paramInt > 0) {
          r = (l + paramInt);
        }
        c((Drawable)localObject);
        break label191;
      }
    }
    c = null;
    o = -1;
    label191:
    if ((r != 0L) || (s != 0L))
    {
      localObject = q;
      if (localObject == null) {
        q = new a((d)this);
      } else {
        unscheduleSelf((Runnable)localObject);
      }
      a(true);
    }
    invalidateSelf();
    return true;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = c;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
    localDrawable = d;
    if (localDrawable != null) {
      localDrawable.draw(paramCanvas);
    }
  }
  
  public void e(c paramc)
  {
    throw null;
  }
  
  public final int getAlpha()
  {
    return e;
  }
  
  public final int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    c localc = a;
    int j = d;
    return i | e | j;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    c localc = a;
    boolean bool1 = u;
    boolean bool2 = true;
    if (bool1)
    {
      bool2 = v;
    }
    else
    {
      localc.c();
      u = true;
      int i = h;
      Drawable[] arrayOfDrawable = g;
      for (int j = 0; j < i; j++) {
        if (arrayOfDrawable[j].getConstantState() == null)
        {
          v = false;
          bool2 = false;
          break label87;
        }
      }
      v = true;
    }
    label87:
    if (bool2)
    {
      a.d = getChangingConfigurations();
      return a;
    }
    return null;
  }
  
  public final Drawable getCurrent()
  {
    return c;
  }
  
  public final void getHotspotBounds(Rect paramRect)
  {
    Rect localRect = b;
    if (localRect != null) {
      paramRect.set(localRect);
    } else {
      super.getHotspotBounds(paramRect);
    }
  }
  
  public final int getIntrinsicHeight()
  {
    Object localObject = a;
    if (l)
    {
      if (!m) {
        ((c)localObject).b();
      }
      return o;
    }
    localObject = c;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getIntrinsicHeight();
    } else {
      i = -1;
    }
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    Object localObject = a;
    if (l)
    {
      if (!m) {
        ((c)localObject).b();
      }
      return n;
    }
    localObject = c;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getIntrinsicWidth();
    } else {
      i = -1;
    }
    return i;
  }
  
  public final int getMinimumHeight()
  {
    Object localObject = a;
    if (l)
    {
      if (!m) {
        ((c)localObject).b();
      }
      return q;
    }
    localObject = c;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getMinimumHeight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final int getMinimumWidth()
  {
    Object localObject = a;
    if (l)
    {
      if (!m) {
        ((c)localObject).b();
      }
      return p;
    }
    localObject = c;
    int i;
    if (localObject != null) {
      i = ((Drawable)localObject).getMinimumWidth();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final int getOpacity()
  {
    Object localObject = c;
    int i = -2;
    int j = i;
    if (localObject != null) {
      if (!((Drawable)localObject).isVisible())
      {
        j = i;
      }
      else
      {
        localObject = a;
        if (r)
        {
          j = s;
        }
        else
        {
          ((c)localObject).c();
          int k = h;
          Drawable[] arrayOfDrawable = g;
          j = i;
          if (k > 0) {
            j = arrayOfDrawable[0].getOpacity();
          }
          for (i = 1; i < k; i++) {
            j = Drawable.resolveOpacity(j, arrayOfDrawable[i].getOpacity());
          }
          s = j;
          r = true;
        }
      }
    }
    return j;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    Drawable localDrawable = c;
    if (localDrawable != null) {
      localDrawable.getOutline(paramOutline);
    }
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    c localc = a;
    boolean bool = i;
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    if (bool)
    {
      localObject2 = localObject1;
    }
    else
    {
      localObject1 = k;
      if ((localObject1 == null) && (!j))
      {
        localc.c();
        Rect localRect = new Rect();
        int j = h;
        Drawable[] arrayOfDrawable = g;
        k = 0;
        while (k < j)
        {
          Object localObject3 = localObject2;
          if (arrayOfDrawable[k].getPadding(localRect))
          {
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = new Rect(0, 0, 0, 0);
            }
            int m = left;
            if (m > left) {
              left = m;
            }
            m = top;
            if (m > top) {
              top = m;
            }
            m = right;
            if (m > right) {
              right = m;
            }
            m = bottom;
            localObject3 = localObject1;
            if (m > bottom)
            {
              bottom = m;
              localObject3 = localObject1;
            }
          }
          k++;
          localObject2 = localObject3;
        }
        j = true;
        k = ((Rect)localObject2);
      }
      else
      {
        localObject2 = localObject1;
      }
    }
    if (localObject2 != null)
    {
      paramRect.set((Rect)localObject2);
      if ((left | top | bottom | right) != 0) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else
    {
      localObject2 = c;
      if (localObject2 != null) {
        bool = ((Drawable)localObject2).getPadding(paramRect);
      } else {
        bool = super.getPadding(paramRect);
      }
    }
    int k = i;
    if (a.A)
    {
      k = i;
      if (a.b.a(this) == 1) {
        k = 1;
      }
    }
    if (k != 0)
    {
      k = left;
      left = right;
      right = k;
    }
    return bool;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    c localc = a;
    if (localc != null)
    {
      r = false;
      t = false;
    }
    if ((paramDrawable == c) && (getCallback() != null)) {
      getCallback().invalidateDrawable(this);
    }
  }
  
  public final boolean isAutoMirrored()
  {
    return a.A;
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = d;
    int i = 1;
    int j;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      d = null;
      j = 1;
    }
    else
    {
      j = 0;
    }
    localDrawable = c;
    if (localDrawable != null)
    {
      localDrawable.jumpToCurrentState();
      if (f) {
        c.setAlpha(e);
      }
    }
    if (s != 0L)
    {
      s = 0L;
      j = 1;
    }
    if (r != 0L)
    {
      r = 0L;
      j = i;
    }
    if (j != 0) {
      invalidateSelf();
    }
  }
  
  public Drawable mutate()
  {
    if ((!p) && (super.mutate() == this))
    {
      c localc = b();
      localc.e();
      e(localc);
      p = true;
    }
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = d;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
    localDrawable = c;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public final boolean onLayoutDirectionChanged(int paramInt)
  {
    c localc = a;
    int i = o;
    int j = h;
    Drawable[] arrayOfDrawable = g;
    int k = 0;
    boolean bool2;
    for (boolean bool1 = false; k < j; bool1 = bool2)
    {
      Drawable localDrawable = arrayOfDrawable[k];
      bool2 = bool1;
      if (localDrawable != null)
      {
        boolean bool3 = a.b.b(localDrawable, paramInt);
        bool2 = bool1;
        if (k == i) {
          bool2 = bool3;
        }
      }
      k++;
    }
    x = paramInt;
    return bool1;
  }
  
  public final boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = d;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    localDrawable = c;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return false;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Drawable localDrawable = d;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    localDrawable = c;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if ((paramDrawable == c) && (getCallback() != null)) {
      getCallback().scheduleDrawable(this, paramRunnable, paramLong);
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    if ((!f) || (e != paramInt))
    {
      f = true;
      e = paramInt;
      Drawable localDrawable = c;
      if (localDrawable != null) {
        if (r == 0L) {
          localDrawable.setAlpha(paramInt);
        } else {
          a(false);
        }
      }
    }
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = a;
    if (A != paramBoolean)
    {
      A = paramBoolean;
      localObject = c;
      if (localObject != null) {
        ((Drawable)localObject).setAutoMirrored(paramBoolean);
      }
    }
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = a;
    C = true;
    if (B != paramColorFilter)
    {
      B = paramColorFilter;
      localObject = c;
      if (localObject != null) {
        ((Drawable)localObject).setColorFilter(paramColorFilter);
      }
    }
  }
  
  public final void setDither(boolean paramBoolean)
  {
    Object localObject = a;
    if (w != paramBoolean)
    {
      w = paramBoolean;
      localObject = c;
      if (localObject != null) {
        ((Drawable)localObject).setDither(paramBoolean);
      }
    }
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = c;
    if (localDrawable != null) {
      a.a.e(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = b;
    if (localObject == null) {
      b = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      ((Rect)localObject).set(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    localObject = c;
    if (localObject != null) {
      a.a.f((Drawable)localObject, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    c localc = a;
    F = true;
    if (D != paramColorStateList)
    {
      D = paramColorStateList;
      a.b(c, paramColorStateList);
    }
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    c localc = a;
    G = true;
    if (E != paramMode)
    {
      E = paramMode;
      a.c(c, paramMode);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable = d;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    localDrawable = c;
    if (localDrawable != null) {
      localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return bool;
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if ((paramDrawable == c) && (getCallback() != null)) {
      getCallback().unscheduleDrawable(this, paramRunnable);
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      a(true);
      invalidateSelf();
    }
  }
  
  public static final class b
    implements Drawable.Callback
  {
    public Drawable.Callback a;
    
    public final void invalidateDrawable(Drawable paramDrawable) {}
    
    public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
    {
      Drawable.Callback localCallback = a;
      if (localCallback != null) {
        localCallback.scheduleDrawable(paramDrawable, paramRunnable, paramLong);
      }
    }
    
    public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
    {
      Drawable.Callback localCallback = a;
      if (localCallback != null) {
        localCallback.unscheduleDrawable(paramDrawable, paramRunnable);
      }
    }
  }
  
  public static abstract class c
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
    
    public c(c paramc, b paramb, Resources paramResources)
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
}

/* Location:
 * Qualified Name:     h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */