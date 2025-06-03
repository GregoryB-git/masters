package androidx.constraintlayout.core;

import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class SolverVariableValues
  implements ArrayRow.ArrayRowVariables
{
  private static final boolean DEBUG = false;
  private static final boolean HASH = true;
  private static float epsilon = 0.001F;
  private int HASH_SIZE = 16;
  private final int NONE = -1;
  private int SIZE = 16;
  public int head = -1;
  public int[] keys = new int[16];
  public final Cache mCache;
  public int mCount = 0;
  private final ArrayRow mRow;
  public int[] next = new int[16];
  public int[] nextKeys = new int[16];
  public int[] previous = new int[16];
  public float[] values = new float[16];
  public int[] variables = new int[16];
  
  public SolverVariableValues(ArrayRow paramArrayRow, Cache paramCache)
  {
    mRow = paramArrayRow;
    mCache = paramCache;
    clear();
  }
  
  private void addToHashMap(SolverVariable paramSolverVariable, int paramInt)
  {
    int i = id % HASH_SIZE;
    paramSolverVariable = keys;
    int j = paramSolverVariable[i];
    int k = j;
    if (j == -1)
    {
      paramSolverVariable[i] = paramInt;
    }
    else
    {
      for (;;)
      {
        paramSolverVariable = nextKeys;
        j = paramSolverVariable[k];
        if (j == -1) {
          break;
        }
        k = j;
      }
      paramSolverVariable[k] = paramInt;
    }
    nextKeys[paramInt] = -1;
  }
  
  private void addVariable(int paramInt, SolverVariable paramSolverVariable, float paramFloat)
  {
    variables[paramInt] = id;
    values[paramInt] = paramFloat;
    previous[paramInt] = -1;
    next[paramInt] = -1;
    paramSolverVariable.addToRow(mRow);
    usageInRowCount += 1;
    mCount += 1;
  }
  
  private void displayHash()
  {
    for (int i = 0; i < HASH_SIZE; i++) {
      if (keys[i] != -1)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(hashCode());
        ((StringBuilder)localObject).append(" hash [");
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append("] => ");
        localObject = ((StringBuilder)localObject).toString();
        int j = keys[i];
        int k = 0;
        while (k == 0)
        {
          localObject = z2.u((String)localObject, " ");
          ((StringBuilder)localObject).append(variables[j]);
          localObject = ((StringBuilder)localObject).toString();
          int m = nextKeys[j];
          if (m != -1) {
            j = m;
          } else {
            k = 1;
          }
        }
        System.out.println((String)localObject);
      }
    }
  }
  
  private int findEmptySlot()
  {
    for (int i = 0; i < SIZE; i++) {
      if (variables[i] == -1) {
        return i;
      }
    }
    return -1;
  }
  
  private void increaseSize()
  {
    int i = SIZE * 2;
    variables = Arrays.copyOf(variables, i);
    values = Arrays.copyOf(values, i);
    previous = Arrays.copyOf(previous, i);
    next = Arrays.copyOf(next, i);
    nextKeys = Arrays.copyOf(nextKeys, i);
    for (int j = SIZE; j < i; j++)
    {
      variables[j] = -1;
      nextKeys[j] = -1;
    }
    SIZE = i;
  }
  
  private void insertVariable(int paramInt, SolverVariable paramSolverVariable, float paramFloat)
  {
    int i = findEmptySlot();
    addVariable(i, paramSolverVariable, paramFloat);
    if (paramInt != -1)
    {
      previous[i] = paramInt;
      int[] arrayOfInt = next;
      arrayOfInt[i] = arrayOfInt[paramInt];
      arrayOfInt[paramInt] = i;
    }
    else
    {
      previous[i] = -1;
      if (mCount > 0)
      {
        next[i] = head;
        head = i;
      }
      else
      {
        next[i] = -1;
      }
    }
    paramInt = next[i];
    if (paramInt != -1) {
      previous[paramInt] = i;
    }
    addToHashMap(paramSolverVariable, i);
  }
  
  private void removeFromHashMap(SolverVariable paramSolverVariable)
  {
    int i = id;
    int j = i % HASH_SIZE;
    int[] arrayOfInt = keys;
    int k = arrayOfInt[j];
    if (k == -1) {
      return;
    }
    int m = k;
    if (variables[k] == i)
    {
      paramSolverVariable = nextKeys;
      arrayOfInt[j] = paramSolverVariable[k];
      paramSolverVariable[k] = -1;
    }
    else
    {
      for (;;)
      {
        paramSolverVariable = nextKeys;
        k = paramSolverVariable[m];
        if ((k == -1) || (variables[k] == i)) {
          break;
        }
        m = k;
      }
      if ((k != -1) && (variables[k] == i))
      {
        paramSolverVariable[m] = paramSolverVariable[k];
        paramSolverVariable[k] = -1;
      }
    }
  }
  
  public void add(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean)
  {
    float f = epsilon;
    if ((paramFloat > -f) && (paramFloat < f)) {
      return;
    }
    int i = indexOf(paramSolverVariable);
    if (i == -1)
    {
      put(paramSolverVariable, paramFloat);
    }
    else
    {
      float[] arrayOfFloat = values;
      paramFloat = arrayOfFloat[i] + paramFloat;
      arrayOfFloat[i] = paramFloat;
      f = epsilon;
      if ((paramFloat > -f) && (paramFloat < f))
      {
        arrayOfFloat[i] = 0.0F;
        remove(paramSolverVariable, paramBoolean);
      }
    }
  }
  
  public void clear()
  {
    int i = mCount;
    for (int j = 0; j < i; j++)
    {
      SolverVariable localSolverVariable = getVariable(j);
      if (localSolverVariable != null) {
        localSolverVariable.removeFromRow(mRow);
      }
    }
    for (j = 0; j < SIZE; j++)
    {
      variables[j] = -1;
      nextKeys[j] = -1;
    }
    for (j = 0; j < HASH_SIZE; j++) {
      keys[j] = -1;
    }
    mCount = 0;
    head = -1;
  }
  
  public boolean contains(SolverVariable paramSolverVariable)
  {
    boolean bool;
    if (indexOf(paramSolverVariable) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void display()
  {
    int i = mCount;
    System.out.print("{ ");
    for (int j = 0; j < i; j++)
    {
      SolverVariable localSolverVariable = getVariable(j);
      if (localSolverVariable != null)
      {
        PrintStream localPrintStream = System.out;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localSolverVariable);
        localStringBuilder.append(" = ");
        localStringBuilder.append(getVariableValue(j));
        localStringBuilder.append(" ");
        localPrintStream.print(localStringBuilder.toString());
      }
    }
    System.out.println(" }");
  }
  
  public void divideByAmount(float paramFloat)
  {
    int i = mCount;
    int j = head;
    for (int k = 0; k < i; k++)
    {
      float[] arrayOfFloat = values;
      arrayOfFloat[j] /= paramFloat;
      j = next[j];
      if (j == -1) {
        break;
      }
    }
  }
  
  public float get(SolverVariable paramSolverVariable)
  {
    int i = indexOf(paramSolverVariable);
    if (i != -1) {
      return values[i];
    }
    return 0.0F;
  }
  
  public int getCurrentSize()
  {
    return mCount;
  }
  
  public SolverVariable getVariable(int paramInt)
  {
    int i = mCount;
    if (i == 0) {
      return null;
    }
    int j = head;
    for (int k = 0; k < i; k++)
    {
      if ((k == paramInt) && (j != -1)) {
        return mCache.mIndexedVariables[variables[j]];
      }
      j = next[j];
      if (j == -1) {
        break;
      }
    }
    return null;
  }
  
  public float getVariableValue(int paramInt)
  {
    int i = mCount;
    int j = head;
    for (int k = 0; k < i; k++)
    {
      if (k == paramInt) {
        return values[j];
      }
      j = next[j];
      if (j == -1) {
        break;
      }
    }
    return 0.0F;
  }
  
  public int indexOf(SolverVariable paramSolverVariable)
  {
    if ((mCount != 0) && (paramSolverVariable != null))
    {
      int i = id;
      int j = HASH_SIZE;
      int k = keys[(i % j)];
      if (k == -1) {
        return -1;
      }
      j = k;
      if (variables[k] == i) {
        return k;
      }
      do
      {
        j = nextKeys[j];
      } while ((j != -1) && (variables[j] != i));
      if (j == -1) {
        return -1;
      }
      if (variables[j] == i) {
        return j;
      }
    }
    return -1;
  }
  
  public void invert()
  {
    int i = mCount;
    int j = head;
    for (int k = 0; k < i; k++)
    {
      float[] arrayOfFloat = values;
      arrayOfFloat[j] *= -1.0F;
      j = next[j];
      if (j == -1) {
        break;
      }
    }
  }
  
  public void put(SolverVariable paramSolverVariable, float paramFloat)
  {
    float f = epsilon;
    if ((paramFloat > -f) && (paramFloat < f))
    {
      remove(paramSolverVariable, true);
      return;
    }
    int i = mCount;
    int j = 0;
    if (i == 0)
    {
      addVariable(0, paramSolverVariable, paramFloat);
      addToHashMap(paramSolverVariable, 0);
      head = 0;
    }
    else
    {
      i = indexOf(paramSolverVariable);
      if (i != -1)
      {
        values[i] = paramFloat;
      }
      else
      {
        if (mCount + 1 >= SIZE) {
          increaseSize();
        }
        int k = mCount;
        i = head;
        int m = -1;
        int n;
        for (;;)
        {
          n = m;
          if (j >= k) {
            break;
          }
          int i1 = variables[i];
          n = id;
          if (i1 == n)
          {
            values[i] = paramFloat;
            return;
          }
          if (i1 < n) {
            m = i;
          }
          i = next[i];
          if (i == -1)
          {
            n = m;
            break;
          }
          j++;
        }
        insertVariable(n, paramSolverVariable, paramFloat);
      }
    }
  }
  
  public float remove(SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    int i = indexOf(paramSolverVariable);
    if (i == -1) {
      return 0.0F;
    }
    removeFromHashMap(paramSolverVariable);
    float f = values[i];
    if (head == i) {
      head = next[i];
    }
    variables[i] = -1;
    int[] arrayOfInt1 = previous;
    int j = arrayOfInt1[i];
    if (j != -1)
    {
      int[] arrayOfInt2 = next;
      arrayOfInt2[j] = arrayOfInt2[i];
    }
    j = next[i];
    if (j != -1) {
      arrayOfInt1[j] = arrayOfInt1[i];
    }
    mCount -= 1;
    usageInRowCount -= 1;
    if (paramBoolean) {
      paramSolverVariable.removeFromRow(mRow);
    }
    return f;
  }
  
  public int sizeInBytes()
  {
    return 0;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(hashCode());
    ((StringBuilder)localObject).append(" { ");
    localObject = ((StringBuilder)localObject).toString();
    int i = mCount;
    for (int j = 0; j < i; j++)
    {
      SolverVariable localSolverVariable = getVariable(j);
      if (localSolverVariable != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(localSolverVariable);
        localStringBuilder.append(" = ");
        localStringBuilder.append(getVariableValue(j));
        localStringBuilder.append(" ");
        localObject = localStringBuilder.toString();
        int k = indexOf(localSolverVariable);
        localObject = z2.o((String)localObject, "[p: ");
        if (previous[k] != -1)
        {
          localObject = z2.t((String)localObject);
          ((StringBuilder)localObject).append(mCache.mIndexedVariables[variables[previous[k]]]);
          localObject = ((StringBuilder)localObject).toString();
        }
        else
        {
          localObject = z2.o((String)localObject, "none");
        }
        localObject = z2.o((String)localObject, ", n: ");
        if (next[k] != -1)
        {
          localObject = z2.t((String)localObject);
          ((StringBuilder)localObject).append(mCache.mIndexedVariables[variables[next[k]]]);
          localObject = ((StringBuilder)localObject).toString();
        }
        else
        {
          localObject = z2.o((String)localObject, "none");
        }
        localObject = z2.o((String)localObject, "]");
      }
    }
    return z2.o((String)localObject, " }");
  }
  
  public float use(ArrayRow paramArrayRow, boolean paramBoolean)
  {
    float f1 = get(variable);
    remove(variable, paramBoolean);
    paramArrayRow = (SolverVariableValues)variables;
    int i = paramArrayRow.getCurrentSize();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = variables[k];
      int n = j;
      if (m != -1)
      {
        float f2 = values[k];
        add(mCache.mIndexedVariables[m], f2 * f1, paramBoolean);
        n = j + 1;
      }
      k++;
      j = n;
    }
    return f1;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.SolverVariableValues
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */