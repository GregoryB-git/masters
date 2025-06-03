package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

public class ContentFrameLayout
  extends FrameLayout
{
  public TypedValue o;
  public TypedValue p;
  public TypedValue q;
  public TypedValue r;
  public TypedValue s;
  public TypedValue t;
  public final Rect u = new Rect();
  
  public ContentFrameLayout(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    if (s == null) {
      s = new TypedValue();
    }
    return s;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    if (t == null) {
      t = new TypedValue();
    }
    return t;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    if (q == null) {
      q = new TypedValue();
    }
    return q;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    if (r == null) {
      r = new TypedValue();
    }
    return r;
  }
  
  public TypedValue getMinWidthMajor()
  {
    if (o == null) {
      o = new TypedValue();
    }
    return o;
  }
  
  public TypedValue getMinWidthMinor()
  {
    if (p == null) {
      p = new TypedValue();
    }
    return p;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
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
    float f;
    if (m == Integer.MIN_VALUE)
    {
      if (i != 0) {
        localObject = r;
      } else {
        localObject = q;
      }
      if (localObject != null)
      {
        j = type;
        if (j != 0)
        {
          if (j == 5) {}
          for (f = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f = ((TypedValue)localObject).getFraction(j, j))
          {
            j = (int)f;
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
            localObject = u;
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
        localObject = s;
      } else {
        localObject = t;
      }
      j = paramInt2;
      if (localObject != null)
      {
        n = type;
        j = paramInt2;
        if (n != 0)
        {
          if (n == 5) {}
          for (f = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f = ((TypedValue)localObject).getFraction(j, j))
          {
            n = (int)f;
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
            localObject = u;
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
        localObject = p;
      } else {
        localObject = o;
      }
      if (localObject != null)
      {
        paramInt1 = type;
        if (paramInt1 != 0)
        {
          if (paramInt1 == 5) {}
          for (f = ((TypedValue)localObject).getDimension(localDisplayMetrics);; f = ((TypedValue)localObject).getFraction(paramInt1, paramInt1))
          {
            paramInt1 = (int)f;
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
            localObject = u;
            paramInt2 = paramInt1 - (left + right);
          }
          if (n < paramInt2)
          {
            paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            paramInt2 = k;
            break label520;
          }
        }
      }
    }
    paramInt2 = 0;
    paramInt1 = i1;
    label520:
    if (paramInt2 != 0) {
      super.onMeasure(paramInt1, j);
    }
  }
  
  public void setAttachListener(a parama) {}
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ContentFrameLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */