package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.Comparator;
import z2;

public class PriorityGoalRow
  extends ArrayRow
{
  private static final boolean DEBUG = false;
  public static final int NOT_FOUND = -1;
  private static final float epsilon = 1.0E-4F;
  private int TABLE_SIZE = 128;
  public GoalVariableAccessor accessor = new GoalVariableAccessor(this);
  private SolverVariable[] arrayGoals = new SolverVariable[''];
  public Cache mCache;
  private int numGoals = 0;
  private SolverVariable[] sortArray = new SolverVariable[''];
  
  public PriorityGoalRow(Cache paramCache)
  {
    super(paramCache);
    mCache = paramCache;
  }
  
  private final void addToGoal(SolverVariable paramSolverVariable)
  {
    int i = numGoals;
    SolverVariable[] arrayOfSolverVariable = arrayGoals;
    if (i + 1 > arrayOfSolverVariable.length)
    {
      arrayOfSolverVariable = (SolverVariable[])Arrays.copyOf(arrayOfSolverVariable, arrayOfSolverVariable.length * 2);
      arrayGoals = arrayOfSolverVariable;
      sortArray = ((SolverVariable[])Arrays.copyOf(arrayOfSolverVariable, arrayOfSolverVariable.length * 2));
    }
    arrayOfSolverVariable = arrayGoals;
    i = numGoals;
    arrayOfSolverVariable[i] = paramSolverVariable;
    i++;
    numGoals = i;
    if ((i > 1) && (1id > id))
    {
      int j = 0;
      int k;
      for (i = 0;; i++)
      {
        k = numGoals;
        if (i >= k) {
          break;
        }
        sortArray[i] = arrayGoals[i];
      }
      Arrays.sort(sortArray, 0, k, new Comparator()
      {
        public int compare(SolverVariable paramAnonymousSolverVariable1, SolverVariable paramAnonymousSolverVariable2)
        {
          return id - id;
        }
      });
      for (i = j; i < numGoals; i++) {
        arrayGoals[i] = sortArray[i];
      }
    }
    inGoal = true;
    paramSolverVariable.addToRow(this);
  }
  
  private final void removeGoal(SolverVariable paramSolverVariable)
  {
    for (int i = 0; i < numGoals; i++) {
      if (arrayGoals[i] == paramSolverVariable)
      {
        int j;
        for (;;)
        {
          j = numGoals;
          if (i >= j - 1) {
            break;
          }
          SolverVariable[] arrayOfSolverVariable = arrayGoals;
          j = i + 1;
          arrayOfSolverVariable[i] = arrayOfSolverVariable[j];
          i = j;
        }
        numGoals = (j - 1);
        inGoal = false;
        return;
      }
    }
  }
  
  public void addError(SolverVariable paramSolverVariable)
  {
    accessor.init(paramSolverVariable);
    accessor.reset();
    goalStrengthVector[strength] = 1.0F;
    addToGoal(paramSolverVariable);
  }
  
  public void clear()
  {
    numGoals = 0;
    constantValue = 0.0F;
  }
  
  public SolverVariable getPivotCandidate(LinearSystem paramLinearSystem, boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    int k;
    for (int j = -1; i < numGoals; j = k)
    {
      paramLinearSystem = arrayGoals[i];
      if (paramArrayOfBoolean[id] != 0)
      {
        k = j;
      }
      else
      {
        accessor.init(paramLinearSystem);
        if (j == -1)
        {
          k = j;
          if (!accessor.isNegative()) {
            break label91;
          }
        }
        else
        {
          k = j;
          if (!accessor.isSmallerThan(arrayGoals[j])) {
            break label91;
          }
        }
        k = i;
      }
      label91:
      i++;
    }
    if (j == -1) {
      return null;
    }
    return arrayGoals[j];
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (numGoals == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    Object localObject = z2.u("", " goal -> (");
    ((StringBuilder)localObject).append(constantValue);
    ((StringBuilder)localObject).append(") : ");
    localObject = ((StringBuilder)localObject).toString();
    for (int i = 0; i < numGoals; i++)
    {
      SolverVariable localSolverVariable = arrayGoals[i];
      accessor.init(localSolverVariable);
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(accessor);
      ((StringBuilder)localObject).append(" ");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public void updateFromRow(LinearSystem paramLinearSystem, ArrayRow paramArrayRow, boolean paramBoolean)
  {
    SolverVariable localSolverVariable = variable;
    if (localSolverVariable == null) {
      return;
    }
    ArrayRow.ArrayRowVariables localArrayRowVariables = variables;
    int i = localArrayRowVariables.getCurrentSize();
    for (int j = 0; j < i; j++)
    {
      paramLinearSystem = localArrayRowVariables.getVariable(j);
      float f1 = localArrayRowVariables.getVariableValue(j);
      accessor.init(paramLinearSystem);
      if (accessor.addToGoal(localSolverVariable, f1)) {
        addToGoal(paramLinearSystem);
      }
      float f2 = constantValue;
      constantValue = (constantValue * f1 + f2);
    }
    removeGoal(localSolverVariable);
  }
  
  public class GoalVariableAccessor
  {
    public PriorityGoalRow row;
    public SolverVariable variable;
    
    public GoalVariableAccessor(PriorityGoalRow paramPriorityGoalRow)
    {
      row = paramPriorityGoalRow;
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
          PriorityGoalRow.access$000(PriorityGoalRow.this, variable);
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
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.PriorityGoalRow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */