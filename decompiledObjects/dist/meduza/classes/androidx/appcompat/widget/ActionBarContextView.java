package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import b.a0;
import e0.d0;
import java.util.WeakHashMap;
import l.f1;
import x6.b;

public class ActionBarContextView
  extends l.a
{
  public boolean A;
  public int B;
  public CharSequence q;
  public CharSequence r;
  public View s;
  public View t;
  public View u;
  public LinearLayout v;
  public TextView w;
  public TextView x;
  public int y;
  public int z;
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968604);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a0.q, 2130968604, 0);
    if (paramAttributeSet.hasValue(0))
    {
      int i = paramAttributeSet.getResourceId(0, 0);
      if (i != 0)
      {
        paramContext = b.X(paramContext, i);
        break label54;
      }
    }
    paramContext = paramAttributeSet.getDrawable(0);
    label54:
    WeakHashMap localWeakHashMap = d0.a;
    setBackground(paramContext);
    y = paramAttributeSet.getResourceId(5, 0);
    z = paramAttributeSet.getResourceId(4, 0);
    e = paramAttributeSet.getLayoutDimension(3, 0);
    B = paramAttributeSet.getResourceId(2, 2131558405);
    paramAttributeSet.recycle();
  }
  
  public final void f(j.a parama)
  {
    Object localObject1 = s;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext()).inflate(B, this, false);
      s = ((View)localObject1);
    }
    else
    {
      if (((View)localObject1).getParent() != null) {
        break label51;
      }
      localObject1 = s;
    }
    addView((View)localObject1);
    label51:
    localObject1 = s.findViewById(2131361850);
    t = ((View)localObject1);
    ((View)localObject1).setOnClickListener(new a(parama));
    localObject1 = parama.e();
    parama = d;
    if (parama != null)
    {
      parama.h();
      parama = B;
      if ((parama != null) && (parama.b())) {
        j.dismiss();
      }
    }
    parama = new a(getContext());
    d = parama;
    t = true;
    u = true;
    parama = new ViewGroup.LayoutParams(-2, -1);
    ((androidx.appcompat.view.menu.f)localObject1).b(d, b);
    localObject1 = d;
    Object localObject2 = p;
    if (localObject2 == null)
    {
      localk = (k)d.inflate(f, this, false);
      p = localk;
      localk.b(c);
      ((a)localObject1).g();
    }
    k localk = p;
    if (localObject2 != localk) {
      ((ActionMenuView)localk).setPresenter((a)localObject1);
    }
    localObject2 = (ActionMenuView)localk;
    c = ((ActionMenuView)localObject2);
    localObject1 = d0.a;
    ((View)localObject2).setBackground(null);
    addView(c, parama);
  }
  
  public final void g()
  {
    if (v == null)
    {
      LayoutInflater.from(getContext()).inflate(2131558400, this);
      localObject = (LinearLayout)getChildAt(getChildCount() - 1);
      v = ((LinearLayout)localObject);
      w = ((TextView)((View)localObject).findViewById(2131361838));
      x = ((TextView)v.findViewById(2131361837));
      if (y != 0) {
        w.setTextAppearance(getContext(), y);
      }
      if (z != 0) {
        x.setTextAppearance(getContext(), z);
      }
    }
    w.setText(q);
    x.setText(r);
    boolean bool1 = TextUtils.isEmpty(q);
    boolean bool2 = TextUtils.isEmpty(r) ^ true;
    Object localObject = x;
    int i = 0;
    if (bool2) {
      j = 0;
    } else {
      j = 8;
    }
    ((View)localObject).setVisibility(j);
    localObject = v;
    int j = i;
    if (!(bool1 ^ true)) {
      if (bool2) {
        j = i;
      } else {
        j = 8;
      }
    }
    ((View)localObject).setVisibility(j);
    if (v.getParent() == null) {
      addView(v);
    }
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle()
  {
    return r;
  }
  
  public CharSequence getTitle()
  {
    return q;
  }
  
  public final void h()
  {
    removeAllViews();
    u = null;
    c = null;
    d = null;
    View localView = t;
    if (localView != null) {
      localView.setOnClickListener(null);
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = d;
    if (localObject != null)
    {
      ((a)localObject).h();
      localObject = d.B;
      if ((localObject != null) && (((i)localObject).b())) {
        j.dismiss();
      }
    }
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = f1.a(this);
    int i;
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    Object localObject = s;
    paramInt2 = i;
    if (localObject != null)
    {
      paramInt2 = i;
      if (((View)localObject).getVisibility() != 8)
      {
        localObject = (ViewGroup.MarginLayoutParams)s.getLayoutParams();
        if (paramBoolean) {
          paramInt4 = rightMargin;
        } else {
          paramInt4 = leftMargin;
        }
        if (paramBoolean) {
          paramInt2 = leftMargin;
        } else {
          paramInt2 = rightMargin;
        }
        if (paramBoolean) {
          paramInt4 = i - paramInt4;
        } else {
          paramInt4 = i + paramInt4;
        }
        paramInt4 = l.a.d(s, paramInt4, j, k, paramBoolean) + paramInt4;
        if (paramBoolean) {
          paramInt2 = paramInt4 - paramInt2;
        } else {
          paramInt2 = paramInt4 + paramInt2;
        }
      }
    }
    localObject = v;
    paramInt4 = paramInt2;
    if (localObject != null)
    {
      paramInt4 = paramInt2;
      if (u == null)
      {
        paramInt4 = paramInt2;
        if (((View)localObject).getVisibility() != 8) {
          paramInt4 = paramInt2 + l.a.d(v, paramInt2, j, k, paramBoolean);
        }
      }
    }
    localObject = u;
    if (localObject != null) {
      l.a.d((View)localObject, paramInt4, j, k, paramBoolean);
    }
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    }
    localObject = c;
    if (localObject != null) {
      l.a.d((View)localObject, paramInt1, j, k, paramBoolean ^ true);
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824)
    {
      if (View.MeasureSpec.getMode(paramInt2) != 0)
      {
        int k = View.MeasureSpec.getSize(paramInt1);
        i = e;
        if (i <= 0) {
          i = View.MeasureSpec.getSize(paramInt2);
        }
        paramInt1 = getPaddingTop();
        int m = getPaddingBottom() + paramInt1;
        paramInt1 = k - getPaddingLeft() - getPaddingRight();
        int n = i - m;
        int i1 = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        localObject = s;
        int i2 = 0;
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt1 = l.a.c((View)localObject, paramInt1, i1);
          localObject = (ViewGroup.MarginLayoutParams)s.getLayoutParams();
          paramInt2 = paramInt1 - (leftMargin + rightMargin);
        }
        localObject = c;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          paramInt1 = paramInt2;
          if (((View)localObject).getParent() == this) {
            paramInt1 = l.a.c(c, paramInt2, i1);
          }
        }
        localObject = v;
        paramInt2 = paramInt1;
        int i3;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (u == null) {
            if (A)
            {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              v.measure(paramInt2, i1);
              i3 = v.getMeasuredWidth();
              if (i3 <= paramInt1) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              paramInt2 = paramInt1;
              if (i1 != 0) {
                paramInt2 = paramInt1 - i3;
              }
              localObject = v;
              if (i1 != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              }
              ((View)localObject).setVisibility(paramInt1);
            }
            else
            {
              paramInt2 = l.a.c((View)localObject, paramInt1, i1);
            }
          }
        }
        localObject = u;
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
          u.measure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        }
        if (e <= 0)
        {
          j = getChildCount();
          paramInt1 = 0;
          paramInt2 = i2;
          for (;;)
          {
            i = paramInt1;
            if (paramInt2 >= j) {
              break;
            }
            i1 = getChildAt(paramInt2).getMeasuredHeight() + m;
            i = paramInt1;
            if (i1 > paramInt1) {
              i = i1;
            }
            paramInt2++;
            paramInt1 = i;
          }
        }
        setMeasuredDimension(k, i);
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
    e = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = u;
    if (localObject != null) {
      removeView((View)localObject);
    }
    u = paramView;
    if (paramView != null)
    {
      localObject = v;
      if (localObject != null)
      {
        removeView((View)localObject);
        v = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    r = paramCharSequence;
    g();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    q = paramCharSequence;
    g();
    d0.i(this, paramCharSequence);
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != A) {
      requestLayout();
    }
    A = paramBoolean;
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final class a
    implements View.OnClickListener
  {
    public a() {}
    
    public final void onClick(View paramView)
    {
      c();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarContextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */