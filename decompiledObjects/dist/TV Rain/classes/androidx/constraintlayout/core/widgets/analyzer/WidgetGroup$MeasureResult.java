package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class WidgetGroup$MeasureResult
{
  public int baseline;
  public int bottom;
  public int left;
  public int orientation;
  public int right;
  public int top;
  public WeakReference<ConstraintWidget> widgetRef;
  
  public WidgetGroup$MeasureResult(WidgetGroup paramWidgetGroup, ConstraintWidget paramConstraintWidget, LinearSystem paramLinearSystem, int paramInt)
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */