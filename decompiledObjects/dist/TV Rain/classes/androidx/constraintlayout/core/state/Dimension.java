package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;

public class Dimension
{
  public static final Object FIXED_DIMENSION = new Object();
  public static final Object PARENT_DIMENSION = new Object();
  public static final Object PERCENT_DIMENSION = new Object();
  public static final Object RATIO_DIMENSION = new Object();
  public static final Object SPREAD_DIMENSION;
  public static final Object WRAP_DIMENSION = new Object();
  private final int WRAP_CONTENT = -2;
  public Object mInitialValue;
  public boolean mIsSuggested;
  public int mMax = Integer.MAX_VALUE;
  public int mMin = 0;
  public float mPercent = 1.0F;
  public String mRatioString = null;
  public int mValue = 0;
  
  static
  {
    SPREAD_DIMENSION = new Object();
  }
  
  private Dimension()
  {
    mInitialValue = WRAP_DIMENSION;
    mIsSuggested = false;
  }
  
  private Dimension(Object paramObject)
  {
    mIsSuggested = false;
    mInitialValue = paramObject;
  }
  
  public static Dimension Fixed(int paramInt)
  {
    Dimension localDimension = new Dimension(FIXED_DIMENSION);
    localDimension.fixed(paramInt);
    return localDimension;
  }
  
  public static Dimension Fixed(Object paramObject)
  {
    Dimension localDimension = new Dimension(FIXED_DIMENSION);
    localDimension.fixed(paramObject);
    return localDimension;
  }
  
  public static Dimension Parent()
  {
    return new Dimension(PARENT_DIMENSION);
  }
  
  public static Dimension Percent(Object paramObject, float paramFloat)
  {
    Dimension localDimension = new Dimension(PERCENT_DIMENSION);
    localDimension.percent(paramObject, paramFloat);
    return localDimension;
  }
  
  public static Dimension Ratio(String paramString)
  {
    Dimension localDimension = new Dimension(RATIO_DIMENSION);
    localDimension.ratio(paramString);
    return localDimension;
  }
  
  public static Dimension Spread()
  {
    return new Dimension(SPREAD_DIMENSION);
  }
  
  public static Dimension Suggested(int paramInt)
  {
    Dimension localDimension = new Dimension();
    localDimension.suggested(paramInt);
    return localDimension;
  }
  
  public static Dimension Suggested(Object paramObject)
  {
    Dimension localDimension = new Dimension();
    localDimension.suggested(paramObject);
    return localDimension;
  }
  
  public static Dimension Wrap()
  {
    return new Dimension(WRAP_DIMENSION);
  }
  
  public void apply(State paramState, ConstraintWidget paramConstraintWidget, int paramInt)
  {
    paramState = mRatioString;
    if (paramState != null) {
      paramConstraintWidget.setDimensionRatio(paramState);
    }
    int i = 2;
    if (paramInt == 0)
    {
      if (mIsSuggested)
      {
        paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
        paramState = mInitialValue;
        if (paramState == WRAP_DIMENSION) {
          paramInt = 1;
        } else if (paramState == PERCENT_DIMENSION) {
          paramInt = i;
        } else {
          paramInt = 0;
        }
        paramConstraintWidget.setHorizontalMatchStyle(paramInt, mMin, mMax, mPercent);
      }
      else
      {
        paramInt = mMin;
        if (paramInt > 0) {
          paramConstraintWidget.setMinWidth(paramInt);
        }
        paramInt = mMax;
        if (paramInt < Integer.MAX_VALUE) {
          paramConstraintWidget.setMaxWidth(paramInt);
        }
        paramState = mInitialValue;
        if (paramState == WRAP_DIMENSION)
        {
          paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
        }
        else if (paramState == PARENT_DIMENSION)
        {
          paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        }
        else if (paramState == null)
        {
          paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
          paramConstraintWidget.setWidth(mValue);
        }
      }
    }
    else if (mIsSuggested)
    {
      paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
      paramState = mInitialValue;
      if (paramState == WRAP_DIMENSION) {
        paramInt = 1;
      } else if (paramState == PERCENT_DIMENSION) {
        paramInt = i;
      } else {
        paramInt = 0;
      }
      paramConstraintWidget.setVerticalMatchStyle(paramInt, mMin, mMax, mPercent);
    }
    else
    {
      paramInt = mMin;
      if (paramInt > 0) {
        paramConstraintWidget.setMinHeight(paramInt);
      }
      paramInt = mMax;
      if (paramInt < Integer.MAX_VALUE) {
        paramConstraintWidget.setMaxHeight(paramInt);
      }
      paramState = mInitialValue;
      if (paramState == WRAP_DIMENSION)
      {
        paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
      }
      else if (paramState == PARENT_DIMENSION)
      {
        paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
      }
      else if (paramState == null)
      {
        paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        paramConstraintWidget.setHeight(mValue);
      }
    }
  }
  
  public boolean equalsFixedValue(int paramInt)
  {
    return (mInitialValue == null) && (mValue == paramInt);
  }
  
  public Dimension fixed(int paramInt)
  {
    mInitialValue = null;
    mValue = paramInt;
    return this;
  }
  
  public Dimension fixed(Object paramObject)
  {
    mInitialValue = paramObject;
    if ((paramObject instanceof Integer))
    {
      mValue = ((Integer)paramObject).intValue();
      mInitialValue = null;
    }
    return this;
  }
  
  public int getValue()
  {
    return mValue;
  }
  
  public Dimension max(int paramInt)
  {
    if (mMax >= 0) {
      mMax = paramInt;
    }
    return this;
  }
  
  public Dimension max(Object paramObject)
  {
    Object localObject = WRAP_DIMENSION;
    if ((paramObject == localObject) && (mIsSuggested))
    {
      mInitialValue = localObject;
      mMax = Integer.MAX_VALUE;
    }
    return this;
  }
  
  public Dimension min(int paramInt)
  {
    if (paramInt >= 0) {
      mMin = paramInt;
    }
    return this;
  }
  
  public Dimension min(Object paramObject)
  {
    if (paramObject == WRAP_DIMENSION) {
      mMin = -2;
    }
    return this;
  }
  
  public Dimension percent(Object paramObject, float paramFloat)
  {
    mPercent = paramFloat;
    return this;
  }
  
  public Dimension ratio(String paramString)
  {
    mRatioString = paramString;
    return this;
  }
  
  public void setValue(int paramInt)
  {
    mIsSuggested = false;
    mInitialValue = null;
    mValue = paramInt;
  }
  
  public Dimension suggested(int paramInt)
  {
    mIsSuggested = true;
    if (paramInt >= 0) {
      mMax = paramInt;
    }
    return this;
  }
  
  public Dimension suggested(Object paramObject)
  {
    mInitialValue = paramObject;
    mIsSuggested = true;
    return this;
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("FIXED", 0);
      FIXED = localType1;
      Type localType2 = new Type("WRAP", 1);
      WRAP = localType2;
      Type localType3 = new Type("MATCH_PARENT", 2);
      MATCH_PARENT = localType3;
      Type localType4 = new Type("MATCH_CONSTRAINT", 3);
      MATCH_CONSTRAINT = localType4;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.Dimension
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */