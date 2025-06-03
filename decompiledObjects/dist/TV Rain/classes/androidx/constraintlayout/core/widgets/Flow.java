package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Flow
  extends VirtualLayout
{
  public static final int HORIZONTAL_ALIGN_CENTER = 2;
  public static final int HORIZONTAL_ALIGN_END = 1;
  public static final int HORIZONTAL_ALIGN_START = 0;
  public static final int VERTICAL_ALIGN_BASELINE = 3;
  public static final int VERTICAL_ALIGN_BOTTOM = 1;
  public static final int VERTICAL_ALIGN_CENTER = 2;
  public static final int VERTICAL_ALIGN_TOP = 0;
  public static final int WRAP_ALIGNED = 2;
  public static final int WRAP_CHAIN = 1;
  public static final int WRAP_CHAIN_NEW = 3;
  public static final int WRAP_NONE = 0;
  private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
  private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
  private int[] mAlignedDimensions = null;
  private ArrayList<WidgetsList> mChainList = new ArrayList();
  private ConstraintWidget[] mDisplayedWidgets;
  private int mDisplayedWidgetsCount = 0;
  private float mFirstHorizontalBias = 0.5F;
  private int mFirstHorizontalStyle = -1;
  private float mFirstVerticalBias = 0.5F;
  private int mFirstVerticalStyle = -1;
  private int mHorizontalAlign = 2;
  private float mHorizontalBias = 0.5F;
  private int mHorizontalGap = 0;
  private int mHorizontalStyle = -1;
  private float mLastHorizontalBias = 0.5F;
  private int mLastHorizontalStyle = -1;
  private float mLastVerticalBias = 0.5F;
  private int mLastVerticalStyle = -1;
  private int mMaxElementsWrap = -1;
  private int mOrientation = 0;
  private int mVerticalAlign = 2;
  private float mVerticalBias = 0.5F;
  private int mVerticalGap = 0;
  private int mVerticalStyle = -1;
  private int mWrapMode = 0;
  
  private void createAlignedConstraints(boolean paramBoolean)
  {
    if ((mAlignedDimensions != null) && (mAlignedBiggestElementsInCols != null) && (mAlignedBiggestElementsInRows != null))
    {
      for (int i = 0; i < mDisplayedWidgetsCount; i++) {
        mDisplayedWidgets[i].resetAnchors();
      }
      Object localObject1 = mAlignedDimensions;
      int j = localObject1[0];
      int k = localObject1[1];
      localObject1 = null;
      float f = mHorizontalBias;
      i = 0;
      int m;
      ConstraintWidget localConstraintWidget;
      while (i < j)
      {
        if (paramBoolean)
        {
          m = j - i - 1;
          f = 1.0F - mHorizontalBias;
        }
        else
        {
          m = i;
        }
        localConstraintWidget = mAlignedBiggestElementsInCols[m];
        localObject2 = localObject1;
        if (localConstraintWidget != null) {
          if (localConstraintWidget.getVisibility() == 8)
          {
            localObject2 = localObject1;
          }
          else
          {
            if (i == 0)
            {
              localConstraintWidget.connect(mLeft, mLeft, getPaddingLeft());
              localConstraintWidget.setHorizontalChainStyle(mHorizontalStyle);
              localConstraintWidget.setHorizontalBiasPercent(f);
            }
            if (i == j - 1) {
              localConstraintWidget.connect(mRight, mRight, getPaddingRight());
            }
            if ((i > 0) && (localObject1 != null))
            {
              localConstraintWidget.connect(mLeft, mRight, mHorizontalGap);
              ((ConstraintWidget)localObject1).connect(mRight, mLeft, 0);
            }
            localObject2 = localConstraintWidget;
          }
        }
        i++;
        localObject1 = localObject2;
      }
      i = 0;
      for (Object localObject2 = localObject1; i < k; localObject2 = localObject1)
      {
        localConstraintWidget = mAlignedBiggestElementsInRows[i];
        localObject1 = localObject2;
        if (localConstraintWidget != null) {
          if (localConstraintWidget.getVisibility() == 8)
          {
            localObject1 = localObject2;
          }
          else
          {
            if (i == 0)
            {
              localConstraintWidget.connect(mTop, mTop, getPaddingTop());
              localConstraintWidget.setVerticalChainStyle(mVerticalStyle);
              localConstraintWidget.setVerticalBiasPercent(mVerticalBias);
            }
            if (i == k - 1) {
              localConstraintWidget.connect(mBottom, mBottom, getPaddingBottom());
            }
            if ((i > 0) && (localObject2 != null))
            {
              localConstraintWidget.connect(mTop, mBottom, mVerticalGap);
              ((ConstraintWidget)localObject2).connect(mBottom, mTop, 0);
            }
            localObject1 = localConstraintWidget;
          }
        }
        i++;
      }
      for (i = 0; i < j; i++) {
        for (m = 0; m < k; m++)
        {
          int n = m * j + i;
          if (mOrientation == 1) {
            n = i * k + m;
          }
          localObject1 = mDisplayedWidgets;
          if (n < localObject1.length)
          {
            localConstraintWidget = localObject1[n];
            if ((localConstraintWidget != null) && (localConstraintWidget.getVisibility() != 8))
            {
              localObject2 = mAlignedBiggestElementsInCols[i];
              localObject1 = mAlignedBiggestElementsInRows[m];
              if (localConstraintWidget != localObject2)
              {
                localConstraintWidget.connect(mLeft, mLeft, 0);
                localConstraintWidget.connect(mRight, mRight, 0);
              }
              if (localConstraintWidget != localObject1)
              {
                localConstraintWidget.connect(mTop, mTop, 0);
                localConstraintWidget.connect(mBottom, mBottom, 0);
              }
            }
          }
        }
      }
    }
  }
  
  private final int getWidgetHeight(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if (paramConstraintWidget == null) {
      return 0;
    }
    if (paramConstraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
    {
      int i = mMatchConstraintDefaultHeight;
      if (i == 0) {
        return 0;
      }
      if (i == 2)
      {
        paramInt = (int)(mMatchConstraintPercentHeight * paramInt);
        if (paramInt != paramConstraintWidget.getHeight())
        {
          paramConstraintWidget.setMeasureRequested(true);
          measure(paramConstraintWidget, paramConstraintWidget.getHorizontalDimensionBehaviour(), paramConstraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, paramInt);
        }
        return paramInt;
      }
      if (i == 1) {
        return paramConstraintWidget.getHeight();
      }
      if (i == 3) {
        return (int)(paramConstraintWidget.getWidth() * mDimensionRatio + 0.5F);
      }
    }
    return paramConstraintWidget.getHeight();
  }
  
  private final int getWidgetWidth(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if (paramConstraintWidget == null) {
      return 0;
    }
    if (paramConstraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
    {
      int i = mMatchConstraintDefaultWidth;
      if (i == 0) {
        return 0;
      }
      if (i == 2)
      {
        paramInt = (int)(mMatchConstraintPercentWidth * paramInt);
        if (paramInt != paramConstraintWidget.getWidth())
        {
          paramConstraintWidget.setMeasureRequested(true);
          measure(paramConstraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, paramInt, paramConstraintWidget.getVerticalDimensionBehaviour(), paramConstraintWidget.getHeight());
        }
        return paramInt;
      }
      if (i == 1) {
        return paramConstraintWidget.getWidth();
      }
      if (i == 3) {
        return (int)(paramConstraintWidget.getHeight() * mDimensionRatio + 0.5F);
      }
    }
    return paramConstraintWidget.getWidth();
  }
  
  private void measureAligned(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    int j;
    int m;
    Object localObject;
    if (paramInt2 == 0)
    {
      i = mMaxElementsWrap;
      j = i;
      if (i <= 0)
      {
        j = 0;
        i = j;
        k = i;
        m = i;
        i = j;
        for (;;)
        {
          j = i;
          if (m >= paramInt1) {
            break;
          }
          j = k;
          if (m > 0) {
            j = k + mHorizontalGap;
          }
          localObject = paramArrayOfConstraintWidget[m];
          if (localObject == null)
          {
            k = j;
          }
          else
          {
            k = j + getWidgetWidth((ConstraintWidget)localObject, paramInt3);
            if (k > paramInt3)
            {
              j = i;
              break;
            }
            i++;
          }
          m++;
        }
      }
      k = j;
      i = 0;
    }
    else
    {
      i = mMaxElementsWrap;
      j = i;
      if (i <= 0)
      {
        j = 0;
        i = j;
        k = i;
        m = i;
        i = j;
        for (;;)
        {
          j = i;
          if (m >= paramInt1) {
            break;
          }
          j = k;
          if (m > 0) {
            j = k + mVerticalGap;
          }
          localObject = paramArrayOfConstraintWidget[m];
          if (localObject == null)
          {
            k = j;
          }
          else
          {
            k = j + getWidgetHeight((ConstraintWidget)localObject, paramInt3);
            if (k > paramInt3)
            {
              j = i;
              break;
            }
            i++;
          }
          m++;
        }
      }
      k = 0;
      i = j;
    }
    if (mAlignedDimensions == null) {
      mAlignedDimensions = new int[2];
    }
    int n;
    if (i == 0)
    {
      n = i;
      m = k;
      if (paramInt2 == 1) {}
    }
    else
    {
      if ((k != 0) || (paramInt2 != 0)) {
        break label316;
      }
      m = k;
      n = i;
    }
    int i1 = 1;
    int i = n;
    int k = m;
    break label319;
    label316:
    i1 = 0;
    for (;;)
    {
      label319:
      if (i1 != 0) {
        break label836;
      }
      if (paramInt2 == 0) {
        i = (int)Math.ceil(paramInt1 / k);
      } else {
        k = (int)Math.ceil(paramInt1 / i);
      }
      localObject = mAlignedBiggestElementsInCols;
      if ((localObject != null) && (localObject.length >= k)) {
        Arrays.fill((Object[])localObject, null);
      } else {
        mAlignedBiggestElementsInCols = new ConstraintWidget[k];
      }
      localObject = mAlignedBiggestElementsInRows;
      if ((localObject != null) && (localObject.length >= i)) {
        Arrays.fill((Object[])localObject, null);
      } else {
        mAlignedBiggestElementsInRows = new ConstraintWidget[i];
      }
      for (j = 0; j < k; j++) {
        for (m = 0; m < i; m++)
        {
          i2 = m * k + j;
          if (paramInt2 == 1) {
            i2 = j * i + m;
          }
          if (i2 < paramArrayOfConstraintWidget.length)
          {
            localObject = paramArrayOfConstraintWidget[i2];
            if (localObject != null)
            {
              i2 = getWidgetWidth((ConstraintWidget)localObject, paramInt3);
              ConstraintWidget localConstraintWidget = mAlignedBiggestElementsInCols[j];
              if ((localConstraintWidget == null) || (localConstraintWidget.getWidth() < i2)) {
                mAlignedBiggestElementsInCols[j] = localObject;
              }
              i2 = getWidgetHeight((ConstraintWidget)localObject, paramInt3);
              localConstraintWidget = mAlignedBiggestElementsInRows[m];
              if ((localConstraintWidget == null) || (localConstraintWidget.getHeight() < i2)) {
                mAlignedBiggestElementsInRows[m] = localObject;
              }
            }
          }
        }
      }
      m = 0;
      for (j = m; m < k; j = i2)
      {
        localObject = mAlignedBiggestElementsInCols[m];
        i2 = j;
        if (localObject != null)
        {
          i2 = j;
          if (m > 0) {
            i2 = j + mHorizontalGap;
          }
          i2 += getWidgetWidth((ConstraintWidget)localObject, paramInt3);
        }
        m++;
      }
      m = 0;
      for (int i2 = m; m < i; i2 = n)
      {
        localObject = mAlignedBiggestElementsInRows[m];
        n = i2;
        if (localObject != null)
        {
          n = i2;
          if (m > 0) {
            n = i2 + mVerticalGap;
          }
          n += getWidgetHeight((ConstraintWidget)localObject, paramInt3);
        }
        m++;
      }
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = i2;
      if (paramInt2 == 0)
      {
        n = i;
        m = k;
        if (j <= paramInt3) {
          break;
        }
        n = i;
        m = k;
        if (k <= 1) {
          break;
        }
        k--;
        continue;
      }
      n = i;
      m = k;
      if (i2 <= paramInt3) {
        break;
      }
      n = i;
      m = k;
      if (i <= 1) {
        break;
      }
      i--;
    }
    label836:
    paramArrayOfConstraintWidget = mAlignedDimensions;
    paramArrayOfConstraintWidget[0] = k;
    paramArrayOfConstraintWidget[1] = i;
  }
  
  private void measureChainWrap(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    mChainList.clear();
    Object localObject1 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
    mChainList.add(localObject1);
    if (paramInt2 == 0)
    {
      i = 0;
      j = i;
      k = j;
      m = j;
      for (j = i;; j = i)
      {
        i = j;
        if (k >= paramInt1) {
          break;
        }
        localObject2 = paramArrayOfConstraintWidget[k];
        n = getWidgetWidth((ConstraintWidget)localObject2, paramInt3);
        i = j;
        if (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
          i = j + 1;
        }
        if (((m == paramInt3) || (mHorizontalGap + m + n > paramInt3)) && (WidgetsList.access$2000((WidgetsList)localObject1) != null)) {
          j = 1;
        } else {
          j = 0;
        }
        i1 = j;
        if (j == 0)
        {
          i1 = j;
          if (k > 0)
          {
            i2 = mMaxElementsWrap;
            i1 = j;
            if (i2 > 0)
            {
              i1 = j;
              if (k % i2 == 0) {
                i1 = 1;
              }
            }
          }
        }
        if (i1 != 0)
        {
          localObject3 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
          ((WidgetsList)localObject3).setStartIndex(k);
          mChainList.add(localObject3);
        }
        do
        {
          m = n;
          localObject1 = localObject3;
          break;
          localObject3 = localObject1;
        } while (k <= 0);
        m = mHorizontalGap + n + m;
        ((WidgetsList)localObject1).add((ConstraintWidget)localObject2);
        k++;
      }
    }
    int i = 0;
    int j = i;
    int k = j;
    Object localObject3 = localObject1;
    int m = j;
    j = i;
    for (;;)
    {
      i = j;
      if (k >= paramInt1) {
        break;
      }
      localObject2 = paramArrayOfConstraintWidget[k];
      n = getWidgetHeight((ConstraintWidget)localObject2, paramInt3);
      i = j;
      if (((ConstraintWidget)localObject2).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
        i = j + 1;
      }
      if (((m == paramInt3) || (mVerticalGap + m + n > paramInt3)) && (WidgetsList.access$2000((WidgetsList)localObject3) != null)) {
        j = 1;
      } else {
        j = 0;
      }
      i1 = j;
      if (j == 0)
      {
        i1 = j;
        if (k > 0)
        {
          i2 = mMaxElementsWrap;
          i1 = j;
          if (i2 > 0)
          {
            i1 = j;
            if (k % i2 == 0) {
              i1 = 1;
            }
          }
        }
      }
      if (i1 != 0)
      {
        localObject1 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
        ((WidgetsList)localObject1).setStartIndex(k);
        mChainList.add(localObject1);
      }
      do
      {
        m = n;
        break;
        localObject1 = localObject3;
      } while (k <= 0);
      m = mVerticalGap + n + m;
      localObject1 = localObject3;
      ((WidgetsList)localObject1).add((ConstraintWidget)localObject2);
      k++;
      j = i;
      localObject3 = localObject1;
    }
    int i3 = mChainList.size();
    paramArrayOfConstraintWidget = mLeft;
    Object localObject2 = mTop;
    localObject1 = mRight;
    localObject3 = mBottom;
    m = getPaddingLeft();
    k = getPaddingTop();
    int n = getPaddingRight();
    int i1 = getPaddingBottom();
    Object localObject4 = getHorizontalDimensionBehaviour();
    Object localObject5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    if ((localObject4 != localObject5) && (getVerticalDimensionBehaviour() != localObject5)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    if ((i > 0) && (paramInt1 != 0)) {
      for (paramInt1 = 0; paramInt1 < i3; paramInt1++)
      {
        localObject4 = (WidgetsList)mChainList.get(paramInt1);
        if (paramInt2 == 0) {
          ((WidgetsList)localObject4).measureMatchConstraints(paramInt3 - ((WidgetsList)localObject4).getWidth());
        } else {
          ((WidgetsList)localObject4).measureMatchConstraints(paramInt3 - ((WidgetsList)localObject4).getHeight());
        }
      }
    }
    i = 0;
    j = i;
    paramInt1 = j;
    for (int i2 = j; paramInt1 < i3; i2 = j)
    {
      localObject5 = (WidgetsList)mChainList.get(paramInt1);
      if (paramInt2 == 0)
      {
        if (paramInt1 < i3 - 1)
        {
          localObject3 = access$2000mChainList.get(paramInt1 + 1)).mTop;
          j = 0;
        }
        else
        {
          localObject3 = mBottom;
          j = getPaddingBottom();
        }
        localObject4 = access$2000mBottom;
        ((WidgetsList)localObject5).setup(paramInt2, paramArrayOfConstraintWidget, (ConstraintAnchor)localObject2, (ConstraintAnchor)localObject1, (ConstraintAnchor)localObject3, m, k, n, j, paramInt3);
        k = Math.max(i2, ((WidgetsList)localObject5).getWidth());
        i1 = i + ((WidgetsList)localObject5).getHeight();
        i = i1;
        if (paramInt1 > 0) {
          i = i1 + mVerticalGap;
        }
        i2 = 0;
        localObject2 = localObject4;
        i1 = j;
        j = k;
        k = i2;
      }
      else
      {
        n = paramInt1;
        if (n < i3 - 1)
        {
          localObject1 = access$2000mChainList.get(n + 1)).mLeft;
          j = 0;
        }
        else
        {
          localObject1 = mRight;
          j = getPaddingRight();
        }
        localObject4 = access$2000mRight;
        ((WidgetsList)localObject5).setup(paramInt2, paramArrayOfConstraintWidget, (ConstraintAnchor)localObject2, (ConstraintAnchor)localObject1, (ConstraintAnchor)localObject3, m, k, j, i1, paramInt3);
        m = i2 + ((WidgetsList)localObject5).getWidth();
        i2 = Math.max(i, ((WidgetsList)localObject5).getHeight());
        i = m;
        if (n > 0) {
          i = m + mHorizontalGap;
        }
        m = i2;
        i2 = 0;
        n = j;
        paramArrayOfConstraintWidget = (ConstraintWidget[])localObject4;
        j = i;
        i = m;
        m = i2;
      }
      paramInt1++;
    }
    paramArrayOfInt[0] = i2;
    paramArrayOfInt[1] = i;
  }
  
  private void measureChainWrap_new(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    mChainList.clear();
    Object localObject1 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
    mChainList.add(localObject1);
    if (paramInt2 == 0)
    {
      i = 0;
      j = i;
      k = j;
      m = k;
      n = k;
      for (;;)
      {
        k = j;
        if (m >= paramInt1) {
          break;
        }
        i1 = i + 1;
        localObject2 = paramArrayOfConstraintWidget[m];
        i = getWidgetWidth((ConstraintWidget)localObject2, paramInt3);
        k = j;
        if (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
          k = j + 1;
        }
        if (((n == paramInt3) || (mHorizontalGap + n + i > paramInt3)) && (WidgetsList.access$2000((WidgetsList)localObject1) != null)) {
          j = 1;
        } else {
          j = 0;
        }
        i2 = j;
        if (j == 0)
        {
          i2 = j;
          if (m > 0)
          {
            i3 = mMaxElementsWrap;
            i2 = j;
            if (i3 > 0)
            {
              i2 = j;
              if (i1 > i3) {
                i2 = 1;
              }
            }
          }
        }
        if (i2 != 0)
        {
          localObject1 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
          ((WidgetsList)localObject1).setStartIndex(m);
          mChainList.add(localObject1);
          j = i1;
          n = i;
        }
        else
        {
          if (m > 0) {
            n = mHorizontalGap + i + n;
          } else {
            n = i;
          }
          j = 0;
        }
        ((WidgetsList)localObject1).add((ConstraintWidget)localObject2);
        m++;
        i = j;
        j = k;
      }
    }
    int m = 0;
    int j = m;
    int n = j;
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      k = j;
      if (n >= paramInt1) {
        break;
      }
      localObject3 = paramArrayOfConstraintWidget[n];
      i2 = getWidgetHeight((ConstraintWidget)localObject3, paramInt3);
      k = j;
      if (((ConstraintWidget)localObject3).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
        k = j + 1;
      }
      if (((m == paramInt3) || (mVerticalGap + m + i2 > paramInt3)) && (WidgetsList.access$2000((WidgetsList)localObject2) != null)) {
        j = 1;
      } else {
        j = 0;
      }
      i = j;
      if (j == 0)
      {
        i = j;
        if (n > 0)
        {
          i1 = mMaxElementsWrap;
          i = j;
          if (i1 > 0)
          {
            i = j;
            if (i1 < 0) {
              i = 1;
            }
          }
        }
      }
      if (i != 0)
      {
        localObject1 = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
        ((WidgetsList)localObject1).setStartIndex(n);
        mChainList.add(localObject1);
      }
      do
      {
        j = i2;
        break;
        localObject1 = localObject2;
      } while (n <= 0);
      j = mVerticalGap + i2 + m;
      localObject1 = localObject2;
      ((WidgetsList)localObject1).add((ConstraintWidget)localObject3);
      n++;
      m = j;
      j = k;
    }
    int i3 = mChainList.size();
    paramArrayOfConstraintWidget = mLeft;
    Object localObject3 = mTop;
    localObject1 = mRight;
    localObject2 = mBottom;
    n = getPaddingLeft();
    m = getPaddingTop();
    int i2 = getPaddingRight();
    int i = getPaddingBottom();
    Object localObject4 = getHorizontalDimensionBehaviour();
    Object localObject5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    if ((localObject4 != localObject5) && (getVerticalDimensionBehaviour() != localObject5)) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    if ((k > 0) && (paramInt1 != 0)) {
      for (paramInt1 = 0; paramInt1 < i3; paramInt1++)
      {
        localObject4 = (WidgetsList)mChainList.get(paramInt1);
        if (paramInt2 == 0) {
          ((WidgetsList)localObject4).measureMatchConstraints(paramInt3 - ((WidgetsList)localObject4).getWidth());
        } else {
          ((WidgetsList)localObject4).measureMatchConstraints(paramInt3 - ((WidgetsList)localObject4).getHeight());
        }
      }
    }
    int k = 0;
    j = k;
    paramInt1 = j;
    for (int i1 = j; paramInt1 < i3; i1 = j)
    {
      localObject5 = (WidgetsList)mChainList.get(paramInt1);
      if (paramInt2 == 0)
      {
        if (paramInt1 < i3 - 1)
        {
          localObject2 = access$2000mChainList.get(paramInt1 + 1)).mTop;
          j = 0;
        }
        else
        {
          localObject2 = mBottom;
          j = getPaddingBottom();
        }
        localObject4 = access$2000mBottom;
        ((WidgetsList)localObject5).setup(paramInt2, paramArrayOfConstraintWidget, (ConstraintAnchor)localObject3, (ConstraintAnchor)localObject1, (ConstraintAnchor)localObject2, n, m, i2, j, paramInt3);
        m = Math.max(i1, ((WidgetsList)localObject5).getWidth());
        i = k + ((WidgetsList)localObject5).getHeight();
        k = i;
        if (paramInt1 > 0) {
          k = i + mVerticalGap;
        }
        i1 = 0;
        localObject3 = localObject4;
        i = j;
        j = m;
        m = i1;
      }
      else
      {
        i2 = paramInt1;
        if (i2 < i3 - 1)
        {
          localObject1 = access$2000mChainList.get(i2 + 1)).mLeft;
          j = 0;
        }
        else
        {
          localObject1 = mRight;
          j = getPaddingRight();
        }
        localObject4 = access$2000mRight;
        ((WidgetsList)localObject5).setup(paramInt2, paramArrayOfConstraintWidget, (ConstraintAnchor)localObject3, (ConstraintAnchor)localObject1, (ConstraintAnchor)localObject2, n, m, j, i, paramInt3);
        n = i1 + ((WidgetsList)localObject5).getWidth();
        i1 = Math.max(k, ((WidgetsList)localObject5).getHeight());
        k = n;
        if (i2 > 0) {
          k = n + mHorizontalGap;
        }
        n = i1;
        i1 = 0;
        i2 = j;
        paramArrayOfConstraintWidget = (ConstraintWidget[])localObject4;
        j = k;
        k = n;
        n = i1;
      }
      paramInt1++;
    }
    paramArrayOfInt[0] = i1;
    paramArrayOfInt[1] = k;
  }
  
  private void measureNoWrap(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    if (paramInt1 == 0) {
      return;
    }
    WidgetsList localWidgetsList;
    if (mChainList.size() == 0)
    {
      localWidgetsList = new WidgetsList(paramInt2, mLeft, mTop, mRight, mBottom, paramInt3);
      mChainList.add(localWidgetsList);
    }
    else
    {
      localWidgetsList = (WidgetsList)mChainList.get(0);
      localWidgetsList.clear();
      ConstraintAnchor localConstraintAnchor1 = mLeft;
      ConstraintAnchor localConstraintAnchor2 = mTop;
      ConstraintAnchor localConstraintAnchor3 = mRight;
      ConstraintAnchor localConstraintAnchor4 = mBottom;
      int i = getPaddingLeft();
      int j = getPaddingTop();
      int k = getPaddingRight();
      int m = getPaddingBottom();
      localWidgetsList.setup(paramInt2, localConstraintAnchor1, localConstraintAnchor2, localConstraintAnchor3, localConstraintAnchor4, i, j, k, m, paramInt3);
    }
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++) {
      localWidgetsList.add(paramArrayOfConstraintWidget[paramInt2]);
    }
    paramArrayOfInt[0] = localWidgetsList.getWidth();
    paramArrayOfInt[1] = localWidgetsList.getHeight();
  }
  
  public void addToSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    super.addToSolver(paramLinearSystem, paramBoolean);
    if ((getParent() != null) && (((ConstraintWidgetContainer)getParent()).isRtl())) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    int i = mWrapMode;
    if (i != 0)
    {
      int j;
      boolean bool;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            j = mChainList.size();
            for (i = 0; i < j; i++)
            {
              paramLinearSystem = (WidgetsList)mChainList.get(i);
              if (i == j - 1) {
                bool = true;
              } else {
                bool = false;
              }
              paramLinearSystem.createConstraints(paramBoolean, i, bool);
            }
          }
        }
        else {
          createAlignedConstraints(paramBoolean);
        }
      }
      else
      {
        j = mChainList.size();
        for (i = 0; i < j; i++)
        {
          paramLinearSystem = (WidgetsList)mChainList.get(i);
          if (i == j - 1) {
            bool = true;
          } else {
            bool = false;
          }
          paramLinearSystem.createConstraints(paramBoolean, i, bool);
        }
      }
    }
    else if (mChainList.size() > 0)
    {
      ((WidgetsList)mChainList.get(0)).createConstraints(paramBoolean, 0, true);
    }
    needsCallbackFromSolver(false);
  }
  
  public void copy(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    super.copy(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (Flow)paramConstraintWidget;
    mHorizontalStyle = mHorizontalStyle;
    mVerticalStyle = mVerticalStyle;
    mFirstHorizontalStyle = mFirstHorizontalStyle;
    mFirstVerticalStyle = mFirstVerticalStyle;
    mLastHorizontalStyle = mLastHorizontalStyle;
    mLastVerticalStyle = mLastVerticalStyle;
    mHorizontalBias = mHorizontalBias;
    mVerticalBias = mVerticalBias;
    mFirstHorizontalBias = mFirstHorizontalBias;
    mFirstVerticalBias = mFirstVerticalBias;
    mLastHorizontalBias = mLastHorizontalBias;
    mLastVerticalBias = mLastVerticalBias;
    mHorizontalGap = mHorizontalGap;
    mVerticalGap = mVerticalGap;
    mHorizontalAlign = mHorizontalAlign;
    mVerticalAlign = mVerticalAlign;
    mWrapMode = mWrapMode;
    mMaxElementsWrap = mMaxElementsWrap;
    mOrientation = mOrientation;
  }
  
  public float getMaxElementsWrap()
  {
    return mMaxElementsWrap;
  }
  
  public void measure(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((mWidgetsCount > 0) && (!measureChildren()))
    {
      setMeasure(0, 0);
      needsCallbackFromSolver(false);
      return;
    }
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = getPaddingTop();
    int m = getPaddingBottom();
    int[] arrayOfInt = new int[2];
    int n = paramInt2 - i - j;
    int i1 = mOrientation;
    if (i1 == 1) {
      n = paramInt4 - k - m;
    }
    if (i1 == 0)
    {
      if (mHorizontalStyle == -1) {
        mHorizontalStyle = 0;
      }
      if (mVerticalStyle == -1) {
        mVerticalStyle = 0;
      }
    }
    else
    {
      if (mHorizontalStyle == -1) {
        mHorizontalStyle = 0;
      }
      if (mVerticalStyle == -1) {
        mVerticalStyle = 0;
      }
    }
    ConstraintWidget[] arrayOfConstraintWidget = mWidgets;
    i1 = 0;
    int i3;
    for (int i2 = i1;; i2 = i3)
    {
      i3 = mWidgetsCount;
      if (i1 >= i3) {
        break;
      }
      i3 = i2;
      if (mWidgets[i1].getVisibility() == 8) {
        i3 = i2 + 1;
      }
      i1++;
    }
    if (i2 > 0)
    {
      arrayOfConstraintWidget = new ConstraintWidget[i3 - i2];
      i3 = 0;
      for (i1 = 0; i3 < mWidgetsCount; i1 = i2)
      {
        ConstraintWidget localConstraintWidget = mWidgets[i3];
        i2 = i1;
        if (localConstraintWidget.getVisibility() != 8)
        {
          arrayOfConstraintWidget[i1] = localConstraintWidget;
          i2 = i1 + 1;
        }
        i3++;
      }
    }
    else
    {
      i1 = i3;
    }
    mDisplayedWidgets = arrayOfConstraintWidget;
    mDisplayedWidgetsCount = i1;
    i2 = mWrapMode;
    if (i2 != 0) {
      if (i2 != 1) {
        if (i2 != 2) {
          if (i2 == 3) {}
        }
      }
    }
    boolean bool;
    for (;;)
    {
      bool = true;
      break;
      measureChainWrap_new(arrayOfConstraintWidget, i1, mOrientation, n, arrayOfInt);
      continue;
      measureAligned(arrayOfConstraintWidget, i1, mOrientation, n, arrayOfInt);
      continue;
      measureChainWrap(arrayOfConstraintWidget, i1, mOrientation, n, arrayOfInt);
      continue;
      measureNoWrap(arrayOfConstraintWidget, i1, mOrientation, n, arrayOfInt);
    }
    n = arrayOfInt[0] + i + j;
    i1 = arrayOfInt[1] + k + m;
    if (paramInt1 == 1073741824) {
      paramInt1 = paramInt2;
    } else if (paramInt1 == Integer.MIN_VALUE) {
      paramInt1 = Math.min(n, paramInt2);
    } else if (paramInt1 == 0) {
      paramInt1 = n;
    } else {
      paramInt1 = 0;
    }
    if (paramInt3 == 1073741824) {
      paramInt2 = paramInt4;
    } else if (paramInt3 == Integer.MIN_VALUE) {
      paramInt2 = Math.min(i1, paramInt4);
    } else if (paramInt3 == 0) {
      paramInt2 = i1;
    } else {
      paramInt2 = 0;
    }
    setMeasure(paramInt1, paramInt2);
    setWidth(paramInt1);
    setHeight(paramInt2);
    if (mWidgetsCount <= 0) {
      bool = false;
    }
    needsCallbackFromSolver(bool);
  }
  
  public void setFirstHorizontalBias(float paramFloat)
  {
    mFirstHorizontalBias = paramFloat;
  }
  
  public void setFirstHorizontalStyle(int paramInt)
  {
    mFirstHorizontalStyle = paramInt;
  }
  
  public void setFirstVerticalBias(float paramFloat)
  {
    mFirstVerticalBias = paramFloat;
  }
  
  public void setFirstVerticalStyle(int paramInt)
  {
    mFirstVerticalStyle = paramInt;
  }
  
  public void setHorizontalAlign(int paramInt)
  {
    mHorizontalAlign = paramInt;
  }
  
  public void setHorizontalBias(float paramFloat)
  {
    mHorizontalBias = paramFloat;
  }
  
  public void setHorizontalGap(int paramInt)
  {
    mHorizontalGap = paramInt;
  }
  
  public void setHorizontalStyle(int paramInt)
  {
    mHorizontalStyle = paramInt;
  }
  
  public void setLastHorizontalBias(float paramFloat)
  {
    mLastHorizontalBias = paramFloat;
  }
  
  public void setLastHorizontalStyle(int paramInt)
  {
    mLastHorizontalStyle = paramInt;
  }
  
  public void setLastVerticalBias(float paramFloat)
  {
    mLastVerticalBias = paramFloat;
  }
  
  public void setLastVerticalStyle(int paramInt)
  {
    mLastVerticalStyle = paramInt;
  }
  
  public void setMaxElementsWrap(int paramInt)
  {
    mMaxElementsWrap = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    mOrientation = paramInt;
  }
  
  public void setVerticalAlign(int paramInt)
  {
    mVerticalAlign = paramInt;
  }
  
  public void setVerticalBias(float paramFloat)
  {
    mVerticalBias = paramFloat;
  }
  
  public void setVerticalGap(int paramInt)
  {
    mVerticalGap = paramInt;
  }
  
  public void setVerticalStyle(int paramInt)
  {
    mVerticalStyle = paramInt;
  }
  
  public void setWrapMode(int paramInt)
  {
    mWrapMode = paramInt;
  }
  
  public class WidgetsList
  {
    private ConstraintWidget biggest = null;
    public int biggestDimension = 0;
    private ConstraintAnchor mBottom;
    private int mCount = 0;
    private int mHeight = 0;
    private ConstraintAnchor mLeft;
    private int mMax = 0;
    private int mNbMatchConstraintsWidgets = 0;
    private int mOrientation;
    private int mPaddingBottom = 0;
    private int mPaddingLeft = 0;
    private int mPaddingRight = 0;
    private int mPaddingTop = 0;
    private ConstraintAnchor mRight;
    private int mStartIndex = 0;
    private ConstraintAnchor mTop;
    private int mWidth = 0;
    
    public WidgetsList(int paramInt1, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, ConstraintAnchor paramConstraintAnchor3, ConstraintAnchor paramConstraintAnchor4, int paramInt2)
    {
      mOrientation = paramInt1;
      mLeft = paramConstraintAnchor1;
      mTop = paramConstraintAnchor2;
      mRight = paramConstraintAnchor3;
      mBottom = paramConstraintAnchor4;
      mPaddingLeft = getPaddingLeft();
      mPaddingTop = getPaddingTop();
      mPaddingRight = getPaddingRight();
      mPaddingBottom = getPaddingBottom();
      mMax = paramInt2;
    }
    
    private void recomputeDimensions()
    {
      mWidth = 0;
      mHeight = 0;
      biggest = null;
      biggestDimension = 0;
      int i = mCount;
      for (int j = 0; (j < i) && (mStartIndex + j < Flow.access$400(Flow.this)); j++)
      {
        ConstraintWidget localConstraintWidget = Flow.access$500(Flow.this)[(mStartIndex + j)];
        int k;
        int m;
        if (mOrientation == 0)
        {
          k = localConstraintWidget.getWidth();
          m = Flow.access$000(Flow.this);
          if (localConstraintWidget.getVisibility() == 8) {
            m = 0;
          }
          mWidth = (k + m + mWidth);
          m = Flow.access$300(Flow.this, localConstraintWidget, mMax);
          if ((biggest == null) || (biggestDimension < m))
          {
            biggest = localConstraintWidget;
            biggestDimension = m;
            mHeight = m;
          }
        }
        else
        {
          k = Flow.access$200(Flow.this, localConstraintWidget, mMax);
          int n = Flow.access$300(Flow.this, localConstraintWidget, mMax);
          m = Flow.access$100(Flow.this);
          if (localConstraintWidget.getVisibility() == 8) {
            m = 0;
          }
          mHeight = (n + m + mHeight);
          if ((biggest == null) || (biggestDimension < k))
          {
            biggest = localConstraintWidget;
            biggestDimension = k;
            mWidth = k;
          }
        }
      }
    }
    
    public void add(ConstraintWidget paramConstraintWidget)
    {
      int i = mOrientation;
      int j = 0;
      int k = 0;
      if (i == 0)
      {
        i = Flow.access$200(Flow.this, paramConstraintWidget, mMax);
        if (paramConstraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
        {
          mNbMatchConstraintsWidgets += 1;
          i = 0;
        }
        j = Flow.access$000(Flow.this);
        if (paramConstraintWidget.getVisibility() == 8) {
          j = k;
        }
        mWidth = (i + j + mWidth);
        i = Flow.access$300(Flow.this, paramConstraintWidget, mMax);
        if ((biggest == null) || (biggestDimension < i))
        {
          biggest = paramConstraintWidget;
          biggestDimension = i;
          mHeight = i;
        }
      }
      else
      {
        int m = Flow.access$200(Flow.this, paramConstraintWidget, mMax);
        i = Flow.access$300(Flow.this, paramConstraintWidget, mMax);
        if (paramConstraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
        {
          mNbMatchConstraintsWidgets += 1;
          i = 0;
        }
        k = Flow.access$100(Flow.this);
        if (paramConstraintWidget.getVisibility() != 8) {
          j = k;
        }
        mHeight = (i + j + mHeight);
        if ((biggest == null) || (biggestDimension < m))
        {
          biggest = paramConstraintWidget;
          biggestDimension = m;
          mWidth = m;
        }
      }
      mCount += 1;
    }
    
    public void clear()
    {
      biggestDimension = 0;
      biggest = null;
      mWidth = 0;
      mHeight = 0;
      mStartIndex = 0;
      mCount = 0;
      mNbMatchConstraintsWidgets = 0;
    }
    
    public void createConstraints(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
    {
      int i = mCount;
      Object localObject1;
      for (int j = 0; (j < i) && (mStartIndex + j < Flow.access$400(Flow.this)); j++)
      {
        localObject1 = Flow.access$500(Flow.this)[(mStartIndex + j)];
        if (localObject1 != null) {
          ((ConstraintWidget)localObject1).resetAnchors();
        }
      }
      if ((i != 0) && (biggest != null))
      {
        int k;
        if ((paramBoolean2) && (paramInt == 0)) {
          k = 1;
        } else {
          k = 0;
        }
        j = 0;
        int m = -1;
        for (int n = m; j < i; n = i1)
        {
          if (paramBoolean1) {
            i1 = i - 1 - j;
          } else {
            i1 = j;
          }
          if (mStartIndex + i1 >= Flow.access$400(Flow.this)) {
            break;
          }
          localObject1 = Flow.access$500(Flow.this)[(mStartIndex + i1)];
          int i2 = m;
          i1 = n;
          if (localObject1 != null)
          {
            i2 = m;
            i1 = n;
            if (((ConstraintWidget)localObject1).getVisibility() == 0)
            {
              n = m;
              if (m == -1) {
                n = j;
              }
              i1 = j;
              i2 = n;
            }
          }
          j++;
          m = i2;
        }
        Object localObject2 = null;
        localObject1 = null;
        label465:
        float f1;
        float f2;
        if (mOrientation == 0)
        {
          localConstraintWidget1 = biggest;
          localConstraintWidget1.setVerticalChainStyle(Flow.access$600(Flow.this));
          i1 = mPaddingTop;
          j = i1;
          if (paramInt > 0) {
            j = i1 + Flow.access$100(Flow.this);
          }
          mTop.connect(mTop, j);
          if (paramBoolean2) {
            mBottom.connect(mBottom, mPaddingBottom);
          }
          if (paramInt > 0) {
            mTop.mOwner.mBottom.connect(mTop, 0);
          }
          paramInt = Flow.access$700(Flow.this);
          i1 = 3;
          if ((paramInt == 3) && (!localConstraintWidget1.hasBaseline())) {
            for (paramInt = 0; paramInt < i; paramInt++)
            {
              if (paramBoolean1) {
                j = i - 1 - paramInt;
              } else {
                j = paramInt;
              }
              if (mStartIndex + j >= Flow.access$400(Flow.this)) {
                break;
              }
              localObject2 = Flow.access$500(Flow.this)[(mStartIndex + j)];
              if (((ConstraintWidget)localObject2).hasBaseline()) {
                break label465;
              }
            }
          }
          localObject2 = localConstraintWidget1;
          j = 0;
          paramInt = i1;
          while (j < i)
          {
            if (paramBoolean1) {
              i1 = i - 1 - j;
            } else {
              i1 = j;
            }
            if (mStartIndex + i1 >= Flow.access$400(Flow.this)) {
              break;
            }
            ConstraintWidget localConstraintWidget2 = Flow.access$500(Flow.this)[(mStartIndex + i1)];
            if (localConstraintWidget2 != null)
            {
              if (j == 0) {
                localConstraintWidget2.connect(mLeft, mLeft, mPaddingLeft);
              }
              if (i1 == 0)
              {
                i1 = Flow.access$800(Flow.this);
                f1 = Flow.access$900(Flow.this);
                f2 = f1;
                if (paramBoolean1) {
                  f2 = 1.0F - f1;
                }
                if ((mStartIndex == 0) && (Flow.access$1000(Flow.this) != -1))
                {
                  paramInt = Flow.access$1000(Flow.this);
                  if (paramBoolean1)
                  {
                    f2 = Flow.access$1100(Flow.this);
                    f2 = 1.0F - f2;
                  }
                }
                for (f2 = Flow.access$1100(Flow.this);; f2 = Flow.access$1300(Flow.this))
                {
                  f1 = f2;
                  break label732;
                  paramInt = i1;
                  f1 = f2;
                  if (!paramBoolean2) {
                    break label732;
                  }
                  paramInt = i1;
                  f1 = f2;
                  if (Flow.access$1200(Flow.this) == -1) {
                    break label732;
                  }
                  paramInt = Flow.access$1200(Flow.this);
                  if (paramBoolean1)
                  {
                    f2 = Flow.access$1300(Flow.this);
                    break;
                  }
                }
                label732:
                localConstraintWidget2.setHorizontalChainStyle(paramInt);
                localConstraintWidget2.setHorizontalBiasPercent(f1);
              }
              if (j == i - 1) {
                localConstraintWidget2.connect(mRight, mRight, mPaddingRight);
              }
              if (localObject1 != null)
              {
                mLeft.connect(mRight, Flow.access$000(Flow.this));
                if (j == m) {
                  mLeft.setGoneMargin(mPaddingLeft);
                }
                mRight.connect(mLeft, 0);
                if (j == n + 1) {
                  mRight.setGoneMargin(mPaddingRight);
                }
              }
              if (localConstraintWidget2 != localConstraintWidget1)
              {
                i1 = Flow.access$700(Flow.this);
                paramInt = 3;
                if ((i1 == 3) && (((ConstraintWidget)localObject2).hasBaseline()) && (localConstraintWidget2 != localObject2) && (localConstraintWidget2.hasBaseline()))
                {
                  mBaseline.connect(mBaseline, 0);
                  localObject1 = localConstraintWidget2;
                }
                else
                {
                  i1 = Flow.access$700(Flow.this);
                  if (i1 != 0)
                  {
                    if (i1 != 1)
                    {
                      if (k != 0)
                      {
                        mTop.connect(mTop, mPaddingTop);
                        mBottom.connect(mBottom, mPaddingBottom);
                        localObject1 = localConstraintWidget2;
                      }
                      else
                      {
                        mTop.connect(mTop, 0);
                        mBottom.connect(mBottom, 0);
                        localObject1 = localConstraintWidget2;
                      }
                    }
                    else
                    {
                      mBottom.connect(mBottom, 0);
                      localObject1 = localConstraintWidget2;
                    }
                  }
                  else
                  {
                    mTop.connect(mTop, 0);
                    localObject1 = localConstraintWidget2;
                  }
                }
              }
              else
              {
                paramInt = 3;
                localObject1 = localConstraintWidget2;
              }
            }
            j++;
          }
        }
        ConstraintWidget localConstraintWidget1 = biggest;
        localConstraintWidget1.setHorizontalChainStyle(Flow.access$800(Flow.this));
        int i1 = mPaddingLeft;
        j = i1;
        if (paramInt > 0) {
          j = i1 + Flow.access$000(Flow.this);
        }
        if (paramBoolean1)
        {
          mRight.connect(mRight, j);
          if (paramBoolean2) {
            mLeft.connect(mLeft, mPaddingRight);
          }
          if (paramInt > 0) {
            mRight.mOwner.mLeft.connect(mRight, 0);
          }
        }
        else
        {
          mLeft.connect(mLeft, j);
          if (paramBoolean2) {
            mRight.connect(mRight, mPaddingRight);
          }
          if (paramInt > 0) {
            mLeft.mOwner.mRight.connect(mLeft, 0);
          }
        }
        j = 0;
        localObject1 = localObject2;
        while ((j < i) && (mStartIndex + j < Flow.access$400(Flow.this)))
        {
          localObject2 = Flow.access$500(Flow.this)[(mStartIndex + j)];
          if (localObject2 != null)
          {
            if (j == 0)
            {
              ((ConstraintWidget)localObject2).connect(mTop, mTop, mPaddingTop);
              i1 = Flow.access$600(Flow.this);
              f1 = Flow.access$1400(Flow.this);
              if ((mStartIndex == 0) && (Flow.access$1500(Flow.this) != -1))
              {
                paramInt = Flow.access$1500(Flow.this);
                f2 = Flow.access$1600(Flow.this);
              }
              else
              {
                paramInt = i1;
                f2 = f1;
                if (paramBoolean2)
                {
                  paramInt = i1;
                  f2 = f1;
                  if (Flow.access$1700(Flow.this) != -1)
                  {
                    paramInt = Flow.access$1700(Flow.this);
                    f2 = Flow.access$1800(Flow.this);
                  }
                }
              }
              ((ConstraintWidget)localObject2).setVerticalChainStyle(paramInt);
              ((ConstraintWidget)localObject2).setVerticalBiasPercent(f2);
            }
            if (j == i - 1) {
              ((ConstraintWidget)localObject2).connect(mBottom, mBottom, mPaddingBottom);
            }
            if (localObject1 != null)
            {
              mTop.connect(mBottom, Flow.access$100(Flow.this));
              if (j == m) {
                mTop.setGoneMargin(mPaddingTop);
              }
              mBottom.connect(mTop, 0);
              if (j == n + 1) {
                mBottom.setGoneMargin(mPaddingBottom);
              }
            }
            if (localObject2 != localConstraintWidget1) {
              if (paramBoolean1)
              {
                paramInt = Flow.access$1900(Flow.this);
                if (paramInt != 0)
                {
                  if (paramInt != 1)
                  {
                    if (paramInt == 2)
                    {
                      mLeft.connect(mLeft, 0);
                      mRight.connect(mRight, 0);
                    }
                  }
                  else {
                    mLeft.connect(mLeft, 0);
                  }
                }
                else {
                  mRight.connect(mRight, 0);
                }
              }
              else
              {
                paramInt = Flow.access$1900(Flow.this);
                if (paramInt != 0)
                {
                  if (paramInt != 1)
                  {
                    if (paramInt == 2) {
                      if (k != 0)
                      {
                        mLeft.connect(mLeft, mPaddingLeft);
                        mRight.connect(mRight, mPaddingRight);
                      }
                      else
                      {
                        mLeft.connect(mLeft, 0);
                        mRight.connect(mRight, 0);
                      }
                    }
                  }
                  else {
                    mRight.connect(mRight, 0);
                  }
                }
                else {
                  mLeft.connect(mLeft, 0);
                }
              }
            }
            localObject1 = localObject2;
          }
          j++;
        }
      }
    }
    
    public int getHeight()
    {
      if (mOrientation == 1) {
        return mHeight - Flow.access$100(Flow.this);
      }
      return mHeight;
    }
    
    public int getWidth()
    {
      if (mOrientation == 0) {
        return mWidth - Flow.access$000(Flow.this);
      }
      return mWidth;
    }
    
    public void measureMatchConstraints(int paramInt)
    {
      int i = mNbMatchConstraintsWidgets;
      if (i == 0) {
        return;
      }
      int j = mCount;
      i = paramInt / i;
      for (paramInt = 0; (paramInt < j) && (mStartIndex + paramInt < Flow.access$400(Flow.this)); paramInt++)
      {
        ConstraintWidget localConstraintWidget = Flow.access$500(Flow.this)[(mStartIndex + paramInt)];
        if (mOrientation == 0)
        {
          if ((localConstraintWidget != null) && (localConstraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mMatchConstraintDefaultWidth == 0)) {
            measure(localConstraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i, localConstraintWidget.getVerticalDimensionBehaviour(), localConstraintWidget.getHeight());
          }
        }
        else if ((localConstraintWidget != null) && (localConstraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mMatchConstraintDefaultHeight == 0)) {
          measure(localConstraintWidget, localConstraintWidget.getHorizontalDimensionBehaviour(), localConstraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i);
        }
      }
      recomputeDimensions();
    }
    
    public void setStartIndex(int paramInt)
    {
      mStartIndex = paramInt;
    }
    
    public void setup(int paramInt1, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, ConstraintAnchor paramConstraintAnchor3, ConstraintAnchor paramConstraintAnchor4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      mOrientation = paramInt1;
      mLeft = paramConstraintAnchor1;
      mTop = paramConstraintAnchor2;
      mRight = paramConstraintAnchor3;
      mBottom = paramConstraintAnchor4;
      mPaddingLeft = paramInt2;
      mPaddingTop = paramInt3;
      mPaddingRight = paramInt4;
      mPaddingBottom = paramInt5;
      mMax = paramInt6;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Flow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */