package j0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import e0.d0;

public abstract class a
  implements View.OnTouchListener
{
  public static final int y = ;
  public final a a;
  public final AccelerateInterpolator b;
  public final View c;
  public b d;
  public float[] e;
  public float[] f;
  public int o;
  public int p;
  public float[] q;
  public float[] r;
  public float[] s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  
  public a(View paramView)
  {
    a locala = new a();
    a = locala;
    b = new AccelerateInterpolator();
    e = new float[] { 0.0F, 0.0F };
    f = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
    q = new float[] { 0.0F, 0.0F };
    r = new float[] { 0.0F, 0.0F };
    s = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
    c = paramView;
    float f1 = getSystemgetDisplayMetricsdensity;
    int i = (int)(1575.0F * f1 + 0.5F);
    int j = (int)(f1 * 315.0F + 0.5F);
    f1 = i;
    paramView = s;
    f1 /= 1000.0F;
    paramView[0] = f1;
    paramView[1] = f1;
    f1 = j;
    paramView = r;
    f1 /= 1000.0F;
    paramView[0] = f1;
    paramView[1] = f1;
    o = 1;
    paramView = f;
    paramView[0] = Float.MAX_VALUE;
    paramView[1] = Float.MAX_VALUE;
    paramView = e;
    paramView[0] = 0.2F;
    paramView[1] = 0.2F;
    paramView = q;
    paramView[0] = 0.001F;
    paramView[1] = 0.001F;
    p = y;
    a = 500;
    b = 500;
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  public final float a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    float f1 = b(e[paramInt] * paramFloat2, 0.0F, f[paramInt]);
    float f2 = c(paramFloat1, f1);
    paramFloat1 = c(paramFloat2 - paramFloat1, f1) - f2;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -b.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label90;
      }
      paramFloat1 = b.getInterpolation(paramFloat1);
    }
    paramFloat1 = b(paramFloat1, -1.0F, 1.0F);
    break label92;
    label90:
    paramFloat1 = 0.0F;
    label92:
    boolean bool = paramFloat1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    f1 = q[paramInt];
    paramFloat2 = r[paramInt];
    f2 = s[paramInt];
    paramFloat3 = f1 * paramFloat3;
    if (bool) {
      return b(paramFloat1 * paramFloat3, paramFloat2, f2);
    }
    return -b(-paramFloat1 * paramFloat3, paramFloat2, f2);
  }
  
  public final float c(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i = o;
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
      if ((w) && (i == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  public final void d()
  {
    boolean bool = u;
    int i = 0;
    if (bool)
    {
      w = false;
    }
    else
    {
      a locala = a;
      locala.getClass();
      long l = AnimationUtils.currentAnimationTimeMillis();
      int j = (int)(l - e);
      int k = b;
      if (j > k) {
        i = k;
      } else if (j >= 0) {
        i = j;
      }
      i = i;
      h = locala.a(l);
      g = l;
    }
  }
  
  public final boolean e()
  {
    Object localObject = a;
    float f1 = d;
    int i = (int)(f1 / Math.abs(f1));
    f1 = c;
    int j = (int)(f1 / Math.abs(f1));
    boolean bool = true;
    if (i != 0)
    {
      localObject = z;
      int k = ((AdapterView)localObject).getCount();
      if (k == 0) {}
      int m;
      do
      {
        i = 0;
        break;
        m = ((ViewGroup)localObject).getChildCount();
        j = ((AdapterView)localObject).getFirstVisiblePosition();
      } while (i > 0 ? (j + m >= k) || (((ViewGroup)localObject).getChildAt(m - 1).getBottom() <= ((View)localObject).getHeight()) : (i >= 0) || ((j <= 0) && (((ViewGroup)localObject).getChildAt(0).getTop() >= 0)));
      i = 1;
      if (i != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!x) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          if (i != 3) {
            break label219;
          }
        }
      }
      else
      {
        d();
        break label219;
      }
    }
    else
    {
      v = true;
      t = false;
    }
    float f1 = a(paramMotionEvent.getX(), paramView.getWidth(), c.getWidth(), 0);
    float f2 = a(paramMotionEvent.getY(), paramView.getHeight(), c.getHeight(), 1);
    paramView = a;
    c = f1;
    d = f2;
    if ((!w) && (e()))
    {
      if (d == null) {
        d = new b();
      }
      w = true;
      u = true;
      if (!t)
      {
        i = p;
        if (i > 0)
        {
          paramView = c;
          b localb = d;
          long l = i;
          paramMotionEvent = d0.a;
          paramView.postOnAnimationDelayed(localb, l);
          break label214;
        }
      }
      d.run();
      label214:
      t = true;
    }
    label219:
    return false;
  }
  
  public static final class a
  {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0L;
    public long g = -1L;
    public float h;
    public int i;
    
    public final float a(long paramLong)
    {
      long l1 = e;
      if (paramLong < l1) {
        return 0.0F;
      }
      long l2 = g;
      if ((l2 >= 0L) && (paramLong >= l2))
      {
        float f1 = h;
        return a.b((float)(paramLong - l2) / i, 0.0F, 1.0F) * f1 + (1.0F - f1);
      }
      return a.b((float)(paramLong - l1) / a, 0.0F, 1.0F) * 0.5F;
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      Object localObject1 = a.this;
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
      Object localObject2 = a;
      int i;
      if ((g > 0L) && (AnimationUtils.currentAnimationTimeMillis() > g + i)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i == 0) && (e()))
      {
        localObject1 = a.this;
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
          z.scrollListBy(i);
          localObject2 = c;
          localObject1 = d0.a;
          ((View)localObject2).postOnAnimation(this);
          return;
        }
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
      }
      w = false;
    }
  }
}

/* Location:
 * Qualified Name:     j0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */