package androidx.constraintlayout.core;

public class GoalRow
  extends ArrayRow
{
  public GoalRow(Cache paramCache)
  {
    super(paramCache);
  }
  
  public void addError(SolverVariable paramSolverVariable)
  {
    super.addError(paramSolverVariable);
    usageInRowCount -= 1;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.GoalRow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */