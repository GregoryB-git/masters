package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z2;

public class ConstraintReference
  implements Reference
{
  private Object key;
  public float mAlpha = NaN.0F;
  public Object mBaselineToBaseline = null;
  public Object mBaselineToBottom = null;
  public Object mBaselineToTop = null;
  public Object mBottomToBottom = null;
  public Object mBottomToTop = null;
  private float mCircularAngle;
  public Object mCircularConstraint = null;
  private float mCircularDistance;
  private ConstraintWidget mConstraintWidget;
  private HashMap<String, Integer> mCustomColors;
  private HashMap<String, Float> mCustomFloats;
  public Object mEndToEnd = null;
  public Object mEndToStart = null;
  public Facade mFacade = null;
  public float mHorizontalBias = 0.5F;
  public int mHorizontalChainStyle = 0;
  public float mHorizontalChainWeight = -1.0F;
  public Dimension mHorizontalDimension;
  public State.Constraint mLast = null;
  public Object mLeftToLeft = null;
  public Object mLeftToRight = null;
  public int mMarginBaseline = 0;
  public int mMarginBaselineGone = 0;
  public int mMarginBottom = 0;
  public int mMarginBottomGone = 0;
  public int mMarginEnd = 0;
  public int mMarginEndGone = 0;
  public int mMarginLeft = 0;
  public int mMarginLeftGone = 0;
  public int mMarginRight = 0;
  public int mMarginRightGone = 0;
  public int mMarginStart = 0;
  public int mMarginStartGone = 0;
  public int mMarginTop = 0;
  public int mMarginTopGone = 0;
  public float mPivotX = NaN.0F;
  public float mPivotY = NaN.0F;
  public Object mRightToLeft = null;
  public Object mRightToRight = null;
  public float mRotationX = NaN.0F;
  public float mRotationY = NaN.0F;
  public float mRotationZ = NaN.0F;
  public float mScaleX = NaN.0F;
  public float mScaleY = NaN.0F;
  public Object mStartToEnd = null;
  public Object mStartToStart = null;
  public final State mState;
  public String mTag = null;
  public Object mTopToBottom = null;
  public Object mTopToTop = null;
  public float mTranslationX = NaN.0F;
  public float mTranslationY = NaN.0F;
  public float mTranslationZ = NaN.0F;
  public float mVerticalBias = 0.5F;
  public int mVerticalChainStyle = 0;
  public float mVerticalChainWeight = -1.0F;
  public Dimension mVerticalDimension;
  private Object mView;
  public int mVisibility = 0;
  
  public ConstraintReference(State paramState)
  {
    Object localObject = Dimension.WRAP_DIMENSION;
    mHorizontalDimension = Dimension.Fixed(localObject);
    mVerticalDimension = Dimension.Fixed(localObject);
    mCustomColors = new HashMap();
    mCustomFloats = new HashMap();
    mState = paramState;
  }
  
  private void applyConnection(ConstraintWidget paramConstraintWidget, Object paramObject, State.Constraint paramConstraint)
  {
    paramObject = getTarget(paramObject);
    if (paramObject == null) {
      return;
    }
    int[] arrayOfInt = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
    int i = arrayOfInt[paramConstraint.ordinal()];
    switch (arrayOfInt[paramConstraint.ordinal()])
    {
    default: 
      break;
    case 16: 
      paramConstraintWidget.connectCircularConstraint((ConstraintWidget)paramObject, mCircularAngle, (int)mCircularDistance);
      break;
    case 15: 
      paramConstraint = ConstraintAnchor.Type.BASELINE;
      paramConstraintWidget.immediateConnect(paramConstraint, (ConstraintWidget)paramObject, paramConstraint, mMarginBaseline, mMarginBaselineGone);
      break;
    case 14: 
      paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, (ConstraintWidget)paramObject, ConstraintAnchor.Type.TOP, mMarginBaseline, mMarginBaselineGone);
      break;
    case 13: 
      paramConstraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, (ConstraintWidget)paramObject, ConstraintAnchor.Type.BOTTOM, mMarginBaseline, mMarginBaselineGone);
      break;
    case 12: 
      paramConstraint = ConstraintAnchor.Type.BOTTOM;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginBottom, mMarginBottomGone, false);
      break;
    case 11: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.TOP), mMarginBottom, mMarginBottomGone, false);
      break;
    case 10: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.BOTTOM), mMarginTop, mMarginTopGone, false);
      break;
    case 9: 
      paramConstraint = ConstraintAnchor.Type.TOP;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginTop, mMarginTopGone, false);
      break;
    case 8: 
      paramConstraint = ConstraintAnchor.Type.RIGHT;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginEnd, mMarginEndGone, false);
      break;
    case 7: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.LEFT), mMarginEnd, mMarginEndGone, false);
      break;
    case 6: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.RIGHT), mMarginStart, mMarginStartGone, false);
      break;
    case 5: 
      paramConstraint = ConstraintAnchor.Type.LEFT;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginStart, mMarginStartGone, false);
      break;
    case 4: 
      paramConstraint = ConstraintAnchor.Type.RIGHT;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginRight, mMarginRightGone, false);
      break;
    case 3: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.LEFT), mMarginRight, mMarginRightGone, false);
      break;
    case 2: 
      paramConstraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(((ConstraintWidget)paramObject).getAnchor(ConstraintAnchor.Type.RIGHT), mMarginLeft, mMarginLeftGone, false);
      break;
    case 1: 
      paramConstraint = ConstraintAnchor.Type.LEFT;
      paramConstraintWidget.getAnchor(paramConstraint).connect(((ConstraintWidget)paramObject).getAnchor(paramConstraint), mMarginLeft, mMarginLeftGone, false);
    }
  }
  
  private void dereference()
  {
    mLeftToLeft = get(mLeftToLeft);
    mLeftToRight = get(mLeftToRight);
    mRightToLeft = get(mRightToLeft);
    mRightToRight = get(mRightToRight);
    mStartToStart = get(mStartToStart);
    mStartToEnd = get(mStartToEnd);
    mEndToStart = get(mEndToStart);
    mEndToEnd = get(mEndToEnd);
    mTopToTop = get(mTopToTop);
    mTopToBottom = get(mTopToBottom);
    mBottomToTop = get(mBottomToTop);
    mBottomToBottom = get(mBottomToBottom);
    mBaselineToBaseline = get(mBaselineToBaseline);
    mBaselineToTop = get(mBaselineToTop);
    mBaselineToBottom = get(mBaselineToBottom);
  }
  
  private Object get(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = paramObject;
    if (!(paramObject instanceof ConstraintReference)) {
      localObject = mState.reference(paramObject);
    }
    return localObject;
  }
  
  private ConstraintWidget getTarget(Object paramObject)
  {
    if ((paramObject instanceof Reference)) {
      return ((Reference)paramObject).getConstraintWidget();
    }
    return null;
  }
  
  public void addCustomColor(String paramString, int paramInt)
  {
    mCustomColors.put(paramString, Integer.valueOf(paramInt));
  }
  
  public void addCustomFloat(String paramString, float paramFloat)
  {
    if (mCustomFloats == null) {
      mCustomFloats = new HashMap();
    }
    mCustomFloats.put(paramString, Float.valueOf(paramFloat));
  }
  
  public ConstraintReference alpha(float paramFloat)
  {
    mAlpha = paramFloat;
    return this;
  }
  
  public void apply()
  {
    if (mConstraintWidget == null) {
      return;
    }
    Object localObject1 = mFacade;
    if (localObject1 != null) {
      ((Facade)localObject1).apply();
    }
    mHorizontalDimension.apply(mState, mConstraintWidget, 0);
    mVerticalDimension.apply(mState, mConstraintWidget, 1);
    dereference();
    applyConnection(mConstraintWidget, mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
    applyConnection(mConstraintWidget, mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
    applyConnection(mConstraintWidget, mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
    applyConnection(mConstraintWidget, mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
    applyConnection(mConstraintWidget, mStartToStart, State.Constraint.START_TO_START);
    applyConnection(mConstraintWidget, mStartToEnd, State.Constraint.START_TO_END);
    applyConnection(mConstraintWidget, mEndToStart, State.Constraint.END_TO_START);
    applyConnection(mConstraintWidget, mEndToEnd, State.Constraint.END_TO_END);
    applyConnection(mConstraintWidget, mTopToTop, State.Constraint.TOP_TO_TOP);
    applyConnection(mConstraintWidget, mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
    applyConnection(mConstraintWidget, mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
    applyConnection(mConstraintWidget, mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
    applyConnection(mConstraintWidget, mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
    applyConnection(mConstraintWidget, mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
    applyConnection(mConstraintWidget, mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
    applyConnection(mConstraintWidget, mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
    int i = mHorizontalChainStyle;
    if (i != 0) {
      mConstraintWidget.setHorizontalChainStyle(i);
    }
    i = mVerticalChainStyle;
    if (i != 0) {
      mConstraintWidget.setVerticalChainStyle(i);
    }
    float f = mHorizontalChainWeight;
    if (f != -1.0F) {
      mConstraintWidget.setHorizontalWeight(f);
    }
    f = mVerticalChainWeight;
    if (f != -1.0F) {
      mConstraintWidget.setVerticalWeight(f);
    }
    mConstraintWidget.setHorizontalBiasPercent(mHorizontalBias);
    mConstraintWidget.setVerticalBiasPercent(mVerticalBias);
    localObject1 = mConstraintWidget;
    Object localObject2 = frame;
    pivotX = mPivotX;
    pivotY = mPivotY;
    rotationX = mRotationX;
    rotationY = mRotationY;
    rotationZ = mRotationZ;
    translationX = mTranslationX;
    translationY = mTranslationY;
    translationZ = mTranslationZ;
    scaleX = mScaleX;
    scaleY = mScaleY;
    alpha = mAlpha;
    i = mVisibility;
    visibility = i;
    ((ConstraintWidget)localObject1).setVisibility(i);
    localObject1 = mCustomColors;
    if (localObject1 != null)
    {
      Iterator localIterator = ((HashMap)localObject1).keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        localObject2 = (Integer)mCustomColors.get(localObject1);
        mConstraintWidget.frame.setCustomAttribute((String)localObject1, 902, ((Integer)localObject2).intValue());
      }
    }
    localObject1 = mCustomFloats;
    if (localObject1 != null)
    {
      localObject2 = ((HashMap)localObject1).keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        f = ((Float)mCustomFloats.get(localObject1)).floatValue();
        mConstraintWidget.frame.setCustomAttribute((String)localObject1, 901, f);
      }
    }
  }
  
  public ConstraintReference baseline()
  {
    mLast = State.Constraint.BASELINE_TO_BASELINE;
    return this;
  }
  
  public ConstraintReference baselineToBaseline(Object paramObject)
  {
    mLast = State.Constraint.BASELINE_TO_BASELINE;
    mBaselineToBaseline = paramObject;
    return this;
  }
  
  public ConstraintReference baselineToBottom(Object paramObject)
  {
    mLast = State.Constraint.BASELINE_TO_BOTTOM;
    mBaselineToBottom = paramObject;
    return this;
  }
  
  public ConstraintReference baselineToTop(Object paramObject)
  {
    mLast = State.Constraint.BASELINE_TO_TOP;
    mBaselineToTop = paramObject;
    return this;
  }
  
  public ConstraintReference bias(float paramFloat)
  {
    State.Constraint localConstraint = mLast;
    if (localConstraint == null) {
      return this;
    }
    int i = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[localConstraint.ordinal()];
    if (i != 17)
    {
      if (i != 18) {}
      switch (i)
      {
      default: 
        break;
      case 9: 
      case 10: 
      case 11: 
      case 12: 
        mVerticalBias = paramFloat;
        break;
      }
    }
    else
    {
      mHorizontalBias = paramFloat;
    }
    return this;
  }
  
  public ConstraintReference bottom()
  {
    if (mBottomToTop != null) {
      mLast = State.Constraint.BOTTOM_TO_TOP;
    } else {
      mLast = State.Constraint.BOTTOM_TO_BOTTOM;
    }
    return this;
  }
  
  public ConstraintReference bottomToBottom(Object paramObject)
  {
    mLast = State.Constraint.BOTTOM_TO_BOTTOM;
    mBottomToBottom = paramObject;
    return this;
  }
  
  public ConstraintReference bottomToTop(Object paramObject)
  {
    mLast = State.Constraint.BOTTOM_TO_TOP;
    mBottomToTop = paramObject;
    return this;
  }
  
  public ConstraintReference centerHorizontally(Object paramObject)
  {
    paramObject = get(paramObject);
    mStartToStart = paramObject;
    mEndToEnd = paramObject;
    mLast = State.Constraint.CENTER_HORIZONTALLY;
    mHorizontalBias = 0.5F;
    return this;
  }
  
  public ConstraintReference centerVertically(Object paramObject)
  {
    paramObject = get(paramObject);
    mTopToTop = paramObject;
    mBottomToBottom = paramObject;
    mLast = State.Constraint.CENTER_VERTICALLY;
    mVerticalBias = 0.5F;
    return this;
  }
  
  public ConstraintReference circularConstraint(Object paramObject, float paramFloat1, float paramFloat2)
  {
    mCircularConstraint = get(paramObject);
    mCircularAngle = paramFloat1;
    mCircularDistance = paramFloat2;
    mLast = State.Constraint.CIRCULAR_CONSTRAINT;
    return this;
  }
  
  public ConstraintReference clear()
  {
    State.Constraint localConstraint = mLast;
    if (localConstraint != null)
    {
      switch (1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[localConstraint.ordinal()])
      {
      case 13: 
      case 14: 
      default: 
        break;
      case 16: 
        mCircularConstraint = null;
        break;
      case 15: 
        mBaselineToBaseline = null;
        break;
      case 11: 
      case 12: 
        mBottomToTop = null;
        mBottomToBottom = null;
        mMarginBottom = 0;
        mMarginBottomGone = 0;
        break;
      case 9: 
      case 10: 
        mTopToTop = null;
        mTopToBottom = null;
        mMarginTop = 0;
        mMarginTopGone = 0;
        break;
      case 7: 
      case 8: 
        mEndToStart = null;
        mEndToEnd = null;
        mMarginEnd = 0;
        mMarginEndGone = 0;
        break;
      case 5: 
      case 6: 
        mStartToStart = null;
        mStartToEnd = null;
        mMarginStart = 0;
        mMarginStartGone = 0;
        break;
      case 3: 
      case 4: 
        mRightToLeft = null;
        mRightToRight = null;
        mMarginRight = 0;
        mMarginRightGone = 0;
        break;
      case 1: 
      case 2: 
        mLeftToLeft = null;
        mLeftToRight = null;
        mMarginLeft = 0;
        mMarginLeftGone = 0;
        break;
      }
    }
    else
    {
      mLeftToLeft = null;
      mLeftToRight = null;
      mMarginLeft = 0;
      mRightToLeft = null;
      mRightToRight = null;
      mMarginRight = 0;
      mStartToStart = null;
      mStartToEnd = null;
      mMarginStart = 0;
      mEndToStart = null;
      mEndToEnd = null;
      mMarginEnd = 0;
      mTopToTop = null;
      mTopToBottom = null;
      mMarginTop = 0;
      mBottomToTop = null;
      mBottomToBottom = null;
      mMarginBottom = 0;
      mBaselineToBaseline = null;
      mCircularConstraint = null;
      mHorizontalBias = 0.5F;
      mVerticalBias = 0.5F;
      mMarginLeftGone = 0;
      mMarginRightGone = 0;
      mMarginStartGone = 0;
      mMarginEndGone = 0;
      mMarginTopGone = 0;
      mMarginBottomGone = 0;
    }
    return this;
  }
  
  public ConstraintReference clearHorizontal()
  {
    start().clear();
    end().clear();
    left().clear();
    right().clear();
    return this;
  }
  
  public ConstraintReference clearVertical()
  {
    top().clear();
    baseline().clear();
    bottom().clear();
    return this;
  }
  
  public ConstraintWidget createConstraintWidget()
  {
    return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
  }
  
  public ConstraintReference end()
  {
    if (mEndToStart != null) {
      mLast = State.Constraint.END_TO_START;
    } else {
      mLast = State.Constraint.END_TO_END;
    }
    return this;
  }
  
  public ConstraintReference endToEnd(Object paramObject)
  {
    mLast = State.Constraint.END_TO_END;
    mEndToEnd = paramObject;
    return this;
  }
  
  public ConstraintReference endToStart(Object paramObject)
  {
    mLast = State.Constraint.END_TO_START;
    mEndToStart = paramObject;
    return this;
  }
  
  public float getAlpha()
  {
    return mAlpha;
  }
  
  public ConstraintWidget getConstraintWidget()
  {
    if (mConstraintWidget == null)
    {
      ConstraintWidget localConstraintWidget = createConstraintWidget();
      mConstraintWidget = localConstraintWidget;
      localConstraintWidget.setCompanionWidget(mView);
    }
    return mConstraintWidget;
  }
  
  public Facade getFacade()
  {
    return mFacade;
  }
  
  public Dimension getHeight()
  {
    return mVerticalDimension;
  }
  
  public int getHorizontalChainStyle()
  {
    return mHorizontalChainStyle;
  }
  
  public float getHorizontalChainWeight()
  {
    return mHorizontalChainWeight;
  }
  
  public Object getKey()
  {
    return key;
  }
  
  public float getPivotX()
  {
    return mPivotX;
  }
  
  public float getPivotY()
  {
    return mPivotY;
  }
  
  public float getRotationX()
  {
    return mRotationX;
  }
  
  public float getRotationY()
  {
    return mRotationY;
  }
  
  public float getRotationZ()
  {
    return mRotationZ;
  }
  
  public float getScaleX()
  {
    return mScaleX;
  }
  
  public float getScaleY()
  {
    return mScaleY;
  }
  
  public String getTag()
  {
    return mTag;
  }
  
  public float getTranslationX()
  {
    return mTranslationX;
  }
  
  public float getTranslationY()
  {
    return mTranslationY;
  }
  
  public float getTranslationZ()
  {
    return mTranslationZ;
  }
  
  public int getVerticalChainStyle(int paramInt)
  {
    return mVerticalChainStyle;
  }
  
  public float getVerticalChainWeight()
  {
    return mVerticalChainWeight;
  }
  
  public Object getView()
  {
    return mView;
  }
  
  public Dimension getWidth()
  {
    return mHorizontalDimension;
  }
  
  public ConstraintReference height(Dimension paramDimension)
  {
    return setHeight(paramDimension);
  }
  
  public ConstraintReference horizontalBias(float paramFloat)
  {
    mHorizontalBias = paramFloat;
    return this;
  }
  
  public ConstraintReference left()
  {
    if (mLeftToLeft != null) {
      mLast = State.Constraint.LEFT_TO_LEFT;
    } else {
      mLast = State.Constraint.LEFT_TO_RIGHT;
    }
    return this;
  }
  
  public ConstraintReference leftToLeft(Object paramObject)
  {
    mLast = State.Constraint.LEFT_TO_LEFT;
    mLeftToLeft = paramObject;
    return this;
  }
  
  public ConstraintReference leftToRight(Object paramObject)
  {
    mLast = State.Constraint.LEFT_TO_RIGHT;
    mLeftToRight = paramObject;
    return this;
  }
  
  public ConstraintReference margin(int paramInt)
  {
    State.Constraint localConstraint = mLast;
    if (localConstraint != null)
    {
      switch (1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[localConstraint.ordinal()])
      {
      default: 
        break;
      case 16: 
        mCircularDistance = paramInt;
        break;
      case 13: 
      case 14: 
      case 15: 
        mMarginBaseline = paramInt;
        break;
      case 11: 
      case 12: 
        mMarginBottom = paramInt;
        break;
      case 9: 
      case 10: 
        mMarginTop = paramInt;
        break;
      case 7: 
      case 8: 
        mMarginEnd = paramInt;
        break;
      case 5: 
      case 6: 
        mMarginStart = paramInt;
        break;
      case 3: 
      case 4: 
        mMarginRight = paramInt;
        break;
      case 1: 
      case 2: 
        mMarginLeft = paramInt;
        break;
      }
    }
    else
    {
      mMarginLeft = paramInt;
      mMarginRight = paramInt;
      mMarginStart = paramInt;
      mMarginEnd = paramInt;
      mMarginTop = paramInt;
      mMarginBottom = paramInt;
    }
    return this;
  }
  
  public ConstraintReference margin(Object paramObject)
  {
    return margin(mState.convertDimension(paramObject));
  }
  
  public ConstraintReference marginGone(int paramInt)
  {
    State.Constraint localConstraint = mLast;
    if (localConstraint != null)
    {
      switch (1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[localConstraint.ordinal()])
      {
      default: 
        break;
      case 13: 
      case 14: 
      case 15: 
        mMarginBaselineGone = paramInt;
        break;
      case 11: 
      case 12: 
        mMarginBottomGone = paramInt;
        break;
      case 9: 
      case 10: 
        mMarginTopGone = paramInt;
        break;
      case 7: 
      case 8: 
        mMarginEndGone = paramInt;
        break;
      case 5: 
      case 6: 
        mMarginStartGone = paramInt;
        break;
      case 3: 
      case 4: 
        mMarginRightGone = paramInt;
        break;
      case 1: 
      case 2: 
        mMarginLeftGone = paramInt;
        break;
      }
    }
    else
    {
      mMarginLeftGone = paramInt;
      mMarginRightGone = paramInt;
      mMarginStartGone = paramInt;
      mMarginEndGone = paramInt;
      mMarginTopGone = paramInt;
      mMarginBottomGone = paramInt;
    }
    return this;
  }
  
  public ConstraintReference marginGone(Object paramObject)
  {
    return marginGone(mState.convertDimension(paramObject));
  }
  
  public ConstraintReference pivotX(float paramFloat)
  {
    mPivotX = paramFloat;
    return this;
  }
  
  public ConstraintReference pivotY(float paramFloat)
  {
    mPivotY = paramFloat;
    return this;
  }
  
  public ConstraintReference right()
  {
    if (mRightToLeft != null) {
      mLast = State.Constraint.RIGHT_TO_LEFT;
    } else {
      mLast = State.Constraint.RIGHT_TO_RIGHT;
    }
    return this;
  }
  
  public ConstraintReference rightToLeft(Object paramObject)
  {
    mLast = State.Constraint.RIGHT_TO_LEFT;
    mRightToLeft = paramObject;
    return this;
  }
  
  public ConstraintReference rightToRight(Object paramObject)
  {
    mLast = State.Constraint.RIGHT_TO_RIGHT;
    mRightToRight = paramObject;
    return this;
  }
  
  public ConstraintReference rotationX(float paramFloat)
  {
    mRotationX = paramFloat;
    return this;
  }
  
  public ConstraintReference rotationY(float paramFloat)
  {
    mRotationY = paramFloat;
    return this;
  }
  
  public ConstraintReference rotationZ(float paramFloat)
  {
    mRotationZ = paramFloat;
    return this;
  }
  
  public ConstraintReference scaleX(float paramFloat)
  {
    mScaleX = paramFloat;
    return this;
  }
  
  public ConstraintReference scaleY(float paramFloat)
  {
    mScaleY = paramFloat;
    return this;
  }
  
  public void setConstraintWidget(ConstraintWidget paramConstraintWidget)
  {
    if (paramConstraintWidget == null) {
      return;
    }
    mConstraintWidget = paramConstraintWidget;
    paramConstraintWidget.setCompanionWidget(mView);
  }
  
  public void setFacade(Facade paramFacade)
  {
    mFacade = paramFacade;
    if (paramFacade != null) {
      setConstraintWidget(paramFacade.getConstraintWidget());
    }
  }
  
  public ConstraintReference setHeight(Dimension paramDimension)
  {
    mVerticalDimension = paramDimension;
    return this;
  }
  
  public void setHorizontalChainStyle(int paramInt)
  {
    mHorizontalChainStyle = paramInt;
  }
  
  public void setHorizontalChainWeight(float paramFloat)
  {
    mHorizontalChainWeight = paramFloat;
  }
  
  public void setKey(Object paramObject)
  {
    key = paramObject;
  }
  
  public void setTag(String paramString)
  {
    mTag = paramString;
  }
  
  public void setVerticalChainStyle(int paramInt)
  {
    mVerticalChainStyle = paramInt;
  }
  
  public void setVerticalChainWeight(float paramFloat)
  {
    mVerticalChainWeight = paramFloat;
  }
  
  public void setView(Object paramObject)
  {
    mView = paramObject;
    ConstraintWidget localConstraintWidget = mConstraintWidget;
    if (localConstraintWidget != null) {
      localConstraintWidget.setCompanionWidget(paramObject);
    }
  }
  
  public ConstraintReference setWidth(Dimension paramDimension)
  {
    mHorizontalDimension = paramDimension;
    return this;
  }
  
  public ConstraintReference start()
  {
    if (mStartToStart != null) {
      mLast = State.Constraint.START_TO_START;
    } else {
      mLast = State.Constraint.START_TO_END;
    }
    return this;
  }
  
  public ConstraintReference startToEnd(Object paramObject)
  {
    mLast = State.Constraint.START_TO_END;
    mStartToEnd = paramObject;
    return this;
  }
  
  public ConstraintReference startToStart(Object paramObject)
  {
    mLast = State.Constraint.START_TO_START;
    mStartToStart = paramObject;
    return this;
  }
  
  public ConstraintReference top()
  {
    if (mTopToTop != null) {
      mLast = State.Constraint.TOP_TO_TOP;
    } else {
      mLast = State.Constraint.TOP_TO_BOTTOM;
    }
    return this;
  }
  
  public ConstraintReference topToBottom(Object paramObject)
  {
    mLast = State.Constraint.TOP_TO_BOTTOM;
    mTopToBottom = paramObject;
    return this;
  }
  
  public ConstraintReference topToTop(Object paramObject)
  {
    mLast = State.Constraint.TOP_TO_TOP;
    mTopToTop = paramObject;
    return this;
  }
  
  public ConstraintReference translationX(float paramFloat)
  {
    mTranslationX = paramFloat;
    return this;
  }
  
  public ConstraintReference translationY(float paramFloat)
  {
    mTranslationY = paramFloat;
    return this;
  }
  
  public ConstraintReference translationZ(float paramFloat)
  {
    mTranslationZ = paramFloat;
    return this;
  }
  
  public void validate()
    throws ConstraintReference.IncorrectConstraintException
  {
    ArrayList localArrayList = new ArrayList();
    if ((mLeftToLeft != null) && (mLeftToRight != null)) {
      localArrayList.add("LeftToLeft and LeftToRight both defined");
    }
    if ((mRightToLeft != null) && (mRightToRight != null)) {
      localArrayList.add("RightToLeft and RightToRight both defined");
    }
    if ((mStartToStart != null) && (mStartToEnd != null)) {
      localArrayList.add("StartToStart and StartToEnd both defined");
    }
    if ((mEndToStart != null) && (mEndToEnd != null)) {
      localArrayList.add("EndToStart and EndToEnd both defined");
    }
    if (((mLeftToLeft != null) || (mLeftToRight != null) || (mRightToLeft != null) || (mRightToRight != null)) && ((mStartToStart != null) || (mStartToEnd != null) || (mEndToStart != null) || (mEndToEnd != null))) {
      localArrayList.add("Both left/right and start/end constraints defined");
    }
    if (localArrayList.size() <= 0) {
      return;
    }
    throw new IncorrectConstraintException(localArrayList);
  }
  
  public ConstraintReference verticalBias(float paramFloat)
  {
    mVerticalBias = paramFloat;
    return this;
  }
  
  public ConstraintReference visibility(int paramInt)
  {
    mVisibility = paramInt;
    return this;
  }
  
  public ConstraintReference width(Dimension paramDimension)
  {
    return setWidth(paramDimension);
  }
  
  public static abstract interface ConstraintReferenceFactory
  {
    public abstract ConstraintReference create(State paramState);
  }
  
  public static class IncorrectConstraintException
    extends Exception
  {
    private final ArrayList<String> mErrors;
    
    public IncorrectConstraintException(ArrayList<String> paramArrayList)
    {
      mErrors = paramArrayList;
    }
    
    public ArrayList<String> getErrors()
    {
      return mErrors;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("IncorrectConstraintException: ");
      localStringBuilder.append(mErrors.toString());
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.ConstraintReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */