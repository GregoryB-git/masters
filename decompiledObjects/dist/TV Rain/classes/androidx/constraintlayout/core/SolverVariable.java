package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;
import z2;

public class SolverVariable
  implements Comparable<SolverVariable>
{
  private static final boolean INTERNAL_DEBUG = false;
  public static final int MAX_STRENGTH = 9;
  public static final int STRENGTH_BARRIER = 6;
  public static final int STRENGTH_CENTERING = 7;
  public static final int STRENGTH_EQUALITY = 5;
  public static final int STRENGTH_FIXED = 8;
  public static final int STRENGTH_HIGH = 3;
  public static final int STRENGTH_HIGHEST = 4;
  public static final int STRENGTH_LOW = 1;
  public static final int STRENGTH_MEDIUM = 2;
  public static final int STRENGTH_NONE = 0;
  private static final boolean VAR_USE_HASH = false;
  private static int uniqueConstantId = 1;
  private static int uniqueErrorId = 1;
  private static int uniqueId = 1;
  private static int uniqueSlackId = 1;
  private static int uniqueUnrestrictedId = 1;
  public float computedValue;
  public int definitionId = -1;
  public float[] goalStrengthVector = new float[9];
  public int id = -1;
  public boolean inGoal;
  public HashSet<ArrayRow> inRows = null;
  public boolean isFinalValue = false;
  public boolean isSynonym = false;
  public ArrayRow[] mClientEquations = new ArrayRow[16];
  public int mClientEquationsCount = 0;
  private String mName;
  public Type mType;
  public int strength = 0;
  public float[] strengthVector = new float[9];
  public int synonym = -1;
  public float synonymDelta = 0.0F;
  public int usageInRowCount = 0;
  
  public SolverVariable(Type paramType, String paramString)
  {
    mType = paramType;
  }
  
  public SolverVariable(String paramString, Type paramType)
  {
    mName = paramString;
    mType = paramType;
  }
  
  private static String getUniqueName(Type paramType, String paramString)
  {
    if (paramString != null)
    {
      paramType = z2.t(paramString);
      paramType.append(uniqueErrorId);
      return paramType.toString();
    }
    int i = 1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[paramType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5)
            {
              paramType = z2.t("V");
              i = uniqueId + 1;
              uniqueId = i;
              paramType.append(i);
              return paramType.toString();
            }
            throw new AssertionError(paramType.name());
          }
          paramType = z2.t("e");
          i = uniqueErrorId + 1;
          uniqueErrorId = i;
          paramType.append(i);
          return paramType.toString();
        }
        paramType = z2.t("S");
        i = uniqueSlackId + 1;
        uniqueSlackId = i;
        paramType.append(i);
        return paramType.toString();
      }
      paramType = z2.t("C");
      i = uniqueConstantId + 1;
      uniqueConstantId = i;
      paramType.append(i);
      return paramType.toString();
    }
    paramType = z2.t("U");
    i = uniqueUnrestrictedId + 1;
    uniqueUnrestrictedId = i;
    paramType.append(i);
    return paramType.toString();
  }
  
  public static void increaseErrorId()
  {
    uniqueErrorId += 1;
  }
  
  public final void addToRow(ArrayRow paramArrayRow)
  {
    int j;
    for (int i = 0;; i++)
    {
      j = mClientEquationsCount;
      if (i >= j) {
        break;
      }
      if (mClientEquations[i] == paramArrayRow) {
        return;
      }
    }
    ArrayRow[] arrayOfArrayRow = mClientEquations;
    if (j >= arrayOfArrayRow.length) {
      mClientEquations = ((ArrayRow[])Arrays.copyOf(arrayOfArrayRow, arrayOfArrayRow.length * 2));
    }
    arrayOfArrayRow = mClientEquations;
    i = mClientEquationsCount;
    arrayOfArrayRow[i] = paramArrayRow;
    mClientEquationsCount = (i + 1);
  }
  
  public void clearStrengths()
  {
    for (int i = 0; i < 9; i++) {
      strengthVector[i] = 0.0F;
    }
  }
  
  public int compareTo(SolverVariable paramSolverVariable)
  {
    return id - id;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public final void removeFromRow(ArrayRow paramArrayRow)
  {
    int i = mClientEquationsCount;
    for (int j = 0; j < i; j++) {
      if (mClientEquations[j] == paramArrayRow)
      {
        while (j < i - 1)
        {
          paramArrayRow = mClientEquations;
          int k = j + 1;
          paramArrayRow[j] = paramArrayRow[k];
          j = k;
        }
        mClientEquationsCount -= 1;
        return;
      }
    }
  }
  
  public void reset()
  {
    mName = null;
    mType = Type.UNKNOWN;
    strength = 0;
    id = -1;
    definitionId = -1;
    computedValue = 0.0F;
    isFinalValue = false;
    isSynonym = false;
    synonym = -1;
    synonymDelta = 0.0F;
    int i = mClientEquationsCount;
    for (int j = 0; j < i; j++) {
      mClientEquations[j] = null;
    }
    mClientEquationsCount = 0;
    usageInRowCount = 0;
    inGoal = false;
    Arrays.fill(goalStrengthVector, 0.0F);
  }
  
  public void setFinalValue(LinearSystem paramLinearSystem, float paramFloat)
  {
    computedValue = paramFloat;
    isFinalValue = true;
    isSynonym = false;
    synonym = -1;
    synonymDelta = 0.0F;
    int i = mClientEquationsCount;
    definitionId = -1;
    for (int j = 0; j < i; j++) {
      mClientEquations[j].updateFromFinalVariable(paramLinearSystem, this, false);
    }
    mClientEquationsCount = 0;
  }
  
  public void setName(String paramString)
  {
    mName = paramString;
  }
  
  public void setSynonym(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, float paramFloat)
  {
    isSynonym = true;
    synonym = id;
    synonymDelta = paramFloat;
    int i = mClientEquationsCount;
    definitionId = -1;
    for (int j = 0; j < i; j++) {
      mClientEquations[j].updateFromSynonymVariable(paramLinearSystem, this, false);
    }
    mClientEquationsCount = 0;
    paramLinearSystem.displayReadableRows();
  }
  
  public void setType(Type paramType, String paramString)
  {
    mType = paramType;
  }
  
  public String strengthsToString()
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(this);
    ((StringBuilder)localObject1).append("[");
    Object localObject2 = ((StringBuilder)localObject1).toString();
    int i = 1;
    int j = 0;
    int k = j;
    while (j < strengthVector.length)
    {
      localObject1 = z2.t((String)localObject2);
      ((StringBuilder)localObject1).append(strengthVector[j]);
      localObject2 = ((StringBuilder)localObject1).toString();
      localObject1 = strengthVector;
      float f = localObject1[j];
      if (f > 0.0F) {
        k = 0;
      } else if (f < 0.0F) {
        k = 1;
      }
      if (f != 0.0F) {
        i = 0;
      }
      if (j < localObject1.length - 1) {
        localObject2 = z2.o((String)localObject2, ", ");
      } else {
        localObject2 = z2.o((String)localObject2, "] ");
      }
      j++;
    }
    localObject1 = localObject2;
    if (k != 0) {
      localObject1 = z2.o((String)localObject2, " (-)");
    }
    localObject2 = localObject1;
    if (i != 0) {
      localObject2 = z2.o((String)localObject1, " (*)");
    }
    return (String)localObject2;
  }
  
  public String toString()
  {
    Object localObject;
    if (mName != null)
    {
      localObject = z2.t("");
      ((StringBuilder)localObject).append(mName);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = z2.t("");
      ((StringBuilder)localObject).append(id);
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public final void updateReferencesWithNewDefinition(LinearSystem paramLinearSystem, ArrayRow paramArrayRow)
  {
    int i = mClientEquationsCount;
    for (int j = 0; j < i; j++) {
      mClientEquations[j].updateFromRow(paramLinearSystem, paramArrayRow, false);
    }
    mClientEquationsCount = 0;
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("UNRESTRICTED", 0);
      UNRESTRICTED = localType1;
      Type localType2 = new Type("CONSTANT", 1);
      CONSTANT = localType2;
      Type localType3 = new Type("SLACK", 2);
      SLACK = localType3;
      Type localType4 = new Type("ERROR", 3);
      ERROR = localType4;
      Type localType5 = new Type("UNKNOWN", 4);
      UNKNOWN = localType5;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.SolverVariable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */