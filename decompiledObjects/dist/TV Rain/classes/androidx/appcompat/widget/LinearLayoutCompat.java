package androidx.appcompat.widget;

import android.content.Context;
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
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z2;

public class LinearLayoutCompat
  extends ViewGroup
{
  private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
  public static final int HORIZONTAL = 0;
  private static final int INDEX_BOTTOM = 2;
  private static final int INDEX_CENTER_VERTICAL = 0;
  private static final int INDEX_FILL = 3;
  private static final int INDEX_TOP = 1;
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  public static final int SHOW_DIVIDER_END = 4;
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  public static final int SHOW_DIVIDER_NONE = 0;
  public static final int VERTICAL = 1;
  private static final int VERTICAL_GRAVITY_COUNT = 4;
  private boolean mBaselineAligned = true;
  private int mBaselineAlignedChildIndex = -1;
  private int mBaselineChildTop = 0;
  private Drawable mDivider;
  private int mDividerHeight;
  private int mDividerPadding;
  private int mDividerWidth;
  private int mGravity = 8388659;
  private int[] mMaxAscent;
  private int[] mMaxDescent;
  private int mOrientation;
  private int mShowDividers;
  private int mTotalLength;
  private boolean mUseLargestChild;
  private float mWeightSum;
  
  public LinearLayoutCompat(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LinearLayoutCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = R.styleable.LinearLayoutCompat;
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, arrayOfInt, paramAttributeSet, localTintTypedArray.getWrappedTypeArray(), paramInt, 0);
    paramInt = localTintTypedArray.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = localTintTypedArray.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = localTintTypedArray.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    mWeightSum = localTintTypedArray.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0F);
    mBaselineAlignedChildIndex = localTintTypedArray.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    mUseLargestChild = localTintTypedArray.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(localTintTypedArray.getDrawable(R.styleable.LinearLayoutCompat_divider));
    mShowDividers = localTintTypedArray.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
    mDividerPadding = localTintTypedArray.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
    localTintTypedArray.recycle();
  }
  
  private void forceUniformHeight(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = getVirtualChildAt(j);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
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
  
  private void forceUniformWidth(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int j = 0; j < paramInt1; j++)
    {
      View localView = getVirtualChildAt(j);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
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
  
  private void setChildFrame(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void drawDividersHorizontal(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    boolean bool = ViewUtils.isLayoutRtl(this);
    Object localObject1;
    Object localObject2;
    int k;
    for (int j = 0; j < i; j++)
    {
      localObject1 = getVirtualChildAt(j);
      if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if (bool) {
          k = ((View)localObject1).getRight() + rightMargin;
        } else {
          k = ((View)localObject1).getLeft() - leftMargin - mDividerWidth;
        }
        drawVerticalDivider(paramCanvas, k);
      }
    }
    if (hasDividerBeforeChildAt(i))
    {
      localObject2 = getVirtualChildAt(i - 1);
      if (localObject2 == null)
      {
        if (bool)
        {
          j = getPaddingLeft();
          break label223;
        }
        j = getWidth() - getPaddingRight();
        k = mDividerWidth;
      }
      else
      {
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        if (!bool) {
          break label210;
        }
        j = ((View)localObject2).getLeft() - leftMargin;
        k = mDividerWidth;
      }
      j -= k;
      break label223;
      label210:
      j = ((View)localObject2).getRight() + rightMargin;
      label223:
      drawVerticalDivider(paramCanvas, j);
    }
  }
  
  public void drawDividersVertical(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      localObject1 = getVirtualChildAt(j);
      if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        drawHorizontalDivider(paramCanvas, ((View)localObject1).getTop() - topMargin - mDividerHeight);
      }
    }
    if (hasDividerBeforeChildAt(i))
    {
      localObject2 = getVirtualChildAt(i - 1);
      if (localObject2 == null)
      {
        j = getHeight() - getPaddingBottom() - mDividerHeight;
      }
      else
      {
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        j = ((View)localObject2).getBottom() + bottomMargin;
      }
      drawHorizontalDivider(paramCanvas, j);
    }
  }
  
  public void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    mDivider.setBounds(getPaddingLeft() + mDividerPadding, paramInt, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + paramInt);
    mDivider.draw(paramCanvas);
  }
  
  public void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    mDivider.setBounds(paramInt, getPaddingTop() + mDividerPadding, mDividerWidth + paramInt, getHeight() - getPaddingBottom() - mDividerPadding);
    mDivider.draw(paramCanvas);
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    int i = mOrientation;
    if (i == 0) {
      return new LayoutParams(-2, -2);
    }
    if (i == 1) {
      return new LayoutParams(-1, -2);
    }
    return null;
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (mBaselineAlignedChildIndex < 0) {
      return super.getBaseline();
    }
    int i = getChildCount();
    int j = mBaselineAlignedChildIndex;
    if (i > j)
    {
      View localView = getChildAt(j);
      int k = localView.getBaseline();
      if (k == -1)
      {
        if (mBaselineAlignedChildIndex == 0) {
          return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      }
      j = mBaselineChildTop;
      i = j;
      if (mOrientation == 1)
      {
        int m = mGravity & 0x70;
        i = j;
        if (m != 48) {
          if (m != 16)
          {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
            }
          }
          else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
          }
        }
      }
      return i + getLayoutParamstopMargin + k;
    }
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return mBaselineAlignedChildIndex;
  }
  
  public int getChildrenSkipCount(View paramView, int paramInt)
  {
    return 0;
  }
  
  public Drawable getDividerDrawable()
  {
    return mDivider;
  }
  
  public int getDividerPadding()
  {
    return mDividerPadding;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getDividerWidth()
  {
    return mDividerWidth;
  }
  
  @GravityInt
  public int getGravity()
  {
    return mGravity;
  }
  
  public int getLocationOffset(View paramView)
  {
    return 0;
  }
  
  public int getNextLocationOffset(View paramView)
  {
    return 0;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public int getShowDividers()
  {
    return mShowDividers;
  }
  
  public View getVirtualChildAt(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  public int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return mWeightSum;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean hasDividerBeforeChildAt(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramInt == 0)
    {
      if ((mShowDividers & 0x1) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    if (paramInt == getChildCount())
    {
      bool3 = bool1;
      if ((mShowDividers & 0x4) != 0) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if ((mShowDividers & 0x2) != 0)
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
  
  public boolean isBaselineAligned()
  {
    return mBaselineAligned;
  }
  
  public boolean isMeasureWithLargestChildEnabled()
  {
    return mUseLargestChild;
  }
  
  public void layoutHorizontal(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    int i = getPaddingTop();
    int j = paramInt4 - paramInt2;
    int k = getPaddingBottom();
    int m = getPaddingBottom();
    int n = getVirtualChildCount();
    paramInt2 = mGravity;
    paramInt4 = paramInt2 & 0x70;
    boolean bool2 = mBaselineAligned;
    int[] arrayOfInt1 = mMaxAscent;
    int[] arrayOfInt2 = mMaxDescent;
    paramInt2 = GravityCompat.getAbsoluteGravity(0x800007 & paramInt2, ViewCompat.getLayoutDirection(this));
    int i1 = 1;
    if (paramInt2 != 1)
    {
      if (paramInt2 != 5) {
        paramInt2 = getPaddingLeft();
      } else {
        paramInt2 = getPaddingLeft() + paramInt3 - paramInt1 - mTotalLength;
      }
    }
    else {
      paramInt2 = getPaddingLeft() + (paramInt3 - paramInt1 - mTotalLength) / 2;
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
      int i5 = i3 * i4 + i2;
      View localView = getVirtualChildAt(i5);
      if (localView == null)
      {
        paramInt2 = measureNullChild(i5) + paramInt2;
      }
      else if (localView.getVisibility() != 8)
      {
        int i6 = localView.getMeasuredWidth();
        int i7 = localView.getMeasuredHeight();
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if ((bool2) && (height != -1)) {
          i8 = localView.getBaseline();
        } else {
          i8 = -1;
        }
        int i9 = gravity;
        paramInt1 = i9;
        if (i9 < 0) {
          paramInt1 = paramInt3;
        }
        paramInt1 &= 0x70;
        if (paramInt1 != 16)
        {
          if (paramInt1 != 48)
          {
            if (paramInt1 != 80)
            {
              paramInt1 = paramInt4;
            }
            else
            {
              i9 = j - k - i7 - bottomMargin;
              paramInt1 = i9;
              if (i8 != -1)
              {
                paramInt1 = localView.getMeasuredHeight();
                paramInt1 = i9 - (arrayOfInt2[2] - (paramInt1 - i8));
              }
            }
          }
          else
          {
            i9 = topMargin + paramInt4;
            paramInt1 = i9;
            if (i8 != -1)
            {
              paramInt1 = arrayOfInt1[1] - i8 + i9;
              break label426;
            }
          }
        }
        else {
          paramInt1 = (j - i - m - i7) / 2 + paramInt4 + topMargin - bottomMargin;
        }
        label426:
        i1 = 1;
        int i8 = paramInt2;
        if (hasDividerBeforeChildAt(i5)) {
          i8 = paramInt2 + mDividerWidth;
        }
        paramInt2 = leftMargin + i8;
        setChildFrame(localView, getLocationOffset(localView) + paramInt2, paramInt1, i6, i7);
        paramInt1 = rightMargin;
        paramInt2 = getNextLocationOffset(localView) + (i6 + paramInt1) + paramInt2;
        i4 = getChildrenSkipCount(localView, i5) + i4;
      }
      else
      {
        i1 = 1;
      }
      i4++;
    }
  }
  
  public void layoutVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    int n = getVirtualChildCount();
    int i1 = mGravity;
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16)
    {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - mTotalLength;
      }
    }
    else {
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - mTotalLength) / 2;
    }
    for (paramInt2 = 0; paramInt2 < n; paramInt2++)
    {
      View localView = getVirtualChildAt(paramInt2);
      if (localView == null)
      {
        paramInt3 = measureNullChild(paramInt2) + paramInt1;
      }
      else
      {
        paramInt3 = paramInt1;
        if (localView.getVisibility() != 8)
        {
          int i2 = localView.getMeasuredWidth();
          int i3 = localView.getMeasuredHeight();
          LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
          paramInt4 = gravity;
          paramInt3 = paramInt4;
          if (paramInt4 < 0) {
            paramInt3 = i1 & 0x800007;
          }
          paramInt3 = GravityCompat.getAbsoluteGravity(paramInt3, ViewCompat.getLayoutDirection(this)) & 0x7;
          if (paramInt3 != 1)
          {
            if (paramInt3 != 5)
            {
              paramInt3 = leftMargin + i;
              break label273;
            }
            paramInt4 = j - k - i2;
            paramInt3 = rightMargin;
          }
          else
          {
            paramInt4 = (j - i - m - i2) / 2 + i + leftMargin;
            paramInt3 = rightMargin;
          }
          paramInt3 = paramInt4 - paramInt3;
          label273:
          paramInt4 = paramInt1;
          if (hasDividerBeforeChildAt(paramInt2)) {
            paramInt4 = paramInt1 + mDividerHeight;
          }
          paramInt1 = paramInt4 + topMargin;
          setChildFrame(localView, paramInt3, getLocationOffset(localView) + paramInt1, i2, i3);
          paramInt3 = bottomMargin;
          paramInt1 = getNextLocationOffset(localView) + (i3 + paramInt3) + paramInt1;
          paramInt2 += getChildrenSkipCount(localView, paramInt2);
          continue;
        }
      }
      paramInt1 = paramInt3;
    }
  }
  
  public void measureChildBeforeLayout(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void measureHorizontal(int paramInt1, int paramInt2)
  {
    mTotalLength = 0;
    int i = getVirtualChildCount();
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    if ((mMaxAscent == null) || (mMaxDescent == null))
    {
      mMaxAscent = new int[4];
      mMaxDescent = new int[4];
    }
    int[] arrayOfInt = mMaxAscent;
    Object localObject1 = mMaxDescent;
    arrayOfInt[3] = -1;
    arrayOfInt[2] = -1;
    arrayOfInt[1] = -1;
    arrayOfInt[0] = -1;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    boolean bool1 = mBaselineAligned;
    boolean bool2 = mUseLargestChild;
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
      localObject2 = getVirtualChildAt(i1);
      if (localObject2 == null)
      {
        i10 = mTotalLength;
        mTotalLength = (measureNullChild(i1) + i10);
      }
      for (;;)
      {
        i10 = i1;
        i1 = m;
        m = i10;
        break label894;
        if (((View)localObject2).getVisibility() != 8) {
          break;
        }
        i1 += getChildrenSkipCount((View)localObject2, i1);
      }
      if (hasDividerBeforeChildAt(i1)) {
        mTotalLength += mDividerWidth;
      }
      localObject3 = (LayoutParams)((View)localObject2).getLayoutParams();
      f2 = weight;
      f1 += f2;
      if ((j == m) && (width == 0) && (f2 > 0.0F))
      {
        if (n != 0)
        {
          m = mTotalLength;
          mTotalLength = (leftMargin + rightMargin + m);
        }
        else
        {
          m = mTotalLength;
          mTotalLength = Math.max(m, leftMargin + m + rightMargin);
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
          break label619;
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
          i10 = mTotalLength;
        } else {
          i10 = 0;
        }
        measureChildBeforeLayout((View)localObject2, i1, paramInt1, i10, paramInt2, 0);
        if (m != Integer.MIN_VALUE) {
          width = m;
        }
        i10 = ((View)localObject2).getMeasuredWidth();
        if (n != 0)
        {
          i11 = mTotalLength;
          i12 = leftMargin;
          m = rightMargin;
          mTotalLength = (getNextLocationOffset((View)localObject2) + (i12 + i10 + m) + i11);
        }
        else
        {
          i11 = mTotalLength;
          m = leftMargin;
          i12 = rightMargin;
          mTotalLength = Math.max(i11, getNextLocationOffset((View)localObject2) + (i11 + i10 + m + i12));
        }
        m = i2;
        if (bool2) {
          m = Math.max(i10, i2);
        }
      }
      i2 = m;
      label619:
      int i12 = i1;
      i11 = 1073741824;
      if ((k != 1073741824) && (height == -1))
      {
        i1 = 1;
        i8 = i1;
      }
      else
      {
        i1 = 0;
      }
      i10 = topMargin + bottomMargin;
      m = ((View)localObject2).getMeasuredHeight() + i10;
      int i13 = View.combineMeasuredStates(i7, ((View)localObject2).getMeasuredState());
      if (bool1)
      {
        int i14 = ((View)localObject2).getBaseline();
        if (i14 != -1)
        {
          int i15 = gravity;
          i7 = i15;
          if (i15 < 0) {
            i7 = mGravity;
          }
          i7 = ((i7 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
          arrayOfInt[i7] = Math.max(arrayOfInt[i7], i14);
          localObject1[i7] = Math.max(localObject1[i7], m - i14);
        }
      }
      i3 = Math.max(i3, m);
      if ((i9 != 0) && (height == -1)) {
        i9 = 1;
      } else {
        i9 = 0;
      }
      if (weight > 0.0F)
      {
        if (i1 == 0) {
          i10 = m;
        }
        i1 = Math.max(i5, i10);
      }
      else
      {
        if (i1 != 0) {
          m = i10;
        }
        i4 = Math.max(i4, m);
        i1 = i5;
      }
      m = getChildrenSkipCount((View)localObject2, i12) + i12;
      i7 = i13;
      i5 = i1;
      i1 = i11;
      label894:
      i10 = i1;
      i1 = m + 1;
      m = i10;
    }
    if ((mTotalLength > 0) && (hasDividerBeforeChildAt(i))) {
      mTotalLength += mDividerWidth;
    }
    i1 = arrayOfInt[1];
    if ((i1 == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1)) {
      break label1041;
    }
    i1 = Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(i1, arrayOfInt[2])));
    i3 = Math.max(i3, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + i1);
    label1041:
    m = i3;
    if (bool2) {
      if (j != Integer.MIN_VALUE)
      {
        m = i3;
        if (j != 0) {}
      }
      else
      {
        mTotalLength = 0;
        for (i1 = 0;; i1++)
        {
          m = i3;
          if (i1 >= i) {
            break;
          }
          localObject2 = getVirtualChildAt(i1);
          if (localObject2 == null)
          {
            m = mTotalLength;
            mTotalLength = (measureNullChild(i1) + m);
          }
          else
          {
            if (((View)localObject2).getVisibility() != 8) {
              break label1146;
            }
            i1 += getChildrenSkipCount((View)localObject2, i1);
          }
          for (;;)
          {
            break;
            label1146:
            localObject3 = (LayoutParams)((View)localObject2).getLayoutParams();
            if (n != 0)
            {
              i10 = mTotalLength;
              m = leftMargin;
              i11 = rightMargin;
              mTotalLength = (getNextLocationOffset((View)localObject2) + (m + i2 + i11) + i10);
            }
            else
            {
              m = mTotalLength;
              i10 = leftMargin;
              i11 = rightMargin;
              mTotalLength = Math.max(m, getNextLocationOffset((View)localObject2) + (m + i2 + i10 + i11));
            }
          }
        }
      }
    }
    i3 = mTotalLength;
    i1 = getPaddingLeft();
    i1 = getPaddingRight() + i1 + i3;
    mTotalLength = i1;
    int i11 = View.resolveSizeAndState(Math.max(i1, getSuggestedMinimumWidth()), paramInt1, 0);
    int i10 = (0xFFFFFF & i11) - mTotalLength;
    if ((i6 == 0) && ((i10 == 0) || (f1 <= 0.0F)))
    {
      i3 = Math.max(i4, i5);
      if ((bool2) && (j != 1073741824)) {
        for (i4 = 0; i4 < i; i4++)
        {
          localObject1 = getVirtualChildAt(i4);
          if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
          }
        }
      }
      i1 = i;
      i4 = m;
      i2 = i3;
    }
    else
    {
      f2 = mWeightSum;
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
      mTotalLength = 0;
      i5 = -1;
      i3 = i7;
      i7 = 0;
      i1 = i9;
      i2 = i;
      i9 = i3;
      i3 = i4;
      i4 = i10;
      while (i7 < i2)
      {
        localObject3 = getVirtualChildAt(i7);
        if ((localObject3 != null) && (((View)localObject3).getVisibility() != 8))
        {
          localObject2 = (LayoutParams)((View)localObject3).getLayoutParams();
          f2 = weight;
          if (f2 > 0.0F)
          {
            m = (int)(i4 * f2 / f1);
            i6 = getPaddingTop();
            i10 = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingBottom() + i6 + topMargin + bottomMargin, height);
            if ((width == 0) && (j == 1073741824))
            {
              if (m > 0) {
                i6 = m;
              } else {
                i6 = 0;
              }
              ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i10);
            }
            else
            {
              i = ((View)localObject3).getMeasuredWidth() + m;
              i6 = i;
              if (i < 0) {
                i6 = 0;
              }
              ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i10);
            }
            i9 = View.combineMeasuredStates(i9, ((View)localObject3).getMeasuredState() & 0xFF000000);
            f1 -= f2;
            i4 -= m;
          }
          if (n != 0)
          {
            m = mTotalLength;
            i = ((View)localObject3).getMeasuredWidth();
            i10 = leftMargin;
            i6 = rightMargin;
            mTotalLength = (getNextLocationOffset((View)localObject3) + (i + i10 + i6) + m);
          }
          else
          {
            i = mTotalLength;
            i10 = ((View)localObject3).getMeasuredWidth();
            i6 = leftMargin;
            m = rightMargin;
            mTotalLength = Math.max(i, getNextLocationOffset((View)localObject3) + (i10 + i + i6 + m));
          }
          if ((k != 1073741824) && (height == -1)) {
            i6 = 1;
          } else {
            i6 = 0;
          }
          i10 = topMargin + bottomMargin;
          i = ((View)localObject3).getMeasuredHeight() + i10;
          m = Math.max(i5, i);
          if (i6 != 0) {
            i5 = i10;
          } else {
            i5 = i;
          }
          i5 = Math.max(i3, i5);
          if ((i1 != 0) && (height == -1)) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (bool1)
          {
            i10 = ((View)localObject3).getBaseline();
            if (i10 != -1)
            {
              i6 = gravity;
              i3 = i6;
              if (i6 < 0) {
                i3 = mGravity;
              }
              i3 = ((i3 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt[i3] = Math.max(arrayOfInt[i3], i10);
              localObject1[i3] = Math.max(localObject1[i3], i - i10);
            }
          }
          i3 = i5;
          i5 = m;
        }
        i7++;
      }
      i6 = mTotalLength;
      i4 = getPaddingLeft();
      mTotalLength = (getPaddingRight() + i4 + i6);
      i4 = arrayOfInt[1];
      if ((i4 == -1) && (arrayOfInt[0] == -1) && (arrayOfInt[2] == -1) && (arrayOfInt[3] == -1))
      {
        i4 = i5;
      }
      else
      {
        i4 = Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(i4, arrayOfInt[2])));
        i4 = Math.max(i5, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + i4);
      }
      i7 = i9;
      i9 = i1;
      i1 = i2;
      i2 = i3;
    }
    if ((i9 != 0) || (k == 1073741824)) {
      i2 = i4;
    }
    i9 = getPaddingTop();
    setMeasuredDimension(i11 | i7 & 0xFF000000, View.resolveSizeAndState(Math.max(getPaddingBottom() + i9 + i2, getSuggestedMinimumHeight()), paramInt2, i7 << 16));
    if (i8 != 0) {
      forceUniformHeight(i1, paramInt1);
    }
  }
  
  public int measureNullChild(int paramInt)
  {
    return 0;
  }
  
  public void measureVertical(int paramInt1, int paramInt2)
  {
    mTotalLength = 0;
    int i = getVirtualChildCount();
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = mBaselineAlignedChildIndex;
    boolean bool = mUseLargestChild;
    int n = 0;
    int i1 = n;
    int i2 = i1;
    int i3 = i2;
    int i4 = i3;
    int i5 = i4;
    int i6 = i5;
    int i7 = i6;
    float f1 = 0.0F;
    int i8 = 1;
    View localView;
    LayoutParams localLayoutParams;
    float f2;
    int i11;
    int i12;
    while (i5 < i)
    {
      localView = getVirtualChildAt(i5);
      if (localView == null)
      {
        i9 = mTotalLength;
        mTotalLength = (measureNullChild(i5) + i9);
      }
      else if (localView.getVisibility() == 8)
      {
        i5 += getChildrenSkipCount(localView, i5);
      }
      else
      {
        if (hasDividerBeforeChildAt(i5)) {
          mTotalLength += mDividerHeight;
        }
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        f2 = weight;
        f1 += f2;
        if ((k == 1073741824) && (height == 0) && (f2 > 0.0F))
        {
          i6 = mTotalLength;
          mTotalLength = Math.max(i6, topMargin + i6 + bottomMargin);
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
            i10 = mTotalLength;
          } else {
            i10 = 0;
          }
          measureChildBeforeLayout(localView, i5, paramInt1, 0, paramInt2, i10);
          if (i9 != Integer.MIN_VALUE) {
            height = i9;
          }
          i11 = localView.getMeasuredHeight();
          i10 = mTotalLength;
          i9 = topMargin;
          i12 = bottomMargin;
          mTotalLength = Math.max(i10, getNextLocationOffset(localView) + (i10 + i11 + i9 + i12));
          if (bool) {
            i2 = Math.max(i11, i2);
          }
        }
        i12 = i5;
        if ((m >= 0) && (m == i12 + 1)) {
          mBaselineChildTop = mTotalLength;
        }
        if ((i12 < m) && (weight > 0.0F)) {
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
        i9 = leftMargin + rightMargin;
        i10 = localView.getMeasuredWidth() + i9;
        i1 = Math.max(i1, i10);
        i11 = View.combineMeasuredStates(n, localView.getMeasuredState());
        if ((i8 != 0) && (width == -1)) {
          n = 1;
        } else {
          n = 0;
        }
        if (weight > 0.0F)
        {
          if (i5 == 0) {
            i9 = i10;
          }
          i3 = Math.max(i3, i9);
          i8 = i4;
        }
        else
        {
          if (i5 == 0) {
            i9 = i10;
          }
          i8 = Math.max(i4, i9);
        }
        i5 = getChildrenSkipCount(localView, i12);
        i4 = i8;
        i9 = i11;
        i5 += i12;
        i8 = n;
        n = i9;
      }
      i5++;
    }
    if ((mTotalLength > 0) && (hasDividerBeforeChildAt(i))) {
      mTotalLength += mDividerHeight;
    }
    if ((bool) && ((k == Integer.MIN_VALUE) || (k == 0)))
    {
      mTotalLength = 0;
      for (i5 = 0; i5 < i; i5++)
      {
        localView = getVirtualChildAt(i5);
        if (localView == null)
        {
          i9 = mTotalLength;
          mTotalLength = (measureNullChild(i5) + i9);
        }
        else if (localView.getVisibility() == 8)
        {
          i5 += getChildrenSkipCount(localView, i5);
        }
        else
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          i12 = mTotalLength;
          i10 = topMargin;
          i9 = bottomMargin;
          mTotalLength = Math.max(i12, getNextLocationOffset(localView) + (i12 + i2 + i10 + i9));
        }
      }
    }
    int i9 = mTotalLength;
    i5 = getPaddingTop();
    i5 = getPaddingBottom() + i5 + i9;
    mTotalLength = i5;
    int i10 = View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), paramInt2, 0);
    i5 = (0xFFFFFF & i10) - mTotalLength;
    if ((i6 == 0) && ((i5 == 0) || (f1 <= 0.0F)))
    {
      i4 = Math.max(i4, i3);
      if ((bool) && (k != 1073741824)) {
        for (i3 = 0; i3 < i; i3++)
        {
          localView = getVirtualChildAt(i3);
          if ((localView != null) && (localView.getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
            localView.measure(View.MeasureSpec.makeMeasureSpec(localView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
          }
        }
      }
      i3 = n;
      n = i4;
      i2 = i1;
    }
    else
    {
      f2 = mWeightSum;
      if (f2 > 0.0F) {
        f1 = f2;
      }
      mTotalLength = 0;
      i3 = i5;
      i5 = 0;
      i2 = i1;
      while (i5 < i)
      {
        localView = getVirtualChildAt(i5);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          f2 = weight;
          if (f2 > 0.0F)
          {
            i1 = (int)(i3 * f2 / f1);
            i12 = getPaddingLeft();
            int i13 = getPaddingRight();
            i11 = leftMargin;
            i9 = rightMargin;
            m = width;
            i6 = i3 - i1;
            i9 = ViewGroup.getChildMeasureSpec(paramInt1, i13 + i12 + i11 + i9, m);
            if ((height == 0) && (k == 1073741824))
            {
              if (i1 > 0) {
                i3 = i1;
              } else {
                i3 = 0;
              }
              localView.measure(i9, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
            else
            {
              i1 = localView.getMeasuredHeight() + i1;
              i3 = i1;
              if (i1 < 0) {
                i3 = 0;
              }
              localView.measure(i9, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
            n = View.combineMeasuredStates(n, localView.getMeasuredState() & 0xFF00);
            f1 -= f2;
            i3 = i6;
          }
          i9 = leftMargin + rightMargin;
          i1 = localView.getMeasuredWidth() + i9;
          i6 = Math.max(i2, i1);
          if ((j != 1073741824) && (width == -1)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0) {
            i2 = i9;
          } else {
            i2 = i1;
          }
          i4 = Math.max(i4, i2);
          if ((i8 != 0) && (width == -1)) {
            i8 = 1;
          } else {
            i8 = 0;
          }
          i2 = mTotalLength;
          i12 = localView.getMeasuredHeight();
          i1 = topMargin;
          i9 = bottomMargin;
          mTotalLength = Math.max(i2, getNextLocationOffset(localView) + (i12 + i2 + i1 + i9));
          i2 = i6;
        }
        i5++;
      }
      i5 = mTotalLength;
      i3 = getPaddingTop();
      mTotalLength = (getPaddingBottom() + i3 + i5);
      i3 = n;
      n = i4;
    }
    if ((i8 != 0) || (j == 1073741824)) {
      n = i2;
    }
    i8 = getPaddingLeft();
    setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + i8 + n, getSuggestedMinimumWidth()), paramInt1, i3), i10);
    if (i7 != 0) {
      forceUniformWidth(i, paramInt2);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (mDivider == null) {
      return;
    }
    if (mOrientation == 1) {
      drawDividersVertical(paramCanvas);
    } else {
      drawDividersHorizontal(paramCanvas);
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
    if (mOrientation == 1) {
      layoutVertical(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      layoutHorizontal(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (mOrientation == 1) {
      measureVertical(paramInt1, paramInt2);
    } else {
      measureHorizontal(paramInt1, paramInt2);
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    mBaselineAligned = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      mBaselineAlignedChildIndex = paramInt;
      return;
    }
    StringBuilder localStringBuilder = z2.t("base aligned child index out of range (0, ");
    localStringBuilder.append(getChildCount());
    localStringBuilder.append(")");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == mDivider) {
      return;
    }
    mDivider = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null)
    {
      mDividerWidth = paramDrawable.getIntrinsicWidth();
      mDividerHeight = paramDrawable.getIntrinsicHeight();
    }
    else
    {
      mDividerWidth = 0;
      mDividerHeight = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    mDividerPadding = paramInt;
  }
  
  public void setGravity(@GravityInt int paramInt)
  {
    if (mGravity != paramInt)
    {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0) {
        i = paramInt | 0x800003;
      }
      paramInt = i;
      if ((i & 0x70) == 0) {
        paramInt = i | 0x30;
      }
      mGravity = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    int i = paramInt & 0x800007;
    paramInt = mGravity;
    if ((0x800007 & paramInt) != i)
    {
      mGravity = (i | 0xFF7FFFF8 & paramInt);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    mUseLargestChild = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (mOrientation != paramInt)
    {
      mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != mShowDividers) {
      requestLayout();
    }
    mShowDividers = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    int i = mGravity;
    if ((i & 0x70) != paramInt)
    {
      mGravity = (paramInt | i & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    mWeightSum = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface DividerMode {}
  
  public static class LayoutParams
    extends LinearLayout.LayoutParams
  {
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(int paramInt1, int paramInt2, float paramFloat)
    {
      super(paramInt2, paramFloat);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface OrientationMode {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.LinearLayoutCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */