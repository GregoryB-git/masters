package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

public class Chain
{
  private static final boolean DEBUG = false;
  public static final boolean USE_CHAIN_OPTIMIZATION = false;
  
  public static void applyChainConstraints(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, int paramInt1, int paramInt2, ChainHead paramChainHead)
  {
    int i = paramInt1;
    Object localObject1 = mFirst;
    ConstraintWidget localConstraintWidget1 = mLast;
    ConstraintWidget localConstraintWidget2 = mFirstVisibleWidget;
    ConstraintWidget localConstraintWidget3 = mLastVisibleWidget;
    Object localObject2 = mHead;
    float f1 = mTotalWeight;
    int j;
    if (mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
      j = 1;
    } else {
      j = 0;
    }
    int n;
    int i1;
    if (i == 0)
    {
      k = mHorizontalChainStyle;
      if (k == 0) {
        m = 1;
      } else {
        m = 0;
      }
      if (k == 1) {
        n = 1;
      } else {
        n = 0;
      }
      i1 = m;
      i2 = n;
      if (k != 2) {
        break label189;
      }
    }
    else
    {
      k = mVerticalChainStyle;
      if (k == 0) {
        m = 1;
      } else {
        m = 0;
      }
      if (k == 1) {
        n = 1;
      } else {
        n = 0;
      }
      i1 = m;
      i2 = n;
      if (k != 2) {
        break label189;
      }
    }
    int i3 = 1;
    int i2 = m;
    int k = n;
    break label200;
    label189:
    i3 = 0;
    k = i2;
    i2 = i1;
    label200:
    int m = 0;
    Object localObject3 = localObject1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    for (;;)
    {
      localObject4 = null;
      localObject5 = null;
      if (m != 0) {
        break;
      }
      localObject6 = mListAnchors[paramInt2];
      if (i3 != 0) {
        n = 1;
      } else {
        n = 4;
      }
      i1 = ((ConstraintAnchor)localObject6).getMargin();
      localObject4 = mListDimensionBehaviors[i];
      localObject7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      int i4;
      if ((localObject4 == localObject7) && (mResolvedMatchConstraintDefault[i] == 0)) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      localObject4 = mTarget;
      int i5 = i1;
      if (localObject4 != null)
      {
        i5 = i1;
        if (localObject3 != localObject1) {
          i5 = ((ConstraintAnchor)localObject4).getMargin() + i1;
        }
      }
      if ((i3 != 0) && (localObject3 != localObject1) && (localObject3 != localConstraintWidget2)) {
        n = 8;
      }
      localObject4 = mTarget;
      if (localObject4 != null)
      {
        if (localObject3 == localConstraintWidget2) {
          paramLinearSystem.addGreaterThan(mSolverVariable, mSolverVariable, i5, 6);
        } else {
          paramLinearSystem.addGreaterThan(mSolverVariable, mSolverVariable, i5, 8);
        }
        i1 = n;
        if (i4 != 0)
        {
          i1 = n;
          if (i3 == 0) {
            i1 = 5;
          }
        }
        if ((localObject3 == localConstraintWidget2) && (i3 != 0) && (((ConstraintWidget)localObject3).isInBarrier(i))) {
          n = 5;
        } else {
          n = i1;
        }
        paramLinearSystem.addEquality(mSolverVariable, mTarget.mSolverVariable, i5, n);
      }
      if (j != 0)
      {
        if ((((ConstraintWidget)localObject3).getVisibility() != 8) && (mListDimensionBehaviors[i] == localObject7))
        {
          localObject7 = mListAnchors;
          paramLinearSystem.addGreaterThan(1mSolverVariable, mSolverVariable, 0, 5);
        }
        paramLinearSystem.addGreaterThan(mListAnchors[paramInt2].mSolverVariable, mListAnchors[paramInt2].mSolverVariable, 0, 8);
      }
      localObject6 = mListAnchors[(paramInt2 + 1)].mTarget;
      localObject7 = localObject5;
      if (localObject6 != null)
      {
        localObject6 = mOwner;
        localObject4 = mListAnchors[paramInt2].mTarget;
        localObject7 = localObject5;
        if (localObject4 != null) {
          if (mOwner != localObject3) {
            localObject7 = localObject5;
          } else {
            localObject7 = localObject6;
          }
        }
      }
      if (localObject7 != null) {
        localObject3 = localObject7;
      } else {
        m = 1;
      }
    }
    if (localConstraintWidget3 != null)
    {
      localObject7 = mListAnchors;
      n = paramInt2 + 1;
      if (mTarget != null)
      {
        localObject7 = mListAnchors[n];
        if ((mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mResolvedMatchConstraintDefault[i] == 0)) {
          m = 1;
        } else {
          m = 0;
        }
        if ((m != 0) && (i3 == 0))
        {
          localObject3 = mTarget;
          if (mOwner == paramConstraintWidgetContainer)
          {
            paramLinearSystem.addEquality(mSolverVariable, mSolverVariable, -((ConstraintAnchor)localObject7).getMargin(), 5);
            break label831;
          }
        }
        if (i3 != 0)
        {
          localObject3 = mTarget;
          if (mOwner == paramConstraintWidgetContainer) {
            paramLinearSystem.addEquality(mSolverVariable, mSolverVariable, -((ConstraintAnchor)localObject7).getMargin(), 4);
          }
        }
        label831:
        paramLinearSystem.addLowerThan(mSolverVariable, mListAnchors[n].mTarget.mSolverVariable, -((ConstraintAnchor)localObject7).getMargin(), 6);
      }
    }
    if (j != 0)
    {
      paramConstraintWidgetContainer = mListAnchors;
      m = paramInt2 + 1;
      localObject7 = mSolverVariable;
      paramConstraintWidgetContainer = mListAnchors[m];
      paramLinearSystem.addGreaterThan((SolverVariable)localObject7, mSolverVariable, paramConstraintWidgetContainer.getMargin(), 8);
    }
    paramConstraintWidgetContainer = mWeightedMatchConstraintsWidgets;
    label1096:
    Object localObject8;
    SolverVariable localSolverVariable;
    if (paramConstraintWidgetContainer != null)
    {
      m = paramConstraintWidgetContainer.size();
      if (m > 1)
      {
        float f2;
        if ((mHasUndefinedWeights) && (!mHasComplexMatchWeights)) {
          f2 = mWidgetsMatchCount;
        } else {
          f2 = f1;
        }
        float f3 = 0.0F;
        localObject7 = null;
        for (n = 0; n < m; n++)
        {
          localObject3 = (ConstraintWidget)paramConstraintWidgetContainer.get(n);
          f1 = mWeight[i];
          if (f1 < 0.0F)
          {
            if (mHasComplexMatchWeights)
            {
              localObject3 = mListAnchors;
              paramLinearSystem.addEquality(1mSolverVariable, mSolverVariable, 0, 4);
              break label1096;
            }
            f1 = 1.0F;
          }
          if (f1 == 0.0F)
          {
            localObject3 = mListAnchors;
            paramLinearSystem.addEquality(1mSolverVariable, mSolverVariable, 0, 8);
          }
          else
          {
            if (localObject7 != null)
            {
              localObject5 = mListAnchors;
              localObject7 = mSolverVariable;
              i1 = paramInt2 + 1;
              localObject5 = mSolverVariable;
              localObject8 = mListAnchors;
              localObject6 = mSolverVariable;
              localSolverVariable = mSolverVariable;
              localObject8 = paramLinearSystem.createRow();
              ((ArrayRow)localObject8).createRowEqualMatchDimensions(f3, f2, f1, (SolverVariable)localObject7, (SolverVariable)localObject5, (SolverVariable)localObject6, localSolverVariable);
              paramLinearSystem.addConstraint((ArrayRow)localObject8);
            }
            localObject7 = localObject3;
            f3 = f1;
          }
        }
      }
    }
    if ((localConstraintWidget2 != null) && ((localConstraintWidget2 == localConstraintWidget3) || (i3 != 0)))
    {
      paramConstraintWidgetContainer = mListAnchors[paramInt2];
      paramChainHead = mListAnchors;
      paramInt1 = paramInt2 + 1;
      localObject7 = paramChainHead[paramInt1];
      paramConstraintWidgetContainer = mTarget;
      if (paramConstraintWidgetContainer != null) {
        paramConstraintWidgetContainer = mSolverVariable;
      } else {
        paramConstraintWidgetContainer = null;
      }
      paramChainHead = mTarget;
      if (paramChainHead != null) {
        paramChainHead = mSolverVariable;
      } else {
        paramChainHead = null;
      }
      localObject3 = mListAnchors[paramInt2];
      if (localConstraintWidget3 != null) {
        localObject7 = mListAnchors[paramInt1];
      }
      if ((paramConstraintWidgetContainer != null) && (paramChainHead != null))
      {
        if (i == 0) {
          f1 = mHorizontalBiasPercent;
        } else {
          f1 = mVerticalBiasPercent;
        }
        paramInt1 = ((ConstraintAnchor)localObject3).getMargin();
        m = ((ConstraintAnchor)localObject7).getMargin();
        paramLinearSystem.addCentering(mSolverVariable, paramConstraintWidgetContainer, paramInt1, f1, paramChainHead, mSolverVariable, m, 7);
      }
    }
    else
    {
      if ((i2 != 0) && (localConstraintWidget2 != null))
      {
        paramInt1 = mWidgetsMatchCount;
        if ((paramInt1 > 0) && (mWidgetsCount == paramInt1)) {
          m = 1;
        } else {
          m = 0;
        }
        localObject7 = localConstraintWidget2;
        localObject2 = localObject7;
      }
      while (localObject2 != null)
      {
        for (paramConstraintWidgetContainer = mNextChainWidget[i]; (paramConstraintWidgetContainer != null) && (paramConstraintWidgetContainer.getVisibility() == 8); paramConstraintWidgetContainer = mNextChainWidget[i]) {}
        if ((paramConstraintWidgetContainer == null) && (localObject2 != localConstraintWidget3)) {}
        for (;;)
        {
          break;
          localObject3 = mListAnchors[paramInt2];
          localObject6 = mSolverVariable;
          paramChainHead = mTarget;
          if (paramChainHead != null) {
            paramChainHead = mSolverVariable;
          } else {
            paramChainHead = null;
          }
          if (localObject7 != localObject2)
          {
            paramChainHead = mListAnchors[(paramInt2 + 1)].mSolverVariable;
          }
          else if (localObject2 == localConstraintWidget2)
          {
            paramChainHead = mListAnchors[paramInt2].mTarget;
            if (paramChainHead != null) {
              paramChainHead = mSolverVariable;
            } else {
              paramChainHead = null;
            }
          }
          j = ((ConstraintAnchor)localObject3).getMargin();
          localObject3 = mListAnchors;
          i1 = paramInt2 + 1;
          n = localObject3[i1].getMargin();
          if (paramConstraintWidgetContainer != null)
          {
            localObject5 = mListAnchors[paramInt2];
            localObject3 = mSolverVariable;
          }
          for (;;)
          {
            break;
            localObject5 = mListAnchors[i1].mTarget;
            if (localObject5 != null) {
              localObject3 = mSolverVariable;
            } else {
              localObject3 = null;
            }
          }
          localObject8 = mListAnchors[i1].mSolverVariable;
          paramInt1 = n;
          if (localObject5 != null) {
            paramInt1 = n + ((ConstraintAnchor)localObject5).getMargin();
          }
          n = mListAnchors[i1].getMargin() + j;
          if ((localObject6 != null) && (paramChainHead != null) && (localObject3 != null) && (localObject8 != null))
          {
            if (localObject2 == localConstraintWidget2) {
              n = mListAnchors[paramInt2].getMargin();
            }
            if (localObject2 == localConstraintWidget3) {
              paramInt1 = mListAnchors[i1].getMargin();
            }
            if (m != 0) {
              i1 = 8;
            } else {
              i1 = 5;
            }
            paramLinearSystem.addCentering((SolverVariable)localObject6, paramChainHead, n, 0.5F, (SolverVariable)localObject3, (SolverVariable)localObject8, paramInt1, i1);
            break;
          }
        }
        if (((ConstraintWidget)localObject2).getVisibility() == 8) {
          localObject2 = localObject7;
        }
        localObject7 = localObject2;
        localObject2 = paramConstraintWidgetContainer;
        continue;
        m = 8;
        if ((k != 0) && (localConstraintWidget2 != null))
        {
          n = mWidgetsMatchCount;
          if ((n > 0) && (mWidgetsCount == n)) {
            n = 1;
          } else {
            n = 0;
          }
          paramChainHead = localConstraintWidget2;
          for (localObject7 = paramChainHead;; localObject7 = paramConstraintWidgetContainer)
          {
            i1 = paramInt1;
            if (localObject7 == null) {
              break;
            }
            for (paramConstraintWidgetContainer = mNextChainWidget[i1]; (paramConstraintWidgetContainer != null) && (paramConstraintWidgetContainer.getVisibility() == m); paramConstraintWidgetContainer = mNextChainWidget[i1]) {}
            if ((localObject7 != localConstraintWidget2) && (localObject7 != localConstraintWidget3) && (paramConstraintWidgetContainer != null))
            {
              if (paramConstraintWidgetContainer == localConstraintWidget3) {
                paramConstraintWidgetContainer = null;
              }
              localObject2 = mListAnchors[paramInt2];
              localObject8 = mSolverVariable;
              localObject3 = mTarget;
              if (localObject3 != null) {
                localObject3 = mSolverVariable;
              }
              localObject3 = mListAnchors;
              i1 = paramInt2 + 1;
              localSolverVariable = mSolverVariable;
              j = ((ConstraintAnchor)localObject2).getMargin();
              m = mListAnchors[i1].getMargin();
              if (paramConstraintWidgetContainer != null)
              {
                localObject6 = mListAnchors[paramInt2];
                localObject5 = mSolverVariable;
                localObject2 = mTarget;
                if (localObject2 != null) {
                  localObject2 = mSolverVariable;
                } else {
                  localObject2 = null;
                }
                localObject3 = localObject2;
              }
              else
              {
                localObject6 = mListAnchors[paramInt2];
                if (localObject6 != null) {
                  localObject2 = mSolverVariable;
                } else {
                  localObject2 = null;
                }
                localObject3 = mListAnchors[i1].mSolverVariable;
                localObject5 = localObject2;
              }
              if (localObject6 != null) {
                m = ((ConstraintAnchor)localObject6).getMargin() + m;
              }
              i3 = mListAnchors[i1].getMargin();
              if (n != 0) {
                i1 = 8;
              } else {
                i1 = 4;
              }
              if ((localObject8 != null) && (localSolverVariable != null) && (localObject5 != null) && (localObject3 != null)) {
                paramLinearSystem.addCentering((SolverVariable)localObject8, localSolverVariable, i3 + j, 0.5F, (SolverVariable)localObject5, (SolverVariable)localObject3, m, i1);
              }
              m = 8;
            }
            if (((ConstraintWidget)localObject7).getVisibility() != m) {
              paramChainHead = (ChainHead)localObject7;
            }
          }
          paramConstraintWidgetContainer = mListAnchors[paramInt2];
          paramChainHead = mListAnchors[paramInt2].mTarget;
          localObject7 = mListAnchors;
          paramInt1 = paramInt2 + 1;
          localObject2 = localObject7[paramInt1];
          localObject7 = mListAnchors[paramInt1].mTarget;
          if (paramChainHead != null) {
            if (localConstraintWidget2 != localConstraintWidget3) {
              paramLinearSystem.addEquality(mSolverVariable, mSolverVariable, paramConstraintWidgetContainer.getMargin(), 5);
            } else if (localObject7 != null) {
              paramLinearSystem.addCentering(mSolverVariable, mSolverVariable, paramConstraintWidgetContainer.getMargin(), 0.5F, mSolverVariable, mSolverVariable, ((ConstraintAnchor)localObject2).getMargin(), 5);
            }
          }
          if ((localObject7 != null) && (localConstraintWidget2 != localConstraintWidget3)) {
            paramLinearSystem.addEquality(mSolverVariable, mSolverVariable, -((ConstraintAnchor)localObject2).getMargin(), 5);
          }
        }
      }
    }
    if (((i2 != 0) || (k != 0)) && (localConstraintWidget2 != null) && (localConstraintWidget2 != localConstraintWidget3))
    {
      localObject5 = mListAnchors;
      localObject3 = localObject5[paramInt2];
      paramChainHead = localConstraintWidget3;
      if (localConstraintWidget3 == null) {
        paramChainHead = localConstraintWidget2;
      }
      paramConstraintWidgetContainer = mListAnchors;
      paramInt2++;
      localObject2 = paramConstraintWidgetContainer[paramInt2];
      paramConstraintWidgetContainer = mTarget;
      if (paramConstraintWidgetContainer != null) {
        localObject7 = mSolverVariable;
      } else {
        localObject7 = null;
      }
      paramConstraintWidgetContainer = mTarget;
      if (paramConstraintWidgetContainer != null) {
        paramConstraintWidgetContainer = mSolverVariable;
      } else {
        paramConstraintWidgetContainer = null;
      }
      if (localConstraintWidget1 != paramChainHead)
      {
        localObject1 = mListAnchors[paramInt2].mTarget;
        paramConstraintWidgetContainer = (ConstraintWidgetContainer)localObject4;
        if (localObject1 != null) {
          paramConstraintWidgetContainer = mSolverVariable;
        }
      }
      if (localConstraintWidget2 == paramChainHead) {
        localObject2 = localObject5[paramInt2];
      }
      if ((localObject7 != null) && (paramConstraintWidgetContainer != null))
      {
        paramInt1 = ((ConstraintAnchor)localObject3).getMargin();
        paramInt2 = mListAnchors[paramInt2].getMargin();
        paramLinearSystem.addCentering(mSolverVariable, (SolverVariable)localObject7, paramInt1, 0.5F, paramConstraintWidgetContainer, mSolverVariable, paramInt2, 5);
      }
    }
  }
  
  public static void applyChainConstraints(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, ArrayList<ConstraintWidget> paramArrayList, int paramInt)
  {
    int i = 0;
    int j;
    ChainHead[] arrayOfChainHead;
    int k;
    if (paramInt == 0)
    {
      j = mHorizontalChainsSize;
      arrayOfChainHead = mHorizontalChainsArray;
      k = 0;
    }
    else
    {
      j = mVerticalChainsSize;
      arrayOfChainHead = mVerticalChainsArray;
      k = 2;
    }
    while (i < j)
    {
      ChainHead localChainHead = arrayOfChainHead[i];
      localChainHead.define();
      if ((paramArrayList == null) || (paramArrayList.contains(mFirst))) {
        applyChainConstraints(paramConstraintWidgetContainer, paramLinearSystem, paramInt, k, localChainHead);
      }
      i++;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Chain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */