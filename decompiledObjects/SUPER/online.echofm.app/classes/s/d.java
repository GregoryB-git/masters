package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class d
  extends Drawable
{
  public float a;
  public final Paint b;
  public final RectF c;
  public final Rect d;
  public float e;
  public boolean f = false;
  public boolean g = true;
  public ColorStateList h;
  public PorterDuffColorFilter i;
  public ColorStateList j;
  public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  public d(ColorStateList paramColorStateList, float paramFloat)
  {
    a = paramFloat;
    b = new Paint(5);
    e(paramColorStateList);
    c = new RectF();
    d = new Rect();
  }
  
  public final PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
    }
    return null;
  }
  
  public ColorStateList b()
  {
    return h;
  }
  
  public float c()
  {
    return e;
  }
  
  public float d()
  {
    return a;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Paint localPaint = b;
    int m;
    if ((i != null) && (localPaint.getColorFilter() == null))
    {
      localPaint.setColorFilter(i);
      m = 1;
    }
    else
    {
      m = 0;
    }
    RectF localRectF = c;
    float f1 = a;
    paramCanvas.drawRoundRect(localRectF, f1, f1, localPaint);
    if (m != 0) {
      localPaint.setColorFilter(null);
    }
  }
  
  public final void e(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = paramColorStateList;
    if (paramColorStateList == null) {
      localColorStateList = ColorStateList.valueOf(0);
    }
    h = localColorStateList;
    b.setColor(localColorStateList.getColorForState(getState(), h.getDefaultColor()));
  }
  
  public void f(ColorStateList paramColorStateList)
  {
    e(paramColorStateList);
    invalidateSelf();
  }
  
  public void g(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramFloat == e) && (f == paramBoolean1) && (g == paramBoolean2)) {
      return;
    }
    e = paramFloat;
    f = paramBoolean1;
    g = paramBoolean2;
    i(null);
    invalidateSelf();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(d, a);
  }
  
  public void h(float paramFloat)
  {
    if (paramFloat == a) {
      return;
    }
    a = paramFloat;
    i(null);
    invalidateSelf();
  }
  
  public final void i(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = getBounds();
    }
    c.set(left, top, right, bottom);
    d.set(localRect);
    if (f)
    {
      float f1 = e.b(e, a, g);
      float f2 = e.a(e, a, g);
      d.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      c.set(d);
    }
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = j;
    if ((localColorStateList == null) || (!localColorStateList.isStateful()))
    {
      localColorStateList = h;
      if (((localColorStateList == null) || (!localColorStateList.isStateful())) && (!super.isStateful())) {}
    }
    else
    {
      return true;
    }
    boolean bool = false;
    return bool;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    i(paramRect);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    ColorStateList localColorStateList = h;
    int m = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
    boolean bool;
    if (m != b.getColor()) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      b.setColor(m);
    }
    localColorStateList = j;
    if (localColorStateList != null)
    {
      paramArrayOfInt = k;
      if (paramArrayOfInt != null)
      {
        i = a(localColorStateList, paramArrayOfInt);
        return true;
      }
    }
    return bool;
  }
  
  public void setAlpha(int paramInt)
  {
    b.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    b.setColorFilter(paramColorFilter);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    j = paramColorStateList;
    i = a(paramColorStateList, k);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    k = paramMode;
    i = a(j, paramMode);
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     s.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */