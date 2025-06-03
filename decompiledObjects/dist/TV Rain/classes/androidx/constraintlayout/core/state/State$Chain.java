package androidx.constraintlayout.core.state;

public enum State$Chain
{
  static
  {
    Chain localChain1 = new Chain("SPREAD", 0);
    SPREAD = localChain1;
    Chain localChain2 = new Chain("SPREAD_INSIDE", 1);
    SPREAD_INSIDE = localChain2;
    Chain localChain3 = new Chain("PACKED", 2);
    PACKED = localChain3;
    $VALUES = new Chain[] { localChain1, localChain2, localChain3 };
  }
  
  private State$Chain() {}
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.State.Chain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */