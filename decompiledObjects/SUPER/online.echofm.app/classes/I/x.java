package I;

import A.f;
import H.c;
import H.e;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import androidx.annotation.NonNull;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class x
{
  public static final x b;
  public final l a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 30) {}
    for (x localx = k.q;; localx = l.b)
    {
      b = localx;
      break;
    }
  }
  
  public x(x paramx)
  {
    if (paramx != null)
    {
      l locall = a;
      int i = Build.VERSION.SDK_INT;
      if ((i >= 30) && ((locall instanceof k))) {
        paramx = new k(this, (k)locall);
      }
      for (;;)
      {
        a = paramx;
        break;
        if ((i >= 29) && ((locall instanceof j))) {
          paramx = new j(this, (j)locall);
        } else if ((i >= 28) && ((locall instanceof i))) {
          paramx = new i(this, (i)locall);
        } else if ((locall instanceof h)) {
          paramx = new h(this, (h)locall);
        } else if ((locall instanceof g)) {
          paramx = new g(this, (g)locall);
        } else {
          paramx = new l(this);
        }
      }
      locall.e(this);
    }
    else
    {
      a = new l(this);
    }
  }
  
  public x(WindowInsets paramWindowInsets)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      paramWindowInsets = new k(this, paramWindowInsets);
    }
    for (;;)
    {
      a = paramWindowInsets;
      break;
      if (i >= 29) {
        paramWindowInsets = new j(this, paramWindowInsets);
      } else if (i >= 28) {
        paramWindowInsets = new i(this, paramWindowInsets);
      } else {
        paramWindowInsets = new h(this, paramWindowInsets);
      }
    }
  }
  
  public static f m(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(0, a - paramInt1);
    int j = Math.max(0, b - paramInt2);
    int k = Math.max(0, c - paramInt3);
    int m = Math.max(0, d - paramInt4);
    if ((i == paramInt1) && (j == paramInt2) && (k == paramInt3) && (m == paramInt4)) {
      return paramf;
    }
    return f.b(i, j, k, m);
  }
  
  public static x s(WindowInsets paramWindowInsets)
  {
    return t(paramWindowInsets, null);
  }
  
  public static x t(WindowInsets paramWindowInsets, View paramView)
  {
    paramWindowInsets = new x((WindowInsets)e.b(paramWindowInsets));
    if ((paramView != null) && (s.t(paramView)))
    {
      paramWindowInsets.p(s.o(paramView));
      paramWindowInsets.d(paramView.getRootView());
    }
    return paramWindowInsets;
  }
  
  public x a()
  {
    return a.a();
  }
  
  public x b()
  {
    return a.b();
  }
  
  public x c()
  {
    return a.c();
  }
  
  public void d(View paramView)
  {
    a.d(paramView);
  }
  
  public d e()
  {
    return a.f();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof x)) {
      return false;
    }
    paramObject = (x)paramObject;
    return c.a(a, a);
  }
  
  public f f(int paramInt)
  {
    return a.g(paramInt);
  }
  
  public f g()
  {
    return a.i();
  }
  
  public int h()
  {
    return a.k().d;
  }
  
  public int hashCode()
  {
    l locall = a;
    int i;
    if (locall == null) {
      i = 0;
    } else {
      i = locall.hashCode();
    }
    return i;
  }
  
  public int i()
  {
    return a.k().a;
  }
  
  public int j()
  {
    return a.k().c;
  }
  
  public int k()
  {
    return a.k().b;
  }
  
  public x l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a.m(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void n(f[] paramArrayOff)
  {
    a.p(paramArrayOff);
  }
  
  public void o(f paramf)
  {
    a.q(paramf);
  }
  
  public void p(x paramx)
  {
    a.r(paramx);
  }
  
  public void q(f paramf)
  {
    a.s(paramf);
  }
  
  public WindowInsets r()
  {
    Object localObject = a;
    if ((localObject instanceof g)) {
      localObject = c;
    } else {
      localObject = null;
    }
    return (WindowInsets)localObject;
  }
  
  public static abstract class a
  {
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;
    
    static
    {
      try
      {
        localObject = View.class.getDeclaredField("mAttachInfo");
        a = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = Class.forName("android.view.View$AttachInfo");
        Field localField = ((Class)localObject).getDeclaredField("mStableInsets");
        b = localField;
        localField.setAccessible(true);
        localObject = ((Class)localObject).getDeclaredField("mContentInsets");
        c = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
        d = true;
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Failed to get visible insets from AttachInfo ");
        ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
      }
    }
    
    public static x a(View paramView)
    {
      if ((d) && (paramView.isAttachedToWindow()))
      {
        Object localObject1 = paramView.getRootView();
        try
        {
          Object localObject2 = a.get(localObject1);
          if (localObject2 != null)
          {
            localObject1 = (Rect)b.get(localObject2);
            localObject2 = (Rect)c.get(localObject2);
            if ((localObject1 != null) && (localObject2 != null))
            {
              x.b localb = new I/x$b;
              localb.<init>();
              localObject1 = localb.b(f.c((Rect)localObject1)).c(f.c((Rect)localObject2)).a();
              ((x)localObject1).p((x)localObject1);
              ((x)localObject1).d(paramView.getRootView());
              return (x)localObject1;
            }
          }
        }
        catch (IllegalAccessException paramView)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Failed to get insets from AttachInfo. ");
          ((StringBuilder)localObject1).append(paramView.getMessage());
          Log.w("WindowInsetsCompat", ((StringBuilder)localObject1).toString(), paramView);
        }
      }
      return null;
    }
  }
  
  public static final class b
  {
    public final x.f a;
    
    public b()
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject;
      if (i >= 30) {
        localObject = new x.e();
      }
      for (;;)
      {
        a = ((x.f)localObject);
        break;
        if (i >= 29) {
          localObject = new x.d();
        } else {
          localObject = new x.c();
        }
      }
    }
    
    public b(x paramx)
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        paramx = new x.e(paramx);
      }
      for (;;)
      {
        a = paramx;
        break;
        if (i >= 29) {
          paramx = new x.d(paramx);
        } else {
          paramx = new x.c(paramx);
        }
      }
    }
    
    public x a()
    {
      return a.b();
    }
    
    public b b(f paramf)
    {
      a.d(paramf);
      return this;
    }
    
    public b c(f paramf)
    {
      a.f(paramf);
      return this;
    }
  }
  
  public static class c
    extends x.f
  {
    public static Field e;
    public static boolean f = false;
    public static Constructor g;
    public static boolean h = false;
    public WindowInsets c;
    public f d;
    
    public c()
    {
      c = h();
    }
    
    public c(@NonNull x paramx)
    {
      super();
      c = paramx.r();
    }
    
    private static WindowInsets h()
    {
      if (!f)
      {
        try
        {
          e = WindowInsets.class.getDeclaredField("CONSUMED");
        }
        catch (ReflectiveOperationException localReflectiveOperationException1)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
        }
        f = true;
      }
      Object localObject1 = e;
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
      if (!h)
      {
        try
        {
          g = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        }
        catch (ReflectiveOperationException localReflectiveOperationException3)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
        }
        h = true;
      }
      Constructor localConstructor = g;
      if (localConstructor != null) {
        try
        {
          Object localObject2 = new android/graphics/Rect;
          ((Rect)localObject2).<init>();
          localObject2 = (WindowInsets)localConstructor.newInstance(new Object[] { localObject2 });
          return (WindowInsets)localObject2;
        }
        catch (ReflectiveOperationException localReflectiveOperationException4)
        {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
        }
      }
      return null;
    }
    
    @NonNull
    public x b()
    {
      a();
      x localx = x.s(c);
      localx.n(b);
      localx.q(d);
      return localx;
    }
    
    public void d(f paramf)
    {
      d = paramf;
    }
    
    public void f(@NonNull f paramf)
    {
      WindowInsets localWindowInsets = c;
      if (localWindowInsets != null) {
        c = localWindowInsets.replaceSystemWindowInsets(a, b, c, d);
      }
    }
  }
  
  public static class d
    extends x.f
  {
    public final WindowInsets.Builder c;
    
    public d()
    {
      c = E.a();
    }
    
    public d(@NonNull x paramx)
    {
      super();
      paramx = paramx.r();
      if (paramx != null) {
        paramx = F.a(paramx);
      } else {
        paramx = E.a();
      }
      c = paramx;
    }
    
    @NonNull
    public x b()
    {
      a();
      x localx = x.s(B.a(c));
      localx.n(b);
      return localx;
    }
    
    public void c(@NonNull f paramf)
    {
      C.a(c, paramf.e());
    }
    
    public void d(@NonNull f paramf)
    {
      z.a(c, paramf.e());
    }
    
    public void e(@NonNull f paramf)
    {
      A.a(c, paramf.e());
    }
    
    public void f(@NonNull f paramf)
    {
      y.a(c, paramf.e());
    }
    
    public void g(@NonNull f paramf)
    {
      D.a(c, paramf.e());
    }
  }
  
  public static class e
    extends x.d
  {
    public e() {}
    
    public e(@NonNull x paramx)
    {
      super();
    }
  }
  
  public static abstract class f
  {
    public final x a;
    public f[] b;
    
    public f()
    {
      this(new x(null));
    }
    
    public f(@NonNull x paramx)
    {
      a = paramx;
    }
    
    public final void a()
    {
      Object localObject1 = b;
      if (localObject1 != null)
      {
        Object localObject2 = localObject1[x.m.a(1)];
        Object localObject3 = b[x.m.a(2)];
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = a.f(2);
        }
        localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = a.f(1);
        }
        f(f.a((f)localObject3, (f)localObject1));
        localObject1 = b[x.m.a(16)];
        if (localObject1 != null) {
          e((f)localObject1);
        }
        localObject1 = b[x.m.a(32)];
        if (localObject1 != null) {
          c((f)localObject1);
        }
        localObject1 = b[x.m.a(64)];
        if (localObject1 != null) {
          g((f)localObject1);
        }
      }
    }
    
    @NonNull
    public abstract x b();
    
    public void c(@NonNull f paramf) {}
    
    public abstract void d(@NonNull f paramf);
    
    public void e(@NonNull f paramf) {}
    
    public abstract void f(@NonNull f paramf);
    
    public void g(@NonNull f paramf) {}
  }
  
  public static class g
    extends x.l
  {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public f[] d;
    public f e = null;
    public x f;
    public f g;
    
    public g(@NonNull x paramx, @NonNull g paramg)
    {
      this(paramx, new WindowInsets(c));
    }
    
    public g(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
    {
      super();
      c = paramWindowInsets;
    }
    
    @SuppressLint({"WrongConstant"})
    @NonNull
    private f t(int paramInt, boolean paramBoolean)
    {
      f localf = f.e;
      int m = 1;
      while (m <= 256)
      {
        if ((paramInt & m) != 0) {
          localf = f.a(localf, u(m, paramBoolean));
        }
        m <<= 1;
      }
      return localf;
    }
    
    private f v()
    {
      x localx = f;
      if (localx != null) {
        return localx.g();
      }
      return f.e;
    }
    
    private f w(@NonNull View paramView)
    {
      if (Build.VERSION.SDK_INT < 30)
      {
        if (!h) {
          x();
        }
        Object localObject1 = i;
        Object localObject2 = null;
        if ((localObject1 != null) && (j != null) && (k != null)) {
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
          }
          catch (ReflectiveOperationException localReflectiveOperationException)
          {
            break label111;
            paramView = l.get(paramView);
            localObject1 = (Rect)k.get(paramView);
            paramView = localReflectiveOperationException;
            if (localObject1 != null) {
              paramView = f.c((Rect)localObject1);
            }
            return paramView;
            label111:
            paramView = new StringBuilder();
            paramView.append("Failed to get visible insets. (Reflection error). ");
            paramView.append(localReflectiveOperationException.getMessage());
            Log.e("WindowInsetsCompat", paramView.toString(), localReflectiveOperationException);
          }
        }
        return null;
      }
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    @SuppressLint({"PrivateApi"})
    private static void x()
    {
      try
      {
        i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
        Class localClass = Class.forName("android.view.View$AttachInfo");
        j = localClass;
        k = localClass.getDeclaredField("mVisibleInsets");
        l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
        k.setAccessible(true);
        l.setAccessible(true);
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to get visible insets. (Reflection error). ");
        localStringBuilder.append(localReflectiveOperationException.getMessage());
        Log.e("WindowInsetsCompat", localStringBuilder.toString(), localReflectiveOperationException);
      }
      h = true;
    }
    
    public void d(@NonNull View paramView)
    {
      f localf = w(paramView);
      paramView = localf;
      if (localf == null) {
        paramView = f.e;
      }
      q(paramView);
    }
    
    public void e(@NonNull x paramx)
    {
      paramx.p(f);
      paramx.o(g);
    }
    
    public boolean equals(Object paramObject)
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (g)paramObject;
      return Objects.equals(g, g);
    }
    
    @NonNull
    public f g(int paramInt)
    {
      return t(paramInt, false);
    }
    
    @NonNull
    public final f k()
    {
      if (e == null) {
        e = f.b(c.getSystemWindowInsetLeft(), c.getSystemWindowInsetTop(), c.getSystemWindowInsetRight(), c.getSystemWindowInsetBottom());
      }
      return e;
    }
    
    @NonNull
    public x m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      x.b localb = new x.b(x.s(c));
      localb.c(x.m(k(), paramInt1, paramInt2, paramInt3, paramInt4));
      localb.b(x.m(i(), paramInt1, paramInt2, paramInt3, paramInt4));
      return localb.a();
    }
    
    public boolean o()
    {
      return c.isRound();
    }
    
    public void p(f[] paramArrayOff)
    {
      d = paramArrayOff;
    }
    
    public void q(@NonNull f paramf)
    {
      g = paramf;
    }
    
    public void r(x paramx)
    {
      f = paramx;
    }
    
    @NonNull
    public f u(int paramInt, boolean paramBoolean)
    {
      if (paramInt != 1)
      {
        Object localObject1 = null;
        f localf = null;
        if (paramInt != 2)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32)
              {
                if (paramInt != 64)
                {
                  if (paramInt != 128) {
                    return f.e;
                  }
                  localObject1 = f;
                  if (localObject1 != null) {
                    localObject1 = ((x)localObject1).e();
                  } else {
                    localObject1 = f();
                  }
                  if (localObject1 != null) {
                    return f.b(((d)localObject1).b(), ((d)localObject1).d(), ((d)localObject1).c(), ((d)localObject1).a());
                  }
                  return f.e;
                }
                return l();
              }
              return h();
            }
            return j();
          }
          localObject2 = d;
          localObject1 = localf;
          if (localObject2 != null) {
            localObject1 = localObject2[x.m.a(8)];
          }
          if (localObject1 != null) {
            return (f)localObject1;
          }
          localf = k();
          localObject1 = v();
          paramInt = d;
          if (paramInt > d) {
            return f.b(0, 0, 0, paramInt);
          }
          localf = g;
          if ((localf != null) && (!localf.equals(f.e)))
          {
            paramInt = g.d;
            if (paramInt > d) {
              return f.b(0, 0, 0, paramInt);
            }
          }
          return f.e;
        }
        if (paramBoolean)
        {
          localObject1 = v();
          localf = i();
          return f.b(Math.max(a, a), 0, Math.max(c, c), Math.max(d, d));
        }
        localf = k();
        Object localObject2 = f;
        if (localObject2 != null) {
          localObject1 = ((x)localObject2).g();
        }
        int m = d;
        paramInt = m;
        if (localObject1 != null) {
          paramInt = Math.min(m, d);
        }
        return f.b(a, 0, c, paramInt);
      }
      if (paramBoolean) {
        return f.b(0, Math.max(vb, kb), 0, 0);
      }
      return f.b(0, kb, 0, 0);
    }
  }
  
  public static class h
    extends x.g
  {
    public f m = null;
    
    public h(@NonNull x paramx, @NonNull h paramh)
    {
      super(paramh);
      m = m;
    }
    
    public h(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    @NonNull
    public x b()
    {
      return x.s(c.consumeStableInsets());
    }
    
    @NonNull
    public x c()
    {
      return x.s(c.consumeSystemWindowInsets());
    }
    
    @NonNull
    public final f i()
    {
      if (m == null) {
        m = f.b(c.getStableInsetLeft(), c.getStableInsetTop(), c.getStableInsetRight(), c.getStableInsetBottom());
      }
      return m;
    }
    
    public boolean n()
    {
      return c.isConsumed();
    }
    
    public void s(f paramf)
    {
      m = paramf;
    }
  }
  
  public static class i
    extends x.h
  {
    public i(@NonNull x paramx, @NonNull i parami)
    {
      super(parami);
    }
    
    public i(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    @NonNull
    public x a()
    {
      return x.s(H.a(c));
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof i)) {
        return false;
      }
      paramObject = (i)paramObject;
      if ((!Objects.equals(c, c)) || (!Objects.equals(g, g))) {
        bool = false;
      }
      return bool;
    }
    
    public d f()
    {
      return d.e(G.a(c));
    }
    
    public int hashCode()
    {
      return c.hashCode();
    }
  }
  
  public static class j
    extends x.i
  {
    public f n = null;
    public f o = null;
    public f p = null;
    
    public j(@NonNull x paramx, @NonNull j paramj)
    {
      super(paramj);
    }
    
    public j(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    @NonNull
    public f h()
    {
      if (o == null) {
        o = f.d(K.a(c));
      }
      return o;
    }
    
    @NonNull
    public f j()
    {
      if (n == null) {
        n = f.d(L.a(c));
      }
      return n;
    }
    
    @NonNull
    public f l()
    {
      if (p == null) {
        p = f.d(I.a(c));
      }
      return p;
    }
    
    @NonNull
    public x m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return x.s(J.a(c, paramInt1, paramInt2, paramInt3, paramInt4));
    }
    
    public void s(f paramf) {}
  }
  
  public static class k
    extends x.j
  {
    public static final x q = x.s(N.a());
    
    public k(@NonNull x paramx, @NonNull k paramk)
    {
      super(paramk);
    }
    
    public k(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public final void d(@NonNull View paramView) {}
    
    @NonNull
    public f g(int paramInt)
    {
      return f.d(M.a(c, x.n.a(paramInt)));
    }
  }
  
  public static class l
  {
    public static final x b = new x.b().a().a().b().c();
    public final x a;
    
    public l(@NonNull x paramx)
    {
      a = paramx;
    }
    
    @NonNull
    public x a()
    {
      return a;
    }
    
    @NonNull
    public x b()
    {
      return a;
    }
    
    @NonNull
    public x c()
    {
      return a;
    }
    
    public void d(@NonNull View paramView) {}
    
    public void e(@NonNull x paramx) {}
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof l)) {
        return false;
      }
      paramObject = (l)paramObject;
      if ((o() != ((l)paramObject).o()) || (n() != ((l)paramObject).n()) || (!c.a(k(), ((l)paramObject).k())) || (!c.a(i(), ((l)paramObject).i())) || (!c.a(f(), ((l)paramObject).f()))) {
        bool = false;
      }
      return bool;
    }
    
    public d f()
    {
      return null;
    }
    
    @NonNull
    public f g(int paramInt)
    {
      return f.e;
    }
    
    @NonNull
    public f h()
    {
      return k();
    }
    
    public int hashCode()
    {
      return c.b(new Object[] { Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f() });
    }
    
    @NonNull
    public f i()
    {
      return f.e;
    }
    
    @NonNull
    public f j()
    {
      return k();
    }
    
    @NonNull
    public f k()
    {
      return f.e;
    }
    
    @NonNull
    public f l()
    {
      return k();
    }
    
    @NonNull
    public x m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return b;
    }
    
    public boolean n()
    {
      return false;
    }
    
    public boolean o()
    {
      return false;
    }
    
    public void p(f[] paramArrayOff) {}
    
    public void q(@NonNull f paramf) {}
    
    public void r(x paramx) {}
    
    public void s(f paramf) {}
  }
  
  public static final abstract class m
  {
    public static int a(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 4)
          {
            if (paramInt != 8)
            {
              if (paramInt != 16)
              {
                if (paramInt != 32)
                {
                  if (paramInt != 64)
                  {
                    if (paramInt != 128)
                    {
                      if (paramInt == 256) {
                        return 8;
                      }
                      StringBuilder localStringBuilder = new StringBuilder();
                      localStringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                      localStringBuilder.append(paramInt);
                      throw new IllegalArgumentException(localStringBuilder.toString());
                    }
                    return 7;
                  }
                  return 6;
                }
                return 5;
              }
              return 4;
            }
            return 3;
          }
          return 2;
        }
        return 1;
      }
      return 0;
    }
  }
  
  public static final abstract class n
  {
    public static int a(int paramInt)
    {
      int i = 0;
      int j = 1;
      while (j <= 256)
      {
        int k = i;
        if ((paramInt & j) != 0)
        {
          if (j != 1) {
            if (j != 2) {
              if (j != 4) {
                if (j != 8) {
                  if (j != 16) {
                    if (j != 32) {
                      if (j != 64)
                      {
                        if (j != 128)
                        {
                          k = i;
                          break label130;
                        }
                        k = W.a();
                      }
                    }
                  }
                }
              }
            }
          }
          for (;;)
          {
            k = i | k;
            break;
            k = V.a();
            continue;
            k = U.a();
            continue;
            k = T.a();
            continue;
            k = S.a();
            continue;
            k = Q.a();
            continue;
            k = P.a();
            continue;
            k = O.a();
          }
        }
        label130:
        j <<= 1;
        i = k;
      }
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     I.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */