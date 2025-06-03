package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

public class Placeholder
  extends VirtualLayout
{
  public void addToSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    super.addToSolver(paramLinearSystem, paramBoolean);
    if (mWidgetsCount > 0)
    {
      paramLinearSystem = mWidgets[0];
      paramLinearSystem.resetAllConstraints();
      ConstraintAnchor.Type localType = ConstraintAnchor.Type.LEFT;
      paramLinearSystem.connect(localType, this, localType);
      localType = ConstraintAnchor.Type.RIGHT;
      paramLinearSystem.connect(localType, this, localType);
      localType = ConstraintAnchor.Type.TOP;
      paramLinearSystem.connect(localType, this, localType);
      localType = ConstraintAnchor.Type.BOTTOM;
      paramLinearSystem.connect(localType, this, localType);
    }
  }
  
  public void measure(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = getPaddingTop();
    int m = getPaddingBottom();
    boolean bool = false;
    j = i + j + 0;
    i = k + m + 0;
    m = j;
    k = i;
    if (mWidgetsCount > 0)
    {
      m = j + mWidgets[0].getWidth();
      k = i + mWidgets[0].getHeight();
    }
    m = Math.max(getMinWidth(), m);
    k = Math.max(getMinHeight(), k);
    if (paramInt1 != 1073741824) {
      if (paramInt1 == Integer.MIN_VALUE) {
        paramInt2 = Math.min(m, paramInt2);
      } else if (paramInt1 == 0) {
        paramInt2 = m;
      } else {
        paramInt2 = 0;
      }
    }
    if (paramInt3 != 1073741824) {
      if (paramInt3 == Integer.MIN_VALUE) {
        paramInt4 = Math.min(k, paramInt4);
      } else if (paramInt3 == 0) {
        paramInt4 = k;
      } else {
        paramInt4 = 0;
      }
    }
    setMeasure(paramInt2, paramInt4);
    setWidth(paramInt2);
    setHeight(paramInt4);
    if (mWidgetsCount > 0) {
      bool = true;
    }
    needsCallbackFromSolver(bool);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Placeholder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */