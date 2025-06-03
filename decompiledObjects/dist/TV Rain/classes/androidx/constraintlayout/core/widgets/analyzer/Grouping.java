package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Grouping
{
  private static final boolean DEBUG = false;
  private static final boolean DEBUG_GROUPING = false;
  
  public static WidgetGroup findDependents(ConstraintWidget paramConstraintWidget, int paramInt, ArrayList<WidgetGroup> paramArrayList, WidgetGroup paramWidgetGroup)
  {
    int i;
    if (paramInt == 0) {
      i = horizontalGroup;
    } else {
      i = verticalGroup;
    }
    int j = 0;
    int k;
    if ((i != -1) && ((paramWidgetGroup == null) || (i != id))) {
      for (k = 0;; k++)
      {
        localObject = paramWidgetGroup;
        if (k >= paramArrayList.size()) {
          break;
        }
        localObject = (WidgetGroup)paramArrayList.get(k);
        if (((WidgetGroup)localObject).getId() == i)
        {
          if (paramWidgetGroup != null)
          {
            paramWidgetGroup.moveTo(paramInt, (WidgetGroup)localObject);
            paramArrayList.remove(paramWidgetGroup);
          }
          break;
        }
      }
    }
    Object localObject = paramWidgetGroup;
    if (i != -1) {
      return paramWidgetGroup;
    }
    paramWidgetGroup = (WidgetGroup)localObject;
    if (localObject == null)
    {
      paramWidgetGroup = (WidgetGroup)localObject;
      if ((paramConstraintWidget instanceof HelperWidget))
      {
        k = ((HelperWidget)paramConstraintWidget).findGroupInDependents(paramInt);
        paramWidgetGroup = (WidgetGroup)localObject;
        if (k != -1) {
          for (i = 0;; i++)
          {
            paramWidgetGroup = (WidgetGroup)localObject;
            if (i >= paramArrayList.size()) {
              break;
            }
            paramWidgetGroup = (WidgetGroup)paramArrayList.get(i);
            if (paramWidgetGroup.getId() == k) {
              break;
            }
          }
        }
      }
      localObject = paramWidgetGroup;
      if (paramWidgetGroup == null) {
        localObject = new WidgetGroup(paramInt);
      }
      paramArrayList.add(localObject);
      paramWidgetGroup = (WidgetGroup)localObject;
    }
    if (paramWidgetGroup.add(paramConstraintWidget))
    {
      if ((paramConstraintWidget instanceof Guideline))
      {
        Guideline localGuideline = (Guideline)paramConstraintWidget;
        localObject = localGuideline.getAnchor();
        i = j;
        if (localGuideline.getOrientation() == 0) {
          i = 1;
        }
        ((ConstraintAnchor)localObject).findDependents(i, paramArrayList, paramWidgetGroup);
      }
      if (paramInt == 0)
      {
        horizontalGroup = paramWidgetGroup.getId();
        mLeft.findDependents(paramInt, paramArrayList, paramWidgetGroup);
        mRight.findDependents(paramInt, paramArrayList, paramWidgetGroup);
      }
      else
      {
        verticalGroup = paramWidgetGroup.getId();
        mTop.findDependents(paramInt, paramArrayList, paramWidgetGroup);
        mBaseline.findDependents(paramInt, paramArrayList, paramWidgetGroup);
        mBottom.findDependents(paramInt, paramArrayList, paramWidgetGroup);
      }
      mCenter.findDependents(paramInt, paramArrayList, paramWidgetGroup);
    }
    return paramWidgetGroup;
  }
  
  private static WidgetGroup findGroup(ArrayList<WidgetGroup> paramArrayList, int paramInt)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      WidgetGroup localWidgetGroup = (WidgetGroup)paramArrayList.get(j);
      if (paramInt == id) {
        return localWidgetGroup;
      }
    }
    return null;
  }
  
  public static boolean simpleSolvingPass(ConstraintWidgetContainer paramConstraintWidgetContainer, BasicMeasure.Measurer paramMeasurer)
  {
    ArrayList localArrayList = paramConstraintWidgetContainer.getChildren();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
    {
      localObject1 = (ConstraintWidget)localArrayList.get(j);
      if (!validInGroup(paramConstraintWidgetContainer.getHorizontalDimensionBehaviour(), paramConstraintWidgetContainer.getVerticalDimensionBehaviour(), ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour(), ((ConstraintWidget)localObject1).getVerticalDimensionBehaviour())) {
        return false;
      }
      if ((localObject1 instanceof Flow)) {
        return false;
      }
    }
    Object localObject1 = mMetrics;
    if (localObject1 != null) {
      grouping += 1L;
    }
    j = 0;
    Object localObject2 = null;
    localObject1 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    boolean bool;
    Object localObject11;
    for (Object localObject6 = null; j < i; localObject6 = localObject11)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localArrayList.get(j);
      if (!validInGroup(paramConstraintWidgetContainer.getHorizontalDimensionBehaviour(), paramConstraintWidgetContainer.getVerticalDimensionBehaviour(), localConstraintWidget.getHorizontalDimensionBehaviour(), localConstraintWidget.getVerticalDimensionBehaviour())) {
        ConstraintWidgetContainer.measure(0, localConstraintWidget, paramMeasurer, mMeasure, BasicMeasure.Measure.SELF_DIMENSIONS);
      }
      bool = localConstraintWidget instanceof Guideline;
      Object localObject7 = localObject2;
      Object localObject8 = localObject3;
      if (bool)
      {
        localObject9 = (Guideline)localConstraintWidget;
        localObject10 = localObject3;
        if (((Guideline)localObject9).getOrientation() == 0)
        {
          localObject10 = localObject3;
          if (localObject3 == null) {
            localObject10 = new ArrayList();
          }
          ((ArrayList)localObject10).add(localObject9);
        }
        localObject7 = localObject2;
        localObject8 = localObject10;
        if (((Guideline)localObject9).getOrientation() == 1)
        {
          localObject3 = localObject2;
          if (localObject2 == null) {
            localObject3 = new ArrayList();
          }
          ((ArrayList)localObject3).add(localObject9);
          localObject8 = localObject10;
          localObject7 = localObject3;
        }
      }
      localObject3 = localObject1;
      localObject10 = localObject4;
      if ((localConstraintWidget instanceof HelperWidget)) {
        if ((localConstraintWidget instanceof Barrier))
        {
          localObject9 = (Barrier)localConstraintWidget;
          localObject2 = localObject1;
          if (((Barrier)localObject9).getOrientation() == 0)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localObject9);
          }
          localObject3 = localObject2;
          localObject10 = localObject4;
          if (((Barrier)localObject9).getOrientation() == 1)
          {
            localObject10 = localObject4;
            if (localObject4 == null) {
              localObject10 = new ArrayList();
            }
            ((ArrayList)localObject10).add(localObject9);
            localObject3 = localObject2;
          }
        }
        else
        {
          localObject2 = (HelperWidget)localConstraintWidget;
          localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = new ArrayList();
          }
          ((ArrayList)localObject3).add(localObject2);
          localObject10 = localObject4;
          if (localObject4 == null) {
            localObject10 = new ArrayList();
          }
          ((ArrayList)localObject10).add(localObject2);
        }
      }
      Object localObject9 = localObject5;
      if (mLeft.mTarget == null)
      {
        localObject9 = localObject5;
        if (mRight.mTarget == null)
        {
          localObject9 = localObject5;
          if (!bool)
          {
            localObject9 = localObject5;
            if (!(localConstraintWidget instanceof Barrier))
            {
              localObject1 = localObject5;
              if (localObject5 == null) {
                localObject1 = new ArrayList();
              }
              ((ArrayList)localObject1).add(localConstraintWidget);
              localObject9 = localObject1;
            }
          }
        }
      }
      localObject11 = localObject6;
      if (mTop.mTarget == null)
      {
        localObject11 = localObject6;
        if (mBottom.mTarget == null)
        {
          localObject11 = localObject6;
          if (mBaseline.mTarget == null)
          {
            localObject11 = localObject6;
            if (!bool)
            {
              localObject11 = localObject6;
              if (!(localConstraintWidget instanceof Barrier))
              {
                localObject1 = localObject6;
                if (localObject6 == null) {
                  localObject1 = new ArrayList();
                }
                ((ArrayList)localObject1).add(localConstraintWidget);
                localObject11 = localObject1;
              }
            }
          }
        }
      }
      j++;
      localObject2 = localObject7;
      localObject1 = localObject3;
      localObject3 = localObject8;
      localObject4 = localObject10;
      localObject5 = localObject9;
    }
    Object localObject10 = new ArrayList();
    if (localObject2 != null)
    {
      paramMeasurer = ((ArrayList)localObject2).iterator();
      while (paramMeasurer.hasNext()) {
        findDependents((Guideline)paramMeasurer.next(), 0, (ArrayList)localObject10, null);
      }
    }
    if (localObject1 != null)
    {
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (HelperWidget)((Iterator)localObject1).next();
        paramMeasurer = findDependents((ConstraintWidget)localObject2, 0, (ArrayList)localObject10, null);
        ((HelperWidget)localObject2).addDependents((ArrayList)localObject10, 0, paramMeasurer);
        paramMeasurer.cleanup((ArrayList)localObject10);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.LEFT);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 0, (ArrayList)localObject10, null);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.RIGHT);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 0, (ArrayList)localObject10, null);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.CENTER);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 0, (ArrayList)localObject10, null);
      }
    }
    if (localObject5 != null)
    {
      paramMeasurer = ((ArrayList)localObject5).iterator();
      while (paramMeasurer.hasNext()) {
        findDependents((ConstraintWidget)paramMeasurer.next(), 0, (ArrayList)localObject10, null);
      }
    }
    if (localObject3 != null)
    {
      paramMeasurer = ((ArrayList)localObject3).iterator();
      while (paramMeasurer.hasNext()) {
        findDependents((Guideline)paramMeasurer.next(), 1, (ArrayList)localObject10, null);
      }
    }
    if (localObject4 != null)
    {
      localObject1 = ((ArrayList)localObject4).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramMeasurer = (HelperWidget)((Iterator)localObject1).next();
        localObject4 = findDependents(paramMeasurer, 1, (ArrayList)localObject10, null);
        paramMeasurer.addDependents((ArrayList)localObject10, 1, (WidgetGroup)localObject4);
        ((WidgetGroup)localObject4).cleanup((ArrayList)localObject10);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.TOP);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 1, (ArrayList)localObject10, null);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BASELINE);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 1, (ArrayList)localObject10, null);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BOTTOM);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 1, (ArrayList)localObject10, null);
      }
    }
    paramMeasurer = paramConstraintWidgetContainer.getAnchor(ConstraintAnchor.Type.CENTER);
    if (paramMeasurer.getDependents() != null)
    {
      paramMeasurer = paramMeasurer.getDependents().iterator();
      while (paramMeasurer.hasNext()) {
        findDependents(nextmOwner, 1, (ArrayList)localObject10, null);
      }
    }
    if (localObject6 != null)
    {
      paramMeasurer = ((ArrayList)localObject6).iterator();
      while (paramMeasurer.hasNext()) {
        findDependents((ConstraintWidget)paramMeasurer.next(), 1, (ArrayList)localObject10, null);
      }
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = (ConstraintWidget)localArrayList.get(j);
      if (((ConstraintWidget)localObject1).oppositeDimensionsTied())
      {
        paramMeasurer = findGroup((ArrayList)localObject10, horizontalGroup);
        localObject1 = findGroup((ArrayList)localObject10, verticalGroup);
        if ((paramMeasurer != null) && (localObject1 != null))
        {
          paramMeasurer.moveTo(0, (WidgetGroup)localObject1);
          ((WidgetGroup)localObject1).setOrientation(2);
          ((ArrayList)localObject10).remove(paramMeasurer);
        }
      }
    }
    if (((ArrayList)localObject10).size() <= 1) {
      return false;
    }
    if (paramConstraintWidgetContainer.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
    {
      localObject4 = ((ArrayList)localObject10).iterator();
      paramMeasurer = null;
      j = 0;
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = (WidgetGroup)((Iterator)localObject4).next();
        if (((WidgetGroup)localObject1).getOrientation() != 1)
        {
          ((WidgetGroup)localObject1).setAuthoritative(false);
          i = ((WidgetGroup)localObject1).measureWrap(paramConstraintWidgetContainer.getSystem(), 0);
          if (i > j)
          {
            paramMeasurer = (BasicMeasure.Measurer)localObject1;
            j = i;
          }
        }
      }
      if (paramMeasurer != null)
      {
        paramConstraintWidgetContainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        paramConstraintWidgetContainer.setWidth(j);
        paramMeasurer.setAuthoritative(true);
        localObject1 = paramMeasurer;
        break label1570;
      }
    }
    localObject1 = null;
    label1570:
    if (paramConstraintWidgetContainer.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
    {
      localObject3 = ((ArrayList)localObject10).iterator();
      paramMeasurer = null;
      j = 0;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (WidgetGroup)((Iterator)localObject3).next();
        if (((WidgetGroup)localObject4).getOrientation() != 0)
        {
          ((WidgetGroup)localObject4).setAuthoritative(false);
          i = ((WidgetGroup)localObject4).measureWrap(paramConstraintWidgetContainer.getSystem(), 1);
          if (i > j)
          {
            paramMeasurer = (BasicMeasure.Measurer)localObject4;
            j = i;
          }
        }
      }
      if (paramMeasurer != null)
      {
        paramConstraintWidgetContainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        paramConstraintWidgetContainer.setHeight(j);
        paramMeasurer.setAuthoritative(true);
        break label1684;
      }
    }
    paramMeasurer = null;
    label1684:
    if ((localObject1 == null) && (paramMeasurer == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean validInGroup(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour3, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour4)
  {
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.FIXED;
    if (paramDimensionBehaviour3 != localDimensionBehaviour1)
    {
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      if ((paramDimensionBehaviour3 != localDimensionBehaviour2) && ((paramDimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) || (paramDimensionBehaviour1 == localDimensionBehaviour2)))
      {
        i = 0;
        break label47;
      }
    }
    int i = 1;
    label47:
    if (paramDimensionBehaviour4 != localDimensionBehaviour1)
    {
      paramDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      if ((paramDimensionBehaviour4 != paramDimensionBehaviour1) && ((paramDimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) || (paramDimensionBehaviour2 == paramDimensionBehaviour1)))
      {
        j = 0;
        break label86;
      }
    }
    int j = 1;
    label86:
    return (i != 0) || (j != 0);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.Grouping
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */