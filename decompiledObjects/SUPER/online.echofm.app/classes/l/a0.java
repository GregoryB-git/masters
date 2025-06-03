package l;

import I.s;
import I.u;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

public class a0
  implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
  public static a0 x;
  public static a0 y;
  public final View o;
  public final CharSequence p;
  public final int q;
  public final Runnable r = new a();
  public final Runnable s = new b();
  public int t;
  public int u;
  public b0 v;
  public boolean w;
  
  public a0(View paramView, CharSequence paramCharSequence)
  {
    o = paramView;
    p = paramCharSequence;
    q = u.a(ViewConfiguration.get(paramView.getContext()));
    b();
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  public static void e(a0 parama0)
  {
    a0 locala0 = x;
    if (locala0 != null) {
      locala0.a();
    }
    x = parama0;
    if (parama0 != null) {
      parama0.d();
    }
  }
  
  public static void f(View paramView, CharSequence paramCharSequence)
  {
    a0 locala0 = x;
    if ((locala0 != null) && (o == paramView)) {
      e(null);
    }
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramCharSequence = y;
      if ((paramCharSequence != null) && (o == paramView)) {
        paramCharSequence.c();
      }
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
    }
    else
    {
      new a0(paramView, paramCharSequence);
    }
  }
  
  public final void a()
  {
    o.removeCallbacks(r);
  }
  
  public final void b()
  {
    t = Integer.MAX_VALUE;
    u = Integer.MAX_VALUE;
  }
  
  public void c()
  {
    if (y == this)
    {
      y = null;
      b0 localb0 = v;
      if (localb0 != null)
      {
        localb0.c();
        v = null;
        b();
        o.removeOnAttachStateChangeListener(this);
      }
      else
      {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      }
    }
    if (x == this) {
      e(null);
    }
    o.removeCallbacks(s);
  }
  
  public final void d()
  {
    o.postDelayed(r, ViewConfiguration.getLongPressTimeout());
  }
  
  public void g(boolean paramBoolean)
  {
    if (!s.t(o)) {
      return;
    }
    e(null);
    Object localObject = y;
    if (localObject != null) {
      ((a0)localObject).c();
    }
    y = this;
    w = paramBoolean;
    localObject = new b0(o.getContext());
    v = ((b0)localObject);
    ((b0)localObject).e(o, t, u, w, p);
    o.addOnAttachStateChangeListener(this);
    long l1;
    if (w)
    {
      l1 = 2500L;
    }
    else
    {
      if ((s.r(o) & 0x1) == 1) {
        l1 = ViewConfiguration.getLongPressTimeout();
      }
      for (long l2 = 3000L;; l2 = 15000L)
      {
        l1 = l2 - l1;
        break;
        l1 = ViewConfiguration.getLongPressTimeout();
      }
    }
    o.removeCallbacks(s);
    o.postDelayed(s, l1);
  }
  
  public final boolean h(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if ((Math.abs(i - t) <= q) && (Math.abs(j - u) <= q)) {
      return false;
    }
    t = i;
    u = j;
    return true;
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((v != null) && (w)) {
      return false;
    }
    paramView = (AccessibilityManager)o.getContext().getSystemService("accessibility");
    if ((paramView.isEnabled()) && (paramView.isTouchExplorationEnabled())) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    if (i != 7)
    {
      if (i == 10)
      {
        b();
        c();
      }
    }
    else if ((o.isEnabled()) && (v == null) && (h(paramMotionEvent))) {
      e(this);
    }
    return false;
  }
  
  public boolean onLongClick(View paramView)
  {
    t = (paramView.getWidth() / 2);
    u = (paramView.getHeight() / 2);
    g(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    c();
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      g(false);
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      c();
    }
  }
}

/* Location:
 * Qualified Name:     l.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */