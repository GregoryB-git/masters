package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import e0.d0;
import java.util.WeakHashMap;
import k.d;

public class i
{
  public final Context a;
  public final f b;
  public final boolean c;
  public final int d;
  public final int e;
  public View f;
  public int g = 8388611;
  public boolean h;
  public j.a i;
  public d j;
  public PopupWindow.OnDismissListener k;
  public final a l = new a();
  
  public i(int paramInt1, int paramInt2, Context paramContext, View paramView, f paramf, boolean paramBoolean)
  {
    a = paramContext;
    b = paramf;
    f = paramView;
    c = paramBoolean;
    d = paramInt1;
    e = paramInt2;
  }
  
  public i(Context paramContext, f paramf, View paramView, boolean paramBoolean)
  {
    this(2130968608, 0, paramContext, paramView, paramf, paramBoolean);
  }
  
  public final d a()
  {
    if (j == null)
    {
      Object localObject1 = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
      Object localObject2 = new Point();
      b.a((Display)localObject1, (Point)localObject2);
      int m;
      if (Math.min(x, y) >= a.getResources().getDimensionPixelSize(2131165206)) {
        m = 1;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        localObject1 = new b(a, f, d, e, c);
      }
      else
      {
        Context localContext = a;
        localObject2 = b;
        localObject1 = f;
        localObject1 = new l(d, e, localContext, (View)localObject1, (f)localObject2, c);
      }
      ((d)localObject1).k(b);
      ((d)localObject1).q(l);
      ((d)localObject1).m(f);
      ((j)localObject1).d(i);
      ((d)localObject1).n(h);
      ((d)localObject1).o(g);
      j = ((d)localObject1);
    }
    return j;
  }
  
  public final boolean b()
  {
    d locald = j;
    boolean bool;
    if ((locald != null) && (locald.a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c()
  {
    j = null;
    PopupWindow.OnDismissListener localOnDismissListener = k;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    d locald = a();
    locald.r(paramBoolean2);
    if (paramBoolean1)
    {
      int m = g;
      View localView = f;
      WeakHashMap localWeakHashMap = d0.a;
      int n = paramInt1;
      if ((Gravity.getAbsoluteGravity(m, localView.getLayoutDirection()) & 0x7) == 5) {
        n = paramInt1 - f.getWidth();
      }
      locald.p(n);
      locald.s(paramInt2);
      paramInt1 = (int)(a.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      a = new Rect(n - paramInt1, paramInt2 - paramInt1, n + paramInt1, paramInt2 + paramInt1);
    }
    locald.show();
  }
  
  public final class a
    implements PopupWindow.OnDismissListener
  {
    public a() {}
    
    public final void onDismiss()
    {
      c();
    }
  }
  
  public static final class b
  {
    public static void a(Display paramDisplay, Point paramPoint)
    {
      paramDisplay.getRealSize(paramPoint);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */