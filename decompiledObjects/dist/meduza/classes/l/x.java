package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import b.a0;
import e0.d0;
import y.a.a;
import y.a.b;

public final class x
  extends s
{
  public final SeekBar d;
  public Drawable e;
  public ColorStateList f = null;
  public PorterDuff.Mode g = null;
  public boolean h = false;
  public boolean i = false;
  
  public x(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    d = paramSeekBar;
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, 2130968834);
    Object localObject1 = d.getContext();
    Object localObject2 = a0.t;
    localObject1 = z0.m((Context)localObject1, paramAttributeSet, (int[])localObject2, 2130968834);
    SeekBar localSeekBar = d;
    d0.g(localSeekBar, localSeekBar.getContext(), (int[])localObject2, paramAttributeSet, b, 2130968834);
    paramAttributeSet = ((z0)localObject1).f(0);
    if (paramAttributeSet != null) {
      d.setThumb(paramAttributeSet);
    }
    paramAttributeSet = ((z0)localObject1).e(1);
    localObject2 = e;
    if (localObject2 != null) {
      ((Drawable)localObject2).setCallback(null);
    }
    e = paramAttributeSet;
    if (paramAttributeSet != null)
    {
      paramAttributeSet.setCallback(d);
      a.b.b(paramAttributeSet, d.getLayoutDirection());
      if (paramAttributeSet.isStateful()) {
        paramAttributeSet.setState(d.getDrawableState());
      }
      c();
    }
    d.invalidate();
    if (((z0)localObject1).l(3))
    {
      g = i0.b(((z0)localObject1).h(3, -1), g);
      i = true;
    }
    if (((z0)localObject1).l(2))
    {
      f = ((z0)localObject1).b(2);
      h = true;
    }
    ((z0)localObject1).n();
    c();
  }
  
  public final void c()
  {
    Drawable localDrawable = e;
    if ((localDrawable != null) && ((h) || (i)))
    {
      localDrawable = localDrawable.mutate();
      e = localDrawable;
      if (h) {
        a.a.h(localDrawable, f);
      }
      if (i) {
        a.a.i(e, g);
      }
      if (e.isStateful()) {
        e.setState(d.getDrawableState());
      }
    }
  }
  
  public final void d(Canvas paramCanvas)
  {
    if (e != null)
    {
      int j = d.getMax();
      int k = 1;
      if (j > 1)
      {
        int m = e.getIntrinsicWidth();
        int n = e.getIntrinsicHeight();
        if (m >= 0) {
          m /= 2;
        } else {
          m = 1;
        }
        if (n >= 0) {
          k = n / 2;
        }
        e.setBounds(-m, -k, m, k);
        float f1 = (d.getWidth() - d.getPaddingLeft() - d.getPaddingRight()) / j;
        k = paramCanvas.save();
        paramCanvas.translate(d.getPaddingLeft(), d.getHeight() / 2);
        for (m = 0; m <= j; m++)
        {
          e.draw(paramCanvas);
          paramCanvas.translate(f1, 0.0F);
        }
        paramCanvas.restoreToCount(k);
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */