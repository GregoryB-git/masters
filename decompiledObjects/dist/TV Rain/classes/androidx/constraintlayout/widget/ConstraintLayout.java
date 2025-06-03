package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout
  extends ViewGroup
{
  private static final boolean DEBUG = false;
  private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
  public static final int DESIGN_INFO_ID = 0;
  private static final boolean MEASURE = false;
  private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
  private static final String TAG = "ConstraintLayout";
  private static final boolean USE_CONSTRAINTS_HELPER = true;
  public static final String VERSION = "ConstraintLayout-2.1.4";
  private static SharedValues sSharedValues;
  public SparseArray<View> mChildrenByIds = new SparseArray();
  private ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList(4);
  public ConstraintLayoutStates mConstraintLayoutSpec = null;
  private ConstraintSet mConstraintSet = null;
  private int mConstraintSetId = -1;
  private ConstraintsChangedListener mConstraintsChangedListener;
  private HashMap<String, Integer> mDesignIds = new HashMap();
  public boolean mDirtyHierarchy = true;
  private int mLastMeasureHeight = -1;
  public int mLastMeasureHeightMode = 0;
  public int mLastMeasureHeightSize = -1;
  private int mLastMeasureWidth = -1;
  public int mLastMeasureWidthMode = 0;
  public int mLastMeasureWidthSize = -1;
  public ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
  private int mMaxHeight = Integer.MAX_VALUE;
  private int mMaxWidth = Integer.MAX_VALUE;
  public Measurer mMeasurer = new Measurer(this);
  private Metrics mMetrics;
  private int mMinHeight = 0;
  private int mMinWidth = 0;
  private int mOnMeasureHeightMeasureSpec = 0;
  private int mOnMeasureWidthMeasureSpec = 0;
  private int mOptimizationLevel = 257;
  private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray();
  
  public ConstraintLayout(@NonNull Context paramContext)
  {
    super(paramContext);
    init(null, 0, 0);
  }
  
  public ConstraintLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet, 0, 0);
  }
  
  public ConstraintLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet, paramInt, 0);
  }
  
  @TargetApi(21)
  public ConstraintLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramAttributeSet, paramInt1, paramInt2);
  }
  
  private int getPaddingWidth()
  {
    int i = Math.max(0, getPaddingLeft());
    i = Math.max(0, getPaddingRight()) + i;
    int j = Math.max(0, getPaddingStart());
    j = Math.max(0, getPaddingEnd()) + j;
    if (j > 0) {
      i = j;
    }
    return i;
  }
  
  public static SharedValues getSharedValues()
  {
    if (sSharedValues == null) {
      sSharedValues = new SharedValues();
    }
    return sSharedValues;
  }
  
  private final ConstraintWidget getTargetWidget(int paramInt)
  {
    if (paramInt == 0) {
      return mLayoutWidget;
    }
    View localView = (View)mChildrenByIds.get(paramInt);
    Object localObject = localView;
    if (localView == null)
    {
      localView = findViewById(paramInt);
      localObject = localView;
      if (localView != null)
      {
        localObject = localView;
        if (localView != this)
        {
          localObject = localView;
          if (localView.getParent() == this)
          {
            onViewAdded(localView);
            localObject = localView;
          }
        }
      }
    }
    if (localObject == this) {
      return mLayoutWidget;
    }
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = getLayoutParamswidget;
    }
    return (ConstraintWidget)localObject;
  }
  
  private void init(AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    mLayoutWidget.setCompanionWidget(this);
    mLayoutWidget.setMeasurer(mMeasurer);
    mChildrenByIds.put(getId(), this);
    mConstraintSet = null;
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ConstraintLayout_Layout, paramInt1, paramInt2);
      paramInt2 = paramAttributeSet.getIndexCount();
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        int i = paramAttributeSet.getIndex(paramInt1);
        if (i == R.styleable.ConstraintLayout_Layout_android_minWidth)
        {
          mMinWidth = paramAttributeSet.getDimensionPixelOffset(i, mMinWidth);
        }
        else if (i == R.styleable.ConstraintLayout_Layout_android_minHeight)
        {
          mMinHeight = paramAttributeSet.getDimensionPixelOffset(i, mMinHeight);
        }
        else if (i == R.styleable.ConstraintLayout_Layout_android_maxWidth)
        {
          mMaxWidth = paramAttributeSet.getDimensionPixelOffset(i, mMaxWidth);
        }
        else if (i == R.styleable.ConstraintLayout_Layout_android_maxHeight)
        {
          mMaxHeight = paramAttributeSet.getDimensionPixelOffset(i, mMaxHeight);
        }
        else if (i == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel)
        {
          mOptimizationLevel = paramAttributeSet.getInt(i, mOptimizationLevel);
        }
        else if (i == R.styleable.ConstraintLayout_Layout_layoutDescription)
        {
          i = paramAttributeSet.getResourceId(i, 0);
          if (i != 0) {
            try
            {
              parseLayoutDescription(i);
            }
            catch (Resources.NotFoundException localNotFoundException1)
            {
              mConstraintLayoutSpec = null;
            }
          }
        }
        else if (i == R.styleable.ConstraintLayout_Layout_constraintSet)
        {
          i = paramAttributeSet.getResourceId(i, 0);
          try
          {
            ConstraintSet localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
            localConstraintSet.<init>();
            mConstraintSet = localConstraintSet;
            localConstraintSet.load(getContext(), i);
          }
          catch (Resources.NotFoundException localNotFoundException2)
          {
            mConstraintSet = null;
          }
          mConstraintSetId = i;
        }
      }
      paramAttributeSet.recycle();
    }
    mLayoutWidget.setOptimizationLevel(mOptimizationLevel);
  }
  
  private void markHierarchyDirty()
  {
    mDirtyHierarchy = true;
    mLastMeasureWidth = -1;
    mLastMeasureHeight = -1;
    mLastMeasureWidthSize = -1;
    mLastMeasureHeightSize = -1;
    mLastMeasureWidthMode = 0;
    mLastMeasureHeightMode = 0;
  }
  
  private void setChildrenConstraints()
  {
    boolean bool = isInEditMode();
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      localObject1 = getViewWidget(getChildAt(j));
      if (localObject1 != null) {
        ((ConstraintWidget)localObject1).reset();
      }
    }
    if (bool)
    {
      j = 0;
      while (j < i)
      {
        Object localObject2 = getChildAt(j);
        try
        {
          localObject3 = getResources().getResourceName(((View)localObject2).getId());
          setDesignInformation(0, localObject3, Integer.valueOf(((View)localObject2).getId()));
          k = ((String)localObject3).indexOf('/');
          localObject1 = localObject3;
          if (k != -1) {
            localObject1 = ((String)localObject3).substring(k + 1);
          }
          getTargetWidget(((View)localObject2).getId()).setDebugName((String)localObject1);
          j++;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          Object localObject3;
          int k;
          for (;;) {}
        }
      }
    }
    if (mConstraintSetId != -1) {
      for (j = 0; j < i; j++)
      {
        localObject1 = getChildAt(j);
        if ((((View)localObject1).getId() == mConstraintSetId) && ((localObject1 instanceof Constraints))) {
          mConstraintSet = ((Constraints)localObject1).getConstraintSet();
        }
      }
    }
    Object localObject1 = mConstraintSet;
    if (localObject1 != null) {
      ((ConstraintSet)localObject1).applyToInternal(this, true);
    }
    mLayoutWidget.removeAllChildren();
    k = mConstraintHelpers.size();
    if (k > 0) {
      for (j = 0; j < k; j++) {
        ((ConstraintHelper)mConstraintHelpers.get(j)).updatePreLayout(this);
      }
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = getChildAt(j);
      if ((localObject1 instanceof Placeholder)) {
        ((Placeholder)localObject1).updatePreLayout(this);
      }
    }
    mTempMapIdToWidget.clear();
    mTempMapIdToWidget.put(0, mLayoutWidget);
    mTempMapIdToWidget.put(getId(), mLayoutWidget);
    for (j = 0; j < i; j++)
    {
      localObject3 = getChildAt(j);
      localObject1 = getViewWidget((View)localObject3);
      mTempMapIdToWidget.put(((View)localObject3).getId(), localObject1);
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = getChildAt(j);
      localObject2 = getViewWidget((View)localObject1);
      if (localObject2 != null)
      {
        localObject3 = (LayoutParams)((View)localObject1).getLayoutParams();
        mLayoutWidget.add((ConstraintWidget)localObject2);
        applyConstraintsFromLayoutParams(bool, (View)localObject1, (ConstraintWidget)localObject2, (LayoutParams)localObject3, mTempMapIdToWidget);
      }
    }
  }
  
  private void setWidgetBaseline(ConstraintWidget paramConstraintWidget, LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray, int paramInt, ConstraintAnchor.Type paramType)
  {
    Object localObject = (View)mChildrenByIds.get(paramInt);
    ConstraintWidget localConstraintWidget = (ConstraintWidget)paramSparseArray.get(paramInt);
    if ((localConstraintWidget != null) && (localObject != null) && ((((View)localObject).getLayoutParams() instanceof LayoutParams)))
    {
      needsBaseline = true;
      paramSparseArray = ConstraintAnchor.Type.BASELINE;
      if (paramType == paramSparseArray)
      {
        localObject = (LayoutParams)((View)localObject).getLayoutParams();
        needsBaseline = true;
        widget.setHasBaseline(true);
      }
      paramConstraintWidget.getAnchor(paramSparseArray).connect(localConstraintWidget.getAnchor(paramType), baselineMargin, goneBaselineMargin, true);
      paramConstraintWidget.setHasBaseline(true);
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.TOP).reset();
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
    }
  }
  
  private boolean updateHierarchy()
  {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      if (getChildAt(j).isLayoutRequested())
      {
        bool2 = true;
        break;
      }
    }
    if (bool2) {
      setChildrenConstraints();
    }
    return bool2;
  }
  
  public void applyConstraintsFromLayoutParams(boolean paramBoolean, View paramView, ConstraintWidget paramConstraintWidget, LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray)
  {
    paramLayoutParams.validate();
    helped = false;
    paramConstraintWidget.setVisibility(paramView.getVisibility());
    if (isInPlaceholder)
    {
      paramConstraintWidget.setInPlaceholder(true);
      paramConstraintWidget.setVisibility(8);
    }
    paramConstraintWidget.setCompanionWidget(paramView);
    if ((paramView instanceof ConstraintHelper)) {
      ((ConstraintHelper)paramView).resolveRtl(paramConstraintWidget, mLayoutWidget.isRtl());
    }
    int i;
    int j;
    float f;
    if (isGuideline)
    {
      paramView = (androidx.constraintlayout.core.widgets.Guideline)paramConstraintWidget;
      i = resolvedGuideBegin;
      j = resolvedGuideEnd;
      f = resolvedGuidePercent;
      if (f != -1.0F) {
        paramView.setGuidePercent(f);
      } else if (i != -1) {
        paramView.setGuideBegin(i);
      } else if (j != -1) {
        paramView.setGuideEnd(j);
      }
    }
    else
    {
      int k = resolvedLeftToLeft;
      j = resolvedLeftToRight;
      i = resolvedRightToLeft;
      int m = resolvedRightToRight;
      int n = resolveGoneLeftMargin;
      int i1 = resolveGoneRightMargin;
      f = resolvedHorizontalBias;
      int i2 = circleConstraint;
      if (i2 != -1)
      {
        paramView = (ConstraintWidget)paramSparseArray.get(i2);
        if (paramView != null) {
          paramConstraintWidget.connectCircularConstraint(paramView, circleAngle, circleRadius);
        }
      }
      else
      {
        ConstraintAnchor.Type localType;
        if (k != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(k);
          if (paramView != null)
          {
            localType = ConstraintAnchor.Type.LEFT;
            paramConstraintWidget.immediateConnect(localType, paramView, localType, leftMargin, n);
          }
        }
        else if (j != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(j);
          if (paramView != null) {
            paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.LEFT, paramView, ConstraintAnchor.Type.RIGHT, leftMargin, n);
          }
        }
        if (i != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(i);
          if (paramView != null) {
            paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.RIGHT, paramView, ConstraintAnchor.Type.LEFT, rightMargin, i1);
          }
        }
        else if (m != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(m);
          if (paramView != null)
          {
            localType = ConstraintAnchor.Type.RIGHT;
            paramConstraintWidget.immediateConnect(localType, paramView, localType, rightMargin, i1);
          }
        }
        j = topToTop;
        if (j != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(j);
          if (paramView != null)
          {
            localType = ConstraintAnchor.Type.TOP;
            paramConstraintWidget.immediateConnect(localType, paramView, localType, topMargin, goneTopMargin);
          }
        }
        else
        {
          j = topToBottom;
          if (j != -1)
          {
            paramView = (ConstraintWidget)paramSparseArray.get(j);
            if (paramView != null) {
              paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.TOP, paramView, ConstraintAnchor.Type.BOTTOM, topMargin, goneTopMargin);
            }
          }
        }
        j = bottomToTop;
        if (j != -1)
        {
          paramView = (ConstraintWidget)paramSparseArray.get(j);
          if (paramView != null) {
            paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.BOTTOM, paramView, ConstraintAnchor.Type.TOP, bottomMargin, goneBottomMargin);
          }
        }
        else
        {
          j = bottomToBottom;
          if (j != -1)
          {
            paramView = (ConstraintWidget)paramSparseArray.get(j);
            if (paramView != null)
            {
              localType = ConstraintAnchor.Type.BOTTOM;
              paramConstraintWidget.immediateConnect(localType, paramView, localType, bottomMargin, goneBottomMargin);
            }
          }
        }
        j = baselineToBaseline;
        if (j != -1)
        {
          setWidgetBaseline(paramConstraintWidget, paramLayoutParams, paramSparseArray, j, ConstraintAnchor.Type.BASELINE);
        }
        else
        {
          j = baselineToTop;
          if (j != -1)
          {
            setWidgetBaseline(paramConstraintWidget, paramLayoutParams, paramSparseArray, j, ConstraintAnchor.Type.TOP);
          }
          else
          {
            j = baselineToBottom;
            if (j != -1) {
              setWidgetBaseline(paramConstraintWidget, paramLayoutParams, paramSparseArray, j, ConstraintAnchor.Type.BOTTOM);
            }
          }
        }
        if (f >= 0.0F) {
          paramConstraintWidget.setHorizontalBiasPercent(f);
        }
        f = verticalBias;
        if (f >= 0.0F) {
          paramConstraintWidget.setVerticalBiasPercent(f);
        }
      }
      if (paramBoolean)
      {
        j = editorAbsoluteX;
        if ((j != -1) || (editorAbsoluteY != -1)) {
          paramConstraintWidget.setOrigin(j, editorAbsoluteY);
        }
      }
      if (!horizontalDimensionFixed)
      {
        if (width == -1)
        {
          if (constrainedWidth) {
            paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
          } else {
            paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
          }
          getAnchorLEFTmMargin = leftMargin;
          getAnchorRIGHTmMargin = rightMargin;
        }
        else
        {
          paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
          paramConstraintWidget.setWidth(0);
        }
      }
      else
      {
        paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        paramConstraintWidget.setWidth(width);
        if (width == -2) {
          paramConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
        }
      }
      if (!verticalDimensionFixed)
      {
        if (height == -1)
        {
          if (constrainedHeight) {
            paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
          } else {
            paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
          }
          getAnchorTOPmMargin = topMargin;
          getAnchorBOTTOMmMargin = bottomMargin;
        }
        else
        {
          paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
          paramConstraintWidget.setHeight(0);
        }
      }
      else
      {
        paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        paramConstraintWidget.setHeight(height);
        if (height == -2) {
          paramConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
        }
      }
      paramConstraintWidget.setDimensionRatio(dimensionRatio);
      paramConstraintWidget.setHorizontalWeight(horizontalWeight);
      paramConstraintWidget.setVerticalWeight(verticalWeight);
      paramConstraintWidget.setHorizontalChainStyle(horizontalChainStyle);
      paramConstraintWidget.setVerticalChainStyle(verticalChainStyle);
      paramConstraintWidget.setWrapBehaviorInParent(wrapBehaviorInParent);
      paramConstraintWidget.setHorizontalMatchStyle(matchConstraintDefaultWidth, matchConstraintMinWidth, matchConstraintMaxWidth, matchConstraintPercentWidth);
      paramConstraintWidget.setVerticalMatchStyle(matchConstraintDefaultHeight, matchConstraintMinHeight, matchConstraintMaxHeight, matchConstraintPercentHeight);
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject = mConstraintHelpers;
    int i;
    int j;
    if (localObject != null)
    {
      i = ((ArrayList)localObject).size();
      if (i > 0) {
        for (j = 0; j < i; j++) {
          ((ConstraintHelper)mConstraintHelpers.get(j)).updatePreDraw(this);
        }
      }
    }
    super.dispatchDraw(paramCanvas);
    if (isInEditMode())
    {
      float f1 = getWidth();
      float f2 = getHeight();
      i = getChildCount();
      for (j = 0; j < i; j++)
      {
        localObject = getChildAt(j);
        if (((View)localObject).getVisibility() != 8)
        {
          localObject = ((View)localObject).getTag();
          if ((localObject != null) && ((localObject instanceof String)))
          {
            localObject = ((String)localObject).split(",");
            if (localObject.length == 4)
            {
              int k = Integer.parseInt(localObject[0]);
              int m = Integer.parseInt(localObject[1]);
              int n = Integer.parseInt(localObject[2]);
              int i1 = Integer.parseInt(localObject[3]);
              k = (int)(k / 1080.0F * f1);
              m = (int)(m / 1920.0F * f2);
              n = (int)(n / 1080.0F * f1);
              i1 = (int)(i1 / 1920.0F * f2);
              localObject = new Paint();
              ((Paint)localObject).setColor(-65536);
              float f3 = k;
              float f4 = m;
              float f5 = k + n;
              paramCanvas.drawLine(f3, f4, f5, f4, (Paint)localObject);
              float f6 = m + i1;
              paramCanvas.drawLine(f5, f4, f5, f6, (Paint)localObject);
              paramCanvas.drawLine(f5, f6, f3, f6, (Paint)localObject);
              paramCanvas.drawLine(f3, f6, f3, f4, (Paint)localObject);
              ((Paint)localObject).setColor(-16711936);
              paramCanvas.drawLine(f3, f4, f5, f6, (Paint)localObject);
              paramCanvas.drawLine(f3, f6, f5, f4, (Paint)localObject);
            }
          }
        }
      }
    }
  }
  
  public void fillMetrics(Metrics paramMetrics)
  {
    mMetrics = paramMetrics;
    mLayoutWidget.fillMetrics(paramMetrics);
  }
  
  public void forceLayout()
  {
    markHierarchyDirty();
    super.forceLayout();
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public Object getDesignInformation(int paramInt, Object paramObject)
  {
    if ((paramInt == 0) && ((paramObject instanceof String)))
    {
      paramObject = (String)paramObject;
      HashMap localHashMap = mDesignIds;
      if ((localHashMap != null) && (localHashMap.containsKey(paramObject))) {
        return mDesignIds.get(paramObject);
      }
    }
    return null;
  }
  
  public int getMaxHeight()
  {
    return mMaxHeight;
  }
  
  public int getMaxWidth()
  {
    return mMaxWidth;
  }
  
  public int getMinHeight()
  {
    return mMinHeight;
  }
  
  public int getMinWidth()
  {
    return mMinWidth;
  }
  
  public int getOptimizationLevel()
  {
    return mLayoutWidget.getOptimizationLevel();
  }
  
  public String getSceneString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i;
    Object localObject1;
    if (mLayoutWidget.stringId == null)
    {
      i = getId();
      if (i != -1)
      {
        localObject1 = getContext().getResources().getResourceEntryName(i);
        mLayoutWidget.stringId = ((String)localObject1);
      }
      else
      {
        mLayoutWidget.stringId = "parent";
      }
    }
    if (mLayoutWidget.getDebugName() == null)
    {
      localObject1 = mLayoutWidget;
      ((ConstraintWidget)localObject1).setDebugName(stringId);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(" setDebugName ");
      ((StringBuilder)localObject1).append(mLayoutWidget.getDebugName());
      Log.v("ConstraintLayout", ((StringBuilder)localObject1).toString());
    }
    Iterator localIterator = mLayoutWidget.getChildren().iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (ConstraintWidget)localIterator.next();
      Object localObject2 = (View)((ConstraintWidget)localObject1).getCompanionWidget();
      if (localObject2 != null)
      {
        if (stringId == null)
        {
          i = ((View)localObject2).getId();
          if (i != -1) {
            stringId = getContext().getResources().getResourceEntryName(i);
          }
        }
        if (((ConstraintWidget)localObject1).getDebugName() == null)
        {
          ((ConstraintWidget)localObject1).setDebugName(stringId);
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(" setDebugName ");
          ((StringBuilder)localObject2).append(((ConstraintWidget)localObject1).getDebugName());
          Log.v("ConstraintLayout", ((StringBuilder)localObject2).toString());
        }
      }
    }
    mLayoutWidget.getSceneString(localStringBuilder);
    return localStringBuilder.toString();
  }
  
  public View getViewById(int paramInt)
  {
    return (View)mChildrenByIds.get(paramInt);
  }
  
  public final ConstraintWidget getViewWidget(View paramView)
  {
    if (paramView == this) {
      return mLayoutWidget;
    }
    if (paramView != null)
    {
      if ((paramView.getLayoutParams() instanceof LayoutParams)) {
        return getLayoutParamswidget;
      }
      paramView.setLayoutParams(generateLayoutParams(paramView.getLayoutParams()));
      if ((paramView.getLayoutParams() instanceof LayoutParams)) {
        return getLayoutParamswidget;
      }
    }
    return null;
  }
  
  public boolean isRtl()
  {
    int i = getContextgetApplicationInfoflags;
    boolean bool1 = false;
    if ((i & 0x400000) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if (1 == getLayoutDirection()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void loadLayoutDescription(int paramInt)
  {
    if (paramInt != 0) {
      try
      {
        ConstraintLayoutStates localConstraintLayoutStates = new androidx/constraintlayout/widget/ConstraintLayoutStates;
        localConstraintLayoutStates.<init>(getContext(), this, paramInt);
        mConstraintLayoutSpec = localConstraintLayoutStates;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        mConstraintLayoutSpec = null;
      }
    } else {
      mConstraintLayoutSpec = null;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = getChildCount();
    paramBoolean = isInEditMode();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      Object localObject = (LayoutParams)localView.getLayoutParams();
      ConstraintWidget localConstraintWidget = widget;
      if (((localView.getVisibility() != 8) || (isGuideline) || (isHelper) || (isVirtualGroup) || (paramBoolean)) && (!isInPlaceholder))
      {
        int i = localConstraintWidget.getX();
        int j = localConstraintWidget.getY();
        int k = localConstraintWidget.getWidth() + i;
        paramInt4 = localConstraintWidget.getHeight() + j;
        localView.layout(i, j, k, paramInt4);
        if ((localView instanceof Placeholder))
        {
          localObject = ((Placeholder)localView).getContent();
          if (localObject != null)
          {
            ((View)localObject).setVisibility(0);
            ((View)localObject).layout(i, j, k, paramInt4);
          }
        }
      }
    }
    paramInt3 = mConstraintHelpers.size();
    if (paramInt3 > 0) {
      for (paramInt1 = paramInt2; paramInt1 < paramInt3; paramInt1++) {
        ((ConstraintHelper)mConstraintHelpers.get(paramInt1)).updatePostLayout(this);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    if (mOnMeasureWidthMeasureSpec == paramInt1) {
      i = mOnMeasureHeightMeasureSpec;
    }
    if (!mDirtyHierarchy)
    {
      int j = getChildCount();
      for (i = 0; i < j; i++) {
        if (getChildAt(i).isLayoutRequested())
        {
          mDirtyHierarchy = true;
          break;
        }
      }
    }
    boolean bool = mDirtyHierarchy;
    mOnMeasureWidthMeasureSpec = paramInt1;
    mOnMeasureHeightMeasureSpec = paramInt2;
    mLayoutWidget.setRtl(isRtl());
    if (mDirtyHierarchy)
    {
      mDirtyHierarchy = false;
      if (updateHierarchy()) {
        mLayoutWidget.updateHierarchy();
      }
    }
    resolveSystem(mLayoutWidget, mOptimizationLevel, paramInt1, paramInt2);
    resolveMeasuredDimension(paramInt1, paramInt2, mLayoutWidget.getWidth(), mLayoutWidget.getHeight(), mLayoutWidget.isWidthMeasuredTooSmall(), mLayoutWidget.isHeightMeasuredTooSmall());
  }
  
  public void onViewAdded(View paramView)
  {
    super.onViewAdded(paramView);
    Object localObject = getViewWidget(paramView);
    if (((paramView instanceof Guideline)) && (!(localObject instanceof androidx.constraintlayout.core.widgets.Guideline)))
    {
      localObject = (LayoutParams)paramView.getLayoutParams();
      androidx.constraintlayout.core.widgets.Guideline localGuideline = new androidx.constraintlayout.core.widgets.Guideline();
      widget = localGuideline;
      isGuideline = true;
      localGuideline.setOrientation(orientation);
    }
    if ((paramView instanceof ConstraintHelper))
    {
      localObject = (ConstraintHelper)paramView;
      ((ConstraintHelper)localObject).validateParams();
      getLayoutParamsisHelper = true;
      if (!mConstraintHelpers.contains(localObject)) {
        mConstraintHelpers.add(localObject);
      }
    }
    mChildrenByIds.put(paramView.getId(), paramView);
    mDirtyHierarchy = true;
  }
  
  public void onViewRemoved(View paramView)
  {
    super.onViewRemoved(paramView);
    mChildrenByIds.remove(paramView.getId());
    ConstraintWidget localConstraintWidget = getViewWidget(paramView);
    mLayoutWidget.remove(localConstraintWidget);
    mConstraintHelpers.remove(paramView);
    mDirtyHierarchy = true;
  }
  
  public void parseLayoutDescription(int paramInt)
  {
    mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, paramInt);
  }
  
  public void requestLayout()
  {
    markHierarchyDirty();
    super.requestLayout();
  }
  
  public void resolveMeasuredDimension(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    Measurer localMeasurer = mMeasurer;
    int i = paddingHeight;
    paramInt1 = View.resolveSizeAndState(paramInt3 + paddingWidth, paramInt1, 0);
    paramInt3 = View.resolveSizeAndState(paramInt4 + i, paramInt2, 0);
    paramInt2 = Math.min(mMaxWidth, paramInt1 & 0xFFFFFF);
    paramInt3 = Math.min(mMaxHeight, paramInt3 & 0xFFFFFF);
    paramInt1 = paramInt2;
    if (paramBoolean1) {
      paramInt1 = paramInt2 | 0x1000000;
    }
    paramInt2 = paramInt3;
    if (paramBoolean2) {
      paramInt2 = paramInt3 | 0x1000000;
    }
    setMeasuredDimension(paramInt1, paramInt2);
    mLastMeasureWidth = paramInt1;
    mLastMeasureHeight = paramInt2;
  }
  
  public void resolveSystem(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    int n = Math.max(0, getPaddingTop());
    int i1 = Math.max(0, getPaddingBottom());
    int i2 = n + i1;
    int i3 = getPaddingWidth();
    mMeasurer.captureLayoutInfo(paramInt2, paramInt3, n, i1, i3, i2);
    paramInt2 = Math.max(0, getPaddingStart());
    paramInt3 = Math.max(0, getPaddingEnd());
    if ((paramInt2 <= 0) && (paramInt3 <= 0)) {
      paramInt2 = Math.max(0, getPaddingLeft());
    } else if (isRtl()) {
      paramInt2 = paramInt3;
    }
    paramInt3 = j - i3;
    m -= i2;
    setSelfDimensionBehaviour(paramConstraintWidgetContainer, i, paramInt3, k, m);
    paramConstraintWidgetContainer.measure(paramInt1, i, paramInt3, k, m, mLastMeasureWidth, mLastMeasureHeight, paramInt2, n);
  }
  
  public void setConstraintSet(ConstraintSet paramConstraintSet)
  {
    mConstraintSet = paramConstraintSet;
  }
  
  public void setDesignInformation(int paramInt, Object paramObject1, Object paramObject2)
  {
    if ((paramInt == 0) && ((paramObject1 instanceof String)) && ((paramObject2 instanceof Integer)))
    {
      if (mDesignIds == null) {
        mDesignIds = new HashMap();
      }
      String str = (String)paramObject1;
      paramInt = str.indexOf("/");
      paramObject1 = str;
      if (paramInt != -1) {
        paramObject1 = str.substring(paramInt + 1);
      }
      paramInt = ((Integer)paramObject2).intValue();
      mDesignIds.put(paramObject1, Integer.valueOf(paramInt));
    }
  }
  
  public void setId(int paramInt)
  {
    mChildrenByIds.remove(getId());
    super.setId(paramInt);
    mChildrenByIds.put(getId(), this);
  }
  
  public void setMaxHeight(int paramInt)
  {
    if (paramInt == mMaxHeight) {
      return;
    }
    mMaxHeight = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt)
  {
    if (paramInt == mMaxWidth) {
      return;
    }
    mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt)
  {
    if (paramInt == mMinHeight) {
      return;
    }
    mMinHeight = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt)
  {
    if (paramInt == mMinWidth) {
      return;
    }
    mMinWidth = paramInt;
    requestLayout();
  }
  
  public void setOnConstraintsChanged(ConstraintsChangedListener paramConstraintsChangedListener)
  {
    mConstraintsChangedListener = paramConstraintsChangedListener;
    ConstraintLayoutStates localConstraintLayoutStates = mConstraintLayoutSpec;
    if (localConstraintLayoutStates != null) {
      localConstraintLayoutStates.setOnConstraintsChanged(paramConstraintsChangedListener);
    }
  }
  
  public void setOptimizationLevel(int paramInt)
  {
    mOptimizationLevel = paramInt;
    mLayoutWidget.setOptimizationLevel(paramInt);
  }
  
  public void setSelfDimensionBehaviour(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = mMeasurer;
    int i = paddingHeight;
    int j = paddingWidth;
    Object localObject2 = ConstraintWidget.DimensionBehaviour.FIXED;
    int k = getChildCount();
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      if (paramInt1 != 0) {
        if (paramInt1 != 1073741824) {
          localObject1 = localObject2;
        }
      }
      do
      {
        paramInt2 = 0;
        break;
        paramInt2 = Math.min(mMaxWidth - j, paramInt2);
        localObject1 = localObject2;
        break;
        localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        localObject1 = localDimensionBehaviour;
      } while (k != 0);
      paramInt2 = Math.max(0, mMinWidth);
      localObject1 = localDimensionBehaviour;
    }
    else
    {
      localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      localObject1 = localDimensionBehaviour;
      if (k == 0)
      {
        paramInt2 = Math.max(0, mMinWidth);
        localObject1 = localDimensionBehaviour;
      }
    }
    if (paramInt3 != Integer.MIN_VALUE)
    {
      if (paramInt3 != 0) {
        if (paramInt3 == 1073741824) {}
      }
      do
      {
        paramInt4 = 0;
        break;
        paramInt4 = Math.min(mMaxHeight - i, paramInt4);
        break;
        localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        localObject2 = localDimensionBehaviour;
      } while (k != 0);
      paramInt4 = Math.max(0, mMinHeight);
      localObject2 = localDimensionBehaviour;
    }
    else
    {
      localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      localObject2 = localDimensionBehaviour;
      if (k == 0)
      {
        paramInt4 = Math.max(0, mMinHeight);
        localObject2 = localDimensionBehaviour;
      }
    }
    if ((paramInt2 != paramConstraintWidgetContainer.getWidth()) || (paramInt4 != paramConstraintWidgetContainer.getHeight())) {
      paramConstraintWidgetContainer.invalidateMeasures();
    }
    paramConstraintWidgetContainer.setX(0);
    paramConstraintWidgetContainer.setY(0);
    paramConstraintWidgetContainer.setMaxWidth(mMaxWidth - j);
    paramConstraintWidgetContainer.setMaxHeight(mMaxHeight - i);
    paramConstraintWidgetContainer.setMinWidth(0);
    paramConstraintWidgetContainer.setMinHeight(0);
    paramConstraintWidgetContainer.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
    paramConstraintWidgetContainer.setWidth(paramInt2);
    paramConstraintWidgetContainer.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject2);
    paramConstraintWidgetContainer.setHeight(paramInt4);
    paramConstraintWidgetContainer.setMinWidth(mMinWidth - j);
    paramConstraintWidgetContainer.setMinHeight(mMinHeight - i);
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3)
  {
    ConstraintLayoutStates localConstraintLayoutStates = mConstraintLayoutSpec;
    if (localConstraintLayoutStates != null) {
      localConstraintLayoutStates.updateConstraints(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class LayoutParams
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
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
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
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
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
        if (!(widget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
          widget = new androidx.constraintlayout.core.widgets.Guideline();
        }
        ((androidx.constraintlayout.core.widgets.Guideline)widget).setOrientation(orientation);
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
  
  public class Measurer
    implements BasicMeasure.Measurer
  {
    public ConstraintLayout layout;
    public int layoutHeightSpec;
    public int layoutWidthSpec;
    public int paddingBottom;
    public int paddingHeight;
    public int paddingTop;
    public int paddingWidth;
    
    public Measurer(ConstraintLayout paramConstraintLayout)
    {
      layout = paramConstraintLayout;
    }
    
    private boolean isSimilarSpec(int paramInt1, int paramInt2, int paramInt3)
    {
      if (paramInt1 == paramInt2) {
        return true;
      }
      int i = View.MeasureSpec.getMode(paramInt1);
      View.MeasureSpec.getSize(paramInt1);
      paramInt1 = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      return (paramInt1 == 1073741824) && ((i == Integer.MIN_VALUE) || (i == 0)) && (paramInt3 == paramInt2);
    }
    
    public void captureLayoutInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      paddingTop = paramInt3;
      paddingBottom = paramInt4;
      paddingWidth = paramInt5;
      paddingHeight = paramInt6;
      layoutWidthSpec = paramInt1;
      layoutHeightSpec = paramInt2;
    }
    
    public final void didMeasures()
    {
      int i = layout.getChildCount();
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        View localView = layout.getChildAt(k);
        if ((localView instanceof Placeholder)) {
          ((Placeholder)localView).updatePostMeasure(layout);
        }
      }
      i = ConstraintLayout.access$100(layout).size();
      if (i > 0) {
        for (k = j; k < i; k++) {
          ((ConstraintHelper)ConstraintLayout.access$100(layout).get(k)).updatePostMeasure(layout);
        }
      }
    }
    
    @SuppressLint({"WrongCall"})
    public final void measure(ConstraintWidget paramConstraintWidget, BasicMeasure.Measure paramMeasure)
    {
      if (paramConstraintWidget == null) {
        return;
      }
      if ((paramConstraintWidget.getVisibility() == 8) && (!paramConstraintWidget.isInPlaceholder()))
      {
        measuredWidth = 0;
        measuredHeight = 0;
        measuredBaseline = 0;
        return;
      }
      if (paramConstraintWidget.getParent() == null) {
        return;
      }
      Object localObject1 = horizontalBehavior;
      Object localObject2 = verticalBehavior;
      int i = horizontalDimension;
      int j = verticalDimension;
      int k = paddingTop + paddingBottom;
      int m = paddingWidth;
      View localView = (View)paramConstraintWidget.getCompanionWidget();
      Object localObject3 = ConstraintLayout.1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;
      int n = localObject3[localObject1.ordinal()];
      int i1;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4)
            {
              m = 0;
            }
            else
            {
              n = ViewGroup.getChildMeasureSpec(layoutWidthSpec, m, -2);
              if (mMatchConstraintDefaultWidth == 1) {
                i = 1;
              } else {
                i = 0;
              }
              i1 = measureStrategy;
              if (i1 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS)
              {
                m = n;
                if (i1 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {}
              }
              else
              {
                if (localView.getMeasuredHeight() == paramConstraintWidget.getHeight()) {
                  m = 1;
                } else {
                  m = 0;
                }
                if ((measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i != 0) && ((i == 0) || (m == 0)) && (!(localView instanceof Placeholder)) && (!paramConstraintWidget.isResolvedHorizontally())) {
                  i = 0;
                } else {
                  i = 1;
                }
                m = n;
                if (i != 0) {
                  m = View.MeasureSpec.makeMeasureSpec(paramConstraintWidget.getWidth(), 1073741824);
                }
              }
            }
          }
          else {
            m = ViewGroup.getChildMeasureSpec(layoutWidthSpec, paramConstraintWidget.getHorizontalMargin() + m, -1);
          }
        }
        else {
          m = ViewGroup.getChildMeasureSpec(layoutWidthSpec, m, -2);
        }
      }
      else {
        m = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      }
      i = localObject3[localObject2.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              i = 0;
            }
            else
            {
              j = ViewGroup.getChildMeasureSpec(layoutHeightSpec, k, -2);
              if (mMatchConstraintDefaultHeight == 1) {
                n = 1;
              } else {
                n = 0;
              }
              k = measureStrategy;
              if (k != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS)
              {
                i = j;
                if (k != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {}
              }
              else
              {
                if (localView.getMeasuredWidth() == paramConstraintWidget.getWidth()) {
                  i = 1;
                } else {
                  i = 0;
                }
                if ((measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (n != 0) && ((n == 0) || (i == 0)) && (!(localView instanceof Placeholder)) && (!paramConstraintWidget.isResolvedVertically())) {
                  n = 0;
                } else {
                  n = 1;
                }
                i = j;
                if (n != 0) {
                  i = View.MeasureSpec.makeMeasureSpec(paramConstraintWidget.getHeight(), 1073741824);
                }
              }
            }
          }
          else {
            i = ViewGroup.getChildMeasureSpec(layoutHeightSpec, paramConstraintWidget.getVerticalMargin() + k, -1);
          }
        }
        else {
          i = ViewGroup.getChildMeasureSpec(layoutHeightSpec, k, -2);
        }
      }
      else {
        i = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
      }
      localObject3 = (ConstraintWidgetContainer)paramConstraintWidget.getParent();
      if ((localObject3 != null) && (Optimizer.enabled(ConstraintLayout.access$000(ConstraintLayout.this), 256)) && (localView.getMeasuredWidth() == paramConstraintWidget.getWidth()) && (localView.getMeasuredWidth() < ((ConstraintWidget)localObject3).getWidth()) && (localView.getMeasuredHeight() == paramConstraintWidget.getHeight()) && (localView.getMeasuredHeight() < ((ConstraintWidget)localObject3).getHeight()) && (localView.getBaseline() == paramConstraintWidget.getBaselineDistance()) && (!paramConstraintWidget.isMeasureRequested()))
      {
        if ((isSimilarSpec(paramConstraintWidget.getLastHorizontalMeasureSpec(), m, paramConstraintWidget.getWidth())) && (isSimilarSpec(paramConstraintWidget.getLastVerticalMeasureSpec(), i, paramConstraintWidget.getHeight()))) {
          n = 1;
        } else {
          n = 0;
        }
        if (n != 0)
        {
          measuredWidth = paramConstraintWidget.getWidth();
          measuredHeight = paramConstraintWidget.getHeight();
          measuredBaseline = paramConstraintWidget.getBaselineDistance();
          return;
        }
      }
      localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      if (localObject1 == localObject3) {
        n = 1;
      } else {
        n = 0;
      }
      if (localObject2 == localObject3) {
        j = 1;
      } else {
        j = 0;
      }
      localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
      int i2;
      if ((localObject2 != localObject3) && (localObject2 != ConstraintWidget.DimensionBehaviour.FIXED)) {
        i2 = 0;
      } else {
        i2 = 1;
      }
      int i3;
      if ((localObject1 != localObject3) && (localObject1 != ConstraintWidget.DimensionBehaviour.FIXED)) {
        i3 = 0;
      } else {
        i3 = 1;
      }
      int i4;
      if ((n != 0) && (mDimensionRatio > 0.0F)) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      int i5;
      if ((j != 0) && (mDimensionRatio > 0.0F)) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      if (localView == null) {
        return;
      }
      localObject1 = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
      k = measureStrategy;
      if ((k != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS) && (k != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (n != 0) && (mMatchConstraintDefaultWidth == 0) && (j != 0) && (mMatchConstraintDefaultHeight == 0))
      {
        n = 0;
        i2 = 0;
        i1 = 0;
      }
      else
      {
        if (((localView instanceof VirtualLayout)) && ((paramConstraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)))
        {
          localObject2 = (androidx.constraintlayout.core.widgets.VirtualLayout)paramConstraintWidget;
          ((VirtualLayout)localView).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout)localObject2, m, i);
        }
        else
        {
          localView.measure(m, i);
        }
        paramConstraintWidget.setLastMeasureSpec(m, i);
        int i6 = localView.getMeasuredWidth();
        int i7 = localView.getMeasuredHeight();
        int i8 = localView.getBaseline();
        n = mMatchConstraintMinWidth;
        if (n > 0) {
          j = Math.max(n, i6);
        } else {
          j = i6;
        }
        k = mMatchConstraintMaxWidth;
        n = j;
        if (k > 0) {
          n = Math.min(k, j);
        }
        j = mMatchConstraintMinHeight;
        if (j > 0) {
          j = Math.max(j, i7);
        } else {
          j = i7;
        }
        k = mMatchConstraintMaxHeight;
        i1 = j;
        if (k > 0) {
          i1 = Math.min(k, j);
        }
        j = i1;
        k = n;
        if (!Optimizer.enabled(ConstraintLayout.access$000(ConstraintLayout.this), 1))
        {
          float f;
          if ((i4 != 0) && (i2 != 0))
          {
            f = mDimensionRatio;
            k = (int)(i1 * f + 0.5F);
            j = i1;
          }
          else
          {
            j = i1;
            k = n;
            if (i5 != 0)
            {
              j = i1;
              k = n;
              if (i3 != 0)
              {
                f = mDimensionRatio;
                j = (int)(n / f + 0.5F);
                k = n;
              }
            }
          }
        }
        if (i6 == k)
        {
          n = j;
          i2 = i8;
          i1 = k;
          if (i7 != j) {}
        }
        for (;;)
        {
          break;
          if (i6 != k) {
            m = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
          }
          if (i7 != j) {
            i = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
          }
          localView.measure(m, i);
          paramConstraintWidget.setLastMeasureSpec(m, i);
          i1 = localView.getMeasuredWidth();
          n = localView.getMeasuredHeight();
          i2 = localView.getBaseline();
        }
      }
      boolean bool1;
      if (i2 != -1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      boolean bool2;
      if ((i1 == horizontalDimension) && (n == verticalDimension)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      measuredNeedsSolverPass = bool2;
      if (needsBaseline) {
        bool1 = true;
      }
      if ((bool1) && (i2 != -1) && (paramConstraintWidget.getBaselineDistance() != i2)) {
        measuredNeedsSolverPass = true;
      }
      measuredWidth = i1;
      measuredHeight = n;
      measuredHasBaseline = bool1;
      measuredBaseline = i2;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */