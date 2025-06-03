package e0;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.AccessibilityDelegate;

public abstract class d0$b<T>
{
  public final int a;
  public final Class<T> b;
  public final int c;
  public final int d;
  
  public d0$b(int paramInt1, Class<T> paramClass, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramClass;
    d = paramInt2;
    c = paramInt3;
  }
  
  public static boolean a(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    boolean bool = true;
    int i;
    if ((paramBoolean1 != null) && (paramBoolean1.booleanValue())) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((paramBoolean2 != null) && (paramBoolean2.booleanValue())) {
      j = 1;
    } else {
      j = 0;
    }
    if (i != j) {
      bool = false;
    }
    return bool;
  }
  
  public abstract T b(View paramView);
  
  public abstract void c(View paramView, T paramT);
  
  public final T d(View paramView)
  {
    int i;
    if (Build.VERSION.SDK_INT >= c) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return (T)b(paramView);
    }
    paramView = paramView.getTag(a);
    if (b.isInstance(paramView)) {
      return paramView;
    }
    return null;
  }
  
  public final void e(View paramView, T paramT)
  {
    int i;
    if (Build.VERSION.SDK_INT >= c) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      c(paramView, paramT);
    }
    else if (f(d(paramView), paramT))
    {
      Object localObject1 = d0.c(paramView);
      if (localObject1 == null) {
        localObject1 = null;
      } else if ((localObject1 instanceof a.a)) {
        localObject1 = a;
      } else {
        localObject1 = new a((View.AccessibilityDelegate)localObject1);
      }
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new a();
      }
      d0.h(paramView, (a)localObject2);
      paramView.setTag(a, paramT);
      d0.e(d, paramView);
    }
  }
  
  public abstract boolean f(T paramT1, T paramT2);
}

/* Location:
 * Qualified Name:     e0.d0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */