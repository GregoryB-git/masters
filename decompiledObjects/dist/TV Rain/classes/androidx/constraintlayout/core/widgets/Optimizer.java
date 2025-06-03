package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

public class Optimizer
{
  public static final int FLAG_CHAIN_DANGLING = 1;
  public static final int FLAG_RECOMPUTE_BOUNDS = 2;
  public static final int FLAG_USE_OPTIMIZE = 0;
  public static final int OPTIMIZATION_BARRIER = 2;
  public static final int OPTIMIZATION_CACHE_MEASURES = 256;
  public static final int OPTIMIZATION_CHAIN = 4;
  public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
  public static final int OPTIMIZATION_DIMENSIONS = 8;
  public static final int OPTIMIZATION_DIRECT = 1;
  public static final int OPTIMIZATION_GRAPH = 64;
  public static final int OPTIMIZATION_GRAPH_WRAP = 128;
  public static final int OPTIMIZATION_GROUPING = 1024;
  public static final int OPTIMIZATION_GROUPS = 32;
  public static final int OPTIMIZATION_NONE = 0;
  public static final int OPTIMIZATION_RATIO = 16;
  public static final int OPTIMIZATION_STANDARD = 257;
  public static boolean[] flags = new boolean[3];
  
  public static void checkMatchParent(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, ConstraintWidget paramConstraintWidget)
  {
    mHorizontalResolution = -1;
    mVerticalResolution = -1;
    Object localObject = mListDimensionBehaviors[0];
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    int i;
    int j;
    if ((localObject != localDimensionBehaviour) && (mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
    {
      i = mLeft.mMargin;
      j = paramConstraintWidgetContainer.getWidth() - mRight.mMargin;
      localObject = mLeft;
      mSolverVariable = paramLinearSystem.createObjectVariable(localObject);
      localObject = mRight;
      mSolverVariable = paramLinearSystem.createObjectVariable(localObject);
      paramLinearSystem.addEquality(mLeft.mSolverVariable, i);
      paramLinearSystem.addEquality(mRight.mSolverVariable, j);
      mHorizontalResolution = 2;
      paramConstraintWidget.setHorizontalDimension(i, j);
    }
    if ((mListDimensionBehaviors[1] != localDimensionBehaviour) && (mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
    {
      i = mTop.mMargin;
      j = paramConstraintWidgetContainer.getHeight() - mBottom.mMargin;
      paramConstraintWidgetContainer = mTop;
      mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidgetContainer);
      paramConstraintWidgetContainer = mBottom;
      mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidgetContainer);
      paramLinearSystem.addEquality(mTop.mSolverVariable, i);
      paramLinearSystem.addEquality(mBottom.mSolverVariable, j);
      if ((mBaselineDistance > 0) || (paramConstraintWidget.getVisibility() == 8))
      {
        paramConstraintWidgetContainer = mBaseline;
        mSolverVariable = paramLinearSystem.createObjectVariable(paramConstraintWidgetContainer);
        paramLinearSystem.addEquality(mBaseline.mSolverVariable, mBaselineDistance + i);
      }
      mVerticalResolution = 2;
      paramConstraintWidget.setVerticalDimension(i, j);
    }
  }
  
  public static final boolean enabled(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & paramInt2) == paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Optimizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */