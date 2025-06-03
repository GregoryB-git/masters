package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.SolverVariable.Type;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor
{
  private static final boolean ALLOW_BINARY = false;
  private static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
  private HashSet<ConstraintAnchor> mDependents = null;
  private int mFinalValue;
  public int mGoneMargin = Integer.MIN_VALUE;
  private boolean mHasFinalValue;
  public int mMargin = 0;
  public final ConstraintWidget mOwner;
  public SolverVariable mSolverVariable;
  public ConstraintAnchor mTarget;
  public final Type mType;
  
  public ConstraintAnchor(ConstraintWidget paramConstraintWidget, Type paramType)
  {
    mOwner = paramConstraintWidget;
    mType = paramType;
  }
  
  private boolean isConnectionToMe(ConstraintWidget paramConstraintWidget, HashSet<ConstraintWidget> paramHashSet)
  {
    if (paramHashSet.contains(paramConstraintWidget)) {
      return false;
    }
    paramHashSet.add(paramConstraintWidget);
    if (paramConstraintWidget == getOwner()) {
      return true;
    }
    paramConstraintWidget = paramConstraintWidget.getAnchors();
    int i = paramConstraintWidget.size();
    for (int j = 0; j < i; j++)
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)paramConstraintWidget.get(j);
      if ((localConstraintAnchor.isSimilarDimensionConnection(this)) && (localConstraintAnchor.isConnected()) && (isConnectionToMe(localConstraintAnchor.getTarget().getOwner(), paramHashSet))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean connect(ConstraintAnchor paramConstraintAnchor, int paramInt)
  {
    return connect(paramConstraintAnchor, paramInt, Integer.MIN_VALUE, false);
  }
  
  public boolean connect(ConstraintAnchor paramConstraintAnchor, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramConstraintAnchor == null)
    {
      reset();
      return true;
    }
    if ((!paramBoolean) && (!isValidConnection(paramConstraintAnchor))) {
      return false;
    }
    mTarget = paramConstraintAnchor;
    if (mDependents == null) {
      mDependents = new HashSet();
    }
    paramConstraintAnchor = mTarget.mDependents;
    if (paramConstraintAnchor != null) {
      paramConstraintAnchor.add(this);
    }
    mMargin = paramInt1;
    mGoneMargin = paramInt2;
    return true;
  }
  
  public void copyFrom(ConstraintAnchor paramConstraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    Object localObject = mTarget;
    if (localObject != null)
    {
      localObject = mDependents;
      if (localObject != null) {
        ((HashSet)localObject).remove(this);
      }
    }
    localObject = mTarget;
    if (localObject != null)
    {
      localObject = ((ConstraintAnchor)localObject).getType();
      mTarget = ((ConstraintWidget)paramHashMap.get(mTarget.mOwner)).getAnchor((Type)localObject);
    }
    else
    {
      mTarget = null;
    }
    paramHashMap = mTarget;
    if (paramHashMap != null)
    {
      if (mDependents == null) {
        mDependents = new HashSet();
      }
      mTarget.mDependents.add(this);
    }
    mMargin = mMargin;
    mGoneMargin = mGoneMargin;
  }
  
  public void findDependents(int paramInt, ArrayList<WidgetGroup> paramArrayList, WidgetGroup paramWidgetGroup)
  {
    Object localObject = mDependents;
    if (localObject != null)
    {
      localObject = ((HashSet)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        Grouping.findDependents(nextmOwner, paramInt, paramArrayList, paramWidgetGroup);
      }
    }
  }
  
  public HashSet<ConstraintAnchor> getDependents()
  {
    return mDependents;
  }
  
  public int getFinalValue()
  {
    if (!mHasFinalValue) {
      return 0;
    }
    return mFinalValue;
  }
  
  public int getMargin()
  {
    if (mOwner.getVisibility() == 8) {
      return 0;
    }
    if (mGoneMargin != Integer.MIN_VALUE)
    {
      ConstraintAnchor localConstraintAnchor = mTarget;
      if ((localConstraintAnchor != null) && (mOwner.getVisibility() == 8)) {
        return mGoneMargin;
      }
    }
    return mMargin;
  }
  
  public final ConstraintAnchor getOpposite()
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[mType.ordinal()])
    {
    default: 
      throw new AssertionError(mType.name());
    case 5: 
      return mOwner.mTop;
    case 4: 
      return mOwner.mBottom;
    case 3: 
      return mOwner.mLeft;
    case 2: 
      return mOwner.mRight;
    }
    return null;
  }
  
  public ConstraintWidget getOwner()
  {
    return mOwner;
  }
  
  public SolverVariable getSolverVariable()
  {
    return mSolverVariable;
  }
  
  public ConstraintAnchor getTarget()
  {
    return mTarget;
  }
  
  public Type getType()
  {
    return mType;
  }
  
  public boolean hasCenteredDependents()
  {
    Object localObject = mDependents;
    if (localObject == null) {
      return false;
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((ConstraintAnchor)((Iterator)localObject).next()).getOpposite().isConnected()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasDependents()
  {
    HashSet localHashSet = mDependents;
    boolean bool = false;
    if (localHashSet == null) {
      return false;
    }
    if (localHashSet.size() > 0) {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasFinalValue()
  {
    return mHasFinalValue;
  }
  
  public boolean isConnected()
  {
    boolean bool;
    if (mTarget != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isConnectionAllowed(ConstraintWidget paramConstraintWidget)
  {
    if (isConnectionToMe(paramConstraintWidget, new HashSet())) {
      return false;
    }
    ConstraintWidget localConstraintWidget = getOwner().getParent();
    if (localConstraintWidget == paramConstraintWidget) {
      return true;
    }
    return paramConstraintWidget.getParent() == localConstraintWidget;
  }
  
  public boolean isConnectionAllowed(ConstraintWidget paramConstraintWidget, ConstraintAnchor paramConstraintAnchor)
  {
    return isConnectionAllowed(paramConstraintWidget);
  }
  
  public boolean isSideAnchor()
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[mType.ordinal()])
    {
    default: 
      throw new AssertionError(mType.name());
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return true;
    }
    return false;
  }
  
  public boolean isSimilarDimensionConnection(ConstraintAnchor paramConstraintAnchor)
  {
    Type localType = paramConstraintAnchor.getType();
    paramConstraintAnchor = mType;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (localType == paramConstraintAnchor) {
      return true;
    }
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[paramConstraintAnchor.ordinal()])
    {
    default: 
      throw new AssertionError(mType.name());
    case 9: 
      return false;
    case 4: 
    case 5: 
    case 6: 
    case 8: 
      bool2 = bool3;
      if (localType != Type.TOP)
      {
        bool2 = bool3;
        if (localType != Type.BOTTOM)
        {
          bool2 = bool3;
          if (localType != Type.CENTER_Y) {
            if (localType == Type.BASELINE) {
              bool2 = bool3;
            } else {
              bool2 = false;
            }
          }
        }
      }
      return bool2;
    case 2: 
    case 3: 
    case 7: 
      bool2 = bool1;
      if (localType != Type.LEFT)
      {
        bool2 = bool1;
        if (localType != Type.RIGHT) {
          if (localType == Type.CENTER_X) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
      }
      return bool2;
    }
    if (localType == Type.BASELINE) {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean isValidConnection(ConstraintAnchor paramConstraintAnchor)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramConstraintAnchor == null) {
      return false;
    }
    Type localType1 = paramConstraintAnchor.getType();
    Type localType2 = mType;
    if (localType1 == localType2) {
      return (localType2 != Type.BASELINE) || ((paramConstraintAnchor.getOwner().hasBaseline()) && (getOwner().hasBaseline()));
    }
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[localType2.ordinal()])
    {
    default: 
      throw new AssertionError(mType.name());
    case 7: 
    case 8: 
    case 9: 
      return false;
    case 6: 
      return (localType1 != Type.LEFT) && (localType1 != Type.RIGHT);
    case 4: 
    case 5: 
      if ((localType1 != Type.TOP) && (localType1 != Type.BOTTOM)) {
        bool4 = false;
      } else {
        bool4 = true;
      }
      bool2 = bool4;
      if ((paramConstraintAnchor.getOwner() instanceof Guideline))
      {
        if (!bool4)
        {
          bool4 = bool3;
          if (localType1 != Type.CENTER_Y) {}
        }
        else
        {
          bool4 = true;
        }
        bool2 = bool4;
      }
      return bool2;
    case 2: 
    case 3: 
      if ((localType1 != Type.LEFT) && (localType1 != Type.RIGHT)) {
        bool4 = false;
      } else {
        bool4 = true;
      }
      bool2 = bool4;
      if ((paramConstraintAnchor.getOwner() instanceof Guideline))
      {
        if (!bool4)
        {
          bool4 = bool1;
          if (localType1 != Type.CENTER_X) {}
        }
        else
        {
          bool4 = true;
        }
        bool2 = bool4;
      }
      return bool2;
    }
    boolean bool4 = bool2;
    if (localType1 != Type.BASELINE)
    {
      bool4 = bool2;
      if (localType1 != Type.CENTER_X)
      {
        bool4 = bool2;
        if (localType1 != Type.CENTER_Y) {
          bool4 = true;
        }
      }
    }
    return bool4;
  }
  
  public boolean isVerticalAnchor()
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[mType.ordinal()])
    {
    default: 
      throw new AssertionError(mType.name());
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
      return true;
    }
    return false;
  }
  
  public void reset()
  {
    Object localObject = mTarget;
    if (localObject != null)
    {
      localObject = mDependents;
      if (localObject != null)
      {
        ((HashSet)localObject).remove(this);
        if (mTarget.mDependents.size() == 0) {
          mTarget.mDependents = null;
        }
      }
    }
    mDependents = null;
    mTarget = null;
    mMargin = 0;
    mGoneMargin = Integer.MIN_VALUE;
    mHasFinalValue = false;
    mFinalValue = 0;
  }
  
  public void resetFinalResolution()
  {
    mHasFinalValue = false;
    mFinalValue = 0;
  }
  
  public void resetSolverVariable(Cache paramCache)
  {
    paramCache = mSolverVariable;
    if (paramCache == null) {
      mSolverVariable = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
    } else {
      paramCache.reset();
    }
  }
  
  public void setFinalValue(int paramInt)
  {
    mFinalValue = paramInt;
    mHasFinalValue = true;
  }
  
  public void setGoneMargin(int paramInt)
  {
    if (isConnected()) {
      mGoneMargin = paramInt;
    }
  }
  
  public void setMargin(int paramInt)
  {
    if (isConnected()) {
      mMargin = paramInt;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mOwner.getDebugName());
    localStringBuilder.append(":");
    localStringBuilder.append(mType.toString());
    return localStringBuilder.toString();
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("NONE", 0);
      NONE = localType1;
      Type localType2 = new Type("LEFT", 1);
      LEFT = localType2;
      Type localType3 = new Type("TOP", 2);
      TOP = localType3;
      Type localType4 = new Type("RIGHT", 3);
      RIGHT = localType4;
      Type localType5 = new Type("BOTTOM", 4);
      BOTTOM = localType5;
      Type localType6 = new Type("BASELINE", 5);
      BASELINE = localType6;
      Type localType7 = new Type("CENTER", 6);
      CENTER = localType7;
      Type localType8 = new Type("CENTER_X", 7);
      CENTER_X = localType8;
      Type localType9 = new Type("CENTER_Y", 8);
      CENTER_Y = localType9;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5, localType6, localType7, localType8, localType9 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.ConstraintAnchor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */