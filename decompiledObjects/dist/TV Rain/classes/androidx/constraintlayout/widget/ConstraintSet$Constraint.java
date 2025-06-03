package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;
import java.util.HashMap;
import z2;

public class ConstraintSet$Constraint
{
  public final ConstraintSet.Layout layout = new ConstraintSet.Layout();
  public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap();
  public Delta mDelta;
  public String mTargetString;
  public int mViewId;
  public final ConstraintSet.Motion motion = new ConstraintSet.Motion();
  public final ConstraintSet.PropertySet propertySet = new ConstraintSet.PropertySet();
  public final ConstraintSet.Transform transform = new ConstraintSet.Transform();
  
  private void fillFrom(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams)
  {
    mViewId = paramInt;
    ConstraintSet.Layout localLayout = layout;
    leftToLeft = leftToLeft;
    leftToRight = leftToRight;
    rightToLeft = rightToLeft;
    rightToRight = rightToRight;
    topToTop = topToTop;
    topToBottom = topToBottom;
    bottomToTop = bottomToTop;
    bottomToBottom = bottomToBottom;
    baselineToBaseline = baselineToBaseline;
    baselineToTop = baselineToTop;
    baselineToBottom = baselineToBottom;
    startToEnd = startToEnd;
    startToStart = startToStart;
    endToStart = endToStart;
    endToEnd = endToEnd;
    horizontalBias = horizontalBias;
    verticalBias = verticalBias;
    dimensionRatio = dimensionRatio;
    circleConstraint = circleConstraint;
    circleRadius = circleRadius;
    circleAngle = circleAngle;
    editorAbsoluteX = editorAbsoluteX;
    editorAbsoluteY = editorAbsoluteY;
    orientation = orientation;
    guidePercent = guidePercent;
    guideBegin = guideBegin;
    guideEnd = guideEnd;
    mWidth = width;
    mHeight = height;
    leftMargin = leftMargin;
    rightMargin = rightMargin;
    topMargin = topMargin;
    bottomMargin = bottomMargin;
    baselineMargin = baselineMargin;
    verticalWeight = verticalWeight;
    horizontalWeight = horizontalWeight;
    verticalChainStyle = verticalChainStyle;
    horizontalChainStyle = horizontalChainStyle;
    constrainedWidth = constrainedWidth;
    constrainedHeight = constrainedHeight;
    widthDefault = matchConstraintDefaultWidth;
    heightDefault = matchConstraintDefaultHeight;
    widthMax = matchConstraintMaxWidth;
    heightMax = matchConstraintMaxHeight;
    widthMin = matchConstraintMinWidth;
    heightMin = matchConstraintMinHeight;
    widthPercent = matchConstraintPercentWidth;
    heightPercent = matchConstraintPercentHeight;
    mConstraintTag = constraintTag;
    goneTopMargin = goneTopMargin;
    goneBottomMargin = goneBottomMargin;
    goneLeftMargin = goneLeftMargin;
    goneRightMargin = goneRightMargin;
    goneStartMargin = goneStartMargin;
    goneEndMargin = goneEndMargin;
    goneBaselineMargin = goneBaselineMargin;
    mWrapBehavior = wrapBehaviorInParent;
    endMargin = paramLayoutParams.getMarginEnd();
    layout.startMargin = paramLayoutParams.getMarginStart();
  }
  
  private void fillFromConstraints(int paramInt, Constraints.LayoutParams paramLayoutParams)
  {
    fillFrom(paramInt, paramLayoutParams);
    propertySet.alpha = alpha;
    ConstraintSet.Transform localTransform = transform;
    rotation = rotation;
    rotationX = rotationX;
    rotationY = rotationY;
    scaleX = scaleX;
    scaleY = scaleY;
    transformPivotX = transformPivotX;
    transformPivotY = transformPivotY;
    translationX = translationX;
    translationY = translationY;
    translationZ = translationZ;
    elevation = elevation;
    applyElevation = applyElevation;
  }
  
  private void fillFromConstraints(ConstraintHelper paramConstraintHelper, int paramInt, Constraints.LayoutParams paramLayoutParams)
  {
    fillFromConstraints(paramInt, paramLayoutParams);
    if ((paramConstraintHelper instanceof Barrier))
    {
      paramLayoutParams = layout;
      mHelperType = 1;
      paramConstraintHelper = (Barrier)paramConstraintHelper;
      mBarrierDirection = paramConstraintHelper.getType();
      layout.mReferenceIds = paramConstraintHelper.getReferencedIds();
      layout.mBarrierMargin = paramConstraintHelper.getMargin();
    }
  }
  
  private ConstraintAttribute get(String paramString, ConstraintAttribute.AttributeType paramAttributeType)
  {
    if (mCustomConstraints.containsKey(paramString))
    {
      paramString = (ConstraintAttribute)mCustomConstraints.get(paramString);
      if (paramString.getType() != paramAttributeType)
      {
        paramAttributeType = z2.t("ConstraintAttribute is already a ");
        paramAttributeType.append(paramString.getType().name());
        throw new IllegalArgumentException(paramAttributeType.toString());
      }
    }
    else
    {
      paramAttributeType = new ConstraintAttribute(paramString, paramAttributeType);
      mCustomConstraints.put(paramString, paramAttributeType);
      paramString = paramAttributeType;
    }
    return paramString;
  }
  
  private void setColorValue(String paramString, int paramInt)
  {
    get(paramString, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(paramInt);
  }
  
  private void setFloatValue(String paramString, float paramFloat)
  {
    get(paramString, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(paramFloat);
  }
  
  private void setIntValue(String paramString, int paramInt)
  {
    get(paramString, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(paramInt);
  }
  
  private void setStringValue(String paramString1, String paramString2)
  {
    get(paramString1, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(paramString2);
  }
  
  public void applyDelta(Constraint paramConstraint)
  {
    Delta localDelta = mDelta;
    if (localDelta != null) {
      localDelta.applyDelta(paramConstraint);
    }
  }
  
  public void applyTo(ConstraintLayout.LayoutParams paramLayoutParams)
  {
    ConstraintSet.Layout localLayout = layout;
    leftToLeft = leftToLeft;
    leftToRight = leftToRight;
    rightToLeft = rightToLeft;
    rightToRight = rightToRight;
    topToTop = topToTop;
    topToBottom = topToBottom;
    bottomToTop = bottomToTop;
    bottomToBottom = bottomToBottom;
    baselineToBaseline = baselineToBaseline;
    baselineToTop = baselineToTop;
    baselineToBottom = baselineToBottom;
    startToEnd = startToEnd;
    startToStart = startToStart;
    endToStart = endToStart;
    endToEnd = endToEnd;
    leftMargin = leftMargin;
    rightMargin = rightMargin;
    topMargin = topMargin;
    bottomMargin = bottomMargin;
    goneStartMargin = goneStartMargin;
    goneEndMargin = goneEndMargin;
    goneTopMargin = goneTopMargin;
    goneBottomMargin = goneBottomMargin;
    horizontalBias = horizontalBias;
    verticalBias = verticalBias;
    circleConstraint = circleConstraint;
    circleRadius = circleRadius;
    circleAngle = circleAngle;
    dimensionRatio = dimensionRatio;
    editorAbsoluteX = editorAbsoluteX;
    editorAbsoluteY = editorAbsoluteY;
    verticalWeight = verticalWeight;
    horizontalWeight = horizontalWeight;
    verticalChainStyle = verticalChainStyle;
    horizontalChainStyle = horizontalChainStyle;
    constrainedWidth = constrainedWidth;
    constrainedHeight = constrainedHeight;
    matchConstraintDefaultWidth = widthDefault;
    matchConstraintDefaultHeight = heightDefault;
    matchConstraintMaxWidth = widthMax;
    matchConstraintMaxHeight = heightMax;
    matchConstraintMinWidth = widthMin;
    matchConstraintMinHeight = heightMin;
    matchConstraintPercentWidth = widthPercent;
    matchConstraintPercentHeight = heightPercent;
    orientation = orientation;
    guidePercent = guidePercent;
    guideBegin = guideBegin;
    guideEnd = guideEnd;
    width = mWidth;
    height = mHeight;
    String str = mConstraintTag;
    if (str != null) {
      constraintTag = str;
    }
    wrapBehaviorInParent = mWrapBehavior;
    paramLayoutParams.setMarginStart(startMargin);
    paramLayoutParams.setMarginEnd(layout.endMargin);
    paramLayoutParams.validate();
  }
  
  public Constraint clone()
  {
    Constraint localConstraint = new Constraint();
    layout.copyFrom(layout);
    motion.copyFrom(motion);
    propertySet.copyFrom(propertySet);
    transform.copyFrom(transform);
    mViewId = mViewId;
    mDelta = mDelta;
    return localConstraint;
  }
  
  public void printDelta(String paramString)
  {
    Delta localDelta = mDelta;
    if (localDelta != null) {
      localDelta.printDelta(paramString);
    } else {
      Log.v(paramString, "DELTA IS NULL");
    }
  }
  
  public static class Delta
  {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    public int mCountBoolean = 0;
    public int mCountFloat = 0;
    public int mCountInt = 0;
    public int mCountString = 0;
    public int[] mTypeBoolean = new int[4];
    public int[] mTypeFloat = new int[10];
    public int[] mTypeInt = new int[10];
    public int[] mTypeString = new int[5];
    public boolean[] mValueBoolean = new boolean[4];
    public float[] mValueFloat = new float[10];
    public int[] mValueInt = new int[10];
    public String[] mValueString = new String[5];
    
    public void add(int paramInt, float paramFloat)
    {
      int i = mCountFloat;
      Object localObject = mTypeFloat;
      if (i >= localObject.length)
      {
        mTypeFloat = Arrays.copyOf((int[])localObject, localObject.length * 2);
        localObject = mValueFloat;
        mValueFloat = Arrays.copyOf((float[])localObject, localObject.length * 2);
      }
      localObject = mTypeFloat;
      i = mCountFloat;
      localObject[i] = paramInt;
      localObject = mValueFloat;
      mCountFloat = (i + 1);
      localObject[i] = paramFloat;
    }
    
    public void add(int paramInt1, int paramInt2)
    {
      int i = mCountInt;
      int[] arrayOfInt = mTypeInt;
      if (i >= arrayOfInt.length)
      {
        mTypeInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
        arrayOfInt = mValueInt;
        mValueInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      }
      arrayOfInt = mTypeInt;
      i = mCountInt;
      arrayOfInt[i] = paramInt1;
      arrayOfInt = mValueInt;
      mCountInt = (i + 1);
      arrayOfInt[i] = paramInt2;
    }
    
    public void add(int paramInt, String paramString)
    {
      int i = mCountString;
      Object localObject = mTypeString;
      if (i >= localObject.length)
      {
        mTypeString = Arrays.copyOf((int[])localObject, localObject.length * 2);
        localObject = mValueString;
        mValueString = ((String[])Arrays.copyOf((Object[])localObject, localObject.length * 2));
      }
      localObject = mTypeString;
      i = mCountString;
      localObject[i] = paramInt;
      localObject = mValueString;
      mCountString = (i + 1);
      localObject[i] = paramString;
    }
    
    public void add(int paramInt, boolean paramBoolean)
    {
      int i = mCountBoolean;
      Object localObject = mTypeBoolean;
      if (i >= localObject.length)
      {
        mTypeBoolean = Arrays.copyOf((int[])localObject, localObject.length * 2);
        localObject = mValueBoolean;
        mValueBoolean = Arrays.copyOf((boolean[])localObject, localObject.length * 2);
      }
      localObject = mTypeBoolean;
      i = mCountBoolean;
      localObject[i] = paramInt;
      localObject = mValueBoolean;
      mCountBoolean = (i + 1);
      localObject[i] = paramBoolean;
    }
    
    public void applyDelta(ConstraintSet.Constraint paramConstraint)
    {
      int i = 0;
      for (int j = 0; j < mCountInt; j++) {
        ConstraintSet.access$300(paramConstraint, mTypeInt[j], mValueInt[j]);
      }
      for (j = 0; j < mCountFloat; j++) {
        ConstraintSet.access$400(paramConstraint, mTypeFloat[j], mValueFloat[j]);
      }
      for (int k = 0;; k++)
      {
        j = i;
        if (k >= mCountString) {
          break;
        }
        ConstraintSet.access$500(paramConstraint, mTypeString[k], mValueString[k]);
      }
      while (j < mCountBoolean)
      {
        ConstraintSet.access$600(paramConstraint, mTypeBoolean[j], mValueBoolean[j]);
        j++;
      }
    }
    
    @SuppressLint({"LogConditional"})
    public void printDelta(String paramString)
    {
      Log.v(paramString, "int");
      int i = 0;
      StringBuilder localStringBuilder;
      for (int j = 0; j < mCountInt; j++)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(mTypeInt[j]);
        localStringBuilder.append(" = ");
        localStringBuilder.append(mValueInt[j]);
        Log.v(paramString, localStringBuilder.toString());
      }
      Log.v(paramString, "float");
      for (j = 0; j < mCountFloat; j++)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(mTypeFloat[j]);
        localStringBuilder.append(" = ");
        localStringBuilder.append(mValueFloat[j]);
        Log.v(paramString, localStringBuilder.toString());
      }
      Log.v(paramString, "strings");
      for (j = 0; j < mCountString; j++)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(mTypeString[j]);
        localStringBuilder.append(" = ");
        localStringBuilder.append(mValueString[j]);
        Log.v(paramString, localStringBuilder.toString());
      }
      Log.v(paramString, "boolean");
      for (j = i; j < mCountBoolean; j++)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append(mTypeBoolean[j]);
        localStringBuilder.append(" = ");
        localStringBuilder.append(mValueBoolean[j]);
        Log.v(paramString, localStringBuilder.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Constraint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */