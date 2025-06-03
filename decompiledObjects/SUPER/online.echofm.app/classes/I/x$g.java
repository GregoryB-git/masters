package I;

import A.f;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class x$g
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
  
  public x$g(@NonNull x paramx, @NonNull g paramg)
  {
    this(paramx, new WindowInsets(c));
  }
  
  public x$g(@NonNull x paramx, @NonNull WindowInsets paramWindowInsets)
  {
    super(paramx);
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

/* Location:
 * Qualified Name:     I.x.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */