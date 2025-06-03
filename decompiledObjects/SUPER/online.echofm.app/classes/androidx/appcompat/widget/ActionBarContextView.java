package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import e.e;
import e.f;
import e.i;
import l.X;
import l.d0;

public class ActionBarContextView
  extends l.a
{
  public TextView A;
  public TextView B;
  public int C;
  public int D;
  public boolean E;
  public int F;
  public CharSequence v;
  public CharSequence w;
  public View x;
  public View y;
  public LinearLayout z;
  
  public ActionBarContextView(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, e.a.d);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = X.s(paramContext, paramAttributeSet, i.w, paramInt, 0);
    s.E(this, paramContext.f(i.x));
    C = paramContext.l(i.B, 0);
    D = paramContext.l(i.A, 0);
    s = paramContext.k(i.z, 0);
    F = paramContext.l(i.y, f.d);
    paramContext.t();
  }
  
  public final void d()
  {
    if (z == null)
    {
      LayoutInflater.from(getContext()).inflate(f.a, this);
      localObject = (LinearLayout)getChildAt(getChildCount() - 1);
      z = ((LinearLayout)localObject);
      A = ((TextView)((View)localObject).findViewById(e.e));
      B = ((TextView)z.findViewById(e.d));
      if (C != 0) {
        A.setTextAppearance(getContext(), C);
      }
      if (D != 0) {
        B.setTextAppearance(getContext(), D);
      }
    }
    A.setText(v);
    B.setText(w);
    boolean bool1 = TextUtils.isEmpty(v);
    boolean bool2 = TextUtils.isEmpty(w) ^ true;
    Object localObject = B;
    int i = 8;
    int j;
    if (bool2) {
      j = 0;
    } else {
      j = 8;
    }
    ((View)localObject).setVisibility(j);
    localObject = z;
    if (!(bool1 ^ true))
    {
      j = i;
      if (!bool2) {}
    }
    else
    {
      j = 0;
    }
    ((View)localObject).setVisibility(j);
    if (z.getParent() == null) {
      addView(z);
    }
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle()
  {
    return w;
  }
  
  public CharSequence getTitle()
  {
    return v;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a locala = r;
    if (locala != null)
    {
      locala.z();
      r.A();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramAccessibilityEvent.setSource(this);
      paramAccessibilityEvent.setClassName(getClass().getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(v);
    }
    else
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = d0.a(this);
    int i;
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    Object localObject = x;
    paramInt2 = i;
    if (localObject != null)
    {
      paramInt2 = i;
      if (((View)localObject).getVisibility() != 8)
      {
        localObject = (ViewGroup.MarginLayoutParams)x.getLayoutParams();
        if (paramBoolean) {
          paramInt2 = rightMargin;
        } else {
          paramInt2 = leftMargin;
        }
        if (paramBoolean) {
          paramInt4 = leftMargin;
        } else {
          paramInt4 = rightMargin;
        }
        paramInt2 = l.a.b(i, paramInt2, paramBoolean);
        paramInt2 = l.a.b(paramInt2 + c(x, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
      }
    }
    paramInt4 = paramInt2;
    localObject = z;
    paramInt2 = paramInt4;
    if (localObject != null)
    {
      paramInt2 = paramInt4;
      if (y == null)
      {
        paramInt2 = paramInt4;
        if (((View)localObject).getVisibility() != 8) {
          paramInt2 = paramInt4 + c(z, paramInt4, j, k, paramBoolean);
        }
      }
    }
    localObject = y;
    if (localObject != null) {
      c((View)localObject, paramInt2, j, k, paramBoolean);
    }
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    }
    localObject = q;
    if (localObject != null) {
      c((View)localObject, paramInt1, j, k, paramBoolean ^ true);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824)
    {
      if (View.MeasureSpec.getMode(paramInt2) != 0)
      {
        int k = View.MeasureSpec.getSize(paramInt1);
        i = s;
        if (i <= 0) {
          i = View.MeasureSpec.getSize(paramInt2);
        }
        int m = getPaddingTop() + getPaddingBottom();
        paramInt1 = k - getPaddingLeft() - getPaddingRight();
        int n = i - m;
        int i1 = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        localObject = x;
        int i2 = 0;
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt1 = a((View)localObject, paramInt1, i1, 0);
          localObject = (ViewGroup.MarginLayoutParams)x.getLayoutParams();
          paramInt2 = paramInt1 - (leftMargin + rightMargin);
        }
        localObject = q;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          paramInt1 = paramInt2;
          if (((View)localObject).getParent() == this) {
            paramInt1 = a(q, paramInt2, i1, 0);
          }
        }
        localObject = z;
        paramInt2 = paramInt1;
        int i3;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (y == null) {
            if (E)
            {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              z.measure(paramInt2, i1);
              i3 = z.getMeasuredWidth();
              if (i3 <= paramInt1) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              paramInt2 = paramInt1;
              if (i1 != 0) {
                paramInt2 = paramInt1 - i3;
              }
              localObject = z;
              if (i1 != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              }
              ((View)localObject).setVisibility(paramInt1);
            }
            else
            {
              paramInt2 = a((View)localObject, paramInt1, i1, 0);
            }
          }
        }
        localObject = y;
        if (localObject != null)
        {
          localObject = ((View)localObject).getLayoutParams();
          i3 = width;
          if (i3 != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          }
          i1 = paramInt2;
          if (i3 >= 0) {
            i1 = Math.min(i3, paramInt2);
          }
          i3 = height;
          if (i3 != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          }
          j = n;
          if (i3 >= 0) {
            j = Math.min(i3, n);
          }
          y.measure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        }
        if (s <= 0)
        {
          j = getChildCount();
          i = 0;
          paramInt1 = i2;
          while (paramInt1 < j)
          {
            i1 = getChildAt(paramInt1).getMeasuredHeight() + m;
            paramInt2 = i;
            if (i1 > i) {
              paramInt2 = i1;
            }
            paramInt1++;
            i = paramInt2;
          }
          setMeasuredDimension(k, i);
        }
        else
        {
          setMeasuredDimension(k, i);
        }
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(getClass().getSimpleName());
      ((StringBuilder)localObject).append(" can only be used with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(getClass().getSimpleName());
    ((StringBuilder)localObject).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void setContentHeight(int paramInt)
  {
    s = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = y;
    if (localObject != null) {
      removeView((View)localObject);
    }
    y = paramView;
    if (paramView != null)
    {
      localObject = z;
      if (localObject != null)
      {
        removeView((View)localObject);
        z = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    w = paramCharSequence;
    d();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    v = paramCharSequence;
    d();
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != E) {
      requestLayout();
    }
    E = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarContextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */