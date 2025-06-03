package e0;

import aa.u;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import d2.k;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public final class s0
{
  public static final s0 b;
  public final k a;
  
  static
  {
    s0 locals0;
    if (Build.VERSION.SDK_INT >= 30) {
      locals0 = j.l;
    } else {
      locals0 = k.b;
    }
    b = locals0;
  }
  
  public s0()
  {
    a = new k(this);
  }
  
  public s0(WindowInsets paramWindowInsets)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      paramWindowInsets = new j(this, paramWindowInsets);
    }
    for (;;)
    {
      a = paramWindowInsets;
      break;
      if (i >= 29) {
        paramWindowInsets = new i(this, paramWindowInsets);
      } else if (i >= 28) {
        paramWindowInsets = new h(this, paramWindowInsets);
      } else {
        paramWindowInsets = new g(this, paramWindowInsets);
      }
    }
  }
  
  public static x.b a(x.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(0, a - paramInt1);
    int j = Math.max(0, b - paramInt2);
    int k = Math.max(0, c - paramInt3);
    int m = Math.max(0, d - paramInt4);
    if ((i == paramInt1) && (j == paramInt2) && (k == paramInt3) && (m == paramInt4)) {
      return paramb;
    }
    return x.b.a(i, j, k, m);
  }
  
  public static s0 c(WindowInsets paramWindowInsets, View paramView)
  {
    paramWindowInsets.getClass();
    paramWindowInsets = new s0(paramWindowInsets);
    if ((paramView != null) && (paramView.isAttachedToWindow()))
    {
      Object localObject = d0.a;
      localObject = d0.e.a(paramView);
      a.l((s0)localObject);
      paramView = paramView.getRootView();
      a.d(paramView);
    }
    return paramWindowInsets;
  }
  
  public final WindowInsets b()
  {
    Object localObject = a;
    if ((localObject instanceof f)) {
      localObject = c;
    } else {
      localObject = null;
    }
    return (WindowInsets)localObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s0)) {
      return false;
    }
    paramObject = (s0)paramObject;
    return Objects.equals(a, a);
  }
  
  public final int hashCode()
  {
    k localk = a;
    int i;
    if (localk == null) {
      i = 0;
    } else {
      i = localk.hashCode();
    }
    return i;
  }
  
  public static final class a
  {
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;
    
    static
    {
      try
      {
        Object localObject1 = View.class.getDeclaredField("mAttachInfo");
        a = (Field)localObject1;
        ((AccessibleObject)localObject1).setAccessible(true);
        localObject1 = Class.forName("android.view.View$AttachInfo");
        localObject2 = ((Class)localObject1).getDeclaredField("mStableInsets");
        b = (Field)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject1 = ((Class)localObject1).getDeclaredField("mContentInsets");
        c = (Field)localObject1;
        ((AccessibleObject)localObject1).setAccessible(true);
        d = true;
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        Object localObject2 = f.l("Failed to get visible insets from AttachInfo ");
        ((StringBuilder)localObject2).append(localReflectiveOperationException.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject2).toString(), localReflectiveOperationException);
      }
    }
  }
  
  public static final class b
    extends s0.e
  {
    public static Field c;
    public static boolean d = false;
    public static Constructor<WindowInsets> e;
    public static boolean f = false;
    public WindowInsets a;
    public x.b b;
    
    public b()
    {
      a = e();
    }
    
    public b(s0 params0)
    {
      super();
      a = params0.b();
    }
    
    private static WindowInsets e()
    {
      if (!d)
      {
        try
        {
          c = WindowInsets.class.getDeclaredField("CONSUMED");
        }
        catch (ReflectiveOperationException localReflectiveOperationException1)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
        }
        d = true;
      }
      Object localObject1 = c;
      if (localObject1 != null) {
        try
        {
          localObject1 = (WindowInsets)((Field)localObject1).get(null);
          if (localObject1 != null)
          {
            localObject1 = new WindowInsets((WindowInsets)localObject1);
            return (WindowInsets)localObject1;
          }
        }
        catch (ReflectiveOperationException localReflectiveOperationException2)
        {
          Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
        }
      }
      if (!f)
      {
        try
        {
          e = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        }
        catch (ReflectiveOperationException localReflectiveOperationException3)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
        }
        f = true;
      }
      Object localObject2 = e;
      if (localObject2 != null) {
        try
        {
          Rect localRect = new android/graphics/Rect;
          localRect.<init>();
          localObject2 = (WindowInsets)((Constructor)localObject2).newInstance(new Object[] { localRect });
          return (WindowInsets)localObject2;
        }
        catch (ReflectiveOperationException localReflectiveOperationException4)
        {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
        }
      }
      return null;
    }
    
    public s0 b()
    {
      a();
      s0 locals0 = s0.c(a, null);
      a.k(null);
      x.b localb = b;
      a.m(localb);
      return locals0;
    }
    
    public void c(x.b paramb)
    {
      b = paramb;
    }
    
    public void d(x.b paramb)
    {
      WindowInsets localWindowInsets = a;
      if (localWindowInsets != null) {
        a = localWindowInsets.replaceSystemWindowInsets(a, b, c, d);
      }
    }
  }
  
  public static class c
    extends s0.e
  {
    public final WindowInsets.Builder a;
    
    public c()
    {
      a = new WindowInsets.Builder();
    }
    
    public c(s0 params0)
    {
      super();
      params0 = params0.b();
      WindowInsets.Builder localBuilder = new android/view/WindowInsets$Builder;
      if (params0 != null) {
        localBuilder.<init>(params0);
      } else {
        localBuilder.<init>();
      }
      a = localBuilder;
    }
    
    public s0 b()
    {
      a();
      s0 locals0 = s0.c(a.build(), null);
      a.k(null);
      return locals0;
    }
    
    public void c(x.b paramb)
    {
      a.setStableInsets(paramb.b());
    }
    
    public void d(x.b paramb)
    {
      a.setSystemWindowInsets(paramb.b());
    }
  }
  
  public static final class d
    extends s0.c
  {
    public d() {}
    
    public d(s0 params0)
    {
      super();
    }
  }
  
  public static class e
  {
    public e()
    {
      this(new s0());
    }
    
    public e(s0 params0) {}
    
    public final void a() {}
    
    public s0 b()
    {
      throw null;
    }
    
    public void c(x.b paramb)
    {
      throw null;
    }
    
    public void d(x.b paramb)
    {
      throw null;
    }
  }
  
  public static class f
    extends s0.k
  {
    public static boolean f = false;
    public static Method g;
    public static Class<?> h;
    public static Field i;
    public static Field j;
    public final WindowInsets c;
    public x.b d = null;
    public x.b e;
    
    public f(s0 params0, WindowInsets paramWindowInsets)
    {
      super();
      c = paramWindowInsets;
    }
    
    private x.b n(View paramView)
    {
      if (Build.VERSION.SDK_INT < 30)
      {
        if (!f) {
          o();
        }
        Object localObject1 = g;
        Object localObject2 = null;
        if ((localObject1 != null) && (h != null) && (i != null)) {
          try
          {
            paramView = ((Method)localObject1).invoke(paramView, new Object[0]);
            if (paramView == null)
            {
              paramView = new java/lang/NullPointerException;
              paramView.<init>();
              Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", paramView);
              return null;
            }
            paramView = j.get(paramView);
            localObject1 = (Rect)i.get(paramView);
            paramView = (View)localObject2;
            if (localObject1 != null) {
              paramView = x.b.a(left, top, right, bottom);
            }
            return paramView;
          }
          catch (ReflectiveOperationException localReflectiveOperationException)
          {
            paramView = f.l("Failed to get visible insets. (Reflection error). ");
            paramView.append(localReflectiveOperationException.getMessage());
            Log.e("WindowInsetsCompat", paramView.toString(), localReflectiveOperationException);
          }
        }
        return null;
      }
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    private static void o()
    {
      try
      {
        g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
        Class localClass = Class.forName("android.view.View$AttachInfo");
        h = localClass;
        i = localClass.getDeclaredField("mVisibleInsets");
        j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
        i.setAccessible(true);
        j.setAccessible(true);
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        StringBuilder localStringBuilder = f.l("Failed to get visible insets. (Reflection error). ");
        localStringBuilder.append(localReflectiveOperationException.getMessage());
        Log.e("WindowInsetsCompat", localStringBuilder.toString(), localReflectiveOperationException);
      }
      f = true;
    }
    
    public void d(View paramView)
    {
      x.b localb = n(paramView);
      paramView = localb;
      if (localb == null) {
        paramView = x.b.e;
      }
      p(paramView);
    }
    
    public boolean equals(Object paramObject)
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (f)paramObject;
      return Objects.equals(e, e);
    }
    
    public final x.b g()
    {
      if (d == null) {
        d = x.b.a(c.getSystemWindowInsetLeft(), c.getSystemWindowInsetTop(), c.getSystemWindowInsetRight(), c.getSystemWindowInsetBottom());
      }
      return d;
    }
    
    public s0 h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      Object localObject = s0.c(c, null);
      int k = Build.VERSION.SDK_INT;
      if (k >= 30) {
        localObject = new s0.d((s0)localObject);
      } else if (k >= 29) {
        localObject = new s0.c((s0)localObject);
      } else {
        localObject = new s0.b((s0)localObject);
      }
      ((s0.e)localObject).d(s0.a(g(), paramInt1, paramInt2, paramInt3, paramInt4));
      ((s0.e)localObject).c(s0.a(f(), paramInt1, paramInt2, paramInt3, paramInt4));
      return ((s0.e)localObject).b();
    }
    
    public boolean j()
    {
      return c.isRound();
    }
    
    public void k(x.b[] paramArrayOfb) {}
    
    public void l(s0 params0) {}
    
    public void p(x.b paramb)
    {
      e = paramb;
    }
  }
  
  public static class g
    extends s0.f
  {
    public x.b k = null;
    
    public g(s0 params0, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public s0 b()
    {
      return s0.c(c.consumeStableInsets(), null);
    }
    
    public s0 c()
    {
      return s0.c(c.consumeSystemWindowInsets(), null);
    }
    
    public final x.b f()
    {
      if (k == null) {
        k = x.b.a(c.getStableInsetLeft(), c.getStableInsetTop(), c.getStableInsetRight(), c.getStableInsetBottom());
      }
      return k;
    }
    
    public boolean i()
    {
      return c.isConsumed();
    }
    
    public void m(x.b paramb)
    {
      k = paramb;
    }
  }
  
  public static class h
    extends s0.g
  {
    public h(s0 params0, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public s0 a()
    {
      return s0.c(android.support.v4.media.session.b.f(c), null);
    }
    
    public h e()
    {
      Object localObject = k.d(c);
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = new h((DisplayCutout)localObject);
      }
      return (h)localObject;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof h)) {
        return false;
      }
      paramObject = (h)paramObject;
      if ((!Objects.equals(c, c)) || (!Objects.equals(e, e))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return c.hashCode();
    }
  }
  
  public static class i
    extends s0.h
  {
    public i(s0 params0, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public s0 h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return s0.c(u.d(c, paramInt1, paramInt2, paramInt3, paramInt4), null);
    }
    
    public void m(x.b paramb) {}
  }
  
  public static final class j
    extends s0.i
  {
    public static final s0 l = s0.c(WindowInsets.CONSUMED, null);
    
    public j(s0 params0, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public final void d(View paramView) {}
  }
  
  public static class k
  {
    public static final s0 b;
    public final s0 a;
    
    static
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject;
      if (i >= 30) {
        localObject = new s0.d();
      } else if (i >= 29) {
        localObject = new s0.c();
      } else {
        localObject = new s0.b();
      }
      b = ba.a().a.b().a.c();
    }
    
    public k(s0 params0)
    {
      a = params0;
    }
    
    public s0 a()
    {
      return a;
    }
    
    public s0 b()
    {
      return a;
    }
    
    public s0 c()
    {
      return a;
    }
    
    public void d(View paramView) {}
    
    public h e()
    {
      return null;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof k)) {
        return false;
      }
      paramObject = (k)paramObject;
      if ((j() != ((k)paramObject).j()) || (i() != ((k)paramObject).i()) || (!Objects.equals(g(), ((k)paramObject).g())) || (!Objects.equals(f(), ((k)paramObject).f())) || (!Objects.equals(e(), ((k)paramObject).e()))) {
        bool = false;
      }
      return bool;
    }
    
    public x.b f()
    {
      return x.b.e;
    }
    
    public x.b g()
    {
      return x.b.e;
    }
    
    public s0 h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return b;
    }
    
    public int hashCode()
    {
      return Objects.hash(new Object[] { Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e() });
    }
    
    public boolean i()
    {
      return false;
    }
    
    public boolean j()
    {
      return false;
    }
    
    public void k(x.b[] paramArrayOfb) {}
    
    public void l(s0 params0) {}
    
    public void m(x.b paramb) {}
  }
}

/* Location:
 * Qualified Name:     e0.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */