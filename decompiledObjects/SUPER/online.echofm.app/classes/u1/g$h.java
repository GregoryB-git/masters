package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public class g$h
  extends Drawable.ConstantState
{
  public int a;
  public g.g b;
  public ColorStateList c = null;
  public PorterDuff.Mode d = g.y;
  public boolean e;
  public Bitmap f;
  public ColorStateList g;
  public PorterDuff.Mode h;
  public int i;
  public boolean j;
  public boolean k;
  public Paint l;
  
  public g$h()
  {
    b = new g.g();
  }
  
  public g$h(h paramh)
  {
    if (paramh != null)
    {
      a = a;
      g.g localg = new g.g(b);
      b = localg;
      if (b.e != null) {
        e = new Paint(b.e);
      }
      if (b.d != null) {
        b.d = new Paint(b.d);
      }
      c = c;
      d = d;
      e = e;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == f.getWidth()) && (paramInt2 == f.getHeight());
  }
  
  public boolean b()
  {
    return (!k) && (g == c) && (h == d) && (j == e) && (i == b.getRootAlpha());
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    if ((f == null) || (!a(paramInt1, paramInt2)))
    {
      f = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      k = true;
    }
  }
  
  public void d(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    paramColorFilter = e(paramColorFilter);
    paramCanvas.drawBitmap(f, null, paramRect, paramColorFilter);
  }
  
  public Paint e(ColorFilter paramColorFilter)
  {
    if ((!f()) && (paramColorFilter == null)) {
      return null;
    }
    if (l == null)
    {
      Paint localPaint = new Paint();
      l = localPaint;
      localPaint.setFilterBitmap(true);
    }
    l.setAlpha(b.getRootAlpha());
    l.setColorFilter(paramColorFilter);
    return l;
  }
  
  public boolean f()
  {
    boolean bool;
    if (b.getRootAlpha() < 255) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    return b.f();
  }
  
  public int getChangingConfigurations()
  {
    return a;
  }
  
  public boolean h(int[] paramArrayOfInt)
  {
    boolean bool = b.g(paramArrayOfInt);
    k |= bool;
    return bool;
  }
  
  public void i()
  {
    g = c;
    h = d;
    i = b.getRootAlpha();
    j = e;
    k = false;
  }
  
  public void j(int paramInt1, int paramInt2)
  {
    f.eraseColor(0);
    Canvas localCanvas = new Canvas(f);
    b.b(localCanvas, paramInt1, paramInt2, null);
  }
  
  public Drawable newDrawable()
  {
    return new g(this);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new g(this);
  }
}

/* Location:
 * Qualified Name:     u1.g.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */