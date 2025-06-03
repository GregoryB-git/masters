package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

public class ChainHead
{
  private boolean mDefined;
  public ConstraintWidget mFirst;
  public ConstraintWidget mFirstMatchConstraintWidget;
  public ConstraintWidget mFirstVisibleWidget;
  public boolean mHasComplexMatchWeights;
  public boolean mHasDefinedWeights;
  public boolean mHasRatio;
  public boolean mHasUndefinedWeights;
  public ConstraintWidget mHead;
  private boolean mIsRtl;
  public ConstraintWidget mLast;
  public ConstraintWidget mLastMatchConstraintWidget;
  public ConstraintWidget mLastVisibleWidget;
  public boolean mOptimizable;
  private int mOrientation;
  public int mTotalMargins;
  public int mTotalSize;
  public float mTotalWeight = 0.0F;
  public int mVisibleWidgets;
  public ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
  public int mWidgetsCount;
  public int mWidgetsMatchCount;
  
  public ChainHead(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean)
  {
    mFirst = paramConstraintWidget;
    mOrientation = paramInt;
    mIsRtl = paramBoolean;
  }
  
  private void defineChainProperties()
  {
    int i = mOrientation * 2;
    Object localObject1 = mFirst;
    boolean bool = true;
    mOptimizable = true;
    Object localObject2 = localObject1;
    int j = 0;
    while (j == 0)
    {
      mWidgetsCount += 1;
      Object localObject3 = mNextChainWidget;
      int k = mOrientation;
      Object localObject4 = null;
      localObject3[k] = null;
      mListNextMatchConstraintsWidget[k] = null;
      Object localObject5;
      if (((ConstraintWidget)localObject1).getVisibility() != 8)
      {
        mVisibleWidgets += 1;
        localObject5 = ((ConstraintWidget)localObject1).getDimensionBehaviour(mOrientation);
        localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (localObject5 != localObject3)
        {
          k = mTotalSize;
          mTotalSize = (((ConstraintWidget)localObject1).getLength(mOrientation) + k);
        }
        k = mTotalSize;
        int m = mListAnchors[i].getMargin() + k;
        mTotalSize = m;
        localObject5 = mListAnchors;
        k = i + 1;
        mTotalSize = (localObject5[k].getMargin() + m);
        m = mTotalMargins;
        m = mListAnchors[i].getMargin() + m;
        mTotalMargins = m;
        mTotalMargins = (mListAnchors[k].getMargin() + m);
        if (mFirstVisibleWidget == null) {
          mFirstVisibleWidget = ((ConstraintWidget)localObject1);
        }
        mLastVisibleWidget = ((ConstraintWidget)localObject1);
        localObject5 = mListDimensionBehaviors;
        m = mOrientation;
        if (localObject5[m] == localObject3)
        {
          k = mResolvedMatchConstraintDefault[m];
          if ((k == 0) || (k == 3) || (k == 2))
          {
            mWidgetsMatchCount += 1;
            float f = mWeight[m];
            if (f > 0.0F) {
              mTotalWeight += f;
            }
            if (isMatchConstraintEqualityCandidate((ConstraintWidget)localObject1, m))
            {
              if (f < 0.0F) {
                mHasUndefinedWeights = true;
              } else {
                mHasDefinedWeights = true;
              }
              if (mWeightedMatchConstraintsWidgets == null) {
                mWeightedMatchConstraintsWidgets = new ArrayList();
              }
              mWeightedMatchConstraintsWidgets.add(localObject1);
            }
            if (mFirstMatchConstraintWidget == null) {
              mFirstMatchConstraintWidget = ((ConstraintWidget)localObject1);
            }
            localObject3 = mLastMatchConstraintWidget;
            if (localObject3 != null) {
              mListNextMatchConstraintsWidget[mOrientation] = localObject1;
            }
            mLastMatchConstraintWidget = ((ConstraintWidget)localObject1);
          }
          if (mOrientation == 0)
          {
            if (mMatchConstraintDefaultWidth != 0) {
              mOptimizable = false;
            } else if ((mMatchConstraintMinWidth != 0) || (mMatchConstraintMaxWidth != 0)) {
              mOptimizable = false;
            }
          }
          else if (mMatchConstraintDefaultHeight != 0) {
            mOptimizable = false;
          } else if ((mMatchConstraintMinHeight != 0) || (mMatchConstraintMaxHeight != 0)) {
            mOptimizable = false;
          }
          if (mDimensionRatio != 0.0F)
          {
            mOptimizable = false;
            mHasRatio = true;
          }
        }
      }
      if (localObject2 != localObject1) {
        mNextChainWidget[mOrientation] = localObject1;
      }
      localObject3 = mListAnchors[(i + 1)].mTarget;
      localObject2 = localObject4;
      if (localObject3 != null)
      {
        localObject3 = mOwner;
        localObject5 = mListAnchors[i].mTarget;
        localObject2 = localObject4;
        if (localObject5 != null) {
          if (mOwner != localObject1) {
            localObject2 = localObject4;
          } else {
            localObject2 = localObject3;
          }
        }
      }
      if (localObject2 == null)
      {
        localObject2 = localObject1;
        j = 1;
      }
      localObject4 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject4;
    }
    localObject2 = mFirstVisibleWidget;
    if (localObject2 != null) {
      mTotalSize -= mListAnchors[i].getMargin();
    }
    localObject2 = mLastVisibleWidget;
    if (localObject2 != null) {
      mTotalSize -= mListAnchors[(i + 1)].getMargin();
    }
    mLast = ((ConstraintWidget)localObject1);
    if ((mOrientation == 0) && (mIsRtl)) {
      mHead = ((ConstraintWidget)localObject1);
    } else {
      mHead = mFirst;
    }
    if ((!mHasDefinedWeights) || (!mHasUndefinedWeights)) {
      bool = false;
    }
    mHasComplexMatchWeights = bool;
  }
  
  private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if ((paramConstraintWidget.getVisibility() != 8) && (mListDimensionBehaviors[paramInt] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
    {
      paramInt = mResolvedMatchConstraintDefault[paramInt];
      if ((paramInt == 0) || (paramInt == 3)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void define()
  {
    if (!mDefined) {
      defineChainProperties();
    }
    mDefined = true;
  }
  
  public ConstraintWidget getFirst()
  {
    return mFirst;
  }
  
  public ConstraintWidget getFirstMatchConstraintWidget()
  {
    return mFirstMatchConstraintWidget;
  }
  
  public ConstraintWidget getFirstVisibleWidget()
  {
    return mFirstVisibleWidget;
  }
  
  public ConstraintWidget getHead()
  {
    return mHead;
  }
  
  public ConstraintWidget getLast()
  {
    return mLast;
  }
  
  public ConstraintWidget getLastMatchConstraintWidget()
  {
    return mLastMatchConstraintWidget;
  }
  
  public ConstraintWidget getLastVisibleWidget()
  {
    return mLastVisibleWidget;
  }
  
  public float getTotalWeight()
  {
    return mTotalWeight;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.ChainHead
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */