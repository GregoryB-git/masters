package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import e0.d0;
import java.util.WeakHashMap;

public class AlertDialogLayout
  extends b
{
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public static int i(View paramView)
  {
    WeakHashMap localWeakHashMap = d0.a;
    int i = paramView.getMinimumHeight();
    if (i > 0) {
      return i;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      if (paramView.getChildCount() == 1) {
        return i(paramView.getChildAt(0));
      }
    }
    return 0;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    paramInt1 = getMeasuredHeight();
    int n = getChildCount();
    int i1 = getGravity();
    paramInt3 = i1 & 0x70;
    if (paramInt3 != 16)
    {
      if (paramInt3 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt1;
      }
    }
    else
    {
      paramInt3 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - paramInt1) / 2 + paramInt3;
    }
    Object localObject = getDividerDrawable();
    paramInt3 = 0;
    if (localObject == null) {
      paramInt2 = 0;
    } else {
      paramInt2 = ((Drawable)localObject).getIntrinsicHeight();
    }
    while (paramInt3 < n)
    {
      View localView = getChildAt(paramInt3);
      paramInt4 = paramInt1;
      if (localView != null)
      {
        paramInt4 = paramInt1;
        if (localView.getVisibility() != 8)
        {
          int i2 = localView.getMeasuredWidth();
          int i3 = localView.getMeasuredHeight();
          localObject = (b.a)localView.getLayoutParams();
          int i4 = gravity;
          paramInt4 = i4;
          if (i4 < 0) {
            paramInt4 = i1 & 0x800007;
          }
          WeakHashMap localWeakHashMap = d0.a;
          paramInt4 = Gravity.getAbsoluteGravity(paramInt4, getLayoutDirection()) & 0x7;
          if (paramInt4 != 1)
          {
            if (paramInt4 != 5)
            {
              paramInt4 = leftMargin + i;
              break label302;
            }
            paramInt4 = j - k - i2;
          }
          else
          {
            paramInt4 = (j - i - m - i2) / 2 + i + leftMargin;
          }
          paramInt4 -= rightMargin;
          label302:
          i4 = paramInt1;
          if (h(paramInt3)) {
            i4 = paramInt1 + paramInt2;
          }
          paramInt1 = i4 + topMargin;
          localView.layout(paramInt4, paramInt1, i2 + paramInt4, i3 + paramInt1);
          paramInt4 = i3 + bottomMargin + paramInt1;
        }
      }
      paramInt3++;
      paramInt1 = paramInt4;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4;
    for (int k = 0; k < i; k++)
    {
      localObject4 = getChildAt(k);
      if (((View)localObject4).getVisibility() != 8)
      {
        m = ((View)localObject4).getId();
        if (m == 2131362055)
        {
          localObject1 = localObject4;
        }
        else if (m == 2131361877)
        {
          localObject2 = localObject4;
        }
        else
        {
          if (((m != 2131361887) && (m != 2131361889)) || (localObject3 != null))
          {
            k = j;
            break label692;
          }
          localObject3 = localObject4;
        }
      }
    }
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    k = getPaddingTop();
    int m = getPaddingBottom() + k;
    if (localObject1 != null)
    {
      ((View)localObject1).measure(paramInt1, 0);
      m += ((View)localObject1).getMeasuredHeight();
      j = View.combineMeasuredStates(0, ((View)localObject1).getMeasuredState());
    }
    else
    {
      j = 0;
    }
    int i3;
    if (localObject2 != null)
    {
      ((View)localObject2).measure(paramInt1, 0);
      k = i((View)localObject2);
      i3 = ((View)localObject2).getMeasuredHeight() - k;
      m += k;
      j = View.combineMeasuredStates(j, ((View)localObject2).getMeasuredState());
    }
    else
    {
      k = 0;
      i3 = k;
    }
    int i5;
    if (localObject3 != null)
    {
      if (n == 0) {
        i4 = 0;
      } else {
        i4 = View.MeasureSpec.makeMeasureSpec(Math.max(0, i1 - m), n);
      }
      ((View)localObject3).measure(paramInt1, i4);
      i5 = ((View)localObject3).getMeasuredHeight();
      m += i5;
      j = View.combineMeasuredStates(j, ((View)localObject3).getMeasuredState());
    }
    else
    {
      i5 = 0;
    }
    int i6 = i1 - m;
    i1 = j;
    int i7 = i6;
    int i4 = m;
    if (localObject2 != null)
    {
      i3 = Math.min(i6, i3);
      i1 = i6;
      i4 = k;
      if (i3 > 0)
      {
        i1 = i6 - i3;
        i4 = k + i3;
      }
      ((View)localObject2).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
      i4 = m - k + ((View)localObject2).getMeasuredHeight();
      k = View.combineMeasuredStates(j, ((View)localObject2).getMeasuredState());
      i7 = i1;
      i1 = k;
    }
    j = i1;
    k = i4;
    if (localObject3 != null)
    {
      j = i1;
      k = i4;
      if (i7 > 0)
      {
        ((View)localObject3).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i5 + i7, n));
        k = i4 - i5 + ((View)localObject3).getMeasuredHeight();
        j = View.combineMeasuredStates(i1, ((View)localObject3).getMeasuredState());
      }
    }
    i1 = 0;
    for (m = i1; i1 < i; m = i4)
    {
      localObject4 = getChildAt(i1);
      i4 = m;
      if (((View)localObject4).getVisibility() != 8) {
        i4 = Math.max(m, ((View)localObject4).getMeasuredWidth());
      }
      i1++;
    }
    i4 = getPaddingLeft();
    setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + i4 + m, paramInt1, j), View.resolveSizeAndState(k, paramInt2, 0));
    if (i2 != 1073741824)
    {
      j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
      for (k = 0; k < i; k++)
      {
        localObject3 = getChildAt(k);
        if (((View)localObject3).getVisibility() != 8)
        {
          localObject4 = (b.a)((View)localObject3).getLayoutParams();
          if (width == -1)
          {
            m = height;
            height = ((View)localObject3).getMeasuredHeight();
            measureChildWithMargins((View)localObject3, j, 0, paramInt2, 0);
            height = m;
          }
        }
      }
    }
    k = 1;
    label692:
    if (k == 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AlertDialogLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */