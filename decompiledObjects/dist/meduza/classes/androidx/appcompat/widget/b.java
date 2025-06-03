package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout.LayoutParams;
import b.a0;
import e0.d0;
import f;
import l.f1;

public class b
  extends ViewGroup
{
  public boolean a = true;
  public int b = -1;
  public int c = 0;
  public int d;
  public int e = 8388659;
  public int f;
  public float o;
  public boolean p;
  public int[] q;
  public int[] r;
  public Drawable s;
  public int t;
  public int u;
  public int v;
  public int w;
  
  public b(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public b(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = a0.A;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    d0.g(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt);
    paramInt = localTypedArray.getInt(1, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = localTypedArray.getInt(0, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = localTypedArray.getBoolean(2, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    o = localTypedArray.getFloat(4, -1.0F);
    b = localTypedArray.getInt(3, -1);
    p = localTypedArray.getBoolean(7, false);
    if (localTypedArray.hasValue(5))
    {
      paramInt = localTypedArray.getResourceId(5, 0);
      if (paramInt != 0)
      {
        paramContext = x6.b.X(paramContext, paramInt);
        break label181;
      }
    }
    paramContext = localTypedArray.getDrawable(5);
    label181:
    setDividerDrawable(paramContext);
    v = localTypedArray.getInt(8, 0);
    w = localTypedArray.getDimensionPixelSize(6, 0);
    localTypedArray.recycle();
  }
  
  public final void c(Canvas paramCanvas, int paramInt)
  {
    s.setBounds(getPaddingLeft() + w, paramInt, getWidth() - getPaddingRight() - w, u + paramInt);
    s.draw(paramCanvas);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  public final void d(Canvas paramCanvas, int paramInt)
  {
    s.setBounds(paramInt, getPaddingTop() + w, t + paramInt, getHeight() - getPaddingBottom() - w);
    s.draw(paramCanvas);
  }
  
  public a e()
  {
    int i = d;
    if (i == 0) {
      return new a(-2, -2);
    }
    if (i == 1) {
      return new a(-1, -2);
    }
    return null;
  }
  
  public a f(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  public a g(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (b < 0) {
      return super.getBaseline();
    }
    int i = getChildCount();
    int j = b;
    if (i > j)
    {
      View localView = getChildAt(j);
      int k = localView.getBaseline();
      if (k == -1)
      {
        if (b == 0) {
          return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      }
      j = c;
      i = j;
      if (d == 1)
      {
        int m = e & 0x70;
        i = j;
        if (m != 48) {
          if (m != 16)
          {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - f;
            }
          }
          else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
          }
        }
      }
      return i + getLayoutParamstopMargin + k;
    }
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return b;
  }
  
  public Drawable getDividerDrawable()
  {
    return s;
  }
  
  public int getDividerPadding()
  {
    return w;
  }
  
  public int getDividerWidth()
  {
    return t;
  }
  
  public int getGravity()
  {
    return e;
  }
  
  public int getOrientation()
  {
    return d;
  }
  
  public int getShowDividers()
  {
    return v;
  }
  
  public int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return o;
  }
  
  public final boolean h(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramInt == 0)
    {
      if ((v & 0x1) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    if (paramInt == getChildCount())
    {
      bool3 = bool1;
      if ((v & 0x4) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if ((v & 0x2) != 0)
    {
      paramInt--;
      for (;;)
      {
        bool3 = bool2;
        if (paramInt < 0) {
          break;
        }
        if (getChildAt(paramInt).getVisibility() != 8)
        {
          bool3 = true;
          break;
        }
        paramInt--;
      }
    }
    return bool3;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (s == null) {
      return;
    }
    int i = d;
    int j = 0;
    int k = 0;
    Object localObject1;
    Object localObject2;
    if (i == 1)
    {
      j = getVirtualChildCount();
      while (k < j)
      {
        localObject1 = getChildAt(k);
        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (h(k)))
        {
          localObject2 = (a)((View)localObject1).getLayoutParams();
          c(paramCanvas, ((View)localObject1).getTop() - topMargin - u);
        }
        k++;
      }
      if (h(j))
      {
        localObject2 = getChildAt(j - 1);
        if (localObject2 == null)
        {
          k = getHeight() - getPaddingBottom() - u;
        }
        else
        {
          localObject1 = (a)((View)localObject2).getLayoutParams();
          k = ((View)localObject2).getBottom() + bottomMargin;
        }
        c(paramCanvas, k);
      }
    }
    else
    {
      i = getVirtualChildCount();
      boolean bool = f1.a(this);
      for (k = j; k < i; k++)
      {
        localObject1 = getChildAt(k);
        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (h(k)))
        {
          localObject2 = (a)((View)localObject1).getLayoutParams();
          if (bool) {
            j = ((View)localObject1).getRight() + rightMargin;
          } else {
            j = ((View)localObject1).getLeft() - leftMargin - t;
          }
          d(paramCanvas, j);
        }
      }
      if (h(i))
      {
        localObject2 = getChildAt(i - 1);
        if (localObject2 == null)
        {
          if (bool)
          {
            k = getPaddingLeft();
            break label393;
          }
          k = getWidth();
          j = getPaddingRight();
        }
        else
        {
          localObject1 = (a)((View)localObject2).getLayoutParams();
          if (!bool) {
            break label380;
          }
          k = ((View)localObject2).getLeft();
          j = leftMargin;
        }
        k = k - j - t;
        break label393;
        label380:
        k = ((View)localObject2).getRight() + rightMargin;
        label393:
        d(paramCanvas, k);
      }
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int k;
    int m;
    if (d == 1)
    {
      i = getPaddingLeft();
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      m = getPaddingRight();
      n = getVirtualChildCount();
      i1 = e;
      paramInt1 = i1 & 0x70;
      if (paramInt1 != 16)
      {
        if (paramInt1 != 80) {
          paramInt1 = getPaddingTop();
        } else {
          paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - f;
        }
      }
      else {
        paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - f) / 2;
      }
      paramInt2 = 0;
      while (paramInt2 < n)
      {
        localObject1 = getChildAt(paramInt2);
        if (localObject1 == null)
        {
          paramInt3 = paramInt1 + 0;
          paramInt4 = paramInt2;
        }
        else
        {
          paramInt3 = paramInt1;
          paramInt4 = paramInt2;
          if (((View)localObject1).getVisibility() != 8)
          {
            i2 = ((View)localObject1).getMeasuredWidth();
            i3 = ((View)localObject1).getMeasuredHeight();
            localObject2 = (a)((View)localObject1).getLayoutParams();
            paramInt4 = gravity;
            paramInt3 = paramInt4;
            if (paramInt4 < 0) {
              paramInt3 = 0x800007 & i1;
            }
            localObject3 = d0.a;
            paramInt3 = Gravity.getAbsoluteGravity(paramInt3, getLayoutDirection()) & 0x7;
            if (paramInt3 != 1)
            {
              if (paramInt3 != 5)
              {
                paramInt3 = leftMargin + i;
                break label291;
              }
              paramInt3 = j - k - i2;
            }
            else
            {
              paramInt3 = (j - i - m - i2) / 2 + i + leftMargin;
            }
            paramInt3 -= rightMargin;
            label291:
            paramInt4 = paramInt1;
            if (h(paramInt2)) {
              paramInt4 = paramInt1 + u;
            }
            paramInt1 = paramInt4 + topMargin;
            paramInt4 = paramInt1 + 0;
            ((View)localObject1).layout(paramInt3, paramInt4, i2 + paramInt3, i3 + paramInt4);
            paramInt3 = bottomMargin;
            paramInt4 = paramInt2 + 0;
            paramInt3 = i3 + paramInt3 + 0 + paramInt1;
          }
        }
        paramInt2 = paramInt4 + 1;
        paramInt1 = paramInt3;
      }
    }
    boolean bool = f1.a(this);
    int n = getPaddingTop();
    int i4 = paramInt4 - paramInt2;
    int i3 = getPaddingBottom();
    int i2 = getPaddingBottom();
    int j = getVirtualChildCount();
    paramInt2 = e;
    paramInt4 = paramInt2 & 0x70;
    paramBoolean = a;
    Object localObject3 = q;
    Object localObject2 = r;
    Object localObject1 = d0.a;
    paramInt2 = Gravity.getAbsoluteGravity(0x800007 & paramInt2, getLayoutDirection());
    if (paramInt2 != 1)
    {
      if (paramInt2 != 5) {
        paramInt1 = getPaddingLeft();
      } else {
        paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - f;
      }
    }
    else {
      paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - f) / 2;
    }
    if (bool)
    {
      i = j - 1;
      k = -1;
    }
    else
    {
      k = 1;
      i = 0;
    }
    int i1 = 0;
    paramInt2 = paramInt1;
    paramInt3 = paramInt4;
    label875:
    for (paramInt4 = i1; paramInt4 < j; paramInt4++)
    {
      int i5 = k * paramInt4 + i;
      View localView = getChildAt(i5);
      if (localView == null)
      {
        paramInt1 = paramInt2 + 0;
        paramInt2 = paramInt1;
      }
      for (;;)
      {
        break label875;
        paramInt1 = paramInt2;
        if (localView.getVisibility() == 8) {
          break;
        }
        int i6 = localView.getMeasuredWidth();
        int i7 = localView.getMeasuredHeight();
        localObject1 = (a)localView.getLayoutParams();
        if ((paramBoolean) && (height != -1)) {
          i1 = localView.getBaseline();
        } else {
          i1 = -1;
        }
        m = gravity;
        paramInt1 = m;
        if (m < 0) {
          paramInt1 = paramInt3;
        }
        paramInt1 &= 0x70;
        if (paramInt1 != 16)
        {
          if (paramInt1 != 48)
          {
            if (paramInt1 != 80)
            {
              paramInt1 = n;
            }
            else
            {
              m = i4 - i3 - i7 - bottomMargin;
              paramInt1 = m;
              if (i1 != -1)
              {
                paramInt1 = localView.getMeasuredHeight();
                paramInt1 = m - (localObject2[2] - (paramInt1 - i1));
              }
            }
          }
          else
          {
            m = topMargin + n;
            paramInt1 = m;
            if (i1 != -1) {
              paramInt1 = localObject3[1] - i1 + m;
            }
          }
        }
        else {
          paramInt1 = (i4 - n - i2 - i7) / 2 + n + topMargin - bottomMargin;
        }
        i1 = paramInt2;
        if (h(i5)) {
          i1 = paramInt2 + t;
        }
        paramInt2 = i1 + leftMargin;
        i1 = paramInt2 + 0;
        localView.layout(i1, paramInt1, i6 + i1, i7 + paramInt1);
        paramInt2 = i6 + rightMargin + 0 + paramInt2;
        paramInt4 += 0;
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    int j;
    int k;
    int m;
    boolean bool1;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    float f1;
    int i8;
    Object localObject1;
    int i9;
    label135:
    Object localObject2;
    float f2;
    int i10;
    int i11;
    int i12;
    if (d == 1)
    {
      f = 0;
      i = getVirtualChildCount();
      j = View.MeasureSpec.getMode(paramInt1);
      k = View.MeasureSpec.getMode(paramInt2);
      m = b;
      bool1 = p;
      n = 0;
      i1 = n;
      i2 = i1;
      i3 = i2;
      i4 = i3;
      i5 = i4;
      i6 = i5;
      i7 = 1;
      f1 = 0.0F;
      i8 = i6;
      while (i8 < i)
      {
        localObject1 = getChildAt(i8);
        if (localObject1 == null)
        {
          f += 0;
        }
        else
        {
          if (((View)localObject1).getVisibility() != 8) {
            break label135;
          }
          i8 += 0;
        }
        i9 = i5;
        i5 = i7;
        for (;;)
        {
          break;
          if (h(i8)) {
            f += u;
          }
          localObject2 = (a)((View)localObject1).getLayoutParams();
          f2 = weight;
          f1 += f2;
          if ((k == 1073741824) && (height == 0) && (f2 > 0.0F))
          {
            i5 = f;
            f = Math.max(i5, topMargin + i5 + bottomMargin);
            i9 = 1;
            i10 = n;
          }
          else
          {
            if ((height == 0) && (f2 > 0.0F))
            {
              height = -2;
              i9 = 0;
            }
            else
            {
              i9 = Integer.MIN_VALUE;
            }
            if (f1 == 0.0F) {
              i10 = f;
            } else {
              i10 = 0;
            }
            measureChildWithMargins((View)localObject1, paramInt1, 0, paramInt2, i10);
            if (i9 != Integer.MIN_VALUE) {
              height = i9;
            }
            i11 = ((View)localObject1).getMeasuredHeight();
            i9 = f;
            f = Math.max(i9, i9 + i11 + topMargin + bottomMargin + 0);
            i10 = n;
            i9 = i5;
            if (bool1)
            {
              i10 = Math.max(i11, n);
              i9 = i5;
            }
          }
          n = m;
          if ((n >= 0) && (n == i8 + 1)) {
            c = f;
          }
          if ((i8 < n) && (weight > 0.0F)) {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
          }
          n = j;
          if ((n != 1073741824) && (width == -1))
          {
            i5 = 1;
            i6 = 1;
          }
          else
          {
            i5 = 0;
          }
          i12 = leftMargin + rightMargin;
          i11 = ((View)localObject1).getMeasuredWidth() + i12;
          i4 = Math.max(i4, i11);
          i3 = View.combineMeasuredStates(i3, ((View)localObject1).getMeasuredState());
          if ((i7 != 0) && (width == -1)) {
            j = 1;
          } else {
            j = 0;
          }
          if (weight > 0.0F)
          {
            if (i5 != 0) {
              i11 = i12;
            }
            i7 = Math.max(i2, i11);
          }
          else
          {
            if (i5 != 0) {
              i11 = i12;
            }
            i1 = Math.max(i1, i11);
            i7 = i2;
          }
          i8 += 0;
          i5 = j;
          j = n;
          n = i10;
          i2 = i7;
        }
        i8++;
        i7 = i5;
        i5 = i9;
      }
      i8 = i4;
      if ((f > 0) && (h(i))) {
        f += u;
      }
      if (bool1)
      {
        m = k;
        if (m != Integer.MIN_VALUE)
        {
          i9 = i8;
          if (m != 0)
          {
            m = i9;
            break label822;
          }
        }
        f = 0;
        for (m = 0;; m++)
        {
          i9 = i8;
          if (m >= i) {
            break;
          }
          localObject2 = getChildAt(m);
          if (localObject2 == null)
          {
            f += 0;
          }
          else
          {
            if (((View)localObject2).getVisibility() != 8) {
              break label768;
            }
            m += 0;
          }
          continue;
          label768:
          localObject2 = (a)((View)localObject2).getLayoutParams();
          i9 = f;
          f = Math.max(i9, i9 + n + topMargin + bottomMargin + 0);
        }
      }
      else
      {
        m = i8;
      }
      label822:
      i9 = k;
      k = f;
      i8 = getPaddingTop();
      k = getPaddingBottom() + i8 + k;
      f = k;
      i4 = View.resolveSizeAndState(Math.max(k, getSuggestedMinimumHeight()), paramInt2, 0);
      i8 = (0xFFFFFF & i4) - f;
      if ((i5 == 0) && ((i8 == 0) || (f1 <= 0.0F)))
      {
        i8 = Math.max(i1, i2);
        if ((bool1) && (i9 != 1073741824)) {
          for (k = 0; k < i; k++)
          {
            localObject2 = getChildAt(k);
            if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject2).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
            }
          }
        }
        i1 = m;
        k = i8;
      }
      else
      {
        f2 = o;
        if (f2 > 0.0F) {
          f1 = f2;
        }
        f = 0;
        i5 = 0;
        k = i3;
        n = i8;
        while (i5 < i)
        {
          localObject2 = getChildAt(i5);
          if (((View)localObject2).getVisibility() != 8)
          {
            localObject1 = (a)((View)localObject2).getLayoutParams();
            float f3 = weight;
            i2 = n;
            i8 = k;
            f2 = f1;
            if (f3 > 0.0F)
            {
              i2 = (int)(n * f3 / f1);
              f2 = f1 - f3;
              i8 = getPaddingLeft();
              i10 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i8 + leftMargin + rightMargin, width);
              if ((height == 0) && (i9 == 1073741824))
              {
                if (i2 > 0)
                {
                  i8 = i2;
                  break label1223;
                }
              }
              else
              {
                i3 = ((View)localObject2).getMeasuredHeight() + i2;
                i8 = i3;
                if (i3 >= 0) {
                  break label1223;
                }
              }
              i8 = 0;
              label1223:
              ((View)localObject2).measure(i10, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
              i8 = View.combineMeasuredStates(k, ((View)localObject2).getMeasuredState() & 0xFF00);
              i2 = n - i2;
            }
            i3 = leftMargin + rightMargin;
            n = ((View)localObject2).getMeasuredWidth() + i3;
            m = Math.max(m, n);
            if ((j != 1073741824) && (width == -1)) {
              k = 1;
            } else {
              k = 0;
            }
            if (k != 0) {
              k = i3;
            } else {
              k = n;
            }
            i1 = Math.max(i1, k);
            if ((i7 != 0) && (width == -1)) {
              k = 1;
            } else {
              k = 0;
            }
            i7 = f;
            f = Math.max(i7, ((View)localObject2).getMeasuredHeight() + i7 + topMargin + bottomMargin + 0);
            f1 = f2;
            i7 = k;
            k = i8;
            n = i2;
          }
          i5++;
        }
        i8 = f;
        i2 = getPaddingTop();
        f = (getPaddingBottom() + i2 + i8);
        i8 = i1;
        i1 = m;
        i3 = k;
        k = i8;
      }
      if ((i7 != 0) || (j == 1073741824)) {
        k = i1;
      }
      j = getPaddingLeft();
      setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + j + k, getSuggestedMinimumWidth()), paramInt1, i3), i4);
      if (i6 != 0)
      {
        j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (paramInt1 = 0; paramInt1 < i; paramInt1++)
        {
          localObject1 = getChildAt(paramInt1);
          if (((View)localObject1).getVisibility() != 8)
          {
            localObject2 = (a)((View)localObject1).getLayoutParams();
            if (width == -1)
            {
              k = height;
              height = ((View)localObject1).getMeasuredHeight();
              measureChildWithMargins((View)localObject1, j, 0, paramInt2, 0);
              height = k;
            }
          }
        }
      }
    }
    else
    {
      f = 0;
      int i13 = getVirtualChildCount();
      i = View.MeasureSpec.getMode(paramInt1);
      i11 = View.MeasureSpec.getMode(paramInt2);
      if ((q == null) || (r == null))
      {
        q = new int[4];
        r = new int[4];
      }
      int[] arrayOfInt1 = q;
      int[] arrayOfInt2 = r;
      arrayOfInt1[3] = -1;
      arrayOfInt1[2] = -1;
      arrayOfInt1[1] = -1;
      arrayOfInt1[0] = -1;
      arrayOfInt2[3] = -1;
      arrayOfInt2[2] = -1;
      arrayOfInt2[1] = -1;
      arrayOfInt2[0] = -1;
      bool1 = a;
      boolean bool2 = p;
      if (i == 1073741824) {
        i9 = 1;
      } else {
        i9 = 0;
      }
      j = 0;
      f1 = 0.0F;
      k = 0;
      i7 = 0;
      i8 = 0;
      m = 0;
      n = 0;
      i6 = 0;
      i1 = 1;
      i2 = 0;
      while (i7 < i13)
      {
        View localView = getChildAt(i7);
        if (localView == null)
        {
          f += 0;
          i5 = i7;
        }
        else
        {
          i5 = j;
          i3 = localView.getVisibility();
          i5 = k;
          if (i3 != 8) {
            break label1856;
          }
          i5 = i7 + 0;
        }
        i7 = k;
        break label2501;
        label1856:
        if (h(i7)) {
          f += t;
        }
        localObject2 = (a)localView.getLayoutParams();
        f2 = weight;
        f1 += f2;
        if ((i == 1073741824) && (width == 0) && (f2 > 0.0F))
        {
          if (i9 != 0)
          {
            i5 = f;
            f = (leftMargin + rightMargin + i5);
          }
          else
          {
            i5 = f;
            f = Math.max(i5, leftMargin + i5 + rightMargin);
          }
          if (bool1)
          {
            i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
            localView.measure(i5, i5);
            i5 = i7;
            i7 = i8;
          }
          else
          {
            n = 1;
            i5 = i7;
            break label2224;
          }
        }
        else
        {
          if ((width == 0) && (f2 > 0.0F))
          {
            width = -2;
            i5 = 0;
          }
          else
          {
            i5 = Integer.MIN_VALUE;
          }
          if (f1 == 0.0F) {
            i4 = f;
          } else {
            i4 = 0;
          }
          i3 = i7;
          measureChildWithMargins(localView, paramInt1, i4, paramInt2, 0);
          if (i5 != Integer.MIN_VALUE) {
            width = i5;
          }
          localObject1 = localObject2;
          i4 = localView.getMeasuredWidth();
          if (i9 != 0)
          {
            i7 = f;
            f = (leftMargin + i4 + rightMargin + 0 + i7);
          }
          else
          {
            i7 = f;
            f = Math.max(i7, i7 + i4 + leftMargin + rightMargin + 0);
          }
          i7 = i8;
          i5 = i3;
          if (bool2)
          {
            i7 = Math.max(i4, i8);
            i5 = i3;
          }
        }
        i8 = i7;
        label2224:
        i7 = j;
        if ((i11 != 1073741824) && (height == -1))
        {
          i3 = 1;
          i6 = 1;
        }
        else
        {
          i3 = 0;
        }
        i10 = topMargin + bottomMargin;
        i4 = localView.getMeasuredHeight() + i10;
        m = View.combineMeasuredStates(m, localView.getMeasuredState());
        if (bool1)
        {
          int i14 = localView.getBaseline();
          if (i14 != -1)
          {
            i12 = gravity;
            j = i12;
            if (i12 < 0) {
              j = e;
            }
            j = ((j & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
            arrayOfInt1[j] = Math.max(arrayOfInt1[j], i14);
            arrayOfInt2[j] = Math.max(arrayOfInt2[j], i4 - i14);
          }
        }
        i12 = Math.max(k, i4);
        if ((i1 != 0) && (height == -1)) {
          j = 1;
        } else {
          j = 0;
        }
        if (weight > 0.0F)
        {
          if (i3 != 0) {
            i4 = i10;
          }
          i1 = Math.max(i2, i4);
          k = i7;
          i7 = i1;
        }
        else
        {
          if (i3 != 0) {
            i4 = i10;
          }
          k = Math.max(i7, i4);
          i7 = i2;
        }
        i3 = i12;
        i5 += 0;
        i2 = i7;
        i1 = j;
        i7 = i3;
        j = k;
        label2501:
        i5++;
        k = i7;
        i7 = i5;
      }
      if ((f > 0) && (h(i13))) {
        f += t;
      }
      i7 = arrayOfInt1[1];
      if ((i7 == -1) && (arrayOfInt1[0] == -1) && (arrayOfInt1[2] == -1) && (arrayOfInt1[3] == -1)) {
        break label2646;
      }
      i7 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(i7, arrayOfInt1[2])));
      k = Math.max(k, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + i7);
      label2646:
      i7 = i11;
      if ((bool2) && ((i == Integer.MIN_VALUE) || (i == 0)))
      {
        f = 0;
        for (i5 = 0; i5 < i13; i5++)
        {
          localObject2 = getChildAt(i5);
          if (localObject2 == null)
          {
            f += 0;
          }
          else if (((View)localObject2).getVisibility() == 8)
          {
            i5 += 0;
          }
          else
          {
            localObject2 = (a)((View)localObject2).getLayoutParams();
            if (i9 != 0)
            {
              i3 = f;
              f = (leftMargin + i8 + rightMargin + 0 + i3);
            }
            else
            {
              i3 = f;
              f = Math.max(i3, i3 + i8 + leftMargin + rightMargin + 0);
            }
          }
        }
      }
      i5 = f;
      i3 = getPaddingLeft();
      i5 = getPaddingRight() + i3 + i5;
      f = i5;
      i10 = View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumWidth()), paramInt1, 0);
      i5 = (0xFFFFFF & i10) - f;
      if ((n == 0) && ((i5 == 0) || (f1 <= 0.0F)))
      {
        i2 = Math.max(j, i2);
        if ((bool2) && (i != 1073741824)) {
          for (j = 0; j < i13; j++)
          {
            localObject2 = getChildAt(j);
            if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject2).getMeasuredHeight(), 1073741824));
            }
          }
        }
        j = m;
        i8 = i7;
        i7 = k;
        k = i2;
      }
      for (;;)
      {
        break;
        f2 = o;
        if (f2 > 0.0F) {
          f1 = f2;
        }
        arrayOfInt1[3] = -1;
        arrayOfInt1[2] = -1;
        arrayOfInt1[1] = -1;
        arrayOfInt1[0] = -1;
        arrayOfInt2[3] = -1;
        arrayOfInt2[2] = -1;
        arrayOfInt2[1] = -1;
        arrayOfInt2[0] = -1;
        f = 0;
        k = j;
        j = m;
        i2 = -1;
        m = 0;
        i8 = i7;
        n = i;
        i7 = i5;
        for (i5 = m; i5 < i13; i5++)
        {
          localObject1 = getChildAt(i5);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
          {
            localObject2 = (a)((View)localObject1).getLayoutParams();
            f2 = weight;
            if (f2 > 0.0F)
            {
              i3 = (int)(i7 * f2 / f1);
              m = getPaddingTop();
              i = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingBottom() + m + topMargin + bottomMargin, height);
              if ((width == 0) && (n == 1073741824))
              {
                if (i3 > 0)
                {
                  m = i3;
                  break label3259;
                }
              }
              else
              {
                i4 = i3 + ((View)localObject1).getMeasuredWidth();
                m = i4;
                if (i4 >= 0) {
                  break label3259;
                }
              }
              m = 0;
              label3259:
              ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), i);
              j = View.combineMeasuredStates(j, ((View)localObject1).getMeasuredState() & 0xFF000000);
              f1 -= f2;
              i7 -= i3;
            }
            if (i9 != 0)
            {
              m = f;
              f = (((View)localObject1).getMeasuredWidth() + leftMargin + rightMargin + 0 + m);
            }
            else
            {
              m = f;
              f = Math.max(m, ((View)localObject1).getMeasuredWidth() + m + leftMargin + rightMargin + 0);
            }
            if ((i8 != 1073741824) && (height == -1)) {
              m = 1;
            } else {
              m = 0;
            }
            i4 = topMargin + bottomMargin;
            i3 = ((View)localObject1).getMeasuredHeight() + i4;
            i2 = Math.max(i2, i3);
            if (m != 0) {
              m = i4;
            } else {
              m = i3;
            }
            m = Math.max(k, m);
            if ((i1 != 0) && (height == -1)) {
              k = 1;
            } else {
              k = 0;
            }
            if (bool1)
            {
              i = ((View)localObject1).getBaseline();
              if (i != -1)
              {
                i4 = gravity;
                i1 = i4;
                if (i4 < 0) {
                  i1 = e;
                }
                i1 = ((i1 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                arrayOfInt1[i1] = Math.max(arrayOfInt1[i1], i);
                arrayOfInt2[i1] = Math.max(arrayOfInt2[i1], i3 - i);
              }
            }
            i1 = k;
            k = m;
          }
        }
        i7 = f;
        m = getPaddingLeft();
        f = (getPaddingRight() + m + i7);
        i7 = arrayOfInt1[1];
        if ((i7 == -1) && (arrayOfInt1[0] == -1) && (arrayOfInt1[2] == -1) && (arrayOfInt1[3] == -1))
        {
          i7 = i2;
        }
        else
        {
          i7 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(i7, arrayOfInt1[2])));
          i7 = Math.max(i2, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + i7);
        }
      }
      m = 0;
      if ((i1 != 0) || (i8 == 1073741824)) {
        k = i7;
      }
      i7 = getPaddingTop();
      setMeasuredDimension(0xFF000000 & j | i10, View.resolveSizeAndState(Math.max(getPaddingBottom() + i7 + k, getSuggestedMinimumHeight()), paramInt2, j << 16));
      if (i6 != 0)
      {
        j = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (paramInt2 = m; paramInt2 < i13; paramInt2++)
        {
          localObject1 = getChildAt(paramInt2);
          if (((View)localObject1).getVisibility() != 8)
          {
            localObject2 = (a)((View)localObject1).getLayoutParams();
            if (height == -1)
            {
              k = width;
              width = ((View)localObject1).getMeasuredWidth();
              measureChildWithMargins((View)localObject1, paramInt1, 0, j, 0);
              width = k;
            }
          }
        }
      }
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      b = paramInt;
      return;
    }
    StringBuilder localStringBuilder = f.l("base aligned child index out of range (0, ");
    localStringBuilder.append(getChildCount());
    localStringBuilder.append(")");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == s) {
      return;
    }
    s = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null)
    {
      t = paramDrawable.getIntrinsicWidth();
      u = paramDrawable.getIntrinsicHeight();
    }
    else
    {
      t = 0;
      u = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    w = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (e != paramInt)
    {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0) {
        i = paramInt | 0x800003;
      }
      paramInt = i;
      if ((i & 0x70) == 0) {
        paramInt = i | 0x30;
      }
      e = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 0x800007;
    int i = e;
    if ((0x800007 & i) != paramInt)
    {
      e = (paramInt | 0xFF7FFFF8 & i);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    p = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (d != paramInt)
    {
      d = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != v) {
      requestLayout();
    }
    v = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    int i = e;
    if ((i & 0x70) != paramInt)
    {
      e = (paramInt | i & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    o = Math.max(0.0F, paramFloat);
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class a
    extends LinearLayout.LayoutParams
  {
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */