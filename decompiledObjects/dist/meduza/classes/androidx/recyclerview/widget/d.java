package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import e0.d0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class d
  extends RecyclerView.i
  implements RecyclerView.m
{
  public static final int[] x = { 16842919 };
  public static final int[] y = new int[0];
  public final int a;
  public final StateListDrawable b;
  public final Drawable c;
  public final int d;
  public final int e;
  public final StateListDrawable f;
  public final Drawable g;
  public final int h;
  public final int i;
  public float j;
  public float k;
  public int l = 0;
  public int m = 0;
  public RecyclerView n;
  public boolean o = false;
  public boolean p = false;
  public int q = 0;
  public int r = 0;
  public final int[] s = new int[2];
  public final int[] t = new int[2];
  public final ValueAnimator u;
  public int v;
  public final a w;
  
  public d(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3)
  {
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    u = localValueAnimator;
    v = 0;
    a locala = new a();
    w = locala;
    b localb = new b();
    b = paramStateListDrawable1;
    c = paramDrawable1;
    f = paramStateListDrawable2;
    g = paramDrawable2;
    d = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    e = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    h = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    i = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    a = paramInt3;
    paramStateListDrawable1.setAlpha(255);
    paramDrawable1.setAlpha(255);
    localValueAnimator.addListener(new c());
    localValueAnimator.addUpdateListener(new d());
    paramDrawable1 = n;
    if (paramDrawable1 != paramRecyclerView)
    {
      if (paramDrawable1 != null)
      {
        paramStateListDrawable1 = q;
        if (paramStateListDrawable1 != null) {
          paramStateListDrawable1.a("Cannot remove item decoration during a scroll  or layout");
        }
        t.remove(this);
        if (t.isEmpty())
        {
          boolean bool;
          if (paramDrawable1.getOverScrollMode() == 2) {
            bool = true;
          } else {
            bool = false;
          }
          paramDrawable1.setWillNotDraw(bool);
        }
        paramDrawable1.q();
        paramDrawable1.requestLayout();
        paramStateListDrawable1 = n;
        u.remove(this);
        if (v == this) {
          v = null;
        }
        paramStateListDrawable1 = n.j0;
        if (paramStateListDrawable1 != null) {
          paramStateListDrawable1.remove(localb);
        }
        n.removeCallbacks(locala);
      }
      n = paramRecyclerView;
      if (paramRecyclerView != null)
      {
        paramStateListDrawable1 = q;
        if (paramStateListDrawable1 != null) {
          paramStateListDrawable1.a("Cannot add item decoration during a scroll  or layout");
        }
        if (t.isEmpty()) {
          paramRecyclerView.setWillNotDraw(false);
        }
        t.add(this);
        paramRecyclerView.q();
        paramRecyclerView.requestLayout();
        n.u.add(this);
        paramRecyclerView = n;
        if (j0 == null) {
          j0 = new ArrayList();
        }
        j0.add(localb);
      }
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    if (q == 0) {
      return;
    }
    if (paramMotionEvent.getAction() == 0)
    {
      boolean bool1 = f(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = e(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((bool1) || (bool2))
      {
        if (bool2)
        {
          r = 1;
          k = ((int)paramMotionEvent.getX());
        }
        else if (bool1)
        {
          r = 2;
          j = ((int)paramMotionEvent.getY());
        }
        h(2);
      }
    }
    else if ((paramMotionEvent.getAction() == 1) && (q == 2))
    {
      j = 0.0F;
      k = 0.0F;
      h(1);
      r = 0;
    }
    else if ((paramMotionEvent.getAction() == 2) && (q == 2))
    {
      i();
      float f1;
      int i1;
      int i2;
      float f2;
      int i3;
      int i4;
      if (r == 1)
      {
        f1 = paramMotionEvent.getX();
        int[] arrayOfInt = t;
        i1 = a;
        arrayOfInt[0] = i1;
        i2 = l - i1;
        arrayOfInt[1] = i2;
        f1 = Math.max(i1, Math.min(i2, f1));
        if (Math.abs(0 - f1) >= 2.0F)
        {
          f2 = k;
          i1 = n.computeHorizontalScrollRange();
          i2 = n.computeHorizontalScrollOffset();
          i3 = l;
          i4 = arrayOfInt[1] - arrayOfInt[0];
          if (i4 != 0)
          {
            f2 = (f1 - f2) / i4;
            i4 = i1 - i3;
            i1 = (int)(f2 * i4);
            i2 += i1;
            if ((i2 < i4) && (i2 >= 0)) {}
          }
          else
          {
            i1 = 0;
          }
          if (i1 != 0) {
            n.scrollBy(i1, 0);
          }
          k = f1;
        }
      }
      if (r == 2)
      {
        f1 = paramMotionEvent.getY();
        paramMotionEvent = s;
        i2 = a;
        paramMotionEvent[0] = i2;
        i1 = m - i2;
        paramMotionEvent[1] = i1;
        f1 = Math.max(i2, Math.min(i1, f1));
        if (Math.abs(0 - f1) >= 2.0F)
        {
          f2 = j;
          i3 = n.computeVerticalScrollRange();
          i2 = n.computeVerticalScrollOffset();
          i4 = m;
          i1 = paramMotionEvent[1] - paramMotionEvent[0];
          if (i1 != 0)
          {
            f2 = (f1 - f2) / i1;
            i4 = i3 - i4;
            i1 = (int)(f2 * i4);
            i2 += i1;
            if ((i2 < i4) && (i2 >= 0)) {}
          }
          else
          {
            i1 = 0;
          }
          if (i1 != 0) {
            n.scrollBy(0, i1);
          }
          j = f1;
        }
      }
    }
  }
  
  public final void b() {}
  
  public final boolean c(MotionEvent paramMotionEvent)
  {
    int i1 = q;
    boolean bool1 = true;
    if (i1 == 1)
    {
      boolean bool2 = f(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool3 = e(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((paramMotionEvent.getAction() == 0) && ((bool2) || (bool3)))
      {
        if (bool3)
        {
          r = 1;
          k = ((int)paramMotionEvent.getX());
        }
        else if (bool2)
        {
          r = 2;
          j = ((int)paramMotionEvent.getY());
        }
        h(2);
        return bool1;
      }
    }
    else if (i1 == 2)
    {
      return bool1;
    }
    bool1 = false;
    return bool1;
  }
  
  public final void d(Canvas paramCanvas)
  {
    if ((l == n.getWidth()) && (m == n.getHeight()))
    {
      if (v != 0)
      {
        int i1;
        int i2;
        int i3;
        if (o)
        {
          i1 = l;
          i2 = d;
          i1 -= i2;
          i3 = 0 - 0 / 2;
          b.setBounds(0, 0, i2, 0);
          c.setBounds(0, 0, e, m);
          RecyclerView localRecyclerView = n;
          WeakHashMap localWeakHashMap = d0.a;
          int i4 = localRecyclerView.getLayoutDirection();
          i2 = 1;
          if (i4 != 1) {
            i2 = 0;
          }
          if (i2 != 0)
          {
            c.draw(paramCanvas);
            paramCanvas.translate(d, i3);
            paramCanvas.scale(-1.0F, 1.0F);
            b.draw(paramCanvas);
            paramCanvas.scale(-1.0F, 1.0F);
            i2 = d;
          }
          else
          {
            paramCanvas.translate(i1, 0.0F);
            c.draw(paramCanvas);
            paramCanvas.translate(0.0F, i3);
            b.draw(paramCanvas);
            i2 = i1;
          }
          paramCanvas.translate(-i2, -i3);
        }
        if (p)
        {
          i1 = m;
          i2 = h;
          i1 -= i2;
          i3 = 0 - 0 / 2;
          f.setBounds(0, 0, 0, i2);
          g.setBounds(0, 0, l, i);
          paramCanvas.translate(0.0F, i1);
          g.draw(paramCanvas);
          paramCanvas.translate(i3, 0.0F);
          f.draw(paramCanvas);
          paramCanvas.translate(-i3, -i1);
        }
      }
      return;
    }
    l = n.getWidth();
    m = n.getHeight();
    h(0);
  }
  
  public final boolean e(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if ((paramFloat2 >= m - h) && (paramFloat1 >= 0 - 0 / 2) && (paramFloat1 <= 0 / 2 + 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f(float paramFloat1, float paramFloat2)
  {
    RecyclerView localRecyclerView = n;
    WeakHashMap localWeakHashMap = d0.a;
    int i1 = localRecyclerView.getLayoutDirection();
    boolean bool1 = false;
    if (i1 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      bool2 = bool1;
      if (paramFloat1 > d) {
        break label111;
      }
    }
    else
    {
      bool2 = bool1;
      if (paramFloat1 < l - d) {
        break label111;
      }
    }
    i1 = 0 / 2;
    boolean bool2 = bool1;
    if (paramFloat2 >= 0 - i1)
    {
      bool2 = bool1;
      if (paramFloat2 <= i1 + 0) {
        bool2 = true;
      }
    }
    label111:
    return bool2;
  }
  
  public final void g(int paramInt)
  {
    n.removeCallbacks(w);
    n.postDelayed(w, paramInt);
  }
  
  public final void h(int paramInt)
  {
    if ((paramInt == 2) && (q != 2))
    {
      b.setState(x);
      n.removeCallbacks(w);
    }
    if (paramInt == 0) {
      n.invalidate();
    } else {
      i();
    }
    int i1;
    if ((q == 2) && (paramInt != 2))
    {
      b.setState(y);
      i1 = 1200;
    }
    else
    {
      if (paramInt != 1) {
        break label99;
      }
      i1 = 1500;
    }
    g(i1);
    label99:
    q = paramInt;
  }
  
  public final void i()
  {
    int i1 = v;
    if (i1 != 0)
    {
      if (i1 == 3) {
        u.cancel();
      }
    }
    else
    {
      v = 1;
      ValueAnimator localValueAnimator = u;
      localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 1.0F });
      u.setDuration(500L);
      u.setStartDelay(0L);
      u.start();
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      d locald = d.this;
      int i = v;
      if (i != 1)
      {
        if (i != 2) {
          return;
        }
      }
      else {
        u.cancel();
      }
      v = 3;
      ValueAnimator localValueAnimator = u;
      localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 0.0F });
      u.setDuration('Ǵ');
      u.start();
    }
  }
  
  public final class b
    extends RecyclerView.n
  {
    public b() {}
  }
  
  public final class c
    extends AnimatorListenerAdapter
  {
    public boolean a = false;
    
    public c() {}
    
    public final void onAnimationCancel(Animator paramAnimator)
    {
      a = true;
    }
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      if (a)
      {
        a = false;
        return;
      }
      if (((Float)u.getAnimatedValue()).floatValue() == 0.0F)
      {
        paramAnimator = d.this;
        v = 0;
        paramAnimator.h(0);
      }
      else
      {
        paramAnimator = d.this;
        v = 2;
        n.invalidate();
      }
    }
  }
  
  public final class d
    implements ValueAnimator.AnimatorUpdateListener
  {
    public d() {}
    
    public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      b.setAlpha(i);
      c.setAlpha(i);
      n.invalidate();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */