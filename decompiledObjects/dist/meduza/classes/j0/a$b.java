package j0;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import e0.d0;

public final class a$b
  implements Runnable
{
  public a$b(a parama) {}
  
  public final void run()
  {
    Object localObject1 = a;
    if (!w) {
      return;
    }
    long l1;
    if (u)
    {
      u = false;
      localObject1 = a;
      localObject1.getClass();
      l1 = AnimationUtils.currentAnimationTimeMillis();
      e = l1;
      g = -1L;
      f = l1;
      h = 0.5F;
    }
    Object localObject2 = a.a;
    int i;
    if ((g > 0L) && (AnimationUtils.currentAnimationTimeMillis() > g + i)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) && (a.e()))
    {
      localObject1 = a;
      if (v)
      {
        v = false;
        l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        c.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      if (f != 0L)
      {
        l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = ((a.a)localObject2).a(l1);
        long l2 = f;
        f = l1;
        i = (int)((float)(l1 - l2) * (f * 4.0F + -4.0F * f * f) * d);
        a).z.scrollListBy(i);
        localObject2 = a.c;
        localObject1 = d0.a;
        ((View)localObject2).postOnAnimation(this);
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    a.w = false;
  }
}

/* Location:
 * Qualified Name:     j0.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */