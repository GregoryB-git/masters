package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashMap;

public class Guideline
  extends ConstraintWidget
{
  public static final int HORIZONTAL = 0;
  public static final int RELATIVE_BEGIN = 1;
  public static final int RELATIVE_END = 2;
  public static final int RELATIVE_PERCENT = 0;
  public static final int RELATIVE_UNKNOWN = -1;
  public static final int VERTICAL = 1;
  public boolean guidelineUseRtl = true;
  private ConstraintAnchor mAnchor = mTop;
  private int mMinimumPosition;
  private int mOrientation;
  public int mRelativeBegin = -1;
  public int mRelativeEnd = -1;
  public float mRelativePercent = -1.0F;
  private boolean resolved;
  
  public Guideline()
  {
    int i = 0;
    mOrientation = 0;
    mMinimumPosition = 0;
    mAnchors.clear();
    mAnchors.add(mAnchor);
    int j = mListAnchors.length;
    while (i < j)
    {
      mListAnchors[i] = mAnchor;
      i++;
    }
  }
  
  public void addToSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    Object localObject1 = (ConstraintWidgetContainer)getParent();
    if (localObject1 == null) {
      return;
    }
    ConstraintAnchor localConstraintAnchor = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.LEFT);
    Object localObject2 = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.RIGHT);
    ConstraintWidget localConstraintWidget = mParent;
    int i = 1;
    int j;
    if ((localConstraintWidget != null) && (mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
      j = 1;
    } else {
      j = 0;
    }
    if (mOrientation == 0)
    {
      localConstraintAnchor = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.TOP);
      localObject2 = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.BOTTOM);
      localObject1 = mParent;
      if ((localObject1 != null) && (mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
        j = i;
      } else {
        j = 0;
      }
    }
    if ((resolved) && (mAnchor.hasFinalValue()))
    {
      localObject1 = paramLinearSystem.createObjectVariable(mAnchor);
      paramLinearSystem.addEquality((SolverVariable)localObject1, mAnchor.getFinalValue());
      if (mRelativeBegin != -1)
      {
        if (j != 0) {
          paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(localObject2), (SolverVariable)localObject1, 0, 5);
        }
      }
      else if ((mRelativeEnd != -1) && (j != 0))
      {
        localObject2 = paramLinearSystem.createObjectVariable(localObject2);
        paramLinearSystem.addGreaterThan((SolverVariable)localObject1, paramLinearSystem.createObjectVariable(localConstraintAnchor), 0, 5);
        paramLinearSystem.addGreaterThan((SolverVariable)localObject2, (SolverVariable)localObject1, 0, 5);
      }
      resolved = false;
      return;
    }
    if (mRelativeBegin != -1)
    {
      localObject1 = paramLinearSystem.createObjectVariable(mAnchor);
      paramLinearSystem.addEquality((SolverVariable)localObject1, paramLinearSystem.createObjectVariable(localConstraintAnchor), mRelativeBegin, 8);
      if (j != 0) {
        paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(localObject2), (SolverVariable)localObject1, 0, 5);
      }
    }
    else if (mRelativeEnd != -1)
    {
      localObject1 = paramLinearSystem.createObjectVariable(mAnchor);
      localObject2 = paramLinearSystem.createObjectVariable(localObject2);
      paramLinearSystem.addEquality((SolverVariable)localObject1, (SolverVariable)localObject2, -mRelativeEnd, 8);
      if (j != 0)
      {
        paramLinearSystem.addGreaterThan((SolverVariable)localObject1, paramLinearSystem.createObjectVariable(localConstraintAnchor), 0, 5);
        paramLinearSystem.addGreaterThan((SolverVariable)localObject2, (SolverVariable)localObject1, 0, 5);
      }
    }
    else if (mRelativePercent != -1.0F)
    {
      paramLinearSystem.addConstraint(LinearSystem.createRowDimensionPercent(paramLinearSystem, paramLinearSystem.createObjectVariable(mAnchor), paramLinearSystem.createObjectVariable(localObject2), mRelativePercent));
    }
  }
  
  public boolean allowedInBarrier()
  {
    return true;
  }
  
  public void copy(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    super.copy(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (Guideline)paramConstraintWidget;
    mRelativePercent = mRelativePercent;
    mRelativeBegin = mRelativeBegin;
    mRelativeEnd = mRelativeEnd;
    guidelineUseRtl = guidelineUseRtl;
    setOrientation(mOrientation);
  }
  
  public void cyclePosition()
  {
    if (mRelativeBegin != -1) {
      inferRelativePercentPosition();
    } else if (mRelativePercent != -1.0F) {
      inferRelativeEndPosition();
    } else if (mRelativeEnd != -1) {
      inferRelativeBeginPosition();
    }
  }
  
  public ConstraintAnchor getAnchor()
  {
    return mAnchor;
  }
  
  public ConstraintAnchor getAnchor(ConstraintAnchor.Type paramType)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[paramType.ordinal()];
    if ((i != 1) && (i != 2))
    {
      if (((i == 3) || (i == 4)) && (mOrientation == 0)) {
        return mAnchor;
      }
    }
    else if (mOrientation == 1) {
      return mAnchor;
    }
    return null;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public int getRelativeBegin()
  {
    return mRelativeBegin;
  }
  
  public int getRelativeBehaviour()
  {
    if (mRelativePercent != -1.0F) {
      return 0;
    }
    if (mRelativeBegin != -1) {
      return 1;
    }
    if (mRelativeEnd != -1) {
      return 2;
    }
    return -1;
  }
  
  public int getRelativeEnd()
  {
    return mRelativeEnd;
  }
  
  public float getRelativePercent()
  {
    return mRelativePercent;
  }
  
  public String getType()
  {
    return "Guideline";
  }
  
  public void inferRelativeBeginPosition()
  {
    int i = getX();
    if (mOrientation == 0) {
      i = getY();
    }
    setGuideBegin(i);
  }
  
  public void inferRelativeEndPosition()
  {
    int i = getParent().getWidth() - getX();
    if (mOrientation == 0) {
      i = getParent().getHeight() - getY();
    }
    setGuideEnd(i);
  }
  
  public void inferRelativePercentPosition()
  {
    float f = getX() / getParent().getWidth();
    if (mOrientation == 0) {
      f = getY() / getParent().getHeight();
    }
    setGuidePercent(f);
  }
  
  public boolean isPercent()
  {
    boolean bool;
    if ((mRelativePercent != -1.0F) && (mRelativeBegin == -1) && (mRelativeEnd == -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isResolvedHorizontally()
  {
    return resolved;
  }
  
  public boolean isResolvedVertically()
  {
    return resolved;
  }
  
  public void setFinalValue(int paramInt)
  {
    mAnchor.setFinalValue(paramInt);
    resolved = true;
  }
  
  public void setGuideBegin(int paramInt)
  {
    if (paramInt > -1)
    {
      mRelativePercent = -1.0F;
      mRelativeBegin = paramInt;
      mRelativeEnd = -1;
    }
  }
  
  public void setGuideEnd(int paramInt)
  {
    if (paramInt > -1)
    {
      mRelativePercent = -1.0F;
      mRelativeBegin = -1;
      mRelativeEnd = paramInt;
    }
  }
  
  public void setGuidePercent(float paramFloat)
  {
    if (paramFloat > -1.0F)
    {
      mRelativePercent = paramFloat;
      mRelativeBegin = -1;
      mRelativeEnd = -1;
    }
  }
  
  public void setGuidePercent(int paramInt)
  {
    setGuidePercent(paramInt / 100.0F);
  }
  
  public void setMinimumPosition(int paramInt)
  {
    mMinimumPosition = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    if (mOrientation == paramInt) {
      return;
    }
    mOrientation = paramInt;
    mAnchors.clear();
    if (mOrientation == 1) {
      mAnchor = mLeft;
    } else {
      mAnchor = mTop;
    }
    mAnchors.add(mAnchor);
    int i = mListAnchors.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      mListAnchors[paramInt] = mAnchor;
    }
  }
  
  public void updateFromSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    if (getParent() == null) {
      return;
    }
    int i = paramLinearSystem.getObjectVariableValue(mAnchor);
    if (mOrientation == 1)
    {
      setX(i);
      setY(0);
      setHeight(getParent().getHeight());
      setWidth(0);
    }
    else
    {
      setX(0);
      setY(i);
      setWidth(getParent().getWidth());
      setHeight(0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Guideline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */