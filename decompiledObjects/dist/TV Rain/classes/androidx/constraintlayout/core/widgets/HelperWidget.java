package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HelperWidget
  extends ConstraintWidget
  implements Helper
{
  public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
  public int mWidgetsCount = 0;
  
  public void add(ConstraintWidget paramConstraintWidget)
  {
    if ((paramConstraintWidget != this) && (paramConstraintWidget != null))
    {
      int i = mWidgetsCount;
      ConstraintWidget[] arrayOfConstraintWidget = mWidgets;
      if (i + 1 > arrayOfConstraintWidget.length) {
        mWidgets = ((ConstraintWidget[])Arrays.copyOf(arrayOfConstraintWidget, arrayOfConstraintWidget.length * 2));
      }
      arrayOfConstraintWidget = mWidgets;
      i = mWidgetsCount;
      arrayOfConstraintWidget[i] = paramConstraintWidget;
      mWidgetsCount = (i + 1);
    }
  }
  
  public void addDependents(ArrayList<WidgetGroup> paramArrayList, int paramInt, WidgetGroup paramWidgetGroup)
  {
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= mWidgetsCount) {
        break;
      }
      paramWidgetGroup.add(mWidgets[j]);
    }
    while (k < mWidgetsCount)
    {
      Grouping.findDependents(mWidgets[k], paramInt, paramArrayList, paramWidgetGroup);
      k++;
    }
  }
  
  public void copy(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    super.copy(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (HelperWidget)paramConstraintWidget;
    int i = 0;
    mWidgetsCount = 0;
    int j = mWidgetsCount;
    while (i < j)
    {
      add((ConstraintWidget)paramHashMap.get(mWidgets[i]));
      i++;
    }
  }
  
  public int findGroupInDependents(int paramInt)
  {
    for (int i = 0; i < mWidgetsCount; i++)
    {
      ConstraintWidget localConstraintWidget = mWidgets[i];
      int j;
      if (paramInt == 0)
      {
        j = horizontalGroup;
        if (j != -1) {
          return j;
        }
      }
      if (paramInt == 1)
      {
        j = verticalGroup;
        if (j != -1) {
          return j;
        }
      }
    }
    return -1;
  }
  
  public void removeAllIds()
  {
    mWidgetsCount = 0;
    Arrays.fill(mWidgets, null);
  }
  
  public void updateConstraints(ConstraintWidgetContainer paramConstraintWidgetContainer) {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.HelperWidget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */