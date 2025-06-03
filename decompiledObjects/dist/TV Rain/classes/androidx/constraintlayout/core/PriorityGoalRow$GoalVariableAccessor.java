package androidx.constraintlayout.core;

import java.util.Arrays;
import z2;

class PriorityGoalRow$GoalVariableAccessor
{
  public PriorityGoalRow row;
  public SolverVariable variable;
  
  public PriorityGoalRow$GoalVariableAccessor(PriorityGoalRow paramPriorityGoalRow1, PriorityGoalRow paramPriorityGoalRow2)
  {
    row = paramPriorityGoalRow2;
  }
  
  public void add(SolverVariable paramSolverVariable)
  {
    for (int i = 0; i < 9; i++)
    {
      float[] arrayOfFloat = variable.goalStrengthVector;
      float f = arrayOfFloat[i] + goalStrengthVector[i];
      arrayOfFloat[i] = f;
      if (Math.abs(f) < 1.0E-4F) {
        variable.goalStrengthVector[i] = 0.0F;
      }
    }
  }
  
  public boolean addToGoal(SolverVariable paramSolverVariable, float paramFloat)
  {
    boolean bool = variable.inGoal;
    int i = 1;
    int j = 0;
    float f1;
    if (bool)
    {
      for (j = 0; j < 9; j++)
      {
        float[] arrayOfFloat = variable.goalStrengthVector;
        f1 = arrayOfFloat[j];
        f1 = goalStrengthVector[j] * paramFloat + f1;
        arrayOfFloat[j] = f1;
        if (Math.abs(f1) < 1.0E-4F) {
          variable.goalStrengthVector[j] = 0.0F;
        } else {
          i = 0;
        }
      }
      if (i != 0) {
        PriorityGoalRow.access$000(this$0, variable);
      }
      return false;
    }
    while (j < 9)
    {
      f1 = goalStrengthVector[j];
      if (f1 != 0.0F)
      {
        float f2 = f1 * paramFloat;
        f1 = f2;
        if (Math.abs(f2) < 1.0E-4F) {
          f1 = 0.0F;
        }
        variable.goalStrengthVector[j] = f1;
      }
      else
      {
        variable.goalStrengthVector[j] = 0.0F;
      }
      j++;
    }
    return true;
  }
  
  public void init(SolverVariable paramSolverVariable)
  {
    variable = paramSolverVariable;
  }
  
  public final boolean isNegative()
  {
    for (int i = 8; i >= 0; i--)
    {
      float f = variable.goalStrengthVector[i];
      if (f > 0.0F) {
        return false;
      }
      if (f < 0.0F) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean isNull()
  {
    for (int i = 0; i < 9; i++) {
      if (variable.goalStrengthVector[i] != 0.0F) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean isSmallerThan(SolverVariable paramSolverVariable)
  {
    int i = 8;
    while (i >= 0)
    {
      float f1 = goalStrengthVector[i];
      float f2 = variable.goalStrengthVector[i];
      if (f2 == f1) {
        i--;
      } else if (f2 < f1) {
        return true;
      }
    }
    return false;
  }
  
  public void reset()
  {
    Arrays.fill(variable.goalStrengthVector, 0.0F);
  }
  
  public String toString()
  {
    SolverVariable localSolverVariable = variable;
    Object localObject1 = "[ ";
    Object localObject2 = localObject1;
    if (localSolverVariable != null) {
      for (int i = 0;; i++)
      {
        localObject2 = localObject1;
        if (i >= 9) {
          break;
        }
        localObject1 = z2.t((String)localObject1);
        ((StringBuilder)localObject1).append(variable.goalStrengthVector[i]);
        ((StringBuilder)localObject1).append(" ");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    localObject1 = z2.u((String)localObject2, "] ");
    ((StringBuilder)localObject1).append(variable);
    return ((StringBuilder)localObject1).toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */