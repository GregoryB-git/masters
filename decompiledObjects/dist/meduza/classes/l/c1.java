package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import b.k;
import b.m;
import e0.d0;
import e0.j0;
import e0.j0.b;

public final class c1
  implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
  public static c1 s;
  public static c1 t;
  public final View a;
  public final CharSequence b;
  public final int c;
  public final k d = new k(this, 2);
  public final m e = new m(this, 2);
  public int f;
  public int o;
  public d1 p;
  public boolean q;
  public boolean r;
  
  public c1(View paramView, CharSequence paramCharSequence)
  {
    a = paramView;
    b = paramCharSequence;
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramView.getContext());
    paramCharSequence = j0.a;
    int i;
    if (Build.VERSION.SDK_INT >= 28) {
      i = j0.b.a(localViewConfiguration);
    } else {
      i = localViewConfiguration.getScaledTouchSlop() / 2;
    }
    c = i;
    r = true;
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  public static void b(c1 paramc1)
  {
    c1 localc1 = s;
    if (localc1 != null) {
      a.removeCallbacks(d);
    }
    s = paramc1;
    if (paramc1 != null) {
      a.postDelayed(d, ViewConfiguration.getLongPressTimeout());
    }
  }
  
  public final void a()
  {
    if (t == this)
    {
      t = null;
      d1 locald1 = p;
      if (locald1 != null)
      {
        int i;
        if (b.getParent() != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          ((WindowManager)a.getSystemService("window")).removeView(b);
        }
        p = null;
        r = true;
        a.removeOnAttachStateChangeListener(this);
      }
      else
      {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      }
    }
    if (s == this) {
      b(null);
    }
    a.removeCallbacks(e);
  }
  
  public final void c(boolean paramBoolean)
  {
    Object localObject1 = a;
    Object localObject2 = d0.a;
    if (!((View)localObject1).isAttachedToWindow()) {
      return;
    }
    b(null);
    localObject2 = t;
    if (localObject2 != null) {
      ((c1)localObject2).a();
    }
    t = this;
    q = paramBoolean;
    d1 locald1 = new d1(a.getContext());
    p = locald1;
    View localView = a;
    int i = f;
    int j = o;
    paramBoolean = q;
    localObject2 = b;
    int k;
    if (b.getParent() != null) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      if (b.getParent() != null) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        ((WindowManager)a.getSystemService("window")).removeView(b);
      }
    }
    c.setText((CharSequence)localObject2);
    WindowManager.LayoutParams localLayoutParams = d;
    token = localView.getApplicationWindowToken();
    int m = a.getResources().getDimensionPixelOffset(2131165343);
    if (localView.getWidth() >= m) {
      k = i;
    } else {
      k = localView.getWidth() / 2;
    }
    if (localView.getHeight() >= m)
    {
      m = a.getResources().getDimensionPixelOffset(2131165342);
      i = j + m;
      j -= m;
    }
    else
    {
      i = localView.getHeight();
      j = 0;
    }
    gravity = 49;
    localObject2 = a.getResources();
    if (paramBoolean) {
      m = 2131165346;
    } else {
      m = 2131165345;
    }
    int n = ((Resources)localObject2).getDimensionPixelOffset(m);
    Object localObject3 = localView.getRootView();
    localObject2 = ((View)localObject3).getLayoutParams();
    if (((localObject2 instanceof WindowManager.LayoutParams)) && (type == 2)) {
      localObject2 = localObject3;
    } else {
      for (localObject1 = localView.getContext();; localObject1 = ((ContextWrapper)localObject1).getBaseContext())
      {
        localObject2 = localObject3;
        if (!(localObject1 instanceof ContextWrapper)) {
          break;
        }
        if ((localObject1 instanceof Activity))
        {
          localObject2 = ((Activity)localObject1).getWindow().getDecorView();
          break;
        }
      }
    }
    if (localObject2 == null)
    {
      Log.e("TooltipPopup", "Cannot find app view");
    }
    else
    {
      ((View)localObject2).getWindowVisibleDisplayFrame(e);
      localObject1 = e;
      if ((left < 0) && (top < 0))
      {
        localObject1 = a.getResources();
        m = ((Resources)localObject1).getIdentifier("status_bar_height", "dimen", "android");
        if (m != 0) {
          m = ((Resources)localObject1).getDimensionPixelSize(m);
        } else {
          m = 0;
        }
        localObject1 = ((Resources)localObject1).getDisplayMetrics();
        e.set(0, m, widthPixels, heightPixels);
      }
      ((View)localObject2).getLocationOnScreen(g);
      localView.getLocationOnScreen(f);
      localObject3 = f;
      m = localObject3[0];
      localObject1 = g;
      m -= localObject1[0];
      localObject3[0] = m;
      localObject3[1] -= localObject1[1];
      x = (m + k - ((View)localObject2).getWidth() / 2);
      k = View.MeasureSpec.makeMeasureSpec(0, 0);
      b.measure(k, k);
      k = b.getMeasuredHeight();
      m = f[1];
      j = j + m - n - k;
      i = m + i + n;
      if (paramBoolean ? j < 0 : k + i <= e.height()) {
        y = i;
      } else {
        y = j;
      }
    }
    ((WindowManager)a.getSystemService("window")).addView(b, d);
    a.addOnAttachStateChangeListener(this);
    long l;
    if (q)
    {
      l = 2500L;
    }
    else
    {
      if ((a.getWindowSystemUiVisibility() & 0x1) == 1) {
        l = 3000L;
      } else {
        l = 15000L;
      }
      l -= ViewConfiguration.getLongPressTimeout();
    }
    a.removeCallbacks(e);
    a.postDelayed(e, l);
  }
  
  public final boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((p != null) && (q)) {
      return false;
    }
    paramView = (AccessibilityManager)a.getContext().getSystemService("accessibility");
    if ((paramView.isEnabled()) && (paramView.isTouchExplorationEnabled())) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    int j = 1;
    if (i != 7)
    {
      if (i == 10)
      {
        r = true;
        a();
      }
    }
    else if ((a.isEnabled()) && (p == null))
    {
      i = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((!r) && (Math.abs(i - f) <= c) && (Math.abs(k - o) <= c))
      {
        j = 0;
      }
      else
      {
        f = i;
        o = k;
        r = false;
      }
      if (j != 0) {
        b(this);
      }
    }
    return false;
  }
  
  public final boolean onLongClick(View paramView)
  {
    f = (paramView.getWidth() / 2);
    o = (paramView.getHeight() / 2);
    c(true);
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}

/* Location:
 * Qualified Name:     l.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */