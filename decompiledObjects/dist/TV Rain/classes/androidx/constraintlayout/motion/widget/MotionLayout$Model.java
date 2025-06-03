package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import z2;

class MotionLayout$Model
{
  public ConstraintSet mEnd = null;
  public int mEndId;
  public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
  public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
  public ConstraintSet mStart = null;
  public int mStartId;
  
  public MotionLayout$Model(MotionLayout paramMotionLayout) {}
  
  private void computeStartEndSize(int paramInt1, int paramInt2)
  {
    int i = this$0.getOptimizationLevel();
    Object localObject1 = this$0;
    Object localObject2;
    Object localObject3;
    int j;
    int k;
    if (mCurrentState == ((MotionLayout)localObject1).getStartState())
    {
      localObject2 = this$0;
      localObject1 = mLayoutEnd;
      localObject3 = mEnd;
      if ((localObject3 != null) && (mRotate != 0)) {
        j = paramInt2;
      } else {
        j = paramInt1;
      }
      if ((localObject3 != null) && (mRotate != 0)) {
        k = paramInt1;
      } else {
        k = paramInt2;
      }
      MotionLayout.access$1600((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject1, i, j, k);
      localObject2 = mStart;
      if (localObject2 != null)
      {
        localObject3 = this$0;
        localObject1 = mLayoutStart;
        k = mRotate;
        if (k == 0) {
          j = paramInt1;
        } else {
          j = paramInt2;
        }
        if (k == 0) {
          paramInt1 = paramInt2;
        }
        MotionLayout.access$1700((MotionLayout)localObject3, (ConstraintWidgetContainer)localObject1, i, j, paramInt1);
      }
    }
    else
    {
      localObject1 = mStart;
      if (localObject1 != null)
      {
        localObject2 = this$0;
        localObject3 = mLayoutStart;
        k = mRotate;
        if (k == 0) {
          j = paramInt1;
        } else {
          j = paramInt2;
        }
        if (k == 0) {
          k = paramInt2;
        } else {
          k = paramInt1;
        }
        MotionLayout.access$1800((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject3, i, j, k);
      }
      localObject3 = this$0;
      localObject1 = mLayoutEnd;
      localObject2 = mEnd;
      if ((localObject2 != null) && (mRotate != 0)) {
        j = paramInt2;
      } else {
        j = paramInt1;
      }
      if ((localObject2 == null) || (mRotate == 0)) {
        paramInt1 = paramInt2;
      }
      MotionLayout.access$1900((MotionLayout)localObject3, (ConstraintWidgetContainer)localObject1, i, j, paramInt1);
    }
  }
  
  @SuppressLint({"LogConditional"})
  private void debugLayout(String paramString, ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    Object localObject1 = (View)paramConstraintWidgetContainer.getCompanionWidget();
    paramString = z2.u(paramString, " ");
    paramString.append(Debug.getName((View)localObject1));
    String str1 = paramString.toString();
    paramString = new StringBuilder();
    paramString.append(str1);
    paramString.append("  ========= ");
    paramString.append(paramConstraintWidgetContainer);
    Log.v("MotionLayout", paramString.toString());
    int i = paramConstraintWidgetContainer.getChildren().size();
    for (int j = 0; j < i; j++)
    {
      paramString = new StringBuilder();
      paramString.append(str1);
      paramString.append("[");
      paramString.append(j);
      paramString.append("] ");
      String str2 = paramString.toString();
      ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.getChildren().get(j);
      Object localObject2 = z2.t("");
      paramString = mTop.mTarget;
      localObject1 = "_";
      if (paramString != null) {
        paramString = "T";
      } else {
        paramString = "_";
      }
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = z2.t(((StringBuilder)localObject2).toString());
      if (mBottom.mTarget != null) {
        paramString = "B";
      } else {
        paramString = "_";
      }
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = z2.t(((StringBuilder)localObject2).toString());
      if (mLeft.mTarget != null) {
        paramString = "L";
      } else {
        paramString = "_";
      }
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = z2.t(((StringBuilder)localObject2).toString());
      paramString = (String)localObject1;
      if (mRight.mTarget != null) {
        paramString = "R";
      }
      ((StringBuilder)localObject2).append(paramString);
      localObject2 = ((StringBuilder)localObject2).toString();
      View localView = (View)localConstraintWidget.getCompanionWidget();
      localObject1 = Debug.getName(localView);
      paramString = (String)localObject1;
      if ((localView instanceof TextView))
      {
        paramString = z2.u((String)localObject1, "(");
        paramString.append(((TextView)localView).getText());
        paramString.append(")");
        paramString = paramString.toString();
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(str2);
      ((StringBuilder)localObject1).append("  ");
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(" ");
      ((StringBuilder)localObject1).append(localConstraintWidget);
      ((StringBuilder)localObject1).append(" ");
      ((StringBuilder)localObject1).append((String)localObject2);
      Log.v("MotionLayout", ((StringBuilder)localObject1).toString());
    }
    paramString = new StringBuilder();
    paramString.append(str1);
    paramString.append(" done. ");
    Log.v("MotionLayout", paramString.toString());
  }
  
  @SuppressLint({"LogConditional"})
  private void debugLayoutParam(String paramString, ConstraintLayout.LayoutParams paramLayoutParams)
  {
    Object localObject1 = z2.t(" ");
    if (startToStart != -1) {
      localObject2 = "SS";
    } else {
      localObject2 = "__";
    }
    ((StringBuilder)localObject1).append((String)localObject2);
    StringBuilder localStringBuilder = z2.t(((StringBuilder)localObject1).toString());
    int i = startToEnd;
    localObject1 = "|__";
    if (i != -1) {
      localObject2 = "|SE";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (endToStart != -1) {
      localObject2 = "|ES";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (endToEnd != -1) {
      localObject2 = "|EE";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (leftToLeft != -1) {
      localObject2 = "|LL";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (leftToRight != -1) {
      localObject2 = "|LR";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (rightToLeft != -1) {
      localObject2 = "|RL";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (rightToRight != -1) {
      localObject2 = "|RR";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (topToTop != -1) {
      localObject2 = "|TT";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (topToBottom != -1) {
      localObject2 = "|TB";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    if (bottomToTop != -1) {
      localObject2 = "|BT";
    } else {
      localObject2 = "|__";
    }
    localStringBuilder.append((String)localObject2);
    localStringBuilder = z2.t(localStringBuilder.toString());
    Object localObject2 = localObject1;
    if (bottomToBottom != -1) {
      localObject2 = "|BB";
    }
    localStringBuilder.append((String)localObject2);
    localObject2 = localStringBuilder.toString();
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append(paramString);
    paramLayoutParams.append((String)localObject2);
    Log.v("MotionLayout", paramLayoutParams.toString());
  }
  
  @SuppressLint({"LogConditional"})
  private void debugWidget(String paramString, ConstraintWidget paramConstraintWidget)
  {
    StringBuilder localStringBuilder1 = z2.t(" ");
    Object localObject1 = mTop.mTarget;
    String str = "B";
    Object localObject2 = "__";
    StringBuilder localStringBuilder2;
    if (localObject1 != null)
    {
      localStringBuilder2 = z2.t("T");
      if (mTop.mTarget.mType == ConstraintAnchor.Type.TOP) {
        localObject1 = "T";
      } else {
        localObject1 = "B";
      }
      localStringBuilder2.append((String)localObject1);
      localObject1 = localStringBuilder2.toString();
    }
    else
    {
      localObject1 = "__";
    }
    localStringBuilder1.append((String)localObject1);
    localStringBuilder1 = z2.t(localStringBuilder1.toString());
    if (mBottom.mTarget != null)
    {
      localStringBuilder2 = z2.t("B");
      localObject1 = str;
      if (mBottom.mTarget.mType == ConstraintAnchor.Type.TOP) {
        localObject1 = "T";
      }
      localStringBuilder2.append((String)localObject1);
      localObject1 = localStringBuilder2.toString();
    }
    else
    {
      localObject1 = "__";
    }
    localStringBuilder1.append((String)localObject1);
    localStringBuilder1 = z2.t(localStringBuilder1.toString());
    localObject1 = mLeft.mTarget;
    str = "R";
    if (localObject1 != null)
    {
      localStringBuilder2 = z2.t("L");
      if (mLeft.mTarget.mType == ConstraintAnchor.Type.LEFT) {
        localObject1 = "L";
      } else {
        localObject1 = "R";
      }
      localStringBuilder2.append((String)localObject1);
      localObject1 = localStringBuilder2.toString();
    }
    else
    {
      localObject1 = "__";
    }
    localStringBuilder1.append((String)localObject1);
    localStringBuilder1 = z2.t(localStringBuilder1.toString());
    localObject1 = localObject2;
    if (mRight.mTarget != null)
    {
      localObject2 = z2.t("R");
      localObject1 = str;
      if (mRight.mTarget.mType == ConstraintAnchor.Type.LEFT) {
        localObject1 = "L";
      }
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    localStringBuilder1.append((String)localObject1);
    localObject2 = localStringBuilder1.toString();
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" ---  ");
    ((StringBuilder)localObject1).append(paramConstraintWidget);
    Log.v("MotionLayout", ((StringBuilder)localObject1).toString());
  }
  
  private void setupConstraintWidget(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet)
  {
    SparseArray localSparseArray = new SparseArray();
    Object localObject1 = new Constraints.LayoutParams(-2, -2);
    localSparseArray.clear();
    localSparseArray.put(0, paramConstraintWidgetContainer);
    localSparseArray.put(this$0.getId(), paramConstraintWidgetContainer);
    if ((paramConstraintSet != null) && (mRotate != 0))
    {
      localObject2 = this$0;
      MotionLayout.access$1000((MotionLayout)localObject2, mLayoutEnd, ((ConstraintLayout)localObject2).getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(this$0.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$0.getWidth(), 1073741824));
    }
    Object localObject2 = paramConstraintWidgetContainer.getChildren().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (ConstraintWidget)((Iterator)localObject2).next();
      ((ConstraintWidget)localObject3).setAnimated(true);
      localSparseArray.put(((View)((ConstraintWidget)localObject3).getCompanionWidget()).getId(), localObject3);
    }
    Iterator localIterator = paramConstraintWidgetContainer.getChildren().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (ConstraintWidget)localIterator.next();
      localObject3 = (View)((ConstraintWidget)localObject2).getCompanionWidget();
      paramConstraintSet.applyToLayoutParams(((View)localObject3).getId(), (ConstraintLayout.LayoutParams)localObject1);
      ((ConstraintWidget)localObject2).setWidth(paramConstraintSet.getWidth(((View)localObject3).getId()));
      ((ConstraintWidget)localObject2).setHeight(paramConstraintSet.getHeight(((View)localObject3).getId()));
      if ((localObject3 instanceof ConstraintHelper))
      {
        paramConstraintSet.applyToHelper((ConstraintHelper)localObject3, (ConstraintWidget)localObject2, (ConstraintLayout.LayoutParams)localObject1, localSparseArray);
        if ((localObject3 instanceof androidx.constraintlayout.widget.Barrier)) {
          ((androidx.constraintlayout.widget.Barrier)localObject3).validateParams();
        }
      }
      ((ConstraintLayout.LayoutParams)localObject1).resolveLayoutDirection(this$0.getLayoutDirection());
      MotionLayout.access$1100(this$0, false, (View)localObject3, (ConstraintWidget)localObject2, (ConstraintLayout.LayoutParams)localObject1, localSparseArray);
      if (paramConstraintSet.getVisibilityMode(((View)localObject3).getId()) == 1) {
        ((ConstraintWidget)localObject2).setVisibility(((View)localObject3).getVisibility());
      } else {
        ((ConstraintWidget)localObject2).setVisibility(paramConstraintSet.getVisibility(((View)localObject3).getId()));
      }
    }
    paramConstraintSet = paramConstraintWidgetContainer.getChildren().iterator();
    while (paramConstraintSet.hasNext())
    {
      localObject2 = (ConstraintWidget)paramConstraintSet.next();
      if ((localObject2 instanceof VirtualLayout))
      {
        localObject1 = (ConstraintHelper)((ConstraintWidget)localObject2).getCompanionWidget();
        localObject2 = (Helper)localObject2;
        ((ConstraintHelper)localObject1).updatePreLayout(paramConstraintWidgetContainer, (Helper)localObject2, localSparseArray);
        ((VirtualLayout)localObject2).captureWidgets();
      }
    }
  }
  
  public void build()
  {
    int i = this$0.getChildCount();
    this$0.mFrameArrayList.clear();
    SparseArray localSparseArray = new SparseArray();
    int[] arrayOfInt = new int[i];
    Object localObject1;
    Object localObject2;
    int k;
    for (int j = 0; j < i; j++)
    {
      localObject1 = this$0.getChildAt(j);
      localObject2 = new MotionController((View)localObject1);
      k = ((View)localObject1).getId();
      arrayOfInt[j] = k;
      localSparseArray.put(k, localObject2);
      this$0.mFrameArrayList.put(localObject1, localObject2);
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = this$0.getChildAt(j);
      localObject2 = (MotionController)this$0.mFrameArrayList.get(localObject1);
      if (localObject2 != null)
      {
        Object localObject3;
        if (mStart != null)
        {
          localObject3 = getWidget(mLayoutStart, (View)localObject1);
          if (localObject3 != null)
          {
            ((MotionController)localObject2).setStartState(MotionLayout.access$2000(this$0, (ConstraintWidget)localObject3), mStart, this$0.getWidth(), this$0.getHeight());
          }
          else if (this$0.mDebugPath != 0)
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append(Debug.getLocation());
            ((StringBuilder)localObject3).append("no widget for  ");
            ((StringBuilder)localObject3).append(Debug.getName((View)localObject1));
            ((StringBuilder)localObject3).append(" (");
            ((StringBuilder)localObject3).append(localObject1.getClass().getName());
            ((StringBuilder)localObject3).append(")");
            Log.e("MotionLayout", ((StringBuilder)localObject3).toString());
          }
        }
        else if (MotionLayout.access$300(this$0))
        {
          localObject3 = (ViewState)this$0.mPreRotate.get(localObject1);
          MotionLayout localMotionLayout = this$0;
          ((MotionController)localObject2).setStartState((ViewState)localObject3, (View)localObject1, mRotatMode, MotionLayout.access$2100(localMotionLayout), MotionLayout.access$2200(this$0));
        }
        if (mEnd != null)
        {
          localObject3 = getWidget(mLayoutEnd, (View)localObject1);
          if (localObject3 != null)
          {
            ((MotionController)localObject2).setEndState(MotionLayout.access$2000(this$0, (ConstraintWidget)localObject3), mEnd, this$0.getWidth(), this$0.getHeight());
          }
          else if (this$0.mDebugPath != 0)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append(Debug.getLocation());
            ((StringBuilder)localObject2).append("no widget for  ");
            ((StringBuilder)localObject2).append(Debug.getName((View)localObject1));
            ((StringBuilder)localObject2).append(" (");
            ((StringBuilder)localObject2).append(localObject1.getClass().getName());
            ((StringBuilder)localObject2).append(")");
            Log.e("MotionLayout", ((StringBuilder)localObject2).toString());
          }
        }
      }
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = (MotionController)localSparseArray.get(arrayOfInt[j]);
      k = ((MotionController)localObject1).getAnimateRelativeTo();
      if (k != -1) {
        ((MotionController)localObject1).setupRelative((MotionController)localSparseArray.get(k));
      }
    }
  }
  
  public void copy(ConstraintWidgetContainer paramConstraintWidgetContainer1, ConstraintWidgetContainer paramConstraintWidgetContainer2)
  {
    ArrayList localArrayList = paramConstraintWidgetContainer1.getChildren();
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramConstraintWidgetContainer1, paramConstraintWidgetContainer2);
    paramConstraintWidgetContainer2.getChildren().clear();
    paramConstraintWidgetContainer2.copy(paramConstraintWidgetContainer1, localHashMap);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      if ((localConstraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
        paramConstraintWidgetContainer1 = new androidx.constraintlayout.core.widgets.Barrier();
      } else if ((localConstraintWidget instanceof Guideline)) {
        paramConstraintWidgetContainer1 = new Guideline();
      } else if ((localConstraintWidget instanceof Flow)) {
        paramConstraintWidgetContainer1 = new Flow();
      } else if ((localConstraintWidget instanceof Placeholder)) {
        paramConstraintWidgetContainer1 = new Placeholder();
      } else if ((localConstraintWidget instanceof Helper)) {
        paramConstraintWidgetContainer1 = new HelperWidget();
      } else {
        paramConstraintWidgetContainer1 = new ConstraintWidget();
      }
      paramConstraintWidgetContainer2.add(paramConstraintWidgetContainer1);
      localHashMap.put(localConstraintWidget, paramConstraintWidgetContainer1);
    }
    paramConstraintWidgetContainer2 = localArrayList.iterator();
    while (paramConstraintWidgetContainer2.hasNext())
    {
      paramConstraintWidgetContainer1 = (ConstraintWidget)paramConstraintWidgetContainer2.next();
      ((ConstraintWidget)localHashMap.get(paramConstraintWidgetContainer1)).copy(paramConstraintWidgetContainer1, localHashMap);
    }
  }
  
  public ConstraintWidget getWidget(ConstraintWidgetContainer paramConstraintWidgetContainer, View paramView)
  {
    if (paramConstraintWidgetContainer.getCompanionWidget() == paramView) {
      return paramConstraintWidgetContainer;
    }
    paramConstraintWidgetContainer = paramConstraintWidgetContainer.getChildren();
    int i = paramConstraintWidgetContainer.size();
    for (int j = 0; j < i; j++)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.get(j);
      if (localConstraintWidget.getCompanionWidget() == paramView) {
        return localConstraintWidget;
      }
    }
    return null;
  }
  
  public void initFrom(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet1, ConstraintSet paramConstraintSet2)
  {
    mStart = paramConstraintSet1;
    mEnd = paramConstraintSet2;
    mLayoutStart = new ConstraintWidgetContainer();
    mLayoutEnd = new ConstraintWidgetContainer();
    mLayoutStart.setMeasurer(MotionLayout.access$400(this$0).getMeasurer());
    mLayoutEnd.setMeasurer(MotionLayout.access$500(this$0).getMeasurer());
    mLayoutStart.removeAllChildren();
    mLayoutEnd.removeAllChildren();
    copy(MotionLayout.access$600(this$0), mLayoutStart);
    copy(MotionLayout.access$700(this$0), mLayoutEnd);
    if (this$0.mTransitionLastPosition > 0.5D)
    {
      if (paramConstraintSet1 != null) {
        setupConstraintWidget(mLayoutStart, paramConstraintSet1);
      }
      setupConstraintWidget(mLayoutEnd, paramConstraintSet2);
    }
    else
    {
      setupConstraintWidget(mLayoutEnd, paramConstraintSet2);
      if (paramConstraintSet1 != null) {
        setupConstraintWidget(mLayoutStart, paramConstraintSet1);
      }
    }
    mLayoutStart.setRtl(MotionLayout.access$800(this$0));
    mLayoutStart.updateHierarchy();
    mLayoutEnd.setRtl(MotionLayout.access$900(this$0));
    mLayoutEnd.updateHierarchy();
    paramConstraintSet1 = this$0.getLayoutParams();
    if (paramConstraintSet1 != null)
    {
      if (width == -2)
      {
        paramConstraintWidgetContainer = mLayoutStart;
        paramConstraintSet2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        paramConstraintWidgetContainer.setHorizontalDimensionBehaviour(paramConstraintSet2);
        mLayoutEnd.setHorizontalDimensionBehaviour(paramConstraintSet2);
      }
      if (height == -2)
      {
        paramConstraintWidgetContainer = mLayoutStart;
        paramConstraintSet1 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        paramConstraintWidgetContainer.setVerticalDimensionBehaviour(paramConstraintSet1);
        mLayoutEnd.setVerticalDimensionBehaviour(paramConstraintSet1);
      }
    }
  }
  
  public boolean isNotConfiguredWith(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 == mStartId) && (paramInt2 == mEndId)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void measure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    MotionLayout localMotionLayout = this$0;
    mWidthMeasureMode = i;
    mHeightMeasureMode = j;
    localMotionLayout.getOptimizationLevel();
    computeStartEndSize(paramInt1, paramInt2);
    if (((this$0.getParent() instanceof MotionLayout)) && (i == 1073741824) && (j == 1073741824)) {
      i = 0;
    } else {
      i = 1;
    }
    boolean bool1;
    if (i != 0)
    {
      computeStartEndSize(paramInt1, paramInt2);
      this$0.mStartWrapWidth = mLayoutStart.getWidth();
      this$0.mStartWrapHeight = mLayoutStart.getHeight();
      this$0.mEndWrapWidth = mLayoutEnd.getWidth();
      this$0.mEndWrapHeight = mLayoutEnd.getHeight();
      localMotionLayout = this$0;
      if ((mStartWrapWidth == mEndWrapWidth) && (mStartWrapHeight == mEndWrapHeight)) {
        bool1 = false;
      } else {
        bool1 = true;
      }
      mMeasureDuringTransition = bool1;
    }
    localMotionLayout = this$0;
    j = mStartWrapWidth;
    int k = mStartWrapHeight;
    int m = mWidthMeasureMode;
    float f;
    if (m != Integer.MIN_VALUE)
    {
      i = j;
      if (m != 0) {}
    }
    else
    {
      f = j;
      i = (int)(mPostInterpolationPosition * (mEndWrapWidth - j) + f);
    }
    m = mHeightMeasureMode;
    if (m != Integer.MIN_VALUE)
    {
      j = k;
      if (m != 0) {}
    }
    else
    {
      f = k;
      j = (int)(mPostInterpolationPosition * (mEndWrapHeight - k) + f);
    }
    if ((!mLayoutStart.isWidthMeasuredTooSmall()) && (!mLayoutEnd.isWidthMeasuredTooSmall())) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    boolean bool2;
    if ((!mLayoutStart.isHeightMeasuredTooSmall()) && (!mLayoutEnd.isHeightMeasuredTooSmall())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    MotionLayout.access$1500(this$0, paramInt1, paramInt2, i, j, bool1, bool2);
  }
  
  public void reEvaluateState()
  {
    measure(MotionLayout.access$1200(this$0), MotionLayout.access$1300(this$0));
    MotionLayout.access$1400(this$0);
  }
  
  public void setMeasuredId(int paramInt1, int paramInt2)
  {
    mStartId = paramInt1;
    mEndId = paramInt2;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.Model
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */