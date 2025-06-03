package androidx.constraintlayout.core.widgets;

class Flow$WidgetsList
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
  
  public Flow$WidgetsList(Flow paramFlow, int paramInt1, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, ConstraintAnchor paramConstraintAnchor3, ConstraintAnchor paramConstraintAnchor4, int paramInt2)
  {
    mOrientation = paramInt1;
    mLeft = paramConstraintAnchor1;
    mTop = paramConstraintAnchor2;
    mRight = paramConstraintAnchor3;
    mBottom = paramConstraintAnchor4;
    mPaddingLeft = paramFlow.getPaddingLeft();
    mPaddingTop = paramFlow.getPaddingTop();
    mPaddingRight = paramFlow.getPaddingRight();
    mPaddingBottom = paramFlow.getPaddingBottom();
    mMax = paramInt2;
  }
  
  private void recomputeDimensions()
  {
    mWidth = 0;
    mHeight = 0;
    biggest = null;
    biggestDimension = 0;
    int i = mCount;
    for (int j = 0; (j < i) && (mStartIndex + j < Flow.access$400(this$0)); j++)
    {
      ConstraintWidget localConstraintWidget = Flow.access$500(this$0)[(mStartIndex + j)];
      int k;
      int m;
      if (mOrientation == 0)
      {
        k = localConstraintWidget.getWidth();
        m = Flow.access$000(this$0);
        if (localConstraintWidget.getVisibility() == 8) {
          m = 0;
        }
        mWidth = (k + m + mWidth);
        m = Flow.access$300(this$0, localConstraintWidget, mMax);
        if ((biggest == null) || (biggestDimension < m))
        {
          biggest = localConstraintWidget;
          biggestDimension = m;
          mHeight = m;
        }
      }
      else
      {
        k = Flow.access$200(this$0, localConstraintWidget, mMax);
        int n = Flow.access$300(this$0, localConstraintWidget, mMax);
        m = Flow.access$100(this$0);
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
      i = Flow.access$200(this$0, paramConstraintWidget, mMax);
      if (paramConstraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
      {
        mNbMatchConstraintsWidgets += 1;
        i = 0;
      }
      j = Flow.access$000(this$0);
      if (paramConstraintWidget.getVisibility() == 8) {
        j = k;
      }
      mWidth = (i + j + mWidth);
      i = Flow.access$300(this$0, paramConstraintWidget, mMax);
      if ((biggest == null) || (biggestDimension < i))
      {
        biggest = paramConstraintWidget;
        biggestDimension = i;
        mHeight = i;
      }
    }
    else
    {
      int m = Flow.access$200(this$0, paramConstraintWidget, mMax);
      i = Flow.access$300(this$0, paramConstraintWidget, mMax);
      if (paramConstraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
      {
        mNbMatchConstraintsWidgets += 1;
        i = 0;
      }
      k = Flow.access$100(this$0);
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
    for (int j = 0; (j < i) && (mStartIndex + j < Flow.access$400(this$0)); j++)
    {
      localObject1 = Flow.access$500(this$0)[(mStartIndex + j)];
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
        if (mStartIndex + i1 >= Flow.access$400(this$0)) {
          break;
        }
        localObject1 = Flow.access$500(this$0)[(mStartIndex + i1)];
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
        localConstraintWidget1.setVerticalChainStyle(Flow.access$600(this$0));
        i1 = mPaddingTop;
        j = i1;
        if (paramInt > 0) {
          j = i1 + Flow.access$100(this$0);
        }
        mTop.connect(mTop, j);
        if (paramBoolean2) {
          mBottom.connect(mBottom, mPaddingBottom);
        }
        if (paramInt > 0) {
          mTop.mOwner.mBottom.connect(mTop, 0);
        }
        paramInt = Flow.access$700(this$0);
        i1 = 3;
        if ((paramInt == 3) && (!localConstraintWidget1.hasBaseline())) {
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            if (paramBoolean1) {
              j = i - 1 - paramInt;
            } else {
              j = paramInt;
            }
            if (mStartIndex + j >= Flow.access$400(this$0)) {
              break;
            }
            localObject2 = Flow.access$500(this$0)[(mStartIndex + j)];
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
          if (mStartIndex + i1 >= Flow.access$400(this$0)) {
            break;
          }
          ConstraintWidget localConstraintWidget2 = Flow.access$500(this$0)[(mStartIndex + i1)];
          if (localConstraintWidget2 != null)
          {
            if (j == 0) {
              localConstraintWidget2.connect(mLeft, mLeft, mPaddingLeft);
            }
            if (i1 == 0)
            {
              i1 = Flow.access$800(this$0);
              f1 = Flow.access$900(this$0);
              f2 = f1;
              if (paramBoolean1) {
                f2 = 1.0F - f1;
              }
              if ((mStartIndex == 0) && (Flow.access$1000(this$0) != -1))
              {
                paramInt = Flow.access$1000(this$0);
                if (paramBoolean1)
                {
                  f2 = Flow.access$1100(this$0);
                  f2 = 1.0F - f2;
                }
              }
              for (f2 = Flow.access$1100(this$0);; f2 = Flow.access$1300(this$0))
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
                if (Flow.access$1200(this$0) == -1) {
                  break label732;
                }
                paramInt = Flow.access$1200(this$0);
                if (paramBoolean1)
                {
                  f2 = Flow.access$1300(this$0);
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
              mLeft.connect(mRight, Flow.access$000(this$0));
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
              i1 = Flow.access$700(this$0);
              paramInt = 3;
              if ((i1 == 3) && (((ConstraintWidget)localObject2).hasBaseline()) && (localConstraintWidget2 != localObject2) && (localConstraintWidget2.hasBaseline()))
              {
                mBaseline.connect(mBaseline, 0);
                localObject1 = localConstraintWidget2;
              }
              else
              {
                i1 = Flow.access$700(this$0);
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
      localConstraintWidget1.setHorizontalChainStyle(Flow.access$800(this$0));
      int i1 = mPaddingLeft;
      j = i1;
      if (paramInt > 0) {
        j = i1 + Flow.access$000(this$0);
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
      while ((j < i) && (mStartIndex + j < Flow.access$400(this$0)))
      {
        localObject2 = Flow.access$500(this$0)[(mStartIndex + j)];
        if (localObject2 != null)
        {
          if (j == 0)
          {
            ((ConstraintWidget)localObject2).connect(mTop, mTop, mPaddingTop);
            i1 = Flow.access$600(this$0);
            f1 = Flow.access$1400(this$0);
            if ((mStartIndex == 0) && (Flow.access$1500(this$0) != -1))
            {
              paramInt = Flow.access$1500(this$0);
              f2 = Flow.access$1600(this$0);
            }
            else
            {
              paramInt = i1;
              f2 = f1;
              if (paramBoolean2)
              {
                paramInt = i1;
                f2 = f1;
                if (Flow.access$1700(this$0) != -1)
                {
                  paramInt = Flow.access$1700(this$0);
                  f2 = Flow.access$1800(this$0);
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
            mTop.connect(mBottom, Flow.access$100(this$0));
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
              paramInt = Flow.access$1900(this$0);
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
              paramInt = Flow.access$1900(this$0);
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
      return mHeight - Flow.access$100(this$0);
    }
    return mHeight;
  }
  
  public int getWidth()
  {
    if (mOrientation == 0) {
      return mWidth - Flow.access$000(this$0);
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
    for (paramInt = 0; (paramInt < j) && (mStartIndex + paramInt < Flow.access$400(this$0)); paramInt++)
    {
      ConstraintWidget localConstraintWidget = Flow.access$500(this$0)[(mStartIndex + paramInt)];
      if (mOrientation == 0)
      {
        if ((localConstraintWidget != null) && (localConstraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mMatchConstraintDefaultWidth == 0)) {
          this$0.measure(localConstraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i, localConstraintWidget.getVerticalDimensionBehaviour(), localConstraintWidget.getHeight());
        }
      }
      else if ((localConstraintWidget != null) && (localConstraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mMatchConstraintDefaultHeight == 0)) {
        this$0.measure(localConstraintWidget, localConstraintWidget.getHorizontalDimensionBehaviour(), localConstraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i);
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Flow.WidgetsList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */