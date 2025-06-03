package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;
import z2;

public class Barrier
  extends HelperWidget
{
  public static final int BOTTOM = 3;
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  public static final int TOP = 2;
  private static final boolean USE_RELAX_GONE = false;
  private static final boolean USE_RESOLUTION = true;
  private boolean mAllowsGoneWidget = true;
  private int mBarrierType = 0;
  private int mMargin = 0;
  public boolean resolved = false;
  
  public Barrier() {}
  
  public Barrier(String paramString)
  {
    setDebugName(paramString);
  }
  
  public void addToSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    Object localObject1 = mListAnchors;
    localObject1[0] = mLeft;
    localObject1[2] = mTop;
    localObject1[1] = mRight;
    localObject1[3] = mBottom;
    for (int i = 0;; i++)
    {
      localObject1 = mListAnchors;
      if (i >= localObject1.length) {
        break;
      }
      localObject1 = localObject1[i];
      mSolverVariable = paramLinearSystem.createObjectVariable(localObject1);
    }
    i = mBarrierType;
    if ((i >= 0) && (i < 4))
    {
      localObject1 = localObject1[i];
      if (!resolved) {
        allSolved();
      }
      if (resolved)
      {
        resolved = false;
        i = mBarrierType;
        if ((i != 0) && (i != 1))
        {
          if ((i == 2) || (i == 3))
          {
            paramLinearSystem.addEquality(mTop.mSolverVariable, mY);
            paramLinearSystem.addEquality(mBottom.mSolverVariable, mY);
          }
        }
        else
        {
          paramLinearSystem.addEquality(mLeft.mSolverVariable, mX);
          paramLinearSystem.addEquality(mRight.mSolverVariable, mX);
        }
        return;
      }
      Object localObject2;
      for (i = 0; i < mWidgetsCount; i++)
      {
        localObject2 = mWidgets[i];
        if ((mAllowsGoneWidget) || (((ConstraintWidget)localObject2).allowedInBarrier()))
        {
          j = mBarrierType;
          if (((j == 0) || (j == 1)) && (((ConstraintWidget)localObject2).getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mLeft.mTarget != null) && (mRight.mTarget != null)) {}
          do
          {
            paramBoolean = true;
            break;
            j = mBarrierType;
          } while (((j == 2) || (j == 3)) && (((ConstraintWidget)localObject2).getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (mTop.mTarget != null) && (mBottom.mTarget != null));
        }
      }
      paramBoolean = false;
      if ((!mLeft.hasCenteredDependents()) && (!mRight.hasCenteredDependents())) {
        i = 0;
      } else {
        i = 1;
      }
      if ((!mTop.hasCenteredDependents()) && (!mBottom.hasCenteredDependents())) {
        j = 0;
      } else {
        j = 1;
      }
      int k;
      if (!paramBoolean)
      {
        k = mBarrierType;
        if (((k == 0) && (i != 0)) || ((k == 2) && (j != 0)) || ((k == 1) && (i != 0)) || ((k == 3) && (j != 0)))
        {
          j = 1;
          break label492;
        }
      }
      int j = 0;
      label492:
      i = 5;
      if (j == 0) {
        i = 4;
      }
      for (j = 0; j < mWidgetsCount; j++)
      {
        Object localObject3 = mWidgets[j];
        if ((mAllowsGoneWidget) || (((ConstraintWidget)localObject3).allowedInBarrier()))
        {
          localObject2 = paramLinearSystem.createObjectVariable(mListAnchors[mBarrierType]);
          localObject3 = mListAnchors;
          int m = mBarrierType;
          Object localObject4 = localObject3[m];
          mSolverVariable = ((SolverVariable)localObject2);
          localObject3 = mTarget;
          if ((localObject3 != null) && (mOwner == this)) {
            k = mMargin + 0;
          } else {
            k = 0;
          }
          if ((m != 0) && (m != 2)) {
            paramLinearSystem.addGreaterBarrier(mSolverVariable, (SolverVariable)localObject2, mMargin + k, paramBoolean);
          } else {
            paramLinearSystem.addLowerBarrier(mSolverVariable, (SolverVariable)localObject2, mMargin - k, paramBoolean);
          }
          paramLinearSystem.addEquality(mSolverVariable, (SolverVariable)localObject2, mMargin + k, i);
        }
      }
      i = mBarrierType;
      if (i == 0)
      {
        paramLinearSystem.addEquality(mRight.mSolverVariable, mLeft.mSolverVariable, 0, 8);
        paramLinearSystem.addEquality(mLeft.mSolverVariable, mParent.mRight.mSolverVariable, 0, 4);
        paramLinearSystem.addEquality(mLeft.mSolverVariable, mParent.mLeft.mSolverVariable, 0, 0);
      }
      else if (i == 1)
      {
        paramLinearSystem.addEquality(mLeft.mSolverVariable, mRight.mSolverVariable, 0, 8);
        paramLinearSystem.addEquality(mLeft.mSolverVariable, mParent.mLeft.mSolverVariable, 0, 4);
        paramLinearSystem.addEquality(mLeft.mSolverVariable, mParent.mRight.mSolverVariable, 0, 0);
      }
      else if (i == 2)
      {
        paramLinearSystem.addEquality(mBottom.mSolverVariable, mTop.mSolverVariable, 0, 8);
        paramLinearSystem.addEquality(mTop.mSolverVariable, mParent.mBottom.mSolverVariable, 0, 4);
        paramLinearSystem.addEquality(mTop.mSolverVariable, mParent.mTop.mSolverVariable, 0, 0);
      }
      else if (i == 3)
      {
        paramLinearSystem.addEquality(mTop.mSolverVariable, mBottom.mSolverVariable, 0, 8);
        paramLinearSystem.addEquality(mTop.mSolverVariable, mParent.mTop.mSolverVariable, 0, 4);
        paramLinearSystem.addEquality(mTop.mSolverVariable, mParent.mBottom.mSolverVariable, 0, 0);
      }
    }
  }
  
  public boolean allSolved()
  {
    int i = 0;
    int j = 0;
    int m;
    ConstraintWidget localConstraintWidget;
    int n;
    for (int k = 1;; k = m)
    {
      m = mWidgetsCount;
      if (j >= m) {
        break;
      }
      localConstraintWidget = mWidgets[j];
      if ((!mAllowsGoneWidget) && (!localConstraintWidget.allowedInBarrier()))
      {
        m = k;
      }
      else
      {
        m = mBarrierType;
        if (((m == 0) || (m == 1)) && (!localConstraintWidget.isResolvedHorizontally())) {}
        do
        {
          m = 0;
          break;
          n = mBarrierType;
          if (n != 2)
          {
            m = k;
            if (n != 3) {
              break;
            }
          }
          m = k;
        } while (!localConstraintWidget.isResolvedVertically());
      }
      j++;
    }
    if ((k != 0) && (m > 0))
    {
      j = 0;
      m = j;
      while (i < mWidgetsCount)
      {
        localConstraintWidget = mWidgets[i];
        if ((mAllowsGoneWidget) || (localConstraintWidget.allowedInBarrier()))
        {
          n = j;
          k = m;
          if (m == 0)
          {
            k = mBarrierType;
            if (k == 0) {
              j = localConstraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
            } else if (k == 1) {
              j = localConstraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
            } else if (k == 2) {
              j = localConstraintWidget.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
            } else if (k == 3) {
              j = localConstraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
            }
            k = 1;
            n = j;
          }
          int i1 = mBarrierType;
          if (i1 == 0)
          {
            j = Math.min(n, localConstraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
            m = k;
          }
          else if (i1 == 1)
          {
            j = Math.max(n, localConstraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
            m = k;
          }
          else if (i1 == 2)
          {
            j = Math.min(n, localConstraintWidget.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
            m = k;
          }
          else
          {
            j = n;
            m = k;
            if (i1 == 3)
            {
              j = Math.max(n, localConstraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
              m = k;
            }
          }
        }
        i++;
      }
      k = j + mMargin;
      j = mBarrierType;
      if ((j != 0) && (j != 1)) {
        setFinalVertical(k, k);
      } else {
        setFinalHorizontal(k, k);
      }
      resolved = true;
      return true;
    }
    return false;
  }
  
  public boolean allowedInBarrier()
  {
    return true;
  }
  
  @Deprecated
  public boolean allowsGoneWidget()
  {
    return mAllowsGoneWidget;
  }
  
  public void copy(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    super.copy(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (Barrier)paramConstraintWidget;
    mBarrierType = mBarrierType;
    mAllowsGoneWidget = mAllowsGoneWidget;
    mMargin = mMargin;
  }
  
  public boolean getAllowsGoneWidget()
  {
    return mAllowsGoneWidget;
  }
  
  public int getBarrierType()
  {
    return mBarrierType;
  }
  
  public int getMargin()
  {
    return mMargin;
  }
  
  public int getOrientation()
  {
    int i = mBarrierType;
    if ((i != 0) && (i != 1))
    {
      if ((i != 2) && (i != 3)) {
        return -1;
      }
      return 1;
    }
    return 0;
  }
  
  public boolean isResolvedHorizontally()
  {
    return resolved;
  }
  
  public boolean isResolvedVertically()
  {
    return resolved;
  }
  
  public void markWidgets()
  {
    for (int i = 0; i < mWidgetsCount; i++)
    {
      ConstraintWidget localConstraintWidget = mWidgets[i];
      if ((mAllowsGoneWidget) || (localConstraintWidget.allowedInBarrier()))
      {
        int j = mBarrierType;
        if ((j != 0) && (j != 1))
        {
          if ((j == 2) || (j == 3)) {
            localConstraintWidget.setInBarrier(1, true);
          }
        }
        else {
          localConstraintWidget.setInBarrier(0, true);
        }
      }
    }
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    mAllowsGoneWidget = paramBoolean;
  }
  
  public void setBarrierType(int paramInt)
  {
    mBarrierType = paramInt;
  }
  
  public void setMargin(int paramInt)
  {
    mMargin = paramInt;
  }
  
  public String toString()
  {
    Object localObject1 = z2.t("[Barrier] ");
    ((StringBuilder)localObject1).append(getDebugName());
    ((StringBuilder)localObject1).append(" {");
    localObject1 = ((StringBuilder)localObject1).toString();
    for (int i = 0; i < mWidgetsCount; i++)
    {
      ConstraintWidget localConstraintWidget = mWidgets[i];
      Object localObject2 = localObject1;
      if (i > 0) {
        localObject2 = z2.o((String)localObject1, ", ");
      }
      localObject1 = z2.t((String)localObject2);
      ((StringBuilder)localObject1).append(localConstraintWidget.getDebugName());
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    return z2.o((String)localObject1, "}");
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Barrier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */