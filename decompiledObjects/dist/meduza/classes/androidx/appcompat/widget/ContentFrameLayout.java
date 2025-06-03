package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.f;
import e0.o0;
import g.g;
import g.g.p;
import g.i;
import l.g0;

public class ContentFrameLayout
  extends FrameLayout
{
  public TypedValue a;
  public TypedValue b;
  public TypedValue c;
  public TypedValue d;
  public TypedValue e;
  public TypedValue f;
  public final Rect o = new Rect();
  public a p;
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    if (e == null) {
      e = new TypedValue();
    }
    return e;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    if (f == null) {
      f = new TypedValue();
    }
    return f;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    if (c == null) {
      c = new TypedValue();
    }
    return c;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    if (d == null) {
      d = new TypedValue();
    }
    return d;
  }
  
  public TypedValue getMinWidthMajor()
  {
    if (a == null) {
      a = new TypedValue();
    }
    return a;
  }
  
  public TypedValue getMinWidthMinor()
  {
    if (b == null) {
      b = new TypedValue();
    }
    return b;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a locala = p;
    if (locala != null) {
      locala.getClass();
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject1 = p;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = a;
      localObject2 = z;
      if (localObject2 != null) {
        ((g0)localObject2).i();
      }
      if (E != null)
      {
        t.getDecorView().removeCallbacks(F);
        if (!E.isShowing()) {}
      }
    }
    try
    {
      E.dismiss();
      E = null;
      localObject2 = G;
      if (localObject2 != null) {
        ((o0)localObject2).b();
      }
      localObject1 = R0h;
      if (localObject1 != null) {
        ((f)localObject1).c(true);
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int i = widthPixels;
    int j = heightPixels;
    int k = 1;
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    int m = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    Object localObject;
    float f1;
    if (m == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localObject = d;
      } else {
        localObject = c;
      }
      if (localObject != null)
      {
        j = type;
        if (j != 0)
        {
          if (j == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(j, j))
          {
            j = (int)f1;
            break label152;
            if (j != 6) {
              break;
            }
            j = widthPixels;
          }
          j = 0;
          label152:
          if (j > 0)
          {
            localObject = o;
            i1 = View.MeasureSpec.makeMeasureSpec(Math.min(j - (left + right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
            paramInt1 = 1;
            break label205;
          }
        }
      }
    }
    j = 0;
    int i1 = paramInt1;
    paramInt1 = j;
    label205:
    j = paramInt2;
    if (n == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localObject = e;
      } else {
        localObject = f;
      }
      j = paramInt2;
      if (localObject != null)
      {
        n = type;
        j = paramInt2;
        if (n != 0)
        {
          if (n == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(j, j))
          {
            n = (int)f1;
            break label312;
            if (n != 6) {
              break;
            }
            j = heightPixels;
          }
          n = 0;
          label312:
          j = paramInt2;
          if (n > 0)
          {
            localObject = o;
            j = View.MeasureSpec.makeMeasureSpec(Math.min(n - (top + bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          }
        }
      }
    }
    super.onMeasure(i1, j);
    n = getMeasuredWidth();
    i1 = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
    if ((paramInt1 == 0) && (m == Integer.MIN_VALUE))
    {
      if (i != 0) {
        localObject = b;
      } else {
        localObject = a;
      }
      if (localObject != null)
      {
        paramInt1 = type;
        if (paramInt1 != 0)
        {
          if (paramInt1 == 5) {}
          for (f1 = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f1 = ((TypedValue)localObject).getFraction(paramInt1, paramInt1))
          {
            paramInt1 = (int)f1;
            break label470;
            if (paramInt1 != 6) {
              break;
            }
            paramInt1 = widthPixels;
          }
          paramInt1 = 0;
          label470:
          paramInt2 = paramInt1;
          if (paramInt1 > 0)
          {
            localObject = o;
            paramInt2 = paramInt1 - (left + right);
          }
          if (n < paramInt2)
          {
            paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            paramInt1 = k;
            break label520;
          }
        }
      }
    }
    paramInt1 = 0;
    paramInt2 = i1;
    label520:
    if (paramInt1 != 0) {
      super.onMeasure(paramInt2, j);
    }
  }
  
  public void setAttachListener(a parama)
  {
    p = parama;
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ContentFrameLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */