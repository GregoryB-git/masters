package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.List;

public abstract class WidgetRun
  implements Dependency
{
  public DimensionDependency dimension = new DimensionDependency(this);
  public ConstraintWidget.DimensionBehaviour dimensionBehavior;
  public DependencyNode end = new DependencyNode(this);
  public RunType mRunType = RunType.NONE;
  public int matchConstraintsType;
  public int orientation = 0;
  public boolean resolved = false;
  public RunGroup runGroup;
  public DependencyNode start = new DependencyNode(this);
  public ConstraintWidget widget;
  
  public WidgetRun(ConstraintWidget paramConstraintWidget)
  {
    widget = paramConstraintWidget;
  }
  
  private void resolveDimension(int paramInt1, int paramInt2)
  {
    int i = matchConstraintsType;
    if (i != 0)
    {
      if (i != 1)
      {
        ConstraintWidget localConstraintWidget;
        Object localObject1;
        float f;
        if (i != 2)
        {
          if (i == 3)
          {
            localConstraintWidget = widget;
            localObject1 = horizontalRun;
            Object localObject2 = dimensionBehavior;
            ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if ((localObject2 == localDimensionBehaviour) && (matchConstraintsType == 3))
            {
              localObject2 = verticalRun;
              if ((dimensionBehavior == localDimensionBehaviour) && (matchConstraintsType == 3)) {}
            }
            else
            {
              if (paramInt1 == 0) {
                localObject1 = verticalRun;
              }
              if (dimension.resolved)
              {
                f = localConstraintWidget.getDimensionRatio();
                if (paramInt1 == 1) {
                  paramInt1 = (int)(dimension.value / f + 0.5F);
                } else {
                  paramInt1 = (int)(f * dimension.value + 0.5F);
                }
                dimension.resolve(paramInt1);
              }
            }
          }
        }
        else
        {
          localObject1 = widget.getParent();
          if (localObject1 != null)
          {
            if (paramInt1 == 0) {
              localObject1 = horizontalRun;
            } else {
              localObject1 = verticalRun;
            }
            localObject1 = dimension;
            if (resolved)
            {
              localConstraintWidget = widget;
              if (paramInt1 == 0) {
                f = mMatchConstraintPercentWidth;
              } else {
                f = mMatchConstraintPercentHeight;
              }
              paramInt2 = (int)(value * f + 0.5F);
              dimension.resolve(getLimitedDimension(paramInt2, paramInt1));
            }
          }
        }
      }
      else
      {
        paramInt1 = getLimitedDimension(dimension.wrapValue, paramInt1);
        dimension.resolve(Math.min(paramInt1, paramInt2));
      }
    }
    else {
      dimension.resolve(getLimitedDimension(paramInt2, paramInt1));
    }
  }
  
  public final void addTarget(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt)
  {
    targets.add(paramDependencyNode2);
    margin = paramInt;
    dependencies.add(paramDependencyNode1);
  }
  
  public final void addTarget(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2, int paramInt, DimensionDependency paramDimensionDependency)
  {
    targets.add(paramDependencyNode2);
    targets.add(dimension);
    marginFactor = paramInt;
    marginDependency = paramDimensionDependency;
    dependencies.add(paramDependencyNode1);
    dependencies.add(paramDependencyNode1);
  }
  
  public abstract void apply();
  
  public abstract void applyToWidget();
  
  public abstract void clear();
  
  public final int getLimitedDimension(int paramInt1, int paramInt2)
  {
    ConstraintWidget localConstraintWidget;
    if (paramInt2 == 0)
    {
      localConstraintWidget = widget;
      i = mMatchConstraintMaxWidth;
      paramInt2 = Math.max(mMatchConstraintMinWidth, paramInt1);
      if (i > 0) {
        paramInt2 = Math.min(i, paramInt1);
      }
      i = paramInt1;
      if (paramInt2 == paramInt1) {
        break label90;
      }
    }
    else
    {
      localConstraintWidget = widget;
      i = mMatchConstraintMaxHeight;
      paramInt2 = Math.max(mMatchConstraintMinHeight, paramInt1);
      if (i > 0) {
        paramInt2 = Math.min(i, paramInt1);
      }
      i = paramInt1;
      if (paramInt2 == paramInt1) {
        break label90;
      }
    }
    int i = paramInt2;
    label90:
    return i;
  }
  
  public final DependencyNode getTarget(ConstraintAnchor paramConstraintAnchor)
  {
    Object localObject = mTarget;
    paramConstraintAnchor = null;
    if (localObject == null) {
      return null;
    }
    ConstraintWidget localConstraintWidget = mOwner;
    localObject = mType;
    int i = 1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[localObject.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5) {
              paramConstraintAnchor = verticalRun.end;
            }
          }
          else {
            paramConstraintAnchor = verticalRun.baseline;
          }
        }
        else {
          paramConstraintAnchor = verticalRun.start;
        }
      }
      else {
        paramConstraintAnchor = horizontalRun.end;
      }
    }
    else {
      paramConstraintAnchor = horizontalRun.start;
    }
    return paramConstraintAnchor;
  }
  
  public final DependencyNode getTarget(ConstraintAnchor paramConstraintAnchor, int paramInt)
  {
    Object localObject1 = mTarget;
    Object localObject2 = null;
    if (localObject1 == null) {
      return null;
    }
    paramConstraintAnchor = mOwner;
    if (paramInt == 0) {
      paramConstraintAnchor = horizontalRun;
    } else {
      paramConstraintAnchor = verticalRun;
    }
    localObject1 = mType;
    paramInt = 1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[localObject1.ordinal()];
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          break label84;
        }
        if (paramInt != 5) {
          return (ConstraintAnchor)localObject2;
        }
      }
      return end;
    }
    label84:
    paramConstraintAnchor = start;
    return paramConstraintAnchor;
  }
  
  public long getWrapDimension()
  {
    DimensionDependency localDimensionDependency = dimension;
    if (resolved) {
      return value;
    }
    return 0L;
  }
  
  public boolean isCenterConnection()
  {
    int i = start.targets.size();
    boolean bool = false;
    int j = 0;
    for (int k = j; j < i; k = m)
    {
      m = k;
      if (start.targets.get(j)).run != this) {
        m = k + 1;
      }
      j++;
    }
    i = end.targets.size();
    j = 0;
    int m = k;
    k = j;
    while (k < i)
    {
      j = m;
      if (end.targets.get(k)).run != this) {
        j = m + 1;
      }
      k++;
      m = j;
    }
    if (m >= 2) {
      bool = true;
    }
    return bool;
  }
  
  public boolean isDimensionResolved()
  {
    return dimension.resolved;
  }
  
  public boolean isResolved()
  {
    return resolved;
  }
  
  public abstract void reset();
  
  public abstract boolean supportsWrapComputation();
  
  public void update(Dependency paramDependency) {}
  
  public void updateRunCenter(Dependency paramDependency, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt)
  {
    DependencyNode localDependencyNode = getTarget(paramConstraintAnchor1);
    paramDependency = getTarget(paramConstraintAnchor2);
    if ((resolved) && (resolved))
    {
      int i = value;
      i = paramConstraintAnchor1.getMargin() + i;
      int j = value - paramConstraintAnchor2.getMargin();
      int k = j - i;
      if ((!dimension.resolved) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)) {
        resolveDimension(paramInt, k);
      }
      paramConstraintAnchor1 = dimension;
      if (!resolved) {
        return;
      }
      if (value == k)
      {
        start.resolve(i);
        end.resolve(j);
        return;
      }
      paramConstraintAnchor1 = widget;
      float f1;
      if (paramInt == 0) {
        f1 = paramConstraintAnchor1.getHorizontalBiasPercent();
      } else {
        f1 = paramConstraintAnchor1.getVerticalBiasPercent();
      }
      paramInt = j;
      if (localDependencyNode == paramDependency)
      {
        i = value;
        paramInt = value;
        f1 = 0.5F;
      }
      j = dimension.value;
      paramDependency = start;
      float f2 = i;
      paramDependency.resolve((int)((paramInt - i - j) * f1 + (f2 + 0.5F)));
      end.resolve(start.value + dimension.value);
    }
  }
  
  public void updateRunEnd(Dependency paramDependency) {}
  
  public void updateRunStart(Dependency paramDependency) {}
  
  public long wrapSize(int paramInt)
  {
    DimensionDependency localDimensionDependency = dimension;
    if (resolved)
    {
      long l = value;
      if (isCenterConnection()) {}
      for (paramInt = start.margin - end.margin;; paramInt = start.margin)
      {
        l += paramInt;
        break label75;
        if (paramInt != 0) {
          break;
        }
      }
      l -= end.margin;
      label75:
      return l;
    }
    return 0L;
  }
  
  public static enum RunType
  {
    static
    {
      RunType localRunType1 = new RunType("NONE", 0);
      NONE = localRunType1;
      RunType localRunType2 = new RunType("START", 1);
      START = localRunType2;
      RunType localRunType3 = new RunType("END", 2);
      END = localRunType3;
      RunType localRunType4 = new RunType("CENTER", 3);
      CENTER = localRunType4;
      $VALUES = new RunType[] { localRunType1, localRunType2, localRunType3, localRunType4 };
    }
    
    private RunType() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetRun
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */