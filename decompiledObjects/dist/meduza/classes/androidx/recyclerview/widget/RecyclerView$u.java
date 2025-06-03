package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import e0.d0;
import java.util.ArrayList;

public final class RecyclerView$u
  implements Runnable
{
  public int a;
  public int b;
  public OverScroller c;
  public Interpolator d;
  public boolean e;
  public boolean f;
  
  public RecyclerView$u(RecyclerView paramRecyclerView)
  {
    RecyclerView.b localb = RecyclerView.u0;
    d = localb;
    e = false;
    f = false;
    c = new OverScroller(paramRecyclerView.getContext(), localb);
  }
  
  public final void run()
  {
    Object localObject1 = o;
    if (q == null)
    {
      ((View)localObject1).removeCallbacks(this);
      c.abortAnimation();
      return;
    }
    f = false;
    e = true;
    ((RecyclerView)localObject1).d();
    localObject1 = c;
    Object localObject3;
    if (((OverScroller)localObject1).computeScrollOffset())
    {
      int i = ((OverScroller)localObject1).getCurrX();
      int j = ((OverScroller)localObject1).getCurrY();
      int k = i - a;
      int m = j - b;
      a = i;
      b = j;
      Object localObject2 = o;
      localObject3 = p0;
      localObject3[0] = 0;
      localObject3[1] = 0;
      i = k;
      j = m;
      if (((RecyclerView)localObject2).f(k, m, (int[])localObject3, null, 1))
      {
        localObject3 = o.p0;
        i = k - localObject3[0];
        j = m - localObject3[1];
      }
      if (o.getOverScrollMode() != 2) {
        o.c(i, j);
      }
      o.getClass();
      if (!o.t.isEmpty()) {
        o.invalidate();
      }
      localObject2 = o;
      localObject3 = p0;
      localObject3[0] = 0;
      localObject3[1] = 0;
      ((RecyclerView)localObject2).g(0, 0, i, j, null, 1, (int[])localObject3);
      localObject3 = o;
      localObject2 = p0;
      k = i - localObject2[0];
      m = j - localObject2[1];
      if (!RecyclerView.a((RecyclerView)localObject3)) {
        o.invalidate();
      }
      if (((OverScroller)localObject1).getCurrX() == ((OverScroller)localObject1).getFinalX()) {
        j = 1;
      } else {
        j = 0;
      }
      if (((OverScroller)localObject1).getCurrY() == ((OverScroller)localObject1).getFinalY()) {
        i = 1;
      } else {
        i = 0;
      }
      if ((!((OverScroller)localObject1).isFinished()) && (((j == 0) && (k == 0)) || ((i == 0) && (m == 0)))) {
        j = 0;
      } else {
        j = 1;
      }
      o.q.getClass();
      if (j != 0)
      {
        if (o.getOverScrollMode() != 2)
        {
          i = (int)((OverScroller)localObject1).getCurrVelocity();
          if (k < 0) {
            j = -i;
          } else if (k > 0) {
            j = i;
          } else {
            j = 0;
          }
          if (m < 0) {
            i = -i;
          } else if (m <= 0) {
            i = 0;
          }
          localObject3 = o;
          if (j < 0)
          {
            ((RecyclerView)localObject3).i();
            if (K.isFinished()) {
              K.onAbsorb(-j);
            }
          }
          else if (j > 0)
          {
            ((RecyclerView)localObject3).j();
            if (M.isFinished()) {
              M.onAbsorb(j);
            }
          }
          if (i < 0)
          {
            ((RecyclerView)localObject3).k();
            if (L.isFinished()) {
              L.onAbsorb(-i);
            }
          }
          else if (i > 0)
          {
            ((RecyclerView)localObject3).h();
            if (N.isFinished()) {
              N.onAbsorb(i);
            }
          }
          else
          {
            localObject3.getClass();
          }
          if ((j != 0) || (i != 0))
          {
            localObject1 = d0.a;
            ((View)localObject3).postInvalidateOnAnimation();
          }
        }
        localObject1 = o.h0;
        localObject1.getClass();
        c = 0;
      }
      else
      {
        if (e)
        {
          f = true;
        }
        else
        {
          o.removeCallbacks(this);
          localObject1 = o;
          localObject3 = d0.a;
          ((View)localObject1).postOnAnimation(this);
        }
        localObject1 = o;
        localObject3 = g0;
        if (localObject3 != null) {
          ((e)localObject3).a((RecyclerView)localObject1, 0, 0);
        }
      }
    }
    o.q.getClass();
    e = false;
    if (f)
    {
      o.removeCallbacks(this);
      localObject3 = o;
      localObject1 = d0.a;
      ((View)localObject3).postOnAnimation(this);
    }
    else
    {
      o.setScrollState(0);
      o.A(1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */