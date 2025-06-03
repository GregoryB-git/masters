package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.f;

public abstract class l0
  implements View.OnTouchListener, View.OnAttachStateChangeListener
{
  public final float a;
  public final int b;
  public final int c;
  public final View d;
  public a e;
  public b f;
  public boolean o;
  public int p;
  public final int[] q = new int[2];
  
  public l0(View paramView)
  {
    d = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    int i = ViewConfiguration.getTapTimeout();
    b = i;
    c = ((ViewConfiguration.getLongPressTimeout() + i) / 2);
  }
  
  public final void a()
  {
    Object localObject = f;
    if (localObject != null) {
      d.removeCallbacks((Runnable)localObject);
    }
    localObject = e;
    if (localObject != null) {
      d.removeCallbacks((Runnable)localObject);
    }
  }
  
  public abstract f b();
  
  public abstract boolean c();
  
  public boolean d()
  {
    f localf = b();
    if ((localf != null) && (localf.a())) {
      localf.dismiss();
    }
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = o;
    boolean bool2 = true;
    boolean bool3;
    int i;
    if (bool1)
    {
      Object localObject = d;
      paramView = b();
      if ((paramView != null) && (paramView.a()))
      {
        paramView = paramView.h();
        if ((paramView != null) && (paramView.isShown()))
        {
          MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
          int[] arrayOfInt = q;
          ((View)localObject).getLocationOnScreen(arrayOfInt);
          localMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
          localObject = q;
          paramView.getLocationOnScreen((int[])localObject);
          localMotionEvent.offsetLocation(-localObject[0], -localObject[1]);
          bool3 = paramView.b(p, localMotionEvent);
          localMotionEvent.recycle();
          i = paramMotionEvent.getActionMasked();
          if ((i != 1) && (i != 3)) {
            i = 1;
          } else {
            i = 0;
          }
          if ((bool3) && (i != 0))
          {
            i = 1;
            break label186;
          }
        }
      }
      i = 0;
      label186:
      if ((i == 0) && (d())) {
        bool3 = false;
      } else {
        bool3 = true;
      }
    }
    else
    {
      paramView = d;
      if (paramView.isEnabled())
      {
        i = paramMotionEvent.getActionMasked();
        if (i != 0)
        {
          if (i != 1) {
            if (i != 2)
            {
              if (i != 3) {
                break label472;
              }
            }
            else
            {
              i = paramMotionEvent.findPointerIndex(p);
              if (i < 0) {
                break label472;
              }
              float f1 = paramMotionEvent.getX(i);
              float f2 = paramMotionEvent.getY(i);
              float f3 = a;
              float f4 = -f3;
              if ((f1 >= f4) && (f2 >= f4) && (f1 < paramView.getRight() - paramView.getLeft() + f3) && (f2 < paramView.getBottom() - paramView.getTop() + f3)) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0) {
                break label472;
              }
              a();
              paramView.getParent().requestDisallowInterceptTouchEvent(true);
              i = 1;
              break label475;
            }
          }
          a();
        }
        else
        {
          p = paramMotionEvent.getPointerId(0);
          if (e == null) {
            e = new a();
          }
          paramView.postDelayed(e, b);
          if (f == null) {
            f = new b();
          }
          paramView.postDelayed(f, c);
        }
      }
      label472:
      i = 0;
      label475:
      if ((i != 0) && (c())) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      bool3 = bool4;
      if (bool4)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        d.onTouchEvent(paramView);
        paramView.recycle();
        bool3 = bool4;
      }
    }
    o = bool3;
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
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    o = false;
    p = -1;
    paramView = e;
    if (paramView != null) {
      d.removeCallbacks(paramView);
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      ViewParent localViewParent = d.getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      l0 locall0 = l0.this;
      locall0.a();
      View localView = d;
      if ((localView.isEnabled()) && (!localView.isLongClickable()) && (locall0.c()))
      {
        localView.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        o = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */