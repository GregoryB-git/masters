package androidx.constraintlayout.core;

import java.util.ArrayList;
import z2;

public class ArrayRow
  implements LinearSystem.Row
{
  private static final boolean DEBUG = false;
  private static final boolean FULL_NEW_CHECK = false;
  public float constantValue = 0.0F;
  public boolean isSimpleDefinition = false;
  public boolean used = false;
  public SolverVariable variable = null;
  public ArrayRowVariables variables;
  public ArrayList<SolverVariable> variablesToUpdate = new ArrayList();
  
  public ArrayRow() {}
  
  public ArrayRow(Cache paramCache)
  {
    variables = new ArrayLinkedVariables(this, paramCache);
  }
  
  private boolean isNew(SolverVariable paramSolverVariable, LinearSystem paramLinearSystem)
  {
    int i = usageInRowCount;
    boolean bool = true;
    if (i > 1) {
      bool = false;
    }
    return bool;
  }
  
  private SolverVariable pickPivotInVariables(boolean[] paramArrayOfBoolean, SolverVariable paramSolverVariable)
  {
    int i = variables.getCurrentSize();
    Object localObject1 = null;
    int j = 0;
    float f3;
    for (float f1 = 0.0F; j < i; f1 = f3)
    {
      float f2 = variables.getVariableValue(j);
      Object localObject2 = localObject1;
      f3 = f1;
      if (f2 < 0.0F)
      {
        SolverVariable localSolverVariable = variables.getVariable(j);
        if (paramArrayOfBoolean != null)
        {
          localObject2 = localObject1;
          f3 = f1;
          if (paramArrayOfBoolean[id] != 0) {}
        }
        else
        {
          localObject2 = localObject1;
          f3 = f1;
          if (localSolverVariable != paramSolverVariable)
          {
            SolverVariable.Type localType = mType;
            if (localType != SolverVariable.Type.SLACK)
            {
              localObject2 = localObject1;
              f3 = f1;
              if (localType != SolverVariable.Type.ERROR) {}
            }
            else
            {
              localObject2 = localObject1;
              f3 = f1;
              if (f2 < f1)
              {
                f3 = f2;
                localObject2 = localSolverVariable;
              }
            }
          }
        }
      }
      j++;
      localObject1 = localObject2;
    }
    return (SolverVariable)localObject1;
  }
  
  public ArrayRow addError(LinearSystem paramLinearSystem, int paramInt)
  {
    variables.put(paramLinearSystem.createErrorVariable(paramInt, "ep"), 1.0F);
    variables.put(paramLinearSystem.createErrorVariable(paramInt, "em"), -1.0F);
    return this;
  }
  
  public void addError(SolverVariable paramSolverVariable)
  {
    int i = strength;
    float f = 1.0F;
    if (i != 1) {
      if (i == 2) {
        f = 1000.0F;
      } else if (i == 3) {
        f = 1000000.0F;
      } else if (i == 4) {
        f = 1.0E9F;
      } else if (i == 5) {
        f = 1.0E12F;
      }
    }
    variables.put(paramSolverVariable, f);
  }
  
  public ArrayRow addSingleError(SolverVariable paramSolverVariable, int paramInt)
  {
    variables.put(paramSolverVariable, paramInt);
    return this;
  }
  
  public boolean chooseSubject(LinearSystem paramLinearSystem)
  {
    paramLinearSystem = chooseSubjectInVariables(paramLinearSystem);
    boolean bool;
    if (paramLinearSystem == null)
    {
      bool = true;
    }
    else
    {
      pivot(paramLinearSystem);
      bool = false;
    }
    if (variables.getCurrentSize() == 0) {
      isSimpleDefinition = true;
    }
    return bool;
  }
  
  public SolverVariable chooseSubjectInVariables(LinearSystem paramLinearSystem)
  {
    int i = variables.getCurrentSize();
    Object localObject1 = null;
    int j = 0;
    int k = j;
    int n = k;
    float f1 = 0.0F;
    float f2 = f1;
    Object localObject2 = null;
    int i1 = k;
    while (j < i)
    {
      float f3 = variables.getVariableValue(j);
      SolverVariable localSolverVariable = variables.getVariable(j);
      int m;
      Object localObject3;
      Object localObject4;
      int i2;
      float f4;
      float f5;
      if (mType == SolverVariable.Type.UNRESTRICTED)
      {
        if (localObject1 == null) {}
        for (m = isNew(localSolverVariable, paramLinearSystem);; m = isNew(localSolverVariable, paramLinearSystem))
        {
          localObject3 = localSolverVariable;
          localObject4 = localObject2;
          i2 = n;
          f4 = f3;
          f5 = f2;
          break label423;
          if (f1 <= f3) {
            break;
          }
        }
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = i1;
        i2 = n;
        f4 = f1;
        f5 = f2;
        if (i1 == 0)
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          m = i1;
          i2 = n;
          f4 = f1;
          f5 = f2;
          if (isNew(localSolverVariable, paramLinearSystem))
          {
            m = 1;
            localObject3 = localSolverVariable;
            localObject4 = localObject2;
            i2 = n;
            f4 = f3;
            f5 = f2;
          }
        }
      }
      else
      {
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = i1;
        i2 = n;
        f4 = f1;
        f5 = f2;
        if (localObject1 == null)
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          m = i1;
          i2 = n;
          f4 = f1;
          f5 = f2;
          if (f3 < 0.0F)
          {
            if (localObject2 == null) {}
            for (m = isNew(localSolverVariable, paramLinearSystem);; m = isNew(localSolverVariable, paramLinearSystem))
            {
              i2 = m;
              localObject3 = localObject1;
              localObject4 = localSolverVariable;
              m = i1;
              f4 = f1;
              f5 = f3;
              break label423;
              if (f2 <= f3) {
                break;
              }
            }
            localObject3 = localObject1;
            localObject4 = localObject2;
            m = i1;
            i2 = n;
            f4 = f1;
            f5 = f2;
            if (n == 0)
            {
              localObject3 = localObject1;
              localObject4 = localObject2;
              m = i1;
              i2 = n;
              f4 = f1;
              f5 = f2;
              if (isNew(localSolverVariable, paramLinearSystem))
              {
                i2 = 1;
                f5 = f3;
                f4 = f1;
                m = i1;
                localObject4 = localSolverVariable;
                localObject3 = localObject1;
              }
            }
          }
        }
      }
      label423:
      j++;
      localObject1 = localObject3;
      localObject2 = localObject4;
      i1 = m;
      n = i2;
      f1 = f4;
      f2 = f5;
    }
    if (localObject1 != null) {
      return (SolverVariable)localObject1;
    }
    return (SolverVariable)localObject2;
  }
  
  public void clear()
  {
    variables.clear();
    variable = null;
    constantValue = 0.0F;
  }
  
  public ArrayRow createRowCentering(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2)
  {
    if (paramSolverVariable2 == paramSolverVariable3)
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable4, 1.0F);
      variables.put(paramSolverVariable2, -2.0F);
      return this;
    }
    if (paramFloat == 0.5F)
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable3, -1.0F);
      variables.put(paramSolverVariable4, 1.0F);
      if ((paramInt1 > 0) || (paramInt2 > 0)) {
        constantValue = (-paramInt1 + paramInt2);
      }
    }
    else if (paramFloat <= 0.0F)
    {
      variables.put(paramSolverVariable1, -1.0F);
      variables.put(paramSolverVariable2, 1.0F);
      constantValue = paramInt1;
    }
    else if (paramFloat >= 1.0F)
    {
      variables.put(paramSolverVariable4, -1.0F);
      variables.put(paramSolverVariable3, 1.0F);
      constantValue = (-paramInt2);
    }
    else
    {
      ArrayRowVariables localArrayRowVariables = variables;
      float f1 = 1.0F - paramFloat;
      localArrayRowVariables.put(paramSolverVariable1, f1 * 1.0F);
      variables.put(paramSolverVariable2, f1 * -1.0F);
      variables.put(paramSolverVariable3, -1.0F * paramFloat);
      variables.put(paramSolverVariable4, 1.0F * paramFloat);
      if ((paramInt1 > 0) || (paramInt2 > 0))
      {
        float f2 = -paramInt1;
        constantValue = (paramInt2 * paramFloat + f2 * f1);
      }
    }
    return this;
  }
  
  public ArrayRow createRowDefinition(SolverVariable paramSolverVariable, int paramInt)
  {
    variable = paramSolverVariable;
    float f = paramInt;
    computedValue = f;
    constantValue = f;
    isSimpleDefinition = true;
    return this;
  }
  
  public ArrayRow createRowDimensionPercent(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat)
  {
    variables.put(paramSolverVariable1, -1.0F);
    variables.put(paramSolverVariable2, paramFloat);
    return this;
  }
  
  public ArrayRow createRowDimensionRatio(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat)
  {
    variables.put(paramSolverVariable1, -1.0F);
    variables.put(paramSolverVariable2, 1.0F);
    variables.put(paramSolverVariable3, paramFloat);
    variables.put(paramSolverVariable4, -paramFloat);
    return this;
  }
  
  public ArrayRow createRowEqualDimension(float paramFloat1, float paramFloat2, float paramFloat3, SolverVariable paramSolverVariable1, int paramInt1, SolverVariable paramSolverVariable2, int paramInt2, SolverVariable paramSolverVariable3, int paramInt3, SolverVariable paramSolverVariable4, int paramInt4)
  {
    if ((paramFloat2 != 0.0F) && (paramFloat1 != paramFloat3))
    {
      paramFloat1 = paramFloat1 / paramFloat2 / (paramFloat3 / paramFloat2);
      paramFloat3 = -paramInt1 - paramInt2;
      paramFloat2 = paramInt3;
      constantValue = (paramInt4 * paramFloat1 + (paramFloat2 * paramFloat1 + paramFloat3));
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable4, paramFloat1);
      variables.put(paramSolverVariable3, -paramFloat1);
    }
    else
    {
      constantValue = (-paramInt1 - paramInt2 + paramInt3 + paramInt4);
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable4, 1.0F);
      variables.put(paramSolverVariable3, -1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowEqualMatchDimensions(float paramFloat1, float paramFloat2, float paramFloat3, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4)
  {
    constantValue = 0.0F;
    if ((paramFloat2 != 0.0F) && (paramFloat1 != paramFloat3))
    {
      if (paramFloat1 == 0.0F)
      {
        variables.put(paramSolverVariable1, 1.0F);
        variables.put(paramSolverVariable2, -1.0F);
      }
      else if (paramFloat3 == 0.0F)
      {
        variables.put(paramSolverVariable3, 1.0F);
        variables.put(paramSolverVariable4, -1.0F);
      }
      else
      {
        paramFloat1 = paramFloat1 / paramFloat2 / (paramFloat3 / paramFloat2);
        variables.put(paramSolverVariable1, 1.0F);
        variables.put(paramSolverVariable2, -1.0F);
        variables.put(paramSolverVariable4, paramFloat1);
        variables.put(paramSolverVariable3, -paramFloat1);
      }
    }
    else
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable4, 1.0F);
      variables.put(paramSolverVariable3, -1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowEquals(SolverVariable paramSolverVariable, int paramInt)
  {
    if (paramInt < 0)
    {
      constantValue = (paramInt * -1);
      variables.put(paramSolverVariable, 1.0F);
    }
    else
    {
      constantValue = paramInt;
      variables.put(paramSolverVariable, -1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowEquals(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      constantValue = j;
    }
    if (i == 0)
    {
      variables.put(paramSolverVariable1, -1.0F);
      variables.put(paramSolverVariable2, 1.0F);
    }
    else
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowGreaterThan(SolverVariable paramSolverVariable1, int paramInt, SolverVariable paramSolverVariable2)
  {
    constantValue = paramInt;
    variables.put(paramSolverVariable1, -1.0F);
    return this;
  }
  
  public ArrayRow createRowGreaterThan(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      constantValue = j;
    }
    if (i == 0)
    {
      variables.put(paramSolverVariable1, -1.0F);
      variables.put(paramSolverVariable2, 1.0F);
      variables.put(paramSolverVariable3, 1.0F);
    }
    else
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable3, -1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowLowerThan(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      constantValue = j;
    }
    if (i == 0)
    {
      variables.put(paramSolverVariable1, -1.0F);
      variables.put(paramSolverVariable2, 1.0F);
      variables.put(paramSolverVariable3, -1.0F);
    }
    else
    {
      variables.put(paramSolverVariable1, 1.0F);
      variables.put(paramSolverVariable2, -1.0F);
      variables.put(paramSolverVariable3, 1.0F);
    }
    return this;
  }
  
  public ArrayRow createRowWithAngle(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat)
  {
    variables.put(paramSolverVariable3, 0.5F);
    variables.put(paramSolverVariable4, 0.5F);
    variables.put(paramSolverVariable1, -0.5F);
    variables.put(paramSolverVariable2, -0.5F);
    constantValue = (-paramFloat);
    return this;
  }
  
  public void ensurePositiveConstant()
  {
    float f = constantValue;
    if (f < 0.0F)
    {
      constantValue = (f * -1.0F);
      variables.invert();
    }
  }
  
  public SolverVariable getKey()
  {
    return variable;
  }
  
  public SolverVariable getPivotCandidate(LinearSystem paramLinearSystem, boolean[] paramArrayOfBoolean)
  {
    return pickPivotInVariables(paramArrayOfBoolean, null);
  }
  
  public boolean hasKeyVariable()
  {
    SolverVariable localSolverVariable = variable;
    boolean bool;
    if ((localSolverVariable != null) && ((mType == SolverVariable.Type.UNRESTRICTED) || (constantValue >= 0.0F))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasVariable(SolverVariable paramSolverVariable)
  {
    return variables.contains(paramSolverVariable);
  }
  
  public void initFromRow(LinearSystem.Row paramRow)
  {
    if ((paramRow instanceof ArrayRow))
    {
      ArrayRow localArrayRow = (ArrayRow)paramRow;
      variable = null;
      variables.clear();
      for (int i = 0; i < variables.getCurrentSize(); i++)
      {
        paramRow = variables.getVariable(i);
        float f = variables.getVariableValue(i);
        variables.add(paramRow, f, true);
      }
    }
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if ((variable == null) && (constantValue == 0.0F) && (variables.getCurrentSize() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public SolverVariable pickPivot(SolverVariable paramSolverVariable)
  {
    return pickPivotInVariables(null, paramSolverVariable);
  }
  
  public void pivot(SolverVariable paramSolverVariable)
  {
    SolverVariable localSolverVariable = variable;
    if (localSolverVariable != null)
    {
      variables.put(localSolverVariable, -1.0F);
      variable.definitionId = -1;
      variable = null;
    }
    float f = variables.remove(paramSolverVariable, true) * -1.0F;
    variable = paramSolverVariable;
    if (f == 1.0F) {
      return;
    }
    constantValue /= f;
    variables.divideByAmount(f);
  }
  
  public void reset()
  {
    variable = null;
    variables.clear();
    constantValue = 0.0F;
    isSimpleDefinition = false;
  }
  
  public int sizeInBytes()
  {
    int i;
    if (variable != null) {
      i = 4;
    } else {
      i = 0;
    }
    return variables.sizeInBytes() + (i + 4 + 4);
  }
  
  public String toReadableString()
  {
    if (variable == null)
    {
      localObject1 = "0";
    }
    else
    {
      localObject1 = z2.t("");
      ((StringBuilder)localObject1).append(variable);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    Object localObject1 = z2.o((String)localObject1, " = ");
    float f1 = constantValue;
    int i = 0;
    int j;
    if (f1 != 0.0F)
    {
      localObject1 = z2.t((String)localObject1);
      ((StringBuilder)localObject1).append(constantValue);
      localObject1 = ((StringBuilder)localObject1).toString();
      j = 1;
    }
    else
    {
      j = 0;
    }
    int k = variables.getCurrentSize();
    while (i < k)
    {
      localObject2 = variables.getVariable(i);
      if (localObject2 != null)
      {
        float f2 = variables.getVariableValue(i);
        boolean bool = f2 < 0.0F;
        if (bool)
        {
          String str = ((SolverVariable)localObject2).toString();
          if (j == 0)
          {
            localObject2 = localObject1;
            f1 = f2;
            if (f2 >= 0.0F) {
              break label213;
            }
            localObject2 = z2.o((String)localObject1, "- ");
          }
          else
          {
            if (bool)
            {
              localObject2 = z2.o((String)localObject1, " + ");
              f1 = f2;
              break label213;
            }
            localObject2 = z2.o((String)localObject1, " - ");
          }
          f1 = f2 * -1.0F;
          label213:
          if (f1 == 1.0F)
          {
            localObject1 = z2.o((String)localObject2, str);
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(f1);
            ((StringBuilder)localObject1).append(" ");
            ((StringBuilder)localObject1).append(str);
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          j = 1;
        }
      }
      i++;
    }
    Object localObject2 = localObject1;
    if (j == 0) {
      localObject2 = z2.o((String)localObject1, "0.0");
    }
    return (String)localObject2;
  }
  
  public String toString()
  {
    return toReadableString();
  }
  
  public void updateFromFinalVariable(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    if ((paramSolverVariable != null) && (isFinalValue))
    {
      float f1 = variables.get(paramSolverVariable);
      float f2 = constantValue;
      constantValue = (computedValue * f1 + f2);
      variables.remove(paramSolverVariable, paramBoolean);
      if (paramBoolean) {
        paramSolverVariable.removeFromRow(this);
      }
      if ((LinearSystem.SIMPLIFY_SYNONYMS) && (variables.getCurrentSize() == 0))
      {
        isSimpleDefinition = true;
        hasSimpleDefinition = true;
      }
    }
  }
  
  public void updateFromRow(LinearSystem paramLinearSystem, ArrayRow paramArrayRow, boolean paramBoolean)
  {
    float f1 = variables.use(paramArrayRow, paramBoolean);
    float f2 = constantValue;
    constantValue = (constantValue * f1 + f2);
    if (paramBoolean) {
      variable.removeFromRow(this);
    }
    if ((LinearSystem.SIMPLIFY_SYNONYMS) && (variable != null) && (variables.getCurrentSize() == 0))
    {
      isSimpleDefinition = true;
      hasSimpleDefinition = true;
    }
  }
  
  public void updateFromSynonymVariable(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    if ((paramSolverVariable != null) && (isSynonym))
    {
      float f1 = variables.get(paramSolverVariable);
      float f2 = constantValue;
      constantValue = (synonymDelta * f1 + f2);
      variables.remove(paramSolverVariable, paramBoolean);
      if (paramBoolean) {
        paramSolverVariable.removeFromRow(this);
      }
      variables.add(mCache.mIndexedVariables[synonym], f1, paramBoolean);
      if ((LinearSystem.SIMPLIFY_SYNONYMS) && (variables.getCurrentSize() == 0))
      {
        isSimpleDefinition = true;
        hasSimpleDefinition = true;
      }
    }
  }
  
  public void updateFromSystem(LinearSystem paramLinearSystem)
  {
    if (mRows.length == 0) {
      return;
    }
    int i = 0;
    while (i == 0)
    {
      int j = variables.getCurrentSize();
      SolverVariable localSolverVariable;
      for (int k = 0; k < j; k++)
      {
        localSolverVariable = variables.getVariable(k);
        if ((definitionId != -1) || (isFinalValue) || (isSynonym)) {
          variablesToUpdate.add(localSolverVariable);
        }
      }
      j = variablesToUpdate.size();
      if (j > 0)
      {
        for (k = 0; k < j; k++)
        {
          localSolverVariable = (SolverVariable)variablesToUpdate.get(k);
          if (isFinalValue) {
            updateFromFinalVariable(paramLinearSystem, localSolverVariable, true);
          } else if (isSynonym) {
            updateFromSynonymVariable(paramLinearSystem, localSolverVariable, true);
          } else {
            updateFromRow(paramLinearSystem, mRows[definitionId], true);
          }
        }
        variablesToUpdate.clear();
      }
      else
      {
        i = 1;
      }
    }
    if ((LinearSystem.SIMPLIFY_SYNONYMS) && (variable != null) && (variables.getCurrentSize() == 0))
    {
      isSimpleDefinition = true;
      hasSimpleDefinition = true;
    }
  }
  
  public static abstract interface ArrayRowVariables
  {
    public abstract void add(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean);
    
    public abstract void clear();
    
    public abstract boolean contains(SolverVariable paramSolverVariable);
    
    public abstract void display();
    
    public abstract void divideByAmount(float paramFloat);
    
    public abstract float get(SolverVariable paramSolverVariable);
    
    public abstract int getCurrentSize();
    
    public abstract SolverVariable getVariable(int paramInt);
    
    public abstract float getVariableValue(int paramInt);
    
    public abstract int indexOf(SolverVariable paramSolverVariable);
    
    public abstract void invert();
    
    public abstract void put(SolverVariable paramSolverVariable, float paramFloat);
    
    public abstract float remove(SolverVariable paramSolverVariable, boolean paramBoolean);
    
    public abstract int sizeInBytes();
    
    public abstract float use(ArrayRow paramArrayRow, boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.ArrayRow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */