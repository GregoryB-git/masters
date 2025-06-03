package androidx.appcompat.widget;

import I.e;
import I.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import e.i;
import l.X;
import l.d0;

public abstract class b
  extends ViewGroup
{
  public int A;
  public int B;
  public int C;
  public boolean o = true;
  public int p = -1;
  public int q = 0;
  public int r;
  public int s = 8388659;
  public int t;
  public float u;
  public boolean v;
  public int[] w;
  public int[] x;
  public Drawable y;
  public int z;
  
  public b(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    X localX = X.s(paramContext, paramAttributeSet, i.w0, paramInt, 0);
    s.B(this, paramContext, i.w0, paramAttributeSet, localX.o(), paramInt, 0);
    paramInt = localX.i(i.y0, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = localX.i(i.x0, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = localX.a(i.z0, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    u = localX.g(i.B0, -1.0F);
    p = localX.i(i.A0, -1);
    v = localX.a(i.E0, false);
    setDividerDrawable(localX.f(i.C0));
    B = localX.i(i.F0, 0);
    C = localX.e(i.D0, 0);
    localX.t();
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = p(j);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        if (width == -1)
        {
          int k = height;
          height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i, 0, paramInt2, 0);
          height = k;
        }
      }
    }
  }
  
  private void x(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  public void d(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    boolean bool = d0.a(this);
    View localView;
    a locala;
    int k;
    for (int j = 0; j < i; j++)
    {
      localView = p(j);
      if ((localView != null) && (localView.getVisibility() != 8) && (q(j)))
      {
        locala = (a)localView.getLayoutParams();
        if (bool) {
          k = localView.getRight() + rightMargin;
        } else {
          k = localView.getLeft() - leftMargin - z;
        }
        g(paramCanvas, k);
      }
    }
    if (q(i))
    {
      localView = p(i - 1);
      if (localView == null)
      {
        if (bool) {
          j = getPaddingLeft();
        } else {
          k = getWidth();
        }
      }
      else
      {
        for (j = getPaddingRight();; j = leftMargin)
        {
          j = k - j - z;
          break label218;
          locala = (a)localView.getLayoutParams();
          if (!bool) {
            break;
          }
          k = localView.getLeft();
        }
        j = localView.getRight() + rightMargin;
      }
      label218:
      g(paramCanvas, j);
    }
  }
  
  public void e(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      localObject1 = p(j);
      if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (q(j)))
      {
        localObject2 = (a)((View)localObject1).getLayoutParams();
        f(paramCanvas, ((View)localObject1).getTop() - topMargin - A);
      }
    }
    if (q(i))
    {
      localObject2 = p(i - 1);
      if (localObject2 == null)
      {
        j = getHeight() - getPaddingBottom() - A;
      }
      else
      {
        localObject1 = (a)((View)localObject2).getLayoutParams();
        j = ((View)localObject2).getBottom() + bottomMargin;
      }
      f(paramCanvas, j);
    }
  }
  
  public void f(Canvas paramCanvas, int paramInt)
  {
    y.setBounds(getPaddingLeft() + C, paramInt, getWidth() - getPaddingRight() - C, A + paramInt);
    y.draw(paramCanvas);
  }
  
  public void g(Canvas paramCanvas, int paramInt)
  {
    y.setBounds(paramInt, getPaddingTop() + C, z + paramInt, getHeight() - getPaddingBottom() - C);
    y.draw(paramCanvas);
  }
  
  public int getBaseline()
  {
    if (p < 0) {
      return super.getBaseline();
    }
    int i = getChildCount();
    int j = p;
    if (i > j)
    {
      View localView = getChildAt(j);
      int k = localView.getBaseline();
      if (k == -1)
      {
        if (p == 0) {
          return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      }
      i = q;
      j = i;
      if (r == 1)
      {
        int m = s & 0x70;
        j = i;
        if (m != 48) {
          if (m != 16)
          {
            if (m != 80) {
              j = i;
            } else {
              j = getBottom() - getTop() - getPaddingBottom() - t;
            }
          }
          else {
            j = i + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - t) / 2;
          }
        }
      }
      return j + getLayoutParamstopMargin + k;
    }
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return p;
  }
  
  public Drawable getDividerDrawable()
  {
    return y;
  }
  
  public int getDividerPadding()
  {
    return C;
  }
  
  public int getDividerWidth()
  {
    return z;
  }
  
  public int getGravity()
  {
    return s;
  }
  
  public int getOrientation()
  {
    return r;
  }
  
  public int getShowDividers()
  {
    return B;
  }
  
  public int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return u;
  }
  
  public final void h(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = p(j);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        if (height == -1)
        {
          int k = width;
          width = localView.getMeasuredWidth();
          measureChildWithMargins(localView, paramInt2, 0, i, 0);
          width = k;
        }
      }
    }
  }
  
  public a j()
  {
    int i = r;
    if (i == 0) {
      return new a(-2, -2);
    }
    if (i == 1) {
      return new a(-1, -2);
    }
    return null;
  }
  
  public a k(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  public a l(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  public int m(View paramView, int paramInt)
  {
    return 0;
  }
  
  public int n(View paramView)
  {
    return 0;
  }
  
  public int o(View paramView)
  {
    return 0;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (y == null) {
      return;
    }
    if (r == 1) {
      e(paramCanvas);
    } else {
      d(paramCanvas);
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (r == 1) {
      s(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      r(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (r == 1) {
      w(paramInt1, paramInt2);
    } else {
      u(paramInt1, paramInt2);
    }
  }
  
  public View p(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  public boolean q(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramInt == 0)
    {
      if ((B & 0x1) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    if (paramInt == getChildCount())
    {
      bool3 = bool1;
      if ((B & 0x4) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if ((B & 0x2) != 0)
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
  
  public void r(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = d0.a(this);
    int i = getPaddingTop();
    int j = paramInt4 - paramInt2;
    int k = getPaddingBottom();
    int m = getPaddingBottom();
    int n = getVirtualChildCount();
    paramInt2 = s;
    paramInt4 = paramInt2 & 0x70;
    boolean bool2 = o;
    int[] arrayOfInt1 = w;
    int[] arrayOfInt2 = x;
    paramInt2 = e.a(0x800007 & paramInt2, s.m(this));
    int i1 = 1;
    if (paramInt2 != 1)
    {
      if (paramInt2 != 5) {
        paramInt2 = getPaddingLeft();
      } else {
        paramInt2 = getPaddingLeft() + paramInt3 - paramInt1 - t;
      }
    }
    else {
      paramInt2 = getPaddingLeft() + (paramInt3 - paramInt1 - t) / 2;
    }
    int i2;
    int i3;
    if (bool1)
    {
      i2 = n - 1;
      i3 = -1;
    }
    else
    {
      i2 = 0;
      i3 = 1;
    }
    int i4 = 0;
    paramInt3 = paramInt4;
    paramInt4 = i;
    while (i4 < n)
    {
      int i5 = i2 + i3 * i4;
      View localView = p(i5);
      if (localView == null) {
        paramInt2 += v(i5);
      }
      for (;;)
      {
        break;
        if (localView.getVisibility() != 8)
        {
          int i6 = localView.getMeasuredWidth();
          int i7 = localView.getMeasuredHeight();
          a locala = (a)localView.getLayoutParams();
          if ((bool2) && (height != -1)) {
            i8 = localView.getBaseline();
          } else {
            i8 = -1;
          }
          int i9 = b;
          paramInt1 = i9;
          if (i9 < 0) {
            paramInt1 = paramInt3;
          }
          paramInt1 &= 0x70;
          if (paramInt1 != 16)
          {
            if (paramInt1 != 48) {
              if (paramInt1 != 80) {
                paramInt1 = paramInt4;
              }
            }
            do
            {
              for (;;)
              {
                break;
                i9 = j - k - i7 - bottomMargin;
                paramInt1 = i9;
                if (i8 != -1)
                {
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = i9 - (arrayOfInt2[2] - (paramInt1 - i8));
                }
              }
              i9 = topMargin + paramInt4;
              paramInt1 = i9;
            } while (i8 == -1);
            paramInt1 = i9 + (arrayOfInt1[1] - i8);
          }
          else
          {
            paramInt1 = (j - i - m - i7) / 2 + paramInt4 + topMargin - bottomMargin;
          }
          i1 = 1;
          int i8 = paramInt2;
          if (q(i5)) {
            i8 = paramInt2 + z;
          }
          paramInt2 = leftMargin + i8;
          x(localView, paramInt2 + n(localView), paramInt1, i6, i7);
          i8 = rightMargin;
          paramInt1 = o(localView);
          i4 += m(localView, i5);
          paramInt2 += i6 + i8 + paramInt1;
        }
        else
        {
          i1 = 1;
        }
      }
      i4++;
    }
  }
  
  public void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    int n = getVirtualChildCount();
    int i1 = s;
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16)
    {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - t;
      }
    }
    else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - t) / 2;
    }
    for (paramInt2 = 0; paramInt2 < n; paramInt2++)
    {
      View localView = p(paramInt2);
      if (localView == null) {
        paramInt3 = paramInt1 + v(paramInt2);
      }
      do
      {
        paramInt1 = paramInt3;
        break;
        paramInt3 = paramInt1;
      } while (localView.getVisibility() == 8);
      int i2 = localView.getMeasuredWidth();
      int i3 = localView.getMeasuredHeight();
      a locala = (a)localView.getLayoutParams();
      paramInt4 = b;
      paramInt3 = paramInt4;
      if (paramInt4 < 0) {
        paramInt3 = i1 & 0x800007;
      }
      paramInt3 = e.a(paramInt3, s.m(this)) & 0x7;
      if (paramInt3 != 1) {
        if (paramInt3 != 5)
        {
          paramInt3 = leftMargin + i;
          break label267;
        }
      }
      for (paramInt3 = j - k - i2;; paramInt3 = (j - i - m - i2) / 2 + i + leftMargin)
      {
        paramInt3 -= rightMargin;
        break;
      }
      label267:
      paramInt4 = paramInt1;
      if (q(paramInt2)) {
        paramInt4 = paramInt1 + A;
      }
      paramInt1 = paramInt4 + topMargin;
      x(localView, paramInt3, paramInt1 + n(localView), i2, i3);
      paramInt3 = bottomMargin;
      paramInt4 = o(localView);
      paramInt2 += m(localView, paramInt2);
      paramInt1 += i3 + paramInt3 + paramInt4;
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    o = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      p = paramInt;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("base aligned child index out of range (0, ");
    localStringBuilder.append(getChildCount());
    localStringBuilder.append(")");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == y) {
      return;
    }
    y = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null)
    {
      z = paramDrawable.getIntrinsicWidth();
      A = paramDrawable.getIntrinsicHeight();
    }
    else
    {
      z = 0;
      A = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    C = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (s != paramInt)
    {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0) {
        i = paramInt | 0x800003;
      }
      paramInt = i;
      if ((i & 0x70) == 0) {
        paramInt = i | 0x30;
      }
      s = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    int i = paramInt & 0x800007;
    paramInt = s;
    if ((0x800007 & paramInt) != i)
    {
      s = (i | 0xFF7FFFF8 & paramInt);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    v = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (r != paramInt)
    {
      r = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != B) {
      requestLayout();
    }
    B = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    int i = paramInt & 0x70;
    paramInt = s;
    if ((paramInt & 0x70) != i)
    {
      s = (i | paramInt & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    u = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public void t(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void u(int paramInt1, int paramInt2)
  {
    t = 0;
    int i = getVirtualChildCount();
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    if ((w == null) || (x == null))
    {
      w = new int[4];
      x = new int[4];
    }
    int[] arrayOfInt = w;
    Object localObject1 = x;
    arrayOfInt[3] = -1;
    arrayOfInt[2] = -1;
    arrayOfInt[1] = -1;
    arrayOfInt[0] = -1;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    boolean bool1 = o;
    boolean bool2 = v;
    int m = 1073741824;
    int n;
    if (j == 1073741824) {
      n = 1;
    } else {
      n = 0;
    }
    int i1 = 0;
    int i2 = i1;
    int i3 = i2;
    int i4 = i3;
    int i5 = i4;
    int i6 = i5;
    int i7 = i6;
    int i8 = i7;
    int i9 = 1;
    float f1 = 0.0F;
    Object localObject2;
    Object localObject3;
    float f2;
    while (i1 < i)
    {
      localObject2 = p(i1);
      if (localObject2 == null) {
        t += v(i1);
      }
      for (;;)
      {
        i10 = i1;
        i1 = m;
        m = i10;
        break label883;
        if (((View)localObject2).getVisibility() != 8) {
          break;
        }
        i1 += m((View)localObject2, i1);
      }
      if (q(i1)) {
        t += z;
      }
      localObject3 = (a)((View)localObject2).getLayoutParams();
      f2 = a;
      f1 += f2;
      if ((j == m) && (width == 0) && (f2 > 0.0F))
      {
        m = t;
        if (n != 0) {
          m += leftMargin + rightMargin;
        }
        for (;;)
        {
          t = m;
          break;
          m = Math.max(m, leftMargin + m + rightMargin);
        }
        if (bool1)
        {
          m = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject2).measure(m, m);
          m = i2;
        }
        else
        {
          i6 = 1;
          break label599;
        }
      }
      else
      {
        if ((width == 0) && (f2 > 0.0F))
        {
          width = -2;
          m = 0;
        }
        else
        {
          m = Integer.MIN_VALUE;
        }
        if (f1 == 0.0F) {
          i10 = t;
        } else {
          i10 = 0;
        }
        t((View)localObject2, i1, paramInt1, i10, paramInt2, 0);
        if (m != Integer.MIN_VALUE) {
          width = m;
        }
        i10 = ((View)localObject2).getMeasuredWidth();
        if (n != 0) {}
        for (m = t + (leftMargin + i10 + rightMargin + o((View)localObject2));; m = Math.max(m, m + i10 + leftMargin + rightMargin + o((View)localObject2)))
        {
          t = m;
          break;
          m = t;
        }
        m = i2;
        if (bool2) {
          m = Math.max(i10, i2);
        }
      }
      i2 = m;
      label599:
      int i11 = i1;
      i12 = 1073741824;
      if ((k != 1073741824) && (height == -1))
      {
        i1 = 1;
        i8 = i1;
      }
      else
      {
        i1 = 0;
      }
      m = topMargin + bottomMargin;
      i10 = ((View)localObject2).getMeasuredHeight() + m;
      int i13 = View.combineMeasuredStates(i7, ((View)localObject2).getMeasuredState());
      if (bool1)
      {
        int i14 = ((View)localObject2).getBaseline();
        if (i14 != -1)
        {
          int i15 = b;
          i7 = i15;
          if (i15 < 0) {
            i7 = s;
          }
          i7 = ((i7 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
          arrayOfInt[i7] = Math.max(arrayOfInt[i7], i14);
          localObject1[i7] = Math.max(localObject1[i7], i10 - i14);
        }
      }
      i3 = Math.max(i3, i10);
      if ((i9 != 0) && (height == -1)) {
        i9 = 1;
      } else {
        i9 = 0;
      }
      if (a > 0.0F) {
        if (i1 == 0) {
          for (;;)
          {
            m = i10;
          }
        }
      }
      for (i1 = Math.max(i5, m);; i1 = i5)
      {
        break;
        if (i1 == 0) {
          for (;;)
          {
            m = i10;
          }
        }
        i4 = Math.max(i4, m);
      }
      m = m((View)localObject2, i11) + i11;
      i7 = i13;
      i5 = i1;
      i1 = i12;
      label883:
      i10 = i1;
      i1 = m + 1;
      m = i10;
    }
    if ((t > 0) && (q(i))) {
      t += z;
    }
    i1 = arrayOfInt[1];
    if ((i1 == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1)) {
      i1 = i3;
    } else {
      i1 = Math.max(i3, Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(i1, arrayOfInt[2]))) + Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))));
    }
    i3 = i7;
    m = i1;
    if (bool2) {
      if (j != Integer.MIN_VALUE)
      {
        m = i1;
        if (j == 0) {
          break label1066;
        }
      }
    }
    break label1232;
    label1066:
    t = 0;
    for (i7 = 0;; i7++)
    {
      m = i1;
      if (i7 >= i) {
        break;
      }
      localObject3 = p(i7);
      if (localObject3 == null)
      {
        t += v(i7);
      }
      else
      {
        if (((View)localObject3).getVisibility() != 8) {
          break label1141;
        }
        i7 += m((View)localObject3, i7);
      }
      for (;;)
      {
        break;
        label1141:
        localObject2 = (a)((View)localObject3).getLayoutParams();
        m = t;
        if (n != 0) {
          t = (m + (leftMargin + i2 + rightMargin + o((View)localObject3)));
        } else {
          t = Math.max(m, m + i2 + leftMargin + rightMargin + o((View)localObject3));
        }
      }
    }
    label1232:
    i1 = t + (getPaddingLeft() + getPaddingRight());
    t = i1;
    int i12 = View.resolveSizeAndState(Math.max(i1, getSuggestedMinimumWidth()), paramInt1, 0);
    int i10 = (0xFFFFFF & i12) - t;
    if ((i6 == 0) && ((i10 == 0) || (f1 <= 0.0F)))
    {
      i5 = Math.max(i4, i5);
      if ((bool2) && (j != 1073741824)) {
        for (i4 = 0; i4 < i; i4++)
        {
          localObject1 = p(i4);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsa > 0.0F)) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
          }
        }
      }
      i7 = i;
      i1 = i3;
      i4 = i5;
      i2 = m;
      i5 = i9;
    }
    else
    {
      f2 = u;
      if (f2 > 0.0F) {
        f1 = f2;
      }
      arrayOfInt[3] = -1;
      arrayOfInt[2] = -1;
      arrayOfInt[1] = -1;
      arrayOfInt[0] = -1;
      localObject1[3] = -1;
      localObject1[2] = -1;
      localObject1[1] = -1;
      localObject1[0] = -1;
      t = 0;
      i6 = -1;
      i2 = i3;
      i3 = 0;
      i7 = i9;
      i1 = i;
      i9 = i2;
      i5 = i4;
      i4 = i10;
      while (i3 < i1)
      {
        localObject3 = p(i3);
        if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8))
        {
          i2 = i9;
        }
        else
        {
          localObject2 = (a)((View)localObject3).getLayoutParams();
          f2 = a;
          if (f2 > 0.0F)
          {
            m = (int)(i4 * f2 / f1);
            i10 = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin, height);
            if ((width == 0) && (j == 1073741824)) {
              if (m > 0) {
                i2 = m;
              }
            }
            for (;;)
            {
              i2 = 0;
              do
              {
                ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), i10);
                break;
                i = ((View)localObject3).getMeasuredWidth() + m;
                i2 = i;
              } while (i >= 0);
            }
            i2 = View.combineMeasuredStates(i9, ((View)localObject3).getMeasuredState() & 0xFF000000);
            f1 -= f2;
            i9 = i4 - m;
            i4 = i2;
          }
          else
          {
            i2 = i4;
            i4 = i9;
            i9 = i2;
          }
          i2 = t;
          if (n != 0) {}
          for (t = (i2 + (((View)localObject3).getMeasuredWidth() + leftMargin + rightMargin + o((View)localObject3)));; t = Math.max(i2, ((View)localObject3).getMeasuredWidth() + i2 + leftMargin + rightMargin + o((View)localObject3))) {
            break;
          }
          if ((k != 1073741824) && (height == -1)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          i = topMargin + bottomMargin;
          m = ((View)localObject3).getMeasuredHeight() + i;
          i6 = Math.max(i6, m);
          if (i2 != 0) {
            i2 = i;
          } else {
            i2 = m;
          }
          i5 = Math.max(i5, i2);
          if ((i7 != 0) && (height == -1)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (bool1)
          {
            i10 = ((View)localObject3).getBaseline();
            if (i10 != -1)
            {
              i = b;
              i7 = i;
              if (i < 0) {
                i7 = s;
              }
              i7 = ((i7 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt[i7] = Math.max(arrayOfInt[i7], i10);
              localObject1[i7] = Math.max(localObject1[i7], m - i10);
            }
          }
          i7 = i2;
          i2 = i4;
          i4 = i9;
        }
        i3++;
        i9 = i2;
      }
      t += getPaddingLeft() + getPaddingRight();
      i4 = arrayOfInt[1];
      if ((i4 == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1)) {
        i4 = i6;
      } else {
        i4 = Math.max(i6, Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(i4, arrayOfInt[2]))) + Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))));
      }
      i2 = i4;
      i4 = i5;
      i5 = i7;
      i7 = i1;
      i1 = i9;
    }
    if ((i5 != 0) || (k == 1073741824)) {
      i4 = i2;
    }
    setMeasuredDimension(i12 | 0xFF000000 & i1, View.resolveSizeAndState(Math.max(i4 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, i1 << 16));
    if (i8 != 0) {
      h(i7, paramInt1);
    }
  }
  
  public int v(int paramInt)
  {
    return 0;
  }
  
  public void w(int paramInt1, int paramInt2)
  {
    t = 0;
    int i = getVirtualChildCount();
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = p;
    boolean bool = v;
    int n = 0;
    int i1 = n;
    int i2 = i1;
    int i3 = i2;
    int i4 = i3;
    int i5 = i4;
    int i6 = i5;
    int i7 = i6;
    int i8 = 1;
    float f1 = 0.0F;
    Object localObject1;
    Object localObject2;
    float f2;
    int i11;
    int i12;
    while (i5 < i)
    {
      localObject1 = p(i5);
      if (localObject1 == null)
      {
        t += v(i5);
      }
      else if (((View)localObject1).getVisibility() == 8)
      {
        i5 += m((View)localObject1, i5);
      }
      else
      {
        if (q(i5)) {
          t += A;
        }
        localObject2 = (a)((View)localObject1).getLayoutParams();
        f2 = a;
        f1 += f2;
        if ((k == 1073741824) && (height == 0) && (f2 > 0.0F))
        {
          i6 = t;
          t = Math.max(i6, topMargin + i6 + bottomMargin);
          i6 = 1;
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
            i10 = t;
          } else {
            i10 = 0;
          }
          t((View)localObject1, i5, paramInt1, 0, paramInt2, i10);
          if (i9 != Integer.MIN_VALUE) {
            height = i9;
          }
          i10 = ((View)localObject1).getMeasuredHeight();
          i9 = t;
          t = Math.max(i9, i9 + i10 + topMargin + bottomMargin + o((View)localObject1));
          if (bool) {
            i2 = Math.max(i10, i2);
          }
        }
        i11 = i5;
        if ((m >= 0) && (m == i11 + 1)) {
          q = t;
        }
        if ((i11 >= m) || (a > 0.0F)) {
          throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        if ((j != 1073741824) && (width == -1))
        {
          i5 = 1;
          i7 = i5;
        }
        else
        {
          i5 = 0;
        }
        i10 = leftMargin + rightMargin;
        i9 = ((View)localObject1).getMeasuredWidth() + i10;
        i1 = Math.max(i1, i9);
        i12 = View.combineMeasuredStates(n, ((View)localObject1).getMeasuredState());
        if ((i8 != 0) && (width == -1)) {
          n = 1;
        } else {
          n = 0;
        }
        if (a > 0.0F)
        {
          if (i5 == 0) {
            i10 = i9;
          }
          i3 = Math.max(i3, i10);
          i8 = i4;
        }
        else
        {
          if (i5 == 0) {
            for (;;)
            {
              i10 = i9;
            }
          }
          i8 = Math.max(i4, i10);
        }
        i5 = m((View)localObject1, i11);
        i4 = i8;
        i5 += i11;
        i9 = i12;
        i8 = n;
        n = i9;
      }
      i5++;
    }
    if ((t > 0) && (q(i))) {
      t += A;
    }
    int i9 = i;
    if ((bool) && ((k == Integer.MIN_VALUE) || (k == 0)))
    {
      t = 0;
      for (i5 = 0; i5 < i9; i5++)
      {
        localObject1 = p(i5);
        if (localObject1 == null) {}
        for (i = t + v(i5);; i = Math.max(i, i + i2 + topMargin + bottomMargin + o((View)localObject1)))
        {
          t = i;
          break;
          if (((View)localObject1).getVisibility() == 8)
          {
            i5 += m((View)localObject1, i5);
            break;
          }
          localObject2 = (a)((View)localObject1).getLayoutParams();
          i = t;
        }
      }
    }
    i5 = t + (getPaddingTop() + getPaddingBottom());
    t = i5;
    int i10 = View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), paramInt2, 0);
    i5 = (0xFFFFFF & i10) - t;
    if ((i6 == 0) && ((i5 == 0) || (f1 <= 0.0F)))
    {
      i4 = Math.max(i4, i3);
      if ((bool) && (k != 1073741824)) {
        for (i3 = 0; i3 < i9; i3++)
        {
          localObject1 = p(i3);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsa > 0.0F)) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
          }
        }
      }
      i3 = n;
      n = i4;
    }
    else
    {
      f2 = u;
      if (f2 > 0.0F) {
        f1 = f2;
      }
      t = 0;
      i3 = i5;
      for (i2 = 0; i2 < i9; i2++)
      {
        localObject2 = p(i2);
        if (((View)localObject2).getVisibility() != 8)
        {
          localObject1 = (a)((View)localObject2).getLayoutParams();
          f2 = a;
          if (f2 > 0.0F)
          {
            i = (int)(i3 * f2 / f1);
            i11 = getPaddingLeft();
            int i13 = getPaddingRight();
            i6 = leftMargin;
            m = rightMargin;
            i12 = width;
            i5 = i3 - i;
            i6 = ViewGroup.getChildMeasureSpec(paramInt1, i11 + i13 + i6 + m, i12);
            if ((height == 0) && (k == 1073741824)) {
              if (i > 0) {
                i3 = i;
              }
            }
            for (;;)
            {
              i3 = 0;
              do
              {
                ((View)localObject2).measure(i6, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                break;
                i = ((View)localObject2).getMeasuredHeight() + i;
                i3 = i;
              } while (i >= 0);
            }
            n = View.combineMeasuredStates(n, ((View)localObject2).getMeasuredState() & 0xFF00);
            f1 -= f2;
            i3 = i5;
          }
          i = leftMargin + rightMargin;
          i5 = ((View)localObject2).getMeasuredWidth() + i;
          i1 = Math.max(i1, i5);
          if ((j != 1073741824) && (width == -1)) {
            i5 = i;
          }
          i4 = Math.max(i4, i5);
          if ((i8 != 0) && (width == -1)) {
            i8 = 1;
          } else {
            i8 = 0;
          }
          i5 = t;
          t = Math.max(i5, ((View)localObject2).getMeasuredHeight() + i5 + topMargin + bottomMargin + o((View)localObject2));
        }
      }
      t += getPaddingTop() + getPaddingBottom();
      i3 = n;
      n = i4;
    }
    if ((i8 != 0) || (j == 1073741824)) {
      n = i1;
    }
    setMeasuredDimension(View.resolveSizeAndState(Math.max(n + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i3), i10);
    if (i7 != 0) {
      i(i9, paramInt2);
    }
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public float a;
    public int b = -1;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      a = 0.0F;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.G0);
      a = paramContext.getFloat(i.I0, 0.0F);
      b = paramContext.getInt(i.H0, -1);
      paramContext.recycle();
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