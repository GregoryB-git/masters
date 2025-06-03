package L;

import I.s;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  public static final int F = ;
  public boolean A;
  public boolean B;
  public boolean C;
  public boolean D;
  public boolean E;
  public final a o = new a();
  public final Interpolator p = new AccelerateInterpolator();
  public final View q;
  public Runnable r;
  public float[] s = { 0.0F, 0.0F };
  public float[] t = { Float.MAX_VALUE, Float.MAX_VALUE };
  public int u;
  public int v;
  public float[] w = { 0.0F, 0.0F };
  public float[] x = { 0.0F, 0.0F };
  public float[] y = { Float.MAX_VALUE, Float.MAX_VALUE };
  public boolean z;
  
  public a(View paramView)
  {
    q = paramView;
    float f = getSystemgetDisplayMetricsdensity;
    int i = (int)(1575.0F * f + 0.5F);
    int j = (int)(f * 315.0F + 0.5F);
    f = i;
    o(f, f);
    f = j;
    p(f, f);
    l(1);
    n(Float.MAX_VALUE, Float.MAX_VALUE);
    s(0.2F, 0.2F);
    t(1.0F, 1.0F);
    k(F);
    r(500);
    q(500);
  }
  
  public static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  public static int f(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  public abstract boolean a(int paramInt);
  
  public abstract boolean b(int paramInt);
  
  public void c()
  {
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    q.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public final float d(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 = h(s[paramInt], paramFloat2, t[paramInt], paramFloat1);
    boolean bool = paramFloat1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    float f1 = w[paramInt];
    paramFloat2 = x[paramInt];
    float f2 = y[paramInt];
    paramFloat3 = f1 * paramFloat3;
    if (bool) {
      return e(paramFloat1 * paramFloat3, paramFloat2, f2);
    }
    return -e(-paramFloat1 * paramFloat3, paramFloat2, f2);
  }
  
  public final float g(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i = u;
    if ((i != 0) && (i != 1))
    {
      if ((i == 2) && (paramFloat1 < 0.0F)) {
        return paramFloat1 / -paramFloat2;
      }
    }
    else if (paramFloat1 < paramFloat2)
    {
      if (paramFloat1 >= 0.0F) {
        return 1.0F - paramFloat1 / paramFloat2;
      }
      if ((C) && (i == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  public final float h(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 = e(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat1 = g(paramFloat4, paramFloat3);
    paramFloat1 = g(paramFloat2 - paramFloat4, paramFloat3) - paramFloat1;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -p.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label76;
      }
      paramFloat1 = p.getInterpolation(paramFloat1);
    }
    return e(paramFloat1, -1.0F, 1.0F);
    label76:
    return 0.0F;
  }
  
  public final void i()
  {
    if (A) {
      C = false;
    } else {
      o.i();
    }
  }
  
  public abstract void j(int paramInt1, int paramInt2);
  
  public a k(int paramInt)
  {
    v = paramInt;
    return this;
  }
  
  public a l(int paramInt)
  {
    u = paramInt;
    return this;
  }
  
  public a m(boolean paramBoolean)
  {
    if ((D) && (!paramBoolean)) {
      i();
    }
    D = paramBoolean;
    return this;
  }
  
  public a n(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = t;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a o(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = y;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = D;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          if (i != 3) {
            break label140;
          }
        }
      }
      else
      {
        i();
        break label140;
      }
    }
    else
    {
      B = true;
      z = false;
    }
    float f1 = d(0, paramMotionEvent.getX(), paramView.getWidth(), q.getWidth());
    float f2 = d(1, paramMotionEvent.getY(), paramView.getHeight(), q.getHeight());
    o.l(f1, f2);
    if ((!C) && (u())) {
      v();
    }
    label140:
    bool1 = bool2;
    if (E)
    {
      bool1 = bool2;
      if (C) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public a p(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = x;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public a q(int paramInt)
  {
    o.j(paramInt);
    return this;
  }
  
  public a r(int paramInt)
  {
    o.k(paramInt);
    return this;
  }
  
  public a s(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = s;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a t(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = w;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public boolean u()
  {
    a locala = o;
    int i = locala.f();
    int j = locala.d();
    boolean bool;
    if (((i != 0) && (b(i))) || ((j != 0) && (a(j)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void v()
  {
    if (r == null) {
      r = new b();
    }
    C = true;
    A = true;
    if (!z)
    {
      int i = v;
      if (i > 0)
      {
        s.z(q, r, i);
        break label70;
      }
    }
    r.run();
    label70:
    z = true;
  }
  
  public static class a
  {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0L;
    public int g = 0;
    public int h = 0;
    public long i = -1L;
    public float j;
    public int k;
    
    public void a()
    {
      if (f != 0L)
      {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f1 = g(e(l1));
        long l2 = f;
        f = l1;
        f1 = (float)(l1 - l2) * f1;
        g = ((int)(c * f1));
        h = ((int)(f1 * d));
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public int b()
    {
      return g;
    }
    
    public int c()
    {
      return h;
    }
    
    public int d()
    {
      float f1 = c;
      return (int)(f1 / Math.abs(f1));
    }
    
    public final float e(long paramLong)
    {
      long l1 = e;
      if (paramLong < l1) {
        return 0.0F;
      }
      long l2 = i;
      if ((l2 >= 0L) && (paramLong >= l2))
      {
        float f1 = j;
        return 1.0F - f1 + f1 * a.e((float)(paramLong - l2) / k, 0.0F, 1.0F);
      }
      return a.e((float)(paramLong - l1) / a, 0.0F, 1.0F) * 0.5F;
    }
    
    public int f()
    {
      float f1 = d;
      return (int)(f1 / Math.abs(f1));
    }
    
    public final float g(float paramFloat)
    {
      return -4.0F * paramFloat * paramFloat + paramFloat * 4.0F;
    }
    
    public boolean h()
    {
      boolean bool;
      if ((i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > i + k)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void i()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      k = a.f((int)(l - e), 0, b);
      j = e(l);
      i = l;
    }
    
    public void j(int paramInt)
    {
      b = paramInt;
    }
    
    public void k(int paramInt)
    {
      a = paramInt;
    }
    
    public void l(float paramFloat1, float paramFloat2)
    {
      c = paramFloat1;
      d = paramFloat2;
    }
    
    public void m()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      e = l;
      i = -1L;
      f = l;
      j = 0.5F;
      g = 0;
      h = 0;
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      Object localObject = a.this;
      if (!C) {
        return;
      }
      if (A)
      {
        A = false;
        o.m();
      }
      localObject = o;
      if ((!((a.a)localObject).h()) && (u()))
      {
        a locala = a.this;
        if (B)
        {
          B = false;
          locala.c();
        }
        ((a.a)localObject).a();
        int i = ((a.a)localObject).b();
        int j = ((a.a)localObject).c();
        j(i, j);
        s.y(q, this);
        return;
      }
      C = false;
    }
  }
}

/* Location:
 * Qualified Name:     L.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */