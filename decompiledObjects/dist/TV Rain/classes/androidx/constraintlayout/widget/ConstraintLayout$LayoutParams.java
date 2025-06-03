package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

public class ConstraintLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public static final int BASELINE = 5;
  public static final int BOTTOM = 4;
  public static final int CHAIN_PACKED = 2;
  public static final int CHAIN_SPREAD = 0;
  public static final int CHAIN_SPREAD_INSIDE = 1;
  public static final int CIRCLE = 8;
  public static final int END = 7;
  public static final int GONE_UNSET = Integer.MIN_VALUE;
  public static final int HORIZONTAL = 0;
  public static final int LEFT = 1;
  public static final int MATCH_CONSTRAINT = 0;
  public static final int MATCH_CONSTRAINT_PERCENT = 2;
  public static final int MATCH_CONSTRAINT_SPREAD = 0;
  public static final int MATCH_CONSTRAINT_WRAP = 1;
  public static final int PARENT_ID = 0;
  public static final int RIGHT = 2;
  public static final int START = 6;
  public static final int TOP = 3;
  public static final int UNSET = -1;
  public static final int VERTICAL = 1;
  public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
  public static final int WRAP_BEHAVIOR_INCLUDED = 0;
  public static final int WRAP_BEHAVIOR_SKIPPED = 3;
  public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
  public int baselineMargin = 0;
  public int baselineToBaseline = -1;
  public int baselineToBottom = -1;
  public int baselineToTop = -1;
  public int bottomToBottom = -1;
  public int bottomToTop = -1;
  public float circleAngle = 0.0F;
  public int circleConstraint = -1;
  public int circleRadius = 0;
  public boolean constrainedHeight = false;
  public boolean constrainedWidth = false;
  public String constraintTag = null;
  public String dimensionRatio = null;
  public int dimensionRatioSide = 1;
  public float dimensionRatioValue = 0.0F;
  public int editorAbsoluteX = -1;
  public int editorAbsoluteY = -1;
  public int endToEnd = -1;
  public int endToStart = -1;
  public int goneBaselineMargin = Integer.MIN_VALUE;
  public int goneBottomMargin = Integer.MIN_VALUE;
  public int goneEndMargin = Integer.MIN_VALUE;
  public int goneLeftMargin = Integer.MIN_VALUE;
  public int goneRightMargin = Integer.MIN_VALUE;
  public int goneStartMargin = Integer.MIN_VALUE;
  public int goneTopMargin = Integer.MIN_VALUE;
  public int guideBegin = -1;
  public int guideEnd = -1;
  public float guidePercent = -1.0F;
  public boolean guidelineUseRtl = true;
  public boolean heightSet = true;
  public boolean helped = false;
  public float horizontalBias = 0.5F;
  public int horizontalChainStyle = 0;
  public boolean horizontalDimensionFixed = true;
  public float horizontalWeight = -1.0F;
  public boolean isGuideline = false;
  public boolean isHelper = false;
  public boolean isInPlaceholder = false;
  public boolean isVirtualGroup = false;
  public int leftToLeft = -1;
  public int leftToRight = -1;
  public int matchConstraintDefaultHeight = 0;
  public int matchConstraintDefaultWidth = 0;
  public int matchConstraintMaxHeight = 0;
  public int matchConstraintMaxWidth = 0;
  public int matchConstraintMinHeight = 0;
  public int matchConstraintMinWidth = 0;
  public float matchConstraintPercentHeight = 1.0F;
  public float matchConstraintPercentWidth = 1.0F;
  public boolean needsBaseline = false;
  public int orientation = -1;
  public int resolveGoneLeftMargin = Integer.MIN_VALUE;
  public int resolveGoneRightMargin = Integer.MIN_VALUE;
  public int resolvedGuideBegin;
  public int resolvedGuideEnd;
  public float resolvedGuidePercent;
  public float resolvedHorizontalBias = 0.5F;
  public int resolvedLeftToLeft = -1;
  public int resolvedLeftToRight = -1;
  public int resolvedRightToLeft = -1;
  public int resolvedRightToRight = -1;
  public int rightToLeft = -1;
  public int rightToRight = -1;
  public int startToEnd = -1;
  public int startToStart = -1;
  public int topToBottom = -1;
  public int topToTop = -1;
  public float verticalBias = 0.5F;
  public int verticalChainStyle = 0;
  public boolean verticalDimensionFixed = true;
  public float verticalWeight = -1.0F;
  public ConstraintWidget widget = new ConstraintWidget();
  public boolean widthSet = true;
  public int wrapBehaviorInParent = 0;
  
  public ConstraintLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public ConstraintLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout);
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      int m = Table.map.get(k);
      switch (m)
      {
      default: 
        switch (m)
        {
        default: 
          switch (m)
          {
          default: 
            break;
          case 67: 
            guidelineUseRtl = paramContext.getBoolean(k, guidelineUseRtl);
            break;
          case 66: 
            wrapBehaviorInParent = paramContext.getInt(k, wrapBehaviorInParent);
            break;
          case 65: 
            ConstraintSet.parseDimensionConstraints(this, paramContext, k, 1);
            heightSet = true;
            break;
          case 64: 
            ConstraintSet.parseDimensionConstraints(this, paramContext, k, 0);
            widthSet = true;
          }
          break;
        case 55: 
          goneBaselineMargin = paramContext.getDimensionPixelSize(k, goneBaselineMargin);
          break;
        case 54: 
          baselineMargin = paramContext.getDimensionPixelSize(k, baselineMargin);
          break;
        case 53: 
          m = paramContext.getResourceId(k, baselineToBottom);
          baselineToBottom = m;
          if (m == -1) {
            baselineToBottom = paramContext.getInt(k, -1);
          }
          break;
        case 52: 
          m = paramContext.getResourceId(k, baselineToTop);
          baselineToTop = m;
          if (m == -1) {
            baselineToTop = paramContext.getInt(k, -1);
          }
          break;
        case 51: 
          constraintTag = paramContext.getString(k);
          break;
        case 50: 
          editorAbsoluteY = paramContext.getDimensionPixelOffset(k, editorAbsoluteY);
          break;
        case 49: 
          editorAbsoluteX = paramContext.getDimensionPixelOffset(k, editorAbsoluteX);
          break;
        case 48: 
          verticalChainStyle = paramContext.getInt(k, 0);
          break;
        case 47: 
          horizontalChainStyle = paramContext.getInt(k, 0);
          break;
        case 46: 
          verticalWeight = paramContext.getFloat(k, verticalWeight);
          break;
        case 45: 
          horizontalWeight = paramContext.getFloat(k, horizontalWeight);
          break;
        case 44: 
          ConstraintSet.parseDimensionRatioString(this, paramContext.getString(k));
        }
        break;
      case 38: 
        matchConstraintPercentHeight = Math.max(0.0F, paramContext.getFloat(k, matchConstraintPercentHeight));
        matchConstraintDefaultHeight = 2;
        break;
      case 37: 
        try
        {
          matchConstraintMaxHeight = paramContext.getDimensionPixelSize(k, matchConstraintMaxHeight);
        }
        catch (Exception paramAttributeSet)
        {
          if (paramContext.getInt(k, matchConstraintMaxHeight) != -2) {
            continue;
          }
        }
        matchConstraintMaxHeight = -2;
        break;
      case 36: 
        try
        {
          matchConstraintMinHeight = paramContext.getDimensionPixelSize(k, matchConstraintMinHeight);
        }
        catch (Exception paramAttributeSet)
        {
          if (paramContext.getInt(k, matchConstraintMinHeight) != -2) {
            continue;
          }
        }
        matchConstraintMinHeight = -2;
        break;
      case 35: 
        matchConstraintPercentWidth = Math.max(0.0F, paramContext.getFloat(k, matchConstraintPercentWidth));
        matchConstraintDefaultWidth = 2;
        break;
      case 34: 
        try
        {
          matchConstraintMaxWidth = paramContext.getDimensionPixelSize(k, matchConstraintMaxWidth);
        }
        catch (Exception paramAttributeSet)
        {
          if (paramContext.getInt(k, matchConstraintMaxWidth) != -2) {
            continue;
          }
        }
        matchConstraintMaxWidth = -2;
        break;
      case 33: 
        try
        {
          matchConstraintMinWidth = paramContext.getDimensionPixelSize(k, matchConstraintMinWidth);
        }
        catch (Exception paramAttributeSet)
        {
          if (paramContext.getInt(k, matchConstraintMinWidth) != -2) {
            continue;
          }
        }
        matchConstraintMinWidth = -2;
        break;
      case 32: 
        k = paramContext.getInt(k, 0);
        matchConstraintDefaultHeight = k;
        if (k == 1) {
          Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
        }
        break;
      case 31: 
        k = paramContext.getInt(k, 0);
        matchConstraintDefaultWidth = k;
        if (k == 1) {
          Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
        }
        break;
      case 30: 
        verticalBias = paramContext.getFloat(k, verticalBias);
        break;
      case 29: 
        horizontalBias = paramContext.getFloat(k, horizontalBias);
        break;
      case 28: 
        constrainedHeight = paramContext.getBoolean(k, constrainedHeight);
        break;
      case 27: 
        constrainedWidth = paramContext.getBoolean(k, constrainedWidth);
        break;
      case 26: 
        goneEndMargin = paramContext.getDimensionPixelSize(k, goneEndMargin);
        break;
      case 25: 
        goneStartMargin = paramContext.getDimensionPixelSize(k, goneStartMargin);
        break;
      case 24: 
        goneBottomMargin = paramContext.getDimensionPixelSize(k, goneBottomMargin);
        break;
      case 23: 
        goneRightMargin = paramContext.getDimensionPixelSize(k, goneRightMargin);
        break;
      case 22: 
        goneTopMargin = paramContext.getDimensionPixelSize(k, goneTopMargin);
        break;
      case 21: 
        goneLeftMargin = paramContext.getDimensionPixelSize(k, goneLeftMargin);
        break;
      case 20: 
        m = paramContext.getResourceId(k, endToEnd);
        endToEnd = m;
        if (m == -1) {
          endToEnd = paramContext.getInt(k, -1);
        }
        break;
      case 19: 
        m = paramContext.getResourceId(k, endToStart);
        endToStart = m;
        if (m == -1) {
          endToStart = paramContext.getInt(k, -1);
        }
        break;
      case 18: 
        m = paramContext.getResourceId(k, startToStart);
        startToStart = m;
        if (m == -1) {
          startToStart = paramContext.getInt(k, -1);
        }
        break;
      case 17: 
        m = paramContext.getResourceId(k, startToEnd);
        startToEnd = m;
        if (m == -1) {
          startToEnd = paramContext.getInt(k, -1);
        }
        break;
      case 16: 
        m = paramContext.getResourceId(k, baselineToBaseline);
        baselineToBaseline = m;
        if (m == -1) {
          baselineToBaseline = paramContext.getInt(k, -1);
        }
        break;
      case 15: 
        m = paramContext.getResourceId(k, bottomToBottom);
        bottomToBottom = m;
        if (m == -1) {
          bottomToBottom = paramContext.getInt(k, -1);
        }
        break;
      case 14: 
        m = paramContext.getResourceId(k, bottomToTop);
        bottomToTop = m;
        if (m == -1) {
          bottomToTop = paramContext.getInt(k, -1);
        }
        break;
      case 13: 
        m = paramContext.getResourceId(k, topToBottom);
        topToBottom = m;
        if (m == -1) {
          topToBottom = paramContext.getInt(k, -1);
        }
        break;
      case 12: 
        m = paramContext.getResourceId(k, topToTop);
        topToTop = m;
        if (m == -1) {
          topToTop = paramContext.getInt(k, -1);
        }
        break;
      case 11: 
        m = paramContext.getResourceId(k, rightToRight);
        rightToRight = m;
        if (m == -1) {
          rightToRight = paramContext.getInt(k, -1);
        }
        break;
      case 10: 
        m = paramContext.getResourceId(k, rightToLeft);
        rightToLeft = m;
        if (m == -1) {
          rightToLeft = paramContext.getInt(k, -1);
        }
        break;
      case 9: 
        m = paramContext.getResourceId(k, leftToRight);
        leftToRight = m;
        if (m == -1) {
          leftToRight = paramContext.getInt(k, -1);
        }
        break;
      case 8: 
        m = paramContext.getResourceId(k, leftToLeft);
        leftToLeft = m;
        if (m == -1) {
          leftToLeft = paramContext.getInt(k, -1);
        }
        break;
      case 7: 
        guidePercent = paramContext.getFloat(k, guidePercent);
        break;
      case 6: 
        guideEnd = paramContext.getDimensionPixelOffset(k, guideEnd);
        break;
      case 5: 
        guideBegin = paramContext.getDimensionPixelOffset(k, guideBegin);
        break;
      case 4: 
        float f = paramContext.getFloat(k, circleAngle) % 360.0F;
        circleAngle = f;
        if (f < 0.0F) {
          circleAngle = ((360.0F - f) % 360.0F);
        }
        break;
      case 3: 
        circleRadius = paramContext.getDimensionPixelSize(k, circleRadius);
        break;
      case 2: 
        m = paramContext.getResourceId(k, circleConstraint);
        circleConstraint = m;
        if (m == -1) {
          circleConstraint = paramContext.getInt(k, -1);
        }
        break;
      case 1: 
        orientation = paramContext.getInt(k, orientation);
      }
    }
    paramContext.recycle();
    validate();
  }
  
  public ConstraintLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public ConstraintLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    guideBegin = guideBegin;
    guideEnd = guideEnd;
    guidePercent = guidePercent;
    guidelineUseRtl = guidelineUseRtl;
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
    circleConstraint = circleConstraint;
    circleRadius = circleRadius;
    circleAngle = circleAngle;
    startToEnd = startToEnd;
    startToStart = startToStart;
    endToStart = endToStart;
    endToEnd = endToEnd;
    goneLeftMargin = goneLeftMargin;
    goneTopMargin = goneTopMargin;
    goneRightMargin = goneRightMargin;
    goneBottomMargin = goneBottomMargin;
    goneStartMargin = goneStartMargin;
    goneEndMargin = goneEndMargin;
    goneBaselineMargin = goneBaselineMargin;
    baselineMargin = baselineMargin;
    horizontalBias = horizontalBias;
    verticalBias = verticalBias;
    dimensionRatio = dimensionRatio;
    dimensionRatioValue = dimensionRatioValue;
    dimensionRatioSide = dimensionRatioSide;
    horizontalWeight = horizontalWeight;
    verticalWeight = verticalWeight;
    horizontalChainStyle = horizontalChainStyle;
    verticalChainStyle = verticalChainStyle;
    constrainedWidth = constrainedWidth;
    constrainedHeight = constrainedHeight;
    matchConstraintDefaultWidth = matchConstraintDefaultWidth;
    matchConstraintDefaultHeight = matchConstraintDefaultHeight;
    matchConstraintMinWidth = matchConstraintMinWidth;
    matchConstraintMaxWidth = matchConstraintMaxWidth;
    matchConstraintMinHeight = matchConstraintMinHeight;
    matchConstraintMaxHeight = matchConstraintMaxHeight;
    matchConstraintPercentWidth = matchConstraintPercentWidth;
    matchConstraintPercentHeight = matchConstraintPercentHeight;
    editorAbsoluteX = editorAbsoluteX;
    editorAbsoluteY = editorAbsoluteY;
    orientation = orientation;
    horizontalDimensionFixed = horizontalDimensionFixed;
    verticalDimensionFixed = verticalDimensionFixed;
    needsBaseline = needsBaseline;
    isGuideline = isGuideline;
    resolvedLeftToLeft = resolvedLeftToLeft;
    resolvedLeftToRight = resolvedLeftToRight;
    resolvedRightToLeft = resolvedRightToLeft;
    resolvedRightToRight = resolvedRightToRight;
    resolveGoneLeftMargin = resolveGoneLeftMargin;
    resolveGoneRightMargin = resolveGoneRightMargin;
    resolvedHorizontalBias = resolvedHorizontalBias;
    constraintTag = constraintTag;
    wrapBehaviorInParent = wrapBehaviorInParent;
    widget = widget;
    widthSet = widthSet;
    heightSet = heightSet;
  }
  
  public String getConstraintTag()
  {
    return constraintTag;
  }
  
  public ConstraintWidget getConstraintWidget()
  {
    return widget;
  }
  
  public void reset()
  {
    ConstraintWidget localConstraintWidget = widget;
    if (localConstraintWidget != null) {
      localConstraintWidget.reset();
    }
  }
  
  @TargetApi(17)
  public void resolveLayoutDirection(int paramInt)
  {
    int i = leftMargin;
    int j = rightMargin;
    super.resolveLayoutDirection(paramInt);
    paramInt = getLayoutDirection();
    int k = 0;
    if (1 == paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    resolvedRightToLeft = -1;
    resolvedRightToRight = -1;
    resolvedLeftToLeft = -1;
    resolvedLeftToRight = -1;
    resolveGoneLeftMargin = goneLeftMargin;
    resolveGoneRightMargin = goneRightMargin;
    float f1 = horizontalBias;
    resolvedHorizontalBias = f1;
    int m = guideBegin;
    resolvedGuideBegin = m;
    int n = guideEnd;
    resolvedGuideEnd = n;
    float f2 = guidePercent;
    resolvedGuidePercent = f2;
    if (paramInt != 0)
    {
      paramInt = startToEnd;
      if (paramInt != -1) {
        resolvedRightToLeft = paramInt;
      }
      for (;;)
      {
        paramInt = 1;
        break;
        int i1 = startToStart;
        paramInt = k;
        if (i1 == -1) {
          break;
        }
        resolvedRightToRight = i1;
      }
      k = endToStart;
      if (k != -1)
      {
        resolvedLeftToRight = k;
        paramInt = 1;
      }
      k = endToEnd;
      if (k != -1)
      {
        resolvedLeftToLeft = k;
        paramInt = 1;
      }
      k = goneStartMargin;
      if (k != Integer.MIN_VALUE) {
        resolveGoneRightMargin = k;
      }
      k = goneEndMargin;
      if (k != Integer.MIN_VALUE) {
        resolveGoneLeftMargin = k;
      }
      if (paramInt != 0) {
        resolvedHorizontalBias = (1.0F - f1);
      }
      if ((isGuideline) && (orientation == 1) && (guidelineUseRtl)) {
        if (f2 != -1.0F)
        {
          resolvedGuidePercent = (1.0F - f2);
          resolvedGuideBegin = -1;
          resolvedGuideEnd = -1;
        }
        else if (m != -1)
        {
          resolvedGuideEnd = m;
          resolvedGuideBegin = -1;
          resolvedGuidePercent = -1.0F;
        }
        else if (n != -1)
        {
          resolvedGuideBegin = n;
          resolvedGuideEnd = -1;
          resolvedGuidePercent = -1.0F;
        }
      }
    }
    else
    {
      paramInt = startToEnd;
      if (paramInt != -1) {
        resolvedLeftToRight = paramInt;
      }
      paramInt = startToStart;
      if (paramInt != -1) {
        resolvedLeftToLeft = paramInt;
      }
      paramInt = endToStart;
      if (paramInt != -1) {
        resolvedRightToLeft = paramInt;
      }
      paramInt = endToEnd;
      if (paramInt != -1) {
        resolvedRightToRight = paramInt;
      }
      paramInt = goneStartMargin;
      if (paramInt != Integer.MIN_VALUE) {
        resolveGoneLeftMargin = paramInt;
      }
      paramInt = goneEndMargin;
      if (paramInt != Integer.MIN_VALUE) {
        resolveGoneRightMargin = paramInt;
      }
    }
    if ((endToStart == -1) && (endToEnd == -1) && (startToStart == -1) && (startToEnd == -1))
    {
      paramInt = rightToLeft;
      if (paramInt != -1)
      {
        resolvedRightToLeft = paramInt;
        if ((rightMargin <= 0) && (j > 0)) {
          rightMargin = j;
        }
      }
      else
      {
        paramInt = rightToRight;
        if (paramInt != -1)
        {
          resolvedRightToRight = paramInt;
          if ((rightMargin <= 0) && (j > 0)) {
            rightMargin = j;
          }
        }
      }
      paramInt = leftToLeft;
      if (paramInt != -1)
      {
        resolvedLeftToLeft = paramInt;
        if ((leftMargin <= 0) && (i > 0)) {
          leftMargin = i;
        }
      }
      else
      {
        paramInt = leftToRight;
        if (paramInt != -1)
        {
          resolvedLeftToRight = paramInt;
          if ((leftMargin <= 0) && (i > 0)) {
            leftMargin = i;
          }
        }
      }
    }
  }
  
  public void setWidgetDebugName(String paramString)
  {
    widget.setDebugName(paramString);
  }
  
  public void validate()
  {
    isGuideline = false;
    horizontalDimensionFixed = true;
    verticalDimensionFixed = true;
    int i = width;
    if ((i == -2) && (constrainedWidth))
    {
      horizontalDimensionFixed = false;
      if (matchConstraintDefaultWidth == 0) {
        matchConstraintDefaultWidth = 1;
      }
    }
    int j = height;
    if ((j == -2) && (constrainedHeight))
    {
      verticalDimensionFixed = false;
      if (matchConstraintDefaultHeight == 0) {
        matchConstraintDefaultHeight = 1;
      }
    }
    if ((i == 0) || (i == -1))
    {
      horizontalDimensionFixed = false;
      if ((i == 0) && (matchConstraintDefaultWidth == 1))
      {
        width = -2;
        constrainedWidth = true;
      }
    }
    if ((j == 0) || (j == -1))
    {
      verticalDimensionFixed = false;
      if ((j == 0) && (matchConstraintDefaultHeight == 1))
      {
        height = -2;
        constrainedHeight = true;
      }
    }
    if ((guidePercent != -1.0F) || (guideBegin != -1) || (guideEnd != -1))
    {
      isGuideline = true;
      horizontalDimensionFixed = true;
      verticalDimensionFixed = true;
      if (!(widget instanceof Guideline)) {
        widget = new Guideline();
      }
      ((Guideline)widget).setOrientation(orientation);
    }
  }
  
  public static class Table
  {
    public static final int ANDROID_ORIENTATION = 1;
    public static final int GUIDELINE_USE_RTL = 67;
    public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
    public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
    public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
    public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
    public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
    public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
    public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
    public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
    public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
    public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
    public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
    public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
    public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
    public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
    public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
    public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
    public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
    public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
    public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
    public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
    public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
    public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
    public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
    public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
    public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
    public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
    public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
    public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
    public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
    public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
    public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
    public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
    public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
    public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
    public static final int LAYOUT_CONSTRAINT_TAG = 51;
    public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
    public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
    public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
    public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
    public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
    public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
    public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
    public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
    public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
    public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
    public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
    public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
    public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
    public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
    public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
    public static final int LAYOUT_GONE_MARGIN_END = 26;
    public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
    public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
    public static final int LAYOUT_GONE_MARGIN_START = 25;
    public static final int LAYOUT_GONE_MARGIN_TOP = 22;
    public static final int LAYOUT_MARGIN_BASELINE = 54;
    public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
    public static final int UNUSED = 0;
    public static final SparseIntArray map;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      map = localSparseIntArray;
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
      localSparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */