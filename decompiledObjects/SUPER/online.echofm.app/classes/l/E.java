package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.c;

public abstract class E
  implements View.OnTouchListener, View.OnAttachStateChangeListener
{
  public final float o;
  public final int p;
  public final int q;
  public final View r;
  public Runnable s;
  public Runnable t;
  public boolean u;
  public int v;
  public final int[] w = new int[2];
  
  public E(View paramView)
  {
    r = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    o = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    int i = ViewConfiguration.getTapTimeout();
    p = i;
    q = ((i + ViewConfiguration.getLongPressTimeout()) / 2);
  }
  
  public static boolean h(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = -paramFloat3;
    boolean bool;
    if ((paramFloat1 >= f) && (paramFloat2 >= f) && (paramFloat1 < paramView.getRight() - paramView.getLeft() + paramFloat3) && (paramFloat2 < paramView.getBottom() - paramView.getTop() + paramFloat3)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void a()
  {
    Runnable localRunnable = t;
    if (localRunnable != null) {
      r.removeCallbacks(localRunnable);
    }
    localRunnable = s;
    if (localRunnable != null) {
      r.removeCallbacks(localRunnable);
    }
  }
  
  public abstract c b();
  
  public abstract boolean c();
  
  public boolean d()
  {
    c localc = b();
    if ((localc != null) && (localc.i())) {
      localc.dismiss();
    }
    return true;
  }
  
  public void e()
  {
    a();
    View localView = r;
    if ((localView.isEnabled()) && (!localView.isLongClickable()))
    {
      if (!c()) {
        return;
      }
      localView.getParent().requestDisallowInterceptTouchEvent(true);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      localView.onTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
      u = true;
    }
  }
  
  public final boolean f(MotionEvent paramMotionEvent)
  {
    View localView = r;
    Object localObject = b();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null) {
      if (!((c)localObject).i())
      {
        bool2 = bool1;
      }
      else
      {
        C localC = (C)((c)localObject).d();
        bool2 = bool1;
        if (localC != null) {
          if (!localC.isShown())
          {
            bool2 = bool1;
          }
          else
          {
            localObject = MotionEvent.obtainNoHistory(paramMotionEvent);
            i(localView, (MotionEvent)localObject);
            j(localC, (MotionEvent)localObject);
            boolean bool3 = localC.e((MotionEvent)localObject, v);
            ((MotionEvent)localObject).recycle();
            int i = paramMotionEvent.getActionMasked();
            if ((i != 1) && (i != 3)) {
              i = 1;
            } else {
              i = 0;
            }
            bool2 = bool1;
            if (bool3)
            {
              bool2 = bool1;
              if (i != 0) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public final boolean g(MotionEvent paramMotionEvent)
  {
    View localView = r;
    if (!localView.isEnabled()) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3) {
            break label173;
          }
        }
        else
        {
          i = paramMotionEvent.findPointerIndex(v);
          if ((i < 0) || (h(localView, paramMotionEvent.getX(i), paramMotionEvent.getY(i), o))) {
            break label173;
          }
          a();
          localView.getParent().requestDisallowInterceptTouchEvent(true);
          return true;
        }
      }
      a();
    }
    else
    {
      v = paramMotionEvent.getPointerId(0);
      if (s == null) {
        s = new a();
      }
      localView.postDelayed(s, p);
      if (t == null) {
        t = new b();
      }
      localView.postDelayed(t, q);
    }
    label173:
    return false;
  }
  
  public final boolean i(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = w;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }
  
  public final boolean j(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = w;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = u;
    boolean bool2 = true;
    boolean bool3;
    if (bool1)
    {
      if ((!f(paramMotionEvent)) && (d())) {
        bool3 = false;
      } else {
        bool3 = true;
      }
    }
    else
    {
      if ((g(paramMotionEvent)) && (c())) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      bool3 = bool4;
      if (bool4)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        r.onTouchEvent(paramView);
        paramView.recycle();
        bool3 = bool4;
      }
    }
    u = bool3;
    boolean bool4 = bool2;
    if (!bool3) {
      if (bool1) {
        bool4 = bool2;
      } else {
        bool4 = false;
      }
    }
    return bool4;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    u = false;
    v = -1;
    paramView = s;
    if (paramView != null) {
      r.removeCallbacks(paramView);
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      ViewParent localViewParent = r.getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      e();
    }
  }
}

/* Location:
 * Qualified Name:     l.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */