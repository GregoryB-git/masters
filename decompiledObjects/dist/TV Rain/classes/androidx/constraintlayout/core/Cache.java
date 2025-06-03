package androidx.constraintlayout.core;

public class Cache
{
  public Pools.Pool<ArrayRow> arrayRowPool = new Pools.SimplePool(256);
  public SolverVariable[] mIndexedVariables = new SolverVariable[32];
  public Pools.Pool<ArrayRow> optimizedArrayRowPool = new Pools.SimplePool(256);
  public Pools.Pool<SolverVariable> solverVariablePool = new Pools.SimplePool(256);
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.Cache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */