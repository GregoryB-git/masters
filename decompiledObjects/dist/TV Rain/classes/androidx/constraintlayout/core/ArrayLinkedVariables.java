package androidx.constraintlayout.core;

import java.io.PrintStream;
import java.util.Arrays;
import z2;

public class ArrayLinkedVariables
  implements ArrayRow.ArrayRowVariables
{
  private static final boolean DEBUG = false;
  private static final boolean FULL_NEW_CHECK = false;
  public static final int NONE = -1;
  private static float epsilon = 0.001F;
  private int ROW_SIZE = 8;
  private SolverVariable candidate = null;
  public int currentSize = 0;
  private int[] mArrayIndices = new int[8];
  private int[] mArrayNextIndices = new int[8];
  private float[] mArrayValues = new float[8];
  public final Cache mCache;
  private boolean mDidFillOnce = false;
  private int mHead = -1;
  private int mLast = -1;
  private final ArrayRow mRow;
  
  public ArrayLinkedVariables(ArrayRow paramArrayRow, Cache paramCache)
  {
    mRow = paramArrayRow;
    mCache = paramCache;
  }
  
  public void add(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean)
  {
    float f1 = epsilon;
    if ((paramFloat > -f1) && (paramFloat < f1)) {
      return;
    }
    int i = mHead;
    if (i == -1)
    {
      mHead = 0;
      mArrayValues[0] = paramFloat;
      mArrayIndices[0] = id;
      mArrayNextIndices[0] = -1;
      usageInRowCount += 1;
      paramSolverVariable.addToRow(mRow);
      currentSize += 1;
      if (!mDidFillOnce)
      {
        i = mLast + 1;
        mLast = i;
        paramSolverVariable = mArrayIndices;
        if (i >= paramSolverVariable.length)
        {
          mDidFillOnce = true;
          mLast = (paramSolverVariable.length - 1);
        }
      }
      return;
    }
    int j = 0;
    int k = -1;
    int m;
    while ((i != -1) && (j < currentSize))
    {
      m = mArrayIndices[i];
      int n = id;
      if (m == n)
      {
        localObject = mArrayValues;
        f1 = localObject[i] + paramFloat;
        float f2 = epsilon;
        paramFloat = f1;
        if (f1 > -f2)
        {
          paramFloat = f1;
          if (f1 < f2) {
            paramFloat = 0.0F;
          }
        }
        localObject[i] = paramFloat;
        if (paramFloat == 0.0F)
        {
          if (i == mHead)
          {
            mHead = mArrayNextIndices[i];
          }
          else
          {
            localObject = mArrayNextIndices;
            localObject[k] = localObject[i];
          }
          if (paramBoolean) {
            paramSolverVariable.removeFromRow(mRow);
          }
          if (mDidFillOnce) {
            mLast = i;
          }
          usageInRowCount -= 1;
          currentSize -= 1;
        }
        return;
      }
      if (m < n) {
        k = i;
      }
      i = mArrayNextIndices[i];
      j++;
    }
    i = mLast;
    if (mDidFillOnce)
    {
      localObject = mArrayIndices;
      if (localObject[i] != -1) {
        i = localObject.length;
      }
    }
    else
    {
      i++;
    }
    Object localObject = mArrayIndices;
    j = i;
    if (i >= localObject.length)
    {
      j = i;
      if (currentSize < localObject.length) {
        for (m = 0;; m++)
        {
          localObject = mArrayIndices;
          j = i;
          if (m >= localObject.length) {
            break;
          }
          if (localObject[m] == -1)
          {
            j = m;
            break;
          }
        }
      }
    }
    localObject = mArrayIndices;
    i = j;
    if (j >= localObject.length)
    {
      i = localObject.length;
      j = ROW_SIZE * 2;
      ROW_SIZE = j;
      mDidFillOnce = false;
      mLast = (i - 1);
      mArrayValues = Arrays.copyOf(mArrayValues, j);
      mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
      mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
    }
    mArrayIndices[i] = id;
    mArrayValues[i] = paramFloat;
    if (k != -1)
    {
      localObject = mArrayNextIndices;
      localObject[i] = localObject[k];
      localObject[k] = i;
    }
    else
    {
      mArrayNextIndices[i] = mHead;
      mHead = i;
    }
    usageInRowCount += 1;
    paramSolverVariable.addToRow(mRow);
    currentSize += 1;
    if (!mDidFillOnce) {
      mLast += 1;
    }
    i = mLast;
    paramSolverVariable = mArrayIndices;
    if (i >= paramSolverVariable.length)
    {
      mDidFillOnce = true;
      mLast = (paramSolverVariable.length - 1);
    }
  }
  
  public final void clear()
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      SolverVariable localSolverVariable = mCache.mIndexedVariables[mArrayIndices[i]];
      if (localSolverVariable != null) {
        localSolverVariable.removeFromRow(mRow);
      }
      i = mArrayNextIndices[i];
    }
    mHead = -1;
    mLast = -1;
    mDidFillOnce = false;
    currentSize = 0;
  }
  
  public boolean contains(SolverVariable paramSolverVariable)
  {
    int i = mHead;
    if (i == -1) {
      return false;
    }
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (mArrayIndices[i] == id) {
        return true;
      }
      i = mArrayNextIndices[i];
    }
    return false;
  }
  
  public void display()
  {
    int i = currentSize;
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
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      float[] arrayOfFloat = mArrayValues;
      arrayOfFloat[i] /= paramFloat;
      i = mArrayNextIndices[i];
    }
  }
  
  public final float get(SolverVariable paramSolverVariable)
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (mArrayIndices[i] == id) {
        return mArrayValues[i];
      }
      i = mArrayNextIndices[i];
    }
    return 0.0F;
  }
  
  public int getCurrentSize()
  {
    return currentSize;
  }
  
  public int getHead()
  {
    return mHead;
  }
  
  public final int getId(int paramInt)
  {
    return mArrayIndices[paramInt];
  }
  
  public final int getNextIndice(int paramInt)
  {
    return mArrayNextIndices[paramInt];
  }
  
  public SolverVariable getPivotCandidate()
  {
    Object localObject1 = candidate;
    if (localObject1 == null)
    {
      int i = mHead;
      int j = 0;
      Object localObject2;
      for (localObject1 = null; (i != -1) && (j < currentSize); localObject1 = localObject2)
      {
        localObject2 = localObject1;
        if (mArrayValues[i] < 0.0F)
        {
          SolverVariable localSolverVariable = mCache.mIndexedVariables[mArrayIndices[i]];
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (strength >= strength) {}
          }
          else
          {
            localObject2 = localSolverVariable;
          }
        }
        i = mArrayNextIndices[i];
        j++;
      }
      return (SolverVariable)localObject1;
    }
    return (SolverVariable)localObject1;
  }
  
  public final float getValue(int paramInt)
  {
    return mArrayValues[paramInt];
  }
  
  public SolverVariable getVariable(int paramInt)
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (j == paramInt) {
        return mCache.mIndexedVariables[mArrayIndices[i]];
      }
      i = mArrayNextIndices[i];
    }
    return null;
  }
  
  public float getVariableValue(int paramInt)
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (j == paramInt) {
        return mArrayValues[i];
      }
      i = mArrayNextIndices[i];
    }
    return 0.0F;
  }
  
  public boolean hasAtLeastOnePositiveVariable()
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (mArrayValues[i] > 0.0F) {
        return true;
      }
      i = mArrayNextIndices[i];
    }
    return false;
  }
  
  public int indexOf(SolverVariable paramSolverVariable)
  {
    int i = mHead;
    if (i == -1) {
      return -1;
    }
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      if (mArrayIndices[i] == id) {
        return i;
      }
      i = mArrayNextIndices[i];
    }
    return -1;
  }
  
  public void invert()
  {
    int i = mHead;
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      float[] arrayOfFloat = mArrayValues;
      arrayOfFloat[i] *= -1.0F;
      i = mArrayNextIndices[i];
    }
  }
  
  public final void put(SolverVariable paramSolverVariable, float paramFloat)
  {
    if (paramFloat == 0.0F)
    {
      remove(paramSolverVariable, true);
      return;
    }
    int i = mHead;
    if (i == -1)
    {
      mHead = 0;
      mArrayValues[0] = paramFloat;
      mArrayIndices[0] = id;
      mArrayNextIndices[0] = -1;
      usageInRowCount += 1;
      paramSolverVariable.addToRow(mRow);
      currentSize += 1;
      if (!mDidFillOnce)
      {
        i = mLast + 1;
        mLast = i;
        paramSolverVariable = mArrayIndices;
        if (i >= paramSolverVariable.length)
        {
          mDidFillOnce = true;
          mLast = (paramSolverVariable.length - 1);
        }
      }
      return;
    }
    int j = 0;
    int k = -1;
    int m;
    while ((i != -1) && (j < currentSize))
    {
      m = mArrayIndices[i];
      int n = id;
      if (m == n)
      {
        mArrayValues[i] = paramFloat;
        return;
      }
      if (m < n) {
        k = i;
      }
      i = mArrayNextIndices[i];
      j++;
    }
    i = mLast;
    if (mDidFillOnce)
    {
      arrayOfInt = mArrayIndices;
      if (arrayOfInt[i] != -1) {
        i = arrayOfInt.length;
      }
    }
    else
    {
      i++;
    }
    int[] arrayOfInt = mArrayIndices;
    j = i;
    if (i >= arrayOfInt.length)
    {
      j = i;
      if (currentSize < arrayOfInt.length) {
        for (m = 0;; m++)
        {
          arrayOfInt = mArrayIndices;
          j = i;
          if (m >= arrayOfInt.length) {
            break;
          }
          if (arrayOfInt[m] == -1)
          {
            j = m;
            break;
          }
        }
      }
    }
    arrayOfInt = mArrayIndices;
    i = j;
    if (j >= arrayOfInt.length)
    {
      i = arrayOfInt.length;
      j = ROW_SIZE * 2;
      ROW_SIZE = j;
      mDidFillOnce = false;
      mLast = (i - 1);
      mArrayValues = Arrays.copyOf(mArrayValues, j);
      mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
      mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
    }
    mArrayIndices[i] = id;
    mArrayValues[i] = paramFloat;
    if (k != -1)
    {
      arrayOfInt = mArrayNextIndices;
      arrayOfInt[i] = arrayOfInt[k];
      arrayOfInt[k] = i;
    }
    else
    {
      mArrayNextIndices[i] = mHead;
      mHead = i;
    }
    usageInRowCount += 1;
    paramSolverVariable.addToRow(mRow);
    i = currentSize + 1;
    currentSize = i;
    if (!mDidFillOnce) {
      mLast += 1;
    }
    paramSolverVariable = mArrayIndices;
    if (i >= paramSolverVariable.length) {
      mDidFillOnce = true;
    }
    if (mLast >= paramSolverVariable.length)
    {
      mDidFillOnce = true;
      mLast = (paramSolverVariable.length - 1);
    }
  }
  
  public final float remove(SolverVariable paramSolverVariable, boolean paramBoolean)
  {
    if (candidate == paramSolverVariable) {
      candidate = null;
    }
    int i = mHead;
    if (i == -1) {
      return 0.0F;
    }
    int j = 0;
    int k = -1;
    while ((i != -1) && (j < currentSize))
    {
      if (mArrayIndices[i] == id)
      {
        if (i == mHead)
        {
          mHead = mArrayNextIndices[i];
        }
        else
        {
          int[] arrayOfInt = mArrayNextIndices;
          arrayOfInt[k] = arrayOfInt[i];
        }
        if (paramBoolean) {
          paramSolverVariable.removeFromRow(mRow);
        }
        usageInRowCount -= 1;
        currentSize -= 1;
        mArrayIndices[i] = -1;
        if (mDidFillOnce) {
          mLast = i;
        }
        return mArrayValues[i];
      }
      int m = mArrayNextIndices[i];
      j++;
      k = i;
      i = m;
    }
    return 0.0F;
  }
  
  public int sizeInBytes()
  {
    return mArrayIndices.length * 4 * 3 + 0 + 36;
  }
  
  public String toString()
  {
    int i = mHead;
    Object localObject = "";
    for (int j = 0; (i != -1) && (j < currentSize); j++)
    {
      localObject = z2.t(z2.o((String)localObject, " -> "));
      ((StringBuilder)localObject).append(mArrayValues[i]);
      ((StringBuilder)localObject).append(" : ");
      localObject = z2.t(((StringBuilder)localObject).toString());
      ((StringBuilder)localObject).append(mCache.mIndexedVariables[mArrayIndices[i]]);
      localObject = ((StringBuilder)localObject).toString();
      i = mArrayNextIndices[i];
    }
    return (String)localObject;
  }
  
  public float use(ArrayRow paramArrayRow, boolean paramBoolean)
  {
    float f = get(variable);
    remove(variable, paramBoolean);
    ArrayRow.ArrayRowVariables localArrayRowVariables = variables;
    int i = localArrayRowVariables.getCurrentSize();
    for (int j = 0; j < i; j++)
    {
      paramArrayRow = localArrayRowVariables.getVariable(j);
      add(paramArrayRow, localArrayRowVariables.get(paramArrayRow) * f, paramBoolean);
    }
    return f;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.ArrayLinkedVariables
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */