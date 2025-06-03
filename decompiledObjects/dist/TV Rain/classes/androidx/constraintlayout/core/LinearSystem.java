package androidx.constraintlayout.core;

import a;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import z2;

public class LinearSystem
{
  public static long ARRAY_ROW_CREATION = 0L;
  public static final boolean DEBUG = false;
  private static final boolean DEBUG_CONSTRAINTS = false;
  public static final boolean FULL_DEBUG = false;
  public static final boolean MEASURE = false;
  public static long OPTIMIZED_ARRAY_ROW_CREATION = 0L;
  public static boolean OPTIMIZED_ENGINE = false;
  private static int POOL_SIZE = 1000;
  public static boolean SIMPLIFY_SYNONYMS = true;
  public static boolean SKIP_COLUMNS = true;
  public static boolean USE_BASIC_SYNONYMS = true;
  public static boolean USE_DEPENDENCY_ORDERING = false;
  public static boolean USE_SYNONYMS = true;
  public static Metrics sMetrics;
  private int TABLE_SIZE = 32;
  public boolean graphOptimizer = false;
  public boolean hasSimpleDefinition = false;
  private boolean[] mAlreadyTestedCandidates = new boolean[32];
  public final Cache mCache;
  private Row mGoal;
  private int mMaxColumns = 32;
  private int mMaxRows = 32;
  public int mNumColumns = 1;
  public int mNumRows = 0;
  private SolverVariable[] mPoolVariables = new SolverVariable[POOL_SIZE];
  private int mPoolVariablesCount = 0;
  public ArrayRow[] mRows = null;
  private Row mTempGoal;
  private HashMap<String, SolverVariable> mVariables = null;
  public int mVariablesID = 0;
  public boolean newgraphOptimizer = false;
  
  public LinearSystem()
  {
    releaseRows();
    Cache localCache = new Cache();
    mCache = localCache;
    mGoal = new PriorityGoalRow(localCache);
    if (OPTIMIZED_ENGINE) {
      mTempGoal = new ValuesRow(localCache);
    } else {
      mTempGoal = new ArrayRow(localCache);
    }
  }
  
  private SolverVariable acquireSolverVariable(SolverVariable.Type paramType, String paramString)
  {
    SolverVariable localSolverVariable = (SolverVariable)mCache.solverVariablePool.acquire();
    if (localSolverVariable == null)
    {
      localSolverVariable = new SolverVariable(paramType, paramString);
      localSolverVariable.setType(paramType, paramString);
      paramType = localSolverVariable;
    }
    else
    {
      localSolverVariable.reset();
      localSolverVariable.setType(paramType, paramString);
      paramType = localSolverVariable;
    }
    int i = mPoolVariablesCount;
    int j = POOL_SIZE;
    if (i >= j)
    {
      j *= 2;
      POOL_SIZE = j;
      mPoolVariables = ((SolverVariable[])Arrays.copyOf(mPoolVariables, j));
    }
    paramString = mPoolVariables;
    j = mPoolVariablesCount;
    mPoolVariablesCount = (j + 1);
    paramString[j] = paramType;
    return paramType;
  }
  
  private void addError(ArrayRow paramArrayRow)
  {
    paramArrayRow.addError(this, 0);
  }
  
  private final void addRow(ArrayRow paramArrayRow)
  {
    Object localObject;
    int i;
    if ((SIMPLIFY_SYNONYMS) && (isSimpleDefinition))
    {
      variable.setFinalValue(this, constantValue);
    }
    else
    {
      localObject = mRows;
      i = mNumRows;
      localObject[i] = paramArrayRow;
      localObject = variable;
      definitionId = i;
      mNumRows = (i + 1);
      ((SolverVariable)localObject).updateReferencesWithNewDefinition(this, paramArrayRow);
    }
    if ((SIMPLIFY_SYNONYMS) && (hasSimpleDefinition))
    {
      int j;
      for (i = 0; i < mNumRows; i = j + 1)
      {
        if (mRows[i] == null) {
          System.out.println("WTF");
        }
        paramArrayRow = mRows[i];
        j = i;
        if (paramArrayRow != null)
        {
          j = i;
          if (isSimpleDefinition)
          {
            variable.setFinalValue(this, constantValue);
            if (OPTIMIZED_ENGINE) {
              mCache.optimizedArrayRowPool.release(paramArrayRow);
            } else {
              mCache.arrayRowPool.release(paramArrayRow);
            }
            mRows[i] = null;
            j = i + 1;
            int k = j;
            int m;
            for (;;)
            {
              m = mNumRows;
              if (j >= m) {
                break;
              }
              localObject = mRows;
              k = j - 1;
              paramArrayRow = localObject[j];
              localObject[k] = paramArrayRow;
              paramArrayRow = variable;
              if (definitionId == j) {
                definitionId = k;
              }
              k = j;
              j++;
            }
            if (k < m) {
              mRows[k] = null;
            }
            mNumRows = (m - 1);
            j = i - 1;
          }
        }
      }
      hasSimpleDefinition = false;
    }
  }
  
  private void addSingleError(ArrayRow paramArrayRow, int paramInt)
  {
    addSingleError(paramArrayRow, paramInt, 0);
  }
  
  private void computeValues()
  {
    for (int i = 0; i < mNumRows; i++)
    {
      ArrayRow localArrayRow = mRows[i];
      variable.computedValue = constantValue;
    }
  }
  
  public static ArrayRow createRowDimensionPercent(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat)
  {
    return paramLinearSystem.createRow().createRowDimensionPercent(paramSolverVariable1, paramSolverVariable2, paramFloat);
  }
  
  private SolverVariable createVariable(String paramString, SolverVariable.Type paramType)
  {
    Metrics localMetrics = sMetrics;
    if (localMetrics != null) {
      variables += 1L;
    }
    if (mNumColumns + 1 >= mMaxColumns) {
      increaseTableSize();
    }
    paramType = acquireSolverVariable(paramType, null);
    paramType.setName(paramString);
    int i = mVariablesID + 1;
    mVariablesID = i;
    mNumColumns += 1;
    id = i;
    if (mVariables == null) {
      mVariables = new HashMap();
    }
    mVariables.put(paramString, paramType);
    mCache.mIndexedVariables[mVariablesID] = paramType;
    return paramType;
  }
  
  private void displayRows()
  {
    displaySolverVariables();
    Object localObject = "";
    for (int i = 0; i < mNumRows; i++)
    {
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(mRows[i]);
      localObject = z2.o(((StringBuilder)localObject).toString(), "\n");
    }
    localObject = z2.t((String)localObject);
    ((StringBuilder)localObject).append(mGoal);
    ((StringBuilder)localObject).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    System.out.println((String)localObject);
  }
  
  private void displaySolverVariables()
  {
    Object localObject = z2.t("Display Rows (");
    ((StringBuilder)localObject).append(mNumRows);
    ((StringBuilder)localObject).append("x");
    localObject = z2.q((StringBuilder)localObject, mNumColumns, ")\n");
    System.out.println((String)localObject);
  }
  
  private int enforceBFS(Row paramRow)
    throws Exception
  {
    for (int i = 0; i < mNumRows; i++)
    {
      paramRow = mRows[i];
      if ((variable.mType != SolverVariable.Type.UNRESTRICTED) && (constantValue < 0.0F))
      {
        i = 1;
        break label55;
      }
    }
    i = 0;
    label55:
    if (i != 0)
    {
      int j = 0;
      i = 0;
      while (j == 0)
      {
        paramRow = sMetrics;
        if (paramRow != null) {
          bfs += 1L;
        }
        int k = i + 1;
        float f1 = Float.MAX_VALUE;
        i = 0;
        int m = -1;
        int n = -1;
        int i4;
        Object localObject;
        for (int i1 = 0; i < mNumRows; i1 = i4)
        {
          paramRow = mRows[i];
          float f2;
          int i2;
          int i3;
          if (variable.mType == SolverVariable.Type.UNRESTRICTED)
          {
            f2 = f1;
            i2 = m;
            i3 = n;
            i4 = i1;
          }
          else if (isSimpleDefinition)
          {
            f2 = f1;
            i2 = m;
            i3 = n;
            i4 = i1;
          }
          else
          {
            f2 = f1;
            i2 = m;
            i3 = n;
            i4 = i1;
            if (constantValue < 0.0F)
            {
              int i6;
              float f3;
              if (SKIP_COLUMNS)
              {
                int i5 = variables.getCurrentSize();
                i6 = 0;
                for (;;)
                {
                  f2 = f1;
                  i2 = m;
                  i3 = n;
                  i4 = i1;
                  if (i6 >= i5) {
                    break;
                  }
                  localObject = variables.getVariable(i6);
                  f3 = variables.get((SolverVariable)localObject);
                  if (f3 <= 0.0F)
                  {
                    f2 = f1;
                    i2 = m;
                    i3 = n;
                    i4 = i1;
                  }
                  else
                  {
                    i3 = 0;
                    i7 = m;
                    m = i3;
                    for (;;)
                    {
                      f2 = f1;
                      i2 = i7;
                      i3 = n;
                      i4 = i1;
                      if (m >= 9) {
                        break;
                      }
                      f2 = strengthVector[m] / f3;
                      if ((f2 >= f1) || (m != i1))
                      {
                        i3 = i1;
                        if (m <= i1) {}
                      }
                      else
                      {
                        n = id;
                        i3 = m;
                        i7 = i;
                        f1 = f2;
                      }
                      m++;
                      i1 = i3;
                    }
                  }
                  i6++;
                  f1 = f2;
                  m = i2;
                  n = i3;
                  i1 = i4;
                }
              }
              int i7 = 1;
              for (;;)
              {
                f2 = f1;
                i2 = m;
                i3 = n;
                i4 = i1;
                if (i7 >= mNumColumns) {
                  break;
                }
                localObject = mCache.mIndexedVariables[i7];
                f3 = variables.get((SolverVariable)localObject);
                if (f3 <= 0.0F)
                {
                  f2 = f1;
                  i2 = m;
                  i4 = n;
                  i6 = i1;
                }
                else
                {
                  i2 = 0;
                  i3 = m;
                  m = i2;
                  for (;;)
                  {
                    f2 = f1;
                    i2 = i3;
                    i4 = n;
                    i6 = i1;
                    if (m >= 9) {
                      break;
                    }
                    f2 = strengthVector[m] / f3;
                    if ((f2 >= f1) || (m != i1))
                    {
                      i2 = i1;
                      if (m <= i1) {}
                    }
                    else
                    {
                      n = i7;
                      i2 = m;
                      i3 = i;
                      f1 = f2;
                    }
                    m++;
                    i1 = i2;
                  }
                }
                i7++;
                f1 = f2;
                m = i2;
                n = i4;
                i1 = i6;
              }
            }
          }
          i++;
          f1 = f2;
          m = i2;
          n = i3;
        }
        if (m != -1)
        {
          paramRow = mRows[m];
          variable.definitionId = -1;
          localObject = sMetrics;
          if (localObject != null) {
            pivots += 1L;
          }
          paramRow.pivot(mCache.mIndexedVariables[n]);
          localObject = variable;
          definitionId = m;
          ((SolverVariable)localObject).updateReferencesWithNewDefinition(this, paramRow);
        }
        else
        {
          j = 1;
        }
        i = k;
        if (k > mNumColumns / 2)
        {
          j = 1;
          i = k;
        }
      }
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  private String getDisplaySize(int paramInt)
  {
    int i = paramInt * 4;
    int j = i / 1024;
    paramInt = j / 1024;
    if (paramInt > 0) {
      return a.g("", paramInt, " Mb");
    }
    if (j > 0) {
      return a.g("", j, " Kb");
    }
    return a.g("", i, " bytes");
  }
  
  private String getDisplayStrength(int paramInt)
  {
    if (paramInt == 1) {
      return "LOW";
    }
    if (paramInt == 2) {
      return "MEDIUM";
    }
    if (paramInt == 3) {
      return "HIGH";
    }
    if (paramInt == 4) {
      return "HIGHEST";
    }
    if (paramInt == 5) {
      return "EQUALITY";
    }
    if (paramInt == 8) {
      return "FIXED";
    }
    if (paramInt == 6) {
      return "BARRIER";
    }
    return "NONE";
  }
  
  public static Metrics getMetrics()
  {
    return sMetrics;
  }
  
  private void increaseTableSize()
  {
    int i = TABLE_SIZE * 2;
    TABLE_SIZE = i;
    mRows = ((ArrayRow[])Arrays.copyOf(mRows, i));
    Object localObject = mCache;
    mIndexedVariables = ((SolverVariable[])Arrays.copyOf(mIndexedVariables, TABLE_SIZE));
    i = TABLE_SIZE;
    mAlreadyTestedCandidates = new boolean[i];
    mMaxColumns = i;
    mMaxRows = i;
    localObject = sMetrics;
    if (localObject != null)
    {
      tableSizeIncrease += 1L;
      maxTableSize = Math.max(maxTableSize, i);
      localObject = sMetrics;
      lastTableSize = maxTableSize;
    }
  }
  
  private final int optimize(Row paramRow, boolean paramBoolean)
  {
    Object localObject1 = sMetrics;
    if (localObject1 != null) {
      optimize += 1L;
    }
    for (int i = 0; i < mNumColumns; i++) {
      mAlreadyTestedCandidates[i] = false;
    }
    int j = 0;
    i = j;
    while (j == 0)
    {
      localObject1 = sMetrics;
      if (localObject1 != null) {
        iterations += 1L;
      }
      int k = i + 1;
      if (k >= mNumColumns * 2) {
        return k;
      }
      if (paramRow.getKey() != null) {
        mAlreadyTestedCandidates[getKeyid] = true;
      }
      localObject1 = paramRow.getPivotCandidate(this, mAlreadyTestedCandidates);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = mAlreadyTestedCandidates;
        i = id;
        if (localObject2[i] != 0) {
          return k;
        }
        localObject2[i] = 1;
      }
      if (localObject1 != null)
      {
        float f1 = Float.MAX_VALUE;
        i = 0;
        int n;
        for (int m = -1; i < mNumRows; m = n)
        {
          localObject2 = mRows[i];
          float f2;
          if (variable.mType == SolverVariable.Type.UNRESTRICTED)
          {
            f2 = f1;
            n = m;
          }
          else if (isSimpleDefinition)
          {
            f2 = f1;
            n = m;
          }
          else
          {
            f2 = f1;
            n = m;
            if (((ArrayRow)localObject2).hasVariable((SolverVariable)localObject1))
            {
              float f3 = variables.get((SolverVariable)localObject1);
              f2 = f1;
              n = m;
              if (f3 < 0.0F)
              {
                f3 = -constantValue / f3;
                f2 = f1;
                n = m;
                if (f3 < f1)
                {
                  n = i;
                  f2 = f3;
                }
              }
            }
          }
          i++;
          f1 = f2;
        }
        i = k;
        if (m > -1)
        {
          localObject2 = mRows[m];
          variable.definitionId = -1;
          Metrics localMetrics = sMetrics;
          if (localMetrics != null) {
            pivots += 1L;
          }
          ((ArrayRow)localObject2).pivot((SolverVariable)localObject1);
          localObject1 = variable;
          definitionId = m;
          ((SolverVariable)localObject1).updateReferencesWithNewDefinition(this, (ArrayRow)localObject2);
          i = k;
        }
      }
      else
      {
        j = 1;
        i = k;
      }
    }
    return i;
  }
  
  private void releaseRows()
  {
    boolean bool = OPTIMIZED_ENGINE;
    int i = 0;
    int j = 0;
    ArrayRow localArrayRow;
    if (bool) {
      for (i = j; i < mNumRows; i++)
      {
        localArrayRow = mRows[i];
        if (localArrayRow != null) {
          mCache.optimizedArrayRowPool.release(localArrayRow);
        }
        mRows[i] = null;
      }
    }
    while (i < mNumRows)
    {
      localArrayRow = mRows[i];
      if (localArrayRow != null) {
        mCache.arrayRowPool.release(localArrayRow);
      }
      mRows[i] = null;
      i++;
    }
  }
  
  public void addCenterPoint(ConstraintWidget paramConstraintWidget1, ConstraintWidget paramConstraintWidget2, float paramFloat, int paramInt)
  {
    ConstraintAnchor.Type localType = ConstraintAnchor.Type.LEFT;
    SolverVariable localSolverVariable1 = createObjectVariable(paramConstraintWidget1.getAnchor(localType));
    Object localObject1 = ConstraintAnchor.Type.TOP;
    SolverVariable localSolverVariable2 = createObjectVariable(paramConstraintWidget1.getAnchor((ConstraintAnchor.Type)localObject1));
    Object localObject2 = ConstraintAnchor.Type.RIGHT;
    SolverVariable localSolverVariable3 = createObjectVariable(paramConstraintWidget1.getAnchor((ConstraintAnchor.Type)localObject2));
    Object localObject3 = ConstraintAnchor.Type.BOTTOM;
    SolverVariable localSolverVariable4 = createObjectVariable(paramConstraintWidget1.getAnchor((ConstraintAnchor.Type)localObject3));
    paramConstraintWidget1 = createObjectVariable(paramConstraintWidget2.getAnchor(localType));
    localObject1 = createObjectVariable(paramConstraintWidget2.getAnchor((ConstraintAnchor.Type)localObject1));
    localObject2 = createObjectVariable(paramConstraintWidget2.getAnchor((ConstraintAnchor.Type)localObject2));
    localObject3 = createObjectVariable(paramConstraintWidget2.getAnchor((ConstraintAnchor.Type)localObject3));
    paramConstraintWidget2 = createRow();
    double d1 = paramFloat;
    double d2 = Math.sin(d1);
    double d3 = paramInt;
    paramConstraintWidget2.createRowWithAngle(localSolverVariable2, localSolverVariable4, (SolverVariable)localObject1, (SolverVariable)localObject3, (float)(d2 * d3));
    addConstraint(paramConstraintWidget2);
    paramConstraintWidget2 = createRow();
    paramConstraintWidget2.createRowWithAngle(localSolverVariable1, localSolverVariable3, paramConstraintWidget1, (SolverVariable)localObject2, (float)(Math.cos(d1) * d3));
    addConstraint(paramConstraintWidget2);
  }
  
  public void addCentering(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2, int paramInt3)
  {
    ArrayRow localArrayRow = createRow();
    localArrayRow.createRowCentering(paramSolverVariable1, paramSolverVariable2, paramInt1, paramFloat, paramSolverVariable3, paramSolverVariable4, paramInt2);
    if (paramInt3 != 8) {
      localArrayRow.addError(this, paramInt3);
    }
    addConstraint(localArrayRow);
  }
  
  public void addConstraint(ArrayRow paramArrayRow)
  {
    if (paramArrayRow == null) {
      return;
    }
    Object localObject = sMetrics;
    if (localObject != null)
    {
      constraints += 1L;
      if (isSimpleDefinition) {
        simpleconstraints += 1L;
      }
    }
    int i = mNumRows;
    int j = 1;
    if ((i + 1 >= mMaxRows) || (mNumColumns + 1 >= mMaxColumns)) {
      increaseTableSize();
    }
    i = 0;
    if (!isSimpleDefinition)
    {
      paramArrayRow.updateFromSystem(this);
      if (paramArrayRow.isEmpty()) {
        return;
      }
      paramArrayRow.ensurePositiveConstant();
      if (paramArrayRow.chooseSubject(this))
      {
        localObject = createExtraVariable();
        variable = ((SolverVariable)localObject);
        i = mNumRows;
        addRow(paramArrayRow);
        if (mNumRows == i + 1)
        {
          mTempGoal.initFromRow(paramArrayRow);
          optimize(mTempGoal, true);
          i = j;
          if (definitionId != -1) {
            break label286;
          }
          if (variable == localObject)
          {
            localObject = paramArrayRow.pickPivot((SolverVariable)localObject);
            if (localObject != null)
            {
              Metrics localMetrics = sMetrics;
              if (localMetrics != null) {
                pivots += 1L;
              }
              paramArrayRow.pivot((SolverVariable)localObject);
            }
          }
          if (!isSimpleDefinition) {
            variable.updateReferencesWithNewDefinition(this, paramArrayRow);
          }
          if (OPTIMIZED_ENGINE) {
            mCache.optimizedArrayRowPool.release(paramArrayRow);
          } else {
            mCache.arrayRowPool.release(paramArrayRow);
          }
          mNumRows -= 1;
          i = j;
          break label286;
        }
      }
      i = 0;
      label286:
      if (!paramArrayRow.hasKeyVariable()) {
        return;
      }
    }
    if (i == 0) {
      addRow(paramArrayRow);
    }
  }
  
  public ArrayRow addEquality(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    if ((USE_BASIC_SYNONYMS) && (paramInt2 == 8) && (isFinalValue) && (definitionId == -1))
    {
      paramSolverVariable1.setFinalValue(this, computedValue + paramInt1);
      return null;
    }
    ArrayRow localArrayRow = createRow();
    localArrayRow.createRowEquals(paramSolverVariable1, paramSolverVariable2, paramInt1);
    if (paramInt2 != 8) {
      localArrayRow.addError(this, paramInt2);
    }
    addConstraint(localArrayRow);
    return localArrayRow;
  }
  
  public void addEquality(SolverVariable paramSolverVariable, int paramInt)
  {
    Object localObject;
    if ((USE_BASIC_SYNONYMS) && (definitionId == -1))
    {
      float f = paramInt;
      paramSolverVariable.setFinalValue(this, f);
      for (paramInt = 0; paramInt < mVariablesID + 1; paramInt++)
      {
        localObject = mCache.mIndexedVariables[paramInt];
        if ((localObject != null) && (isSynonym) && (synonym == id)) {
          ((SolverVariable)localObject).setFinalValue(this, synonymDelta + f);
        }
      }
      return;
    }
    int i = definitionId;
    if (i != -1)
    {
      localObject = mRows[i];
      if (isSimpleDefinition)
      {
        constantValue = paramInt;
      }
      else if (variables.getCurrentSize() == 0)
      {
        isSimpleDefinition = true;
        constantValue = paramInt;
      }
      else
      {
        localObject = createRow();
        ((ArrayRow)localObject).createRowEquals(paramSolverVariable, paramInt);
        addConstraint((ArrayRow)localObject);
      }
    }
    else
    {
      localObject = createRow();
      ((ArrayRow)localObject).createRowDefinition(paramSolverVariable, paramInt);
      addConstraint((ArrayRow)localObject);
    }
  }
  
  public void addGreaterBarrier(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean)
  {
    ArrayRow localArrayRow = createRow();
    SolverVariable localSolverVariable = createSlackVariable();
    strength = 0;
    localArrayRow.createRowGreaterThan(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt);
    addConstraint(localArrayRow);
  }
  
  public void addGreaterThan(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    ArrayRow localArrayRow = createRow();
    SolverVariable localSolverVariable = createSlackVariable();
    strength = 0;
    localArrayRow.createRowGreaterThan(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt1);
    if (paramInt2 != 8) {
      addSingleError(localArrayRow, (int)(variables.get(localSolverVariable) * -1.0F), paramInt2);
    }
    addConstraint(localArrayRow);
  }
  
  public void addLowerBarrier(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean)
  {
    ArrayRow localArrayRow = createRow();
    SolverVariable localSolverVariable = createSlackVariable();
    strength = 0;
    localArrayRow.createRowLowerThan(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt);
    addConstraint(localArrayRow);
  }
  
  public void addLowerThan(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2)
  {
    ArrayRow localArrayRow = createRow();
    SolverVariable localSolverVariable = createSlackVariable();
    strength = 0;
    localArrayRow.createRowLowerThan(paramSolverVariable1, paramSolverVariable2, localSolverVariable, paramInt1);
    if (paramInt2 != 8) {
      addSingleError(localArrayRow, (int)(variables.get(localSolverVariable) * -1.0F), paramInt2);
    }
    addConstraint(localArrayRow);
  }
  
  public void addRatio(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat, int paramInt)
  {
    ArrayRow localArrayRow = createRow();
    localArrayRow.createRowDimensionRatio(paramSolverVariable1, paramSolverVariable2, paramSolverVariable3, paramSolverVariable4, paramFloat);
    if (paramInt != 8) {
      localArrayRow.addError(this, paramInt);
    }
    addConstraint(localArrayRow);
  }
  
  public void addSingleError(ArrayRow paramArrayRow, int paramInt1, int paramInt2)
  {
    paramArrayRow.addSingleError(createErrorVariable(paramInt2, null), paramInt1);
  }
  
  public void addSynonym(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt)
  {
    if ((definitionId == -1) && (paramInt == 0))
    {
      SolverVariable localSolverVariable = paramSolverVariable2;
      if (isSynonym) {
        localSolverVariable = mCache.mIndexedVariables[synonym];
      }
      if (isSynonym) {
        paramSolverVariable1 = mCache.mIndexedVariables[synonym];
      } else {
        paramSolverVariable1.setSynonym(this, localSolverVariable, 0.0F);
      }
    }
    else
    {
      addEquality(paramSolverVariable1, paramSolverVariable2, paramInt, 8);
    }
  }
  
  public final void cleanupRows()
  {
    int j;
    for (int i = 0; i < mNumRows; i = j + 1)
    {
      ArrayRow localArrayRow = mRows[i];
      if (variables.getCurrentSize() == 0) {
        isSimpleDefinition = true;
      }
      j = i;
      if (isSimpleDefinition)
      {
        Object localObject = variable;
        computedValue = constantValue;
        ((SolverVariable)localObject).removeFromRow(localArrayRow);
        int k;
        for (j = i;; j = k)
        {
          k = mNumRows;
          if (j >= k - 1) {
            break;
          }
          localObject = mRows;
          k = j + 1;
          localObject[j] = localObject[k];
        }
        mRows[(k - 1)] = null;
        mNumRows = (k - 1);
        j = i - 1;
        if (OPTIMIZED_ENGINE) {
          mCache.optimizedArrayRowPool.release(localArrayRow);
        } else {
          mCache.arrayRowPool.release(localArrayRow);
        }
      }
    }
  }
  
  public SolverVariable createErrorVariable(int paramInt, String paramString)
  {
    Metrics localMetrics = sMetrics;
    if (localMetrics != null) {
      errors += 1L;
    }
    if (mNumColumns + 1 >= mMaxColumns) {
      increaseTableSize();
    }
    paramString = acquireSolverVariable(SolverVariable.Type.ERROR, paramString);
    int i = mVariablesID + 1;
    mVariablesID = i;
    mNumColumns += 1;
    id = i;
    strength = paramInt;
    mCache.mIndexedVariables[i] = paramString;
    mGoal.addError(paramString);
    return paramString;
  }
  
  public SolverVariable createExtraVariable()
  {
    Object localObject = sMetrics;
    if (localObject != null) {
      extravariables += 1L;
    }
    if (mNumColumns + 1 >= mMaxColumns) {
      increaseTableSize();
    }
    localObject = acquireSolverVariable(SolverVariable.Type.SLACK, null);
    int i = mVariablesID + 1;
    mVariablesID = i;
    mNumColumns += 1;
    id = i;
    mCache.mIndexedVariables[i] = localObject;
    return (SolverVariable)localObject;
  }
  
  public SolverVariable createObjectVariable(Object paramObject)
  {
    Object localObject = null;
    if (paramObject == null) {
      return null;
    }
    if (mNumColumns + 1 >= mMaxColumns) {
      increaseTableSize();
    }
    if ((paramObject instanceof ConstraintAnchor))
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)paramObject;
      localObject = localConstraintAnchor.getSolverVariable();
      paramObject = localObject;
      if (localObject == null)
      {
        localConstraintAnchor.resetSolverVariable(mCache);
        paramObject = localConstraintAnchor.getSolverVariable();
      }
      int i = id;
      if ((i != -1) && (i <= mVariablesID))
      {
        localObject = paramObject;
        if (mCache.mIndexedVariables[i] != null) {}
      }
      else
      {
        if (i != -1) {
          ((SolverVariable)paramObject).reset();
        }
        i = mVariablesID + 1;
        mVariablesID = i;
        mNumColumns += 1;
        id = i;
        mType = SolverVariable.Type.UNRESTRICTED;
        mCache.mIndexedVariables[i] = paramObject;
        localObject = paramObject;
      }
    }
    return (SolverVariable)localObject;
  }
  
  public ArrayRow createRow()
  {
    Object localObject;
    if (OPTIMIZED_ENGINE)
    {
      localObject = (ArrayRow)mCache.optimizedArrayRowPool.acquire();
      if (localObject == null)
      {
        localObject = new ValuesRow(mCache);
        OPTIMIZED_ARRAY_ROW_CREATION += 1L;
      }
      else
      {
        ((ArrayRow)localObject).reset();
      }
    }
    else
    {
      localObject = (ArrayRow)mCache.arrayRowPool.acquire();
      if (localObject == null)
      {
        localObject = new ArrayRow(mCache);
        ARRAY_ROW_CREATION += 1L;
      }
      else
      {
        ((ArrayRow)localObject).reset();
      }
    }
    SolverVariable.increaseErrorId();
    return (ArrayRow)localObject;
  }
  
  public SolverVariable createSlackVariable()
  {
    Object localObject = sMetrics;
    if (localObject != null) {
      slackvariables += 1L;
    }
    if (mNumColumns + 1 >= mMaxColumns) {
      increaseTableSize();
    }
    localObject = acquireSolverVariable(SolverVariable.Type.SLACK, null);
    int i = mVariablesID + 1;
    mVariablesID = i;
    mNumColumns += 1;
    id = i;
    mCache.mIndexedVariables[i] = localObject;
    return (SolverVariable)localObject;
  }
  
  public void displayReadableRows()
  {
    displaySolverVariables();
    Object localObject1 = z2.q(z2.t(" num vars "), mVariablesID, "\n");
    int i = 0;
    int j = 0;
    SolverVariable localSolverVariable;
    while (j < mVariablesID + 1)
    {
      localSolverVariable = mCache.mIndexedVariables[j];
      localObject2 = localObject1;
      if (localSolverVariable != null)
      {
        localObject2 = localObject1;
        if (isFinalValue)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(" $[");
          ((StringBuilder)localObject2).append(j);
          ((StringBuilder)localObject2).append("] => ");
          ((StringBuilder)localObject2).append(localSolverVariable);
          ((StringBuilder)localObject2).append(" = ");
          ((StringBuilder)localObject2).append(computedValue);
          ((StringBuilder)localObject2).append("\n");
          localObject2 = ((StringBuilder)localObject2).toString();
        }
      }
      j++;
      localObject1 = localObject2;
    }
    localObject1 = z2.o((String)localObject1, "\n");
    j = 0;
    while (j < mVariablesID + 1)
    {
      Object localObject3 = mCache.mIndexedVariables;
      localSolverVariable = localObject3[j];
      localObject2 = localObject1;
      if (localSolverVariable != null)
      {
        localObject2 = localObject1;
        if (isSynonym)
        {
          localObject3 = localObject3[synonym];
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(" ~[");
          ((StringBuilder)localObject2).append(j);
          ((StringBuilder)localObject2).append("] => ");
          ((StringBuilder)localObject2).append(localSolverVariable);
          ((StringBuilder)localObject2).append(" = ");
          ((StringBuilder)localObject2).append(localObject3);
          ((StringBuilder)localObject2).append(" + ");
          ((StringBuilder)localObject2).append(synonymDelta);
          ((StringBuilder)localObject2).append("\n");
          localObject2 = ((StringBuilder)localObject2).toString();
        }
      }
      j++;
      localObject1 = localObject2;
    }
    localObject1 = z2.o((String)localObject1, "\n\n #  ");
    for (j = i; j < mNumRows; j++)
    {
      localObject1 = z2.t((String)localObject1);
      ((StringBuilder)localObject1).append(mRows[j].toReadableString());
      localObject1 = z2.o(((StringBuilder)localObject1).toString(), "\n #  ");
    }
    Object localObject2 = localObject1;
    if (mGoal != null)
    {
      localObject1 = z2.u((String)localObject1, "Goal: ");
      ((StringBuilder)localObject1).append(mGoal);
      ((StringBuilder)localObject1).append("\n");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    System.out.println((String)localObject2);
  }
  
  public void displaySystemInformation()
  {
    int i = 0;
    for (int j = i; i < TABLE_SIZE; j = k)
    {
      localObject = mRows[i];
      k = j;
      if (localObject != null) {
        k = j + ((ArrayRow)localObject).sizeInBytes();
      }
      i++;
    }
    int m = 0;
    for (i = m; m < mNumRows; i = k)
    {
      localObject = mRows[m];
      k = i;
      if (localObject != null) {
        k = i + ((ArrayRow)localObject).sizeInBytes();
      }
      m++;
    }
    Object localObject = System.out;
    StringBuilder localStringBuilder = z2.t("Linear System -> Table size: ");
    localStringBuilder.append(TABLE_SIZE);
    localStringBuilder.append(" (");
    int k = TABLE_SIZE;
    localStringBuilder.append(getDisplaySize(k * k));
    localStringBuilder.append(") -- row sizes: ");
    localStringBuilder.append(getDisplaySize(j));
    localStringBuilder.append(", actual size: ");
    localStringBuilder.append(getDisplaySize(i));
    localStringBuilder.append(" rows: ");
    localStringBuilder.append(mNumRows);
    localStringBuilder.append("/");
    localStringBuilder.append(mMaxRows);
    localStringBuilder.append(" cols: ");
    localStringBuilder.append(mNumColumns);
    localStringBuilder.append("/");
    localStringBuilder.append(mMaxColumns);
    localStringBuilder.append(" ");
    localStringBuilder.append(0);
    localStringBuilder.append(" occupied cells, ");
    localStringBuilder.append(getDisplaySize(0));
    ((PrintStream)localObject).println(localStringBuilder.toString());
  }
  
  public void displayVariablesReadableRows()
  {
    displaySolverVariables();
    Object localObject1 = "";
    int i = 0;
    while (i < mNumRows)
    {
      Object localObject2 = localObject1;
      if (mRows[i].variable.mType == SolverVariable.Type.UNRESTRICTED)
      {
        localObject1 = z2.t((String)localObject1);
        ((StringBuilder)localObject1).append(mRows[i].toReadableString());
        localObject2 = z2.o(((StringBuilder)localObject1).toString(), "\n");
      }
      i++;
      localObject1 = localObject2;
    }
    localObject1 = z2.t((String)localObject1);
    ((StringBuilder)localObject1).append(mGoal);
    ((StringBuilder)localObject1).append("\n");
    localObject1 = ((StringBuilder)localObject1).toString();
    System.out.println((String)localObject1);
  }
  
  public void fillMetrics(Metrics paramMetrics)
  {
    sMetrics = paramMetrics;
  }
  
  public Cache getCache()
  {
    return mCache;
  }
  
  public Row getGoal()
  {
    return mGoal;
  }
  
  public int getMemoryUsed()
  {
    int i = 0;
    int k;
    for (int j = 0; i < mNumRows; j = k)
    {
      ArrayRow localArrayRow = mRows[i];
      k = j;
      if (localArrayRow != null) {
        k = localArrayRow.sizeInBytes() + j;
      }
      i++;
    }
    return j;
  }
  
  public int getNumEquations()
  {
    return mNumRows;
  }
  
  public int getNumVariables()
  {
    return mVariablesID;
  }
  
  public int getObjectVariableValue(Object paramObject)
  {
    paramObject = ((ConstraintAnchor)paramObject).getSolverVariable();
    if (paramObject != null) {
      return (int)(computedValue + 0.5F);
    }
    return 0;
  }
  
  public ArrayRow getRow(int paramInt)
  {
    return mRows[paramInt];
  }
  
  public float getValueFor(String paramString)
  {
    paramString = getVariable(paramString, SolverVariable.Type.UNRESTRICTED);
    if (paramString == null) {
      return 0.0F;
    }
    return computedValue;
  }
  
  public SolverVariable getVariable(String paramString, SolverVariable.Type paramType)
  {
    if (mVariables == null) {
      mVariables = new HashMap();
    }
    SolverVariable localSolverVariable1 = (SolverVariable)mVariables.get(paramString);
    SolverVariable localSolverVariable2 = localSolverVariable1;
    if (localSolverVariable1 == null) {
      localSolverVariable2 = createVariable(paramString, paramType);
    }
    return localSolverVariable2;
  }
  
  public void minimize()
    throws Exception
  {
    Metrics localMetrics = sMetrics;
    if (localMetrics != null) {
      minimize += 1L;
    }
    if (mGoal.isEmpty())
    {
      computeValues();
      return;
    }
    if ((!graphOptimizer) && (!newgraphOptimizer))
    {
      minimizeGoal(mGoal);
    }
    else
    {
      localMetrics = sMetrics;
      if (localMetrics != null) {
        graphOptimizer += 1L;
      }
      int i = 0;
      for (int j = 0; j < mNumRows; j++) {
        if (!mRows[j].isSimpleDefinition)
        {
          j = i;
          break label118;
        }
      }
      j = 1;
      label118:
      if (j == 0)
      {
        minimizeGoal(mGoal);
      }
      else
      {
        localMetrics = sMetrics;
        if (localMetrics != null) {
          fullySolved += 1L;
        }
        computeValues();
      }
    }
  }
  
  public void minimizeGoal(Row paramRow)
    throws Exception
  {
    Metrics localMetrics = sMetrics;
    if (localMetrics != null)
    {
      minimizeGoal += 1L;
      maxVariables = Math.max(maxVariables, mNumColumns);
      localMetrics = sMetrics;
      maxRows = Math.max(maxRows, mNumRows);
    }
    enforceBFS(paramRow);
    optimize(paramRow, false);
    computeValues();
  }
  
  public void removeRow(ArrayRow paramArrayRow)
  {
    if (isSimpleDefinition)
    {
      SolverVariable localSolverVariable1 = variable;
      if (localSolverVariable1 != null)
      {
        int i = definitionId;
        if (i != -1)
        {
          int j;
          for (;;)
          {
            j = mNumRows;
            if (i >= j - 1) {
              break;
            }
            ArrayRow[] arrayOfArrayRow = mRows;
            j = i + 1;
            localSolverVariable1 = arrayOfArrayRow[j];
            SolverVariable localSolverVariable2 = variable;
            if (definitionId == j) {
              definitionId = i;
            }
            arrayOfArrayRow[i] = localSolverVariable1;
            i = j;
          }
          mNumRows = (j - 1);
        }
        localSolverVariable1 = variable;
        if (!isFinalValue) {
          localSolverVariable1.setFinalValue(this, constantValue);
        }
        if (OPTIMIZED_ENGINE) {
          mCache.optimizedArrayRowPool.release(paramArrayRow);
        } else {
          mCache.arrayRowPool.release(paramArrayRow);
        }
      }
    }
  }
  
  public void reset()
  {
    Cache localCache;
    for (int i = 0;; i++)
    {
      localCache = mCache;
      localObject = mIndexedVariables;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((SolverVariable)localObject).reset();
      }
    }
    solverVariablePool.releaseAll(mPoolVariables, mPoolVariablesCount);
    mPoolVariablesCount = 0;
    Arrays.fill(mCache.mIndexedVariables, null);
    Object localObject = mVariables;
    if (localObject != null) {
      ((HashMap)localObject).clear();
    }
    mVariablesID = 0;
    mGoal.clear();
    mNumColumns = 1;
    for (i = 0; i < mNumRows; i++)
    {
      localObject = mRows[i];
      if (localObject != null) {
        used = false;
      }
    }
    releaseRows();
    mNumRows = 0;
    if (OPTIMIZED_ENGINE) {
      mTempGoal = new ValuesRow(mCache);
    } else {
      mTempGoal = new ArrayRow(mCache);
    }
  }
  
  public static abstract interface Row
  {
    public abstract void addError(SolverVariable paramSolverVariable);
    
    public abstract void clear();
    
    public abstract SolverVariable getKey();
    
    public abstract SolverVariable getPivotCandidate(LinearSystem paramLinearSystem, boolean[] paramArrayOfBoolean);
    
    public abstract void initFromRow(Row paramRow);
    
    public abstract boolean isEmpty();
    
    public abstract void updateFromFinalVariable(LinearSystem paramLinearSystem, SolverVariable paramSolverVariable, boolean paramBoolean);
    
    public abstract void updateFromRow(LinearSystem paramLinearSystem, ArrayRow paramArrayRow, boolean paramBoolean);
    
    public abstract void updateFromSystem(LinearSystem paramLinearSystem);
  }
  
  public class ValuesRow
    extends ArrayRow
  {
    public ValuesRow(Cache paramCache)
    {
      variables = new SolverVariableValues(this, paramCache);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.LinearSystem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */