package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z2;

public class WidgetGroup
{
  private static final boolean DEBUG = false;
  public static int count;
  public boolean authoritative = false;
  public int id;
  private int moveTo = -1;
  public int orientation;
  public ArrayList<MeasureResult> results = null;
  public ArrayList<ConstraintWidget> widgets = new ArrayList();
  
  public WidgetGroup(int paramInt)
  {
    int i = count;
    count = i + 1;
    id = i;
    orientation = paramInt;
  }
  
  private boolean contains(ConstraintWidget paramConstraintWidget)
  {
    return widgets.contains(paramConstraintWidget);
  }
  
  private String getOrientationString()
  {
    int i = orientation;
    if (i == 0) {
      return "Horizontal";
    }
    if (i == 1) {
      return "Vertical";
    }
    if (i == 2) {
      return "Both";
    }
    return "Unknown";
  }
  
  private int measureWrap(int paramInt, ConstraintWidget paramConstraintWidget)
  {
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = paramConstraintWidget.getDimensionBehaviour(paramInt);
    if ((localDimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (localDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) && (localDimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED)) {
      return -1;
    }
    if (paramInt == 0) {
      paramInt = paramConstraintWidget.getWidth();
    } else {
      paramInt = paramConstraintWidget.getHeight();
    }
    return paramInt;
  }
  
  private int solverMeasure(LinearSystem paramLinearSystem, ArrayList<ConstraintWidget> paramArrayList, int paramInt)
  {
    int i = 0;
    ConstraintWidgetContainer localConstraintWidgetContainer = (ConstraintWidgetContainer)((ConstraintWidget)paramArrayList.get(0)).getParent();
    paramLinearSystem.reset();
    localConstraintWidgetContainer.addToSolver(paramLinearSystem, false);
    for (int j = 0; j < paramArrayList.size(); j++) {
      ((ConstraintWidget)paramArrayList.get(j)).addToSolver(paramLinearSystem, false);
    }
    if ((paramInt == 0) && (mHorizontalChainsSize > 0)) {
      Chain.applyChainConstraints(localConstraintWidgetContainer, paramLinearSystem, paramArrayList, 0);
    }
    if ((paramInt == 1) && (mVerticalChainsSize > 0)) {
      Chain.applyChainConstraints(localConstraintWidgetContainer, paramLinearSystem, paramArrayList, 1);
    }
    try
    {
      paramLinearSystem.minimize();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    results = new ArrayList();
    for (j = i; j < paramArrayList.size(); j++)
    {
      MeasureResult localMeasureResult = new MeasureResult((ConstraintWidget)paramArrayList.get(j), paramLinearSystem, paramInt);
      results.add(localMeasureResult);
    }
    if (paramInt == 0)
    {
      paramInt = paramLinearSystem.getObjectVariableValue(mLeft);
      j = paramLinearSystem.getObjectVariableValue(mRight);
      paramLinearSystem.reset();
    }
    for (;;)
    {
      return j - paramInt;
      paramInt = paramLinearSystem.getObjectVariableValue(mTop);
      j = paramLinearSystem.getObjectVariableValue(mBottom);
      paramLinearSystem.reset();
    }
  }
  
  public boolean add(ConstraintWidget paramConstraintWidget)
  {
    if (widgets.contains(paramConstraintWidget)) {
      return false;
    }
    widgets.add(paramConstraintWidget);
    return true;
  }
  
  public void apply()
  {
    if (results == null) {
      return;
    }
    if (!authoritative) {
      return;
    }
    for (int i = 0; i < results.size(); i++) {
      ((MeasureResult)results.get(i)).apply();
    }
  }
  
  public void cleanup(ArrayList<WidgetGroup> paramArrayList)
  {
    int i = widgets.size();
    if ((moveTo != -1) && (i > 0)) {
      for (int j = 0; j < paramArrayList.size(); j++)
      {
        WidgetGroup localWidgetGroup = (WidgetGroup)paramArrayList.get(j);
        if (moveTo == id) {
          moveTo(orientation, localWidgetGroup);
        }
      }
    }
    if (i == 0) {
      paramArrayList.remove(this);
    }
  }
  
  public void clear()
  {
    widgets.clear();
  }
  
  public int getId()
  {
    return id;
  }
  
  public int getOrientation()
  {
    return orientation;
  }
  
  public boolean intersectWith(WidgetGroup paramWidgetGroup)
  {
    for (int i = 0; i < widgets.size(); i++) {
      if (paramWidgetGroup.contains((ConstraintWidget)widgets.get(i))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isAuthoritative()
  {
    return authoritative;
  }
  
  public int measureWrap(LinearSystem paramLinearSystem, int paramInt)
  {
    if (widgets.size() == 0) {
      return 0;
    }
    return solverMeasure(paramLinearSystem, widgets, paramInt);
  }
  
  public void moveTo(int paramInt, WidgetGroup paramWidgetGroup)
  {
    Iterator localIterator = widgets.iterator();
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      paramWidgetGroup.add(localConstraintWidget);
      if (paramInt == 0) {
        horizontalGroup = paramWidgetGroup.getId();
      } else {
        verticalGroup = paramWidgetGroup.getId();
      }
    }
    moveTo = id;
  }
  
  public void setAuthoritative(boolean paramBoolean)
  {
    authoritative = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    orientation = paramInt;
  }
  
  public int size()
  {
    return widgets.size();
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(getOrientationString());
    ((StringBuilder)localObject).append(" [");
    localObject = z2.q((StringBuilder)localObject, id, "] <");
    Iterator localIterator = widgets.iterator();
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      localObject = z2.u((String)localObject, " ");
      ((StringBuilder)localObject).append(localConstraintWidget.getDebugName());
      localObject = ((StringBuilder)localObject).toString();
    }
    return z2.o((String)localObject, " >");
  }
  
  public class MeasureResult
  {
    public int baseline;
    public int bottom;
    public int left;
    public int orientation;
    public int right;
    public int top;
    public WeakReference<ConstraintWidget> widgetRef;
    
    public MeasureResult(ConstraintWidget paramConstraintWidget, LinearSystem paramLinearSystem, int paramInt)
    {
      widgetRef = new WeakReference(paramConstraintWidget);
      left = paramLinearSystem.getObjectVariableValue(mLeft);
      top = paramLinearSystem.getObjectVariableValue(mTop);
      right = paramLinearSystem.getObjectVariableValue(mRight);
      bottom = paramLinearSystem.getObjectVariableValue(mBottom);
      baseline = paramLinearSystem.getObjectVariableValue(mBaseline);
      orientation = paramInt;
    }
    
    public void apply()
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)widgetRef.get();
      if (localConstraintWidget != null) {
        localConstraintWidget.setFinalFrame(left, top, right, bottom, baseline, orientation);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */