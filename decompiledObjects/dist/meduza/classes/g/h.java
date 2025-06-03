package g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;
import e0.d0;
import e0.d0.c;
import e0.d0.e;
import e0.s0;
import e0.s0.b;
import e0.s0.c;
import e0.s0.d;
import e0.s0.e;
import e0.s0.k;
import e0.t;
import java.lang.reflect.Method;
import l.f1;
import v.a;
import x.b;

public final class h
  implements t
{
  public h(g paramg) {}
  
  public final s0 a(View paramView, s0 params0)
  {
    int i = a.g().b;
    Object localObject1 = a;
    localObject1.getClass();
    int j = a.g().b;
    Object localObject2 = D;
    int k;
    int m;
    int i1;
    int i3;
    if ((localObject2 != null) && ((((View)localObject2).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject3 = (ViewGroup.MarginLayoutParams)D.getLayoutParams();
      boolean bool = D.isShown();
      k = 1;
      m = 1;
      if (bool)
      {
        if (l0 == null)
        {
          l0 = new Rect();
          m0 = new Rect();
        }
        localObject2 = l0;
        Rect localRect = m0;
        ((Rect)localObject2).set(a.g().a, a.g().b, a.g().c, a.g().d);
        ViewGroup localViewGroup = J;
        Method localMethod = f1.a;
        if (localMethod != null) {
          try
          {
            localMethod.invoke(localViewGroup, new Object[] { localObject2, localRect });
          }
          catch (Exception localException)
          {
            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", localException);
          }
        }
        int n = top;
        i1 = left;
        int i2 = right;
        Object localObject4 = J;
        localObject2 = d0.a;
        localObject2 = d0.e.a((View)localObject4);
        if (localObject2 == null) {
          k = 0;
        } else {
          k = a.g().a;
        }
        if (localObject2 == null) {
          i3 = 0;
        } else {
          i3 = a.g().c;
        }
        if ((topMargin == n) && (leftMargin == i1) && (rightMargin == i2))
        {
          i1 = 0;
        }
        else
        {
          topMargin = n;
          leftMargin = i1;
          rightMargin = i2;
          i1 = 1;
        }
        if ((n > 0) && (L == null))
        {
          localObject2 = new View(s);
          L = ((View)localObject2);
          ((View)localObject2).setVisibility(8);
          localObject2 = new FrameLayout.LayoutParams(-1, topMargin, 51);
          leftMargin = k;
          rightMargin = i3;
          J.addView(L, -1, (ViewGroup.LayoutParams)localObject2);
        }
        else
        {
          localObject2 = L;
          if (localObject2 != null)
          {
            localObject2 = (ViewGroup.MarginLayoutParams)((View)localObject2).getLayoutParams();
            n = height;
            i2 = topMargin;
            if ((n != i2) || (leftMargin != k) || (rightMargin != i3))
            {
              height = i2;
              leftMargin = k;
              rightMargin = i3;
              L.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
          }
        }
        localObject2 = L;
        if (localObject2 != null) {
          k = 1;
        } else {
          k = 0;
        }
        if ((k != 0) && (((View)localObject2).getVisibility() != 0))
        {
          localObject4 = L;
          if ((((View)localObject4).getWindowSystemUiVisibility() & 0x2000) != 0) {
            i3 = m;
          } else {
            i3 = 0;
          }
          if (i3 != 0)
          {
            localObject2 = s;
            i3 = 2131099654;
          }
          else
          {
            localObject2 = s;
            i3 = 2131099653;
          }
          ((View)localObject4).setBackgroundColor(a.getColor((Context)localObject2, i3));
        }
        i3 = j;
        if (!Q)
        {
          i3 = j;
          if (k != 0) {
            i3 = 0;
          }
        }
        m = i1;
        j = i3;
        i1 = k;
        k = m;
      }
      else if (topMargin != 0)
      {
        topMargin = 0;
        i1 = 0;
      }
      else
      {
        i1 = 0;
        k = i1;
      }
      i3 = j;
      m = i1;
      if (k != 0)
      {
        D.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        i3 = j;
        m = i1;
      }
    }
    else
    {
      m = 0;
      i3 = j;
    }
    localObject2 = L;
    if (localObject2 != null)
    {
      if (m != 0) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      ((View)localObject2).setVisibility(i1);
    }
    if (i != i3)
    {
      m = a.g().a;
      i1 = a.g().c;
      k = a.g().d;
      j = Build.VERSION.SDK_INT;
      if (j >= 30) {
        params0 = new s0.d(params0);
      } else if (j >= 29) {
        params0 = new s0.c(params0);
      } else {
        params0 = new s0.b(params0);
      }
      params0.d(b.a(m, i3, i1, k));
      params0 = params0.b();
    }
    localObject2 = d0.a;
    Object localObject3 = params0.b();
    localObject2 = params0;
    if (localObject3 != null)
    {
      localObject1 = d0.c.b(paramView, (WindowInsets)localObject3);
      localObject2 = params0;
      if (!((WindowInsets)localObject1).equals(localObject3)) {
        localObject2 = s0.c((WindowInsets)localObject1, paramView);
      }
    }
    return (s0)localObject2;
  }
}

/* Location:
 * Qualified Name:     g.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */