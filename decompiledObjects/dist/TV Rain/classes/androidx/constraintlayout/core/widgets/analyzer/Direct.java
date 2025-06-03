package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Direct
{
  private static final boolean APPLY_MATCH_PARENT = false;
  private static final boolean DEBUG = false;
  private static final boolean EARLY_TERMINATION = true;
  private static int hcount = 0;
  private static BasicMeasure.Measure measure = new BasicMeasure.Measure();
  private static int vcount = 0;
  
  private static boolean canMeasure(int paramInt, ConstraintWidget paramConstraintWidget)
  {
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = paramConstraintWidget.getHorizontalDimensionBehaviour();
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = paramConstraintWidget.getVerticalDimensionBehaviour();
    Object localObject;
    if (paramConstraintWidget.getParent() != null) {
      localObject = (ConstraintWidgetContainer)paramConstraintWidget.getParent();
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      ((ConstraintWidget)localObject).getHorizontalDimensionBehaviour();
      localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
    }
    if (localObject != null)
    {
      ((ConstraintWidget)localObject).getVerticalDimensionBehaviour();
      localObject = ConstraintWidget.DimensionBehaviour.FIXED;
    }
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
    boolean bool1 = false;
    if ((localDimensionBehaviour1 != localDimensionBehaviour3) && (!paramConstraintWidget.isResolvedHorizontally()) && (localDimensionBehaviour1 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
    {
      localObject = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      if (((localDimensionBehaviour1 != localObject) || (mMatchConstraintDefaultWidth != 0) || (mDimensionRatio != 0.0F) || (!paramConstraintWidget.hasDanglingDimension(0))) && ((localDimensionBehaviour1 != localObject) || (mMatchConstraintDefaultWidth != 1) || (!paramConstraintWidget.hasResolvedTargets(0, paramConstraintWidget.getWidth()))))
      {
        paramInt = 0;
        break label163;
      }
    }
    paramInt = 1;
    label163:
    if ((localDimensionBehaviour2 != localDimensionBehaviour3) && (!paramConstraintWidget.isResolvedVertically()) && (localDimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
    {
      localObject = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      if (((localDimensionBehaviour2 != localObject) || (mMatchConstraintDefaultHeight != 0) || (mDimensionRatio != 0.0F) || (!paramConstraintWidget.hasDanglingDimension(1))) && ((localDimensionBehaviour2 != localObject) || (mMatchConstraintDefaultHeight != 1) || (!paramConstraintWidget.hasResolvedTargets(1, paramConstraintWidget.getHeight()))))
      {
        i = 0;
        break label256;
      }
    }
    int i = 1;
    label256:
    if ((mDimensionRatio > 0.0F) && ((paramInt != 0) || (i != 0))) {
      return true;
    }
    boolean bool2 = bool1;
    if (paramInt != 0)
    {
      bool2 = bool1;
      if (i != 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private static void horizontalSolvingPass(int paramInt, ConstraintWidget paramConstraintWidget, BasicMeasure.Measurer paramMeasurer, boolean paramBoolean)
  {
    if (paramConstraintWidget.isHorizontalSolvingPassDone()) {
      return;
    }
    hcount += 1;
    int i;
    if ((!(paramConstraintWidget instanceof ConstraintWidgetContainer)) && (paramConstraintWidget.isMeasureRequested()))
    {
      i = paramInt + 1;
      if (canMeasure(i, paramConstraintWidget)) {
        ConstraintWidgetContainer.measure(i, paramConstraintWidget, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
      }
    }
    Object localObject1 = paramConstraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
    ConstraintAnchor localConstraintAnchor = paramConstraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT);
    int j = ((ConstraintAnchor)localObject1).getFinalValue();
    int k = localConstraintAnchor.getFinalValue();
    Iterator localIterator;
    Object localObject2;
    boolean bool;
    Object localObject3;
    if ((((ConstraintAnchor)localObject1).getDependents() != null) && (((ConstraintAnchor)localObject1).hasFinalValue()))
    {
      localIterator = ((ConstraintAnchor)localObject1).getDependents().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (ConstraintAnchor)localIterator.next();
        localObject1 = mOwner;
        int m = paramInt + 1;
        bool = canMeasure(m, (ConstraintWidget)localObject1);
        if ((((ConstraintWidget)localObject1).isMeasureRequested()) && (bool)) {
          ConstraintWidgetContainer.measure(m, (ConstraintWidget)localObject1, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        if (localObject2 == mLeft)
        {
          localObject3 = mRight.mTarget;
          if ((localObject3 != null) && (((ConstraintAnchor)localObject3).hasFinalValue())) {}
        }
        else
        {
          if (localObject2 != mRight) {
            break label267;
          }
          localObject3 = mLeft.mTarget;
          if ((localObject3 == null) || (!((ConstraintAnchor)localObject3).hasFinalValue())) {
            break label267;
          }
        }
        i = 1;
        break label270;
        label267:
        i = 0;
        label270:
        localObject3 = ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour();
        Object localObject4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject3 == localObject4) && (!bool))
        {
          if ((((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour() == localObject4) && (mMatchConstraintMaxWidth >= 0) && (mMatchConstraintMinWidth >= 0) && ((((ConstraintWidget)localObject1).getVisibility() == 8) || ((mMatchConstraintDefaultWidth == 0) && (((ConstraintWidget)localObject1).getDimensionRatio() == 0.0F))) && (!((ConstraintWidget)localObject1).isInHorizontalChain()) && (!((ConstraintWidget)localObject1).isInVirtualLayout()) && (i != 0) && (!((ConstraintWidget)localObject1).isInHorizontalChain())) {
            solveHorizontalMatchConstraint(m, paramConstraintWidget, paramMeasurer, (ConstraintWidget)localObject1, paramBoolean);
          }
        }
        else {
          if (((ConstraintWidget)localObject1).isMeasureRequested()) {
            continue;
          }
        }
        for (;;)
        {
          localObject3 = mLeft;
          if ((localObject2 == localObject3) && (mRight.mTarget == null))
          {
            i = ((ConstraintAnchor)localObject3).getMargin() + j;
            ((ConstraintWidget)localObject1).setFinalHorizontal(i, ((ConstraintWidget)localObject1).getWidth() + i);
            horizontalSolvingPass(m, (ConstraintWidget)localObject1, paramMeasurer, paramBoolean);
          }
          else
          {
            localObject4 = mRight;
            if ((localObject2 == localObject4) && (mTarget == null))
            {
              i = j - ((ConstraintAnchor)localObject4).getMargin();
              ((ConstraintWidget)localObject1).setFinalHorizontal(i - ((ConstraintWidget)localObject1).getWidth(), i);
              horizontalSolvingPass(m, (ConstraintWidget)localObject1, paramMeasurer, paramBoolean);
            }
            else if ((i != 0) && (!((ConstraintWidget)localObject1).isInHorizontalChain()))
            {
              solveHorizontalCenterConstraints(m, paramMeasurer, (ConstraintWidget)localObject1, paramBoolean);
            }
          }
        }
      }
    }
    if ((paramConstraintWidget instanceof Guideline)) {
      return;
    }
    if ((localConstraintAnchor.getDependents() != null) && (localConstraintAnchor.hasFinalValue()))
    {
      localIterator = localConstraintAnchor.getDependents().iterator();
      while (localIterator.hasNext())
      {
        localConstraintAnchor = (ConstraintAnchor)localIterator.next();
        localObject1 = mOwner;
        j = paramInt + 1;
        bool = canMeasure(j, (ConstraintWidget)localObject1);
        if ((((ConstraintWidget)localObject1).isMeasureRequested()) && (bool)) {
          ConstraintWidgetContainer.measure(j, (ConstraintWidget)localObject1, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        if (localConstraintAnchor == mLeft)
        {
          localObject2 = mRight.mTarget;
          if ((localObject2 != null) && (((ConstraintAnchor)localObject2).hasFinalValue())) {}
        }
        else
        {
          if (localConstraintAnchor != mRight) {
            break label731;
          }
          localObject2 = mLeft.mTarget;
          if ((localObject2 == null) || (!((ConstraintAnchor)localObject2).hasFinalValue())) {
            break label731;
          }
        }
        i = 1;
        break label734;
        label731:
        i = 0;
        label734:
        localObject2 = ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour();
        localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject2 == localObject3) && (!bool))
        {
          if ((((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour() == localObject3) && (mMatchConstraintMaxWidth >= 0) && (mMatchConstraintMinWidth >= 0) && ((((ConstraintWidget)localObject1).getVisibility() == 8) || ((mMatchConstraintDefaultWidth == 0) && (((ConstraintWidget)localObject1).getDimensionRatio() == 0.0F))) && (!((ConstraintWidget)localObject1).isInHorizontalChain()) && (!((ConstraintWidget)localObject1).isInVirtualLayout()) && (i != 0) && (!((ConstraintWidget)localObject1).isInHorizontalChain())) {
            solveHorizontalMatchConstraint(j, paramConstraintWidget, paramMeasurer, (ConstraintWidget)localObject1, paramBoolean);
          }
        }
        else if (!((ConstraintWidget)localObject1).isMeasureRequested())
        {
          localObject3 = mLeft;
          if ((localConstraintAnchor == localObject3) && (mRight.mTarget == null))
          {
            i = ((ConstraintAnchor)localObject3).getMargin() + k;
            ((ConstraintWidget)localObject1).setFinalHorizontal(i, ((ConstraintWidget)localObject1).getWidth() + i);
            horizontalSolvingPass(j, (ConstraintWidget)localObject1, paramMeasurer, paramBoolean);
          }
          else
          {
            localObject2 = mRight;
            if ((localConstraintAnchor == localObject2) && (mTarget == null))
            {
              i = k - ((ConstraintAnchor)localObject2).getMargin();
              ((ConstraintWidget)localObject1).setFinalHorizontal(i - ((ConstraintWidget)localObject1).getWidth(), i);
              horizontalSolvingPass(j, (ConstraintWidget)localObject1, paramMeasurer, paramBoolean);
            }
            else if ((i != 0) && (!((ConstraintWidget)localObject1).isInHorizontalChain()))
            {
              solveHorizontalCenterConstraints(j, paramMeasurer, (ConstraintWidget)localObject1, paramBoolean);
            }
          }
        }
      }
    }
    paramConstraintWidget.markHorizontalSolvingPassDone();
  }
  
  public static String ls(int paramInt)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    for (int i = 0; i < paramInt; i++) {
      localStringBuilder1.append("  ");
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("+-(");
    localStringBuilder2.append(paramInt);
    localStringBuilder2.append(") ");
    localStringBuilder1.append(localStringBuilder2.toString());
    return localStringBuilder1.toString();
  }
  
  private static void solveBarrier(int paramInt1, Barrier paramBarrier, BasicMeasure.Measurer paramMeasurer, int paramInt2, boolean paramBoolean)
  {
    if (paramBarrier.allSolved()) {
      if (paramInt2 == 0) {
        horizontalSolvingPass(paramInt1 + 1, paramBarrier, paramMeasurer, paramBoolean);
      } else {
        verticalSolvingPass(paramInt1 + 1, paramBarrier, paramMeasurer);
      }
    }
  }
  
  public static boolean solveChain(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, int paramInt1, int paramInt2, ChainHead paramChainHead, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {
      return false;
    }
    if (paramInt1 == 0)
    {
      if (!paramConstraintWidgetContainer.isResolvedHorizontally()) {
        return false;
      }
    }
    else if (!paramConstraintWidgetContainer.isResolvedVertically()) {
      return false;
    }
    paramBoolean3 = paramConstraintWidgetContainer.isRtl();
    Object localObject1 = paramChainHead.getFirst();
    Object localObject2 = paramChainHead.getLast();
    ConstraintWidget localConstraintWidget1 = paramChainHead.getFirstVisibleWidget();
    ConstraintWidget localConstraintWidget2 = paramChainHead.getLastVisibleWidget();
    ConstraintWidget localConstraintWidget3 = paramChainHead.getHead();
    paramChainHead = mListAnchors[paramInt2];
    localObject2 = mListAnchors;
    int i = paramInt2 + 1;
    Object localObject3 = localObject2[i];
    localObject2 = mTarget;
    if ((localObject2 != null) && (mTarget != null) && (((ConstraintAnchor)localObject2).hasFinalValue()) && (mTarget.hasFinalValue()) && (localConstraintWidget1 != null) && (localConstraintWidget2 != null))
    {
      int j = mTarget.getFinalValue();
      int k = mListAnchors[paramInt2].getMargin() + j;
      int m = mTarget.getFinalValue() - mListAnchors[i].getMargin();
      int n = m - k;
      if (n <= 0) {
        return false;
      }
      BasicMeasure.Measure localMeasure = new BasicMeasure.Measure();
      int i1 = 0;
      j = i1;
      int i2 = j;
      int i3 = i2;
      localObject2 = localObject1;
      int i4 = i2;
      i2 = j;
      j = i1;
      paramChainHead = (ChainHead)localObject1;
      for (;;)
      {
        localObject3 = null;
        if (j != 0) {
          break;
        }
        if (!canMeasure(1, (ConstraintWidget)localObject2)) {
          return false;
        }
        if (mListDimensionBehaviors[paramInt1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
          return false;
        }
        if (((ConstraintWidget)localObject2).isMeasureRequested()) {
          ConstraintWidgetContainer.measure(1, (ConstraintWidget)localObject2, paramConstraintWidgetContainer.getMeasurer(), localMeasure, BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        int i5 = mListAnchors[paramInt2].getMargin();
        if (paramInt1 == 0) {
          i1 = ((ConstraintWidget)localObject2).getWidth();
        } else {
          i1 = ((ConstraintWidget)localObject2).getHeight();
        }
        i3 = mListAnchors[i].getMargin() + (i1 + (i5 + i3));
        i1 = i4 + 1;
        i4 = i2;
        if (((ConstraintWidget)localObject2).getVisibility() != 8) {
          i4 = i2 + 1;
        }
        Object localObject4 = mListAnchors[i].mTarget;
        localObject1 = localObject3;
        if (localObject4 != null)
        {
          localObject4 = mOwner;
          ConstraintAnchor localConstraintAnchor = mListAnchors[paramInt2].mTarget;
          localObject1 = localObject3;
          if (localConstraintAnchor != null) {
            if (mOwner != localObject2) {
              localObject1 = localObject3;
            } else {
              localObject1 = localObject4;
            }
          }
        }
        if (localObject1 != null) {
          localObject2 = localObject1;
        } else {
          j = 1;
        }
        i2 = i4;
        i4 = i1;
      }
      if (i2 == 0) {
        return false;
      }
      if (i2 != i4) {
        return false;
      }
      if (n < i3) {
        return false;
      }
      i4 = n - i3;
      if (paramBoolean1) {
        j = i4 / (i2 + 1);
      }
      for (;;)
      {
        break;
        j = i4;
        if (paramBoolean2)
        {
          j = i4;
          if (i2 > 2) {
            j = i4 / i2 - 1;
          }
        }
      }
      if (i2 == 1)
      {
        float f1;
        if (paramInt1 == 0) {
          f1 = localConstraintWidget3.getHorizontalBiasPercent();
        } else {
          f1 = localConstraintWidget3.getVerticalBiasPercent();
        }
        float f2 = k;
        paramInt2 = (int)(j * f1 + (f2 + 0.5F));
        if (paramInt1 == 0) {
          localConstraintWidget1.setFinalHorizontal(paramInt2, localConstraintWidget1.getWidth() + paramInt2);
        } else {
          localConstraintWidget1.setFinalVertical(paramInt2, localConstraintWidget1.getHeight() + paramInt2);
        }
        horizontalSolvingPass(1, localConstraintWidget1, paramConstraintWidgetContainer.getMeasurer(), paramBoolean3);
        return true;
      }
      if (paramBoolean1)
      {
        i4 = k + j;
        i2 = 0;
        for (localObject1 = paramChainHead; i2 == 0; localObject1 = paramChainHead)
        {
          if (((ConstraintWidget)localObject1).getVisibility() == 8)
          {
            if (paramInt1 == 0)
            {
              ((ConstraintWidget)localObject1).setFinalHorizontal(i4, i4);
              horizontalSolvingPass(1, (ConstraintWidget)localObject1, paramConstraintWidgetContainer.getMeasurer(), paramBoolean3);
            }
            else
            {
              ((ConstraintWidget)localObject1).setFinalVertical(i4, i4);
              verticalSolvingPass(1, (ConstraintWidget)localObject1, paramConstraintWidgetContainer.getMeasurer());
            }
          }
          else
          {
            i3 = mListAnchors[paramInt2].getMargin() + i4;
            if (paramInt1 == 0)
            {
              ((ConstraintWidget)localObject1).setFinalHorizontal(i3, ((ConstraintWidget)localObject1).getWidth() + i3);
              horizontalSolvingPass(1, (ConstraintWidget)localObject1, paramConstraintWidgetContainer.getMeasurer(), paramBoolean3);
              i4 = ((ConstraintWidget)localObject1).getWidth();
            }
            else
            {
              ((ConstraintWidget)localObject1).setFinalVertical(i3, ((ConstraintWidget)localObject1).getHeight() + i3);
              verticalSolvingPass(1, (ConstraintWidget)localObject1, paramConstraintWidgetContainer.getMeasurer());
              i4 = ((ConstraintWidget)localObject1).getHeight();
            }
            i4 = mListAnchors[i].getMargin() + (i4 + i3) + j;
          }
          ((ConstraintWidget)localObject1).addToSolver(paramLinearSystem, false);
          paramChainHead = mListAnchors[i].mTarget;
          if (paramChainHead != null)
          {
            paramChainHead = mOwner;
            localObject2 = mListAnchors[paramInt2].mTarget;
            if ((localObject2 != null) && (mOwner == localObject1)) {}
          }
          else
          {
            paramChainHead = null;
          }
          if (paramChainHead == null)
          {
            i2 = 1;
            paramChainHead = (ChainHead)localObject1;
          }
        }
      }
      if (paramBoolean2)
      {
        if (i2 == 2)
        {
          if (paramInt1 == 0)
          {
            localConstraintWidget1.setFinalHorizontal(k, localConstraintWidget1.getWidth() + k);
            localConstraintWidget2.setFinalHorizontal(m - localConstraintWidget2.getWidth(), m);
            horizontalSolvingPass(1, localConstraintWidget1, paramConstraintWidgetContainer.getMeasurer(), paramBoolean3);
            horizontalSolvingPass(1, localConstraintWidget2, paramConstraintWidgetContainer.getMeasurer(), paramBoolean3);
          }
          else
          {
            localConstraintWidget1.setFinalVertical(k, localConstraintWidget1.getHeight() + k);
            localConstraintWidget2.setFinalVertical(m - localConstraintWidget2.getHeight(), m);
            verticalSolvingPass(1, localConstraintWidget1, paramConstraintWidgetContainer.getMeasurer());
            verticalSolvingPass(1, localConstraintWidget2, paramConstraintWidgetContainer.getMeasurer());
          }
          return true;
        }
        return false;
      }
      return true;
    }
    return false;
  }
  
  private static void solveHorizontalCenterConstraints(int paramInt, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget, boolean paramBoolean)
  {
    float f = paramConstraintWidget.getHorizontalBiasPercent();
    int i = mLeft.mTarget.getFinalValue();
    int j = mRight.mTarget.getFinalValue();
    int k = mLeft.getMargin();
    int m = mRight.getMargin();
    if (i == j)
    {
      f = 0.5F;
    }
    else
    {
      i = k + i;
      j -= m;
    }
    k = paramConstraintWidget.getWidth();
    m = j - i - k;
    if (i > j) {
      m = i - j - k;
    }
    if (m > 0) {
      f = f * m + 0.5F;
    } else {
      f *= m;
    }
    int n = (int)f + i;
    m = n + k;
    if (i > j) {
      m = n - k;
    }
    paramConstraintWidget.setFinalHorizontal(n, m);
    horizontalSolvingPass(paramInt + 1, paramConstraintWidget, paramMeasurer, paramBoolean);
  }
  
  private static void solveHorizontalMatchConstraint(int paramInt, ConstraintWidget paramConstraintWidget1, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget2, boolean paramBoolean)
  {
    float f = paramConstraintWidget2.getHorizontalBiasPercent();
    int i = mLeft.mTarget.getFinalValue();
    int j = mLeft.getMargin() + i;
    int k = mRight.mTarget.getFinalValue() - mRight.getMargin();
    if (k >= j)
    {
      int m = paramConstraintWidget2.getWidth();
      i = m;
      if (paramConstraintWidget2.getVisibility() != 8)
      {
        int n = mMatchConstraintDefaultWidth;
        if (n == 2)
        {
          if ((paramConstraintWidget1 instanceof ConstraintWidgetContainer)) {
            i = paramConstraintWidget1.getWidth();
          } else {
            i = paramConstraintWidget1.getParent().getWidth();
          }
          i = (int)(paramConstraintWidget2.getHorizontalBiasPercent() * 0.5F * i);
        }
        else
        {
          i = m;
          if (n == 0) {
            i = k - j;
          }
        }
        m = Math.max(mMatchConstraintMinWidth, i);
        n = mMatchConstraintMaxWidth;
        i = m;
        if (n > 0) {
          i = Math.min(n, m);
        }
      }
      m = j + (int)(f * (k - j - i) + 0.5F);
      paramConstraintWidget2.setFinalHorizontal(m, i + m);
      horizontalSolvingPass(paramInt + 1, paramConstraintWidget2, paramMeasurer, paramBoolean);
    }
  }
  
  private static void solveVerticalCenterConstraints(int paramInt, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget)
  {
    float f = paramConstraintWidget.getVerticalBiasPercent();
    int i = mTop.mTarget.getFinalValue();
    int j = mBottom.mTarget.getFinalValue();
    int k = mTop.getMargin();
    int m = mBottom.getMargin();
    if (i == j)
    {
      f = 0.5F;
    }
    else
    {
      i = k + i;
      j -= m;
    }
    int n = paramConstraintWidget.getHeight();
    m = j - i - n;
    if (i > j) {
      m = i - j - n;
    }
    if (m > 0) {
      f = f * m + 0.5F;
    } else {
      f *= m;
    }
    int i1 = (int)f;
    k = i + i1;
    m = k + n;
    if (i > j)
    {
      k = i - i1;
      m = k - n;
    }
    paramConstraintWidget.setFinalVertical(k, m);
    verticalSolvingPass(paramInt + 1, paramConstraintWidget, paramMeasurer);
  }
  
  private static void solveVerticalMatchConstraint(int paramInt, ConstraintWidget paramConstraintWidget1, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget2)
  {
    float f = paramConstraintWidget2.getVerticalBiasPercent();
    int i = mTop.mTarget.getFinalValue();
    int j = mTop.getMargin() + i;
    int k = mBottom.mTarget.getFinalValue() - mBottom.getMargin();
    if (k >= j)
    {
      int m = paramConstraintWidget2.getHeight();
      i = m;
      if (paramConstraintWidget2.getVisibility() != 8)
      {
        int n = mMatchConstraintDefaultHeight;
        if (n == 2)
        {
          if ((paramConstraintWidget1 instanceof ConstraintWidgetContainer)) {
            i = paramConstraintWidget1.getHeight();
          } else {
            i = paramConstraintWidget1.getParent().getHeight();
          }
          i = (int)(f * 0.5F * i);
        }
        else
        {
          i = m;
          if (n == 0) {
            i = k - j;
          }
        }
        m = Math.max(mMatchConstraintMinHeight, i);
        n = mMatchConstraintMaxHeight;
        i = m;
        if (n > 0) {
          i = Math.min(n, m);
        }
      }
      m = j + (int)(f * (k - j - i) + 0.5F);
      paramConstraintWidget2.setFinalVertical(m, i + m);
      verticalSolvingPass(paramInt + 1, paramConstraintWidget2, paramMeasurer);
    }
  }
  
  public static void solvingPass(ConstraintWidgetContainer paramConstraintWidgetContainer, BasicMeasure.Measurer paramMeasurer)
  {
    Object localObject1 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
    Object localObject2 = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
    hcount = 0;
    vcount = 0;
    paramConstraintWidgetContainer.resetFinalResolution();
    ArrayList localArrayList = paramConstraintWidgetContainer.getChildren();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      ((ConstraintWidget)localArrayList.get(j)).resetFinalResolution();
    }
    boolean bool = paramConstraintWidgetContainer.isRtl();
    if (localObject1 == ConstraintWidget.DimensionBehaviour.FIXED) {
      paramConstraintWidgetContainer.setFinalHorizontal(0, paramConstraintWidgetContainer.getWidth());
    } else {
      paramConstraintWidgetContainer.setFinalLeft(0);
    }
    int k = 0;
    j = k;
    int m = j;
    int n = j;
    j = k;
    int i1;
    while (j < i)
    {
      localObject1 = (ConstraintWidget)localArrayList.get(j);
      if ((localObject1 instanceof Guideline))
      {
        localObject1 = (Guideline)localObject1;
        k = n;
        i1 = m;
        if (((Guideline)localObject1).getOrientation() == 1)
        {
          if (((Guideline)localObject1).getRelativeBegin() != -1) {
            ((Guideline)localObject1).setFinalValue(((Guideline)localObject1).getRelativeBegin());
          } else if ((((Guideline)localObject1).getRelativeEnd() != -1) && (paramConstraintWidgetContainer.isResolvedHorizontally())) {
            ((Guideline)localObject1).setFinalValue(paramConstraintWidgetContainer.getWidth() - ((Guideline)localObject1).getRelativeEnd());
          } else if (paramConstraintWidgetContainer.isResolvedHorizontally()) {
            ((Guideline)localObject1).setFinalValue((int)(((Guideline)localObject1).getRelativePercent() * paramConstraintWidgetContainer.getWidth() + 0.5F));
          }
          k = 1;
          i1 = m;
        }
      }
      else
      {
        k = n;
        i1 = m;
        if ((localObject1 instanceof Barrier))
        {
          k = n;
          i1 = m;
          if (((Barrier)localObject1).getOrientation() == 0)
          {
            i1 = 1;
            k = n;
          }
        }
      }
      j++;
      n = k;
      m = i1;
    }
    if (n != 0) {
      for (j = 0; j < i; j++)
      {
        localObject1 = (ConstraintWidget)localArrayList.get(j);
        if ((localObject1 instanceof Guideline))
        {
          localObject1 = (Guideline)localObject1;
          if (((Guideline)localObject1).getOrientation() == 1) {
            horizontalSolvingPass(0, (ConstraintWidget)localObject1, paramMeasurer, bool);
          }
        }
      }
    }
    horizontalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer, bool);
    if (m != 0) {
      for (j = 0; j < i; j++)
      {
        localObject1 = (ConstraintWidget)localArrayList.get(j);
        if ((localObject1 instanceof Barrier))
        {
          localObject1 = (Barrier)localObject1;
          if (((Barrier)localObject1).getOrientation() == 0) {
            solveBarrier(0, (Barrier)localObject1, paramMeasurer, 0, bool);
          }
        }
      }
    }
    if (localObject2 == ConstraintWidget.DimensionBehaviour.FIXED) {
      paramConstraintWidgetContainer.setFinalVertical(0, paramConstraintWidgetContainer.getHeight());
    } else {
      paramConstraintWidgetContainer.setFinalTop(0);
    }
    n = 0;
    j = n;
    for (m = j; n < i; m = k)
    {
      localObject2 = (ConstraintWidget)localArrayList.get(n);
      if ((localObject2 instanceof Guideline))
      {
        localObject2 = (Guideline)localObject2;
        i1 = j;
        k = m;
        if (((Guideline)localObject2).getOrientation() == 0)
        {
          if (((Guideline)localObject2).getRelativeBegin() != -1) {
            ((Guideline)localObject2).setFinalValue(((Guideline)localObject2).getRelativeBegin());
          } else if ((((Guideline)localObject2).getRelativeEnd() != -1) && (paramConstraintWidgetContainer.isResolvedVertically())) {
            ((Guideline)localObject2).setFinalValue(paramConstraintWidgetContainer.getHeight() - ((Guideline)localObject2).getRelativeEnd());
          } else if (paramConstraintWidgetContainer.isResolvedVertically()) {
            ((Guideline)localObject2).setFinalValue((int)(((Guideline)localObject2).getRelativePercent() * paramConstraintWidgetContainer.getHeight() + 0.5F));
          }
          i1 = 1;
          k = m;
        }
      }
      else
      {
        i1 = j;
        k = m;
        if ((localObject2 instanceof Barrier))
        {
          i1 = j;
          k = m;
          if (((Barrier)localObject2).getOrientation() == 1)
          {
            k = 1;
            i1 = j;
          }
        }
      }
      n++;
      j = i1;
    }
    if (j != 0) {
      for (j = 0; j < i; j++)
      {
        localObject2 = (ConstraintWidget)localArrayList.get(j);
        if ((localObject2 instanceof Guideline))
        {
          localObject2 = (Guideline)localObject2;
          if (((Guideline)localObject2).getOrientation() == 0) {
            verticalSolvingPass(1, (ConstraintWidget)localObject2, paramMeasurer);
          }
        }
      }
    }
    verticalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer);
    if (m != 0) {
      for (j = 0; j < i; j++)
      {
        paramConstraintWidgetContainer = (ConstraintWidget)localArrayList.get(j);
        if ((paramConstraintWidgetContainer instanceof Barrier))
        {
          paramConstraintWidgetContainer = (Barrier)paramConstraintWidgetContainer;
          if (paramConstraintWidgetContainer.getOrientation() == 1) {
            solveBarrier(0, paramConstraintWidgetContainer, paramMeasurer, 1, bool);
          }
        }
      }
    }
    for (j = 0; j < i; j++)
    {
      paramConstraintWidgetContainer = (ConstraintWidget)localArrayList.get(j);
      if ((paramConstraintWidgetContainer.isMeasureRequested()) && (canMeasure(0, paramConstraintWidgetContainer)))
      {
        ConstraintWidgetContainer.measure(0, paramConstraintWidgetContainer, paramMeasurer, measure, BasicMeasure.Measure.SELF_DIMENSIONS);
        if ((paramConstraintWidgetContainer instanceof Guideline))
        {
          if (((Guideline)paramConstraintWidgetContainer).getOrientation() == 0) {
            verticalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer);
          } else {
            horizontalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer, bool);
          }
        }
        else
        {
          horizontalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer, bool);
          verticalSolvingPass(0, paramConstraintWidgetContainer, paramMeasurer);
        }
      }
    }
  }
  
  private static void verticalSolvingPass(int paramInt, ConstraintWidget paramConstraintWidget, BasicMeasure.Measurer paramMeasurer)
  {
    if (paramConstraintWidget.isVerticalSolvingPassDone()) {
      return;
    }
    vcount += 1;
    int i;
    if ((!(paramConstraintWidget instanceof ConstraintWidgetContainer)) && (paramConstraintWidget.isMeasureRequested()))
    {
      i = paramInt + 1;
      if (canMeasure(i, paramConstraintWidget)) {
        ConstraintWidgetContainer.measure(i, paramConstraintWidget, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
      }
    }
    Object localObject1 = paramConstraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
    Object localObject2 = paramConstraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM);
    int j = ((ConstraintAnchor)localObject1).getFinalValue();
    int k = ((ConstraintAnchor)localObject2).getFinalValue();
    ConstraintAnchor localConstraintAnchor;
    Object localObject3;
    int m;
    boolean bool;
    Object localObject4;
    if ((((ConstraintAnchor)localObject1).getDependents() != null) && (((ConstraintAnchor)localObject1).hasFinalValue()))
    {
      localObject1 = ((ConstraintAnchor)localObject1).getDependents().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject1).next();
        localObject3 = mOwner;
        m = paramInt + 1;
        bool = canMeasure(m, (ConstraintWidget)localObject3);
        if ((((ConstraintWidget)localObject3).isMeasureRequested()) && (bool)) {
          ConstraintWidgetContainer.measure(m, (ConstraintWidget)localObject3, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        if (localConstraintAnchor == mTop)
        {
          localObject4 = mBottom.mTarget;
          if ((localObject4 != null) && (((ConstraintAnchor)localObject4).hasFinalValue())) {}
        }
        else
        {
          if (localConstraintAnchor != mBottom) {
            break label263;
          }
          localObject4 = mTop.mTarget;
          if ((localObject4 == null) || (!((ConstraintAnchor)localObject4).hasFinalValue())) {
            break label263;
          }
        }
        i = 1;
        break label265;
        label263:
        i = 0;
        label265:
        localObject4 = ((ConstraintWidget)localObject3).getVerticalDimensionBehaviour();
        Object localObject5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject4 == localObject5) && (!bool))
        {
          if ((((ConstraintWidget)localObject3).getVerticalDimensionBehaviour() == localObject5) && (mMatchConstraintMaxHeight >= 0) && (mMatchConstraintMinHeight >= 0) && ((((ConstraintWidget)localObject3).getVisibility() == 8) || ((mMatchConstraintDefaultHeight == 0) && (((ConstraintWidget)localObject3).getDimensionRatio() == 0.0F))) && (!((ConstraintWidget)localObject3).isInVerticalChain()) && (!((ConstraintWidget)localObject3).isInVirtualLayout()) && (i != 0) && (!((ConstraintWidget)localObject3).isInVerticalChain())) {
            solveVerticalMatchConstraint(m, paramConstraintWidget, paramMeasurer, (ConstraintWidget)localObject3);
          }
        }
        else if (!((ConstraintWidget)localObject3).isMeasureRequested())
        {
          localObject5 = mTop;
          if ((localConstraintAnchor == localObject5) && (mBottom.mTarget == null))
          {
            i = ((ConstraintAnchor)localObject5).getMargin() + j;
            ((ConstraintWidget)localObject3).setFinalVertical(i, ((ConstraintWidget)localObject3).getHeight() + i);
            verticalSolvingPass(m, (ConstraintWidget)localObject3, paramMeasurer);
          }
          else
          {
            localObject4 = mBottom;
            if ((localConstraintAnchor == localObject4) && (mTarget == null))
            {
              i = j - ((ConstraintAnchor)localObject4).getMargin();
              ((ConstraintWidget)localObject3).setFinalVertical(i - ((ConstraintWidget)localObject3).getHeight(), i);
              verticalSolvingPass(m, (ConstraintWidget)localObject3, paramMeasurer);
            }
            else if ((i != 0) && (!((ConstraintWidget)localObject3).isInVerticalChain()))
            {
              solveVerticalCenterConstraints(m, paramMeasurer, (ConstraintWidget)localObject3);
            }
          }
        }
      }
    }
    if ((paramConstraintWidget instanceof Guideline)) {
      return;
    }
    if ((((ConstraintAnchor)localObject2).getDependents() != null) && (((ConstraintAnchor)localObject2).hasFinalValue()))
    {
      localObject2 = ((ConstraintAnchor)localObject2).getDependents().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject2).next();
        localObject1 = mOwner;
        m = paramInt + 1;
        bool = canMeasure(m, (ConstraintWidget)localObject1);
        if ((((ConstraintWidget)localObject1).isMeasureRequested()) && (bool)) {
          ConstraintWidgetContainer.measure(m, (ConstraintWidget)localObject1, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        if (localConstraintAnchor == mTop)
        {
          localObject3 = mBottom.mTarget;
          if ((localObject3 != null) && (((ConstraintAnchor)localObject3).hasFinalValue())) {}
        }
        else
        {
          if (localConstraintAnchor != mBottom) {
            break label713;
          }
          localObject3 = mTop.mTarget;
          if ((localObject3 == null) || (!((ConstraintAnchor)localObject3).hasFinalValue())) {
            break label713;
          }
        }
        i = 1;
        break label715;
        label713:
        i = 0;
        label715:
        localObject4 = ((ConstraintWidget)localObject1).getVerticalDimensionBehaviour();
        localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if ((localObject4 == localObject3) && (!bool))
        {
          if ((((ConstraintWidget)localObject1).getVerticalDimensionBehaviour() == localObject3) && (mMatchConstraintMaxHeight >= 0) && (mMatchConstraintMinHeight >= 0) && ((((ConstraintWidget)localObject1).getVisibility() == 8) || ((mMatchConstraintDefaultHeight == 0) && (((ConstraintWidget)localObject1).getDimensionRatio() == 0.0F))) && (!((ConstraintWidget)localObject1).isInVerticalChain()) && (!((ConstraintWidget)localObject1).isInVirtualLayout()) && (i != 0) && (!((ConstraintWidget)localObject1).isInVerticalChain())) {
            solveVerticalMatchConstraint(m, paramConstraintWidget, paramMeasurer, (ConstraintWidget)localObject1);
          }
        }
        else if (!((ConstraintWidget)localObject1).isMeasureRequested())
        {
          localObject3 = mTop;
          if ((localConstraintAnchor == localObject3) && (mBottom.mTarget == null))
          {
            i = ((ConstraintAnchor)localObject3).getMargin() + k;
            ((ConstraintWidget)localObject1).setFinalVertical(i, ((ConstraintWidget)localObject1).getHeight() + i);
            verticalSolvingPass(m, (ConstraintWidget)localObject1, paramMeasurer);
          }
          else
          {
            localObject4 = mBottom;
            if ((localConstraintAnchor == localObject4) && (mTarget == null))
            {
              i = k - ((ConstraintAnchor)localObject4).getMargin();
              ((ConstraintWidget)localObject1).setFinalVertical(i - ((ConstraintWidget)localObject1).getHeight(), i);
              verticalSolvingPass(m, (ConstraintWidget)localObject1, paramMeasurer);
            }
            else if ((i != 0) && (!((ConstraintWidget)localObject1).isInVerticalChain()))
            {
              solveVerticalCenterConstraints(m, paramMeasurer, (ConstraintWidget)localObject1);
            }
          }
        }
      }
    }
    localObject2 = paramConstraintWidget.getAnchor(ConstraintAnchor.Type.BASELINE);
    if ((((ConstraintAnchor)localObject2).getDependents() != null) && (((ConstraintAnchor)localObject2).hasFinalValue()))
    {
      k = ((ConstraintAnchor)localObject2).getFinalValue();
      localObject1 = ((ConstraintAnchor)localObject2).getDependents().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject1).next();
        localObject2 = mOwner;
        i = paramInt + 1;
        bool = canMeasure(i, (ConstraintWidget)localObject2);
        if ((((ConstraintWidget)localObject2).isMeasureRequested()) && (bool)) {
          ConstraintWidgetContainer.measure(i, (ConstraintWidget)localObject2, paramMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
        }
        if (((((ConstraintWidget)localObject2).getVerticalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (bool)) && (!((ConstraintWidget)localObject2).isMeasureRequested()) && (localConstraintAnchor == mBaseline))
        {
          ((ConstraintWidget)localObject2).setFinalBaseline(localConstraintAnchor.getMargin() + k);
          verticalSolvingPass(i, (ConstraintWidget)localObject2, paramMeasurer);
        }
      }
    }
    paramConstraintWidget.markVerticalSolvingPassDone();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.Direct
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */