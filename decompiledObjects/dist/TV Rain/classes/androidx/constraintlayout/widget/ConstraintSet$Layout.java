package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionScene;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import z2;

public class ConstraintSet$Layout
{
  private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
  private static final int BARRIER_DIRECTION = 72;
  private static final int BARRIER_MARGIN = 73;
  private static final int BASELINE_MARGIN = 80;
  private static final int BASELINE_TO_BASELINE = 1;
  private static final int BASELINE_TO_BOTTOM = 78;
  private static final int BASELINE_TO_TOP = 77;
  private static final int BOTTOM_MARGIN = 2;
  private static final int BOTTOM_TO_BOTTOM = 3;
  private static final int BOTTOM_TO_TOP = 4;
  private static final int CHAIN_USE_RTL = 71;
  private static final int CIRCLE = 61;
  private static final int CIRCLE_ANGLE = 63;
  private static final int CIRCLE_RADIUS = 62;
  private static final int CONSTRAINED_HEIGHT = 88;
  private static final int CONSTRAINED_WIDTH = 87;
  private static final int CONSTRAINT_REFERENCED_IDS = 74;
  private static final int CONSTRAINT_TAG = 89;
  private static final int DIMENSION_RATIO = 5;
  private static final int EDITOR_ABSOLUTE_X = 6;
  private static final int EDITOR_ABSOLUTE_Y = 7;
  private static final int END_MARGIN = 8;
  private static final int END_TO_END = 9;
  private static final int END_TO_START = 10;
  private static final int GONE_BASELINE_MARGIN = 79;
  private static final int GONE_BOTTOM_MARGIN = 11;
  private static final int GONE_END_MARGIN = 12;
  private static final int GONE_LEFT_MARGIN = 13;
  private static final int GONE_RIGHT_MARGIN = 14;
  private static final int GONE_START_MARGIN = 15;
  private static final int GONE_TOP_MARGIN = 16;
  private static final int GUIDE_BEGIN = 17;
  private static final int GUIDE_END = 18;
  private static final int GUIDE_PERCENT = 19;
  private static final int GUIDE_USE_RTL = 90;
  private static final int HEIGHT_DEFAULT = 82;
  private static final int HEIGHT_MAX = 83;
  private static final int HEIGHT_MIN = 85;
  private static final int HEIGHT_PERCENT = 70;
  private static final int HORIZONTAL_BIAS = 20;
  private static final int HORIZONTAL_STYLE = 39;
  private static final int HORIZONTAL_WEIGHT = 37;
  private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
  private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
  private static final int LAYOUT_HEIGHT = 21;
  private static final int LAYOUT_WIDTH = 22;
  private static final int LAYOUT_WRAP_BEHAVIOR = 76;
  private static final int LEFT_MARGIN = 23;
  private static final int LEFT_TO_LEFT = 24;
  private static final int LEFT_TO_RIGHT = 25;
  private static final int ORIENTATION = 26;
  private static final int RIGHT_MARGIN = 27;
  private static final int RIGHT_TO_LEFT = 28;
  private static final int RIGHT_TO_RIGHT = 29;
  private static final int START_MARGIN = 30;
  private static final int START_TO_END = 31;
  private static final int START_TO_START = 32;
  private static final int TOP_MARGIN = 33;
  private static final int TOP_TO_BOTTOM = 34;
  private static final int TOP_TO_TOP = 35;
  public static final int UNSET = -1;
  public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
  private static final int UNUSED = 91;
  private static final int VERTICAL_BIAS = 36;
  private static final int VERTICAL_STYLE = 40;
  private static final int VERTICAL_WEIGHT = 38;
  private static final int WIDTH_DEFAULT = 81;
  private static final int WIDTH_MAX = 84;
  private static final int WIDTH_MIN = 86;
  private static final int WIDTH_PERCENT = 69;
  private static SparseIntArray mapToConstant;
  public int baselineMargin = 0;
  public int baselineToBaseline = -1;
  public int baselineToBottom = -1;
  public int baselineToTop = -1;
  public int bottomMargin = 0;
  public int bottomToBottom = -1;
  public int bottomToTop = -1;
  public float circleAngle = 0.0F;
  public int circleConstraint = -1;
  public int circleRadius = 0;
  public boolean constrainedHeight = false;
  public boolean constrainedWidth = false;
  public String dimensionRatio = null;
  public int editorAbsoluteX = -1;
  public int editorAbsoluteY = -1;
  public int endMargin = 0;
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
  public int heightDefault = 0;
  public int heightMax = 0;
  public int heightMin = 0;
  public float heightPercent = 1.0F;
  public float horizontalBias = 0.5F;
  public int horizontalChainStyle = 0;
  public float horizontalWeight = -1.0F;
  public int leftMargin = 0;
  public int leftToLeft = -1;
  public int leftToRight = -1;
  public boolean mApply = false;
  public boolean mBarrierAllowsGoneWidgets = true;
  public int mBarrierDirection = -1;
  public int mBarrierMargin = 0;
  public String mConstraintTag;
  public int mHeight;
  public int mHelperType = -1;
  public boolean mIsGuideline = false;
  public boolean mOverride = false;
  public String mReferenceIdString;
  public int[] mReferenceIds;
  public int mWidth;
  public int mWrapBehavior = 0;
  public int orientation = -1;
  public int rightMargin = 0;
  public int rightToLeft = -1;
  public int rightToRight = -1;
  public int startMargin = 0;
  public int startToEnd = -1;
  public int startToStart = -1;
  public int topMargin = 0;
  public int topToBottom = -1;
  public int topToTop = -1;
  public float verticalBias = 0.5F;
  public int verticalChainStyle = 0;
  public float verticalWeight = -1.0F;
  public int widthDefault = 0;
  public int widthMax = 0;
  public int widthMin = 0;
  public float widthPercent = 1.0F;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mapToConstant = localSparseIntArray;
    localSparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
    mapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
    mapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
    mapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
    mapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
    mapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
    mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
    mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
    mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
    mapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
    mapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
    mapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
    mapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
    mapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
    mapToConstant.append(R.styleable.Layout_guidelineUseRtl, 90);
    mapToConstant.append(R.styleable.Layout_android_orientation, 26);
    mapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
    mapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
    mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
    mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
    mapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
    mapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
    mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
    mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
    mapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
    mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
    mapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
    mapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
    mapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
    mapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 91);
    mapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 91);
    mapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
    mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
    mapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
    mapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
    mapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
    mapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
    mapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
    mapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
    mapToConstant.append(R.styleable.Layout_android_layout_width, 22);
    mapToConstant.append(R.styleable.Layout_android_layout_height, 21);
    mapToConstant.append(R.styleable.Layout_layout_constraintWidth, 41);
    mapToConstant.append(R.styleable.Layout_layout_constraintHeight, 42);
    mapToConstant.append(R.styleable.Layout_layout_constrainedWidth, 41);
    mapToConstant.append(R.styleable.Layout_layout_constrainedHeight, 42);
    mapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
    mapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
    mapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
    mapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
    mapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
    mapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
    mapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
    mapToConstant.append(R.styleable.Layout_barrierDirection, 72);
    mapToConstant.append(R.styleable.Layout_barrierMargin, 73);
    mapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
    mapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
  }
  
  public void copyFrom(Layout paramLayout)
  {
    mIsGuideline = mIsGuideline;
    mWidth = mWidth;
    mApply = mApply;
    mHeight = mHeight;
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
    leftMargin = leftMargin;
    rightMargin = rightMargin;
    topMargin = topMargin;
    bottomMargin = bottomMargin;
    endMargin = endMargin;
    startMargin = startMargin;
    baselineMargin = baselineMargin;
    goneLeftMargin = goneLeftMargin;
    goneTopMargin = goneTopMargin;
    goneRightMargin = goneRightMargin;
    goneBottomMargin = goneBottomMargin;
    goneEndMargin = goneEndMargin;
    goneStartMargin = goneStartMargin;
    goneBaselineMargin = goneBaselineMargin;
    verticalWeight = verticalWeight;
    horizontalWeight = horizontalWeight;
    horizontalChainStyle = horizontalChainStyle;
    verticalChainStyle = verticalChainStyle;
    widthDefault = widthDefault;
    heightDefault = heightDefault;
    widthMax = widthMax;
    heightMax = heightMax;
    widthMin = widthMin;
    heightMin = heightMin;
    widthPercent = widthPercent;
    heightPercent = heightPercent;
    mBarrierDirection = mBarrierDirection;
    mBarrierMargin = mBarrierMargin;
    mHelperType = mHelperType;
    mConstraintTag = mConstraintTag;
    int[] arrayOfInt = mReferenceIds;
    if ((arrayOfInt != null) && (mReferenceIdString == null)) {
      mReferenceIds = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
    } else {
      mReferenceIds = null;
    }
    mReferenceIdString = mReferenceIdString;
    constrainedWidth = constrainedWidth;
    constrainedHeight = constrainedHeight;
    mBarrierAllowsGoneWidgets = mBarrierAllowsGoneWidgets;
    mWrapBehavior = mWrapBehavior;
  }
  
  public void dump(MotionScene paramMotionScene, StringBuilder paramStringBuilder)
  {
    Field[] arrayOfField = getClass().getDeclaredFields();
    paramStringBuilder.append("\n");
    for (int i = 0; i < arrayOfField.length; i++)
    {
      Object localObject1 = arrayOfField[i];
      String str = ((Field)localObject1).getName();
      if (!Modifier.isStatic(((Field)localObject1).getModifiers())) {
        try
        {
          Object localObject2 = ((Field)localObject1).get(this);
          localObject1 = ((Field)localObject1).getType();
          Class localClass = Integer.TYPE;
          if (localObject1 == localClass)
          {
            localObject2 = (Integer)localObject2;
            if (((Integer)localObject2).intValue() != -1)
            {
              localObject1 = paramMotionScene.lookUpConstraintName(((Integer)localObject2).intValue());
              paramStringBuilder.append("    ");
              paramStringBuilder.append(str);
              paramStringBuilder.append(" = \"");
              if (localObject1 != null) {
                localObject2 = localObject1;
              }
              paramStringBuilder.append(localObject2);
              paramStringBuilder.append("\"\n");
            }
          }
          else if (localObject1 == Float.TYPE)
          {
            localObject2 = (Float)localObject2;
            if (((Float)localObject2).floatValue() != -1.0F)
            {
              paramStringBuilder.append("    ");
              paramStringBuilder.append(str);
              paramStringBuilder.append(" = \"");
              paramStringBuilder.append(localObject2);
              paramStringBuilder.append("\"\n");
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localIllegalAccessException.printStackTrace();
        }
      }
    }
  }
  
  public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Layout);
    mApply = true;
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      int m = mapToConstant.get(k);
      switch (m)
      {
      default: 
        switch (m)
        {
        default: 
          switch (m)
          {
          default: 
            paramAttributeSet = z2.t("Unknown attribute 0x");
            paramAttributeSet.append(Integer.toHexString(k));
            paramAttributeSet.append("   ");
            paramAttributeSet.append(mapToConstant.get(k));
            Log.w("ConstraintSet", paramAttributeSet.toString());
          }
          break;
        }
        break;
      case 42: 
        ConstraintSet.parseDimensionConstraints(this, paramContext, k, 1);
        break;
      case 41: 
        ConstraintSet.parseDimensionConstraints(this, paramContext, k, 0);
        break;
      case 40: 
        verticalChainStyle = paramContext.getInt(k, verticalChainStyle);
        break;
      case 39: 
        horizontalChainStyle = paramContext.getInt(k, horizontalChainStyle);
        break;
      case 38: 
        verticalWeight = paramContext.getFloat(k, verticalWeight);
        break;
      case 37: 
        horizontalWeight = paramContext.getFloat(k, horizontalWeight);
        break;
      case 36: 
        verticalBias = paramContext.getFloat(k, verticalBias);
        break;
      case 35: 
        topToTop = ConstraintSet.access$100(paramContext, k, topToTop);
        break;
      case 34: 
        topToBottom = ConstraintSet.access$100(paramContext, k, topToBottom);
        break;
      case 33: 
        topMargin = paramContext.getDimensionPixelSize(k, topMargin);
        break;
      case 32: 
        startToStart = ConstraintSet.access$100(paramContext, k, startToStart);
        break;
      case 31: 
        startToEnd = ConstraintSet.access$100(paramContext, k, startToEnd);
        break;
      case 30: 
        startMargin = paramContext.getDimensionPixelSize(k, startMargin);
        break;
      case 29: 
        rightToRight = ConstraintSet.access$100(paramContext, k, rightToRight);
        break;
      case 28: 
        rightToLeft = ConstraintSet.access$100(paramContext, k, rightToLeft);
        break;
      case 27: 
        rightMargin = paramContext.getDimensionPixelSize(k, rightMargin);
        break;
      case 26: 
        orientation = paramContext.getInt(k, orientation);
        break;
      case 25: 
        leftToRight = ConstraintSet.access$100(paramContext, k, leftToRight);
        break;
      case 24: 
        leftToLeft = ConstraintSet.access$100(paramContext, k, leftToLeft);
        break;
      case 23: 
        leftMargin = paramContext.getDimensionPixelSize(k, leftMargin);
        break;
      case 22: 
        mWidth = paramContext.getLayoutDimension(k, mWidth);
        break;
      case 21: 
        mHeight = paramContext.getLayoutDimension(k, mHeight);
        break;
      case 20: 
        horizontalBias = paramContext.getFloat(k, horizontalBias);
        break;
      case 19: 
        guidePercent = paramContext.getFloat(k, guidePercent);
        break;
      case 18: 
        guideEnd = paramContext.getDimensionPixelOffset(k, guideEnd);
        break;
      case 17: 
        guideBegin = paramContext.getDimensionPixelOffset(k, guideBegin);
        break;
      case 16: 
        goneTopMargin = paramContext.getDimensionPixelSize(k, goneTopMargin);
        break;
      case 15: 
        goneStartMargin = paramContext.getDimensionPixelSize(k, goneStartMargin);
        break;
      case 14: 
        goneRightMargin = paramContext.getDimensionPixelSize(k, goneRightMargin);
        break;
      case 13: 
        goneLeftMargin = paramContext.getDimensionPixelSize(k, goneLeftMargin);
        break;
      case 12: 
        goneEndMargin = paramContext.getDimensionPixelSize(k, goneEndMargin);
        break;
      case 11: 
        goneBottomMargin = paramContext.getDimensionPixelSize(k, goneBottomMargin);
        break;
      case 10: 
        endToStart = ConstraintSet.access$100(paramContext, k, endToStart);
        break;
      case 9: 
        endToEnd = ConstraintSet.access$100(paramContext, k, endToEnd);
        break;
      case 8: 
        endMargin = paramContext.getDimensionPixelSize(k, endMargin);
        break;
      case 7: 
        editorAbsoluteY = paramContext.getDimensionPixelOffset(k, editorAbsoluteY);
        break;
      case 6: 
        editorAbsoluteX = paramContext.getDimensionPixelOffset(k, editorAbsoluteX);
        break;
      case 5: 
        dimensionRatio = paramContext.getString(k);
        break;
      case 4: 
        bottomToTop = ConstraintSet.access$100(paramContext, k, bottomToTop);
        break;
      case 3: 
        bottomToBottom = ConstraintSet.access$100(paramContext, k, bottomToBottom);
        break;
      case 2: 
        bottomMargin = paramContext.getDimensionPixelSize(k, bottomMargin);
        break;
      case 1: 
        baselineToBaseline = ConstraintSet.access$100(paramContext, k, baselineToBaseline);
        continue;
        circleAngle = paramContext.getFloat(k, circleAngle);
        continue;
        circleRadius = paramContext.getDimensionPixelSize(k, circleRadius);
        continue;
        circleConstraint = ConstraintSet.access$100(paramContext, k, circleConstraint);
        continue;
        paramAttributeSet = z2.t("unused attribute 0x");
        paramAttributeSet.append(Integer.toHexString(k));
        paramAttributeSet.append("   ");
        paramAttributeSet.append(mapToConstant.get(k));
        Log.w("ConstraintSet", paramAttributeSet.toString());
        continue;
        guidelineUseRtl = paramContext.getBoolean(k, guidelineUseRtl);
        continue;
        mConstraintTag = paramContext.getString(k);
        continue;
        constrainedHeight = paramContext.getBoolean(k, constrainedHeight);
        continue;
        constrainedWidth = paramContext.getBoolean(k, constrainedWidth);
        continue;
        widthMin = paramContext.getDimensionPixelSize(k, widthMin);
        continue;
        heightMin = paramContext.getDimensionPixelSize(k, heightMin);
        continue;
        widthMax = paramContext.getDimensionPixelSize(k, widthMax);
        continue;
        heightMax = paramContext.getDimensionPixelSize(k, heightMax);
        continue;
        heightDefault = paramContext.getInt(k, heightDefault);
        continue;
        widthDefault = paramContext.getInt(k, widthDefault);
        continue;
        baselineMargin = paramContext.getDimensionPixelSize(k, baselineMargin);
        continue;
        goneBaselineMargin = paramContext.getDimensionPixelSize(k, goneBaselineMargin);
        continue;
        baselineToBottom = ConstraintSet.access$100(paramContext, k, baselineToBottom);
        continue;
        baselineToTop = ConstraintSet.access$100(paramContext, k, baselineToTop);
        continue;
        mWrapBehavior = paramContext.getInt(k, mWrapBehavior);
        continue;
        mBarrierAllowsGoneWidgets = paramContext.getBoolean(k, mBarrierAllowsGoneWidgets);
        continue;
        mReferenceIdString = paramContext.getString(k);
        continue;
        mBarrierMargin = paramContext.getDimensionPixelSize(k, mBarrierMargin);
        continue;
        mBarrierDirection = paramContext.getInt(k, mBarrierDirection);
        continue;
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        continue;
        heightPercent = paramContext.getFloat(k, 1.0F);
        continue;
        widthPercent = paramContext.getFloat(k, 1.0F);
      }
    }
    paramContext.recycle();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Layout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */